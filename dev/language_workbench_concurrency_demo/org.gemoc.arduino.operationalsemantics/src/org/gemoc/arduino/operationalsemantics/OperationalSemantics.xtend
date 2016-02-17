package org.gemoc.arduino.operationalsemantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.obeo.dsl.arduino.ArduinoUtils
import fr.obeo.dsl.arduino.BinaryBooleanExpression
import fr.obeo.dsl.arduino.BinaryIntegerExpression
import fr.obeo.dsl.arduino.Board
import fr.obeo.dsl.arduino.BooleanConstant
import fr.obeo.dsl.arduino.BooleanExpression
import fr.obeo.dsl.arduino.BooleanModuleGet
import fr.obeo.dsl.arduino.BooleanVariable
import fr.obeo.dsl.arduino.Channel
import fr.obeo.dsl.arduino.Constant
import fr.obeo.dsl.arduino.Control
import fr.obeo.dsl.arduino.Delay
import fr.obeo.dsl.arduino.Expression
import fr.obeo.dsl.arduino.If
import fr.obeo.dsl.arduino.Instruction
import fr.obeo.dsl.arduino.InstructionBlock
import fr.obeo.dsl.arduino.IntegerConstant
import fr.obeo.dsl.arduino.IntegerExpression
import fr.obeo.dsl.arduino.IntegerModuleGet
import fr.obeo.dsl.arduino.IntegerVariable
import fr.obeo.dsl.arduino.ModuleAssignment
import fr.obeo.dsl.arduino.ModuleInstruction
import fr.obeo.dsl.arduino.Pin
import fr.obeo.dsl.arduino.Project
import fr.obeo.dsl.arduino.Repeat
import fr.obeo.dsl.arduino.SynchronizationBlock
import fr.obeo.dsl.arduino.Thread
import fr.obeo.dsl.arduino.Utilities
import fr.obeo.dsl.arduino.VariableAssignment
import fr.obeo.dsl.arduino.VariableDeclaration
import fr.obeo.dsl.arduino.VariableRef
import fr.obeo.dsl.arduino.While
import java.util.List

import static org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect.*

@Aspect(className=Instruction)
class Instruction_ExecutableAspect {
	
	def void execute() {
	}
	
	def void finalize() {
	}
}

@Aspect(className=InstructionBlock)
class InstructionBlock_ExecutableAspect {
	
	def void execute() {
		for(instruction : _self.instructions){
			instruction.execute	
		}
	}
	
}

@Aspect(className=Project)
class Project_ExecutableAspect {
	def void execute() {
		val sketch = _self.sketch
		//while(true) {
		//	for(t : sketch.threads){
		//		t.execute;
		//	}
			//sketch.block.execute
		//}
	}
	
	@Main
	def void main() {
		val start = System.nanoTime
		_self.execute
		val stop = System.nanoTime
		println("time to execute " + (stop - start))
	}
	
	@Step
	def void setup() {
		_self.eAllContents().forEach[o|{
			if (o instanceof IntegerVariable) {
				o.value = o.initialValue
			} else if (o instanceof BooleanVariable) {
				o.value = o.initialValue
			} else if (o instanceof Pin) {
				(o as Pin).level = Integer.valueOf(0)
			}
		}];
	}
	
	@InitializeModel
	def public void initializeModel(List<String> args){
		_self.setup
	}
}

@Aspect(className=VariableAssignment)
class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
	@Step
	@OverrideAspectMethod
	def void execute() {
		val variable = _self.variable
		val value = _self.operand.evaluate
		if (variable instanceof IntegerVariable){
			variable.value = value as Integer
		}
		if (variable instanceof BooleanVariable){
			variable.value = value as Boolean
		}	
	}
}


@Aspect(className=Thread)
class Thread_ExecutableAspect {
	
	def void execute() {
		System.out.println("Thread " + _self.name + " execute");
		//while(true) {
		/*if(_self.currentInstruction instanceof InstructionBlock){
			var instB = _self.block as InstructionBlock
			Instruction_ExecutableAspect.execute(inst);
		}else{
			_self.currentInstruction.execute;
		}*/
		//}
		/*for(block : _self.blocks){
			if(_self.currentInstruction instanceof InstructionBlock){
				var instB = _self.block as InstructionBlock
				Instruction_ExecutableAspect.execute(inst);
			}else{
				_self.currentInstruction.execute;
			}
		}*/
	}
	
	def void fire() {
		System.out.println("Thread " + _self.name +" fire");
	}
	
}


@Aspect(className=Board)
class Board_ExecutableAspect {
	def void execute() {
		System.out.println("Board " + _self.name + " execute");
	}
	
	def void idle() {
		System.out.println("Board " + _self.name + " idle");
	}
}



@Aspect(className=ModuleInstruction)
class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {	
	@OverrideAspectMethod
	def void execute() {
		_self.super_execute
	}
}

@Aspect(className=ModuleAssignment)
class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@Step
	@OverrideAspectMethod
	def void execute() {
		_self.super_execute
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module)
		if (_self.operand instanceof IntegerExpression){
			pin.level = _self.operand.evaluate as Integer
		}
		if (_self.operand instanceof BooleanExpression){
			if (_self.operand.evaluate as Boolean){
				pin.level = HIGH
			}else{
				pin.level = LOW
			}
		}
	}
}

@Aspect(className=VariableDeclaration)
class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
	@Step
	@OverrideAspectMethod
	def void execute() {
		switch (_self.variable){
			case IntegerVariable : (_self.variable as IntegerVariable).value = (_self.variable as IntegerVariable).initialValue	
			case BooleanVariable : (_self.variable as BooleanVariable).value = (_self.variable as BooleanVariable).initialValue
		}
	}
}

@Aspect(className=Control)
class Control_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=Control)
class Control_EvaluableAspect extends Instruction_ExecutableAspect {
	def Boolean evaluate() {
	}
}

@Aspect(className=If)
class If_EvaluableAspect extends Control_EvaluableAspect {
	@Step
	@OverrideAspectMethod
	def void execute() {
		if (_self.evaluate) {
			_self.block.execute
		} else {
			if (_self.elseBlock != null) {
				_self.elseBlock.execute
			}
		}
	}
}

@Aspect(className=If)
class If_ExecutableAspect extends Control_ExecutableAspect {
	@Step
	@OverrideAspectMethod
	def void execute() {
		if (_self.evaluate) {
			_self.block.execute
		}
	}
}

@Aspect(className=Repeat)
class Repeat_EvaluableAspect extends Control_EvaluableAspect {
	var Integer i = 0;

	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = false
		resCond = (_self.i  < _self.iteration)
		_self.i = _self.i+1
		return resCond;
	}

	@OverrideAspectMethod
	def void finalize() {
		_self.i = 0
		return;
	}
}

@Aspect(className=Repeat)
class Repeat_ExecutableAspect extends Control_ExecutableAspect  {
	@OverrideAspectMethod
	def void execute() {
		while (_self.evaluate) {
			_self.block.execute
		}
		_self.finalize
	}
}

@Aspect(className=While)
class While_EvaluableAspect extends Control_EvaluableAspect {
	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = _self.condition.evaluate as Boolean
		return resCond
	}
}

@Aspect(className=While)
class While_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
		while (_self.evaluate) {
			_self.block.execute
		}
	}
}

@Aspect(className=Utilities)
class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=Delay)
class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
	@Step
	@OverrideAspectMethod
	def void execute() {
		try {
			java.lang.Thread.sleep(_self.value)
		} catch (InterruptedException e) {
			e.printStackTrace()
		}
	}
}

@Aspect(className=BinaryIntegerExpression)
class BinaryIntegerExpression_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var Integer res
		var bLeft = false;
		var iLeft = 0;
		switch (_self.left){
			BooleanExpression: bLeft = _self.left.evaluate as Boolean
			IntegerExpression: iLeft = _self.left.evaluate as Integer
		}
		var bRight = false;
		var iRight = 0;
		switch (_self.right){
			BooleanExpression: bRight = _self.right.evaluate as Boolean
			IntegerExpression: iRight = _self.right.evaluate as Integer
		}
		switch (_self.operator) {
			case DIV: {
				res = iLeft /
					iRight		
			}
			case MAX: {
				res = Math.max(iLeft, iRight)
			}
			case MIN: {
				res = Math.min(iLeft, iRight)
			}
			case MINUS: {
				res = iLeft - iRight
			}
			case MUL: {
				res = iLeft * iRight
			}
			case PLUS: {
				res = iLeft + iRight
			}
			case POURCENT: {
				res = iLeft % iRight
			}
			default: {
				throw new IllegalStateException("Operator "
					+ _self.operator + " not simulated yet.")
			}
		}
		return res
	}
}

@Aspect(className=BooleanModuleGet) 
class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		// dirty tricks to make the model more usable
//		if (_self.module.name.contains("button")){
//			var boolean res = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
//			println(res);
//			return res;
//		}
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module)
		if (pin.level == 0){
			return false
		}
		return true
	}
}

@Aspect(className=BooleanConstant) 
class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.value
	}
}

@Aspect(className=IntegerConstant) 
class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.value
	}
}	

@Aspect(className=IntegerModuleGet) 
class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module)
		return pin.level	
	}
}

@Aspect(className=BinaryBooleanExpression)
class BinaryBooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var Boolean res
		var bLeft = false;
		var iLeft = 0;
		switch (_self.left){
			BooleanExpression: bLeft = _self.left.evaluate as Boolean
			IntegerExpression: iLeft = _self.left.evaluate as Integer
		}
		var bRight = false;
		var iRight = 0;
		switch (_self.right){
			BooleanExpression: bRight = _self.right.evaluate as Boolean
			IntegerExpression: iRight = _self.right.evaluate as Integer
		}
		switch (_self.operator) {
			case AND: {
				if (bLeft) {
					res = bRight
				} else {
					res = Boolean.FALSE
				}
			}
			case OR: {
				if(bLeft) {
					res = Boolean.TRUE
				}
				else {
					res = bRight
				}
			}
			case DIFFERENT: {
				res = !(bLeft.equals(bRight))
			}
			case EQUAL: {
				res = (bLeft.equals(bRight))
			}
			case INF: {
				res = iLeft < iRight
			}
			case INF_OR_EQUAL: {
				res = iLeft <= iRight
			}
			case SUP: {
				res = iLeft > iRight
			}
			case SUP_OR_EQUAL: {
				res = iLeft >= iRight
			}
			default: {
				throw new IllegalStateException("Operator "
					+ _self.operator + " not simulated yet.")
			}
		}
		return res
	}
}

@Aspect(className=Constant)
class Constant_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		switch _self{
			BooleanConstant: return (_self as BooleanConstant).value
			IntegerConstant: return (_self as IntegerConstant).value
			default: throw new ClassCastException("type not expected: "+_self.eClass.name)
		}
	}
}

@Aspect(className=Pin)
class Pin_EvaluableAspect {
	public static final Integer LOW = 0
	public static final Integer HIGH = 1023
}

@Aspect(className=IntegerVariable)
class IntegerVariable_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=BooleanVariable)
class BooleanVariable_EvaluableAspect extends Expression_EvaluableAspect  {	
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=VariableRef)
class VariableDeclaration_EvaluableAspect extends Expression_EvaluableAspect{
	def Object evaluate(){
		return _self.variable.evaluate
	}
}

@Aspect(className=Expression)
abstract class Expression_EvaluableAspect {
	def abstract Object evaluate()
}

@Aspect(className=Channel)
class Channel_ExecutableAspect {

	def void read() {
		System.out.println("Channel " + _self.name + " read");
		
	}
	
	def void write() {
		System.out.println("Channel " + _self.name + " write");
		
	}
}

@Aspect(className=SynchronizationBlock)
class SynchronizationBlock_ExecutableAspect{

	
	def void execute() {
		//_self.ownedBlock.thread.fire
	}
}

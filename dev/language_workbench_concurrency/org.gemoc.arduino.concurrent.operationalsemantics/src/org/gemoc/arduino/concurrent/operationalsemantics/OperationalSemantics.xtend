package org.gemoc.arduino.concurrent.operationalsemantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import org.gemoc.arduino.concurrent.execarduino.ArduinoUtils
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryBooleanExpression
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryExpression
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryIntegerExpression
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanConstant
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanExpression
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanModuleGet
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariable
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariableRef
import org.gemoc.arduino.concurrent.execarduino.arduino.Constant
import org.gemoc.arduino.concurrent.execarduino.arduino.Control
import org.gemoc.arduino.concurrent.execarduino.arduino.Delay
import org.gemoc.arduino.concurrent.execarduino.arduino.Expression
import org.gemoc.arduino.concurrent.execarduino.arduino.If
import org.gemoc.arduino.concurrent.execarduino.arduino.Instruction
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerConstant
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerExpression
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerModuleGet
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariable
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariableRef
import org.gemoc.arduino.concurrent.execarduino.arduino.Module
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleAssignment
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleGet
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleInstruction
import org.gemoc.arduino.concurrent.execarduino.arduino.Pin
import org.gemoc.arduino.concurrent.execarduino.arduino.Project
import org.gemoc.arduino.concurrent.execarduino.arduino.Repeat
import org.gemoc.arduino.concurrent.execarduino.arduino.Utilities
import org.gemoc.arduino.concurrent.execarduino.arduino.Variable
import org.gemoc.arduino.concurrent.execarduino.arduino.VariableAssignment
import org.gemoc.arduino.concurrent.execarduino.arduino.VariableDeclaration
import org.gemoc.arduino.concurrent.execarduino.arduino.VariableRef
import org.gemoc.arduino.concurrent.execarduino.arduino.While

import static extension org.gemoc.arduino.concurrent.operationalsemantics.Pin_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.IntegerVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.BooleanVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.Expression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.BinaryBooleanExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.BinaryIntegerExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.BooleanExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.IntegerExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.BinaryExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.VariableRef_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.IntegerConstant_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.BooleanConstant_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.IntegerModuleGet_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.operationalsemantics.ModuleAssignment_ExecutableAspect.*

@Aspect(className=Instruction)
class Instruction_ExecutableAspect {
	def void execute() {
	}
	
	def void finalize() {
	}
}

//CONCURRENT comment
//       not used in the concurrent version, moved to the MoCC
@Aspect(className=Project)
class Project_ExecutableAspect {
//	def void execute() {
//		val sketches = _self.sketches
//		while(true) {
//			sketches.forEach[s|s.block.execute]
//		}
//	}
	
//CONCURRENT comment
//       not used in the concurrent version, moved to the MoCC
//	@Main
//	def void main() {
//		val start = System.nanoTime
//		_self.execute
//		val stop = System.nanoTime
//		println("time to execute " + (stop - start))
//	}
	
//	@Step
	def void setup() {
		_self.eAllContents().forEach[o|{
			if (o instanceof IntegerVariable) {
				o.value = o.initialValue
			} else if (o instanceof BooleanVariable) {
				o.value = o.initialValue
			} else if (o instanceof Pin) {
				(o as Pin).level = 0;
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
//	@Step
	@OverrideAspectMethod
	def void execute() {
		val variable = _self.variable
		var Object value
		switch (_self.operand){
			BinaryIntegerExpression: value  = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.operand) as Integer
			IntegerVariableRef: value  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Integer
			IntegerConstant: value  = IntegerConstant_ExecutableAspect.evaluate(_self.operand) as Integer
			BinaryBooleanExpression: value  = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanVariableRef: value  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanConstant: value  = BooleanConstant_ExecutableAspect.evaluate(_self.operand) as Boolean
		}
		if (variable instanceof IntegerVariable){
			variable.value = value as Integer
		}
		if (variable instanceof BooleanVariable){
			variable.value = value as Boolean
		}
	}
}

//CONCURRENT comment
//       not used in the concurrent version, moved to the MoCC
//@Aspect(className=Block)
//class Block_ExecutableAspect {
//	def void execute() {
//		_self.instructions.forEach[i|i.execute]
//	}
//}

@Aspect(className=ModuleInstruction)
class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {	
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=ModuleAssignment)
class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
//	@Step
	@OverrideAspectMethod
	def void execute() {
		val pin = ArduinoUtils.getPin(_self.module)
		var Object value = null
		switch (_self.operand){
			BinaryIntegerExpression: pin.level  = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.operand) as Integer
			IntegerVariableRef: pin.level  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Integer
			IntegerConstant: pin.level  = IntegerConstant_ExecutableAspect.evaluate(_self.operand) as Integer
			BinaryBooleanExpression: value  = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanVariableRef: value  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanConstant: value  = BooleanConstant_ExecutableAspect.evaluate(_self.operand) as Boolean
		}
		if (value == null){
			return
		}
		if (value as Boolean){
			pin.level = HIGH
		}else{
			pin.level = LOW
		}
	}
}

@Aspect(className=VariableDeclaration)
class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
		println(_self.variable.eClass.name)
		if (_self.variable instanceof IntegerVariable){
			(_self.variable as IntegerVariable).value = (_self.variable as IntegerVariable).initialValue
			}else{	
				(_self.variable as BooleanVariable).value = (_self.variable as BooleanVariable).initialValue
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
	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = false
		if (_self.condition instanceof BinaryBooleanExpression){
			resCond = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.condition) as Boolean
		}

		if (_self.condition instanceof ModuleGet){
			var Module m = (_self.condition as ModuleGet).module
			resCond = ArduinoUtils.getPin(m).level != 0
		}
		return resCond
	}
}

//CONCURRENT comment
//       not used in the concurrent version, moved to the MoCC
//@Aspect(className=If)
//class If_ExecutableAspect extends Control_ExecutableAspect {
//	@Step
//	@OverrideAspectMethod
//	def void execute() {
//		if (_self.evaluate) {
//			_self.block.execute
//		} else {
//			if (_self.elseBlock != null) {
//				_self.elseBlock.execute
//			}
//		}
//	}
//}

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


//CONCURRENT comment
//       not used in the concurrent version
//@Aspect(className=Repeat)
//class Repeat_ExecutableAspect extends Control_ExecutableAspect  {
//	@Step
//	@OverrideAspectMethod
//	def void execute() {
//		while (_self.evaluate) {
//			_self.block.execute
//		}
//		_self.finalize
//	}
//}

@Aspect(className=While)
class While_EvaluableAspect extends Control_EvaluableAspect {
	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = false
		switch (_self.condition){
			BinaryBooleanExpression: resCond  = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.condition) as Boolean
			BooleanVariableRef: resCond  = VariableRef_EvaluableAspect.evaluate(_self.condition) as Boolean
			BooleanConstant: resCond  = BooleanConstant_ExecutableAspect.evaluate(_self.condition) as Boolean
		}
		return resCond
	}
}


//CONCURRENT comment
//       not used in the concurrent version
//@Aspect(className=While)
//class While_ExecutableAspect extends Control_ExecutableAspect {
//	@OverrideAspectMethod
//	def void execute() {
//		while (_self.evaluate) {
//			_self.block.execute
//		}
//	}
//}

@Aspect(className=Utilities)
class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=Delay)
class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
//	@Step
	@OverrideAspectMethod
	def void execute() {
		try {
			Thread.sleep(_self.value)
		} catch (InterruptedException e) {
			e.printStackTrace()
		}
	}
}

@Aspect(className=BinaryIntegerExpression, with = #[BinaryExpression_EvaluableAspect])
class BinaryIntegerExpression_EvaluableAspect extends /*IntegerExpression_EvaluableAspect */  BinaryExpression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var Integer res
		var bLeft = false;
		var iLeft = 0;
		switch (_self.left){
			BinaryBooleanExpression: bLeft = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.left) as Boolean
			BinaryIntegerExpression: iLeft = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.left) as Integer
			IntegerVariableRef: iLeft = VariableRef_EvaluableAspect.evaluate(_self.left) as Integer
			BooleanVariableRef: bLeft = VariableRef_EvaluableAspect.evaluate(_self.left) as Boolean
			IntegerConstant: iLeft = IntegerConstant_ExecutableAspect.evaluate(_self.left) as Integer
			BooleanConstant: bLeft = BooleanConstant_ExecutableAspect.evaluate(_self.left) as Boolean
		}
		var bRight = false;
		var iRight = 0;
		switch (_self.right){
			BinaryBooleanExpression: bRight = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.right) as Boolean
			BinaryIntegerExpression: iRight = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.right) as Integer
			IntegerVariableRef: iRight = VariableRef_EvaluableAspect.evaluate(_self.right) as Integer
			BooleanVariableRef: bRight = VariableRef_EvaluableAspect.evaluate(_self.right) as Boolean
			IntegerConstant: iRight = IntegerConstant_ExecutableAspect.evaluate(_self.right) as Integer
			BooleanConstant: bRight = BooleanConstant_ExecutableAspect.evaluate(_self.right) as Boolean
		}
		switch (_self.operator) {
			case DIV: {
				res = iLeft / iRight		
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
		val pin = ArduinoUtils.getPin(_self.module)
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
		val pin = ArduinoUtils.getPin(_self.module)
		return pin.level	
	}
}

@Aspect(className=BinaryBooleanExpression, with = #[BooleanExpression_EvaluableAspect])
class BinaryBooleanExpression_EvaluableAspect extends BooleanExpression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var leftIsBoolean = false
		var rightIsBoolean = false
		var Boolean res
		var bLeft = false;
		var iLeft = 0;
		switch (_self.left){
			BinaryBooleanExpression:{ bLeft = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.left) as Boolean
								leftIsBoolean = true
			}
			BinaryIntegerExpression: iLeft = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.left) as Integer
			IntegerVariableRef: iLeft = VariableRef_EvaluableAspect.evaluate(_self.left) as Integer
			BooleanVariableRef: {bLeft = VariableRef_EvaluableAspect.evaluate(_self.left) as Boolean 
								leftIsBoolean = true
			}
			IntegerConstant: iLeft = IntegerConstant_ExecutableAspect.evaluate(_self.right) as Integer
			BooleanConstant: {bLeft = BooleanConstant_ExecutableAspect.evaluate(_self.right) as Boolean								
				leftIsBoolean = true
			}
//			BooleanExpression:  {
//				bLeft = _self.left.evaluate as Boolean
//				leftIsBoolean = true
//			}
//			IntegerExpression: iLeft = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.left) as Integer
		}
		var bRight = false;
		var iRight = 0;
		switch (_self.right){
			BinaryBooleanExpression:{ bRight= BinaryBooleanExpression_EvaluableAspect.evaluate(_self.right) as Boolean
								rightIsBoolean = true
			}
			BinaryIntegerExpression: iRight = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.right) as Integer
			IntegerVariableRef: iRight = VariableRef_EvaluableAspect.evaluate(_self.right) as Integer
			BooleanVariableRef: {bRight = VariableRef_EvaluableAspect.evaluate(_self.right) as Boolean 
								rightIsBoolean = true
			}
			IntegerConstant: iRight = IntegerConstant_ExecutableAspect.evaluate(_self.right) as Integer
			BooleanConstant: {bRight = BooleanConstant_ExecutableAspect.evaluate(_self.right) as Boolean
				rightIsBoolean = true
			}
		}
		if (leftIsBoolean != rightIsBoolean) {
			throw new IllegalArgumentException("left operand type does not match right operand type.")
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
				if (leftIsBoolean) {
					res = (bLeft.equals(bRight))
				} else {
					res = (iLeft.equals(iRight))
				}				
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
	public Integer level = LOW
	
	public static final Integer LOW = 0
	public static final Integer HIGH = 1023
}

@Aspect(className=Variable)
abstract class Variable_EvaluableAspect {
	def abstract Object evaluate()
}

@Aspect(className=IntegerVariable)
class IntegerVariable_EvaluableAspect extends Variable_EvaluableAspect {
	public Integer value
	
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=BooleanVariable)
class BooleanVariable_EvaluableAspect extends Variable_EvaluableAspect  {	
	public Boolean value
	
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=VariableRef)
class VariableRef_EvaluableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate(){
		switch _self{
			BooleanVariableRef: return BooleanVariable_EvaluableAspect.evaluate((_self as BooleanVariableRef).variable)
			IntegerVariableRef: return IntegerVariable_EvaluableAspect.evaluate((_self as IntegerVariableRef).variable)
			default: throw new ClassCastException("type not expected: "+_self.eClass.name)
		}
	}
}

@Aspect(className=Expression)
abstract class Expression_EvaluableAspect {
	abstract def Object evaluate()
}

@Aspect(className=BooleanExpression)
abstract class BooleanExpression_EvaluableAspect extends Expression_EvaluableAspect{
//	@OverrideAspectMethod
//	def Object evaluate(){
//	}
}

@Aspect(className=IntegerExpression)
abstract class IntegerExpression_EvaluableAspect extends Expression_EvaluableAspect{
//	@OverrideAspectMethod
//	def Object evaluate(){
//	}
}

@Aspect(className=BinaryExpression)
abstract class BinaryExpression_EvaluableAspect extends Expression_EvaluableAspect{
//	@OverrideAspectMethod
//	def Object evaluate(){
//	}
} 

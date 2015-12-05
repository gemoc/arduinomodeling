package org.gemoc.arduino.operationalsemantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.obeo.dsl.arduino.ArduinoUtils
import fr.obeo.dsl.arduino.Connector
import fr.obeo.dsl.arduino.Constant
import fr.obeo.dsl.arduino.Control
import fr.obeo.dsl.arduino.Delay
import fr.obeo.dsl.arduino.Expression
import fr.obeo.dsl.arduino.If
import fr.obeo.dsl.arduino.Instruction
import fr.obeo.dsl.arduino.BinaryExpression 
import fr.obeo.dsl.arduino.ModuleGet
import fr.obeo.dsl.arduino.ModuleInstruction
import fr.obeo.dsl.arduino.ModuleAssignment
import fr.obeo.dsl.arduino.Pin
import fr.obeo.dsl.arduino.Project
import fr.obeo.dsl.arduino.Repeat
import fr.obeo.dsl.arduino.VariableAssignment
import fr.obeo.dsl.arduino.Sketch
import fr.obeo.dsl.arduino.Utilities
import fr.obeo.dsl.arduino.Variable
import fr.obeo.dsl.arduino.While

import static extension org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Project_SetupAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspect.*

//import javax.swing.text.StyledEditorKit.BoldAction
import fr.obeo.dsl.arduino.BooleanConstant
import fr.obeo.dsl.arduino.IntegerConstant
import fr.obeo.dsl.arduino.BooleanExpression
import fr.obeo.dsl.arduino.Module
import fr.obeo.dsl.arduino.Sensor
import fr.obeo.dsl.arduino.BinaryIntegerExpression
import fr.obeo.dsl.arduino.IntegerExpression
import fr.obeo.dsl.arduino.BinaryBooleanExpression
import fr.obeo.dsl.arduino.IntegerVariable
import fr.obeo.dsl.arduino.BooleanVariable
import fr.obeo.dsl.arduino.VariableDeclaration
import fr.obeo.dsl.arduino.BooleanModuleGet
import fr.obeo.dsl.arduino.IntegerModuleGet
import fr.obeo.dsl.arduino.VariableRef

@Aspect(className=Instruction)
class Instruction_ExecutableAspect {
	def void execute() {
	} 
	
	def void finalize() {
	} 
	
}

@Aspect(className=Project)
class Project_ExecutableAspect {
	def void execute() {
		_self.setup()
		val sketch = _self.sketch
		while(true) {
			sketch.execute()
		}
	}
}

@Aspect(className=Project)
class Project_SetupAspect {
	def void setup() {
		_self.eAllContents().forEach[o|{
			if (o instanceof IntegerVariable) {
				o.value = o.initialValue
			} else if (o instanceof BooleanVariable) {
				o.value = o.initialValue
			} else if (o instanceof Pin) {
				(o as Pin).level = Integer.valueOf(0)
			} else if (o instanceof Connector) {
				(o as Connector).getPin().level = Integer.valueOf(0)
			}
		}];
	}
}

@Aspect(className=VariableAssignment)
class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
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

@Aspect(className=Sketch)
class Sketch_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
		val Instruction first = _self.next
		var current = first
		while(current != null) {
			if(!(current instanceof Sketch)) {
				current.execute()
			}
			current = current.next
		}
	}
}

@Aspect(className=ModuleInstruction)
class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {	
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=ModuleAssignment)
class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
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
class Control_EvaluableAspect extends Instruction_ExecutableAspect{
	def Boolean evaluate() {
	}
}

@Aspect(className=If)
class If_EvaluableAspect extends Control_EvaluableAspect {
	@OverrideAspectMethod
	//@Step
	def Boolean evaluate() {
		var Boolean resCond  =false
		if (_self.condition instanceof BooleanExpression){
			resCond = _self.condition.evaluate as Boolean
		}
		if (_self.condition instanceof ModuleGet){
			var Module m = (_self.condition as ModuleGet).module
			if (m instanceof Sensor){
				resCond = m.level
			}
		}
		return resCond
	}
} 

@Aspect(className=Repeat)
class Repeat_EvaluableAspect extends Control_EvaluableAspect  {
	var Integer i = 0;

	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond  =false
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

@Aspect(className=While)
class While_EvaluableAspect extends Control_EvaluableAspect {
	
	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = _self.condition.evaluate as Boolean
		return resCond
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
	@OverrideAspectMethod
	def void execute() {
		try {
			Thread.sleep(_self.value)
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

	public Integer level;
}

@Aspect(className=IntegerVariable)
class IntegerVariable_EvaluableAspect extends Expression_EvaluableAspect {
	public Integer value
	
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=BooleanVariable)
class BooleanVariable_EvaluableAspect extends Expression_EvaluableAspect  {
	public Boolean value
	
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

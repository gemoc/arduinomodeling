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
import fr.obeo.dsl.arduino.FunctionCall
import fr.obeo.dsl.arduino.If
import fr.obeo.dsl.arduino.Instruction
import fr.obeo.dsl.arduino.Level
import fr.obeo.dsl.arduino.MathOperator
import fr.obeo.dsl.arduino.ModuleInstruction
import fr.obeo.dsl.arduino.Parameter
import fr.obeo.dsl.arduino.ParameterCall
import fr.obeo.dsl.arduino.Pin
import fr.obeo.dsl.arduino.Project
import fr.obeo.dsl.arduino.Repeat
import fr.obeo.dsl.arduino.Sensor
import fr.obeo.dsl.arduino.Set
import fr.obeo.dsl.arduino.Sketch
import fr.obeo.dsl.arduino.Status
import fr.obeo.dsl.arduino.Utilities
import fr.obeo.dsl.arduino.Variable
import fr.obeo.dsl.arduino.While

import static extension org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Parameter_CallableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Project_SetupAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Value_ExecutableAspect.*
import fr.obeo.dsl.arduino.NumberValue
import fr.obeo.dsl.arduino.ArduinoFactory
import fr.obeo.dsl.arduino.BooleanValue
import fr.obeo.dsl.arduino.StringValue
import fr.obeo.dsl.arduino.Value

@Aspect(className=Instruction)
class Instruction_ExecutableAspect {
	def void execute() {
	}
}

@Aspect(className=Parameter)
class Parameter_CallableAspect {
	def void call() {
	}
}

@Aspect(className=Sketch)
class Sketch_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
		val Instruction first = _self.next
		var current = first
		while (current != null) {
			if (!(current instanceof Sketch)) {
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

@Aspect(className=ModuleInstruction)
class ModuleInstruction_CallableAspect extends Parameter_CallableAspect {
	@OverrideAspectMethod
	def void call() {
	}
}

@Aspect(className=Status)
class Status_CallableAspect extends ModuleInstruction_CallableAspect {
	@OverrideAspectMethod
	@Step
	def void call() {
		_self.execute
	}
}

@Aspect(className=Status)
class Status_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val Pin pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self), _self.module)
		pin.level = _self.getStatusValue().value
	}

	private def NumberValue getStatusValue() {
		var res = ValueHelper::get(0)
		if (_self.sensor == null) {
			if (!_self.status) {
				res = Pin_EvaluableAspect.HIGH
			} else {
				res = Pin_EvaluableAspect.LOW
			}
		} else {
			val value = _self.sensor.evaluateAsNumber
			if (!_self.status) {
				if (value.value == Pin_EvaluableAspect.LOW.value) {
					res = Pin_EvaluableAspect.HIGH
				} else {
					res = Pin_EvaluableAspect.LOW
				}
			} else {
				res = value
			}
		}
		return res
	}
}

@Aspect(className=Level)
class Level_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self), _self.module)
		pin.level = _self.level.evaluateAsNumber.value
	}
}

@Aspect(className=Sensor)
class Sensor_EvaluableAspect extends MathOperator_EvaluableAspect {
	@OverrideAspectMethod
	def Value evaluate() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self), _self.module)
		return ValueHelper::get(pin.level)
	}
}

@Aspect(className=Control)
class Control_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=If)
class If_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		if (_self.condition.evaluateAsBoolean.value) {
			var Instruction current = _self.instructions.get(0)
			while (current != null) {
				if(current != _self) {
					current.execute()
				}
				current = current.next
			}
		}
	}
}

@Aspect(className=Repeat)
class Repeat_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val Instruction first = _self.instructions.get(0)
		for (var i = 0; i < _self.iteration; i++) {
			var Instruction current = first
			while (current != null) {
				current.execute()
				current = current.next
			}
		}
	}
}

@Aspect(className=While)
class While_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val Instruction first = _self.instructions.get(0)
		var Boolean condition = _self.condition.evaluateAsBoolean.value
		while (condition) {
			var Instruction current = first
			while (current != null) {
				current.execute()
				current = current.next
			}
			condition = _self.condition.evaluateAsBoolean.value
		}
	}
}

@Aspect(className=Utilities)
class Utilities_CallableAspect extends Parameter_CallableAspect {
	@OverrideAspectMethod
	@Step
	def void call() {
		_self.execute()
	}
}

@Aspect(className=Utilities)
class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
	}
}

@Aspect(className=Delay)
class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		try {
			Thread.sleep(_self.value)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}
	}
}

@Aspect(className=MathOperator)
class MathOperator_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Value evaluate() {
		var Value res
		switch (_self.operator) {
			case AND: {
				if (_self.left.evaluateAsBoolean.value) {
					res = _self.right.evaluateAsBoolean
				} else {
					res = ValueHelper::get(false)
				}
			}
			case OR: {
				if (_self.left.evaluateAsBoolean.value) {
					res = ValueHelper::get(true)
				} else {
					res = _self.right.evaluateAsBoolean
				}
			}
			case DIFF: {
				res = ValueHelper::get(!_self.left.evaluate().vequals(_self.right.evaluate()))
			}
			case EQUAL: {
				res = ValueHelper::get(!_self.left.evaluate().vequals(_self.right.evaluate()))
			}
			case NOT: {
				res = ValueHelper::get(!_self.right.evaluateAsBoolean.value)
			}
			case DIV: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value / _self.right.evaluateAsNumber.value)
			}
			case LOWER: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value < _self.right.evaluateAsNumber.value)
			}
			case LOWER_OR_EQUAL: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value <= _self.right.evaluateAsNumber.value)
			}
			case MAX: {
				res = ValueHelper::get(Math.max(_self.left.evaluateAsNumber.value, _self.right.evaluateAsNumber.value))
			}
			case MIN: {
				res = ValueHelper::get(Math.min(_self.left.evaluateAsNumber.value, _self.right.evaluateAsNumber.value))
			}
			case MINUS: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value - _self.right.evaluateAsNumber.value)
			}
			case MUL: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value * _self.right.evaluateAsNumber.value)
			}
			case PLUS: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value + _self.right.evaluateAsNumber.value)
			}
			case POURCENT: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value % _self.right.evaluateAsNumber.value)
			}
			case UPPER: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value > _self.right.evaluateAsNumber.value)
			}
			case UPPER_OR_EQUAL: {
				res = ValueHelper::get(_self.left.evaluateAsNumber.value >= _self.right.evaluateAsNumber.value)
			}
			default: {
				throw new IllegalStateException("Operator " + _self.operator + " not simulated yet.")
			}
		}
		return res
	}
}

@Aspect(className=Set)
class Set_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val variable = _self.variable
		val value = _self.value.evaluate
		variable.value = value
	}
}

@Aspect(className=Constant)
class Constant_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Value evaluate() {
		return ValueHelper::get(_self.value)
	}
}

@Aspect(className=FunctionCall)
class FunctionCall_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		var current = _self.definition.instructions.get(0)
		while (current != null) {
			if (current instanceof ParameterCall) {
				val paramDef = (current as ParameterCall).definition
				val param = _self.parameters.findFirst[p|p.definition == paramDef]
				if (param != null) {
					param.call
				}
			} else {
				current.execute
			}
			current = current.next
		}
	}
}

@Aspect(className=Pin)
class Pin_EvaluableAspect {
	public static final NumberValue LOW = ValueHelper::get(0)
	public static final NumberValue HIGH = ValueHelper::get(1023)
	
}

@Aspect(className=Variable)
class Variable_EvaluableAspect extends Expression_EvaluableAspect {

	public Value value

	@OverrideAspectMethod
	def Value evaluate() {
		return _self.value
	}

}

@Aspect(className=Expression)
abstract class Expression_EvaluableAspect {

	def abstract Value evaluate()

	def NumberValue evaluateAsNumber() {
		var NumberValue res
		var value = _self.evaluate
		if (value instanceof StringValue) {
			res = Pin_EvaluableAspect.LOW
		} else if (value instanceof NumberValue) {
			res = value as NumberValue
		} else if (value instanceof BooleanValue) {
			if ((value.value)) {
				res = Pin_EvaluableAspect.HIGH
			} else {
				res = Pin_EvaluableAspect.LOW
			}
		} else {
			res = Pin_EvaluableAspect.LOW
		}
		return res;
	}

	def BooleanValue evaluateAsBoolean() {
		var BooleanValue res
		var Value value = _self.evaluate
		if (value instanceof StringValue) {
			res = ValueHelper::get(false)
		} else if (value instanceof BooleanValue) {
			res = value as BooleanValue
		} else if (value instanceof NumberValue) {
			res = ValueHelper::get(!(value as NumberValue).value.equals(Pin_EvaluableAspect.LOW.value))
		} else {
			res = ValueHelper::get(false)
		}
		return res
	}
}

@Aspect(className=Project)
class Project_ExecutableAspect {
	def void execute() {
		_self.setup()
		val sketch = _self.sketch
		while (true) {
			sketch.execute()
		}
	}
}

@Aspect(className=Project)
class Project_SetupAspect {
	@Step
	def void setup() {
		_self.eAllContents().forEach [ o |
			{
				if (o instanceof Variable) {
					(o as Variable).value = ValueHelper::get(0)
				} else if (o instanceof Pin) {
					(o as Pin).level = 0
				} else if (o instanceof Connector) {
					(o as Connector).getPin().level = 0
				}
			}
		];
	}
}

class ValueHelper {

	public static def NumberValue get(int n) {
		val v = ArduinoFactory.eINSTANCE.createNumberValue
		v.value = n
		return v
	}

	public static def BooleanValue get(boolean n) {
		val v = ArduinoFactory.eINSTANCE.createBooleanValue
		v.value = n
		return v
	}

	public static def StringValue get(String n) {
		val v = ArduinoFactory.eINSTANCE.createStringValue
		v.value = n
		return v
	}
}

@Aspect(className=Value)
abstract class Value_ExecutableAspect {
	public abstract def boolean vequals(Value v)
}

@Aspect(className=NumberValue)
class NumberValue_ExecutableAspect extends Value_ExecutableAspect {
	@OverrideAspectMethod
	def boolean vequals(Value v) {
		return if (v instanceof NumberValue)
			_self.value.equals(v.value)
		else
			false
	}
}

@Aspect(className=BooleanValue)
class BooleanValue_ExecutableAspect extends Value_ExecutableAspect {
	@OverrideAspectMethod
	def boolean vequals(Value v) {
		return if (v instanceof BooleanValue)
			_self.value.equals(v.value)
		else
			false
	}
}

@Aspect(className=StringValue)
class StringValue_ExecutableAspect extends Value_ExecutableAspect {
	@OverrideAspectMethod
	def boolean vequals(Value v) {
		return if (v instanceof StringValue)
			_self.value.equals(v.value)
		else
			false
	}
}
//abstract class Value {
//}
//class NumberValue_aspect extends Value {
//	public val int value
//
//	new(int n) {
//		value = n
//	}
//
//	override equals(Object obj) {
//		return if (obj instanceof NumberValue)
//			this.value.equals(obj.value)
//		else
//			false
//	}
//
//}
//
//class BooleanValue extends Value {
//	public val boolean value
//
//	public static val TRUE = new BooleanValue(true)
//	public static val FALSE = new BooleanValue(false)
//
//	private new(boolean n) {
//		value = n
//	}
//
//	public static def BooleanValue get(boolean b) {
//		return if(b) TRUE else FALSE
//	}
//
//	override equals(Object obj) {
//		return if (obj instanceof BooleanValue)
//			this.value.equals(obj.value)
//		else
//			false
//	}
//}
//
//class StringValue extends Value {
//	public val String value
//
//	new(String n) {
//		value = n
//	}
//
//	override equals(Object obj) {
//		return if (obj instanceof StringValue)
//			this.value.equals(obj.value)
//		else
//			false
//	}
//}

package org.gemoc.arduino.operationalsemantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.obeo.dsl.arduino.ArduinoUtils
import fr.obeo.dsl.arduino.Connector
import fr.obeo.dsl.arduino.Constant
import fr.obeo.dsl.arduino.Control
import fr.obeo.dsl.arduino.Delay
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
import fr.obeo.dsl.arduino.Value
import fr.obeo.dsl.arduino.Variable
import fr.obeo.dsl.arduino.While

import static extension org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Parameter_CallableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Project_SetupAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect.*
import static extension org.gemoc.arduino.operationalsemantics.Value_EvaluableAspect.*
import org.gemoc.arduino.operationalsemantics.debug.ArduinoGemocDebugger

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
		val Instruction first = _self.next;
		var current = first;
		while(current != null) {
			if(!(current instanceof Sketch)) {
				current.execute();
			}
			current = current.next;
		}
	}
}

@Aspect(className=ModuleInstruction)
class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {
//	protected Pin pin;
//	def void setPin(Pin pin){pin(_self,pin);}
	
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
		_self.execute;
	}
}
@Aspect(className=Status)
class Status_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module);
		pin.level = _self.getStatusValue();
	}

	private def Integer getStatusValue() {
		var res = 0;
		if (_self.sensor == null) {
			if (!_self.status) {
				res = Main.HIGH;
			} else {
				res = Main.LOW;
			}
		} else {
			val value = _self.sensor.evaluateAsNumber;
			if (!_self.status) {
				if(value.intValue == Main.LOW.intValue) {
					res = Main.HIGH;
				} else {
					res = Main.LOW;
				}
			} else {
				res = value.intValue;
			}
		}
		return res;
	}
}

@Aspect(className=Level)
class Level_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module);
		pin.level = _self.level.evaluateAsNumber.intValue;
	}
}

@Aspect(className=Sensor)
class Sensor_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module);
		setValue(_self,pin.level);
	}
}
@Aspect(className=Sensor)
class Sensor_EvaluableValueAspect extends MathOperator_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		val pin = ArduinoUtils.getPin(ArduinoUtils.getContainingProject(_self),_self.module);
		setValue(_self,pin.level);
		return _self.evaluateAsBoolean;
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
		if(_self.condition.evaluateAsBoolean) {
			var Instruction current = _self.instructions.get(0);
			while(current != null) {
				current.execute();
				current = current.next;				
			}
		}
	}
}

@Aspect(className=Repeat)
class Repeat_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val Instruction first = _self.instructions.get(0);
		for(var i = 0; i < _self.iteration; i++) {
			var Instruction current = first;
			while(current != null) {
				current.execute();
				current = current.next;				
			}
		}
	}
}

@Aspect(className=While)
class While_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val Instruction first = _self.instructions.get(0);
		var Boolean condition = _self.condition.evaluateAsBoolean;
		while (condition) {
			var Instruction current = first;
			while(current != null) {
				current.execute();
				current = current.next;
			}
			condition = _self.condition.evaluateAsBoolean;
		}
	}
}

@Aspect(className=Utilities)
class Utilities_CallableAspect extends Parameter_CallableAspect {
	@OverrideAspectMethod
	@Step
	def void call() {
		_self.execute();
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
			Thread.sleep(_self.value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

@Aspect(className=MathOperator)
class MathOperator_EvaluableAspect extends Value_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var Object res;
		switch (_self.operator) {
			case AND: {
				if (_self.left.evaluateAsBoolean) {
					res = Boolean.valueOf(_self.right.evaluateAsBoolean);
				} else {
					res = Boolean.FALSE;
				}
			}
			case OR: {
				if(_self.left.evaluateAsBoolean) {
					res = Boolean.TRUE;
				}
				else {
					res = _self.right.evaluateAsBoolean;
				}
			}
			case DIFF: {
				res = Boolean.valueOf(!_self.left.evaluate().equals(_self.right.evaluate()));
			}
			case EQUAL: {
				res = Boolean.valueOf(!_self.left.evaluate().equals(_self.right.evaluate()));
			}
			case NOT: {
				res = Boolean.valueOf(!_self.right.evaluateAsBoolean);
			}
			case DIV: {
				res = Double.valueOf(_self.left.evaluateAsNumber.doubleValue /
					_self.right.evaluateAsNumber.doubleValue);				
			}
			case LOWER: {
				res = Boolean.valueOf(_self.left.evaluateAsNumber.doubleValue <
					_self.right.evaluateAsNumber.doubleValue);
			}
			case LOWER_OR_EQUAL: {
				res = Boolean.valueOf(_self.left.evaluateAsNumber.doubleValue <=
					_self.right.evaluateAsNumber.doubleValue);
			}
			case MAX: {
				res = Double.valueOf(Math.max(_self.left.evaluateAsNumber.doubleValue,
					_self.right.evaluateAsNumber.doubleValue));
			}
			case MIN: {
				res = Double.valueOf(Math.min(_self.left.evaluateAsNumber.doubleValue,
					_self.right.evaluateAsNumber.doubleValue));
			}
			case MINUS: {
				res = Double.valueOf(_self.left.evaluateAsNumber.doubleValue -
					_self.right.evaluateAsNumber.doubleValue);
			}
			case MUL: {
				res = Double.valueOf(_self.left.evaluateAsNumber.doubleValue *
					_self.right.evaluateAsNumber.doubleValue);
			}
			case PLUS: {
				res = Double.valueOf(_self.left.evaluateAsNumber.doubleValue +
					_self.right.evaluateAsNumber.doubleValue);
			}
			case POURCENT: {
				res = Double.valueOf(_self.left.evaluateAsNumber.doubleValue %
					_self.right.evaluateAsNumber.doubleValue);
			}
			case UPPER: {
				res = Boolean.valueOf(_self.left.evaluateAsNumber.doubleValue >
					_self.right.evaluateAsNumber.doubleValue);
			}
			case UPPER_OR_EQUAL: {
				res = Boolean.valueOf(_self.left.evaluateAsNumber.doubleValue >=
					_self.right.evaluateAsNumber.doubleValue);
			}
			default: {
				throw new IllegalStateException("Operator "
					+ _self.operator + " not simulated yet.");
			}
		}
		return res;
	}
}

@Aspect(className=Set)
class Set_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		val variable = _self.variable;
		val value = _self.value.evaluate;
		variable.value = value;
		ArduinoGemocDebugger.getCurrent.variableChanged(variable,value);
	}
}

@Aspect(className=Constant)
class Constant_EvaluableAspect extends Value_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.evaluateAsNumber;
	}
}

@Aspect(className=FunctionCall)
class FunctionCall_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	@Step
	def void execute() {
		var current = _self.definition.instructions.get(0);
		while(current != null) {
			if(current instanceof ParameterCall) {
				val paramDef = (current as ParameterCall).definition;
				val param = _self.parameters.findFirst[p|p.definition == paramDef];
				if(param != null) {
					param.call;
				}
			} else {
				current.execute;
			}
			current = current.next;
		}
	}
}

@Aspect(className=Pin)
class Pin_EvaluableAspect {
	
	private Integer level;
	
	def void setLevel(Integer level) {
		ArduinoGemocDebugger.getCurrent().pinChanged(_self,level);
		level(_self,level);
	}
	
	def Integer getLevel() {
		return level(_self);
	}
}

@Aspect(className=Value)
class Value_EvaluableAspect {
	
	private Object value;
	
	def void setValue(Object value) {
		value(_self,value);
	}
	
	def Object evaluate() {
		return value(_self);
	}
	
	def Number evaluateAsNumber() {
		var Number res;
		var value = _self.evaluate;
		if (value instanceof String) {
			res = Main.LOW;
		} else if (value instanceof Number) {
			res = value as Number;
		} else if (value instanceof Boolean) {
			if (Boolean.TRUE.equals(value)) {
				res = Main.HIGH;
			} else {
				res = Main.LOW;
			}
		} else {
			res = Main.LOW;
		}
		return res;
	}
	
	def Boolean evaluateAsBoolean() {
		var Boolean res;
//		var value = _self.evaluate;
		var value = value(_self);
		if (value instanceof String) {
			res = Boolean.FALSE;
		} else if (value instanceof Boolean) {
			res = value as Boolean;
		} else if (value instanceof Number) {
			res = (value as Number).intValue() != Main.LOW;		
		} else {
			res = Boolean.FALSE;
		}
		return res;
	}
}

@Aspect(className=Project)
class Project_ExecutableAspect {
	def void execute() {
		_self.setup();
		val sketch = _self.sketch;
		while(true) {
			sketch.execute();
		}
	}
}

@Aspect(className=Project)
class Project_SetupAspect {
	def void setup() {
		_self.eAllContents().forEach[o|{
			if (o instanceof Variable) {
				(o as Variable).value = Integer.valueOf(0);
			} else if (o instanceof Pin) {
				(o as Pin).level = Integer.valueOf(0);
			} else if (o instanceof Connector) {
				(o as Connector).getPin().level = Integer.valueOf(0);
			}
		}];
	}
}
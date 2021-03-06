package org.gemoc.arduino.concurrent.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import org.gemoc.arduino.concurrent.arduino.BinaryBooleanExpression
import org.gemoc.arduino.concurrent.arduino.BinaryExpression
import org.gemoc.arduino.concurrent.arduino.BinaryIntegerExpression
import org.gemoc.arduino.concurrent.arduino.BooleanConstant
import org.gemoc.arduino.concurrent.arduino.BooleanExpression
import org.gemoc.arduino.concurrent.arduino.BooleanModuleGet
import org.gemoc.arduino.concurrent.arduino.BooleanVariable
import org.gemoc.arduino.concurrent.arduino.BooleanVariableRef
import org.gemoc.arduino.concurrent.arduino.Constant
import org.gemoc.arduino.concurrent.arduino.Control
import org.gemoc.arduino.concurrent.arduino.Delay
import org.gemoc.arduino.concurrent.arduino.Expression
import org.gemoc.arduino.concurrent.arduino.If
import org.gemoc.arduino.concurrent.arduino.Instruction
import org.gemoc.arduino.concurrent.arduino.IntegerConstant
import org.gemoc.arduino.concurrent.arduino.IntegerExpression
import org.gemoc.arduino.concurrent.arduino.IntegerModuleGet
import org.gemoc.arduino.concurrent.arduino.IntegerVariable
import org.gemoc.arduino.concurrent.arduino.IntegerVariableRef
import org.gemoc.arduino.concurrent.arduino.Module
import org.gemoc.arduino.concurrent.arduino.ModuleAssignment
import org.gemoc.arduino.concurrent.arduino.ModuleGet
import org.gemoc.arduino.concurrent.arduino.ModuleInstruction
import org.gemoc.arduino.concurrent.arduino.Pin
import org.gemoc.arduino.concurrent.arduino.Project
import org.gemoc.arduino.concurrent.arduino.Repeat
import org.gemoc.arduino.concurrent.arduino.Utilities
import org.gemoc.arduino.concurrent.arduino.Variable
import org.gemoc.arduino.concurrent.arduino.VariableAssignment
import org.gemoc.arduino.concurrent.arduino.VariableDeclaration
import org.gemoc.arduino.concurrent.arduino.VariableRef
import org.gemoc.arduino.concurrent.arduino.While
import org.gemoc.arduino.concurrent.arduino.ArduinoCommunicationModule
import org.gemoc.arduino.concurrent.arduino.BluetoothTransceiver

import static extension org.gemoc.arduino.concurrent.k3dsa.Pin_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.IntegerVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BooleanVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.Expression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BinaryBooleanExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BinaryIntegerExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BooleanExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.IntegerExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BinaryExpression_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.VariableRef_EvaluableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.IntegerConstant_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BooleanConstant_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.IntegerModuleGet_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.ModuleAssignment_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.ArduinoCommunicationModule_PushAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.BluetoothTransceiver_PushAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.PushButton_ToggleAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.Project_ExecutableAspect.*
import static extension org.gemoc.arduino.concurrent.k3dsa.Module_UtilitiesAspect.*
import org.gemoc.arduino.concurrent.arduino.PushButton
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import org.eclipse.emf.common.util.EList
import org.gemoc.arduino.concurrent.arduino.ArduinoBoard

@Aspect(className=Module)
class Module_UtilitiesAspect {
	
	
	private def Project getProject() {
		var Project project = null

		var current = _self.eContainer()
		while (current !== null) {
			if (current instanceof Project) {
				project = current as Project
				return project
			}
			current = current.eContainer()
		}
		
		return project
	}
	
	def protected Pin getPin() {
		var Pin pin = null
		
		val project = _self.getProject()

		for (board : project.boards) {
			if (board !== null && board instanceof ArduinoBoard) {
				var ArduinoBoard arduinoBoard = board as ArduinoBoard
				for (analogPin : arduinoBoard.analogPins) {
					if (analogPin.module == _self) {
						return analogPin
					}
				}
				for (digitalPin : arduinoBoard.digitalPins) {
					if (digitalPin.module == _self) {
						return digitalPin
					}
				}
			}
		}
		
		return pin
	}
}

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
//	@Override
//	def void setup() {
//		_self.eAllContents().forEach[o|{
//			if (o instanceof IntegerVariable) {
//				o.value = o.initialValue
//			} else if (o instanceof BooleanVariable) {
//				o.value = o.initialValue
//			} else if (o instanceof Pin) {
//				(o as Pin).level = 0;
//			}
//			else if (o instanceof PushButton) {
//				(o as PushButton).isPushed = false;
//			}
//		}];
//	}
	
	@InitializeModel
	def public void initializeModel(EList<String> args){
		_self.eAllContents().forEach[o|{
			if (o instanceof IntegerVariable) {
				o.value = o.initialValue
			} else if (o instanceof BooleanVariable) {
				o.value = o.initialValue
			} else if (o instanceof Pin) {
				(o as Pin).level = 0;
			}
			else if (o instanceof PushButton) {
				(o as PushButton).isPushed = false;
			}
		}];
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
			IntegerModuleGet: value  = IntegerModuleGet_ExecutableAspect.evaluate(_self.operand) as Integer
			BinaryBooleanExpression: value  = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanVariableRef: value  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanConstant: value  = BooleanConstant_ExecutableAspect.evaluate(_self.operand) as Boolean
			BooleanModuleGet: value  = BooleanModuleGet_ExecutableAspect.evaluate(_self.operand) as Boolean
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
		val pin = _self.module.getPin()
		var Object value = null
		switch (_self.operand){
			BinaryIntegerExpression: value  = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.operand) as Integer
			IntegerVariableRef: value  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Integer
			IntegerConstant: value  = IntegerConstant_ExecutableAspect.evaluate(_self.operand) as Integer
			IntegerModuleGet: value  = IntegerModuleGet_ExecutableAspect.evaluate(_self.operand) as Integer
			BinaryBooleanExpression: value  = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanVariableRef: value  = VariableRef_EvaluableAspect.evaluate(_self.operand) as Boolean
			BooleanConstant: value  = BooleanConstant_ExecutableAspect.evaluate(_self.operand) as Boolean
			BooleanModuleGet: value  = BooleanModuleGet_ExecutableAspect.evaluate(_self.operand) as Boolean
		}
		
		if(value instanceof Integer){
			pin.level = value
		}
		if (value instanceof Boolean){
			if (value as Boolean){
				pin.level = HIGH
			}else{
				pin.level = LOW
			}
		}
		
		//warning. Here it is dirty but I think we should 'transmit' the value in the module itself as the wire should do in true life
		if (_self.module instanceof BluetoothTransceiver){
			(_self.module as BluetoothTransceiver).dataToSend.add(value as Integer)
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
			resCond = m.getPin().level != 0
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
	public var Integer i = 0;

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
			BooleanModuleGet: resCond  = BooleanModuleGet_ExecutableAspect.evaluate(_self.condition) as Boolean
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
			IntegerModuleGet: iLeft  = IntegerModuleGet_ExecutableAspect.evaluate(_self.left) as Integer
			BooleanVariableRef: bLeft = VariableRef_EvaluableAspect.evaluate(_self.left) as Boolean
			IntegerConstant: iLeft = IntegerConstant_ExecutableAspect.evaluate(_self.left) as Integer
			BooleanConstant: bLeft = BooleanConstant_ExecutableAspect.evaluate(_self.left) as Boolean
			BooleanModuleGet: bLeft  = BooleanModuleGet_ExecutableAspect.evaluate(_self.left) as Boolean
		}
		var bRight = false;
		var iRight = 0;
		switch (_self.right){
			BinaryBooleanExpression: bRight = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.right) as Boolean
			BinaryIntegerExpression: iRight = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.right) as Integer
			IntegerVariableRef: iRight = VariableRef_EvaluableAspect.evaluate(_self.right) as Integer
			IntegerModuleGet: iRight  = IntegerModuleGet_ExecutableAspect.evaluate(_self.right) as Integer
			BooleanVariableRef: bRight = VariableRef_EvaluableAspect.evaluate(_self.right) as Boolean
			IntegerConstant: iRight = IntegerConstant_ExecutableAspect.evaluate(_self.right) as Integer
			BooleanConstant: bRight = BooleanConstant_ExecutableAspect.evaluate(_self.right) as Boolean
			BooleanModuleGet: bRight  = BooleanModuleGet_ExecutableAspect.evaluate(_self.right) as Boolean
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
		val pin = _self.module.getPin()
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
		//warning. Here it is dirty but I think we should 'transmit' the value in the module itself as the wire should do in true life
		if (_self.module instanceof BluetoothTransceiver){
			val temp = (_self.module as BluetoothTransceiver).dataReceived.head()
			(_self.module as BluetoothTransceiver).dataReceived.remove(temp)
			return temp
		}
		
		val pin = _self.module.getPin()
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
			IntegerConstant: iLeft = IntegerConstant_ExecutableAspect.evaluate(_self.left) as Integer
			BooleanConstant: {bLeft = BooleanConstant_ExecutableAspect.evaluate(_self.left) as Boolean								
				leftIsBoolean = true
			}
			IntegerModuleGet: iLeft  = IntegerModuleGet_ExecutableAspect.evaluate(_self.left) as Integer
			BooleanModuleGet: {bLeft  = BooleanModuleGet_ExecutableAspect.evaluate(_self.left) as Boolean
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
			IntegerModuleGet: iRight  = IntegerModuleGet_ExecutableAspect.evaluate(_self.right) as Integer
			BooleanModuleGet: {bRight  = BooleanModuleGet_ExecutableAspect.evaluate(_self.right) as Boolean
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




@Aspect(className=ArduinoCommunicationModule)
abstract class ArduinoCommunicationModule_PushAspect {
	
	abstract def void push()
} 

@Aspect(className=BluetoothTransceiver)
abstract class BluetoothTransceiver_PushAspect extends ArduinoCommunicationModule_PushAspect {
	public EList<Integer> dataToSend
	public EList<Integer> dataReceived
	
	@OverrideAspectMethod
	def void push(){
		val temp = _self.dataToSend.head;
		_self.dataToSend.remove(temp)
		_self.connectedTransceiver.forEach[dataReceived.add(temp)]
	}
} 

@Aspect(className=PushButton)
abstract class PushButton_ToggleAspect {
	public boolean isPushed
	
	
	def void toggle(){
		println('xtend toggle() call !!!')
		_self.isPushed = !_self.isPushed
		val pin = _self.getPin()
		if(_self.isPushed){
			pin.level = HIGH
		}else{
			pin.level = LOW
		}
	}
} 

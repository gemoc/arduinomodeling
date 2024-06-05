package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.Expression;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleAssignment _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}

  private static void super_execute(final ModuleAssignment _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    final Pin pin = Module_UtilitiesAspect.getPin(_self.getModule());
    Object value = null;
    Expression _operand = _self.getOperand();
    boolean _matched = false;
    if (_operand instanceof BinaryIntegerExpression) {
      _matched=true;
      Object _evaluate = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.getOperand());
      value = ((Integer) _evaluate);
    }
    if (!_matched) {
      if (_operand instanceof IntegerVariableRef) {
        _matched=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getOperand());
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof IntegerConstant) {
        _matched=true;
        Object _evaluate = IntegerConstant_ExecutableAspect.evaluate(_self.getOperand());
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof IntegerModuleGet) {
        _matched=true;
        Object _evaluate = IntegerModuleGet_ExecutableAspect.evaluate(_self.getOperand());
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BinaryBooleanExpression) {
        _matched=true;
        Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.getOperand());
        value = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BooleanVariableRef) {
        _matched=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getOperand());
        value = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BooleanConstant) {
        _matched=true;
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_self.getOperand());
        value = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BooleanModuleGet) {
        _matched=true;
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_self.getOperand());
        value = ((Boolean) _evaluate);
      }
    }
    if ((value instanceof Integer)) {
      Pin_EvaluableAspect.level(pin, ((Integer)value));
    }
    if ((value instanceof Boolean)) {
      if ((((Boolean) value)).booleanValue()) {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.HIGH);
      } else {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.LOW);
      }
    }
    org.gemoc.arduino.concurrent.xarduino.arduino.Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      org.gemoc.arduino.concurrent.xarduino.arduino.Module _module_1 = _self.getModule();
      BluetoothTransceiver_PushAspect.dataToSend(((BluetoothTransceiver) _module_1)).add(((Integer) value));
    }
  }
}

package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
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
import org.gemoc.arduino.concurrent.xarduino.arduino.Module;
import org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableRef_EvaluableAspect;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleAssignment _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment){
    					org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction){
    					org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect.execute((org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Instruction){
    					org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final ModuleAssignment _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    Module _module = _self.getModule();
    final Pin pin = Module_UtilitiesAspect.getPin(_module);
    Object value = null;
    Expression _operand = _self.getOperand();
    boolean _matched = false;
    if (!_matched) {
      if (_operand instanceof BinaryIntegerExpression) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = BinaryIntegerExpression_EvaluableAspect.evaluate(_operand_1);
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof IntegerVariableRef) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_operand_1);
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof IntegerConstant) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = IntegerConstant_ExecutableAspect.evaluate(_operand_1);
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof IntegerModuleGet) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = IntegerModuleGet_ExecutableAspect.evaluate(_operand_1);
        value = ((Integer) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BinaryBooleanExpression) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_operand_1);
        value = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BooleanVariableRef) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_operand_1);
        value = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BooleanConstant) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_operand_1);
        value = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_operand instanceof BooleanModuleGet) {
        _matched=true;
        Expression _operand_1 = _self.getOperand();
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_operand_1);
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
    Module _module_1 = _self.getModule();
    if ((_module_1 instanceof BluetoothTransceiver)) {
      Module _module_2 = _self.getModule();
      EList<Integer> _dataToSend = BluetoothTransceiver_PushAspect.dataToSend(((BluetoothTransceiver) _module_2));
      _dataToSend.add(((Integer) value));
    }
  }
}

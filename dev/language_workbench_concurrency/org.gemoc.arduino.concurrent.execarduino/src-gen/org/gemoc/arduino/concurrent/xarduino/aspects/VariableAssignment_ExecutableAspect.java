package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.Expression;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.Variable;
import org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableRef_EvaluableAspect;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment){
    					org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Instruction){
    					org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableAssignment _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
    final Variable variable = _self.getVariable();
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
    if ((variable instanceof IntegerVariable)) {
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}

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

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
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
    if ((variable instanceof IntegerVariable)) {
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}

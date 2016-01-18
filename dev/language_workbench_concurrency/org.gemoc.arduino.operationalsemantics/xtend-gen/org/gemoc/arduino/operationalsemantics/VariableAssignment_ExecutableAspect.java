package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.BooleanVariable;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.IntegerVariable;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.VariableAssignment;
import org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
    org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.VariableAssignment){
     org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.VariableAssignment)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableAssignment _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
    final Variable variable = _self.getVariable();
    Expression _operand = _self.getOperand();
    final Object value = Expression_EvaluableAspect.evaluate(_operand);
    if ((variable instanceof IntegerVariable)) {
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}

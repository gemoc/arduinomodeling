package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.Variable;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "VariableAssignment", "execute");
	} else {
		command.execute();
	}
	;
	;
}

  private static void super_execute(final VariableAssignment _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
    final Variable variable = _self.getVariable();
    final Object value = Expression_EvaluableAspect.evaluate(_self.getOperand());
    if ((variable instanceof IntegerVariable)) {
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}

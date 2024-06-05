package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.xarduino.arduino.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class Repeat_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Repeat _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Repeat_ExecutableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Repeat_ExecutableAspectRepeatAspectContext
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
		manager.executeStep(_self, command, "Repeat", "execute");
	} else {
		command.execute();
	}
	;
	;
}

  private static void super_execute(final Repeat _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final Repeat_ExecutableAspectRepeatAspectProperties _self_, final Repeat _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    }
    Instruction_ExecutableAspect.finalize(_self);
  }
}

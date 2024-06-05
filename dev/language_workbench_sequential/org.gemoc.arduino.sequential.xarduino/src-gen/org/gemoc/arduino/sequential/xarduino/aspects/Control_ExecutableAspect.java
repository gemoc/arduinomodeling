package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspectControlAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.While) {
		org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.If) {
		org.gemoc.arduino.sequential.xarduino.aspects.If_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat) {
		org.gemoc.arduino.sequential.xarduino.aspects.Repeat_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Repeat) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Control) {
		org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect._privk3_execute(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Control) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}

  private static void super_execute(final Control _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}

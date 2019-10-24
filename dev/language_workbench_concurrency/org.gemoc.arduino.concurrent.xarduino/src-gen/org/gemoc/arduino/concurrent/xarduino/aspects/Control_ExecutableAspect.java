package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.Control;
import org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspectControlAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspectControlAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final Control _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}

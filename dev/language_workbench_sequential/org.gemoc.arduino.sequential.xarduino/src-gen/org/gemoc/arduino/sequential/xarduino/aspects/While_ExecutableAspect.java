package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.Block_ExecutableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspectWhileAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_ExecutableAspect extends Control_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final While _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspectWhileAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspectWhileAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final While _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final While_ExecutableAspectWhileAspectProperties _self_, final While _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    }
  }
}

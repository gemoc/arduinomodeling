package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.arduino.concurrent.xarduino.arduino.Delay;

@Aspect(className = Delay.class)
@SuppressWarnings("all")
public class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Delay _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Delay_ExecutableAspectDelayAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Delay_ExecutableAspectDelayAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}

  private static void super_execute(final Delay _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final Delay_ExecutableAspectDelayAspectProperties _self_, final Delay _self) {
    try {
      Thread.sleep(_self.getValue());
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}

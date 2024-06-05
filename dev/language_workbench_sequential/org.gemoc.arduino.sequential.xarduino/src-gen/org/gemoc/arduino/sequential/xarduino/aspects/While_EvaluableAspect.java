package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final While _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.While_EvaluableAspectWhileAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.While_EvaluableAspectWhileAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Boolean) result;
}

  private static Boolean super_evaluate(final While _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Boolean _privk3_evaluate(final While_EvaluableAspectWhileAspectProperties _self_, final While _self) {
    Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getCondition());
    Boolean resCond = ((Boolean) _evaluate);
    return resCond;
  }
}

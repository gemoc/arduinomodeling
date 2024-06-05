package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.If;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final If _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.If_EvaluableAspectIfAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.If_EvaluableAspectIfAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Boolean) result;
}

  private static Boolean super_evaluate(final If _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Boolean _privk3_evaluate(final If_EvaluableAspectIfAspectProperties _self_, final If _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    if ((_condition instanceof BooleanExpression)) {
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getCondition());
      resCond = ((Boolean) _evaluate);
    }
    return resCond;
  }
}

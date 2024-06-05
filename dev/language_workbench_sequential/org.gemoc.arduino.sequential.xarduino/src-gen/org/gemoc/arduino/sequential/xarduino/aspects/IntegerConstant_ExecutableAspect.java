package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant;

@Aspect(className = IntegerConstant.class)
@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerConstant _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}

  private static Object super_evaluate(final IntegerConstant _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_, final IntegerConstant _self) {
    return Integer.valueOf(_self.getValue());
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.BooleanConstant;
import org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;

@Aspect(className = BooleanConstant.class)
@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanConstant _self) {
    org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.BooleanConstant){
    result = org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.BooleanConstant)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BooleanConstant _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_, final BooleanConstant _self) {
    return Boolean.valueOf(_self.isValue());
  }
}

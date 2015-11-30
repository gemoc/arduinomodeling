package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.BooleanConstant;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.IntegerConstant;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspectConstantAspectProperties;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;

@Aspect(className = Constant.class)
@SuppressWarnings("all")
public class Constant_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final Constant _self) {
    org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspectConstantAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspectConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.Constant){
    result = org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.Constant)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final Constant _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final Constant_EvaluableAspectConstantAspectProperties _self_, final Constant _self) {
    boolean _matched = false;
    if (!_matched) {
      if (_self instanceof BooleanConstant) {
        _matched=true;
        return Boolean.valueOf(((BooleanConstant) _self).isValue());
      }
    }
    if (!_matched) {
      if (_self instanceof IntegerConstant) {
        _matched=true;
        return Integer.valueOf(((IntegerConstant) _self).getValue());
      }
    }
    EClass _eClass = _self.eClass();
    String _name = _eClass.getName();
    String _plus = ("type not expected: " + _name);
    throw new ClassCastException(_plus);
  }
}

package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.Constant;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant;

@Aspect(className = Constant.class)
@SuppressWarnings("all")
public class Constant_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final Constant _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Constant_EvaluableAspectConstantAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Constant_EvaluableAspectConstantAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}

  private static Object super_evaluate(final Constant _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final Constant_EvaluableAspectConstantAspectProperties _self_, final Constant _self) {
    boolean _matched = false;
    if (_self instanceof BooleanConstant) {
      _matched=true;
      return Boolean.valueOf(((BooleanConstant) _self).isValue());
    }
    if (!_matched) {
      if (_self instanceof IntegerConstant) {
        _matched=true;
        return Integer.valueOf(((IntegerConstant) _self).getValue());
      }
    }
    String _name = _self.eClass().getName();
    String _plus = ("type not expected: " + _name);
    throw new ClassCastException(_plus);
  }
}

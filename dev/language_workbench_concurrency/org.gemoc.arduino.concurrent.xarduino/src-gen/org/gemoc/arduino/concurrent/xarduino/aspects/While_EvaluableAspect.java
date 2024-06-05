package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final While _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.While_EvaluableAspectWhileAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.While_EvaluableAspectWhileAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Boolean) result;
}

  private static Boolean super_evaluate(final While _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Boolean _privk3_evaluate(final While_EvaluableAspectWhileAspectProperties _self_, final While _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    boolean _matched = false;
    if (_condition instanceof BinaryBooleanExpression) {
      _matched=true;
      Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.getCondition());
      resCond = ((Boolean) _evaluate);
    }
    if (!_matched) {
      if (_condition instanceof BooleanVariableRef) {
        _matched=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getCondition());
        resCond = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_condition instanceof BooleanConstant) {
        _matched=true;
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_self.getCondition());
        resCond = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_condition instanceof BooleanModuleGet) {
        _matched=true;
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_self.getCondition());
        resCond = ((Boolean) _evaluate);
      }
    }
    return resCond;
  }
}

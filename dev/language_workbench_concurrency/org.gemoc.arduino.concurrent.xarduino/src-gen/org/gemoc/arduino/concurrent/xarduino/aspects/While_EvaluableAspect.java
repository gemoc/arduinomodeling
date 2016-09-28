package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.While;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableRef_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.While_EvaluableAspectWhileAspectProperties;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final While _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.While_EvaluableAspectWhileAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.While_EvaluableAspectWhileAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.While){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.While_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Control){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.Control)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Boolean)result;
  }
  
  private static Boolean super_evaluate(final While _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Boolean _privk3_evaluate(final While_EvaluableAspectWhileAspectProperties _self_, final While _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    boolean _matched = false;
    if (!_matched) {
      if (_condition instanceof BinaryBooleanExpression) {
        _matched=true;
        BooleanExpression _condition_1 = _self.getCondition();
        Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_condition_1);
        resCond = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_condition instanceof BooleanVariableRef) {
        _matched=true;
        BooleanExpression _condition_1 = _self.getCondition();
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_condition_1);
        resCond = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_condition instanceof BooleanConstant) {
        _matched=true;
        BooleanExpression _condition_1 = _self.getCondition();
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_condition_1);
        resCond = ((Boolean) _evaluate);
      }
    }
    if (!_matched) {
      if (_condition instanceof BooleanModuleGet) {
        _matched=true;
        BooleanExpression _condition_1 = _self.getCondition();
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_condition_1);
        resCond = ((Boolean) _evaluate);
      }
    }
    return resCond;
  }
}

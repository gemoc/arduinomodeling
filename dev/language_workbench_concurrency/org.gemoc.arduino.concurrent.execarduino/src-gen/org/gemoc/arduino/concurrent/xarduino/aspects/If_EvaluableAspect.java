package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.If;
import org.gemoc.arduino.concurrent.xarduino.arduino.Module;
import org.gemoc.arduino.concurrent.xarduino.arduino.ModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.If_EvaluableAspectIfAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspect;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final If _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.If_EvaluableAspectIfAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.If_EvaluableAspectIfAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.If){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.If_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.If)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Control){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.Control)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Boolean)result;
  }
  
  private static Boolean super_evaluate(final If _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Boolean _privk3_evaluate(final If_EvaluableAspectIfAspectProperties _self_, final If _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    if ((_condition instanceof BinaryBooleanExpression)) {
      BooleanExpression _condition_1 = _self.getCondition();
      Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_condition_1);
      resCond = ((Boolean) _evaluate);
    }
    BooleanExpression _condition_2 = _self.getCondition();
    if ((_condition_2 instanceof ModuleGet)) {
      BooleanExpression _condition_3 = _self.getCondition();
      Module m = ((ModuleGet) _condition_3).getModule();
      Pin _pin = Module_UtilitiesAspect.getPin(m);
      Integer _level = Pin_EvaluableAspect.level(_pin);
      boolean _notEquals = ((_level).intValue() != 0);
      resCond = Boolean.valueOf(_notEquals);
    }
    return resCond;
  }
}

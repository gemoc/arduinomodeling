package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.If;
import org.gemoc.arduino.concurrent.xarduino.arduino.ModuleGet;
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
	final org.gemoc.arduino.concurrent.xarduino.aspects.If_EvaluableAspectIfAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.If_EvaluableAspectIfAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Boolean) result;
}
  
  private static Boolean super_evaluate(final If _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Boolean _privk3_evaluate(final If_EvaluableAspectIfAspectProperties _self_, final If _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    if ((_condition instanceof BinaryBooleanExpression)) {
      Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.getCondition());
      resCond = ((Boolean) _evaluate);
    }
    BooleanExpression _condition_1 = _self.getCondition();
    if ((_condition_1 instanceof ModuleGet)) {
      BooleanExpression _condition_2 = _self.getCondition();
      org.gemoc.arduino.concurrent.xarduino.arduino.Module m = ((ModuleGet) _condition_2).getModule();
      Integer _level = Pin_EvaluableAspect.level(Module_UtilitiesAspect.getPin(m));
      boolean _notEquals = ((_level).intValue() != 0);
      resCond = Boolean.valueOf(_notEquals);
    }
    return resCond;
  }
}

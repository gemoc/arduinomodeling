package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.Pin;

@Aspect(className = BooleanModuleGet.class)
@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanModuleGet _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}

  private static Object super_evaluate(final BooleanModuleGet _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_, final BooleanModuleGet _self) {
    final Pin pin = Instruction_UtilitesAspect.getPin(Expression_EvaluableAspect.getInstruction(_self), _self.getModule());
    Integer _level = Pin_EvaluableAspect.level(pin);
    boolean _equals = ((_level).intValue() == 0);
    if (_equals) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}

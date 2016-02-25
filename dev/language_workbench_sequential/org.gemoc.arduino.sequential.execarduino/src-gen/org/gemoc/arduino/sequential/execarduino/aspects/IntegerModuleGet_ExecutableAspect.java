package org.gemoc.arduino.sequential.execarduino.aspects;

import org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.execarduino.arduino.Module;
import org.gemoc.arduino.sequential.execarduino.arduino.Pin;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet){
    result = org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Expression){
    result = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final IntegerModuleGet _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    Module _module = _self.getModule();
    final Pin pin = ArduinoUtils.getPin(_module);
    return Pin_EvaluableAspect.level(pin);
  }
}

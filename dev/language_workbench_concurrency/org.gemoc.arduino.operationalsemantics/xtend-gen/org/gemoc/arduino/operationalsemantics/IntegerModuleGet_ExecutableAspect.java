package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.ArduinoUtils;
import fr.obeo.dsl.arduino.IntegerModuleGet;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
    org.gemoc.arduino.operationalsemantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.IntegerModuleGet){
    result = org.gemoc.arduino.operationalsemantics.IntegerModuleGet_ExecutableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final IntegerModuleGet _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    Project _containingProject = ArduinoUtils.getContainingProject(_self);
    Module _module = _self.getModule();
    final Pin pin = ArduinoUtils.getPin(_containingProject, _module);
    return Integer.valueOf(pin.getLevel());
  }
}

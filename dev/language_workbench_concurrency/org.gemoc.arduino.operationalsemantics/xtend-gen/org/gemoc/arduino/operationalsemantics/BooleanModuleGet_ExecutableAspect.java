package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.ArduinoUtils;
import fr.obeo.dsl.arduino.BooleanModuleGet;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;

@Aspect(className = BooleanModuleGet.class)
@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanModuleGet _self) {
    org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.BooleanModuleGet){
    result = org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BooleanModuleGet _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_, final BooleanModuleGet _self) {
    Module _module = _self.getModule();
    String _name = _module.getName();
    boolean _contains = _name.contains("button");
    if (_contains) {
      Toolkit _defaultToolkit = Toolkit.getDefaultToolkit();
      boolean res = _defaultToolkit.getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
      InputOutput.<Boolean>println(Boolean.valueOf(res));
      return Boolean.valueOf(res);
    }
    Project _containingProject = ArduinoUtils.getContainingProject(_self);
    Module _module_1 = _self.getModule();
    final Pin pin = ArduinoUtils.getPin(_containingProject, _module_1);
    int _level = pin.getLevel();
    boolean _equals = (_level == 0);
    if (_equals) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}

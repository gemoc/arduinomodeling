package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.Module;
import org.gemoc.arduino.concurrent.xarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Pin_EvaluableAspect;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Expression){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final IntegerModuleGet _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      Module _module_1 = _self.getModule();
      EList<Integer> _dataReceived = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_1));
      final Integer temp = IterableExtensions.<Integer>head(_dataReceived);
      Module _module_2 = _self.getModule();
      EList<Integer> _dataReceived_1 = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_2));
      _dataReceived_1.remove(temp);
      return temp;
    }
    Module _module_3 = _self.getModule();
    final Pin pin = Module_UtilitiesAspect.getPin(_module_3);
    return Pin_EvaluableAspect.level(pin);
  }
}

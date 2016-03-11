package org.gemoc.arduino.sequential.execarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.execarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.execarduino.arduino.Module;
import org.gemoc.arduino.sequential.execarduino.arduino.Pin;
import org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties;
import org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Pin_EvaluableAspect;

@Aspect(className = BooleanModuleGet.class)
@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanModuleGet _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet){
    result = org.gemoc.arduino.sequential.execarduino.aspects.BooleanModuleGet_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Expression){
    result = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BooleanModuleGet _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_, final BooleanModuleGet _self) {
    Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      Module _module_1 = _self.getModule();
      final List<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_1));
      final Integer res = IterableExtensions.<Integer>head(l);
      boolean _notEquals = (!Objects.equal(res, null));
      if (_notEquals) {
        l.remove(0);
        return Boolean.valueOf(((res).intValue() != 0));
      } else {
        return Boolean.valueOf(false);
      }
    }
    Instruction _instruction = Expression_EvaluableAspect.getInstruction(_self);
    Module _module_2 = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_instruction, _module_2);
    Integer _level = Pin_EvaluableAspect.level(pin);
    boolean _equals = ((_level).intValue() == 0);
    if (_equals) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}

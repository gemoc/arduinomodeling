package org.gemoc.arduino.sequential.xarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.arduino.sequential.xarduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.xarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.Module;
import org.gemoc.arduino.sequential.xarduino.arduino.Pin;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final IntegerModuleGet _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      Module _module_1 = _self.getModule();
      final EList<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_1));
      final Integer res = IterableExtensions.<Integer>head(l);
      boolean _notEquals = (!Objects.equal(res, null));
      if (_notEquals) {
        l.remove(0);
        return res;
      } else {
        return Integer.valueOf(0);
      }
    }
    final Pin pin = Instruction_UtilitesAspect.getPin(Expression_EvaluableAspect.getInstruction(_self), _self.getModule());
    return Pin_EvaluableAspect.level(pin);
  }
}

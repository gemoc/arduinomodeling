package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant;

@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspectIntegerConstantAspectContext {
  public static final IntegerConstant_ExecutableAspectIntegerConstantAspectContext INSTANCE = new IntegerConstant_ExecutableAspectIntegerConstantAspectContext();

  public static IntegerConstant_ExecutableAspectIntegerConstantAspectProperties getSelf(final IntegerConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant, org.gemoc.arduino.sequential.xarduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties>();

  public Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.IntegerConstant;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties;

@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspectIntegerConstantAspectContext {
  public final static IntegerConstant_ExecutableAspectIntegerConstantAspectContext INSTANCE = new IntegerConstant_ExecutableAspectIntegerConstantAspectContext();
  
  public static IntegerConstant_ExecutableAspectIntegerConstantAspectProperties getSelf(final IntegerConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.IntegerConstant, org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties>();
  
  public Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> getMap() {
    return map;
  }
}

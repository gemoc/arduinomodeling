package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties;

@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspectBooleanConstantAspectContext {
  public final static BooleanConstant_ExecutableAspectBooleanConstantAspectContext INSTANCE = new BooleanConstant_ExecutableAspectBooleanConstantAspectContext();
  
  public static BooleanConstant_ExecutableAspectBooleanConstantAspectProperties getSelf(final BooleanConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanConstant, BooleanConstant_ExecutableAspectBooleanConstantAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant, org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties>();
  
  public Map<BooleanConstant, BooleanConstant_ExecutableAspectBooleanConstantAspectProperties> getMap() {
    return map;
  }
}

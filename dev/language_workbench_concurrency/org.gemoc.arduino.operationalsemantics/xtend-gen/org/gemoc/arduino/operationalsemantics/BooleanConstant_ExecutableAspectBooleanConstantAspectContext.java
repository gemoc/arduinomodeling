package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.BooleanConstant;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties;

@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspectBooleanConstantAspectContext {
  public final static BooleanConstant_ExecutableAspectBooleanConstantAspectContext INSTANCE = new BooleanConstant_ExecutableAspectBooleanConstantAspectContext();
  
  public static BooleanConstant_ExecutableAspectBooleanConstantAspectProperties getSelf(final BooleanConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanConstant, BooleanConstant_ExecutableAspectBooleanConstantAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.BooleanConstant, org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties>();
  
  public Map<BooleanConstant, BooleanConstant_ExecutableAspectBooleanConstantAspectProperties> getMap() {
    return map;
  }
}

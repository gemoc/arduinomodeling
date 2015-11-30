package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Constant;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspectConstantAspectProperties;

@SuppressWarnings("all")
public class Constant_EvaluableAspectConstantAspectContext {
  public final static Constant_EvaluableAspectConstantAspectContext INSTANCE = new Constant_EvaluableAspectConstantAspectContext();
  
  public static Constant_EvaluableAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constant, Constant_EvaluableAspectConstantAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Constant, org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspectConstantAspectProperties>();
  
  public Map<Constant, Constant_EvaluableAspectConstantAspectProperties> getMap() {
    return map;
  }
}

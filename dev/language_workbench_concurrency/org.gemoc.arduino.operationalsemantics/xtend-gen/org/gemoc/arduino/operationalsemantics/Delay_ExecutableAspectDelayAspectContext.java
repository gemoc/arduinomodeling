package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Delay;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspectDelayAspectProperties;

@SuppressWarnings("all")
public class Delay_ExecutableAspectDelayAspectContext {
  public final static Delay_ExecutableAspectDelayAspectContext INSTANCE = new Delay_ExecutableAspectDelayAspectContext();
  
  public static Delay_ExecutableAspectDelayAspectProperties getSelf(final Delay _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspectDelayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Delay, Delay_ExecutableAspectDelayAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Delay, org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspectDelayAspectProperties>();
  
  public Map<Delay, Delay_ExecutableAspectDelayAspectProperties> getMap() {
    return map;
  }
}

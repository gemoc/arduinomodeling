package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Repeat;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Repeat_ExecutableAspectRepeatAspectProperties;

@SuppressWarnings("all")
public class Repeat_ExecutableAspectRepeatAspectContext {
  public final static Repeat_ExecutableAspectRepeatAspectContext INSTANCE = new Repeat_ExecutableAspectRepeatAspectContext();
  
  public static Repeat_ExecutableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Repeat_ExecutableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_ExecutableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Repeat, org.gemoc.arduino.operationalsemantics.Repeat_ExecutableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_ExecutableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.If;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.If_ExecutableAspectIfAspectProperties;

@SuppressWarnings("all")
public class If_ExecutableAspectIfAspectContext {
  public final static If_ExecutableAspectIfAspectContext INSTANCE = new If_ExecutableAspectIfAspectContext();
  
  public static If_ExecutableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.If_ExecutableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, If_ExecutableAspectIfAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.If, org.gemoc.arduino.operationalsemantics.If_ExecutableAspectIfAspectProperties>();
  
  public Map<If, If_ExecutableAspectIfAspectProperties> getMap() {
    return map;
  }
}

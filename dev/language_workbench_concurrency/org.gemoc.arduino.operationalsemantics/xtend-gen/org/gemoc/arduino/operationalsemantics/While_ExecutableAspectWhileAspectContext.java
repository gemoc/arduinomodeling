package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.While;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.While_ExecutableAspectWhileAspectProperties;

@SuppressWarnings("all")
public class While_ExecutableAspectWhileAspectContext {
  public final static While_ExecutableAspectWhileAspectContext INSTANCE = new While_ExecutableAspectWhileAspectContext();
  
  public static While_ExecutableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.While_ExecutableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, While_ExecutableAspectWhileAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.While, org.gemoc.arduino.operationalsemantics.While_ExecutableAspectWhileAspectProperties>();
  
  public Map<While, While_ExecutableAspectWhileAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@SuppressWarnings("all")
public class While_ExecutableAspectWhileAspectContext {
  public static final While_ExecutableAspectWhileAspectContext INSTANCE = new While_ExecutableAspectWhileAspectContext();

  public static While_ExecutableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<While, While_ExecutableAspectWhileAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.While, org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspectWhileAspectProperties>();

  public Map<While, While_ExecutableAspectWhileAspectProperties> getMap() {
    return map;
  }
}

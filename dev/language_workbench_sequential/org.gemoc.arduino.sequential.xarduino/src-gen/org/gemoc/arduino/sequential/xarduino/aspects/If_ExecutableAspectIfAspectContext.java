package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.If;

@SuppressWarnings("all")
public class If_ExecutableAspectIfAspectContext {
  public static final If_ExecutableAspectIfAspectContext INSTANCE = new If_ExecutableAspectIfAspectContext();

  public static If_ExecutableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.If_ExecutableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<If, If_ExecutableAspectIfAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.If, org.gemoc.arduino.sequential.xarduino.aspects.If_ExecutableAspectIfAspectProperties>();

  public Map<If, If_ExecutableAspectIfAspectProperties> getMap() {
    return map;
  }
}

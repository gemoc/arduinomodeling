package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.Utilities;

@SuppressWarnings("all")
public class Utilities_ExecutableAspectUtilitiesAspectContext {
  public static final Utilities_ExecutableAspectUtilitiesAspectContext INSTANCE = new Utilities_ExecutableAspectUtilitiesAspectContext();

  public static Utilities_ExecutableAspectUtilitiesAspectProperties getSelf(final Utilities _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Utilities, Utilities_ExecutableAspectUtilitiesAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.Utilities, org.gemoc.arduino.concurrent.xarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties>();

  public Map<Utilities, Utilities_ExecutableAspectUtilitiesAspectProperties> getMap() {
    return map;
  }
}

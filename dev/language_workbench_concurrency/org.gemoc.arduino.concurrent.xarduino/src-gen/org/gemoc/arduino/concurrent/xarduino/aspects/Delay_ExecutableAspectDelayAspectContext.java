package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.Delay;

@SuppressWarnings("all")
public class Delay_ExecutableAspectDelayAspectContext {
  public static final Delay_ExecutableAspectDelayAspectContext INSTANCE = new Delay_ExecutableAspectDelayAspectContext();

  public static Delay_ExecutableAspectDelayAspectProperties getSelf(final Delay _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.Delay_ExecutableAspectDelayAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Delay, Delay_ExecutableAspectDelayAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.Delay, org.gemoc.arduino.concurrent.xarduino.aspects.Delay_ExecutableAspectDelayAspectProperties>();

  public Map<Delay, Delay_ExecutableAspectDelayAspectProperties> getMap() {
    return map;
  }
}

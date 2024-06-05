package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.Control;

@SuppressWarnings("all")
public class Control_ExecutableAspectControlAspectContext {
  public static final Control_ExecutableAspectControlAspectContext INSTANCE = new Control_ExecutableAspectControlAspectContext();

  public static Control_ExecutableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Control, Control_ExecutableAspectControlAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.Control, org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspectControlAspectProperties>();

  public Map<Control, Control_ExecutableAspectControlAspectProperties> getMap() {
    return map;
  }
}

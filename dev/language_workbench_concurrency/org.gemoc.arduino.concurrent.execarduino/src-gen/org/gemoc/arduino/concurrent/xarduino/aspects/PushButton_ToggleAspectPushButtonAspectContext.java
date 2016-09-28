package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.PushButton;
import org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties;

@SuppressWarnings("all")
public class PushButton_ToggleAspectPushButtonAspectContext {
  public final static PushButton_ToggleAspectPushButtonAspectContext INSTANCE = new PushButton_ToggleAspectPushButtonAspectContext();
  
  public static PushButton_ToggleAspectPushButtonAspectProperties getSelf(final PushButton _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PushButton, PushButton_ToggleAspectPushButtonAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.PushButton, org.gemoc.arduino.concurrent.xarduino.aspects.PushButton_ToggleAspectPushButtonAspectProperties>();
  
  public Map<PushButton, PushButton_ToggleAspectPushButtonAspectProperties> getMap() {
    return map;
  }
}

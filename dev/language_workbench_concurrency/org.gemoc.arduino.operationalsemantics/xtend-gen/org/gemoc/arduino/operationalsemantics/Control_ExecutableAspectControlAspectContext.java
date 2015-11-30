package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Control;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties;

@SuppressWarnings("all")
public class Control_ExecutableAspectControlAspectContext {
  public final static Control_ExecutableAspectControlAspectContext INSTANCE = new Control_ExecutableAspectControlAspectContext();
  
  public static Control_ExecutableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, Control_ExecutableAspectControlAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Control, org.gemoc.arduino.operationalsemantics.Control_ExecutableAspectControlAspectProperties>();
  
  public Map<Control, Control_ExecutableAspectControlAspectProperties> getMap() {
    return map;
  }
}

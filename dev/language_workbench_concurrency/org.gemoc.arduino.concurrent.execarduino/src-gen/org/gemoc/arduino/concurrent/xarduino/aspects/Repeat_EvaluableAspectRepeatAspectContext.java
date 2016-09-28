package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.Repeat;
import org.gemoc.arduino.concurrent.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties;

@SuppressWarnings("all")
public class Repeat_EvaluableAspectRepeatAspectContext {
  public final static Repeat_EvaluableAspectRepeatAspectContext INSTANCE = new Repeat_EvaluableAspectRepeatAspectContext();
  
  public static Repeat_EvaluableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.Repeat, org.gemoc.arduino.concurrent.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}

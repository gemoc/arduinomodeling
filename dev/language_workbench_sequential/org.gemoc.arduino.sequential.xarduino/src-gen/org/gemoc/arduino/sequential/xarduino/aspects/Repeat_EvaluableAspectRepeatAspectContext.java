package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.Repeat;

@SuppressWarnings("all")
public class Repeat_EvaluableAspectRepeatAspectContext {
  public static final Repeat_EvaluableAspectRepeatAspectContext INSTANCE = new Repeat_EvaluableAspectRepeatAspectContext();

  public static Repeat_EvaluableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Repeat, org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties>();

  public Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}

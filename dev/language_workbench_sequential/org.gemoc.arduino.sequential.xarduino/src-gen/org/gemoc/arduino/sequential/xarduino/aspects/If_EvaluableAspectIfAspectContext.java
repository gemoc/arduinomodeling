package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.If;

@SuppressWarnings("all")
public class If_EvaluableAspectIfAspectContext {
  public static final If_EvaluableAspectIfAspectContext INSTANCE = new If_EvaluableAspectIfAspectContext();

  public static If_EvaluableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.If_EvaluableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<If, If_EvaluableAspectIfAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.If, org.gemoc.arduino.sequential.xarduino.aspects.If_EvaluableAspectIfAspectProperties>();

  public Map<If, If_EvaluableAspectIfAspectProperties> getMap() {
    return map;
  }
}

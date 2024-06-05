package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspectIntegerVariableAspectContext {
  public static final IntegerVariable_EvaluableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariable_EvaluableAspectIntegerVariableAspectContext();

  public static IntegerVariable_EvaluableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable, org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties>();

  public Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}

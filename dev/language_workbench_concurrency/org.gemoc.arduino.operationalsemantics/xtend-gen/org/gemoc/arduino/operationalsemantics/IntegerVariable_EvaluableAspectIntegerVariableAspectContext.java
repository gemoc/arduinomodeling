package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.IntegerVariable;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties;

@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspectIntegerVariableAspectContext {
  public final static IntegerVariable_EvaluableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariable_EvaluableAspectIntegerVariableAspectContext();
  
  public static IntegerVariable_EvaluableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.IntegerVariable, org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties>();
  
  public Map<IntegerVariable, IntegerVariable_EvaluableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}

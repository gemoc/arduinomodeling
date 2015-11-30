package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.BooleanVariable;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspectBooleanVariableAspectContext {
  public final static BooleanVariable_EvaluableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariable_EvaluableAspectBooleanVariableAspectContext();
  
  public static BooleanVariable_EvaluableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.BooleanVariable, org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.Variable;

@SuppressWarnings("all")
public class Variable_EvaluableAspectVariableAspectContext {
  public static final Variable_EvaluableAspectVariableAspectContext INSTANCE = new Variable_EvaluableAspectVariableAspectContext();

  public static Variable_EvaluableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.Variable_EvaluableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Variable, Variable_EvaluableAspectVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Variable, org.gemoc.arduino.sequential.xarduino.aspects.Variable_EvaluableAspectVariableAspectProperties>();

  public Map<Variable, Variable_EvaluableAspectVariableAspectProperties> getMap() {
    return map;
  }
}

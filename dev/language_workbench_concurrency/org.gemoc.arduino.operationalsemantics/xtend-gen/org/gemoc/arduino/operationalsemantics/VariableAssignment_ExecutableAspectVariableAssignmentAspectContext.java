package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.VariableAssignment;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;

@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspectVariableAssignmentAspectContext {
  public final static VariableAssignment_ExecutableAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignment_ExecutableAspectVariableAssignmentAspectContext();
  
  public static VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.VariableAssignment, org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties>();
  
  public Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}

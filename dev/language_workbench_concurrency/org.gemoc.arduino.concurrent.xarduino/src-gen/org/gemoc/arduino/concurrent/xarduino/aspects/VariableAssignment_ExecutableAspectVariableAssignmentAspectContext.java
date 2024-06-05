package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment;

@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspectVariableAssignmentAspectContext {
  public static final VariableAssignment_ExecutableAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignment_ExecutableAspectVariableAssignmentAspectContext();

  public static VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment, org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties>();

  public Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}

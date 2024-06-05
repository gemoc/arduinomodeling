package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment;

@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext {
  public static final ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext INSTANCE = new ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext();

  public static ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties getSelf(final ModuleAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment, org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties>();

  public Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.ModuleAssignment;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspectModuleAssignmentAspectProperties;

@SuppressWarnings("all")
public class ModuleAssignment_CallableAspectModuleAssignmentAspectContext {
  public final static ModuleAssignment_CallableAspectModuleAssignmentAspectContext INSTANCE = new ModuleAssignment_CallableAspectModuleAssignmentAspectContext();
  
  public static ModuleAssignment_CallableAspectModuleAssignmentAspectProperties getSelf(final ModuleAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspectModuleAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleAssignment, ModuleAssignment_CallableAspectModuleAssignmentAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.ModuleAssignment, org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspectModuleAssignmentAspectProperties>();
  
  public Map<ModuleAssignment, ModuleAssignment_CallableAspectModuleAssignmentAspectProperties> getMap() {
    return map;
  }
}

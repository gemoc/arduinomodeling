package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.ModuleInstruction;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectProperties;

@SuppressWarnings("all")
public class ModuleInstruction_CallableAspectModuleInstructionAspectContext {
  public final static ModuleInstruction_CallableAspectModuleInstructionAspectContext INSTANCE = new ModuleInstruction_CallableAspectModuleInstructionAspectContext();
  
  public static ModuleInstruction_CallableAspectModuleInstructionAspectProperties getSelf(final ModuleInstruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleInstruction, ModuleInstruction_CallableAspectModuleInstructionAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.ModuleInstruction, org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectProperties>();
  
  public Map<ModuleInstruction, ModuleInstruction_CallableAspectModuleInstructionAspectProperties> getMap() {
    return map;
  }
}

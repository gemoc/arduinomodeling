package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction;

@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspectModuleInstructionAspectContext {
  public static final ModuleInstruction_ExecutableAspectModuleInstructionAspectContext INSTANCE = new ModuleInstruction_ExecutableAspectModuleInstructionAspectContext();

  public static ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties getSelf(final ModuleInstruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ModuleInstruction, ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction, org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties>();

  public Map<ModuleInstruction, ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties> getMap() {
    return map;
  }
}

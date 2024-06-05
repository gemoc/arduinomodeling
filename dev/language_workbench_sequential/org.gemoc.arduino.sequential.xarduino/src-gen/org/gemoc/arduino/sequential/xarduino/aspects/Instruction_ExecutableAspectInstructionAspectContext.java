package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@SuppressWarnings("all")
public class Instruction_ExecutableAspectInstructionAspectContext {
  public static final Instruction_ExecutableAspectInstructionAspectContext INSTANCE = new Instruction_ExecutableAspectInstructionAspectContext();

  public static Instruction_ExecutableAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Instruction, Instruction_ExecutableAspectInstructionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Instruction, org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties>();

  public Map<Instruction, Instruction_ExecutableAspectInstructionAspectProperties> getMap() {
    return map;
  }
}

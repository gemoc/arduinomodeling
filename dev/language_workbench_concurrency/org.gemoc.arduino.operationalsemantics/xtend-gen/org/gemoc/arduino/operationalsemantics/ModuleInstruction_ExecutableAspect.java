package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.ModuleInstruction;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties;

@Aspect(className = ModuleInstruction.class)
@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleInstruction _self) {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.ModuleAssignment){
     org.gemoc.arduino.operationalsemantics.ModuleAssignment_ExecutableAspect.execute((fr.obeo.dsl.arduino.ModuleAssignment)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.ModuleInstruction){
     org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.ModuleInstruction)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final ModuleInstruction _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_, final ModuleInstruction _self) {
  }
}

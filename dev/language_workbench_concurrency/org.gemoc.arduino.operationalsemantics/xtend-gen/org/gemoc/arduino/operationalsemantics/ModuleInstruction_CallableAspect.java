package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.obeo.dsl.arduino.ModuleInstruction;
import org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectProperties;

@Aspect(className = ModuleInstruction.class)
@SuppressWarnings("all")
public class ModuleInstruction_CallableAspect {
  public static void call(final ModuleInstruction _self) {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspectModuleInstructionAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.ModuleAssignment){
     org.gemoc.arduino.operationalsemantics.ModuleAssignment_CallableAspect.call((fr.obeo.dsl.arduino.ModuleAssignment)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.ModuleInstruction){
     org.gemoc.arduino.operationalsemantics.ModuleInstruction_CallableAspect._privk3_call(_self_, (fr.obeo.dsl.arduino.ModuleInstruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_call(final ModuleInstruction_CallableAspectModuleInstructionAspectProperties _self_, final ModuleInstruction _self) {
  }
}

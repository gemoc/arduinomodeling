package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.obeo.dsl.arduino.Instruction;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect {
  public static void execute(final Instruction _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.VariableAssignment){
     org.gemoc.arduino.operationalsemantics.VariableAssignment_ExecutableAspect.execute((fr.obeo.dsl.arduino.VariableAssignment)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Sketch){
     org.gemoc.arduino.operationalsemantics.Sketch_ExecutableAspect.execute((fr.obeo.dsl.arduino.Sketch)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Control){
     org.gemoc.arduino.operationalsemantics.Control_ExecutableAspect.execute((fr.obeo.dsl.arduino.Control)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Delay){
     org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspect.execute((fr.obeo.dsl.arduino.Delay)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.VariableDeclaration){
     org.gemoc.arduino.operationalsemantics.VariableDeclaration_ExecutableAspect.execute((fr.obeo.dsl.arduino.VariableDeclaration)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.ModuleAssignment){
     org.gemoc.arduino.operationalsemantics.ModuleAssignment_ExecutableAspect.execute((fr.obeo.dsl.arduino.ModuleAssignment)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.ModuleInstruction){
     org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.ModuleInstruction)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Utilities){
     org.gemoc.arduino.operationalsemantics.Utilities_ExecutableAspect.execute((fr.obeo.dsl.arduino.Utilities)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void finalize(final Instruction _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.Repeat){
     org.gemoc.arduino.operationalsemantics.Repeat_EvaluableAspect.finalize((fr.obeo.dsl.arduino.Repeat)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_finalize(_self_, (fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}

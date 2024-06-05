package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction;

@Aspect(className = ModuleInstruction.class)
@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleInstruction _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction) {
		org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}

  private static void super_execute(final ModuleInstruction _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_, final ModuleInstruction _self) {
  }
}

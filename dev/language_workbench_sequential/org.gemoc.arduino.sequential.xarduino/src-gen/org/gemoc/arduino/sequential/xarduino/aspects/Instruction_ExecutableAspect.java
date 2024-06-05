package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  public static void execute(final Instruction _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.VariableAssignment_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Assignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Assignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Delay) {
		org.gemoc.arduino.sequential.xarduino.aspects.Delay_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Delay) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Utilities) {
		org.gemoc.arduino.sequential.xarduino.aspects.Utilities_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Utilities) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration) {
		org.gemoc.arduino.sequential.xarduino.aspects.VariableDeclaration_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat) {
		org.gemoc.arduino.sequential.xarduino.aspects.Repeat_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Repeat) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction) {
		org.gemoc.arduino.sequential.xarduino.aspects.ModuleInstruction_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.While) {
		org.gemoc.arduino.sequential.xarduino.aspects.While_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.If) {
		org.gemoc.arduino.sequential.xarduino.aspects.If_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Control) {
		org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect
				.execute((org.gemoc.arduino.sequential.xarduino.arduino.Control) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Instruction) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Instruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}

  public static void finalize(final Instruction _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Assignment) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Assignment) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Delay) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Delay) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Utilities) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Utilities) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat) {
		org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect
				.finalize((org.gemoc.arduino.sequential.xarduino.arduino.Repeat) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.While) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.If) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Control) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Control) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Instruction) {
		org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Instruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}

  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }

  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}

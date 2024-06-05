package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect {
  public static void execute(final Instruction _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration) {
		org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet) {
		org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet) {
		org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment) {
		org.gemoc.arduino.concurrent.xarduino.aspects.ModuleAssignment_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleGet) {
		org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.ModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction) {
		org.gemoc.arduino.concurrent.xarduino.aspects.ModuleInstruction_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.While) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Delay) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Delay_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Delay) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.If) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Repeat) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Repeat) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Control) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Control_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Control) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment) {
		org.gemoc.arduino.concurrent.xarduino.aspects.VariableAssignment_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Utilities) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Utilities_ExecutableAspect
				.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Utilities) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Assignment) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Assignment) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Instruction) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Instruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}

  public static void finalize(final Instruction _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.ModuleAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleGet) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.ModuleGet) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.While) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.While) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Delay) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Delay) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.If) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.If) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Repeat) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Repeat_EvaluableAspect
				.finalize((org.gemoc.arduino.concurrent.xarduino.arduino.Repeat) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Control) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Control) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.VariableAssignment) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Utilities) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Utilities) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Assignment) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Assignment) _self);
	} else if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Instruction) {
		org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(org.gemoc.arduino.concurrent.xarduino.arduino.Instruction) _self);
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

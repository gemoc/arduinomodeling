package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.Variable;
import org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}

  private static void super_execute(final VariableDeclaration _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_, final VariableDeclaration _self) {
    InputOutput.<String>println(_self.getVariable().eClass().getName());
    Variable _variable = _self.getVariable();
    if ((_variable instanceof IntegerVariable)) {
      Variable _variable_1 = _self.getVariable();
      Variable _variable_2 = _self.getVariable();
      IntegerVariable_EvaluableAspect.value(((IntegerVariable) _variable_1), Integer.valueOf(((IntegerVariable) _variable_2).getInitialValue()));
    } else {
      Variable _variable_3 = _self.getVariable();
      Variable _variable_4 = _self.getVariable();
      BooleanVariable_EvaluableAspect.value(((BooleanVariable) _variable_3), Boolean.valueOf(((BooleanVariable) _variable_4).isInitialValue()));
    }
  }
}

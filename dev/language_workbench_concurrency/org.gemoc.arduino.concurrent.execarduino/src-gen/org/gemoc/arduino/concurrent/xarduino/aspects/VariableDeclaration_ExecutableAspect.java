package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.xarduino.arduino.Variable;
import org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration){
    					org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Instruction){
    					org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.concurrent.xarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableDeclaration _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.concurrent.xarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_, final VariableDeclaration _self) {
    Variable _variable = _self.getVariable();
    EClass _eClass = _variable.eClass();
    String _name = _eClass.getName();
    InputOutput.<String>println(_name);
    Variable _variable_1 = _self.getVariable();
    if ((_variable_1 instanceof IntegerVariable)) {
      Variable _variable_2 = _self.getVariable();
      Variable _variable_3 = _self.getVariable();
      int _initialValue = ((IntegerVariable) _variable_3).getInitialValue();
      IntegerVariable_EvaluableAspect.value(((IntegerVariable) _variable_2), Integer.valueOf(_initialValue));
    } else {
      Variable _variable_4 = _self.getVariable();
      Variable _variable_5 = _self.getVariable();
      boolean _isInitialValue = ((BooleanVariable) _variable_5).isInitialValue();
      BooleanVariable_EvaluableAspect.value(((BooleanVariable) _variable_4), Boolean.valueOf(_isInitialValue));
    }
  }
}

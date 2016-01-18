package org.gemoc.arduino.operationalsemantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.BooleanVariable;
import fr.obeo.dsl.arduino.IntegerVariable;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.VariableDeclaration;
import org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect;
import org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
    org.gemoc.arduino.operationalsemantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext.getSelf(_self);
     if (_self instanceof fr.obeo.dsl.arduino.VariableDeclaration){
     org.gemoc.arduino.operationalsemantics.VariableDeclaration_ExecutableAspect._privk3_execute(_self_, (fr.obeo.dsl.arduino.VariableDeclaration)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Instruction){
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute((fr.obeo.dsl.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableDeclaration _self) {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_, final VariableDeclaration _self) {
    Variable _variable = _self.getVariable();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_variable, IntegerVariable.class)) {
        _matched=true;
        Variable _variable_1 = _self.getVariable();
        Variable _variable_2 = _self.getVariable();
        int _initialValue = ((IntegerVariable) _variable_2).getInitialValue();
        IntegerVariable_EvaluableAspect.value(((IntegerVariable) _variable_1), Integer.valueOf(_initialValue));
      }
    }
    if (!_matched) {
      if (Objects.equal(_variable, BooleanVariable.class)) {
        _matched=true;
        Variable _variable_3 = _self.getVariable();
        Variable _variable_4 = _self.getVariable();
        boolean _isInitialValue = ((BooleanVariable) _variable_4).isInitialValue();
        BooleanVariable_EvaluableAspect.value(((BooleanVariable) _variable_3), Boolean.valueOf(_isInitialValue));
      }
    }
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.VariableRef;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;
import org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspectVariableRefAspectProperties;

@Aspect(className = VariableRef.class)
@SuppressWarnings("all")
public class VariableDeclaration_EvaluableAspect extends Expression_EvaluableAspect {
  public static Object evaluate(final VariableRef _self) {
    org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspectVariableRefAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspectVariableRefAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.VariableRef){
    result = org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.VariableRef)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final VariableDeclaration_EvaluableAspectVariableRefAspectProperties _self_, final VariableRef _self) {
    Variable _variable = _self.getVariable();
    return Expression_EvaluableAspect.evaluate(_variable);
  }
}

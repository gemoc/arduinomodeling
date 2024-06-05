package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.xarduino.arduino.Variable;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public abstract class Variable_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Variable _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.Variable_EvaluableAspectVariableAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Variable_EvaluableAspectVariableAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.IntegerVariable_EvaluableAspect
				.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.BooleanVariable_EvaluableAspect
				.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable) _self);
	} else if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Variable) {
		result = org.gemoc.arduino.sequential.xarduino.aspects.Variable_EvaluableAspect._privk3_evaluate(_self_,
				(org.gemoc.arduino.sequential.xarduino.arduino.Variable) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Object) result;
}

  protected static Object _privk3_evaluate(final Variable_EvaluableAspectVariableAspectProperties _self_, final Variable _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

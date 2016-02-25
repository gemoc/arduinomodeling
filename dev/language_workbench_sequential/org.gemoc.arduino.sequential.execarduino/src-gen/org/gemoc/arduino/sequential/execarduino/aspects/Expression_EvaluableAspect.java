package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.execarduino.arduino.Expression;
import org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Expression _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression){
    result = org.gemoc.arduino.sequential.execarduino.aspects.BinaryIntegerExpression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.IntegerConstant){
    result = org.gemoc.arduino.sequential.execarduino.aspects.IntegerConstant_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.IntegerConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet){
    result = org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.VariableRef){
    result = org.gemoc.arduino.sequential.execarduino.aspects.VariableRef_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.VariableRef)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet){
    result = org.gemoc.arduino.sequential.execarduino.aspects.BooleanModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Constant){
    result = org.gemoc.arduino.sequential.execarduino.aspects.Constant_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.Constant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BooleanConstant){
    result = org.gemoc.arduino.sequential.execarduino.aspects.BooleanConstant_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.BooleanConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanExpression){
    result = org.gemoc.arduino.sequential.execarduino.aspects.BinaryBooleanExpression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Expression){
    result = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

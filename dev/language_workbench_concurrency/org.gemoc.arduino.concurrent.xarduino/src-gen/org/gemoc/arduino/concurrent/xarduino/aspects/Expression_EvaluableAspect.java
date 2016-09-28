package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.concurrent.xarduino.arduino.Expression;
import org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Expression _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Constant){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.Constant_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.Constant)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.VariableRef){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.VariableRef_EvaluableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.VariableRef)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.IntegerConstant_ExecutableAspect.evaluate((org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.Expression){
    					result = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.obeo.dsl.arduino.Expression;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Expression _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.IntegerModuleGet){
    result = org.gemoc.arduino.operationalsemantics.IntegerModuleGet_ExecutableAspect.evaluate((fr.obeo.dsl.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.BooleanVariable){
    result = org.gemoc.arduino.operationalsemantics.BooleanVariable_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.BooleanVariable)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.IntegerVariable){
    result = org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.IntegerVariable)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.BooleanModuleGet){
    result = org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspect.evaluate((fr.obeo.dsl.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.VariableRef){
    result = org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.VariableRef)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Constant){
    result = org.gemoc.arduino.operationalsemantics.Constant_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Constant)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.BinaryBooleanExpression){
    result = org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.BinaryIntegerExpression){
    result = org.gemoc.arduino.operationalsemantics.BinaryIntegerExpression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.BinaryIntegerExpression)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.BooleanConstant){
    result = org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspect.evaluate((fr.obeo.dsl.arduino.BooleanConstant)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.IntegerConstant){
    result = org.gemoc.arduino.operationalsemantics.IntegerConstant_ExecutableAspect.evaluate((fr.obeo.dsl.arduino.IntegerConstant)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

package org.gemoc.arduino.sequential.xarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  protected static Instruction getInstruction(final Expression _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getInstruction(_self_, _self);;
    return (org.gemoc.arduino.sequential.xarduino.arduino.Instruction)result;
  }
  
  @Abstract
  public static Object evaluate(final Expression _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.IntegerModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanExpression){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.BooleanModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.BooleanConstant_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableRef){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.VariableRef)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Constant){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.Constant_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.Constant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.BinaryIntegerExpression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.IntegerConstant_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.xarduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.xarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Instruction _privk3_getInstruction(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    Instruction instruction = null;
    EObject current = _self.eContainer();
    while ((!Objects.equal(current, null))) {
      {
        if ((current instanceof Instruction)) {
          instruction = ((Instruction) current);
          return instruction;
        }
        EObject _eContainer = current.eContainer();
        current = _eContainer;
      }
    }
    return instruction;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}

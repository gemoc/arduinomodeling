package org.gemoc.arduino.operationalsemantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.BinaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.BooleanExpression;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.IntegerExpression;
import org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect;

@Aspect(className = BinaryBooleanExpression.class)
@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryBooleanExpression _self) {
    org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.obeo.dsl.arduino.BinaryBooleanExpression){
    result = org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspect._privk3_evaluate(_self_, (fr.obeo.dsl.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof fr.obeo.dsl.arduino.Expression){
    result = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate((fr.obeo.dsl.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BinaryBooleanExpression _self) {
    org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties _self_, final BinaryBooleanExpression _self) {
    Boolean res = null;
    boolean bLeft = false;
    int iLeft = 0;
    Expression _left = _self.getLeft();
    boolean _matched = false;
    if (!_matched) {
      if (_left instanceof BooleanExpression) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = Expression_EvaluableAspect.evaluate(_left_1);
        bLeft = (((Boolean) _evaluate)).booleanValue();
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerExpression) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = Expression_EvaluableAspect.evaluate(_left_1);
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    boolean bRight = false;
    int iRight = 0;
    Expression _right = _self.getRight();
    boolean _matched_1 = false;
    if (!_matched_1) {
      if (_right instanceof BooleanExpression) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = Expression_EvaluableAspect.evaluate(_right_1);
        bRight = (((Boolean) _evaluate)).booleanValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerExpression) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = Expression_EvaluableAspect.evaluate(_right_1);
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    BinaryBooleanOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case AND:
          if (bLeft) {
            res = Boolean.valueOf(bRight);
          } else {
            res = Boolean.FALSE;
          }
          break;
        case OR:
          if (bLeft) {
            res = Boolean.TRUE;
          } else {
            res = Boolean.valueOf(bRight);
          }
          break;
        case DIFFERENT:
          boolean _equals = Boolean.valueOf(bLeft).equals(Boolean.valueOf(bRight));
          boolean _not = (!_equals);
          res = Boolean.valueOf(_not);
          break;
        case EQUAL:
          boolean _equals_1 = Boolean.valueOf(bLeft).equals(Boolean.valueOf(bRight));
          res = Boolean.valueOf(_equals_1);
          break;
        case INF:
          res = Boolean.valueOf((iLeft < iRight));
          break;
        case INF_OR_EQUAL:
          res = Boolean.valueOf((iLeft <= iRight));
          break;
        case SUP:
          res = Boolean.valueOf((iLeft > iRight));
          break;
        case SUP_OR_EQUAL:
          res = Boolean.valueOf((iLeft >= iRight));
          break;
        default:
          BinaryBooleanOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      BinaryBooleanOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}

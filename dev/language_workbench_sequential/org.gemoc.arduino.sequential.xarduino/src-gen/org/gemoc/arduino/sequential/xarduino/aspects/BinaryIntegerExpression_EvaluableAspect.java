package org.gemoc.arduino.sequential.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties;
import org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerExpression;

@Aspect(className = BinaryIntegerExpression.class)
@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryIntegerExpression _self) {
	final org.gemoc.arduino.sequential.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final BinaryIntegerExpression _self) {
    final org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties _self_, final BinaryIntegerExpression _self) {
    Integer res = null;
    boolean bLeft = false;
    int iLeft = 0;
    Expression _left = _self.getLeft();
    boolean _matched = false;
    if (_left instanceof BooleanExpression) {
      _matched=true;
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getLeft());
      bLeft = (((Boolean) _evaluate)).booleanValue();
    }
    if (!_matched) {
      if (_left instanceof IntegerExpression) {
        _matched=true;
        Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getLeft());
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    boolean bRight = false;
    int iRight = 0;
    Expression _right = _self.getRight();
    boolean _matched_1 = false;
    if (_right instanceof BooleanExpression) {
      _matched_1=true;
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getRight());
      bRight = (((Boolean) _evaluate)).booleanValue();
    }
    if (!_matched_1) {
      if (_right instanceof IntegerExpression) {
        _matched_1=true;
        Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getRight());
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    BinaryIntegerOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case DIV:
          res = Integer.valueOf((iLeft / iRight));
          break;
        case MAX:
          res = Integer.valueOf(Math.max(iLeft, iRight));
          break;
        case MIN:
          res = Integer.valueOf(Math.min(iLeft, iRight));
          break;
        case MINUS:
          res = Integer.valueOf((iLeft - iRight));
          break;
        case MUL:
          res = Integer.valueOf((iLeft * iRight));
          break;
        case PLUS:
          res = Integer.valueOf((iLeft + iRight));
          break;
        case POURCENT:
          res = Integer.valueOf((iLeft % iRight));
          break;
        default:
          BinaryIntegerOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      BinaryIntegerOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}

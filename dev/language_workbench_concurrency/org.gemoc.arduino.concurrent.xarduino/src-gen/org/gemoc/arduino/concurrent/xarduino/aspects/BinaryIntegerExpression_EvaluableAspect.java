package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.xarduino.arduino.Expression;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerConstant;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryExpression_EvaluableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerConstant_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerModuleGet_ExecutableAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.VariableRef_EvaluableAspect;

@Aspect(className = BinaryIntegerExpression.class, with = { BinaryExpression_EvaluableAspect.class })
@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspect extends BinaryExpression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryIntegerExpression _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final BinaryIntegerExpression _self) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.concurrent.xarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties _self_, final BinaryIntegerExpression _self) {
    Integer res = null;
    boolean bLeft = false;
    int iLeft = 0;
    Expression _left = _self.getLeft();
    boolean _matched = false;
    if (_left instanceof BinaryBooleanExpression) {
      _matched=true;
      Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.getLeft());
      bLeft = (((Boolean) _evaluate)).booleanValue();
    }
    if (!_matched) {
      if (_left instanceof BinaryIntegerExpression) {
        _matched=true;
        Object _evaluate = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.getLeft());
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerVariableRef) {
        _matched=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getLeft());
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerModuleGet) {
        _matched=true;
        Object _evaluate = IntegerModuleGet_ExecutableAspect.evaluate(_self.getLeft());
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof BooleanVariableRef) {
        _matched=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getLeft());
        bLeft = (((Boolean) _evaluate)).booleanValue();
      }
    }
    if (!_matched) {
      if (_left instanceof IntegerConstant) {
        _matched=true;
        Object _evaluate = IntegerConstant_ExecutableAspect.evaluate(_self.getLeft());
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched) {
      if (_left instanceof BooleanConstant) {
        _matched=true;
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_self.getLeft());
        bLeft = (((Boolean) _evaluate)).booleanValue();
      }
    }
    if (!_matched) {
      if (_left instanceof BooleanModuleGet) {
        _matched=true;
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_self.getLeft());
        bLeft = (((Boolean) _evaluate)).booleanValue();
      }
    }
    boolean bRight = false;
    int iRight = 0;
    Expression _right = _self.getRight();
    boolean _matched_1 = false;
    if (_right instanceof BinaryBooleanExpression) {
      _matched_1=true;
      Object _evaluate = BinaryBooleanExpression_EvaluableAspect.evaluate(_self.getRight());
      bRight = (((Boolean) _evaluate)).booleanValue();
    }
    if (!_matched_1) {
      if (_right instanceof BinaryIntegerExpression) {
        _matched_1=true;
        Object _evaluate = BinaryIntegerExpression_EvaluableAspect.evaluate(_self.getRight());
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerVariableRef) {
        _matched_1=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getRight());
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerModuleGet) {
        _matched_1=true;
        Object _evaluate = IntegerModuleGet_ExecutableAspect.evaluate(_self.getRight());
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof BooleanVariableRef) {
        _matched_1=true;
        Object _evaluate = VariableRef_EvaluableAspect.evaluate(_self.getRight());
        bRight = (((Boolean) _evaluate)).booleanValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof IntegerConstant) {
        _matched_1=true;
        Object _evaluate = IntegerConstant_ExecutableAspect.evaluate(_self.getRight());
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof BooleanConstant) {
        _matched_1=true;
        Object _evaluate = BooleanConstant_ExecutableAspect.evaluate(_self.getRight());
        bRight = (((Boolean) _evaluate)).booleanValue();
      }
    }
    if (!_matched_1) {
      if (_right instanceof BooleanModuleGet) {
        _matched_1=true;
        Object _evaluate = BooleanModuleGet_ExecutableAspect.evaluate(_self.getRight());
        bRight = (((Boolean) _evaluate)).booleanValue();
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

package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;

@SuppressWarnings("all")
public class Expression_EvaluableAspectExpressionAspectContext {
  public static final Expression_EvaluableAspectExpressionAspectContext INSTANCE = new Expression_EvaluableAspectExpressionAspectContext();

  public static Expression_EvaluableAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.Expression, org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties>();

  public Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.IntegerExpression;
import org.gemoc.arduino.concurrent.xarduino.aspects.IntegerExpression_EvaluableAspectIntegerExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerExpression_EvaluableAspectIntegerExpressionAspectContext {
  public final static IntegerExpression_EvaluableAspectIntegerExpressionAspectContext INSTANCE = new IntegerExpression_EvaluableAspectIntegerExpressionAspectContext();
  
  public static IntegerExpression_EvaluableAspectIntegerExpressionAspectProperties getSelf(final IntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.IntegerExpression_EvaluableAspectIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerExpression, IntegerExpression_EvaluableAspectIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.IntegerExpression, org.gemoc.arduino.concurrent.xarduino.aspects.IntegerExpression_EvaluableAspectIntegerExpressionAspectProperties>();
  
  public Map<IntegerExpression, IntegerExpression_EvaluableAspectIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}

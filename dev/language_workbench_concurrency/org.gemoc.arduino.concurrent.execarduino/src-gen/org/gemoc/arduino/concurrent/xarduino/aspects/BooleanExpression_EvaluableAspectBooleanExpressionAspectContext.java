package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.xarduino.aspects.BooleanExpression_EvaluableAspectBooleanExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanExpression_EvaluableAspectBooleanExpressionAspectContext {
  public final static BooleanExpression_EvaluableAspectBooleanExpressionAspectContext INSTANCE = new BooleanExpression_EvaluableAspectBooleanExpressionAspectContext();
  
  public static BooleanExpression_EvaluableAspectBooleanExpressionAspectProperties getSelf(final BooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BooleanExpression_EvaluableAspectBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpression, BooleanExpression_EvaluableAspectBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BooleanExpression, org.gemoc.arduino.concurrent.xarduino.aspects.BooleanExpression_EvaluableAspectBooleanExpressionAspectProperties>();
  
  public Map<BooleanExpression, BooleanExpression_EvaluableAspectBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}

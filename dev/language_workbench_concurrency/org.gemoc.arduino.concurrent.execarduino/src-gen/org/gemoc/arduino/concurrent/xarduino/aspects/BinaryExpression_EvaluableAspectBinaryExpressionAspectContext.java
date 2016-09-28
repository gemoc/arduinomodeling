package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryExpression;
import org.gemoc.arduino.concurrent.xarduino.aspects.BinaryExpression_EvaluableAspectBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BinaryExpression_EvaluableAspectBinaryExpressionAspectContext {
  public final static BinaryExpression_EvaluableAspectBinaryExpressionAspectContext INSTANCE = new BinaryExpression_EvaluableAspectBinaryExpressionAspectContext();
  
  public static BinaryExpression_EvaluableAspectBinaryExpressionAspectProperties getSelf(final BinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BinaryExpression_EvaluableAspectBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryExpression, BinaryExpression_EvaluableAspectBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BinaryExpression, org.gemoc.arduino.concurrent.xarduino.aspects.BinaryExpression_EvaluableAspectBinaryExpressionAspectProperties>();
  
  public Map<BinaryExpression, BinaryExpression_EvaluableAspectBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}

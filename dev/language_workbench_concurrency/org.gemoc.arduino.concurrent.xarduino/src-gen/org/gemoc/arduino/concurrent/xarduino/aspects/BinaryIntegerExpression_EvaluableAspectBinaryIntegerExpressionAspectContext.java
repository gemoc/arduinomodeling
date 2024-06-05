package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression;

@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext {
  public static final BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext INSTANCE = new BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext();

  public static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties getSelf(final BinaryIntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BinaryIntegerExpression, org.gemoc.arduino.concurrent.xarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties>();

  public Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}

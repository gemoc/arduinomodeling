package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression;

@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext {
  public static final BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext INSTANCE = new BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext();

  public static BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties getSelf(final BinaryBooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BinaryBooleanExpression, org.gemoc.arduino.concurrent.xarduino.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties>();

  public Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}

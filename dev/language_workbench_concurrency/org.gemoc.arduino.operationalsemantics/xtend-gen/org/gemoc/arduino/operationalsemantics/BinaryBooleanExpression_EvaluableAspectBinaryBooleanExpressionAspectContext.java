package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties;

@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext {
  public final static BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext INSTANCE = new BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext();
  
  public static BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties getSelf(final BinaryBooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.BinaryBooleanExpression, org.gemoc.arduino.operationalsemantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties>();
  
  public Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Expression;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties;

@SuppressWarnings("all")
public class Expression_EvaluableAspectExpressionAspectContext {
  public final static Expression_EvaluableAspectExpressionAspectContext INSTANCE = new Expression_EvaluableAspectExpressionAspectContext();
  
  public static Expression_EvaluableAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Expression, org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspectExpressionAspectProperties>();
  
  public Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> getMap() {
    return map;
  }
}

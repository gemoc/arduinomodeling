package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.VariableRef;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspectVariableRefAspectProperties;

@SuppressWarnings("all")
public class VariableDeclaration_EvaluableAspectVariableRefAspectContext {
  public final static VariableDeclaration_EvaluableAspectVariableRefAspectContext INSTANCE = new VariableDeclaration_EvaluableAspectVariableRefAspectContext();
  
  public static VariableDeclaration_EvaluableAspectVariableRefAspectProperties getSelf(final VariableRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspectVariableRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableRef, VariableDeclaration_EvaluableAspectVariableRefAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.VariableRef, org.gemoc.arduino.operationalsemantics.VariableDeclaration_EvaluableAspectVariableRefAspectProperties>();
  
  public Map<VariableRef, VariableDeclaration_EvaluableAspectVariableRefAspectProperties> getMap() {
    return map;
  }
}

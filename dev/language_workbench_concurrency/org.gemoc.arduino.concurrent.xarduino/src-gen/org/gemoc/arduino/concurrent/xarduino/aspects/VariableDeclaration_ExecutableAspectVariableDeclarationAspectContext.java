package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration;

@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext {
  public static final VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext INSTANCE = new VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext();

  public static VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties getSelf(final VariableDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<VariableDeclaration, VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.VariableDeclaration, org.gemoc.arduino.concurrent.xarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties>();

  public Map<VariableDeclaration, VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties> getMap() {
    return map;
  }
}

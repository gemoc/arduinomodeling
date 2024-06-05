package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;

@SuppressWarnings("all")
public class Module_UtilitiesAspectModuleAspectContext {
  public static final Module_UtilitiesAspectModuleAspectContext INSTANCE = new Module_UtilitiesAspectModuleAspectContext();

  public static Module_UtilitiesAspectModuleAspectProperties getSelf(final org.gemoc.arduino.concurrent.xarduino.arduino.Module _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<org.gemoc.arduino.concurrent.xarduino.arduino.Module, Module_UtilitiesAspectModuleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.Module, org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties>();

  public Map<org.gemoc.arduino.concurrent.xarduino.arduino.Module, Module_UtilitiesAspectModuleAspectProperties> getMap() {
    return map;
  }
}

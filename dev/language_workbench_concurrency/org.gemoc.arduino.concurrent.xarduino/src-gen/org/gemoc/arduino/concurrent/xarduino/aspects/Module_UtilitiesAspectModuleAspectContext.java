package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.Module;
import org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties;

@SuppressWarnings("all")
public class Module_UtilitiesAspectModuleAspectContext {
  public final static Module_UtilitiesAspectModuleAspectContext INSTANCE = new Module_UtilitiesAspectModuleAspectContext();
  
  public static Module_UtilitiesAspectModuleAspectProperties getSelf(final Module _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Module, Module_UtilitiesAspectModuleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.Module, org.gemoc.arduino.concurrent.xarduino.aspects.Module_UtilitiesAspectModuleAspectProperties>();
  
  public Map<Module, Module_UtilitiesAspectModuleAspectProperties> getMap() {
    return map;
  }
}

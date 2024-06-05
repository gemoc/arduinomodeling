package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet;

@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext {
  public static final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext INSTANCE = new BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext();

  public static BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties getSelf(final BooleanModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanModuleGet, BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet, org.gemoc.arduino.concurrent.xarduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties>();

  public Map<BooleanModuleGet, BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties> getMap() {
    return map;
  }
}

package org.gemoc.arduino.sequential.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoCommunicationModule;

@SuppressWarnings("all")
public class ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext {
  public static final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext INSTANCE = new ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext();

  public static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties getSelf(final ArduinoCommunicationModule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.xarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.xarduino.arduino.ArduinoCommunicationModule, org.gemoc.arduino.sequential.xarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties>();

  public Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> getMap() {
    return map;
  }
}

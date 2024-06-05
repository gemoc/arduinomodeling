package org.gemoc.arduino.concurrent.xarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver;

@SuppressWarnings("all")
public class BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext {
  public static final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext INSTANCE = new BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext();

  public static BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties getSelf(final BluetoothTransceiver _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BluetoothTransceiver, BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver, org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties>();

  public Map<BluetoothTransceiver, BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties> getMap() {
    return map;
  }
}

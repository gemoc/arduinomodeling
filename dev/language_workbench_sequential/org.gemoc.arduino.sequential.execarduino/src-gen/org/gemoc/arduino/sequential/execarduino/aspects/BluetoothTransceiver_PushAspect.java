package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties;

@Aspect(className = BluetoothTransceiver.class)
@SuppressWarnings("all")
public abstract class BluetoothTransceiver_PushAspect extends ArduinoCommunicationModule_PushAspect {
  @OverrideAspectMethod
  public static void push(final BluetoothTransceiver _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver){
     org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspect._privk3_push(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule){
     org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspect.push((org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_push(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    EList<Integer> _dataToSend = _self.getDataToSend();
    Integer temp = IterableExtensions.<Integer>head(_dataToSend);
    BluetoothTransceiver _connectedTransceiver = _self.getConnectedTransceiver();
    EList<Integer> _dataReceived = _connectedTransceiver.getDataReceived();
    _dataReceived.add(temp);
  }
}

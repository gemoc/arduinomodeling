package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import java.util.function.Consumer;
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
  
  public static List<Integer> dataToSend(final BluetoothTransceiver _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_dataToSend(_self_, _self);
    return (java.util.List<java.lang.Integer>)result;
  }
  
  public static void dataToSend(final BluetoothTransceiver _self, final List<Integer> dataToSend) {
    org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    _privk3_dataToSend(_self_, _self,dataToSend);
  }
  
  public static List<Integer> dataReceived(final BluetoothTransceiver _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_dataReceived(_self_, _self);
    return (java.util.List<java.lang.Integer>)result;
  }
  
  public static void dataReceived(final BluetoothTransceiver _self, final List<Integer> dataReceived) {
    org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    _privk3_dataReceived(_self_, _self,dataReceived);
  }
  
  protected static void _privk3_push(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    BluetoothTransceiver _connectedTransceiver = _self.getConnectedTransceiver();
    final List<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(_connectedTransceiver);
    List<Integer> _dataToSend = BluetoothTransceiver_PushAspect.dataToSend(_self);
    final Consumer<Integer> _function = (Integer i) -> {
      l.add(i);
    };
    _dataToSend.forEach(_function);
    List<Integer> _dataToSend_1 = BluetoothTransceiver_PushAspect.dataToSend(_self);
    _dataToSend_1.clear();
  }
  
  protected static List<Integer> _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataToSend") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataToSend;
  }
  
  protected static void _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final List<Integer> dataToSend) {
    _self_.dataToSend = dataToSend; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDataToSend")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dataToSend);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static List<Integer> _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataReceived") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataReceived;
  }
  
  protected static void _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final List<Integer> dataReceived) {
    _self_.dataReceived = dataReceived; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDataReceived")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dataReceived);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}

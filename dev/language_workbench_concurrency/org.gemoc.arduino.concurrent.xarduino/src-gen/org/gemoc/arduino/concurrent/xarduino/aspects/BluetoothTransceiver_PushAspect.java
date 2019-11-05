package org.gemoc.arduino.concurrent.xarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.concurrent.xarduino.aspects.ArduinoCommunicationModule_PushAspect;
import org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties;

@Aspect(className = BluetoothTransceiver.class)
@SuppressWarnings("all")
public abstract class BluetoothTransceiver_PushAspect extends ArduinoCommunicationModule_PushAspect {
  @OverrideAspectMethod
  public static void push(final BluetoothTransceiver _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext
			.getSelf(_self);
	_privk3_push(_self_, _self);
	;
}
  
  public static EList<Integer> dataToSend(final BluetoothTransceiver _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_dataToSend(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static void dataToSend(final BluetoothTransceiver _self, final EList<Integer> dataToSend) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dataToSend(EList<Integer>)
    if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver){
    	org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspect._privk3_dataToSend(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver)_self,dataToSend);
    };
  }
  
  public static EList<Integer> dataReceived(final BluetoothTransceiver _self) {
	final org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_dataReceived(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static void dataReceived(final BluetoothTransceiver _self, final EList<Integer> dataReceived) {
    final org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dataReceived(EList<Integer>)
    if (_self instanceof org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver){
    	org.gemoc.arduino.concurrent.xarduino.aspects.BluetoothTransceiver_PushAspect._privk3_dataReceived(_self_, (org.gemoc.arduino.concurrent.xarduino.arduino.BluetoothTransceiver)_self,dataReceived);
    };
  }
  
  protected static void _privk3_push(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    final Integer temp = IterableExtensions.<Integer>head(BluetoothTransceiver_PushAspect.dataToSend(_self));
    BluetoothTransceiver_PushAspect.dataToSend(_self).remove(temp);
    final Consumer<BluetoothTransceiver> _function = (BluetoothTransceiver it) -> {
      BluetoothTransceiver_PushAspect.dataReceived(it).add(temp);
    };
    _self.getConnectedTransceiver().forEach(_function);
  }
  
  protected static EList<Integer> _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataToSend") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataToSend;
  }
  
  protected static void _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final EList<Integer> dataToSend) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDataToSend")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dataToSend);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.dataToSend = dataToSend;
    }
  }
  
  protected static EList<Integer> _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataReceived") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataReceived;
  }
  
  protected static void _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final EList<Integer> dataReceived) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDataReceived")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, dataReceived);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.dataReceived = dataReceived;
    }
  }
}

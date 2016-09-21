package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.gemoc.arduino.sequential.arduino.aspects.ArduinoCommunicationModule_PushAspect;
import org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver;

@Aspect(className = BluetoothTransceiver.class)
@SuppressWarnings("all")
public abstract class BluetoothTransceiver_PushAspect extends ArduinoCommunicationModule_PushAspect {
  @Step
  @OverrideAspectMethod
  public static void push(final BluetoothTransceiver _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspect._privk3_push(_self_, (org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"BluetoothTransceiver","push");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.ArduinoCommunicationModule){
    					org.gemoc.arduino.sequential.arduino.aspects.ArduinoCommunicationModule_PushAspect.push((org.gemoc.arduino.sequential.arduino.arduino.ArduinoCommunicationModule)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static EList<Integer> dataToSend(final BluetoothTransceiver _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_dataToSend(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<java.lang.Integer>)result;
  }
  
  public static void dataToSend(final BluetoothTransceiver _self, final EList<Integer> dataToSend) {
    final org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    _privk3_dataToSend(_self_, _self,dataToSend);;
  }
  
  public static EList<Integer> dataReceived(final BluetoothTransceiver _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_dataReceived(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<java.lang.Integer>)result;
  }
  
  public static void dataReceived(final BluetoothTransceiver _self, final EList<Integer> dataReceived) {
    final org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspectBluetoothTransceiverAspectContext.getSelf(_self);
    _privk3_dataReceived(_self_, _self,dataReceived);;
  }
  
  protected static void _privk3_push(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    EList<BluetoothTransceiver> _connectedTransceiver = _self.getConnectedTransceiver();
    final Consumer<BluetoothTransceiver> _function = (BluetoothTransceiver t) -> {
      final EList<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(t);
      EList<Integer> _dataToSend = BluetoothTransceiver_PushAspect.dataToSend(_self);
      final Consumer<Integer> _function_1 = (Integer i) -> {
        l.add(i);
      };
      _dataToSend.forEach(_function_1);
    };
    _connectedTransceiver.forEach(_function);
    EList<Integer> _dataToSend = BluetoothTransceiver_PushAspect.dataToSend(_self);
    _dataToSend.clear();
  }
  
  protected static EList<Integer> _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataToSend") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataToSend;
  }
  
  protected static void _privk3_dataToSend(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final EList<Integer> dataToSend) {
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
  
  protected static EList<Integer> _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDataReceived") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.dataReceived;
  }
  
  protected static void _privk3_dataReceived(final BluetoothTransceiver_PushAspectBluetoothTransceiverAspectProperties _self_, final BluetoothTransceiver _self, final EList<Integer> dataReceived) {
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

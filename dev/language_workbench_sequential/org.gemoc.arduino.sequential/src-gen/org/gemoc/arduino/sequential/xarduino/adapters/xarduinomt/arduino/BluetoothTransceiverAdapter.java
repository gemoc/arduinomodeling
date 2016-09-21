package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver;

@SuppressWarnings("all")
public class BluetoothTransceiverAdapter extends EObjectAdapter<BluetoothTransceiver> implements org.gemoc.arduino.sequential.xarduinomt.arduino.BluetoothTransceiver {
  private org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory adaptersFactory;
  
  public BluetoothTransceiverAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<org.gemoc.arduino.sequential.xarduinomt.arduino.BluetoothTransceiver> connectedTransceiver_;
  
  @Override
  public EList<org.gemoc.arduino.sequential.xarduinomt.arduino.BluetoothTransceiver> getConnectedTransceiver() {
    if (connectedTransceiver_ == null)
    	connectedTransceiver_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnectedTransceiver(), adaptersFactory, eResource);
    return connectedTransceiver_;
  }
  
  @Override
  public EList<Integer> getDataReceived() {
    return org.gemoc.arduino.sequential.xarduino.aspects.BluetoothTransceiver_PushAspect.dataReceived(adaptee);
  }
  
  @Override
  public EList<Integer> getDataToSend() {
    return org.gemoc.arduino.sequential.xarduino.aspects.BluetoothTransceiver_PushAspect.dataToSend(adaptee);
  }
  
  @Override
  public void push() {
    org.gemoc.arduino.sequential.xarduino.aspects.BluetoothTransceiver_PushAspect.push(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getBluetoothTransceiver();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
    		return getConnectedTransceiver();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
    		return getDataToSend();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
    		return getDataReceived();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
    		return getConnectedTransceiver() != null && !getConnectedTransceiver().isEmpty();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
    		return getDataToSend() != null && !getDataToSend().isEmpty();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
    		return getDataReceived() != null && !getDataReceived().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
    		getConnectedTransceiver().clear();
    		getConnectedTransceiver().addAll((Collection) newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
    		getDataToSend().clear();
    		getDataToSend().addAll((Collection) newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
    		getDataReceived().clear();
    		getDataReceived().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoDigitalModule;

@SuppressWarnings("all")
public class ArduinoDigitalModuleAdapter extends EObjectAdapter<ArduinoDigitalModule> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoDigitalModule {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public ArduinoDigitalModuleAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getArduinoDigitalModule();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		setName(NAME_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.ARDUINO_DIGITAL_MODULE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

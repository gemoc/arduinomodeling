package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.DigitalPin;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.ArduinoDigitalModule;

@SuppressWarnings("all")
public class DigitalPinAdapter extends EObjectAdapter<DigitalPin> implements org.gemoc.arduino.arduinomt.arduino.DigitalPin {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public DigitalPinAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public int getId() {
    return adaptee.getId() ;
  }
  
  @Override
  public void setId(final int o) {
    adaptee.setId(o) ;
  }
  
  @Override
  public ArduinoDigitalModule getModule() {
    return (ArduinoDigitalModule) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final ArduinoDigitalModule o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoDigitalModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  protected final static int ID_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getDigitalPin();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__ID:
    		return new java.lang.Integer(getId());
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__ID:
    		setId(ID_EDEFAULT);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.ArduinoDigitalModule) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__ID:
    		setId(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.ArduinoDigitalModule) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

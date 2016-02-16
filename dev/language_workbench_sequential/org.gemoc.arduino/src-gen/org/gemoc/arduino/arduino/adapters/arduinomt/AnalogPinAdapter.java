package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.AnalogPin;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.ArduinoAnalogModule;

@SuppressWarnings("all")
public class AnalogPinAdapter extends EObjectAdapter<AnalogPin> implements org.gemoc.arduino.arduinomt.arduino.AnalogPin {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public AnalogPinAdapter() {
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
  
  private ArduinoAnalogModule module;
  
  @Override
  public ArduinoAnalogModule getModule() {
    return (ArduinoAnalogModule) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final ArduinoAnalogModule o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoAnalogModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getAnalogPin();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ANALOG_PIN__ID:
    		return getId();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ANALOG_PIN__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ANALOG_PIN__ID:
    		setId((int) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ANALOG_PIN__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.ArduinoAnalogModule) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ANALOG_PIN__ID:
    		setId((Integer) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ANALOG_PIN__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.ArduinoAnalogModule) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

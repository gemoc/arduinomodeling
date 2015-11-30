package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Connector;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Module;
import org.gemoc.arduino.melange.arduinomt.arduino.Pin;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements org.gemoc.arduino.melange.arduinomt.arduino.Connector {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Pin pin;
  
  @Override
  public Pin getPin() {
    return (Pin) adaptersFactory.createAdapter(adaptee.getPin(), eResource) ;
  }
  
  @Override
  public void setPin(final Pin o) {
    if (o != null)
    	adaptee.setPin(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.PinAdapter) o).getAdaptee()) ;
    else adaptee.setPin(null) ;
  }
  
  private Module module;
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.CONNECTOR__PIN:
    		return getPin();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.CONNECTOR__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.CONNECTOR__PIN:
    		setPin((Pin) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.CONNECTOR__MODULE:
    		setModule((Module) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.CONNECTOR__PIN:
    		setPin((Pin) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.CONNECTOR__MODULE:
    		setModule((Module) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

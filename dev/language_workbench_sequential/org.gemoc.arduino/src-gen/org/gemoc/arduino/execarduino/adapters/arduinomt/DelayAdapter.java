package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Time;
import org.gemoc.arduino.execarduino.arduino.Delay;

@SuppressWarnings("all")
public class DelayAdapter extends EObjectAdapter<Delay> implements org.gemoc.arduino.arduinomt.arduino.Delay {
  private org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public DelayAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Time getUnit() {
    return org.gemoc.arduino.arduinomt.arduino.Time.get(adaptee.getUnit().getValue());
  }
  
  @Override
  public void setUnit(final Time o) {
    adaptee.setUnit(org.gemoc.arduino.execarduino.arduino.Time.get(o.getValue())) ;
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue() ;
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getDelay();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DELAY__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DELAY__UNIT:
    		setUnit((org.gemoc.arduino.arduinomt.arduino.Time) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DELAY__VALUE:
    		setValue((int) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DELAY__UNIT:
    		setUnit((org.gemoc.arduino.arduinomt.arduino.Time) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.DELAY__VALUE:
    		setValue((Integer) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

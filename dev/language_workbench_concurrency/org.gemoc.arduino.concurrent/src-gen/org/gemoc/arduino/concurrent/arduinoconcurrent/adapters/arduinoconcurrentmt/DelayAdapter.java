package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Time;
import org.gemoc.arduino.concurrent.execarduino.arduino.Delay;

@SuppressWarnings("all")
public class DelayAdapter extends EObjectAdapter<Delay> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Delay {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public DelayAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Time getUnit() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Time.get(adaptee.getUnit().getValue());
  }
  
  @Override
  public void setUnit(final Time o) {
    adaptee.setUnit(org.gemoc.arduino.concurrent.execarduino.arduino.Time.get(o.getValue())) ;
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
  public void execute() {
    org.gemoc.arduino.concurrent.operationalsemantics.Delay_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.concurrent.operationalsemantics.Instruction_ExecutableAspect.finalize(adaptee) ;
  }
  
  protected final static Time UNIT_EDEFAULT = org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Time.MILLI_SECOND;
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getDelay();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit();
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__UNIT:
    		setUnit(UNIT_EDEFAULT);
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__VALUE:
    		setValue(VALUE_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit() != UNIT_EDEFAULT;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__UNIT:
    		setUnit((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Time) newValue);
    		return;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.DELAY__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

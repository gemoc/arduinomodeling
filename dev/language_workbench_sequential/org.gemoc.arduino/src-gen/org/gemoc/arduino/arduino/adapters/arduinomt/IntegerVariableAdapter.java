package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.IntegerVariable;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntegerVariableAdapter extends EObjectAdapter<IntegerVariable> implements org.gemoc.arduino.arduinomt.arduino.IntegerVariable {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public int getInitialValue() {
    return adaptee.getInitialValue() ;
  }
  
  @Override
  public void setInitialValue(final int o) {
    adaptee.setInitialValue(o) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int INITIAL_VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return new java.lang.Integer(getInitialValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		setName(NAME_EDEFAULT);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(INITIAL_VALUE_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

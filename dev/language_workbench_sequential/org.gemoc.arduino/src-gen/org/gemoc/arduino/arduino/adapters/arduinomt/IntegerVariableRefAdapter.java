package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.IntegerVariableRef;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariableRefAdapter extends EObjectAdapter<IntegerVariableRef> implements org.gemoc.arduino.arduinomt.arduino.IntegerVariableRef {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableRefAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public IntegerVariable getVariable() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource) ;
  }
  
  @Override
  public void setVariable(final IntegerVariable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.arduino.adapters.arduinomt.IntegerVariableAdapter) o).getAdaptee()) ;
    else adaptee.setVariable(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariableRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.IntegerVariable) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.IntegerVariable) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

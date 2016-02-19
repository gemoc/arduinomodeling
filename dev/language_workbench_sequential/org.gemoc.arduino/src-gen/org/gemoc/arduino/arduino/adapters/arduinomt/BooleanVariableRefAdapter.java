package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.BooleanVariableRef;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableRefAdapter extends EObjectAdapter<BooleanVariableRef> implements org.gemoc.arduino.arduinomt.arduino.BooleanVariableRef {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BooleanVariableRefAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public BooleanVariable getVariable() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource) ;
  }
  
  @Override
  public void setVariable(final BooleanVariable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.arduino.adapters.arduinomt.BooleanVariableAdapter) o).getAdaptee()) ;
    else adaptee.setVariable(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBooleanVariableRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.BooleanVariable) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.BooleanVariable) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

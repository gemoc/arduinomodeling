package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.VariableDeclaration;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Variable;

@SuppressWarnings("all")
public class VariableDeclarationAdapter extends EObjectAdapter<VariableDeclaration> implements org.gemoc.arduino.arduinomt.arduino.VariableDeclaration {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public VariableDeclarationAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource) ;
  }
  
  @Override
  public void setVariable(final Variable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.arduino.adapters.arduinomt.VariableAdapter) o).getAdaptee()) ;
    else adaptee.setVariable(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getVariableDeclaration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.Variable) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		setVariable((org.gemoc.arduino.arduinomt.arduino.Variable) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

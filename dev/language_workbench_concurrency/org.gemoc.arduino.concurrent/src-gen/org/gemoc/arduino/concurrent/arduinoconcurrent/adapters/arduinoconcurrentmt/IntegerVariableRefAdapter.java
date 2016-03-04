package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariableRef;

@SuppressWarnings("all")
public class IntegerVariableRefAdapter extends EObjectAdapter<IntegerVariableRef> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerVariableRef {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableRefAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public IntegerVariable getVariable() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource) ;
  }
  
  @Override
  public void setVariable(final IntegerVariable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableAdapter) o).getAdaptee()) ;
    else adaptee.setVariable(null) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.concurrent.operationalsemantics.VariableRef_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariableRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		setVariable((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerVariable) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		setVariable((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerVariable) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

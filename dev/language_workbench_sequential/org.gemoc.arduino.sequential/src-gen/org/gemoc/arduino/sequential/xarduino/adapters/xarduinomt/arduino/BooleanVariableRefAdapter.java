package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.sequential.xarduinomt.arduino.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableRefAdapter extends EObjectAdapter<BooleanVariableRef> implements org.gemoc.arduino.sequential.xarduinomt.arduino.BooleanVariableRef {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public BooleanVariableRefAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public BooleanVariable getVariable() {
    return (BooleanVariable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }

  @Override
  public void setVariable(final BooleanVariable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }

  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.VariableRef_EvaluableAspect.evaluate(adaptee);
  }

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getBooleanVariableRef();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE_REF__VARIABLE:
    		setVariable(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.BooleanVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

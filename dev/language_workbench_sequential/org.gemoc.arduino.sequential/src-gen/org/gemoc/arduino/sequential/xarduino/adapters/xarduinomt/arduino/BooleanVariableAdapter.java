package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableAdapter extends EObjectAdapter<BooleanVariable> implements org.gemoc.arduino.sequential.xarduinomt.arduino.BooleanVariable {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public BooleanVariableAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public String getName() {
    return adaptee.getName();
  }

  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }

  @Override
  public boolean isInitialValue() {
    return adaptee.isInitialValue();
  }

  @Override
  public void setInitialValue(final boolean o) {
    adaptee.setInitialValue(o);
  }

  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.BooleanVariable_EvaluableAspect.evaluate(adaptee);
  }

  @Override
  public Boolean getValue() {
    return org.gemoc.arduino.sequential.xarduino.aspects.BooleanVariable_EvaluableAspect.value(adaptee);
  }

  @Override
  public void setValue(final Boolean value) {
    org.gemoc.arduino.sequential.xarduino.aspects.BooleanVariable_EvaluableAspect.value(adaptee, value
    );
  }

  protected static final String NAME_EDEFAULT = null;

  protected static final boolean INITIAL_VALUE_EDEFAULT = false;

  protected static final Boolean VALUE_EDEFAULT = null;

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getBooleanVariable();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

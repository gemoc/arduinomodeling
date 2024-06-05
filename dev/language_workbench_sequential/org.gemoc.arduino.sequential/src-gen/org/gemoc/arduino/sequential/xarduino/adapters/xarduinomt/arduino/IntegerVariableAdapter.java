package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariableAdapter extends EObjectAdapter<IntegerVariable> implements org.gemoc.arduino.sequential.xarduinomt.arduino.IntegerVariable {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public IntegerVariableAdapter() {
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
  public int getInitialValue() {
    return adaptee.getInitialValue();
  }

  @Override
  public void setInitialValue(final int o) {
    adaptee.setInitialValue(o);
  }

  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.IntegerVariable_EvaluableAspect.evaluate(adaptee);
  }

  @Override
  public Integer getValue() {
    return org.gemoc.arduino.sequential.xarduino.aspects.IntegerVariable_EvaluableAspect.value(adaptee);
  }

  @Override
  public void setValue(final Integer value) {
    org.gemoc.arduino.sequential.xarduino.aspects.IntegerVariable_EvaluableAspect.value(adaptee, value
    );
  }

  protected static final String NAME_EDEFAULT = null;

  protected static final int INITIAL_VALUE_EDEFAULT = 0;

  protected static final Integer VALUE_EDEFAULT = null;

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariable();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return new java.lang.Integer(getInitialValue());
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Integer)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

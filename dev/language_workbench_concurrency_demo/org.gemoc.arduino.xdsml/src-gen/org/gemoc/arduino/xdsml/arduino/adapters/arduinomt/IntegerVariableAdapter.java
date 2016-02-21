package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.IntegerVariable;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntegerVariableAdapter extends EObjectAdapter<IntegerVariable> implements org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
  
  @Override
  public Integer getValue() {
    return adaptee.getValue() ;
  }
  
  @Override
  public void setValue(final Integer o) {
    adaptee.setValue(o) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.IntegerVariable_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue((int) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		setValue((Integer) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue((Integer) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		setValue((Integer) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.BooleanConstant;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;

@SuppressWarnings("all")
public class BooleanConstantAdapter extends EObjectAdapter<BooleanConstant> implements org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public BooleanConstantAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public boolean isValue() {
    return adaptee.isValue() ;
  }
  
  @Override
  public void setValue(final boolean o) {
    adaptee.setValue(o) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.BooleanConstant_ExecutableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBooleanConstant();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BOOLEAN_CONSTANT__VALUE:
    		return isValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BOOLEAN_CONSTANT__VALUE:
    		setValue((boolean) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BOOLEAN_CONSTANT__VALUE:
    		setValue((Boolean) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

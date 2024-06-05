package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant;

@SuppressWarnings("all")
public class BooleanConstantAdapter extends EObjectAdapter<BooleanConstant> implements org.gemoc.arduino.sequential.xarduinomt.arduino.BooleanConstant {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public BooleanConstantAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public boolean isValue() {
    return adaptee.isValue();
  }

  @Override
  public void setValue(final boolean o) {
    adaptee.setValue(o);
  }

  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.BooleanConstant_ExecutableAspect.evaluate(adaptee);
  }

  protected static final boolean VALUE_EDEFAULT = false;

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getBooleanConstant();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_CONSTANT__VALUE:
    		return isValue() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_CONSTANT__VALUE:
    		return isValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_CONSTANT__VALUE:
    		setValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

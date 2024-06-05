package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.AnalogPin;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoAnalogModule;

@SuppressWarnings("all")
public class AnalogPinAdapter extends EObjectAdapter<AnalogPin> implements org.gemoc.arduino.sequential.xarduinomt.arduino.AnalogPin {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public AnalogPinAdapter() {
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
  public ArduinoAnalogModule getModule() {
    return (ArduinoAnalogModule) adaptersFactory.createAdapter(adaptee.getModule(), eResource);
  }

  @Override
  public void setModule(final ArduinoAnalogModule o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoAnalogModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
  }

  @Override
  public Integer getLevel() {
    return org.gemoc.arduino.sequential.xarduino.aspects.Pin_EvaluableAspect.level(adaptee);
  }

  @Override
  public void setLevel(final Integer level) {
    org.gemoc.arduino.sequential.xarduino.aspects.Pin_EvaluableAspect.level(adaptee, level
    );
  }

  protected static final String NAME_EDEFAULT = null;

  protected static final Integer LEVEL_EDEFAULT = null;

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getAnalogPin();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__LEVEL:
    		return getLevel();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__LEVEL:
    		return getLevel() != LEVEL_EDEFAULT;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__LEVEL:
    		setLevel(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ANALOG_PIN__MODULE:
    		setModule(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoAnalogModule)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet;

@SuppressWarnings("all")
public class BooleanModuleGetAdapter extends EObjectAdapter<BooleanModuleGet> implements org.gemoc.arduino.sequential.xarduinomt.arduino.BooleanModuleGet {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public BooleanModuleGetAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public org.gemoc.arduino.sequential.xarduinomt.arduino.Module getModule() {
    return (org.gemoc.arduino.sequential.xarduinomt.arduino.Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource);
  }

  @Override
  public void setModule(final org.gemoc.arduino.sequential.xarduinomt.arduino.Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
  }

  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.BooleanModuleGet_ExecutableAspect.evaluate(adaptee);
  }

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getBooleanModuleGet();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_MODULE_GET__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_MODULE_GET__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.BOOLEAN_MODULE_GET__MODULE:
    		setModule(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Module)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

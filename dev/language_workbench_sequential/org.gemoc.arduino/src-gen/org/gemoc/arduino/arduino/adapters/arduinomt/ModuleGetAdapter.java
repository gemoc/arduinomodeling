package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ModuleGet;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Module;

@SuppressWarnings("all")
public class ModuleGetAdapter extends EObjectAdapter<ModuleGet> implements org.gemoc.arduino.arduinomt.arduino.ModuleGet {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ModuleGetAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getModuleGet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.Module) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.Module) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

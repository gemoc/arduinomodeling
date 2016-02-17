package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.IntegerModuleGet;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Module;

@SuppressWarnings("all")
public class IntegerModuleGetAdapter extends EObjectAdapter<IntegerModuleGet> implements org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public IntegerModuleGetAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Module module;
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.IntegerModuleGet_ExecutableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIntegerModuleGet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_MODULE_GET__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_MODULE_GET__MODULE:
    		setModule((Module) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INTEGER_MODULE_GET__MODULE:
    		setModule((Module) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

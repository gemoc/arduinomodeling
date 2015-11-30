package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Actuator;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Library;
import org.gemoc.arduino.melange.arduinomt.arduino.ModuleKind;

@SuppressWarnings("all")
public class ActuatorAdapter extends EObjectAdapter<Actuator> implements org.gemoc.arduino.melange.arduinomt.arduino.Actuator {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ActuatorAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
  public ModuleKind getKind() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ModuleKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final ModuleKind o) {
    adaptee.setKind(fr.obeo.dsl.arduino.ModuleKind.get(o.getValue())) ;
  }
  
  @Override
  public String getImage() {
    return adaptee.getImage() ;
  }
  
  @Override
  public void setImage(final String o) {
    adaptee.setImage(o) ;
  }
  
  @Override
  public boolean isLevel() {
    return adaptee.isLevel() ;
  }
  
  @Override
  public void setLevel(final boolean o) {
    adaptee.setLevel(o) ;
  }
  
  @Override
  public Library getLibrary() {
    return org.gemoc.arduino.melange.arduinomt.arduino.Library.get(adaptee.getLibrary().getValue());
  }
  
  @Override
  public void setLibrary(final Library o) {
    adaptee.setLibrary(fr.obeo.dsl.arduino.Library.get(o.getValue())) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getActuator();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__NAME:
    		return getName();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__KIND:
    		return getKind();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__IMAGE:
    		return getImage();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__LEVEL:
    		return isLevel();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__LIBRARY:
    		return getLibrary();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__KIND:
    		setKind((ModuleKind) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__IMAGE:
    		setImage((String) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__LEVEL:
    		setLevel((boolean) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__LIBRARY:
    		setLibrary((Library) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__KIND:
    		setKind((ModuleKind) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__IMAGE:
    		setImage((String) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__LEVEL:
    		setLevel((Boolean) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.ACTUATOR__LIBRARY:
    		setLibrary((Library) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

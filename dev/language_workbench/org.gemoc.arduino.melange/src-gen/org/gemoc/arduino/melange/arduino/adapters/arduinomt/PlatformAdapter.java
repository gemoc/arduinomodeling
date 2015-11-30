package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Platform;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin;

@SuppressWarnings("all")
public class PlatformAdapter extends EObjectAdapter<Platform> implements org.gemoc.arduino.melange.arduinomt.arduino.Platform {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public PlatformAdapter() {
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
  public String getImage() {
    return adaptee.getImage() ;
  }
  
  @Override
  public void setImage(final String o) {
    adaptee.setImage(o) ;
  }
  
  private EList<DigitalPin> digitalPins;
  
  @Override
  public EList<DigitalPin> getDigitalPins() {
    if (digitalPins == null)
    	digitalPins = EListAdapter.newInstance(adaptee.getDigitalPins(), adaptersFactory) ;
    return digitalPins;
  }
  
  private EList<AnalogPin> analogPins;
  
  @Override
  public EList<AnalogPin> getAnalogPins() {
    if (analogPins == null)
    	analogPins = EListAdapter.newInstance(adaptee.getAnalogPins(), adaptersFactory) ;
    return analogPins;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getPlatform();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__NAME:
    		return getName();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__DIGITAL_PINS:
    		return getDigitalPins();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__ANALOG_PINS:
    		return getAnalogPins();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__IMAGE:
    		return getImage();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__DIGITAL_PINS:
    		getDigitalPins().clear();
    		getDigitalPins().addAll((Collection<? extends DigitalPin>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__ANALOG_PINS:
    		getAnalogPins().clear();
    		getAnalogPins().addAll((Collection<? extends AnalogPin>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__IMAGE:
    		setImage((String) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__DIGITAL_PINS:
    		getDigitalPins().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__ANALOG_PINS:
    		getAnalogPins().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PLATFORM__IMAGE:
    		setImage((String) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

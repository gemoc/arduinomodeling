package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ArduinoBoard;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.arduinomt.arduino.DigitalPin;
import org.gemoc.arduino.arduinomt.arduino.Project;

@SuppressWarnings("all")
public class ArduinoBoardAdapter extends EObjectAdapter<ArduinoBoard> implements org.gemoc.arduino.arduinomt.arduino.ArduinoBoard {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ArduinoBoardAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
  public Project getProject() {
    return (Project) adaptersFactory.createAdapter(adaptee.getProject(), eResource) ;
  }
  
  @Override
  public void setProject(final Project o) {
    if (o != null)
    	adaptee.setProject(((org.gemoc.arduino.arduino.adapters.arduinomt.ProjectAdapter) o).getAdaptee()) ;
    else adaptee.setProject(null) ;
  }
  
  private EList<DigitalPin> digitalPins;
  
  @Override
  public EList<DigitalPin> getDigitalPins() {
    if (digitalPins == null)
    	digitalPins = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDigitalPins(), adaptersFactory) ;
    return digitalPins;
  }
  
  private EList<AnalogPin> analogPins;
  
  @Override
  public EList<AnalogPin> getAnalogPins() {
    if (analogPins == null)
    	analogPins = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnalogPins(), adaptersFactory) ;
    return analogPins;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getArduinoBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		setName(NAME_EDEFAULT);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		setProject((org.gemoc.arduino.arduinomt.arduino.Project) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins() != null && !getDigitalPins().isEmpty();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins() != null && !getAnalogPins().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		setProject((org.gemoc.arduino.arduinomt.arduino.Project) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    		getDigitalPins().addAll((Collection) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    		getAnalogPins().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

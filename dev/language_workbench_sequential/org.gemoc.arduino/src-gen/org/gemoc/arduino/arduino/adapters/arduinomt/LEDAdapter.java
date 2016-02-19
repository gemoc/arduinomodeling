package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.LED;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Color;

@SuppressWarnings("all")
public class LEDAdapter extends EObjectAdapter<LED> implements org.gemoc.arduino.arduinomt.arduino.LED {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public LEDAdapter() {
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
  public boolean isLevel() {
    return adaptee.isLevel() ;
  }
  
  @Override
  public void setLevel(final boolean o) {
    adaptee.setLevel(o) ;
  }
  
  @Override
  public Color getColor() {
    return org.gemoc.arduino.arduinomt.arduino.Color.get(adaptee.getColor().getValue());
  }
  
  @Override
  public void setColor(final Color o) {
    adaptee.setColor(fr.obeo.dsl.arduino.Color.get(o.getValue())) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean LEVEL_EDEFAULT = false;
  
  protected final static Color COLOR_EDEFAULT = org.gemoc.arduino.arduinomt.arduino.Color.BLUE;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getLED();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		return getName();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__LEVEL:
    		return isLevel() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		return getColor();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		setName(NAME_EDEFAULT);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__LEVEL:
    		setLevel(LEVEL_EDEFAULT);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		setColor(COLOR_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__LEVEL:
    		return isLevel() != LEVEL_EDEFAULT;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		return getColor() != COLOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__LEVEL:
    		setLevel(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		setColor((org.gemoc.arduino.arduinomt.arduino.Color) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

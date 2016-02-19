package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Repeat;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Block;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements org.gemoc.arduino.arduinomt.arduino.Repeat {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public RepeatAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public int getIteration() {
    return adaptee.getIteration() ;
  }
  
  @Override
  public void setIteration(final int o) {
    adaptee.setIteration(o) ;
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource) ;
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.arduino.adapters.arduinomt.BlockAdapter) o).getAdaptee()) ;
    else adaptee.setBlock(null) ;
  }
  
  protected final static int ITERATION_EDEFAULT = 5;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getRepeat();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return new java.lang.Integer(getIteration());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration(ITERATION_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return getIteration() != ITERATION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

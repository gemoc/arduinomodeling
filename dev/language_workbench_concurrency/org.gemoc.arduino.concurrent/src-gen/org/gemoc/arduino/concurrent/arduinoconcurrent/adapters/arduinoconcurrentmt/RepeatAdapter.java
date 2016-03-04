package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Block;
import org.gemoc.arduino.concurrent.execarduino.arduino.Repeat;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Repeat {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public RepeatAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
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
    	adaptee.setBlock(((org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BlockAdapter) o).getAdaptee()) ;
    else adaptee.setBlock(null) ;
  }
  
  @Override
  public Boolean evaluate() {
    return org.gemoc.arduino.concurrent.operationalsemantics.Repeat_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.concurrent.operationalsemantics.Repeat_EvaluableAspect.finalize(adaptee) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.concurrent.operationalsemantics.Control_ExecutableAspect.execute(adaptee) ;
  }
  
  protected final static int ITERATION_EDEFAULT = 5;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getRepeat();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return new java.lang.Integer(getIteration());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Block) null);
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration(ITERATION_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return getIteration() != ITERATION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Block) newValue);
    		return;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

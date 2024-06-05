package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.Repeat;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Block;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements org.gemoc.arduino.sequential.xarduinomt.arduino.Repeat {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public RepeatAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public int getIteration() {
    return adaptee.getIteration();
  }

  @Override
  public void setIteration(final int o) {
    adaptee.setIteration(o);
  }

  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }

  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }

  @Override
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.Repeat_ExecutableAspect.execute(adaptee);
  }

  @Override
  public Boolean evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect.evaluate(adaptee);
  }

  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.xarduino.aspects.Repeat_EvaluableAspect.finalize(adaptee);
  }

  protected static final int ITERATION_EDEFAULT = 5;

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getRepeat();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return new java.lang.Integer(getIteration());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return getIteration() != ITERATION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Block)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

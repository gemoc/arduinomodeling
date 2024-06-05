package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Block;

@SuppressWarnings("all")
public class ControlAdapter extends EObjectAdapter<Control> implements org.gemoc.arduino.sequential.xarduinomt.arduino.Control {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public ControlAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
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
  public Boolean evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.Control_EvaluableAspect.evaluate(adaptee);
  }

  @Override
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.Control_ExecutableAspect.execute(adaptee);
  }

  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getControl();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.CONTROL__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.CONTROL__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.CONTROL__BLOCK:
    		setBlock(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

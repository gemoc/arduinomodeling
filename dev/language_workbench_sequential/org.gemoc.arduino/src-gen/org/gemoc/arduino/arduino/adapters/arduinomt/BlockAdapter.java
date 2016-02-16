package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Block;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Instruction;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements org.gemoc.arduino.arduinomt.arduino.Block {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private EList<Instruction> instructions;
  
  @Override
  public EList<Instruction> getInstructions() {
    if (instructions == null)
    	instructions = EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory) ;
    return instructions;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection<? extends org.gemoc.arduino.arduinomt.arduino.Instruction>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}

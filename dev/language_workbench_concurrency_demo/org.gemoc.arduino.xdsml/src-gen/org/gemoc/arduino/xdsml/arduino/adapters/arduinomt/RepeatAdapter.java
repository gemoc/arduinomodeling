package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Repeat;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public RepeatAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
  public int getIteration() {
    return adaptee.getIteration() ;
  }
  
  @Override
  public void setIteration(final int o) {
    adaptee.setIteration(o) ;
  }
  
  private InstructionBlock ownedBlock;
  
  @Override
  public InstructionBlock getOwnedBlock() {
    return (InstructionBlock) adaptersFactory.createAdapter(adaptee.getOwnedBlock(), eResource) ;
  }
  
  @Override
  public void setOwnedBlock(final InstructionBlock o) {
    if (o != null)
    	adaptee.setOwnedBlock(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.InstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setOwnedBlock(null) ;
  }
  
  private InstructionBlock block;
  
  @Override
  public InstructionBlock getBlock() {
    return (InstructionBlock) adaptersFactory.createAdapter(adaptee.getBlock(), eResource) ;
  }
  
  @Override
  public void setBlock(final InstructionBlock o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.InstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setBlock(null) ;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public Boolean evaluate() {
    return org.gemoc.arduino.operationalsemantics.Repeat_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.operationalsemantics.Repeat_EvaluableAspect.finalize(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getRepeat();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__OWNED_BLOCK:
    		return getOwnedBlock();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return getIteration();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock((InstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration((int) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__BLOCK:
    		setBlock((InstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration((Integer) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ThreadInstructionBlock;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;

@SuppressWarnings("all")
public class ThreadInstructionBlockAdapter extends EObjectAdapter<ThreadInstructionBlock> implements org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ThreadInstructionBlockAdapter() {
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
  
  private org.gemoc.arduino.xdsml.arduinomt.arduino.Thread thread;
  
  @Override
  public org.gemoc.arduino.xdsml.arduinomt.arduino.Thread getThread() {
    return (org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) adaptersFactory.createAdapter(adaptee.getThread(), eResource) ;
  }
  
  @Override
  public void setThread(final org.gemoc.arduino.xdsml.arduinomt.arduino.Thread o) {
    if (o != null)
    	adaptee.setThread(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ThreadAdapter) o).getAdaptee()) ;
    else adaptee.setThread(null) ;
  }
  
  private org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock next;
  
  @Override
  public org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock getNext() {
    return (org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock) adaptersFactory.createAdapter(adaptee.getNext(), eResource) ;
  }
  
  @Override
  public void setNext(final org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock o) {
    if (o != null)
    	adaptee.setNext(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ThreadInstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setNext(null) ;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getThreadInstructionBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
    		return getThread();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
    		return getNext();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
    		setThread((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
    		setNext((org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
    		setThread((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
    		setNext((org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

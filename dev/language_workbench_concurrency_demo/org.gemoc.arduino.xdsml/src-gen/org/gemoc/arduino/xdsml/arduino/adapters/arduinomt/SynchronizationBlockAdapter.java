package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.SynchronizationBlock;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;

@SuppressWarnings("all")
public class SynchronizationBlockAdapter extends EObjectAdapter<SynchronizationBlock> implements org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public SynchronizationBlockAdapter() {
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
  
  private InstructionBlock next;
  
  @Override
  public InstructionBlock getNext() {
    return (InstructionBlock) adaptersFactory.createAdapter(adaptee.getNext(), eResource) ;
  }
  
  @Override
  public void setNext(final InstructionBlock o) {
    if (o != null)
    	adaptee.setNext(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.InstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setNext(null) ;
  }
  
  private InstructionBlock previous;
  
  @Override
  public InstructionBlock getPrevious() {
    return (InstructionBlock) adaptersFactory.createAdapter(adaptee.getPrevious(), eResource) ;
  }
  
  @Override
  public void setPrevious(final InstructionBlock o) {
    if (o != null)
    	adaptee.setPrevious(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.InstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setPrevious(null) ;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getSynchronizationBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__THREAD:
    		return getThread();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__NEXT:
    		return getNext();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__PREVIOUS:
    		return getPrevious();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__THREAD:
    		setThread((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__NEXT:
    		setNext((InstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__PREVIOUS:
    		setPrevious((InstructionBlock) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__THREAD:
    		setThread((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__NEXT:
    		setNext((InstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SYNCHRONIZATION_BLOCK__PREVIOUS:
    		setPrevious((InstructionBlock) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

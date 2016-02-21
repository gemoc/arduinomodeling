package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.InstructionBlock;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction;
import org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock;

@SuppressWarnings("all")
public class InstructionBlockAdapter extends EObjectAdapter<InstructionBlock> implements org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public InstructionBlockAdapter() {
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
  
  private EList<Instruction> instructions;
  
  @Override
  public EList<Instruction> getInstructions() {
    if (instructions == null)
    	instructions = EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory) ;
    return instructions;
  }
  
  private SynchronizationBlock next;
  
  @Override
  public SynchronizationBlock getNext() {
    return (SynchronizationBlock) adaptersFactory.createAdapter(adaptee.getNext(), eResource) ;
  }
  
  @Override
  public void setNext(final SynchronizationBlock o) {
    if (o != null)
    	adaptee.setNext(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.SynchronizationBlockAdapter) o).getAdaptee()) ;
    else adaptee.setNext(null) ;
  }
  
  private SynchronizationBlock previous;
  
  @Override
  public SynchronizationBlock getPrevious() {
    return (SynchronizationBlock) adaptersFactory.createAdapter(adaptee.getPrevious(), eResource) ;
  }
  
  @Override
  public void setPrevious(final SynchronizationBlock o) {
    if (o != null)
    	adaptee.setPrevious(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.SynchronizationBlockAdapter) o).getAdaptee()) ;
    else adaptee.setPrevious(null) ;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getInstructionBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__THREAD:
    		return getThread();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
    		return getInstructions();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
    		return getNext();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
    		return getPrevious();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__THREAD:
    		setThread((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection<? extends Instruction>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
    		setNext((SynchronizationBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
    		setPrevious((SynchronizationBlock) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__THREAD:
    		setThread((org.gemoc.arduino.xdsml.arduinomt.arduino.Thread) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
    		setNext((SynchronizationBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
    		setPrevious((SynchronizationBlock) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

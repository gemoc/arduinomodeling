package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Channel;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock;

@SuppressWarnings("all")
public class ThreadAdapter extends EObjectAdapter<fr.obeo.dsl.arduino.Thread> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Thread {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ThreadAdapter() {
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
  public int getCycles() {
    return adaptee.getCycles() ;
  }
  
  @Override
  public void setCycles(final int o) {
    adaptee.setCycles(o) ;
  }
  
  private EList<ThreadInstructionBlock> blocks;
  
  @Override
  public EList<ThreadInstructionBlock> getBlocks() {
    if (blocks == null)
    	blocks = EListAdapter.newInstance(adaptee.getBlocks(), adaptersFactory) ;
    return blocks;
  }
  
  private EList<Channel> channels;
  
  @Override
  public EList<Channel> getChannels() {
    if (channels == null)
    	channels = EListAdapter.newInstance(adaptee.getChannels(), adaptersFactory) ;
    return channels;
  }
  
  private Instruction currentInstruction;
  
  @Override
  public Instruction getCurrentInstruction() {
    return (Instruction) adaptersFactory.createAdapter(adaptee.getCurrentInstruction(), eResource) ;
  }
  
  @Override
  public void setCurrentInstruction(final Instruction o) {
    if (o != null)
    	adaptee.setCurrentInstruction(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setCurrentInstruction(null) ;
  }
  
  private ThreadInstructionBlock first;
  
  @Override
  public ThreadInstructionBlock getFirst() {
    return (ThreadInstructionBlock) adaptersFactory.createAdapter(adaptee.getFirst(), eResource) ;
  }
  
  @Override
  public void setFirst(final ThreadInstructionBlock o) {
    if (o != null)
    	adaptee.setFirst(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ThreadInstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setFirst(null) ;
  }
  
  private ThreadInstructionBlock last;
  
  @Override
  public ThreadInstructionBlock getLast() {
    return (ThreadInstructionBlock) adaptersFactory.createAdapter(adaptee.getLast(), eResource) ;
  }
  
  @Override
  public void setLast(final ThreadInstructionBlock o) {
    if (o != null)
    	adaptee.setLast(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ThreadInstructionBlockAdapter) o).getAdaptee()) ;
    else adaptee.setLast(null) ;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public void fire() {
    org.gemoc.arduino.operationalsemantics.Thread_ExecutableAspect.fire(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getThread();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__BLOCKS:
    		return getBlocks();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CHANNELS:
    		return getChannels();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CYCLES:
    		return getCycles();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
    		return getCurrentInstruction();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__FIRST:
    		return getFirst();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__LAST:
    		return getLast();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__BLOCKS:
    		getBlocks().clear();
    		getBlocks().addAll((Collection<? extends ThreadInstructionBlock>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CHANNELS:
    		getChannels().clear();
    		getChannels().addAll((Collection<? extends Channel>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CYCLES:
    		setCycles((int) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
    		setCurrentInstruction((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__FIRST:
    		setFirst((ThreadInstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__LAST:
    		setLast((ThreadInstructionBlock) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__BLOCKS:
    		getBlocks().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CHANNELS:
    		getChannels().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CYCLES:
    		setCycles((Integer) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
    		setCurrentInstruction((Instruction) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__FIRST:
    		setFirst((ThreadInstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.THREAD__LAST:
    		setLast((ThreadInstructionBlock) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

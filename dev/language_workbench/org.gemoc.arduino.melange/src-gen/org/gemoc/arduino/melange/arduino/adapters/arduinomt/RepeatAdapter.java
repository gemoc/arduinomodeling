package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Repeat;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Instruction;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements org.gemoc.arduino.melange.arduinomt.arduino.Repeat {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public RepeatAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public int getIteration() {
    return adaptee.getIteration() ;
  }
  
  @Override
  public void setIteration(final int o) {
    adaptee.setIteration(o) ;
  }
  
  private Instruction previous;
  
  @Override
  public Instruction getPrevious() {
    return (Instruction) adaptersFactory.createAdapter(adaptee.getPrevious(), eResource) ;
  }
  
  @Override
  public void setPrevious(final Instruction o) {
    if (o != null)
    	adaptee.setPrevious(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setPrevious(null) ;
  }
  
  private Instruction next;
  
  @Override
  public Instruction getNext() {
    return (Instruction) adaptersFactory.createAdapter(adaptee.getNext(), eResource) ;
  }
  
  @Override
  public void setNext(final Instruction o) {
    if (o != null)
    	adaptee.setNext(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setNext(null) ;
  }
  
  private EList<Instruction> instructions;
  
  @Override
  public EList<Instruction> getInstructions() {
    if (instructions == null)
    	instructions = EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory) ;
    return instructions;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Repeat_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getRepeat();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__PREVIOUS:
    		return getPrevious();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__NEXT:
    		return getNext();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__INSTRUCTIONS:
    		return getInstructions();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		return getIteration();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__PREVIOUS:
    		setPrevious((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__NEXT:
    		setNext((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection<? extends Instruction>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration((int) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__PREVIOUS:
    		setPrevious((Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__NEXT:
    		setNext((Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__INSTRUCTIONS:
    		getInstructions().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.REPEAT__ITERATION:
    		setIteration((Integer) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

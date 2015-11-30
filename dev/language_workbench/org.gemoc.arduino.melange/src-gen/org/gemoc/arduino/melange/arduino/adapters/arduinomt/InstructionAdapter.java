package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Instruction;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;

@SuppressWarnings("all")
public class InstructionAdapter extends EObjectAdapter<Instruction> implements org.gemoc.arduino.melange.arduinomt.arduino.Instruction {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public InstructionAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private org.gemoc.arduino.melange.arduinomt.arduino.Instruction previous;
  
  @Override
  public org.gemoc.arduino.melange.arduinomt.arduino.Instruction getPrevious() {
    return (org.gemoc.arduino.melange.arduinomt.arduino.Instruction) adaptersFactory.createAdapter(adaptee.getPrevious(), eResource) ;
  }
  
  @Override
  public void setPrevious(final org.gemoc.arduino.melange.arduinomt.arduino.Instruction o) {
    if (o != null)
    	adaptee.setPrevious(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setPrevious(null) ;
  }
  
  private org.gemoc.arduino.melange.arduinomt.arduino.Instruction next;
  
  @Override
  public org.gemoc.arduino.melange.arduinomt.arduino.Instruction getNext() {
    return (org.gemoc.arduino.melange.arduinomt.arduino.Instruction) adaptersFactory.createAdapter(adaptee.getNext(), eResource) ;
  }
  
  @Override
  public void setNext(final org.gemoc.arduino.melange.arduinomt.arduino.Instruction o) {
    if (o != null)
    	adaptee.setNext(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
    else adaptee.setNext(null) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getInstruction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.INSTRUCTION__PREVIOUS:
    		return getPrevious();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.INSTRUCTION__NEXT:
    		return getNext();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.INSTRUCTION__PREVIOUS:
    		setPrevious((org.gemoc.arduino.melange.arduinomt.arduino.Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.INSTRUCTION__NEXT:
    		setNext((org.gemoc.arduino.melange.arduinomt.arduino.Instruction) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.INSTRUCTION__PREVIOUS:
    		setPrevious((org.gemoc.arduino.melange.arduinomt.arduino.Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.INSTRUCTION__NEXT:
    		setNext((org.gemoc.arduino.melange.arduinomt.arduino.Instruction) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

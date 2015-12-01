package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ModuleInstruction;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Instruction;
import org.gemoc.arduino.melange.arduinomt.arduino.Module;

@SuppressWarnings("all")
public class ModuleInstructionAdapter extends EObjectAdapter<ModuleInstruction> implements org.gemoc.arduino.melange.arduinomt.arduino.ModuleInstruction {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ModuleInstructionAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
  
  private Module module;
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.ModuleInstruction_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getModuleInstruction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__PREVIOUS:
    		return getPrevious();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__NEXT:
    		return getNext();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__PREVIOUS:
    		setPrevious((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__NEXT:
    		setNext((Instruction) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__MODULE:
    		setModule((Module) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__PREVIOUS:
    		setPrevious((Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__NEXT:
    		setNext((Instruction) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__MODULE:
    		setModule((Module) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

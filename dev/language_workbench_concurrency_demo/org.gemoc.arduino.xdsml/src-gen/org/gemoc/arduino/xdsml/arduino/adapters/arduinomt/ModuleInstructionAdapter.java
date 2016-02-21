package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ModuleInstruction;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Module;

@SuppressWarnings("all")
public class ModuleInstructionAdapter extends EObjectAdapter<ModuleInstruction> implements org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ModuleInstructionAdapter() {
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
  
  private Module module;
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.operationalsemantics.Instruction_ExecutableAspect.finalize(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getModuleInstruction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__OWNED_BLOCK:
    		return getOwnedBlock();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__MODULE:
    		setModule((Module) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.MODULE_INSTRUCTION__MODULE:
    		setModule((Module) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.VariableDeclaration;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Variable;

@SuppressWarnings("all")
public class VariableDeclarationAdapter extends EObjectAdapter<VariableDeclaration> implements org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public VariableDeclarationAdapter() {
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
  
  private Variable variable;
  
  @Override
  public Variable getVariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource) ;
  }
  
  @Override
  public void setVariable(final Variable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.VariableAdapter) o).getAdaptee()) ;
    else adaptee.setVariable(null) ;
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
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getVariableDeclaration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__OWNED_BLOCK:
    		return getOwnedBlock();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		setVariable((Variable) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.VARIABLE_DECLARATION__VARIABLE:
    		setVariable((Variable) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

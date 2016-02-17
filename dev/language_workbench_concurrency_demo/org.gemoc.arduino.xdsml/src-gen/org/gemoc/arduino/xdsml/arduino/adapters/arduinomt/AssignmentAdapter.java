package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Assignment;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Expression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;

@SuppressWarnings("all")
public class AssignmentAdapter extends EObjectAdapter<Assignment> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public AssignmentAdapter() {
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
  
  private Expression operand;
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource) ;
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setOperand(null) ;
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
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OWNED_BLOCK:
    		return getOwnedBlock();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    		setOperand((Expression) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OWNED_BLOCK:
    		setOwnedBlock((InstructionBlock) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    		setOperand((Expression) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

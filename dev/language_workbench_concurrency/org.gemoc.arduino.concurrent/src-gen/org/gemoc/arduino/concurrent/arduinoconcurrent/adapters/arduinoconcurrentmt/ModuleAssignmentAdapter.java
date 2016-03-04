package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Expression;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Module;
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleAssignment;

@SuppressWarnings("all")
public class ModuleAssignmentAdapter extends EObjectAdapter<ModuleAssignment> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ModuleAssignment {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public ModuleAssignmentAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource) ;
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setOperand(null) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.concurrent.operationalsemantics.ModuleAssignment_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.concurrent.operationalsemantics.Instruction_ExecutableAspect.finalize(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getModuleAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule();
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		setModule((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Module) null);
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		setOperand((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Expression) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule() != null;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Assignment.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Assignment.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		setModule((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Module) newValue);
    		return;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		setOperand((org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Expression) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

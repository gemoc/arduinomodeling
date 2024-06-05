package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Expression;

@SuppressWarnings("all")
public class ModuleAssignmentAdapter extends EObjectAdapter<ModuleAssignment> implements org.gemoc.arduino.sequential.xarduinomt.arduino.ModuleAssignment {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public ModuleAssignmentAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public org.gemoc.arduino.sequential.xarduinomt.arduino.Module getModule() {
    return (org.gemoc.arduino.sequential.xarduinomt.arduino.Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource);
  }

  @Override
  public void setModule(final org.gemoc.arduino.sequential.xarduinomt.arduino.Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
  }

  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }

  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }

  @Override
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.ModuleAssignment_ExecutableAspect.execute(adaptee);
  }

  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.xarduino.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getModuleAssignment();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule() != null;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		setModule(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Module)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		setOperand(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }

  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.sequential.xarduinomt.arduino.Assignment.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.sequential.xarduinomt.arduino.Assignment.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}

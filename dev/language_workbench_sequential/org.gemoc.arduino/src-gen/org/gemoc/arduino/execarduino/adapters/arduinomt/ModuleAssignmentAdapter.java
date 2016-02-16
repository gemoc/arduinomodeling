package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Expression;
import org.gemoc.arduino.arduinomt.arduino.Module;
import org.gemoc.arduino.execarduino.arduino.ModuleAssignment;

@SuppressWarnings("all")
public class ModuleAssignmentAdapter extends EObjectAdapter<ModuleAssignment> implements org.gemoc.arduino.arduinomt.arduino.ModuleAssignment {
  private org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ModuleAssignmentAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Module module;
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource) ;
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
    else adaptee.setModule(null) ;
  }
  
  private Expression operand;
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource) ;
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setOperand(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getModuleAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		return getModule();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.Module) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__MODULE:
    		setModule((org.gemoc.arduino.arduinomt.arduino.Module) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.MODULE_ASSIGNMENT__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

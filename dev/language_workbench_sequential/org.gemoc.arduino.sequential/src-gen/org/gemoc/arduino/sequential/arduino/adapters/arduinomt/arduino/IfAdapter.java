package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.If;
import org.gemoc.arduino.sequential.arduinomt.arduino.Block;
import org.gemoc.arduino.sequential.arduinomt.arduino.BooleanExpression;

@SuppressWarnings("all")
public class IfAdapter extends EObjectAdapter<If> implements org.gemoc.arduino.sequential.arduinomt.arduino.If {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IfAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public BooleanExpression getCondition() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final BooleanExpression o) {
    if (o != null)
    	adaptee.setCondition(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Block getElseBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElseBlock(), eResource);
  }
  
  @Override
  public void setElseBlock(final Block o) {
    if (o != null)
    	adaptee.setElseBlock(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setElseBlock(null);
  }
  
  @Override
  public Boolean evaluate() {
    return org.gemoc.arduino.sequential.arduino.aspects.If_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.arduino.aspects.If_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIf();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		return getCondition();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		return getElseBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		return getCondition() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		return getElseBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		setBlock(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Block)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		setCondition(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.BooleanExpression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		setElseBlock(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.If;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Block;
import org.gemoc.arduino.arduinomt.arduino.BooleanExpression;

@SuppressWarnings("all")
public class IfAdapter extends EObjectAdapter<If> implements org.gemoc.arduino.arduinomt.arduino.If {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IfAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource) ;
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.arduino.adapters.arduinomt.BlockAdapter) o).getAdaptee()) ;
    else adaptee.setBlock(null) ;
  }
  
  @Override
  public BooleanExpression getCondition() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource) ;
  }
  
  @Override
  public void setCondition(final BooleanExpression o) {
    if (o != null)
    	adaptee.setCondition(((org.gemoc.arduino.arduino.adapters.arduinomt.BooleanExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setCondition(null) ;
  }
  
  @Override
  public Block getElseBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElseBlock(), eResource) ;
  }
  
  @Override
  public void setElseBlock(final Block o) {
    if (o != null)
    	adaptee.setElseBlock(((org.gemoc.arduino.arduino.adapters.arduinomt.BlockAdapter) o).getAdaptee()) ;
    else adaptee.setElseBlock(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIf();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		return getCondition();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		return getElseBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		setCondition((org.gemoc.arduino.arduinomt.arduino.BooleanExpression) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		setElseBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		return getCondition() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		return getElseBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		setCondition((org.gemoc.arduino.arduinomt.arduino.BooleanExpression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		setElseBlock((org.gemoc.arduino.arduinomt.arduino.Block) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
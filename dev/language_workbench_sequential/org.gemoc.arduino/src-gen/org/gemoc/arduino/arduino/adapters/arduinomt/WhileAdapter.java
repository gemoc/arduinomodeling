package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.While;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Block;
import org.gemoc.arduino.arduinomt.arduino.BooleanExpression;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements org.gemoc.arduino.arduinomt.arduino.While {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Block block;
  
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
  
  private BooleanExpression condition;
  
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
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getWhile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.WHILE__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		return getCondition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.WHILE__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		setCondition((org.gemoc.arduino.arduinomt.arduino.BooleanExpression) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.WHILE__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		setCondition((org.gemoc.arduino.arduinomt.arduino.BooleanExpression) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

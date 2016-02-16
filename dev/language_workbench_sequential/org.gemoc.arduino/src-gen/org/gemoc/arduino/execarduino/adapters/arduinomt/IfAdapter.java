package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Block;
import org.gemoc.arduino.arduinomt.arduino.BooleanExpression;
import org.gemoc.arduino.execarduino.arduino.If;

@SuppressWarnings("all")
public class IfAdapter extends EObjectAdapter<If> implements org.gemoc.arduino.arduinomt.arduino.If {
  private org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IfAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Block block;
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource) ;
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.execarduino.adapters.arduinomt.BlockAdapter) o).getAdaptee()) ;
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
    	adaptee.setCondition(((org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setCondition(null) ;
  }
  
  private Block elseBlock;
  
  @Override
  public Block getElseBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElseBlock(), eResource) ;
  }
  
  @Override
  public void setElseBlock(final Block o) {
    if (o != null)
    	adaptee.setElseBlock(((org.gemoc.arduino.execarduino.adapters.arduinomt.BlockAdapter) o).getAdaptee()) ;
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
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__CONDITION:
    		setCondition((org.gemoc.arduino.arduinomt.arduino.BooleanExpression) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.IF__ELSE_BLOCK:
    		setElseBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

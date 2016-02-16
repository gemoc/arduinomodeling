package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.arduinomt.arduino.Expression;
import org.gemoc.arduino.execarduino.arduino.BinaryBooleanExpression;

@SuppressWarnings("all")
public class BinaryBooleanExpressionAdapter extends EObjectAdapter<BinaryBooleanExpression> implements org.gemoc.arduino.arduinomt.arduino.BinaryBooleanExpression {
  private org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BinaryBooleanExpressionAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public BinaryBooleanOperatorKind getOperator() {
    return org.gemoc.arduino.arduinomt.arduino.BinaryBooleanOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BinaryBooleanOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.execarduino.arduino.BinaryBooleanOperatorKind.get(o.getValue())) ;
  }
  
  private Expression left;
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource) ;
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setLeft(null) ;
  }
  
  private Expression right;
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource) ;
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setRight(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBinaryBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__LEFT:
    		return getLeft();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__RIGHT:
    		return getRight();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__LEFT:
    		setLeft((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__RIGHT:
    		setRight((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator((org.gemoc.arduino.arduinomt.arduino.BinaryBooleanOperatorKind) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__LEFT:
    		setLeft((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__RIGHT:
    		setRight((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator((org.gemoc.arduino.arduinomt.arduino.BinaryBooleanOperatorKind) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

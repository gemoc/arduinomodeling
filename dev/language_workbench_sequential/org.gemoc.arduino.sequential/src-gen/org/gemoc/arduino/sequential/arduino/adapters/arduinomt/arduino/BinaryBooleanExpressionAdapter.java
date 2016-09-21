package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.sequential.arduinomt.arduino.Expression;

@SuppressWarnings("all")
public class BinaryBooleanExpressionAdapter extends EObjectAdapter<BinaryBooleanExpression> implements org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanExpression {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BinaryBooleanExpressionAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BinaryBooleanOperatorKind getOperator() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BinaryBooleanOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanOperatorKind.get(o.getValue()));
  }
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.arduino.aspects.BinaryBooleanExpression_EvaluableAspect.evaluate(adaptee);
  }
  
  protected final static BinaryBooleanOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanOperatorKind.INF;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBinaryBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__LEFT:
    		return getLeft();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__RIGHT:
    		return getRight();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__LEFT:
    		return getLeft() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__RIGHT:
    		return getRight() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__LEFT:
    		setLeft(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__RIGHT:
    		setRight(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

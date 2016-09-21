package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.sequential.arduinomt.arduino.Expression;

@SuppressWarnings("all")
public class BinaryIntegerExpressionAdapter extends EObjectAdapter<BinaryIntegerExpression> implements org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerExpression {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BinaryIntegerExpressionAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BinaryIntegerOperatorKind getOperator() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BinaryIntegerOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerOperatorKind.get(o.getValue()));
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
    return org.gemoc.arduino.sequential.arduino.aspects.BinaryIntegerExpression_EvaluableAspect.evaluate(adaptee);
  }
  
  protected final static BinaryIntegerOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBinaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		setLeft(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		setRight(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

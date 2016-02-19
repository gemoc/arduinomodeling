package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.arduinomt.arduino.Expression;

@SuppressWarnings("all")
public class BinaryIntegerExpressionAdapter extends EObjectAdapter<BinaryIntegerExpression> implements org.gemoc.arduino.arduinomt.arduino.BinaryIntegerExpression {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BinaryIntegerExpressionAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public BinaryIntegerOperatorKind getOperator() {
    return org.gemoc.arduino.arduinomt.arduino.BinaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BinaryIntegerOperatorKind o) {
    adaptee.setOperator(fr.obeo.dsl.arduino.BinaryIntegerOperatorKind.get(o.getValue())) ;
  }
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource) ;
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.gemoc.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setLeft(null) ;
  }
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource) ;
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((org.gemoc.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setRight(null) ;
  }
  
  protected final static BinaryIntegerOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.arduinomt.arduino.BinaryIntegerOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBinaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		setLeft((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		setRight((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(OPERATOR_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		setLeft((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		setRight((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator((org.gemoc.arduino.arduinomt.arduino.BinaryIntegerOperatorKind) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

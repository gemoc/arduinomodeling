package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.UnaryIntegerExpression;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Expression;
import org.gemoc.arduino.arduinomt.arduino.UnaryIntegerOperatorKind;

@SuppressWarnings("all")
public class UnaryIntegerExpressionAdapter extends EObjectAdapter<UnaryIntegerExpression> implements org.gemoc.arduino.arduinomt.arduino.UnaryIntegerExpression {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryIntegerExpressionAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public UnaryIntegerOperatorKind getOperator() {
    return org.gemoc.arduino.arduinomt.arduino.UnaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final UnaryIntegerOperatorKind o) {
    adaptee.setOperator(fr.obeo.dsl.arduino.UnaryIntegerOperatorKind.get(o.getValue())) ;
  }
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource) ;
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setOperand(null) ;
  }
  
  protected final static UnaryIntegerOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.arduinomt.arduino.UnaryIntegerOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(OPERATOR_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator((org.gemoc.arduino.arduinomt.arduino.UnaryIntegerOperatorKind) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

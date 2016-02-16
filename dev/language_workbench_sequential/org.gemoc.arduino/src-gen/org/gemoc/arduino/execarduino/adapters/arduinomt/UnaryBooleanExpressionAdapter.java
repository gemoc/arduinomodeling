package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Expression;
import org.gemoc.arduino.arduinomt.arduino.UnaryBooleanOperatorKind;
import org.gemoc.arduino.execarduino.arduino.UnaryBooleanExpression;

@SuppressWarnings("all")
public class UnaryBooleanExpressionAdapter extends EObjectAdapter<UnaryBooleanExpression> implements org.gemoc.arduino.arduinomt.arduino.UnaryBooleanExpression {
  private org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryBooleanExpressionAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public UnaryBooleanOperatorKind getOperator() {
    return org.gemoc.arduino.arduinomt.arduino.UnaryBooleanOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final UnaryBooleanOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.execarduino.arduino.UnaryBooleanOperatorKind.get(o.getValue())) ;
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
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator((org.gemoc.arduino.arduinomt.arduino.UnaryBooleanOperatorKind) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		setOperand((org.gemoc.arduino.arduinomt.arduino.Expression) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator((org.gemoc.arduino.arduinomt.arduino.UnaryBooleanOperatorKind) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

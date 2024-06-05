package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Expression;
import org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryIntegerOperatorKind;

@SuppressWarnings("all")
public class UnaryIntegerExpressionAdapter extends EObjectAdapter<UnaryIntegerExpression> implements org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryIntegerExpression {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public UnaryIntegerExpressionAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  @Override
  public UnaryIntegerOperatorKind getOperator() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }

  @Override
  public void setOperator(final UnaryIntegerOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerOperatorKind.get(o.getValue()));
  }

  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }

  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }

  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.xarduino.aspects.Expression_EvaluableAspect.evaluate(adaptee);
  }

  protected static final UnaryIntegerOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryIntegerOperatorKind.MINUS;

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryIntegerExpression();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		setOperand(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.arduino.sequential.xarduinomt.arduino.UnaryIntegerOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

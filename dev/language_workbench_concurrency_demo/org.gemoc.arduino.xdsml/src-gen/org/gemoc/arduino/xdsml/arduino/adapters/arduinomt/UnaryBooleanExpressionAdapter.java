package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.UnaryBooleanExpression;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Expression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind;

@SuppressWarnings("all")
public class UnaryBooleanExpressionAdapter extends EObjectAdapter<UnaryBooleanExpression> implements org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression {
  private org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryBooleanExpressionAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public UnaryBooleanOperatorKind getOperator() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final UnaryBooleanOperatorKind o) {
    adaptee.setOperator(fr.obeo.dsl.arduino.UnaryBooleanOperatorKind.get(o.getValue())) ;
  }
  
  private Expression operand;
  
  @Override
  public Expression getOperand() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getOperand(), eResource) ;
  }
  
  @Override
  public void setOperand(final Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setOperand(null) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		setOperand((Expression) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator((UnaryBooleanOperatorKind) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERAND:
    		setOperand((Expression) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_BOOLEAN_EXPRESSION__OPERATOR:
    		setOperator((UnaryBooleanOperatorKind) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

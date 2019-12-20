package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.UnaryExpression;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Expression;

@SuppressWarnings("all")
public class UnaryExpressionAdapter extends EObjectAdapter<UnaryExpression> implements org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryExpressionAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		setOperand((Expression) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		setOperand((Expression) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

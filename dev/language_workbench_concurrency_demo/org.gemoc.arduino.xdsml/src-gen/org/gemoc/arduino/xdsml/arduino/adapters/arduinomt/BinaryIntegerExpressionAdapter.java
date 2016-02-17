package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Expression;

@SuppressWarnings("all")
public class BinaryIntegerExpressionAdapter extends EObjectAdapter<BinaryIntegerExpression> implements org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public BinaryIntegerExpressionAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public BinaryIntegerOperatorKind getOperator() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final BinaryIntegerOperatorKind o) {
    adaptee.setOperator(fr.obeo.dsl.arduino.BinaryIntegerOperatorKind.get(o.getValue())) ;
  }
  
  private Expression left;
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource) ;
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
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
    	adaptee.setRight(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ExpressionAdapter) o).getAdaptee()) ;
    else adaptee.setRight(null) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.BinaryIntegerExpression_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBinaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		return getLeft();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		return getRight();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		setLeft((Expression) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		setRight((Expression) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator((BinaryIntegerOperatorKind) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__LEFT:
    		setLeft((Expression) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__RIGHT:
    		setRight((Expression) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.BINARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator((BinaryIntegerOperatorKind) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

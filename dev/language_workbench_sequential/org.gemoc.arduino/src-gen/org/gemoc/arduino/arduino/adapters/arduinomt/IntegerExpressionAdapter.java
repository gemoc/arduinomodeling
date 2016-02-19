package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.IntegerExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntegerExpressionAdapter extends EObjectAdapter<IntegerExpression> implements org.gemoc.arduino.arduinomt.arduino.IntegerExpression {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public IntegerExpressionAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getIntegerExpression();
  }
}

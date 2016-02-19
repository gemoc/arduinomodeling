package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExpressionAdapter extends EObjectAdapter<Expression> implements org.gemoc.arduino.arduinomt.arduino.Expression {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ExpressionAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getExpression();
  }
}

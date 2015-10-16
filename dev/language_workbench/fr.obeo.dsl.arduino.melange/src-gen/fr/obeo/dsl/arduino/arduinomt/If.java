package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.BooleanOperator;
import fr.obeo.dsl.arduino.arduinomt.Control;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface If extends EObject, Control {
  public abstract BooleanOperator getCondition();
  
  public abstract void setCondition(final BooleanOperator newCondition);
  
  public abstract void execute();
}

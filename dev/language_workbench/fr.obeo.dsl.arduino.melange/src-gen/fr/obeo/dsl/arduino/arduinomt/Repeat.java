package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Control;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Repeat extends EObject, Control {
  public abstract int getIteration();
  
  public abstract void setIteration(final int newIteration);
  
  public abstract void execute();
}

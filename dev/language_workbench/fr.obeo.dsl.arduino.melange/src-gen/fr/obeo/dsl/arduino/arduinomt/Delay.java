package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Time;
import fr.obeo.dsl.arduino.arduinomt.Utilities;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Delay extends EObject, Utilities {
  public abstract Time getUnit();
  
  public abstract void setUnit(final Time newUnit);
  
  public abstract int getValue();
  
  public abstract void setValue(final int newValue);
  
  public abstract void execute();
}

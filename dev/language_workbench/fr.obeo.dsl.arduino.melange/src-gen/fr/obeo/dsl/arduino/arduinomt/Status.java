package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.ModuleInstruction;
import fr.obeo.dsl.arduino.arduinomt.Sensor;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Status extends EObject, ModuleInstruction, Expression {
  public abstract boolean isStatus();
  
  public abstract void setStatus(final boolean newStatus);
  
  public abstract Sensor getSensor();
  
  public abstract void setSensor(final Sensor newSensor);
  
  public abstract void execute();
  
  public abstract void call();
}

package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Parameter;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Utilities extends EObject, Instruction, Parameter {
  public abstract void call();
  
  public abstract void execute();
}

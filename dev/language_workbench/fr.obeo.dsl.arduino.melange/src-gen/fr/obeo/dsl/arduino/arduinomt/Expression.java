package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Parameter;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Expression extends EObject, Instruction, Parameter {
  public abstract Object evaluate();
  
  public abstract Number evaluateAsNumber();
  
  public abstract Boolean evaluateAsBoolean();
}

package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ParameterCall extends EObject, Instruction {
  public abstract ParameterDefinition getDefinition();
  
  public abstract void setDefinition(final ParameterDefinition newDefinition);
}

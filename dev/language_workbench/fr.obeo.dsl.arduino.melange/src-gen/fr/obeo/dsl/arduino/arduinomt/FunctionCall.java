package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Function;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Parameter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FunctionCall extends EObject, Instruction {
  public abstract Function getDefinition();
  
  public abstract void setDefinition(final Function newDefinition);
  
  public abstract EList<Parameter> getParameters();
  
  public abstract void execute();
}

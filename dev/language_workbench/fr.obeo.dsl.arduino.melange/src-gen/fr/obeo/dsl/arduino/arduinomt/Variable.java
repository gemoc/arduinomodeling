package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Variable extends EObject, Expression, Instruction {
  public abstract String getName();
  
  public abstract void setName(final String newName);
  
  public abstract Object getValue();
  
  public abstract void setValue(final Object newValue);
  
  public abstract Object evaluate();
}

package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Variable;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Set extends EObject, Instruction {
  public abstract Variable getVariable();
  
  public abstract void setVariable(final Variable newVariable);
  
  public abstract Expression getValue();
  
  public abstract void setValue(final Expression newValue);
  
  public abstract void execute();
}

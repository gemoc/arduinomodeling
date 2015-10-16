package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Expression;
import fr.obeo.dsl.arduino.arduinomt.ModuleInstruction;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Level extends EObject, ModuleInstruction {
  public abstract Expression getLevel();
  
  public abstract void setLevel(final Expression newLevel);
  
  public abstract void execute();
}

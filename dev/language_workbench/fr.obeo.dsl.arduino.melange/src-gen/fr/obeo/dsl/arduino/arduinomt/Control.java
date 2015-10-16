package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Instruction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Control extends EObject, Instruction {
  public abstract EList<Instruction> getInstructions();
  
  public abstract void execute();
}

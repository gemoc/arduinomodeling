package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.Parameter;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ModuleInstruction extends EObject, Instruction, Parameter {
  public abstract Module getModule();
  
  public abstract void setModule(final Module newModule);
  
  public abstract void call();
  
  public abstract void execute();
}

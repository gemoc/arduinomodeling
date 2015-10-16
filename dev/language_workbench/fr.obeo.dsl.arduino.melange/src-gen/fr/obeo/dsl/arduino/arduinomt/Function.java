package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Function extends EObject {
  public abstract String getName();
  
  public abstract void setName(final String newName);
  
  public abstract EList<ParameterDefinition> getParamDefs();
  
  public abstract EList<Instruction> getInstructions();
}

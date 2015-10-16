package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.ParameterType;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ParameterDefinition extends EObject {
  public abstract ParameterType getType();
  
  public abstract void setType(final ParameterType newType);
  
  public abstract String getName();
  
  public abstract void setName(final String newName);
}

package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Parameter extends EObject {
  public abstract ParameterDefinition getDefinition();
  
  public abstract void setDefinition(final ParameterDefinition newDefinition);
  
  public abstract void call();
}

package fr.obeo.dsl.arduino.arduinomt;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Pin extends EObject {
  public abstract int getId();
  
  public abstract void setId(final int newId);
  
  public abstract Integer getLevel();
  
  public abstract void setLevel(final Integer newLevel);
}

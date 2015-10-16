package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Library;
import fr.obeo.dsl.arduino.arduinomt.ModuleKind;
import fr.obeo.dsl.arduino.arduinomt.NamedElement;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Module extends EObject, NamedElement {
  public abstract ModuleKind getKind();
  
  public abstract void setKind(final ModuleKind newKind);
  
  public abstract String getImage();
  
  public abstract void setImage(final String newImage);
  
  public abstract boolean isLevel();
  
  public abstract void setLevel(final boolean newLevel);
  
  public abstract Library getLibrary();
  
  public abstract void setLibrary(final Library newLibrary);
}

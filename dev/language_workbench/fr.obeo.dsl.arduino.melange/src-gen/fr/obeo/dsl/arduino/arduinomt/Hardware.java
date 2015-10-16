package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Connector;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.NamedElement;
import fr.obeo.dsl.arduino.arduinomt.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Hardware extends EObject, NamedElement {
  public abstract EList<Platform> getPlatforms();
  
  public abstract EList<Module> getModules();
  
  public abstract EList<Connector> getConnectors();
}

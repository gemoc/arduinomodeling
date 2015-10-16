package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.Pin;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Connector extends EObject {
  public abstract Pin getPin();
  
  public abstract void setPin(final Pin newPin);
  
  public abstract Module getModule();
  
  public abstract void setModule(final Module newModule);
}

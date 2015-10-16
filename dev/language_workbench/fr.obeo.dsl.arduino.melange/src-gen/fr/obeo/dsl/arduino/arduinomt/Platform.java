package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.AnalogPin;
import fr.obeo.dsl.arduino.arduinomt.DigitalPin;
import fr.obeo.dsl.arduino.arduinomt.NamedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Platform extends EObject, NamedElement {
  public abstract String getImage();
  
  public abstract void setImage(final String newImage);
  
  public abstract EList<DigitalPin> getDigitalPins();
  
  public abstract EList<AnalogPin> getAnalogPins();
}

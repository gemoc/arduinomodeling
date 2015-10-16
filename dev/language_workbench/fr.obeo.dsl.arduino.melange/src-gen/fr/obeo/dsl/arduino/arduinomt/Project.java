package fr.obeo.dsl.arduino.arduinomt;

import fr.obeo.dsl.arduino.arduinomt.Hardware;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.Platform;
import fr.obeo.dsl.arduino.arduinomt.Sketch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Project extends EObject {
  public abstract Hardware getHardware();
  
  public abstract void setHardware(final Hardware newHardware);
  
  public abstract Sketch getSketch();
  
  public abstract void setSketch(final Sketch newSketch);
  
  public abstract EList<Module> getModules();
  
  public abstract EList<Platform> getPlatform();
  
  public abstract void execute();
  
  public abstract void setup();
}

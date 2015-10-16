package fr.obeo.dsl.arduino;

import fr.inria.diverse.melange.lib.IModelType;
import fr.obeo.dsl.arduino.arduinomt.ArduinoMTFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ArduinoMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ArduinoMTFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}

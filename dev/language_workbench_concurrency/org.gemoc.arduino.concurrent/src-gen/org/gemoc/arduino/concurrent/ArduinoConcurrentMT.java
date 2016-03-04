package org.gemoc.arduino.concurrent;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public interface ArduinoConcurrentMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ArduinoFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}

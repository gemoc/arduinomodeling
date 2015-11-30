package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.gemoc.arduino.melange.ArduinoMT;
import org.gemoc.arduino.melange.arduinomt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class ArduinoAdapter extends ResourceAdapter implements ArduinoMT {
  public ArduinoAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ArduinoFactory getFactory() {
    return new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

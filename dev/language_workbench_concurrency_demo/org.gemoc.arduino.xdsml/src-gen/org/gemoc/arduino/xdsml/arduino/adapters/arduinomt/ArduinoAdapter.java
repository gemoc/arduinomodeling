package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.gemoc.arduino.xdsml.ArduinoMT;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class ArduinoAdapter extends ResourceAdapter implements ArduinoMT {
  public ArduinoAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ArduinoFactory getFactory() {
    return new org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

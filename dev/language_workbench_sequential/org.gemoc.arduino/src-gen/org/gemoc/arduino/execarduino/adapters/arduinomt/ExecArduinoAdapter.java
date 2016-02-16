package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.gemoc.arduino.arduinomt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class ExecArduinoAdapter extends ResourceAdapter implements org.gemoc.arduino.ArduinoMT {
  public ExecArduinoAdapter() {
    super(org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ArduinoFactory getFactory() {
    return new org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

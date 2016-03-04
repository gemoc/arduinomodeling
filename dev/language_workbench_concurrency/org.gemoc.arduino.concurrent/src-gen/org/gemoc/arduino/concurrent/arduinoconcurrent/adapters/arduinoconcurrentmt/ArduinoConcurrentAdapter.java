package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.gemoc.arduino.concurrent.ArduinoConcurrentMT;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class ArduinoConcurrentAdapter extends ResourceAdapter implements ArduinoConcurrentMT {
  public ArduinoConcurrentAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ArduinoFactory getFactory() {
    return new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

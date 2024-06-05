package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.arduino.sequential.XArduinoMT;
import org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class XArduinoAdapter extends ResourceAdapter implements XArduinoMT {
  public XArduinoAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
  }

  @Override
  public ArduinoFactory getArduinoFactory() {
    return new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoFactoryAdapter();
  }

  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getArduinoFactory());
    return res;
  }

  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

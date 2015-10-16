package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.obeo.dsl.arduino.ArduinoMT;
import fr.obeo.dsl.arduino.arduinomt.ArduinoMTFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class ArduinoAdapter extends ResourceAdapter implements ArduinoMT {
  public ArduinoAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ArduinoMTFactory getFactory() {
    return new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

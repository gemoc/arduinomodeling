package fr.obeo.dsl.arduino;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.obeo.dsl.arduino.ArduinoMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class Arduino implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static Arduino load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    Arduino mm = new Arduino() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public ArduinoMT toArduinoMT() {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoAdapter adaptee = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}

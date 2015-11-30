package org.gemoc.arduino.melange;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.arduino.melange.ArduinoMT;

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
    org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoAdapter adaptee = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}

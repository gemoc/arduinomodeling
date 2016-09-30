package org.gemoc.arduino.sequential;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.arduino.sequential.XArduinoMT;

@SuppressWarnings("all")
public class XArduino implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XArduino load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XArduino mm = new XArduino();
    mm.setResource(res);
    return mm ;
  }
  
  public XArduinoMT toXArduinoMT() {
    org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoAdapter adaptee = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}

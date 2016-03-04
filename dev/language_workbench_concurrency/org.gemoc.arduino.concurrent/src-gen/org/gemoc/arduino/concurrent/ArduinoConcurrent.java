package org.gemoc.arduino.concurrent;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.arduino.concurrent.ArduinoConcurrentMT;

@SuppressWarnings("all")
public class ArduinoConcurrent implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static ArduinoConcurrent load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    ArduinoConcurrent mm = new ArduinoConcurrent() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public ArduinoConcurrentMT toArduinoConcurrentMT() {
    org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentAdapter adaptee = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}

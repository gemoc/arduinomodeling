package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.Utilities;

@SuppressWarnings("all")
public class UtilitiesAdapter extends EObjectAdapter<Utilities> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Utilities {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public UtilitiesAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.concurrent.operationalsemantics.Utilities_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.concurrent.operationalsemantics.Instruction_ExecutableAspect.finalize(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getUtilities();
  }
}

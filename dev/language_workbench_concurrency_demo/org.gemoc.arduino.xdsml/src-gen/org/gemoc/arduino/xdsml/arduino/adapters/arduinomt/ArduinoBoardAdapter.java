package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ArduinoBoard;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Project;

@SuppressWarnings("all")
public class ArduinoBoardAdapter extends EObjectAdapter<ArduinoBoard> implements org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ArduinoBoardAdapter() {
    super(org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  private Project project;
  
  @Override
  public Project getProject() {
    return (Project) adaptersFactory.createAdapter(adaptee.getProject(), eResource) ;
  }
  
  @Override
  public void setProject(final Project o) {
    if (o != null)
    	adaptee.setProject(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ProjectAdapter) o).getAdaptee()) ;
    else adaptee.setProject(null) ;
  }
  
  private EList<org.gemoc.arduino.xdsml.arduinomt.arduino.Thread> threads;
  
  @Override
  public EList<org.gemoc.arduino.xdsml.arduinomt.arduino.Thread> getThreads() {
    if (threads == null)
    	threads = EListAdapter.newInstance(adaptee.getThreads(), adaptersFactory) ;
    return threads;
  }
  
  private EList<DigitalPin> digitalPins;
  
  @Override
  public EList<DigitalPin> getDigitalPins() {
    if (digitalPins == null)
    	digitalPins = EListAdapter.newInstance(adaptee.getDigitalPins(), adaptersFactory) ;
    return digitalPins;
  }
  
  private EList<AnalogPin> analogPins;
  
  @Override
  public EList<AnalogPin> getAnalogPins() {
    if (analogPins == null)
    	analogPins = EListAdapter.newInstance(adaptee.getAnalogPins(), adaptersFactory) ;
    return analogPins;
  }
  
  @Override
  public void execute() {
    adaptee.execute() ;
  }
  
  @Override
  public void idle() {
    adaptee.idle() ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getArduinoBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__THREADS:
    		return getThreads();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		setProject((Project) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__THREADS:
    		getThreads().clear();
    		getThreads().addAll((Collection<? extends org.gemoc.arduino.xdsml.arduinomt.arduino.Thread>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    		getDigitalPins().addAll((Collection<? extends DigitalPin>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    		getAnalogPins().addAll((Collection<? extends AnalogPin>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		setProject((Project) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__THREADS:
    		getThreads().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}

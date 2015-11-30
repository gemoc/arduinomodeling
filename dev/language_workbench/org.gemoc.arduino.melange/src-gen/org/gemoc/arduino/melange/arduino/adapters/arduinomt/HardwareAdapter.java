package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Hardware;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Connector;
import org.gemoc.arduino.melange.arduinomt.arduino.Module;
import org.gemoc.arduino.melange.arduinomt.arduino.Platform;

@SuppressWarnings("all")
public class HardwareAdapter extends EObjectAdapter<Hardware> implements org.gemoc.arduino.melange.arduinomt.arduino.Hardware {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public HardwareAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  private EList<Platform> platforms;
  
  @Override
  public EList<Platform> getPlatforms() {
    if (platforms == null)
    	platforms = EListAdapter.newInstance(adaptee.getPlatforms(), adaptersFactory) ;
    return platforms;
  }
  
  private EList<Module> modules;
  
  @Override
  public EList<Module> getModules() {
    if (modules == null)
    	modules = EListAdapter.newInstance(adaptee.getModules(), adaptersFactory) ;
    return modules;
  }
  
  private EList<Connector> connectors;
  
  @Override
  public EList<Connector> getConnectors() {
    if (connectors == null)
    	connectors = EListAdapter.newInstance(adaptee.getConnectors(), adaptersFactory) ;
    return connectors;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getHardware();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__NAME:
    		return getName();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__PLATFORMS:
    		return getPlatforms();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__MODULES:
    		return getModules();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__CONNECTORS:
    		return getConnectors();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__PLATFORMS:
    		getPlatforms().clear();
    		getPlatforms().addAll((Collection<? extends Platform>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__MODULES:
    		getModules().clear();
    		getModules().addAll((Collection<? extends Module>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection<? extends Connector>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__PLATFORMS:
    		getPlatforms().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__MODULES:
    		getModules().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.HARDWARE__CONNECTORS:
    		getConnectors().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}

package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Project;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Hardware;
import org.gemoc.arduino.melange.arduinomt.arduino.Module;
import org.gemoc.arduino.melange.arduinomt.arduino.Platform;
import org.gemoc.arduino.melange.arduinomt.arduino.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements org.gemoc.arduino.melange.arduinomt.arduino.Project {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Hardware hardware;
  
  @Override
  public Hardware getHardware() {
    return (Hardware) adaptersFactory.createAdapter(adaptee.getHardware(), eResource) ;
  }
  
  @Override
  public void setHardware(final Hardware o) {
    if (o != null)
    	adaptee.setHardware(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.HardwareAdapter) o).getAdaptee()) ;
    else adaptee.setHardware(null) ;
  }
  
  private Sketch sketch;
  
  @Override
  public Sketch getSketch() {
    return (Sketch) adaptersFactory.createAdapter(adaptee.getSketch(), eResource) ;
  }
  
  @Override
  public void setSketch(final Sketch o) {
    if (o != null)
    	adaptee.setSketch(((org.gemoc.arduino.melange.arduino.adapters.arduinomt.SketchAdapter) o).getAdaptee()) ;
    else adaptee.setSketch(null) ;
  }
  
  private EList<Module> modules;
  
  @Override
  public EList<Module> getModules() {
    if (modules == null)
    	modules = EListAdapter.newInstance(adaptee.getModules(), adaptersFactory) ;
    return modules;
  }
  
  private EList<Platform> platform;
  
  @Override
  public EList<Platform> getPlatform() {
    if (platform == null)
    	platform = EListAdapter.newInstance(adaptee.getPlatform(), adaptersFactory) ;
    return platform;
  }
  
  @Override
  public void setup() {
    org.gemoc.arduino.operationalsemantics.Project_SetupAspect.setup(adaptee) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__HARDWARE:
    		return getHardware();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		return getSketch();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__MODULES:
    		return getModules();
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__PLATFORM:
    		return getPlatform();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__HARDWARE:
    		setHardware((Hardware) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch((Sketch) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__MODULES:
    		getModules().clear();
    		getModules().addAll((Collection<? extends Module>) newValue);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__PLATFORM:
    		getPlatform().clear();
    		getPlatform().addAll((Collection<? extends Platform>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__HARDWARE:
    		setHardware((Hardware) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch((Sketch) null);
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__MODULES:
    		getModules().clear();
    		return;
    	case org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.PROJECT__PLATFORM:
    		getPlatform().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}

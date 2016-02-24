package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Sketch;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Channel;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Project;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
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
  
  private EList<Channel> channels;
  
  @Override
  public EList<Channel> getChannels() {
    if (channels == null)
    	channels = EListAdapter.newInstance(adaptee.getChannels(), adaptersFactory) ;
    return channels;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getSketch();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		return getProject();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__THREADS:
    		return getThreads();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__CHANNELS:
    		return getChannels();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		setProject((Project) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__THREADS:
    		getThreads().clear();
    		getThreads().addAll((Collection<? extends org.gemoc.arduino.xdsml.arduinomt.arduino.Thread>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__CHANNELS:
    		getChannels().clear();
    		getChannels().addAll((Collection<? extends Channel>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		setProject((Project) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__THREADS:
    		getThreads().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.SKETCH__CHANNELS:
    		getChannels().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}

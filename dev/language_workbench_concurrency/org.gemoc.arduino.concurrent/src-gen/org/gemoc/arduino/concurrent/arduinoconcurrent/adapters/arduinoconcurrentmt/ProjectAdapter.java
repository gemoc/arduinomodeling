package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Board;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Sketch;
import org.gemoc.arduino.concurrent.execarduino.arduino.Project;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Project {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance() ;
  }
  
  private EList<Board> boards;
  
  @Override
  public EList<Board> getBoards() {
    if (boards == null)
    	boards = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBoards(), adaptersFactory) ;
    return boards;
  }
  
  private EList<Sketch> sketches;
  
  @Override
  public EList<Sketch> getSketches() {
    if (sketches == null)
    	sketches = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSketches(), adaptersFactory) ;
    return sketches;
  }
  
  @Override
  public void setup() {
    org.gemoc.arduino.concurrent.operationalsemantics.Project_ExecutableAspect.setup(adaptee) ;
  }
  
  public void initializeModel(final java.util.List<java.lang.String> args) {
    org.gemoc.arduino.concurrent.operationalsemantics.Project_ExecutableAspect.initializeModel(adaptee, args
    ) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards();
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		return getSketches();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		getBoards().clear();
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		getSketches().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards() != null && !getBoards().isEmpty();
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		return getSketches() != null && !getSketches().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		getBoards().clear();
    		getBoards().addAll((Collection) newValue);
    		return;
    	case org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		getSketches().clear();
    		getSketches().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }

@Override
public void execute() {
	// TODO Auto-generated method stub
	
}

@Override
public void main() {
	// TODO Auto-generated method stub
	
}

@Override
public void initializeModel(EList<String> args) {
	// TODO Auto-generated method stub
	
}
}

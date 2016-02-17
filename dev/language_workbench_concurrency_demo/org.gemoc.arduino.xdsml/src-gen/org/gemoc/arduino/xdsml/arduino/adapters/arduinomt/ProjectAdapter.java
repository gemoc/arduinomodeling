package org.gemoc.arduino.xdsml.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Project;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Board;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Link;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements org.gemoc.arduino.xdsml.arduinomt.arduino.Project {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
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
  
  private EList<Board> boards;
  
  @Override
  public EList<Board> getBoards() {
    if (boards == null)
    	boards = EListAdapter.newInstance(adaptee.getBoards(), adaptersFactory) ;
    return boards;
  }
  
  private Sketch sketch;
  
  @Override
  public Sketch getSketch() {
    return (Sketch) adaptersFactory.createAdapter(adaptee.getSketch(), eResource) ;
  }
  
  @Override
  public void setSketch(final Sketch o) {
    if (o != null)
    	adaptee.setSketch(((org.gemoc.arduino.xdsml.arduino.adapters.arduinomt.SketchAdapter) o).getAdaptee()) ;
    else adaptee.setSketch(null) ;
  }
  
  private EList<Link> links;
  
  @Override
  public EList<Link> getLinks() {
    if (links == null)
    	links = EListAdapter.newInstance(adaptee.getLinks(), adaptersFactory) ;
    return links;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void main() {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.main(adaptee) ;
  }
  
  @Override
  public void setup() {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.setup(adaptee) ;
  }
  
  public void initializeModel(final java.util.List<java.lang.String> args) {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.initializeModel(adaptee, args
    ) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__NAME:
    		return getName();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		return getSketch();
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__LINKS:
    		return getLinks();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__NAME:
    		setName((String) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		getBoards().clear();
    		getBoards().addAll((Collection<? extends Board>) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch((Sketch) newValue);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__LINKS:
    		getLinks().clear();
    		getLinks().addAll((Collection<? extends Link>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__NAME:
    		setName((String) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		getBoards().clear();
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch((Sketch) null);
    		return;
    	case org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage.PROJECT__LINKS:
    		getLinks().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }

@Override
public void initializeModel(EList<String> args) {
	// TODO Auto-generated method stub
	
}
}

package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Project;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Board;
import org.gemoc.arduino.arduinomt.arduino.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements org.gemoc.arduino.arduinomt.arduino.Project {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
  }
  
  private Board board;
  
  @Override
  public Board getBoard() {
    return (Board) adaptersFactory.createAdapter(adaptee.getBoard(), eResource) ;
  }
  
  @Override
  public void setBoard(final Board o) {
    if (o != null)
    	adaptee.setBoard(((org.gemoc.arduino.arduino.adapters.arduinomt.BoardAdapter) o).getAdaptee()) ;
    else adaptee.setBoard(null) ;
  }
  
  private Sketch sketch;
  
  @Override
  public Sketch getSketch() {
    return (Sketch) adaptersFactory.createAdapter(adaptee.getSketch(), eResource) ;
  }
  
  @Override
  public void setSketch(final Sketch o) {
    if (o != null)
    	adaptee.setSketch(((org.gemoc.arduino.arduino.adapters.arduinomt.SketchAdapter) o).getAdaptee()) ;
    else adaptee.setSketch(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.PROJECT__BOARD:
    		return getBoard();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		return getSketch();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.PROJECT__BOARD:
    		setBoard((org.gemoc.arduino.arduinomt.arduino.Board) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch((org.gemoc.arduino.arduinomt.arduino.Sketch) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.PROJECT__BOARD:
    		setBoard((org.gemoc.arduino.arduinomt.arduino.Board) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.PROJECT__SKETCH:
    		setSketch((org.gemoc.arduino.arduinomt.arduino.Sketch) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

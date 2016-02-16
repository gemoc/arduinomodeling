package org.gemoc.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Sketch;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.arduinomt.arduino.Block;
import org.gemoc.arduino.arduinomt.arduino.Project;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements org.gemoc.arduino.arduinomt.arduino.Sketch {
  private org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
    super(org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.gemoc.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance() ;
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
    	adaptee.setProject(((org.gemoc.arduino.arduino.adapters.arduinomt.ProjectAdapter) o).getAdaptee()) ;
    else adaptee.setProject(null) ;
  }
  
  private Block block;
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource) ;
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.arduino.adapters.arduinomt.BlockAdapter) o).getAdaptee()) ;
    else adaptee.setBlock(null) ;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.eINSTANCE.getSketch();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		return getProject();
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		setProject((org.gemoc.arduino.arduinomt.arduino.Project) newValue);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName((java.lang.String) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		setProject((org.gemoc.arduino.arduinomt.arduino.Project) null);
    		return;
    	case org.gemoc.arduino.arduinomt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		setBlock((org.gemoc.arduino.arduinomt.arduino.Block) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}

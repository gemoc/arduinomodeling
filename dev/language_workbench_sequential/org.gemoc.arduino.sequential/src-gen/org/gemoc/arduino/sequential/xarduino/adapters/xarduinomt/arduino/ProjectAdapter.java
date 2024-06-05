package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Board;
import org.gemoc.arduino.sequential.xarduinomt.arduino.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements org.gemoc.arduino.sequential.xarduinomt.arduino.Project {
  private XArduinoMTAdaptersFactory adaptersFactory;

  public ProjectAdapter() {
    super(org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory.getInstance();
  }

  private EList<Board> boards_;

  @Override
  public EList<Board> getBoards() {
    if (boards_ == null)
    	boards_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBoards(), adaptersFactory, eResource);
    return boards_;
  }

  private EList<Sketch> sketches_;

  @Override
  public EList<Sketch> getSketches() {
    if (sketches_ == null)
    	sketches_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSketches(), adaptersFactory, eResource);
    return sketches_;
  }

  @Override
  public void execute() {
    org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspect.execute(adaptee);
  }

  @Override
  public void initializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspect.initializeModel(adaptee, args
    );
  }

  @Override
  public void main() {
    org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspect.main(adaptee);
  }

  @Override
  public void setup() {
    org.gemoc.arduino.sequential.xarduino.aspects.Project_ExecutableAspect.setup(adaptee);
  }

  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }

  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		return getSketches();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }

  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards() != null && !getBoards().isEmpty();
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		return getSketches() != null && !getSketches().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }

  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		getBoards().clear();
    		getBoards().addAll((Collection) newValue);
    		return;
    	case org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		getSketches().clear();
    		getSketches().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

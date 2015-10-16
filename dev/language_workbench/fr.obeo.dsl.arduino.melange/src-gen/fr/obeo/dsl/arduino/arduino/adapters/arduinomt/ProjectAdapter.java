package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Hardware;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.Platform;
import fr.obeo.dsl.arduino.arduinomt.Sketch;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements fr.obeo.dsl.arduino.arduinomt.Project {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public Hardware getHardware() {
    return adaptersFactory.createHardwareAdapter(adaptee.getHardware()) ;
  }
  
  @Override
  public void setHardware(final Hardware o) {
    adaptee.setHardware(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.HardwareAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Sketch getSketch() {
    return adaptersFactory.createSketchAdapter(adaptee.getSketch()) ;
  }
  
  @Override
  public void setSketch(final Sketch o) {
    adaptee.setSketch(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SketchAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Module> getModules() {
    return EListAdapter.newInstance(adaptee.getModules(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter.class) ;
  }
  
  @Override
  public EList<Platform> getPlatform() {
    return EListAdapter.newInstance(adaptee.getPlatform(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PlatformAdapter.class) ;
  }
  
  @Override
  public void setup() {
    org.gemoc.arduino.operationalsemantics.Project_SetupAspect.setup(adaptee) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Project_ExecutableAspect.execute(adaptee) ;
  }
}

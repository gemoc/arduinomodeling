package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Hardware;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Connector;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.Platform;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class HardwareAdapter extends EObjectAdapter<Hardware> implements fr.obeo.dsl.arduino.arduinomt.Hardware {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public HardwareAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public EList<Platform> getPlatforms() {
    return EListAdapter.newInstance(adaptee.getPlatforms(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PlatformAdapter.class) ;
  }
  
  @Override
  public EList<Module> getModules() {
    return EListAdapter.newInstance(adaptee.getModules(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter.class) ;
  }
  
  @Override
  public EList<Connector> getConnectors() {
    return EListAdapter.newInstance(adaptee.getConnectors(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConnectorAdapter.class) ;
  }
}

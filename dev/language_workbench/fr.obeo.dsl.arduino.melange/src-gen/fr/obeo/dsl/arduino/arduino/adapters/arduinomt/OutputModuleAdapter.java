package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.OutputModule;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Library;
import fr.obeo.dsl.arduino.arduinomt.ModuleKind;

@SuppressWarnings("all")
public class OutputModuleAdapter extends EObjectAdapter<OutputModule> implements fr.obeo.dsl.arduino.arduinomt.OutputModule {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public OutputModuleAdapter() {
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
  public ModuleKind getKind() {
    return fr.obeo.dsl.arduino.arduinomt.ModuleKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final ModuleKind o) {
    adaptee.setKind(fr.obeo.dsl.arduino.ModuleKind.get(o.getValue())) ;
  }
  
  @Override
  public String getImage() {
    return adaptee.getImage() ;
  }
  
  @Override
  public void setImage(final String o) {
    adaptee.setImage(o) ;
  }
  
  @Override
  public boolean isLevel() {
    return adaptee.isLevel() ;
  }
  
  @Override
  public void setLevel(final boolean o) {
    adaptee.setLevel(o) ;
  }
  
  @Override
  public Library getLibrary() {
    return fr.obeo.dsl.arduino.arduinomt.Library.get(adaptee.getLibrary().getValue());
  }
  
  @Override
  public void setLibrary(final Library o) {
    adaptee.setLibrary(fr.obeo.dsl.arduino.Library.get(o.getValue())) ;
  }
}

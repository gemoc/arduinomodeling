package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Platform;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.AnalogPin;
import fr.obeo.dsl.arduino.arduinomt.DigitalPin;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class PlatformAdapter extends EObjectAdapter<Platform> implements fr.obeo.dsl.arduino.arduinomt.Platform {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public PlatformAdapter() {
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
  public String getImage() {
    return adaptee.getImage() ;
  }
  
  @Override
  public void setImage(final String o) {
    adaptee.setImage(o) ;
  }
  
  @Override
  public EList<DigitalPin> getDigitalPins() {
    return EListAdapter.newInstance(adaptee.getDigitalPins(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DigitalPinAdapter.class) ;
  }
  
  @Override
  public EList<AnalogPin> getAnalogPins() {
    return EListAdapter.newInstance(adaptee.getAnalogPins(), fr.obeo.dsl.arduino.arduino.adapters.arduinomt.AnalogPinAdapter.class) ;
  }
}

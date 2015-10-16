package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.DigitalPin;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;

@SuppressWarnings("all")
public class DigitalPinAdapter extends EObjectAdapter<DigitalPin> implements fr.obeo.dsl.arduino.arduinomt.DigitalPin {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public DigitalPinAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public int getId() {
    return adaptee.getId() ;
  }
  
  @Override
  public void setId(final int o) {
    adaptee.setId(o) ;
  }
  
  @Override
  public Integer getLevel() {
    return org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect.level(adaptee) ;
  }
  
  @Override
  public void setLevel(final Integer level) {
    org.gemoc.arduino.operationalsemantics.Pin_EvaluableAspect.level(adaptee, level
    ) ;
  }
}

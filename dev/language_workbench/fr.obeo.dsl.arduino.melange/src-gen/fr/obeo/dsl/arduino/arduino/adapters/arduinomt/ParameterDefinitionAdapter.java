package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.ParameterDefinition;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.ParameterType;

@SuppressWarnings("all")
public class ParameterDefinitionAdapter extends EObjectAdapter<ParameterDefinition> implements fr.obeo.dsl.arduino.arduinomt.ParameterDefinition {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ParameterDefinitionAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public ParameterType getType() {
    return fr.obeo.dsl.arduino.arduinomt.ParameterType.get(adaptee.getType().getValue());
  }
  
  @Override
  public void setType(final ParameterType o) {
    adaptee.setType(fr.obeo.dsl.arduino.ParameterType.get(o.getValue())) ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
}

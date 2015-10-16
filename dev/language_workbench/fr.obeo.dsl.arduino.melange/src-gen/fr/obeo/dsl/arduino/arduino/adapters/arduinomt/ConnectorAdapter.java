package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.Pin;

@SuppressWarnings("all")
public class ConnectorAdapter extends EObjectAdapter<Connector> implements fr.obeo.dsl.arduino.arduinomt.Connector {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public ConnectorAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public Pin getPin() {
    return adaptersFactory.createPinAdapter(adaptee.getPin()) ;
  }
  
  @Override
  public void setPin(final Pin o) {
    adaptee.setPin(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PinAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Module getModule() {
    return adaptersFactory.createModuleAdapter(adaptee.getModule()) ;
  }
  
  @Override
  public void setModule(final Module o) {
    adaptee.setModule(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
  }
}

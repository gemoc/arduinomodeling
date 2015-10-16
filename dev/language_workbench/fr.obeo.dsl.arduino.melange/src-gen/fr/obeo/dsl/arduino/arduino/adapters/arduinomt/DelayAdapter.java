package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Delay;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import fr.obeo.dsl.arduino.arduinomt.Time;

@SuppressWarnings("all")
public class DelayAdapter extends EObjectAdapter<Delay> implements fr.obeo.dsl.arduino.arduinomt.Delay {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public DelayAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public Time getUnit() {
    return fr.obeo.dsl.arduino.arduinomt.Time.get(adaptee.getUnit().getValue());
  }
  
  @Override
  public void setUnit(final Time o) {
    adaptee.setUnit(fr.obeo.dsl.arduino.Time.get(o.getValue())) ;
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue() ;
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o) ;
  }
  
  @Override
  public Instruction getPrevious() {
    return adaptersFactory.createInstructionAdapter(adaptee.getPrevious()) ;
  }
  
  @Override
  public void setPrevious(final Instruction o) {
    adaptee.setPrevious(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Instruction getNext() {
    return adaptersFactory.createInstructionAdapter(adaptee.getNext()) ;
  }
  
  @Override
  public void setNext(final Instruction o) {
    adaptee.setNext(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public ParameterDefinition getDefinition() {
    return adaptersFactory.createParameterDefinitionAdapter(adaptee.getDefinition()) ;
  }
  
  @Override
  public void setDefinition(final ParameterDefinition o) {
    adaptee.setDefinition(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Delay_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public void call() {
    org.gemoc.arduino.operationalsemantics.Utilities_CallableAspect.call(adaptee) ;
  }
}

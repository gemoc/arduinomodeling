package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Status;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Instruction;
import fr.obeo.dsl.arduino.arduinomt.Module;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import fr.obeo.dsl.arduino.arduinomt.Sensor;

@SuppressWarnings("all")
public class StatusAdapter extends EObjectAdapter<Status> implements fr.obeo.dsl.arduino.arduinomt.Status {
  private ArduinoMTAdaptersFactory adaptersFactory;
  
  public StatusAdapter() {
    super(fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public boolean isStatus() {
    return adaptee.isStatus() ;
  }
  
  @Override
  public void setStatus(final boolean o) {
    adaptee.setStatus(o) ;
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
  public Module getModule() {
    return adaptersFactory.createModuleAdapter(adaptee.getModule()) ;
  }
  
  @Override
  public void setModule(final Module o) {
    adaptee.setModule(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public Sensor getSensor() {
    return adaptersFactory.createSensorAdapter(adaptee.getSensor()) ;
  }
  
  @Override
  public void setSensor(final Sensor o) {
    adaptee.setSensor(((fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SensorAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public void call() {
    org.gemoc.arduino.operationalsemantics.Status_CallableAspect.call(adaptee) ;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.operationalsemantics.Status_ExecutableAspect.execute(adaptee) ;
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluate(adaptee) ;
  }
  
  @Override
  public Number evaluateAsNumber() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluateAsNumber(adaptee) ;
  }
  
  @Override
  public Boolean evaluateAsBoolean() {
    return org.gemoc.arduino.operationalsemantics.Expression_EvaluableAspect.evaluateAsBoolean(adaptee) ;
  }
}

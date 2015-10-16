package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.obeo.dsl.arduino.ArduinoFactory;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.AnalogPin;
import fr.obeo.dsl.arduino.arduinomt.ArduinoMTFactory;
import fr.obeo.dsl.arduino.arduinomt.BooleanOperator;
import fr.obeo.dsl.arduino.arduinomt.Connector;
import fr.obeo.dsl.arduino.arduinomt.Constant;
import fr.obeo.dsl.arduino.arduinomt.Delay;
import fr.obeo.dsl.arduino.arduinomt.DigitalPin;
import fr.obeo.dsl.arduino.arduinomt.Function;
import fr.obeo.dsl.arduino.arduinomt.FunctionCall;
import fr.obeo.dsl.arduino.arduinomt.Hardware;
import fr.obeo.dsl.arduino.arduinomt.If;
import fr.obeo.dsl.arduino.arduinomt.InputModule;
import fr.obeo.dsl.arduino.arduinomt.Level;
import fr.obeo.dsl.arduino.arduinomt.NumericalOperator;
import fr.obeo.dsl.arduino.arduinomt.OutputModule;
import fr.obeo.dsl.arduino.arduinomt.ParameterCall;
import fr.obeo.dsl.arduino.arduinomt.ParameterDefinition;
import fr.obeo.dsl.arduino.arduinomt.Platform;
import fr.obeo.dsl.arduino.arduinomt.Project;
import fr.obeo.dsl.arduino.arduinomt.Repeat;
import fr.obeo.dsl.arduino.arduinomt.Sensor;
import fr.obeo.dsl.arduino.arduinomt.Set;
import fr.obeo.dsl.arduino.arduinomt.Sketch;
import fr.obeo.dsl.arduino.arduinomt.Status;
import fr.obeo.dsl.arduino.arduinomt.Variable;
import fr.obeo.dsl.arduino.arduinomt.While;

@SuppressWarnings("all")
public class ArduinoMTFactoryAdapter implements ArduinoMTFactory {
  private ArduinoMTAdaptersFactory adaptersFactory = fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  
  private ArduinoFactory arduinoAdaptee = fr.obeo.dsl.arduino.ArduinoFactory.eINSTANCE;
  
  @Override
  public Hardware createHardware() {
    return adaptersFactory.createHardwareAdapter(arduinoAdaptee.createHardware()) ;
  }
  
  @Override
  public Platform createPlatform() {
    return adaptersFactory.createPlatformAdapter(arduinoAdaptee.createPlatform()) ;
  }
  
  @Override
  public DigitalPin createDigitalPin() {
    return adaptersFactory.createDigitalPinAdapter(arduinoAdaptee.createDigitalPin()) ;
  }
  
  @Override
  public AnalogPin createAnalogPin() {
    return adaptersFactory.createAnalogPinAdapter(arduinoAdaptee.createAnalogPin()) ;
  }
  
  @Override
  public Sketch createSketch() {
    return adaptersFactory.createSketchAdapter(arduinoAdaptee.createSketch()) ;
  }
  
  @Override
  public Project createProject() {
    return adaptersFactory.createProjectAdapter(arduinoAdaptee.createProject()) ;
  }
  
  @Override
  public Status createStatus() {
    return adaptersFactory.createStatusAdapter(arduinoAdaptee.createStatus()) ;
  }
  
  @Override
  public Level createLevel() {
    return adaptersFactory.createLevelAdapter(arduinoAdaptee.createLevel()) ;
  }
  
  @Override
  public Delay createDelay() {
    return adaptersFactory.createDelayAdapter(arduinoAdaptee.createDelay()) ;
  }
  
  @Override
  public InputModule createInputModule() {
    return adaptersFactory.createInputModuleAdapter(arduinoAdaptee.createInputModule()) ;
  }
  
  @Override
  public OutputModule createOutputModule() {
    return adaptersFactory.createOutputModuleAdapter(arduinoAdaptee.createOutputModule()) ;
  }
  
  @Override
  public Connector createConnector() {
    return adaptersFactory.createConnectorAdapter(arduinoAdaptee.createConnector()) ;
  }
  
  @Override
  public Repeat createRepeat() {
    return adaptersFactory.createRepeatAdapter(arduinoAdaptee.createRepeat()) ;
  }
  
  @Override
  public Sensor createSensor() {
    return adaptersFactory.createSensorAdapter(arduinoAdaptee.createSensor()) ;
  }
  
  @Override
  public While createWhile() {
    return adaptersFactory.createWhileAdapter(arduinoAdaptee.createWhile()) ;
  }
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(arduinoAdaptee.createVariable()) ;
  }
  
  @Override
  public Set createSet() {
    return adaptersFactory.createSetAdapter(arduinoAdaptee.createSet()) ;
  }
  
  @Override
  public NumericalOperator createNumericalOperator() {
    return adaptersFactory.createNumericalOperatorAdapter(arduinoAdaptee.createNumericalOperator()) ;
  }
  
  @Override
  public BooleanOperator createBooleanOperator() {
    return adaptersFactory.createBooleanOperatorAdapter(arduinoAdaptee.createBooleanOperator()) ;
  }
  
  @Override
  public Constant createConstant() {
    return adaptersFactory.createConstantAdapter(arduinoAdaptee.createConstant()) ;
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(arduinoAdaptee.createIf()) ;
  }
  
  @Override
  public Function createFunction() {
    return adaptersFactory.createFunctionAdapter(arduinoAdaptee.createFunction()) ;
  }
  
  @Override
  public ParameterDefinition createParameterDefinition() {
    return adaptersFactory.createParameterDefinitionAdapter(arduinoAdaptee.createParameterDefinition()) ;
  }
  
  @Override
  public FunctionCall createFunctionCall() {
    return adaptersFactory.createFunctionCallAdapter(arduinoAdaptee.createFunctionCall()) ;
  }
  
  @Override
  public ParameterCall createParameterCall() {
    return adaptersFactory.createParameterCallAdapter(arduinoAdaptee.createParameterCall()) ;
  }
}

package fr.obeo.dsl.arduino.arduinomt;

import fr.inria.diverse.melange.lib.IFactory;
import fr.obeo.dsl.arduino.arduinomt.AnalogPin;
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
public interface ArduinoMTFactory extends IFactory {
  public abstract Hardware createHardware();
  
  public abstract Platform createPlatform();
  
  public abstract DigitalPin createDigitalPin();
  
  public abstract AnalogPin createAnalogPin();
  
  public abstract Sketch createSketch();
  
  public abstract Project createProject();
  
  public abstract Status createStatus();
  
  public abstract Level createLevel();
  
  public abstract Delay createDelay();
  
  public abstract InputModule createInputModule();
  
  public abstract OutputModule createOutputModule();
  
  public abstract Connector createConnector();
  
  public abstract Repeat createRepeat();
  
  public abstract Sensor createSensor();
  
  public abstract While createWhile();
  
  public abstract Variable createVariable();
  
  public abstract Set createSet();
  
  public abstract NumericalOperator createNumericalOperator();
  
  public abstract BooleanOperator createBooleanOperator();
  
  public abstract Constant createConstant();
  
  public abstract If createIf();
  
  public abstract Function createFunction();
  
  public abstract ParameterDefinition createParameterDefinition();
  
  public abstract FunctionCall createFunctionCall();
  
  public abstract ParameterCall createParameterCall();
}

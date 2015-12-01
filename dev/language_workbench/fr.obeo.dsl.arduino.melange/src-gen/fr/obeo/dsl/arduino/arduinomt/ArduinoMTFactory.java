package fr.obeo.dsl.arduino.arduinomt;

import fr.inria.diverse.melange.lib.IFactory;
import fr.obeo.dsl.arduino.arduinomt.Actuator;
import fr.obeo.dsl.arduino.arduinomt.AnalogPin;
import fr.obeo.dsl.arduino.arduinomt.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.arduinomt.BinaryIntegerExpression;
import fr.obeo.dsl.arduino.arduinomt.BooleanConstant;
import fr.obeo.dsl.arduino.arduinomt.BooleanModuleGet;
import fr.obeo.dsl.arduino.arduinomt.BooleanVariable;
import fr.obeo.dsl.arduino.arduinomt.Connector;
import fr.obeo.dsl.arduino.arduinomt.Delay;
import fr.obeo.dsl.arduino.arduinomt.DigitalPin;
import fr.obeo.dsl.arduino.arduinomt.Hardware;
import fr.obeo.dsl.arduino.arduinomt.If;
import fr.obeo.dsl.arduino.arduinomt.IntegerConstant;
import fr.obeo.dsl.arduino.arduinomt.IntegerModuleGet;
import fr.obeo.dsl.arduino.arduinomt.IntegerVariable;
import fr.obeo.dsl.arduino.arduinomt.ModuleAssignment;
import fr.obeo.dsl.arduino.arduinomt.Platform;
import fr.obeo.dsl.arduino.arduinomt.Project;
import fr.obeo.dsl.arduino.arduinomt.Repeat;
import fr.obeo.dsl.arduino.arduinomt.Sensor;
import fr.obeo.dsl.arduino.arduinomt.Sketch;
import fr.obeo.dsl.arduino.arduinomt.UnaryBooleanExpression;
import fr.obeo.dsl.arduino.arduinomt.UnaryIntegerExpression;
import fr.obeo.dsl.arduino.arduinomt.VariableAssignment;
import fr.obeo.dsl.arduino.arduinomt.VariableDeclaration;
import fr.obeo.dsl.arduino.arduinomt.VariableRef;
import fr.obeo.dsl.arduino.arduinomt.While;

@SuppressWarnings("all")
public interface ArduinoMTFactory extends IFactory {
  public abstract Hardware createHardware();
  
  public abstract Platform createPlatform();
  
  public abstract DigitalPin createDigitalPin();
  
  public abstract AnalogPin createAnalogPin();
  
  public abstract Sketch createSketch();
  
  public abstract Project createProject();
  
  public abstract ModuleAssignment createModuleAssignment();
  
  public abstract Delay createDelay();
  
  public abstract Sensor createSensor();
  
  public abstract Actuator createActuator();
  
  public abstract Connector createConnector();
  
  public abstract Repeat createRepeat();
  
  public abstract While createWhile();
  
  public abstract VariableAssignment createVariableAssignment();
  
  public abstract BinaryIntegerExpression createBinaryIntegerExpression();
  
  public abstract BinaryBooleanExpression createBinaryBooleanExpression();
  
  public abstract If createIf();
  
  public abstract IntegerConstant createIntegerConstant();
  
  public abstract BooleanConstant createBooleanConstant();
  
  public abstract IntegerVariable createIntegerVariable();
  
  public abstract BooleanVariable createBooleanVariable();
  
  public abstract BooleanModuleGet createBooleanModuleGet();
  
  public abstract IntegerModuleGet createIntegerModuleGet();
  
  public abstract UnaryBooleanExpression createUnaryBooleanExpression();
  
  public abstract UnaryIntegerExpression createUnaryIntegerExpression();
  
  public abstract VariableDeclaration createVariableDeclaration();
  
  public abstract VariableRef createVariableRef();
}

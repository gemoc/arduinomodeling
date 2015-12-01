package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.obeo.dsl.arduino.ArduinoFactory;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import fr.obeo.dsl.arduino.arduinomt.Actuator;
import fr.obeo.dsl.arduino.arduinomt.AnalogPin;
import fr.obeo.dsl.arduino.arduinomt.ArduinoMTFactory;
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
  public ModuleAssignment createModuleAssignment() {
    return adaptersFactory.createModuleAssignmentAdapter(arduinoAdaptee.createModuleAssignment()) ;
  }
  
  @Override
  public Delay createDelay() {
    return adaptersFactory.createDelayAdapter(arduinoAdaptee.createDelay()) ;
  }
  
  @Override
  public Sensor createSensor() {
    return adaptersFactory.createSensorAdapter(arduinoAdaptee.createSensor()) ;
  }
  
  @Override
  public Actuator createActuator() {
    return adaptersFactory.createActuatorAdapter(arduinoAdaptee.createActuator()) ;
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
  public While createWhile() {
    return adaptersFactory.createWhileAdapter(arduinoAdaptee.createWhile()) ;
  }
  
  @Override
  public VariableAssignment createVariableAssignment() {
    return adaptersFactory.createVariableAssignmentAdapter(arduinoAdaptee.createVariableAssignment()) ;
  }
  
  @Override
  public BinaryIntegerExpression createBinaryIntegerExpression() {
    return adaptersFactory.createBinaryIntegerExpressionAdapter(arduinoAdaptee.createBinaryIntegerExpression()) ;
  }
  
  @Override
  public BinaryBooleanExpression createBinaryBooleanExpression() {
    return adaptersFactory.createBinaryBooleanExpressionAdapter(arduinoAdaptee.createBinaryBooleanExpression()) ;
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(arduinoAdaptee.createIf()) ;
  }
  
  @Override
  public IntegerConstant createIntegerConstant() {
    return adaptersFactory.createIntegerConstantAdapter(arduinoAdaptee.createIntegerConstant()) ;
  }
  
  @Override
  public BooleanConstant createBooleanConstant() {
    return adaptersFactory.createBooleanConstantAdapter(arduinoAdaptee.createBooleanConstant()) ;
  }
  
  @Override
  public IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(arduinoAdaptee.createIntegerVariable()) ;
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(arduinoAdaptee.createBooleanVariable()) ;
  }
  
  @Override
  public BooleanModuleGet createBooleanModuleGet() {
    return adaptersFactory.createBooleanModuleGetAdapter(arduinoAdaptee.createBooleanModuleGet()) ;
  }
  
  @Override
  public IntegerModuleGet createIntegerModuleGet() {
    return adaptersFactory.createIntegerModuleGetAdapter(arduinoAdaptee.createIntegerModuleGet()) ;
  }
  
  @Override
  public UnaryBooleanExpression createUnaryBooleanExpression() {
    return adaptersFactory.createUnaryBooleanExpressionAdapter(arduinoAdaptee.createUnaryBooleanExpression()) ;
  }
  
  @Override
  public UnaryIntegerExpression createUnaryIntegerExpression() {
    return adaptersFactory.createUnaryIntegerExpressionAdapter(arduinoAdaptee.createUnaryIntegerExpression()) ;
  }
  
  @Override
  public VariableDeclaration createVariableDeclaration() {
    return adaptersFactory.createVariableDeclarationAdapter(arduinoAdaptee.createVariableDeclaration()) ;
  }
  
  @Override
  public VariableRef createVariableRef() {
    return adaptersFactory.createVariableRefAdapter(arduinoAdaptee.createVariableRef()) ;
  }
}

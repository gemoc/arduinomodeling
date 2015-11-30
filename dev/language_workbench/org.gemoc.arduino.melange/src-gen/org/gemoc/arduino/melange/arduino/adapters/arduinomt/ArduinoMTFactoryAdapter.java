package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.Actuator;
import org.gemoc.arduino.melange.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.melange.arduinomt.arduino.ArduinoFactory;
import org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.melange.arduinomt.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.melange.arduinomt.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.melange.arduinomt.arduino.BooleanConstant;
import org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet;
import org.gemoc.arduino.melange.arduinomt.arduino.BooleanVariable;
import org.gemoc.arduino.melange.arduinomt.arduino.Connector;
import org.gemoc.arduino.melange.arduinomt.arduino.Delay;
import org.gemoc.arduino.melange.arduinomt.arduino.DigitalPin;
import org.gemoc.arduino.melange.arduinomt.arduino.Hardware;
import org.gemoc.arduino.melange.arduinomt.arduino.If;
import org.gemoc.arduino.melange.arduinomt.arduino.IntegerConstant;
import org.gemoc.arduino.melange.arduinomt.arduino.IntegerModuleGet;
import org.gemoc.arduino.melange.arduinomt.arduino.IntegerVariable;
import org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment;
import org.gemoc.arduino.melange.arduinomt.arduino.Platform;
import org.gemoc.arduino.melange.arduinomt.arduino.Project;
import org.gemoc.arduino.melange.arduinomt.arduino.Repeat;
import org.gemoc.arduino.melange.arduinomt.arduino.Sensor;
import org.gemoc.arduino.melange.arduinomt.arduino.Sketch;
import org.gemoc.arduino.melange.arduinomt.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.melange.arduinomt.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.melange.arduinomt.arduino.VariableAssignment;
import org.gemoc.arduino.melange.arduinomt.arduino.VariableDeclaration;
import org.gemoc.arduino.melange.arduinomt.arduino.VariableRef;
import org.gemoc.arduino.melange.arduinomt.arduino.While;

@SuppressWarnings("all")
public class ArduinoMTFactoryAdapter extends EFactoryImpl implements ArduinoFactory {
  private ArduinoMTAdaptersFactory adaptersFactory = org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  
  private fr.obeo.dsl.arduino.ArduinoFactory arduinoAdaptee = fr.obeo.dsl.arduino.ArduinoFactory.eINSTANCE;
  
  @Override
  public Hardware createHardware() {
    return adaptersFactory.createHardwareAdapter(arduinoAdaptee.createHardware(), null) ;
  }
  
  @Override
  public Platform createPlatform() {
    return adaptersFactory.createPlatformAdapter(arduinoAdaptee.createPlatform(), null) ;
  }
  
  @Override
  public DigitalPin createDigitalPin() {
    return adaptersFactory.createDigitalPinAdapter(arduinoAdaptee.createDigitalPin(), null) ;
  }
  
  @Override
  public AnalogPin createAnalogPin() {
    return adaptersFactory.createAnalogPinAdapter(arduinoAdaptee.createAnalogPin(), null) ;
  }
  
  @Override
  public Sketch createSketch() {
    return adaptersFactory.createSketchAdapter(arduinoAdaptee.createSketch(), null) ;
  }
  
  @Override
  public Project createProject() {
    return adaptersFactory.createProjectAdapter(arduinoAdaptee.createProject(), null) ;
  }
  
  @Override
  public ModuleAssignment createModuleAssignment() {
    return adaptersFactory.createModuleAssignmentAdapter(arduinoAdaptee.createModuleAssignment(), null) ;
  }
  
  @Override
  public Delay createDelay() {
    return adaptersFactory.createDelayAdapter(arduinoAdaptee.createDelay(), null) ;
  }
  
  @Override
  public Sensor createSensor() {
    return adaptersFactory.createSensorAdapter(arduinoAdaptee.createSensor(), null) ;
  }
  
  @Override
  public Actuator createActuator() {
    return adaptersFactory.createActuatorAdapter(arduinoAdaptee.createActuator(), null) ;
  }
  
  @Override
  public Connector createConnector() {
    return adaptersFactory.createConnectorAdapter(arduinoAdaptee.createConnector(), null) ;
  }
  
  @Override
  public Repeat createRepeat() {
    return adaptersFactory.createRepeatAdapter(arduinoAdaptee.createRepeat(), null) ;
  }
  
  @Override
  public While createWhile() {
    return adaptersFactory.createWhileAdapter(arduinoAdaptee.createWhile(), null) ;
  }
  
  @Override
  public VariableAssignment createVariableAssignment() {
    return adaptersFactory.createVariableAssignmentAdapter(arduinoAdaptee.createVariableAssignment(), null) ;
  }
  
  @Override
  public BinaryIntegerExpression createBinaryIntegerExpression() {
    return adaptersFactory.createBinaryIntegerExpressionAdapter(arduinoAdaptee.createBinaryIntegerExpression(), null) ;
  }
  
  @Override
  public BinaryBooleanExpression createBinaryBooleanExpression() {
    return adaptersFactory.createBinaryBooleanExpressionAdapter(arduinoAdaptee.createBinaryBooleanExpression(), null) ;
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(arduinoAdaptee.createIf(), null) ;
  }
  
  @Override
  public IntegerConstant createIntegerConstant() {
    return adaptersFactory.createIntegerConstantAdapter(arduinoAdaptee.createIntegerConstant(), null) ;
  }
  
  @Override
  public BooleanConstant createBooleanConstant() {
    return adaptersFactory.createBooleanConstantAdapter(arduinoAdaptee.createBooleanConstant(), null) ;
  }
  
  @Override
  public IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(arduinoAdaptee.createIntegerVariable(), null) ;
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(arduinoAdaptee.createBooleanVariable(), null) ;
  }
  
  @Override
  public BooleanModuleGet createBooleanModuleGet() {
    return adaptersFactory.createBooleanModuleGetAdapter(arduinoAdaptee.createBooleanModuleGet(), null) ;
  }
  
  @Override
  public IntegerModuleGet createIntegerModuleGet() {
    return adaptersFactory.createIntegerModuleGetAdapter(arduinoAdaptee.createIntegerModuleGet(), null) ;
  }
  
  @Override
  public UnaryBooleanExpression createUnaryBooleanExpression() {
    return adaptersFactory.createUnaryBooleanExpressionAdapter(arduinoAdaptee.createUnaryBooleanExpression(), null) ;
  }
  
  @Override
  public UnaryIntegerExpression createUnaryIntegerExpression() {
    return adaptersFactory.createUnaryIntegerExpressionAdapter(arduinoAdaptee.createUnaryIntegerExpression(), null) ;
  }
  
  @Override
  public VariableDeclaration createVariableDeclaration() {
    return adaptersFactory.createVariableDeclarationAdapter(arduinoAdaptee.createVariableDeclaration(), null) ;
  }
  
  @Override
  public VariableRef createVariableRef() {
    return adaptersFactory.createVariableRefAdapter(arduinoAdaptee.createVariableRef(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getArduinoPackage();
  }
  
  public ArduinoPackage getArduinoPackage() {
    return org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE;
  }
}

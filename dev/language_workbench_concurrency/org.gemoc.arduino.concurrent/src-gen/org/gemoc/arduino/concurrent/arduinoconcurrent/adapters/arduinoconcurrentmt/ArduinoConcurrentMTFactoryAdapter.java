package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.AmbientLightSensor;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.AnalogPin;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoBoard;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Block;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Buzzer;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Delay;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.DigitalPin;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Fan;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.If;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.InfraRedSensor;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerConstant;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.IntegerVariableRef;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.LED;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.MicroServo;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ModuleAssignment;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.MusicPlayer;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Project;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.PushButton;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Repeat;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.RotationSensor;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.Sketch;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.SoundSensor;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.VariableAssignment;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.VariableDeclaration;
import org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.While;

@SuppressWarnings("all")
public class ArduinoConcurrentMTFactoryAdapter extends EFactoryImpl implements ArduinoFactory {
  private ArduinoConcurrentMTAdaptersFactory adaptersFactory = org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory.getInstance();
  
  private org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory arduinoAdaptee = org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory.eINSTANCE;
  
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
  public IntegerVariableRef createIntegerVariableRef() {
    return adaptersFactory.createIntegerVariableRefAdapter(arduinoAdaptee.createIntegerVariableRef(), null) ;
  }
  
  @Override
  public LED createLED() {
    return adaptersFactory.createLEDAdapter(arduinoAdaptee.createLED(), null) ;
  }
  
  @Override
  public PushButton createPushButton() {
    return adaptersFactory.createPushButtonAdapter(arduinoAdaptee.createPushButton(), null) ;
  }
  
  @Override
  public Buzzer createBuzzer() {
    return adaptersFactory.createBuzzerAdapter(arduinoAdaptee.createBuzzer(), null) ;
  }
  
  @Override
  public RotationSensor createRotationSensor() {
    return adaptersFactory.createRotationSensorAdapter(arduinoAdaptee.createRotationSensor(), null) ;
  }
  
  @Override
  public MicroServo createMicroServo() {
    return adaptersFactory.createMicroServoAdapter(arduinoAdaptee.createMicroServo(), null) ;
  }
  
  @Override
  public InfraRedSensor createInfraRedSensor() {
    return adaptersFactory.createInfraRedSensorAdapter(arduinoAdaptee.createInfraRedSensor(), null) ;
  }
  
  @Override
  public AmbientLightSensor createAmbientLightSensor() {
    return adaptersFactory.createAmbientLightSensorAdapter(arduinoAdaptee.createAmbientLightSensor(), null) ;
  }
  
  @Override
  public SoundSensor createSoundSensor() {
    return adaptersFactory.createSoundSensorAdapter(arduinoAdaptee.createSoundSensor(), null) ;
  }
  
  @Override
  public Fan createFan() {
    return adaptersFactory.createFanAdapter(arduinoAdaptee.createFan(), null) ;
  }
  
  @Override
  public MusicPlayer createMusicPlayer() {
    return adaptersFactory.createMusicPlayerAdapter(arduinoAdaptee.createMusicPlayer(), null) ;
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(arduinoAdaptee.createBlock(), null) ;
  }
  
  @Override
  public ArduinoBoard createArduinoBoard() {
    return adaptersFactory.createArduinoBoardAdapter(arduinoAdaptee.createArduinoBoard(), null) ;
  }
  
  @Override
  public BooleanVariableRef createBooleanVariableRef() {
    return adaptersFactory.createBooleanVariableRefAdapter(arduinoAdaptee.createBooleanVariableRef(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getArduinoPackage();
  }
  
  public ArduinoPackage getArduinoPackage() {
    return org.gemoc.arduino.concurrent.arduinoconcurrentmt.arduino.ArduinoPackage.eINSTANCE;
  }
}

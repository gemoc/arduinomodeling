package org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AmbientLightSensorAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AnalogPinAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoAnalogModuleAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoBoardAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoDigitalModuleAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoModuleAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AssignmentAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryBooleanExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryIntegerExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BlockAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BoardAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanConstantAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanModuleGetAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableRefAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BuzzerAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ConstantAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ControlAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DelayAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DigitalPinAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.FanAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IfAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InfraRedSensorAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InstructionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerConstantAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerModuleGetAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableRefAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.LEDAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MicroServoAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAssignmentAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleGetAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleInstructionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MusicPlayerAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.NamedElementAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PinAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ProjectAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PushButtonAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RepeatAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RotationSensorAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SketchAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SoundSensorAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryBooleanExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryIntegerExpressionAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UtilitiesAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAssignmentAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableDeclarationAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableRefAdapter;
import org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.WhileAdapter;
import org.gemoc.arduino.concurrent.execarduino.arduino.AmbientLightSensor;
import org.gemoc.arduino.concurrent.execarduino.arduino.AnalogPin;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoBoard;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoModule;
import org.gemoc.arduino.concurrent.execarduino.arduino.Assignment;
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.Block;
import org.gemoc.arduino.concurrent.execarduino.arduino.Board;
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanConstant;
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariable;
import org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.concurrent.execarduino.arduino.Buzzer;
import org.gemoc.arduino.concurrent.execarduino.arduino.Constant;
import org.gemoc.arduino.concurrent.execarduino.arduino.Control;
import org.gemoc.arduino.concurrent.execarduino.arduino.Delay;
import org.gemoc.arduino.concurrent.execarduino.arduino.DigitalPin;
import org.gemoc.arduino.concurrent.execarduino.arduino.Expression;
import org.gemoc.arduino.concurrent.execarduino.arduino.Fan;
import org.gemoc.arduino.concurrent.execarduino.arduino.If;
import org.gemoc.arduino.concurrent.execarduino.arduino.InfraRedSensor;
import org.gemoc.arduino.concurrent.execarduino.arduino.Instruction;
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerConstant;
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariable;
import org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.concurrent.execarduino.arduino.LED;
import org.gemoc.arduino.concurrent.execarduino.arduino.MicroServo;
import org.gemoc.arduino.concurrent.execarduino.arduino.Module;
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleGet;
import org.gemoc.arduino.concurrent.execarduino.arduino.ModuleInstruction;
import org.gemoc.arduino.concurrent.execarduino.arduino.MusicPlayer;
import org.gemoc.arduino.concurrent.execarduino.arduino.NamedElement;
import org.gemoc.arduino.concurrent.execarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.execarduino.arduino.Project;
import org.gemoc.arduino.concurrent.execarduino.arduino.PushButton;
import org.gemoc.arduino.concurrent.execarduino.arduino.Repeat;
import org.gemoc.arduino.concurrent.execarduino.arduino.RotationSensor;
import org.gemoc.arduino.concurrent.execarduino.arduino.Sketch;
import org.gemoc.arduino.concurrent.execarduino.arduino.SoundSensor;
import org.gemoc.arduino.concurrent.execarduino.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.UnaryExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.concurrent.execarduino.arduino.Utilities;
import org.gemoc.arduino.concurrent.execarduino.arduino.Variable;
import org.gemoc.arduino.concurrent.execarduino.arduino.VariableAssignment;
import org.gemoc.arduino.concurrent.execarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.concurrent.execarduino.arduino.VariableRef;
import org.gemoc.arduino.concurrent.execarduino.arduino.While;

@SuppressWarnings("all")
public class ArduinoConcurrentMTAdaptersFactory implements AdaptersFactory {
  private static ArduinoConcurrentMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ArduinoConcurrentMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static ArduinoConcurrentMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoConcurrentMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.DigitalPin){
    	return createDigitalPinAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.DigitalPin) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.AnalogPin){
    	return createAnalogPinAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.AnalogPin) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Sketch){
    	return createSketchAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Sketch) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Project){
    	return createProjectAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Project) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.ModuleAssignment){
    	return createModuleAssignmentAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.ModuleAssignment) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Delay){
    	return createDelayAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Delay) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Repeat){
    	return createRepeatAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Repeat) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.While){
    	return createWhileAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.While) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.VariableAssignment){
    	return createVariableAssignmentAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.VariableAssignment) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.BinaryIntegerExpression){
    	return createBinaryIntegerExpressionAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.BinaryIntegerExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.BinaryBooleanExpression){
    	return createBinaryBooleanExpressionAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.BinaryBooleanExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.If){
    	return createIfAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.If) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.IntegerConstant){
    	return createIntegerConstantAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.IntegerConstant) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.BooleanConstant){
    	return createBooleanConstantAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.BooleanConstant) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariable){
    	return createIntegerVariableAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariable) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariable) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.BooleanModuleGet){
    	return createBooleanModuleGetAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.BooleanModuleGet) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.IntegerModuleGet){
    	return createIntegerModuleGetAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.IntegerModuleGet) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.UnaryBooleanExpression){
    	return createUnaryBooleanExpressionAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.UnaryBooleanExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.UnaryIntegerExpression){
    	return createUnaryIntegerExpressionAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.UnaryIntegerExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.VariableDeclaration){
    	return createVariableDeclarationAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.VariableDeclaration) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariableRef){
    	return createIntegerVariableRefAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.IntegerVariableRef) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.LED){
    	return createLEDAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.LED) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.PushButton){
    	return createPushButtonAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.PushButton) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Buzzer){
    	return createBuzzerAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Buzzer) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.RotationSensor){
    	return createRotationSensorAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.RotationSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.MicroServo){
    	return createMicroServoAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.MicroServo) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.InfraRedSensor){
    	return createInfraRedSensorAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.InfraRedSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.AmbientLightSensor){
    	return createAmbientLightSensorAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.AmbientLightSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.SoundSensor){
    	return createSoundSensorAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.SoundSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Fan){
    	return createFanAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Fan) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.MusicPlayer){
    	return createMusicPlayerAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.MusicPlayer) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.Block){
    	return createBlockAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.Block) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoBoard){
    	return createArduinoBoardAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoBoard) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((org.gemoc.arduino.concurrent.execarduino.arduino.BooleanVariableRef) o, res) ;
    }
    
    return null ;
  }
  
  public BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BoardAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BoardAdapter) adapter ;
    }
  }
  
  public ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAdapter) adapter ;
    }
  }
  
  public DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DigitalPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DigitalPinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DigitalPinAdapter) adapter ;
    }
  }
  
  public PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PinAdapter) adapter ;
    }
  }
  
  public AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AnalogPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AnalogPinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AnalogPinAdapter) adapter ;
    }
  }
  
  public SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SketchAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SketchAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SketchAdapter) adapter ;
    }
  }
  
  public ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ProjectAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ProjectAdapter) adapter ;
    }
  }
  
  public InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InstructionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InstructionAdapter) adapter ;
    }
  }
  
  public ModuleAssignmentAdapter createModuleAssignmentAdapter(final ModuleAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleAssignmentAdapter) adapter ;
    }
  }
  
  public ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleInstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleInstructionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleInstructionAdapter) adapter ;
    }
  }
  
  public ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ControlAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ControlAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ControlAdapter) adapter ;
    }
  }
  
  public UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UtilitiesAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UtilitiesAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UtilitiesAdapter) adapter ;
    }
  }
  
  public DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DelayAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DelayAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.DelayAdapter) adapter ;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.NamedElementAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.NamedElementAdapter) adapter ;
    }
  }
  
  public RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RepeatAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RepeatAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RepeatAdapter) adapter ;
    }
  }
  
  public ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ModuleGetAdapter) adapter ;
    }
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.WhileAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.WhileAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.WhileAdapter) adapter ;
    }
  }
  
  public BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryExpressionAdapter) adapter ;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAdapter) adapter ;
    }
  }
  
  public VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableAssignmentAdapter) adapter ;
    }
  }
  
  public BinaryIntegerExpressionAdapter createBinaryIntegerExpressionAdapter(final BinaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryIntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryIntegerExpressionAdapter) adapter ;
    }
  }
  
  public BinaryBooleanExpressionAdapter createBinaryBooleanExpressionAdapter(final BinaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryBooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BinaryBooleanExpressionAdapter) adapter ;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ExpressionAdapter) adapter ;
    }
  }
  
  public ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ConstantAdapter) adapter ;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IfAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IfAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IfAdapter) adapter ;
    }
  }
  
  public IntegerConstantAdapter createIntegerConstantAdapter(final IntegerConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerConstantAdapter) adapter ;
    }
  }
  
  public BooleanConstantAdapter createBooleanConstantAdapter(final BooleanConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanConstantAdapter) adapter ;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanExpressionAdapter) adapter ;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerExpressionAdapter) adapter ;
    }
  }
  
  public AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AssignmentAdapter) adapter ;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableAdapter) adapter ;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableAdapter) adapter ;
    }
  }
  
  public BooleanModuleGetAdapter createBooleanModuleGetAdapter(final BooleanModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanModuleGetAdapter) adapter ;
    }
  }
  
  public IntegerModuleGetAdapter createIntegerModuleGetAdapter(final IntegerModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerModuleGetAdapter) adapter ;
    }
  }
  
  public UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryExpressionAdapter) adapter ;
    }
  }
  
  public UnaryBooleanExpressionAdapter createUnaryBooleanExpressionAdapter(final UnaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryBooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryBooleanExpressionAdapter) adapter ;
    }
  }
  
  public UnaryIntegerExpressionAdapter createUnaryIntegerExpressionAdapter(final UnaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryIntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.UnaryIntegerExpressionAdapter) adapter ;
    }
  }
  
  public VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableDeclarationAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableDeclarationAdapter) adapter ;
    }
  }
  
  public VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.VariableRefAdapter) adapter ;
    }
  }
  
  public IntegerVariableRefAdapter createIntegerVariableRefAdapter(final IntegerVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.IntegerVariableRefAdapter) adapter ;
    }
  }
  
  public LEDAdapter createLEDAdapter(final LED adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.LEDAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.LEDAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.LEDAdapter) adapter ;
    }
  }
  
  public PushButtonAdapter createPushButtonAdapter(final PushButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PushButtonAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PushButtonAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.PushButtonAdapter) adapter ;
    }
  }
  
  public BuzzerAdapter createBuzzerAdapter(final Buzzer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BuzzerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BuzzerAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BuzzerAdapter) adapter ;
    }
  }
  
  public RotationSensorAdapter createRotationSensorAdapter(final RotationSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RotationSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RotationSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.RotationSensorAdapter) adapter ;
    }
  }
  
  public MicroServoAdapter createMicroServoAdapter(final MicroServo adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MicroServoAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MicroServoAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MicroServoAdapter) adapter ;
    }
  }
  
  public InfraRedSensorAdapter createInfraRedSensorAdapter(final InfraRedSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InfraRedSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InfraRedSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.InfraRedSensorAdapter) adapter ;
    }
  }
  
  public AmbientLightSensorAdapter createAmbientLightSensorAdapter(final AmbientLightSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AmbientLightSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AmbientLightSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.AmbientLightSensorAdapter) adapter ;
    }
  }
  
  public SoundSensorAdapter createSoundSensorAdapter(final SoundSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SoundSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SoundSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.SoundSensorAdapter) adapter ;
    }
  }
  
  public FanAdapter createFanAdapter(final Fan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.FanAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.FanAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.FanAdapter) adapter ;
    }
  }
  
  public MusicPlayerAdapter createMusicPlayerAdapter(final MusicPlayer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MusicPlayerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MusicPlayerAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.MusicPlayerAdapter) adapter ;
    }
  }
  
  public ArduinoModuleAdapter createArduinoModuleAdapter(final ArduinoModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoModuleAdapter) adapter ;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BlockAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BlockAdapter) adapter ;
    }
  }
  
  public ArduinoBoardAdapter createArduinoBoardAdapter(final ArduinoBoard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoBoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoBoardAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoBoardAdapter) adapter ;
    }
  }
  
  public ArduinoDigitalModuleAdapter createArduinoDigitalModuleAdapter(final ArduinoDigitalModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoDigitalModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoDigitalModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoDigitalModuleAdapter) adapter ;
    }
  }
  
  public ArduinoAnalogModuleAdapter createArduinoAnalogModuleAdapter(final ArduinoAnalogModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoAnalogModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoAnalogModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.ArduinoAnalogModuleAdapter) adapter ;
    }
  }
  
  public BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.concurrent.arduinoconcurrent.adapters.arduinoconcurrentmt.BooleanVariableRefAdapter) adapter ;
    }
  }
}

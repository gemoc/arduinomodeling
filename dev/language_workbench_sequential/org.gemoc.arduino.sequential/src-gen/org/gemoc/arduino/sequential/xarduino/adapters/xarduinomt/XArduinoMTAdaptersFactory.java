package org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.sequential.xarduino.arduino.AmbientLightSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.AnalogPin;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoBoard;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoCommunicationModule;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoModule;
import org.gemoc.arduino.sequential.xarduino.arduino.Assignment;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;
import org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.xarduino.arduino.Board;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.Buzzer;
import org.gemoc.arduino.sequential.xarduino.arduino.Constant;
import org.gemoc.arduino.sequential.xarduino.arduino.Control;
import org.gemoc.arduino.sequential.xarduino.arduino.Delay;
import org.gemoc.arduino.sequential.xarduino.arduino.DigitalPin;
import org.gemoc.arduino.sequential.xarduino.arduino.Expression;
import org.gemoc.arduino.sequential.xarduino.arduino.Fan;
import org.gemoc.arduino.sequential.xarduino.arduino.If;
import org.gemoc.arduino.sequential.xarduino.arduino.InfraRedSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.LED;
import org.gemoc.arduino.sequential.xarduino.arduino.MicroServo;
import org.gemoc.arduino.sequential.xarduino.arduino.Module;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleInstruction;
import org.gemoc.arduino.sequential.xarduino.arduino.MusicPlayer;
import org.gemoc.arduino.sequential.xarduino.arduino.NamedElement;
import org.gemoc.arduino.sequential.xarduino.arduino.Pin;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;
import org.gemoc.arduino.sequential.xarduino.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduino.arduino.Repeat;
import org.gemoc.arduino.sequential.xarduino.arduino.RotationSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduino.arduino.SoundSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.Utilities;
import org.gemoc.arduino.sequential.xarduino.arduino.Variable;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

@SuppressWarnings("all")
public class XArduinoMTAdaptersFactory implements AdaptersFactory {
  private static org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory instance;
  
  public static org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.XArduinoMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XArduinoMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.DigitalPin){
    	return createDigitalPinAdapter((org.gemoc.arduino.sequential.xarduino.arduino.DigitalPin) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.AnalogPin){
    	return createAnalogPinAdapter((org.gemoc.arduino.sequential.xarduino.arduino.AnalogPin) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Sketch){
    	return createSketchAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Sketch) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Project){
    	return createProjectAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Project) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment){
    	return createModuleAssignmentAdapter((org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Delay){
    	return createDelayAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Delay) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Repeat){
    	return createRepeatAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Repeat) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.While){
    	return createWhileAdapter((org.gemoc.arduino.sequential.xarduino.arduino.While) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment){
    	return createVariableAssignmentAdapter((org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression){
    	return createBinaryIntegerExpressionAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanExpression){
    	return createBinaryBooleanExpressionAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.If){
    	return createIfAdapter((org.gemoc.arduino.sequential.xarduino.arduino.If) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant){
    	return createIntegerConstantAdapter((org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant){
    	return createBooleanConstantAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable){
    	return createIntegerVariableAdapter((org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet){
    	return createBooleanModuleGetAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet){
    	return createIntegerModuleGetAdapter((org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.UnaryBooleanExpression){
    	return createUnaryBooleanExpressionAdapter((org.gemoc.arduino.sequential.xarduino.arduino.UnaryBooleanExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression){
    	return createUnaryIntegerExpressionAdapter((org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration){
    	return createVariableDeclarationAdapter((org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariableRef){
    	return createIntegerVariableRefAdapter((org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariableRef) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.LED){
    	return createLEDAdapter((org.gemoc.arduino.sequential.xarduino.arduino.LED) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.PushButton){
    	return createPushButtonAdapter((org.gemoc.arduino.sequential.xarduino.arduino.PushButton) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Buzzer){
    	return createBuzzerAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Buzzer) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.RotationSensor){
    	return createRotationSensorAdapter((org.gemoc.arduino.sequential.xarduino.arduino.RotationSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.MicroServo){
    	return createMicroServoAdapter((org.gemoc.arduino.sequential.xarduino.arduino.MicroServo) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.InfraRedSensor){
    	return createInfraRedSensorAdapter((org.gemoc.arduino.sequential.xarduino.arduino.InfraRedSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.AmbientLightSensor){
    	return createAmbientLightSensorAdapter((org.gemoc.arduino.sequential.xarduino.arduino.AmbientLightSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.SoundSensor){
    	return createSoundSensorAdapter((org.gemoc.arduino.sequential.xarduino.arduino.SoundSensor) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Fan){
    	return createFanAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Fan) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.MusicPlayer){
    	return createMusicPlayerAdapter((org.gemoc.arduino.sequential.xarduino.arduino.MusicPlayer) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.Block){
    	return createBlockAdapter((org.gemoc.arduino.sequential.xarduino.arduino.Block) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.ArduinoBoard){
    	return createArduinoBoardAdapter((org.gemoc.arduino.sequential.xarduino.arduino.ArduinoBoard) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariableRef) o, res);
    }
    if (o instanceof org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver){
    	return createBluetoothTransceiverAdapter((org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver) o, res);
    }
    
    return null;
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BoardAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DigitalPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DigitalPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DigitalPinAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PinAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AnalogPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AnalogPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AnalogPinAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SketchAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ProjectAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InstructionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAssignmentAdapter createModuleAssignmentAdapter(final ModuleAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleAssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleInstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleInstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleInstructionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ControlAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UtilitiesAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UtilitiesAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UtilitiesAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.DelayAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.NamedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RepeatAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RepeatAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RepeatAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ModuleGetAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.WhileAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableAssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryIntegerExpressionAdapter createBinaryIntegerExpressionAdapter(final BinaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryIntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryIntegerExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryBooleanExpressionAdapter createBinaryBooleanExpressionAdapter(final BinaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryBooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BinaryBooleanExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ConstantAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IfAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerConstantAdapter createIntegerConstantAdapter(final IntegerConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerConstantAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanConstantAdapter createBooleanConstantAdapter(final BooleanConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanConstantAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AssignmentAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanModuleGetAdapter createBooleanModuleGetAdapter(final BooleanModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanModuleGetAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerModuleGetAdapter createIntegerModuleGetAdapter(final IntegerModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerModuleGetAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryBooleanExpressionAdapter createUnaryBooleanExpressionAdapter(final UnaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryBooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryBooleanExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryIntegerExpressionAdapter createUnaryIntegerExpressionAdapter(final UnaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryIntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.UnaryIntegerExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableDeclarationAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.VariableRefAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableRefAdapter createIntegerVariableRefAdapter(final IntegerVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.IntegerVariableRefAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LEDAdapter createLEDAdapter(final LED adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LEDAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LEDAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.LEDAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter createPushButtonAdapter(final PushButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.PushButtonAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BuzzerAdapter createBuzzerAdapter(final Buzzer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BuzzerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BuzzerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BuzzerAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RotationSensorAdapter createRotationSensorAdapter(final RotationSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RotationSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RotationSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.RotationSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MicroServoAdapter createMicroServoAdapter(final MicroServo adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MicroServoAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MicroServoAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MicroServoAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InfraRedSensorAdapter createInfraRedSensorAdapter(final InfraRedSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InfraRedSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InfraRedSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.InfraRedSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AmbientLightSensorAdapter createAmbientLightSensorAdapter(final AmbientLightSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AmbientLightSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AmbientLightSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.AmbientLightSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SoundSensorAdapter createSoundSensorAdapter(final SoundSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SoundSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SoundSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.SoundSensorAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.FanAdapter createFanAdapter(final Fan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.FanAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.FanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.FanAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MusicPlayerAdapter createMusicPlayerAdapter(final MusicPlayer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MusicPlayerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MusicPlayerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.MusicPlayerAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoModuleAdapter createArduinoModuleAdapter(final ArduinoModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BlockAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoBoardAdapter createArduinoBoardAdapter(final ArduinoBoard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoBoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoBoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoBoardAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoDigitalModuleAdapter createArduinoDigitalModuleAdapter(final ArduinoDigitalModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoDigitalModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoDigitalModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoDigitalModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoAnalogModuleAdapter createArduinoAnalogModuleAdapter(final ArduinoAnalogModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoAnalogModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoAnalogModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoAnalogModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BooleanVariableRefAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoCommunicationModuleAdapter createArduinoCommunicationModuleAdapter(final ArduinoCommunicationModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoCommunicationModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoCommunicationModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.ArduinoCommunicationModuleAdapter) adapter;
    }
  }
  
  public org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BluetoothTransceiverAdapter createBluetoothTransceiverAdapter(final BluetoothTransceiver adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BluetoothTransceiverAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BluetoothTransceiverAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.sequential.xarduino.adapters.xarduinomt.arduino.BluetoothTransceiverAdapter) adapter;
    }
  }
}

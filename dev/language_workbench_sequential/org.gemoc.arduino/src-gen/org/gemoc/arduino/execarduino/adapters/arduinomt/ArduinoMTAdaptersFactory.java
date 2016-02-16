package org.gemoc.arduino.execarduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.execarduino.arduino.AmbientLightSensor;
import org.gemoc.arduino.execarduino.arduino.AnalogPin;
import org.gemoc.arduino.execarduino.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.execarduino.arduino.ArduinoBoard;
import org.gemoc.arduino.execarduino.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.execarduino.arduino.ArduinoModule;
import org.gemoc.arduino.execarduino.arduino.Assignment;
import org.gemoc.arduino.execarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.execarduino.arduino.BinaryExpression;
import org.gemoc.arduino.execarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.execarduino.arduino.Block;
import org.gemoc.arduino.execarduino.arduino.Board;
import org.gemoc.arduino.execarduino.arduino.BooleanConstant;
import org.gemoc.arduino.execarduino.arduino.BooleanExpression;
import org.gemoc.arduino.execarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.execarduino.arduino.BooleanVariable;
import org.gemoc.arduino.execarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.execarduino.arduino.Buzzer;
import org.gemoc.arduino.execarduino.arduino.Constant;
import org.gemoc.arduino.execarduino.arduino.Control;
import org.gemoc.arduino.execarduino.arduino.Delay;
import org.gemoc.arduino.execarduino.arduino.DigitalPin;
import org.gemoc.arduino.execarduino.arduino.Expression;
import org.gemoc.arduino.execarduino.arduino.Fan;
import org.gemoc.arduino.execarduino.arduino.If;
import org.gemoc.arduino.execarduino.arduino.InfraRedSensor;
import org.gemoc.arduino.execarduino.arduino.Instruction;
import org.gemoc.arduino.execarduino.arduino.IntegerConstant;
import org.gemoc.arduino.execarduino.arduino.IntegerExpression;
import org.gemoc.arduino.execarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.execarduino.arduino.IntegerVariable;
import org.gemoc.arduino.execarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.execarduino.arduino.LED;
import org.gemoc.arduino.execarduino.arduino.MicroServo;
import org.gemoc.arduino.execarduino.arduino.Module;
import org.gemoc.arduino.execarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.execarduino.arduino.ModuleGet;
import org.gemoc.arduino.execarduino.arduino.ModuleInstruction;
import org.gemoc.arduino.execarduino.arduino.MusicPlayer;
import org.gemoc.arduino.execarduino.arduino.NamedElement;
import org.gemoc.arduino.execarduino.arduino.Pin;
import org.gemoc.arduino.execarduino.arduino.Project;
import org.gemoc.arduino.execarduino.arduino.PushButton;
import org.gemoc.arduino.execarduino.arduino.Repeat;
import org.gemoc.arduino.execarduino.arduino.RotationSensor;
import org.gemoc.arduino.execarduino.arduino.Sketch;
import org.gemoc.arduino.execarduino.arduino.SoundSensor;
import org.gemoc.arduino.execarduino.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.execarduino.arduino.UnaryExpression;
import org.gemoc.arduino.execarduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.execarduino.arduino.Utilities;
import org.gemoc.arduino.execarduino.arduino.Variable;
import org.gemoc.arduino.execarduino.arduino.VariableAssignment;
import org.gemoc.arduino.execarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.execarduino.arduino.VariableRef;
import org.gemoc.arduino.execarduino.arduino.While;

@SuppressWarnings("all")
public class ArduinoMTAdaptersFactory implements AdaptersFactory {
  private static org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ArduinoMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.gemoc.arduino.execarduino.arduino.DigitalPin){
    	return createDigitalPinAdapter((org.gemoc.arduino.execarduino.arduino.DigitalPin) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.AnalogPin){
    	return createAnalogPinAdapter((org.gemoc.arduino.execarduino.arduino.AnalogPin) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Sketch){
    	return createSketchAdapter((org.gemoc.arduino.execarduino.arduino.Sketch) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Project){
    	return createProjectAdapter((org.gemoc.arduino.execarduino.arduino.Project) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.ModuleAssignment){
    	return createModuleAssignmentAdapter((org.gemoc.arduino.execarduino.arduino.ModuleAssignment) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Delay){
    	return createDelayAdapter((org.gemoc.arduino.execarduino.arduino.Delay) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Repeat){
    	return createRepeatAdapter((org.gemoc.arduino.execarduino.arduino.Repeat) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.While){
    	return createWhileAdapter((org.gemoc.arduino.execarduino.arduino.While) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.VariableAssignment){
    	return createVariableAssignmentAdapter((org.gemoc.arduino.execarduino.arduino.VariableAssignment) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.BinaryIntegerExpression){
    	return createBinaryIntegerExpressionAdapter((org.gemoc.arduino.execarduino.arduino.BinaryIntegerExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.BinaryBooleanExpression){
    	return createBinaryBooleanExpressionAdapter((org.gemoc.arduino.execarduino.arduino.BinaryBooleanExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.If){
    	return createIfAdapter((org.gemoc.arduino.execarduino.arduino.If) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.IntegerConstant){
    	return createIntegerConstantAdapter((org.gemoc.arduino.execarduino.arduino.IntegerConstant) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.BooleanConstant){
    	return createBooleanConstantAdapter((org.gemoc.arduino.execarduino.arduino.BooleanConstant) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.IntegerVariable){
    	return createIntegerVariableAdapter((org.gemoc.arduino.execarduino.arduino.IntegerVariable) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.BooleanVariable){
    	return createBooleanVariableAdapter((org.gemoc.arduino.execarduino.arduino.BooleanVariable) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.BooleanModuleGet){
    	return createBooleanModuleGetAdapter((org.gemoc.arduino.execarduino.arduino.BooleanModuleGet) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.IntegerModuleGet){
    	return createIntegerModuleGetAdapter((org.gemoc.arduino.execarduino.arduino.IntegerModuleGet) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.UnaryBooleanExpression){
    	return createUnaryBooleanExpressionAdapter((org.gemoc.arduino.execarduino.arduino.UnaryBooleanExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.UnaryIntegerExpression){
    	return createUnaryIntegerExpressionAdapter((org.gemoc.arduino.execarduino.arduino.UnaryIntegerExpression) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.VariableDeclaration){
    	return createVariableDeclarationAdapter((org.gemoc.arduino.execarduino.arduino.VariableDeclaration) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.IntegerVariableRef){
    	return createIntegerVariableRefAdapter((org.gemoc.arduino.execarduino.arduino.IntegerVariableRef) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.LED){
    	return createLEDAdapter((org.gemoc.arduino.execarduino.arduino.LED) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.PushButton){
    	return createPushButtonAdapter((org.gemoc.arduino.execarduino.arduino.PushButton) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Buzzer){
    	return createBuzzerAdapter((org.gemoc.arduino.execarduino.arduino.Buzzer) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.RotationSensor){
    	return createRotationSensorAdapter((org.gemoc.arduino.execarduino.arduino.RotationSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.MicroServo){
    	return createMicroServoAdapter((org.gemoc.arduino.execarduino.arduino.MicroServo) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.InfraRedSensor){
    	return createInfraRedSensorAdapter((org.gemoc.arduino.execarduino.arduino.InfraRedSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.AmbientLightSensor){
    	return createAmbientLightSensorAdapter((org.gemoc.arduino.execarduino.arduino.AmbientLightSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.SoundSensor){
    	return createSoundSensorAdapter((org.gemoc.arduino.execarduino.arduino.SoundSensor) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Fan){
    	return createFanAdapter((org.gemoc.arduino.execarduino.arduino.Fan) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.MusicPlayer){
    	return createMusicPlayerAdapter((org.gemoc.arduino.execarduino.arduino.MusicPlayer) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.Block){
    	return createBlockAdapter((org.gemoc.arduino.execarduino.arduino.Block) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.ArduinoBoard){
    	return createArduinoBoardAdapter((org.gemoc.arduino.execarduino.arduino.ArduinoBoard) o, res) ;
    }
    if (o instanceof org.gemoc.arduino.execarduino.arduino.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((org.gemoc.arduino.execarduino.arduino.BooleanVariableRef) o, res) ;
    }
    
    return null ;
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BoardAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BoardAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.DigitalPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.DigitalPinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.DigitalPinAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.PinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.PinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.PinAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.AnalogPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.AnalogPinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.AnalogPinAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.SketchAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.SketchAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.SketchAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ProjectAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ProjectAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.InstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.InstructionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.InstructionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAssignmentAdapter createModuleAssignmentAdapter(final ModuleAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleAssignmentAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleInstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleInstructionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleInstructionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ControlAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ControlAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ControlAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.UtilitiesAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.UtilitiesAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.UtilitiesAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.DelayAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.DelayAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.DelayAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.NamedElementAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.NamedElementAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.RepeatAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.RepeatAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.RepeatAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ModuleGetAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.WhileAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.WhileAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.WhileAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableAssignmentAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryIntegerExpressionAdapter createBinaryIntegerExpressionAdapter(final BinaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryIntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryIntegerExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryBooleanExpressionAdapter createBinaryBooleanExpressionAdapter(final BinaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryBooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BinaryBooleanExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ConstantAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.IfAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.IfAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.IfAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerConstantAdapter createIntegerConstantAdapter(final IntegerConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerConstantAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanConstantAdapter createBooleanConstantAdapter(final BooleanConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanConstantAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.AssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.AssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.AssignmentAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanModuleGetAdapter createBooleanModuleGetAdapter(final BooleanModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanModuleGetAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerModuleGetAdapter createIntegerModuleGetAdapter(final IntegerModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerModuleGetAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryBooleanExpressionAdapter createUnaryBooleanExpressionAdapter(final UnaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryBooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryBooleanExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryIntegerExpressionAdapter createUnaryIntegerExpressionAdapter(final UnaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryIntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.UnaryIntegerExpressionAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.VariableDeclarationAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableDeclarationAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.VariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.VariableRefAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableRefAdapter createIntegerVariableRefAdapter(final IntegerVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.IntegerVariableRefAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.LEDAdapter createLEDAdapter(final LED adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.LEDAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.LEDAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.LEDAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.PushButtonAdapter createPushButtonAdapter(final PushButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.PushButtonAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.PushButtonAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.PushButtonAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BuzzerAdapter createBuzzerAdapter(final Buzzer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BuzzerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BuzzerAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BuzzerAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.RotationSensorAdapter createRotationSensorAdapter(final RotationSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.RotationSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.RotationSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.RotationSensorAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.MicroServoAdapter createMicroServoAdapter(final MicroServo adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.MicroServoAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.MicroServoAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.MicroServoAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.InfraRedSensorAdapter createInfraRedSensorAdapter(final InfraRedSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.InfraRedSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.InfraRedSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.InfraRedSensorAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.AmbientLightSensorAdapter createAmbientLightSensorAdapter(final AmbientLightSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.AmbientLightSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.AmbientLightSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.AmbientLightSensorAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.SoundSensorAdapter createSoundSensorAdapter(final SoundSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.SoundSensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.SoundSensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.SoundSensorAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.FanAdapter createFanAdapter(final Fan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.FanAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.FanAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.FanAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.MusicPlayerAdapter createMusicPlayerAdapter(final MusicPlayer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.MusicPlayerAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.MusicPlayerAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.MusicPlayerAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoModuleAdapter createArduinoModuleAdapter(final ArduinoModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoModuleAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BlockAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BlockAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoBoardAdapter createArduinoBoardAdapter(final ArduinoBoard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoBoardAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoBoardAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoBoardAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoDigitalModuleAdapter createArduinoDigitalModuleAdapter(final ArduinoDigitalModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoDigitalModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoDigitalModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoDigitalModuleAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoAnalogModuleAdapter createArduinoAnalogModuleAdapter(final ArduinoAnalogModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoAnalogModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoAnalogModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.ArduinoAnalogModuleAdapter) adapter ;
    }
  }
  
  public org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.execarduino.adapters.arduinomt.BooleanVariableRefAdapter) adapter ;
    }
  }
}

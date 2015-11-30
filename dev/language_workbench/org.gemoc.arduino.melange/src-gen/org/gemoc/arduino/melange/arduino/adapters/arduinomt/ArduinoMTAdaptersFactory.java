package org.gemoc.arduino.melange.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.Actuator;
import fr.obeo.dsl.arduino.AnalogPin;
import fr.obeo.dsl.arduino.Assignment;
import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.BinaryExpression;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import fr.obeo.dsl.arduino.BooleanConstant;
import fr.obeo.dsl.arduino.BooleanExpression;
import fr.obeo.dsl.arduino.BooleanModuleGet;
import fr.obeo.dsl.arduino.BooleanVariable;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.Control;
import fr.obeo.dsl.arduino.Delay;
import fr.obeo.dsl.arduino.DigitalPin;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.Hardware;
import fr.obeo.dsl.arduino.If;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.IntegerConstant;
import fr.obeo.dsl.arduino.IntegerExpression;
import fr.obeo.dsl.arduino.IntegerModuleGet;
import fr.obeo.dsl.arduino.IntegerVariable;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.ModuleAssignment;
import fr.obeo.dsl.arduino.ModuleGet;
import fr.obeo.dsl.arduino.ModuleInstruction;
import fr.obeo.dsl.arduino.NamedElement;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Platform;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Repeat;
import fr.obeo.dsl.arduino.Sensor;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.UnaryBooleanExpression;
import fr.obeo.dsl.arduino.UnaryExpression;
import fr.obeo.dsl.arduino.UnaryIntegerExpression;
import fr.obeo.dsl.arduino.Utilities;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.VariableAssignment;
import fr.obeo.dsl.arduino.VariableDeclaration;
import fr.obeo.dsl.arduino.VariableRef;
import fr.obeo.dsl.arduino.While;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ActuatorAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.AnalogPinAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.AssignmentAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryBooleanExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryIntegerExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanConstantAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanModuleGetAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanVariableAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConnectorAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConstantAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ControlAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.DelayAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.DigitalPinAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.HardwareAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.IfAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerConstantAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerModuleGetAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerVariableAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAssignmentAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleGetAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleInstructionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.NamedElementAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.PinAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.PlatformAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.ProjectAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.RepeatAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.SensorAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.SketchAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryBooleanExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryIntegerExpressionAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.UtilitiesAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAssignmentAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableDeclarationAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableRefAdapter;
import org.gemoc.arduino.melange.arduino.adapters.arduinomt.WhileAdapter;

@SuppressWarnings("all")
public class ArduinoMTAdaptersFactory implements AdaptersFactory {
  private static ArduinoMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ArduinoMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static ArduinoMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.obeo.dsl.arduino.Hardware){
    	return createHardwareAdapter((fr.obeo.dsl.arduino.Hardware) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Platform){
    	return createPlatformAdapter((fr.obeo.dsl.arduino.Platform) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.DigitalPin){
    	return createDigitalPinAdapter((fr.obeo.dsl.arduino.DigitalPin) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.AnalogPin){
    	return createAnalogPinAdapter((fr.obeo.dsl.arduino.AnalogPin) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Sketch){
    	return createSketchAdapter((fr.obeo.dsl.arduino.Sketch) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Project){
    	return createProjectAdapter((fr.obeo.dsl.arduino.Project) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.ModuleAssignment){
    	return createModuleAssignmentAdapter((fr.obeo.dsl.arduino.ModuleAssignment) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Delay){
    	return createDelayAdapter((fr.obeo.dsl.arduino.Delay) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Sensor){
    	return createSensorAdapter((fr.obeo.dsl.arduino.Sensor) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Actuator){
    	return createActuatorAdapter((fr.obeo.dsl.arduino.Actuator) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Connector){
    	return createConnectorAdapter((fr.obeo.dsl.arduino.Connector) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.Repeat){
    	return createRepeatAdapter((fr.obeo.dsl.arduino.Repeat) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.While){
    	return createWhileAdapter((fr.obeo.dsl.arduino.While) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.VariableAssignment){
    	return createVariableAssignmentAdapter((fr.obeo.dsl.arduino.VariableAssignment) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.BinaryIntegerExpression){
    	return createBinaryIntegerExpressionAdapter((fr.obeo.dsl.arduino.BinaryIntegerExpression) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.BinaryBooleanExpression){
    	return createBinaryBooleanExpressionAdapter((fr.obeo.dsl.arduino.BinaryBooleanExpression) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.If){
    	return createIfAdapter((fr.obeo.dsl.arduino.If) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.IntegerConstant){
    	return createIntegerConstantAdapter((fr.obeo.dsl.arduino.IntegerConstant) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.BooleanConstant){
    	return createBooleanConstantAdapter((fr.obeo.dsl.arduino.BooleanConstant) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.IntegerVariable){
    	return createIntegerVariableAdapter((fr.obeo.dsl.arduino.IntegerVariable) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.BooleanVariable){
    	return createBooleanVariableAdapter((fr.obeo.dsl.arduino.BooleanVariable) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.BooleanModuleGet){
    	return createBooleanModuleGetAdapter((fr.obeo.dsl.arduino.BooleanModuleGet) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.IntegerModuleGet){
    	return createIntegerModuleGetAdapter((fr.obeo.dsl.arduino.IntegerModuleGet) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.UnaryBooleanExpression){
    	return createUnaryBooleanExpressionAdapter((fr.obeo.dsl.arduino.UnaryBooleanExpression) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.UnaryIntegerExpression){
    	return createUnaryIntegerExpressionAdapter((fr.obeo.dsl.arduino.UnaryIntegerExpression) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.VariableDeclaration){
    	return createVariableDeclarationAdapter((fr.obeo.dsl.arduino.VariableDeclaration) o, res) ;
    }
    if (o instanceof fr.obeo.dsl.arduino.VariableRef){
    	return createVariableRefAdapter((fr.obeo.dsl.arduino.VariableRef) o, res) ;
    }
    
    return null ;
  }
  
  public HardwareAdapter createHardwareAdapter(final Hardware adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.HardwareAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.HardwareAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.HardwareAdapter) adapter ;
    }
  }
  
  public PlatformAdapter createPlatformAdapter(final Platform adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.PlatformAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.PlatformAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.PlatformAdapter) adapter ;
    }
  }
  
  public ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAdapter) adapter ;
    }
  }
  
  public DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.DigitalPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.DigitalPinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.DigitalPinAdapter) adapter ;
    }
  }
  
  public PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.PinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.PinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.PinAdapter) adapter ;
    }
  }
  
  public AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.AnalogPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.AnalogPinAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.AnalogPinAdapter) adapter ;
    }
  }
  
  public SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.SketchAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.SketchAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.SketchAdapter) adapter ;
    }
  }
  
  public ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ProjectAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ProjectAdapter) adapter ;
    }
  }
  
  public InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.InstructionAdapter) adapter ;
    }
  }
  
  public ModuleAssignmentAdapter createModuleAssignmentAdapter(final ModuleAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleAssignmentAdapter) adapter ;
    }
  }
  
  public ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleInstructionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleInstructionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleInstructionAdapter) adapter ;
    }
  }
  
  public ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ControlAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ControlAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ControlAdapter) adapter ;
    }
  }
  
  public UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UtilitiesAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.UtilitiesAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UtilitiesAdapter) adapter ;
    }
  }
  
  public DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.DelayAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.DelayAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.DelayAdapter) adapter ;
    }
  }
  
  public SensorAdapter createSensorAdapter(final Sensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.SensorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.SensorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.SensorAdapter) adapter ;
    }
  }
  
  public ActuatorAdapter createActuatorAdapter(final Actuator adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ActuatorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ActuatorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ActuatorAdapter) adapter ;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.NamedElementAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.NamedElementAdapter) adapter ;
    }
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConnectorAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConnectorAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConnectorAdapter) adapter ;
    }
  }
  
  public RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.RepeatAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.RepeatAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.RepeatAdapter) adapter ;
    }
  }
  
  public ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ModuleGetAdapter) adapter ;
    }
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.WhileAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.WhileAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.WhileAdapter) adapter ;
    }
  }
  
  public BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryExpressionAdapter) adapter ;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAdapter) adapter ;
    }
  }
  
  public VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableAssignmentAdapter) adapter ;
    }
  }
  
  public BinaryIntegerExpressionAdapter createBinaryIntegerExpressionAdapter(final BinaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryIntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryIntegerExpressionAdapter) adapter ;
    }
  }
  
  public BinaryBooleanExpressionAdapter createBinaryBooleanExpressionAdapter(final BinaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryBooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BinaryBooleanExpressionAdapter) adapter ;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ExpressionAdapter) adapter ;
    }
  }
  
  public ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.ConstantAdapter) adapter ;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IfAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.IfAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IfAdapter) adapter ;
    }
  }
  
  public IntegerConstantAdapter createIntegerConstantAdapter(final IntegerConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerConstantAdapter) adapter ;
    }
  }
  
  public BooleanConstantAdapter createBooleanConstantAdapter(final BooleanConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanConstantAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanConstantAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanConstantAdapter) adapter ;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanExpressionAdapter) adapter ;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerExpressionAdapter) adapter ;
    }
  }
  
  public AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.AssignmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.AssignmentAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.AssignmentAdapter) adapter ;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerVariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerVariableAdapter) adapter ;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanVariableAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanVariableAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanVariableAdapter) adapter ;
    }
  }
  
  public BooleanModuleGetAdapter createBooleanModuleGetAdapter(final BooleanModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.BooleanModuleGetAdapter) adapter ;
    }
  }
  
  public IntegerModuleGetAdapter createIntegerModuleGetAdapter(final IntegerModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerModuleGetAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerModuleGetAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.IntegerModuleGetAdapter) adapter ;
    }
  }
  
  public UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryExpressionAdapter) adapter ;
    }
  }
  
  public UnaryBooleanExpressionAdapter createUnaryBooleanExpressionAdapter(final UnaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryBooleanExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryBooleanExpressionAdapter) adapter ;
    }
  }
  
  public UnaryIntegerExpressionAdapter createUnaryIntegerExpressionAdapter(final UnaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryIntegerExpressionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.UnaryIntegerExpressionAdapter) adapter ;
    }
  }
  
  public VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableDeclarationAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableDeclarationAdapter) adapter ;
    }
  }
  
  public VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableRefAdapter) adapter;
    else {
    	adapter = new org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableRefAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (org.gemoc.arduino.melange.arduino.adapters.arduinomt.VariableRefAdapter) adapter ;
    }
  }
}

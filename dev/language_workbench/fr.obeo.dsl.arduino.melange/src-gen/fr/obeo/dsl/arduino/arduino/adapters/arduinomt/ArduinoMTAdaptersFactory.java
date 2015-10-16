package fr.obeo.dsl.arduino.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.obeo.dsl.arduino.AnalogPin;
import fr.obeo.dsl.arduino.BooleanOperator;
import fr.obeo.dsl.arduino.Connector;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.Control;
import fr.obeo.dsl.arduino.Delay;
import fr.obeo.dsl.arduino.DigitalPin;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.Function;
import fr.obeo.dsl.arduino.FunctionCall;
import fr.obeo.dsl.arduino.Hardware;
import fr.obeo.dsl.arduino.IO;
import fr.obeo.dsl.arduino.If;
import fr.obeo.dsl.arduino.InputModule;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.Level;
import fr.obeo.dsl.arduino.MathOperator;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.ModuleInstruction;
import fr.obeo.dsl.arduino.NamedElement;
import fr.obeo.dsl.arduino.NumericalOperator;
import fr.obeo.dsl.arduino.OutputModule;
import fr.obeo.dsl.arduino.Parameter;
import fr.obeo.dsl.arduino.ParameterCall;
import fr.obeo.dsl.arduino.ParameterDefinition;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Platform;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Repeat;
import fr.obeo.dsl.arduino.Sensor;
import fr.obeo.dsl.arduino.Set;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.Status;
import fr.obeo.dsl.arduino.Utilities;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.While;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.AnalogPinAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.BooleanOperatorAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConnectorAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConstantAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ControlAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DelayAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DigitalPinAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionCallAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.HardwareAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.IOAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.IfAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InputModuleAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.LevelAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.MathOperatorAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleInstructionAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.NamedElementAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.NumericalOperatorAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.OutputModuleAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterCallAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PinAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PlatformAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ProjectAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.RepeatAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SensorAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SetAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SketchAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.StatusAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.UtilitiesAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.VariableAdapter;
import fr.obeo.dsl.arduino.arduino.adapters.arduinomt.WhileAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class ArduinoMTAdaptersFactory implements AdaptersFactory {
  private static ArduinoMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ArduinoMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static ArduinoMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o) {
    EObjectAdapter res = register.get(o);
    if(res != null){
    	 return res;
    }
    else{
    	if (o instanceof fr.obeo.dsl.arduino.Hardware){
    		res = createHardwareAdapter((fr.obeo.dsl.arduino.Hardware) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Platform){
    		res = createPlatformAdapter((fr.obeo.dsl.arduino.Platform) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.DigitalPin){
    		res = createDigitalPinAdapter((fr.obeo.dsl.arduino.DigitalPin) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.AnalogPin){
    		res = createAnalogPinAdapter((fr.obeo.dsl.arduino.AnalogPin) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Sketch){
    		res = createSketchAdapter((fr.obeo.dsl.arduino.Sketch) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Project){
    		res = createProjectAdapter((fr.obeo.dsl.arduino.Project) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Status){
    		res = createStatusAdapter((fr.obeo.dsl.arduino.Status) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Level){
    		res = createLevelAdapter((fr.obeo.dsl.arduino.Level) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Delay){
    		res = createDelayAdapter((fr.obeo.dsl.arduino.Delay) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.InputModule){
    		res = createInputModuleAdapter((fr.obeo.dsl.arduino.InputModule) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.OutputModule){
    		res = createOutputModuleAdapter((fr.obeo.dsl.arduino.OutputModule) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Connector){
    		res = createConnectorAdapter((fr.obeo.dsl.arduino.Connector) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Repeat){
    		res = createRepeatAdapter((fr.obeo.dsl.arduino.Repeat) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Sensor){
    		res = createSensorAdapter((fr.obeo.dsl.arduino.Sensor) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.While){
    		res = createWhileAdapter((fr.obeo.dsl.arduino.While) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Variable){
    		res = createVariableAdapter((fr.obeo.dsl.arduino.Variable) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Set){
    		res = createSetAdapter((fr.obeo.dsl.arduino.Set) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.NumericalOperator){
    		res = createNumericalOperatorAdapter((fr.obeo.dsl.arduino.NumericalOperator) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.BooleanOperator){
    		res = createBooleanOperatorAdapter((fr.obeo.dsl.arduino.BooleanOperator) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Constant){
    		res = createConstantAdapter((fr.obeo.dsl.arduino.Constant) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.If){
    		res = createIfAdapter((fr.obeo.dsl.arduino.If) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.Function){
    		res = createFunctionAdapter((fr.obeo.dsl.arduino.Function) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.ParameterDefinition){
    		res = createParameterDefinitionAdapter((fr.obeo.dsl.arduino.ParameterDefinition) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.FunctionCall){
    		res = createFunctionCallAdapter((fr.obeo.dsl.arduino.FunctionCall) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fr.obeo.dsl.arduino.ParameterCall){
    		res = createParameterCallAdapter((fr.obeo.dsl.arduino.ParameterCall) o) ;
    		register.put(o,res);
    		return res;
    	}
    }
    
    return null ;
  }
  
  public HardwareAdapter createHardwareAdapter(final Hardware adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.HardwareAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.HardwareAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public PlatformAdapter createPlatformAdapter(final Platform adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PlatformAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PlatformAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ModuleAdapter createModuleAdapter(final Module adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DigitalPinAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DigitalPinAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public PinAdapter createPinAdapter(final Pin adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PinAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.PinAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.AnalogPinAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.AnalogPinAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public SketchAdapter createSketchAdapter(final Sketch adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SketchAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SketchAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ProjectAdapter createProjectAdapter(final Project adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ProjectAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ProjectAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public InstructionAdapter createInstructionAdapter(final Instruction adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InstructionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StatusAdapter createStatusAdapter(final Status adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.StatusAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.StatusAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public LevelAdapter createLevelAdapter(final Level adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.LevelAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.LevelAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleInstructionAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ModuleInstructionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ControlAdapter createControlAdapter(final Control adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ControlAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ControlAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.UtilitiesAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.UtilitiesAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public IOAdapter createIOAdapter(final IO adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.IOAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.IOAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public DelayAdapter createDelayAdapter(final Delay adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DelayAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.DelayAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public InputModuleAdapter createInputModuleAdapter(final InputModule adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InputModuleAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.InputModuleAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public OutputModuleAdapter createOutputModuleAdapter(final OutputModule adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.OutputModuleAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.OutputModuleAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.NamedElementAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.NamedElementAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ConnectorAdapter createConnectorAdapter(final Connector adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConnectorAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConnectorAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public RepeatAdapter createRepeatAdapter(final Repeat adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.RepeatAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.RepeatAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public SensorAdapter createSensorAdapter(final Sensor adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SensorAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SensorAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.WhileAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.WhileAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public MathOperatorAdapter createMathOperatorAdapter(final MathOperator adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.MathOperatorAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.MathOperatorAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.VariableAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.VariableAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public SetAdapter createSetAdapter(final Set adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SetAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.SetAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public NumericalOperatorAdapter createNumericalOperatorAdapter(final NumericalOperator adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.NumericalOperatorAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.NumericalOperatorAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public BooleanOperatorAdapter createBooleanOperatorAdapter(final BooleanOperator adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.BooleanOperatorAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.BooleanOperatorAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ExpressionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ConstantAdapter createConstantAdapter(final Constant adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConstantAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ConstantAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public IfAdapter createIfAdapter(final If adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.IfAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.IfAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public FunctionAdapter createFunctionAdapter(final Function adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ParameterDefinitionAdapter createParameterDefinitionAdapter(final ParameterDefinition adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterDefinitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ParameterAdapter createParameterAdapter(final Parameter adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public FunctionCallAdapter createFunctionCallAdapter(final FunctionCall adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionCallAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.FunctionCallAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public ParameterCallAdapter createParameterCallAdapter(final ParameterCall adaptee) {
    fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterCallAdapter adap = new fr.obeo.dsl.arduino.arduino.adapters.arduinomt.ParameterCallAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}

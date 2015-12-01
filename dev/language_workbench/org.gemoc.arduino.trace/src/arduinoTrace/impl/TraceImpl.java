/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.State;

import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedIntegerVariable;

import arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate;
import arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate;
import arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Call;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.Arduino_While_Execute;
import arduinoTrace.Steps.Step;

import arduinoTrace.Trace;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedIntegerVariables <em>Arduino traced Integer Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedBooleanVariables <em>Arduino traced Boolean Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_BooleanModuleGet_Evaluate_Sequence <em>Arduino Boolean Module Get Evaluate Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_While_Execute_Sequence <em>Arduino While Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_IntegerModuleGet_Evaluate_Sequence <em>Arduino Integer Module Get Evaluate Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_BooleanConstant_Evaluate_Sequence <em>Arduino Boolean Constant Evaluate Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_ModuleAssignment_Call_Sequence <em>Arduino Module Assignment Call Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_IntegerConstant_Evaluate_Sequence <em>Arduino Integer Constant Evaluate Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * The cached value of the '{@link #getRootSteps() <em>Root Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> rootSteps;

	/**
	 * The cached value of the '{@link #getArduino_tracedIntegerVariables() <em>Arduino traced Integer Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedIntegerVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerVariable> arduino_tracedIntegerVariables;

	/**
	 * The cached value of the '{@link #getArduino_tracedAnalogPins() <em>Arduino traced Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAnalogPin> arduino_tracedAnalogPins;

	/**
	 * The cached value of the '{@link #getArduino_tracedBooleanVariables() <em>Arduino traced Boolean Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBooleanVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanVariable> arduino_tracedBooleanVariables;

	/**
	 * The cached value of the '{@link #getArduino_tracedDigitalPins() <em>Arduino traced Digital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedDigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDigitalPin> arduino_tracedDigitalPins;

	/**
	 * The cached value of the '{@link #getArduino_BooleanModuleGet_Evaluate_Sequence() <em>Arduino Boolean Module Get Evaluate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_BooleanModuleGet_Evaluate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_BooleanModuleGet_Evaluate> arduino_BooleanModuleGet_Evaluate_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_ModuleAssignment_Execute_Sequence() <em>Arduino Module Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_ModuleAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleAssignment_Execute> arduino_ModuleAssignment_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_While_Execute_Sequence() <em>Arduino While Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_While_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_While_Execute> arduino_While_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Utilities_Execute_Sequence() <em>Arduino Utilities Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Utilities_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Utilities_Execute> arduino_Utilities_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Delay_Execute_Sequence() <em>Arduino Delay Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Delay_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Delay_Execute> arduino_Delay_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_If_Execute_Sequence() <em>Arduino If Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_If_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_If_Execute> arduino_If_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_VariableDeclaration_Execute_Sequence() <em>Arduino Variable Declaration Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableDeclaration_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableDeclaration_Execute> arduino_VariableDeclaration_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_VariableAssignment_Execute_Sequence() <em>Arduino Variable Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableAssignment_Execute> arduino_VariableAssignment_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Repeat_Execute_Sequence() <em>Arduino Repeat Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Repeat_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Repeat_Execute> arduino_Repeat_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_IntegerModuleGet_Evaluate_Sequence() <em>Arduino Integer Module Get Evaluate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_IntegerModuleGet_Evaluate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_IntegerModuleGet_Evaluate> arduino_IntegerModuleGet_Evaluate_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_BooleanConstant_Evaluate_Sequence() <em>Arduino Boolean Constant Evaluate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_BooleanConstant_Evaluate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_BooleanConstant_Evaluate> arduino_BooleanConstant_Evaluate_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_ModuleAssignment_Call_Sequence() <em>Arduino Module Assignment Call Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_ModuleAssignment_Call_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleAssignment_Call> arduino_ModuleAssignment_Call_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_IntegerConstant_Evaluate_Sequence() <em>Arduino Integer Constant Evaluate Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_IntegerConstant_Evaluate_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_IntegerConstant_Evaluate> arduino_IntegerConstant_Evaluate_Sequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, ArduinoTracePackage.TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getRootSteps() {
		if (rootSteps == null) {
			rootSteps = new EObjectContainmentEList<Step>(Step.class, this, ArduinoTracePackage.TRACE__ROOT_STEPS);
		}
		return rootSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerVariable> getArduino_tracedIntegerVariables() {
		if (arduino_tracedIntegerVariables == null) {
			arduino_tracedIntegerVariables = new EObjectContainmentEList<TracedIntegerVariable>(TracedIntegerVariable.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES);
		}
		return arduino_tracedIntegerVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedAnalogPin> getArduino_tracedAnalogPins() {
		if (arduino_tracedAnalogPins == null) {
			arduino_tracedAnalogPins = new EObjectContainmentEList<TracedAnalogPin>(TracedAnalogPin.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS);
		}
		return arduino_tracedAnalogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanVariable> getArduino_tracedBooleanVariables() {
		if (arduino_tracedBooleanVariables == null) {
			arduino_tracedBooleanVariables = new EObjectContainmentEList<TracedBooleanVariable>(TracedBooleanVariable.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES);
		}
		return arduino_tracedBooleanVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDigitalPin> getArduino_tracedDigitalPins() {
		if (arduino_tracedDigitalPins == null) {
			arduino_tracedDigitalPins = new EObjectContainmentEList<TracedDigitalPin>(TracedDigitalPin.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS);
		}
		return arduino_tracedDigitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_BooleanModuleGet_Evaluate> getArduino_BooleanModuleGet_Evaluate_Sequence() {
		if (arduino_BooleanModuleGet_Evaluate_Sequence == null) {
			arduino_BooleanModuleGet_Evaluate_Sequence = new EObjectResolvingEList<Arduino_BooleanModuleGet_Evaluate>(Arduino_BooleanModuleGet_Evaluate.class, this, ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_SEQUENCE);
		}
		return arduino_BooleanModuleGet_Evaluate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_ModuleAssignment_Execute> getArduino_ModuleAssignment_Execute_Sequence() {
		if (arduino_ModuleAssignment_Execute_Sequence == null) {
			arduino_ModuleAssignment_Execute_Sequence = new EObjectResolvingEList<Arduino_ModuleAssignment_Execute>(Arduino_ModuleAssignment_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE);
		}
		return arduino_ModuleAssignment_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_While_Execute> getArduino_While_Execute_Sequence() {
		if (arduino_While_Execute_Sequence == null) {
			arduino_While_Execute_Sequence = new EObjectResolvingEList<Arduino_While_Execute>(Arduino_While_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE);
		}
		return arduino_While_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Utilities_Execute> getArduino_Utilities_Execute_Sequence() {
		if (arduino_Utilities_Execute_Sequence == null) {
			arduino_Utilities_Execute_Sequence = new EObjectResolvingEList<Arduino_Utilities_Execute>(Arduino_Utilities_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE);
		}
		return arduino_Utilities_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Sequence() {
		if (arduino_Delay_Execute_Sequence == null) {
			arduino_Delay_Execute_Sequence = new EObjectResolvingEList<Arduino_Delay_Execute>(Arduino_Delay_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE);
		}
		return arduino_Delay_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_If_Execute> getArduino_If_Execute_Sequence() {
		if (arduino_If_Execute_Sequence == null) {
			arduino_If_Execute_Sequence = new EObjectResolvingEList<Arduino_If_Execute>(Arduino_If_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE);
		}
		return arduino_If_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableDeclaration_Execute> getArduino_VariableDeclaration_Execute_Sequence() {
		if (arduino_VariableDeclaration_Execute_Sequence == null) {
			arduino_VariableDeclaration_Execute_Sequence = new EObjectResolvingEList<Arduino_VariableDeclaration_Execute>(Arduino_VariableDeclaration_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE);
		}
		return arduino_VariableDeclaration_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableAssignment_Execute> getArduino_VariableAssignment_Execute_Sequence() {
		if (arduino_VariableAssignment_Execute_Sequence == null) {
			arduino_VariableAssignment_Execute_Sequence = new EObjectResolvingEList<Arduino_VariableAssignment_Execute>(Arduino_VariableAssignment_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE);
		}
		return arduino_VariableAssignment_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Sequence() {
		if (arduino_Repeat_Execute_Sequence == null) {
			arduino_Repeat_Execute_Sequence = new EObjectResolvingEList<Arduino_Repeat_Execute>(Arduino_Repeat_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE);
		}
		return arduino_Repeat_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_IntegerModuleGet_Evaluate> getArduino_IntegerModuleGet_Evaluate_Sequence() {
		if (arduino_IntegerModuleGet_Evaluate_Sequence == null) {
			arduino_IntegerModuleGet_Evaluate_Sequence = new EObjectResolvingEList<Arduino_IntegerModuleGet_Evaluate>(Arduino_IntegerModuleGet_Evaluate.class, this, ArduinoTracePackage.TRACE__ARDUINO_INTEGER_MODULE_GET_EVALUATE_SEQUENCE);
		}
		return arduino_IntegerModuleGet_Evaluate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_BooleanConstant_Evaluate> getArduino_BooleanConstant_Evaluate_Sequence() {
		if (arduino_BooleanConstant_Evaluate_Sequence == null) {
			arduino_BooleanConstant_Evaluate_Sequence = new EObjectResolvingEList<Arduino_BooleanConstant_Evaluate>(Arduino_BooleanConstant_Evaluate.class, this, ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_CONSTANT_EVALUATE_SEQUENCE);
		}
		return arduino_BooleanConstant_Evaluate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_ModuleAssignment_Call> getArduino_ModuleAssignment_Call_Sequence() {
		if (arduino_ModuleAssignment_Call_Sequence == null) {
			arduino_ModuleAssignment_Call_Sequence = new EObjectResolvingEList<Arduino_ModuleAssignment_Call>(Arduino_ModuleAssignment_Call.class, this, ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_CALL_SEQUENCE);
		}
		return arduino_ModuleAssignment_Call_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_IntegerConstant_Evaluate> getArduino_IntegerConstant_Evaluate_Sequence() {
		if (arduino_IntegerConstant_Evaluate_Sequence == null) {
			arduino_IntegerConstant_Evaluate_Sequence = new EObjectResolvingEList<Arduino_IntegerConstant_Evaluate>(Arduino_IntegerConstant_Evaluate.class, this, ArduinoTracePackage.TRACE__ARDUINO_INTEGER_CONSTANT_EVALUATE_SEQUENCE);
		}
		return arduino_IntegerConstant_Evaluate_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedIntegerVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return ((InternalEList<?>)getArduino_tracedAnalogPins()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedBooleanVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return ((InternalEList<?>)getArduino_tracedDigitalPins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return getStatesTrace();
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return getRootSteps();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return getArduino_tracedIntegerVariables();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return getArduino_tracedAnalogPins();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return getArduino_tracedBooleanVariables();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return getArduino_tracedDigitalPins();
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_SEQUENCE:
				return getArduino_BooleanModuleGet_Evaluate_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_ModuleAssignment_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				return getArduino_While_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				return getArduino_Utilities_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return getArduino_Delay_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return getArduino_If_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return getArduino_VariableDeclaration_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_VariableAssignment_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return getArduino_Repeat_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_MODULE_GET_EVALUATE_SEQUENCE:
				return getArduino_IntegerModuleGet_Evaluate_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_CONSTANT_EVALUATE_SEQUENCE:
				return getArduino_BooleanConstant_Evaluate_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_CALL_SEQUENCE:
				return getArduino_ModuleAssignment_Call_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_CONSTANT_EVALUATE_SEQUENCE:
				return getArduino_IntegerConstant_Evaluate_Sequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				getRootSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				getArduino_tracedIntegerVariables().clear();
				getArduino_tracedIntegerVariables().addAll((Collection<? extends TracedIntegerVariable>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				getArduino_tracedAnalogPins().addAll((Collection<? extends TracedAnalogPin>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				getArduino_tracedBooleanVariables().clear();
				getArduino_tracedBooleanVariables().addAll((Collection<? extends TracedBooleanVariable>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				getArduino_tracedDigitalPins().addAll((Collection<? extends TracedDigitalPin>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_SEQUENCE:
				getArduino_BooleanModuleGet_Evaluate_Sequence().clear();
				getArduino_BooleanModuleGet_Evaluate_Sequence().addAll((Collection<? extends Arduino_BooleanModuleGet_Evaluate>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				getArduino_ModuleAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_ModuleAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				getArduino_While_Execute_Sequence().clear();
				getArduino_While_Execute_Sequence().addAll((Collection<? extends Arduino_While_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				getArduino_Utilities_Execute_Sequence().clear();
				getArduino_Utilities_Execute_Sequence().addAll((Collection<? extends Arduino_Utilities_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				getArduino_Delay_Execute_Sequence().addAll((Collection<? extends Arduino_Delay_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				getArduino_If_Execute_Sequence().addAll((Collection<? extends Arduino_If_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				getArduino_VariableDeclaration_Execute_Sequence().addAll((Collection<? extends Arduino_VariableDeclaration_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				getArduino_VariableAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_VariableAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				getArduino_Repeat_Execute_Sequence().addAll((Collection<? extends Arduino_Repeat_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_MODULE_GET_EVALUATE_SEQUENCE:
				getArduino_IntegerModuleGet_Evaluate_Sequence().clear();
				getArduino_IntegerModuleGet_Evaluate_Sequence().addAll((Collection<? extends Arduino_IntegerModuleGet_Evaluate>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_CONSTANT_EVALUATE_SEQUENCE:
				getArduino_BooleanConstant_Evaluate_Sequence().clear();
				getArduino_BooleanConstant_Evaluate_Sequence().addAll((Collection<? extends Arduino_BooleanConstant_Evaluate>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_CALL_SEQUENCE:
				getArduino_ModuleAssignment_Call_Sequence().clear();
				getArduino_ModuleAssignment_Call_Sequence().addAll((Collection<? extends Arduino_ModuleAssignment_Call>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_CONSTANT_EVALUATE_SEQUENCE:
				getArduino_IntegerConstant_Evaluate_Sequence().clear();
				getArduino_IntegerConstant_Evaluate_Sequence().addAll((Collection<? extends Arduino_IntegerConstant_Evaluate>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				getArduino_tracedIntegerVariables().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				getArduino_tracedBooleanVariables().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_SEQUENCE:
				getArduino_BooleanModuleGet_Evaluate_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				getArduino_While_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				getArduino_Utilities_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_MODULE_GET_EVALUATE_SEQUENCE:
				getArduino_IntegerModuleGet_Evaluate_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_CONSTANT_EVALUATE_SEQUENCE:
				getArduino_BooleanConstant_Evaluate_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_CALL_SEQUENCE:
				getArduino_ModuleAssignment_Call_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_CONSTANT_EVALUATE_SEQUENCE:
				getArduino_IntegerConstant_Evaluate_Sequence().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return rootSteps != null && !rootSteps.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return arduino_tracedIntegerVariables != null && !arduino_tracedIntegerVariables.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return arduino_tracedAnalogPins != null && !arduino_tracedAnalogPins.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return arduino_tracedBooleanVariables != null && !arduino_tracedBooleanVariables.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return arduino_tracedDigitalPins != null && !arduino_tracedDigitalPins.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_SEQUENCE:
				return arduino_BooleanModuleGet_Evaluate_Sequence != null && !arduino_BooleanModuleGet_Evaluate_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_ModuleAssignment_Execute_Sequence != null && !arduino_ModuleAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				return arduino_While_Execute_Sequence != null && !arduino_While_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				return arduino_Utilities_Execute_Sequence != null && !arduino_Utilities_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return arduino_Delay_Execute_Sequence != null && !arduino_Delay_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return arduino_If_Execute_Sequence != null && !arduino_If_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return arduino_VariableDeclaration_Execute_Sequence != null && !arduino_VariableDeclaration_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_VariableAssignment_Execute_Sequence != null && !arduino_VariableAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return arduino_Repeat_Execute_Sequence != null && !arduino_Repeat_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_MODULE_GET_EVALUATE_SEQUENCE:
				return arduino_IntegerModuleGet_Evaluate_Sequence != null && !arduino_IntegerModuleGet_Evaluate_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_BOOLEAN_CONSTANT_EVALUATE_SEQUENCE:
				return arduino_BooleanConstant_Evaluate_Sequence != null && !arduino_BooleanConstant_Evaluate_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_CALL_SEQUENCE:
				return arduino_ModuleAssignment_Call_Sequence != null && !arduino_ModuleAssignment_Call_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_INTEGER_CONSTANT_EVALUATE_SEQUENCE:
				return arduino_IntegerConstant_Evaluate_Sequence != null && !arduino_IntegerConstant_Evaluate_Sequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl

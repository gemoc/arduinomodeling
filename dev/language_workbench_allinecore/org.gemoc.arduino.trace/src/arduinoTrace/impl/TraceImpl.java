/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.State;

import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedBooleanValue;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedNumberValue;
import arduinoTrace.States.arduino.TracedStringValue;
import arduinoTrace.States.arduino.TracedVariable;

import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_Level_Execute;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Set_Execute;
import arduinoTrace.Steps.Arduino_Status_Call;
import arduinoTrace.Steps.Arduino_Status_Execute;
import arduinoTrace.Steps.Arduino_Utilities_Call;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
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
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedVariables <em>Arduino traced Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedNumberValues <em>Arduino traced Number Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedBooleanValues <em>Arduino traced Boolean Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedStringValues <em>Arduino traced String Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Level_Execute_Sequence <em>Arduino Level Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Status_Execute_Sequence <em>Arduino Status Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Set_Execute_Sequence <em>Arduino Set Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Status_Call_Sequence <em>Arduino Status Call Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Utilities_Call_Sequence <em>Arduino Utilities Call Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_FunctionCall_Execute_Sequence <em>Arduino Function Call Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_While_Execute_Sequence <em>Arduino While Execute Sequence</em>}</li>
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
	 * The cached value of the '{@link #getArduino_tracedVariables() <em>Arduino traced Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVariable> arduino_tracedVariables;

	/**
	 * The cached value of the '{@link #getArduino_tracedNumberValues() <em>Arduino traced Number Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedNumberValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedNumberValue> arduino_tracedNumberValues;

	/**
	 * The cached value of the '{@link #getArduino_tracedBooleanValues() <em>Arduino traced Boolean Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBooleanValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanValue> arduino_tracedBooleanValues;

	/**
	 * The cached value of the '{@link #getArduino_tracedStringValues() <em>Arduino traced String Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedStringValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedStringValue> arduino_tracedStringValues;

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
	 * The cached value of the '{@link #getArduino_tracedAnalogPins() <em>Arduino traced Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAnalogPin> arduino_tracedAnalogPins;

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
	 * The cached value of the '{@link #getArduino_Level_Execute_Sequence() <em>Arduino Level Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Level_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Level_Execute> arduino_Level_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Status_Execute_Sequence() <em>Arduino Status Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Status_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Status_Execute> arduino_Status_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Set_Execute_Sequence() <em>Arduino Set Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Set_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Set_Execute> arduino_Set_Execute_Sequence;

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
	 * The cached value of the '{@link #getArduino_Status_Call_Sequence() <em>Arduino Status Call Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Status_Call_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Status_Call> arduino_Status_Call_Sequence;

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
	 * The cached value of the '{@link #getArduino_Project_Setup_Sequence() <em>Arduino Project Setup Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Project_Setup_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Project_Setup> arduino_Project_Setup_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Utilities_Call_Sequence() <em>Arduino Utilities Call Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Utilities_Call_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Utilities_Call> arduino_Utilities_Call_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_FunctionCall_Execute_Sequence() <em>Arduino Function Call Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_FunctionCall_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_FunctionCall_Execute> arduino_FunctionCall_Execute_Sequence;

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
	public EList<TracedVariable> getArduino_tracedVariables() {
		if (arduino_tracedVariables == null) {
			arduino_tracedVariables = new EObjectContainmentEList<TracedVariable>(TracedVariable.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_VARIABLES);
		}
		return arduino_tracedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedNumberValue> getArduino_tracedNumberValues() {
		if (arduino_tracedNumberValues == null) {
			arduino_tracedNumberValues = new EObjectContainmentEList<TracedNumberValue>(TracedNumberValue.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_NUMBER_VALUES);
		}
		return arduino_tracedNumberValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanValue> getArduino_tracedBooleanValues() {
		if (arduino_tracedBooleanValues == null) {
			arduino_tracedBooleanValues = new EObjectContainmentEList<TracedBooleanValue>(TracedBooleanValue.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VALUES);
		}
		return arduino_tracedBooleanValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedStringValue> getArduino_tracedStringValues() {
		if (arduino_tracedStringValues == null) {
			arduino_tracedStringValues = new EObjectContainmentEList<TracedStringValue>(TracedStringValue.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_STRING_VALUES);
		}
		return arduino_tracedStringValues;
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
	public EList<Arduino_Level_Execute> getArduino_Level_Execute_Sequence() {
		if (arduino_Level_Execute_Sequence == null) {
			arduino_Level_Execute_Sequence = new EObjectResolvingEList<Arduino_Level_Execute>(Arduino_Level_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE);
		}
		return arduino_Level_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Status_Execute> getArduino_Status_Execute_Sequence() {
		if (arduino_Status_Execute_Sequence == null) {
			arduino_Status_Execute_Sequence = new EObjectResolvingEList<Arduino_Status_Execute>(Arduino_Status_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE);
		}
		return arduino_Status_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Set_Execute> getArduino_Set_Execute_Sequence() {
		if (arduino_Set_Execute_Sequence == null) {
			arduino_Set_Execute_Sequence = new EObjectResolvingEList<Arduino_Set_Execute>(Arduino_Set_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_SET_EXECUTE_SEQUENCE);
		}
		return arduino_Set_Execute_Sequence;
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
	public EList<Arduino_Status_Call> getArduino_Status_Call_Sequence() {
		if (arduino_Status_Call_Sequence == null) {
			arduino_Status_Call_Sequence = new EObjectResolvingEList<Arduino_Status_Call>(Arduino_Status_Call.class, this, ArduinoTracePackage.TRACE__ARDUINO_STATUS_CALL_SEQUENCE);
		}
		return arduino_Status_Call_Sequence;
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
	public EList<Arduino_Project_Setup> getArduino_Project_Setup_Sequence() {
		if (arduino_Project_Setup_Sequence == null) {
			arduino_Project_Setup_Sequence = new EObjectResolvingEList<Arduino_Project_Setup>(Arduino_Project_Setup.class, this, ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE);
		}
		return arduino_Project_Setup_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Utilities_Call> getArduino_Utilities_Call_Sequence() {
		if (arduino_Utilities_Call_Sequence == null) {
			arduino_Utilities_Call_Sequence = new EObjectResolvingEList<Arduino_Utilities_Call>(Arduino_Utilities_Call.class, this, ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE);
		}
		return arduino_Utilities_Call_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_FunctionCall_Execute> getArduino_FunctionCall_Execute_Sequence() {
		if (arduino_FunctionCall_Execute_Sequence == null) {
			arduino_FunctionCall_Execute_Sequence = new EObjectResolvingEList<Arduino_FunctionCall_Execute>(Arduino_FunctionCall_Execute.class, this, ArduinoTracePackage.TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE);
		}
		return arduino_FunctionCall_Execute_Sequence;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_NUMBER_VALUES:
				return ((InternalEList<?>)getArduino_tracedNumberValues()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VALUES:
				return ((InternalEList<?>)getArduino_tracedBooleanValues()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_STRING_VALUES:
				return ((InternalEList<?>)getArduino_tracedStringValues()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return ((InternalEList<?>)getArduino_tracedDigitalPins()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return ((InternalEList<?>)getArduino_tracedAnalogPins()).basicRemove(otherEnd, msgs);
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
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_VARIABLES:
				return getArduino_tracedVariables();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_NUMBER_VALUES:
				return getArduino_tracedNumberValues();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VALUES:
				return getArduino_tracedBooleanValues();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_STRING_VALUES:
				return getArduino_tracedStringValues();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return getArduino_tracedDigitalPins();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return getArduino_tracedAnalogPins();
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return getArduino_If_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE:
				return getArduino_Level_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE:
				return getArduino_Status_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_SET_EXECUTE_SEQUENCE:
				return getArduino_Set_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				return getArduino_Utilities_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return getArduino_Delay_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_CALL_SEQUENCE:
				return getArduino_Status_Call_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return getArduino_Repeat_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return getArduino_Project_Setup_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE:
				return getArduino_Utilities_Call_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE:
				return getArduino_FunctionCall_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				return getArduino_While_Execute_Sequence();
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
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_VARIABLES:
				getArduino_tracedVariables().clear();
				getArduino_tracedVariables().addAll((Collection<? extends TracedVariable>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_NUMBER_VALUES:
				getArduino_tracedNumberValues().clear();
				getArduino_tracedNumberValues().addAll((Collection<? extends TracedNumberValue>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VALUES:
				getArduino_tracedBooleanValues().clear();
				getArduino_tracedBooleanValues().addAll((Collection<? extends TracedBooleanValue>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_STRING_VALUES:
				getArduino_tracedStringValues().clear();
				getArduino_tracedStringValues().addAll((Collection<? extends TracedStringValue>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				getArduino_tracedDigitalPins().addAll((Collection<? extends TracedDigitalPin>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				getArduino_tracedAnalogPins().addAll((Collection<? extends TracedAnalogPin>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				getArduino_If_Execute_Sequence().addAll((Collection<? extends Arduino_If_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE:
				getArduino_Level_Execute_Sequence().clear();
				getArduino_Level_Execute_Sequence().addAll((Collection<? extends Arduino_Level_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE:
				getArduino_Status_Execute_Sequence().clear();
				getArduino_Status_Execute_Sequence().addAll((Collection<? extends Arduino_Status_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_SET_EXECUTE_SEQUENCE:
				getArduino_Set_Execute_Sequence().clear();
				getArduino_Set_Execute_Sequence().addAll((Collection<? extends Arduino_Set_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				getArduino_Utilities_Execute_Sequence().clear();
				getArduino_Utilities_Execute_Sequence().addAll((Collection<? extends Arduino_Utilities_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				getArduino_Delay_Execute_Sequence().addAll((Collection<? extends Arduino_Delay_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_CALL_SEQUENCE:
				getArduino_Status_Call_Sequence().clear();
				getArduino_Status_Call_Sequence().addAll((Collection<? extends Arduino_Status_Call>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				getArduino_Repeat_Execute_Sequence().addAll((Collection<? extends Arduino_Repeat_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				getArduino_Project_Setup_Sequence().addAll((Collection<? extends Arduino_Project_Setup>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE:
				getArduino_Utilities_Call_Sequence().clear();
				getArduino_Utilities_Call_Sequence().addAll((Collection<? extends Arduino_Utilities_Call>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE:
				getArduino_FunctionCall_Execute_Sequence().clear();
				getArduino_FunctionCall_Execute_Sequence().addAll((Collection<? extends Arduino_FunctionCall_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				getArduino_While_Execute_Sequence().clear();
				getArduino_While_Execute_Sequence().addAll((Collection<? extends Arduino_While_Execute>)newValue);
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
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_VARIABLES:
				getArduino_tracedVariables().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_NUMBER_VALUES:
				getArduino_tracedNumberValues().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VALUES:
				getArduino_tracedBooleanValues().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_STRING_VALUES:
				getArduino_tracedStringValues().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE:
				getArduino_Level_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE:
				getArduino_Status_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_SET_EXECUTE_SEQUENCE:
				getArduino_Set_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				getArduino_Utilities_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_CALL_SEQUENCE:
				getArduino_Status_Call_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE:
				getArduino_Utilities_Call_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE:
				getArduino_FunctionCall_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				getArduino_While_Execute_Sequence().clear();
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
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_VARIABLES:
				return arduino_tracedVariables != null && !arduino_tracedVariables.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_NUMBER_VALUES:
				return arduino_tracedNumberValues != null && !arduino_tracedNumberValues.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VALUES:
				return arduino_tracedBooleanValues != null && !arduino_tracedBooleanValues.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_STRING_VALUES:
				return arduino_tracedStringValues != null && !arduino_tracedStringValues.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return arduino_tracedDigitalPins != null && !arduino_tracedDigitalPins.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return arduino_tracedAnalogPins != null && !arduino_tracedAnalogPins.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return arduino_If_Execute_Sequence != null && !arduino_If_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE:
				return arduino_Level_Execute_Sequence != null && !arduino_Level_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE:
				return arduino_Status_Execute_Sequence != null && !arduino_Status_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_SET_EXECUTE_SEQUENCE:
				return arduino_Set_Execute_Sequence != null && !arduino_Set_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE:
				return arduino_Utilities_Execute_Sequence != null && !arduino_Utilities_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return arduino_Delay_Execute_Sequence != null && !arduino_Delay_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_STATUS_CALL_SEQUENCE:
				return arduino_Status_Call_Sequence != null && !arduino_Status_Call_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return arduino_Repeat_Execute_Sequence != null && !arduino_Repeat_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return arduino_Project_Setup_Sequence != null && !arduino_Project_Setup_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE:
				return arduino_Utilities_Call_Sequence != null && !arduino_Utilities_Call_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE:
				return arduino_FunctionCall_Execute_Sequence != null && !arduino_FunctionCall_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE:
				return arduino_While_Execute_Sequence != null && !arduino_While_Execute_Sequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl

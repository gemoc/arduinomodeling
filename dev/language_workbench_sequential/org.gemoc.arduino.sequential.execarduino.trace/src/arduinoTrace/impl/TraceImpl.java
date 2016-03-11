/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.State;

import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedIntegerVariable;

import arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
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
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedBluetoothTransceivers <em>Arduino traced Bluetooth Transceivers</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedBooleanVariables <em>Arduino traced Boolean Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getArduino_tracedIntegerVariables <em>Arduino traced Integer Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link arduinoTrace.impl.TraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getArduino_BluetoothTransceiver_Push_Sequence() <em>Arduino Bluetooth Transceiver Push Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_BluetoothTransceiver_Push_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_BluetoothTransceiver_Push> arduino_BluetoothTransceiver_Push_Sequence;

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
	 * The cached value of the '{@link #getArduino_ModuleAssignment_Execute_Sequence() <em>Arduino Module Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_ModuleAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleAssignment_Execute> arduino_ModuleAssignment_Execute_Sequence;

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
	 * The cached value of the '{@link #getArduino_Repeat_Execute_Sequence() <em>Arduino Repeat Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Repeat_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Repeat_Execute> arduino_Repeat_Execute_Sequence;

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
	 * The cached value of the '{@link #getArduino_VariableDeclaration_Execute_Sequence() <em>Arduino Variable Declaration Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableDeclaration_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableDeclaration_Execute> arduino_VariableDeclaration_Execute_Sequence;

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
	 * The cached value of the '{@link #getArduino_tracedBluetoothTransceivers() <em>Arduino traced Bluetooth Transceivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBluetoothTransceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBluetoothTransceiver> arduino_tracedBluetoothTransceivers;

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
	 * The cached value of the '{@link #getArduino_tracedIntegerVariables() <em>Arduino traced Integer Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedIntegerVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerVariable> arduino_tracedIntegerVariables;

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
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

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
	public EList<Arduino_BluetoothTransceiver_Push> getArduino_BluetoothTransceiver_Push_Sequence() {
		if (arduino_BluetoothTransceiver_Push_Sequence == null) {
			arduino_BluetoothTransceiver_Push_Sequence = new EObjectResolvingEList<Arduino_BluetoothTransceiver_Push>(Arduino_BluetoothTransceiver_Push.class, this, ArduinoTracePackage.TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE);
		}
		return arduino_BluetoothTransceiver_Push_Sequence;
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
	public EList<TracedBluetoothTransceiver> getArduino_tracedBluetoothTransceivers() {
		if (arduino_tracedBluetoothTransceivers == null) {
			arduino_tracedBluetoothTransceivers = new EObjectContainmentEList<TracedBluetoothTransceiver>(TracedBluetoothTransceiver.class, this, ArduinoTracePackage.TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS);
		}
		return arduino_tracedBluetoothTransceivers;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return ((InternalEList<?>)getArduino_tracedAnalogPins()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				return ((InternalEList<?>)getArduino_tracedBluetoothTransceivers()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedBooleanVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return ((InternalEList<?>)getArduino_tracedDigitalPins()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedIntegerVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return ((InternalEList<?>)getRootSteps()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case ArduinoTracePackage.TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				return getArduino_BluetoothTransceiver_Push_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return getArduino_Delay_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return getArduino_If_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_ModuleAssignment_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return getArduino_Project_Setup_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return getArduino_Repeat_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_VariableAssignment_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return getArduino_VariableDeclaration_Execute_Sequence();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return getArduino_tracedAnalogPins();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				return getArduino_tracedBluetoothTransceivers();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return getArduino_tracedBooleanVariables();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return getArduino_tracedDigitalPins();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return getArduino_tracedIntegerVariables();
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return getRootSteps();
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case ArduinoTracePackage.TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				getArduino_BluetoothTransceiver_Push_Sequence().clear();
				getArduino_BluetoothTransceiver_Push_Sequence().addAll((Collection<? extends Arduino_BluetoothTransceiver_Push>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				getArduino_Delay_Execute_Sequence().addAll((Collection<? extends Arduino_Delay_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				getArduino_If_Execute_Sequence().addAll((Collection<? extends Arduino_If_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				getArduino_ModuleAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_ModuleAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				getArduino_Project_Setup_Sequence().addAll((Collection<? extends Arduino_Project_Setup>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				getArduino_Repeat_Execute_Sequence().addAll((Collection<? extends Arduino_Repeat_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				getArduino_VariableAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_VariableAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				getArduino_VariableDeclaration_Execute_Sequence().addAll((Collection<? extends Arduino_VariableDeclaration_Execute>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				getArduino_tracedAnalogPins().addAll((Collection<? extends TracedAnalogPin>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				getArduino_tracedBluetoothTransceivers().clear();
				getArduino_tracedBluetoothTransceivers().addAll((Collection<? extends TracedBluetoothTransceiver>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				getArduino_tracedBooleanVariables().clear();
				getArduino_tracedBooleanVariables().addAll((Collection<? extends TracedBooleanVariable>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				getArduino_tracedDigitalPins().addAll((Collection<? extends TracedDigitalPin>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				getArduino_tracedIntegerVariables().clear();
				getArduino_tracedIntegerVariables().addAll((Collection<? extends TracedIntegerVariable>)newValue);
				return;
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				getRootSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case ArduinoTracePackage.TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				getArduino_BluetoothTransceiver_Push_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				getArduino_tracedBluetoothTransceivers().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				getArduino_tracedBooleanVariables().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				return;
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				getArduino_tracedIntegerVariables().clear();
				return;
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				getRootSteps().clear();
				return;
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case ArduinoTracePackage.TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				return arduino_BluetoothTransceiver_Push_Sequence != null && !arduino_BluetoothTransceiver_Push_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return arduino_Delay_Execute_Sequence != null && !arduino_Delay_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return arduino_If_Execute_Sequence != null && !arduino_If_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_ModuleAssignment_Execute_Sequence != null && !arduino_ModuleAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return arduino_Project_Setup_Sequence != null && !arduino_Project_Setup_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return arduino_Repeat_Execute_Sequence != null && !arduino_Repeat_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_VariableAssignment_Execute_Sequence != null && !arduino_VariableAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return arduino_VariableDeclaration_Execute_Sequence != null && !arduino_VariableDeclaration_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return arduino_tracedAnalogPins != null && !arduino_tracedAnalogPins.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				return arduino_tracedBluetoothTransceivers != null && !arduino_tracedBluetoothTransceivers.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return arduino_tracedBooleanVariables != null && !arduino_tracedBooleanVariables.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return arduino_tracedDigitalPins != null && !arduino_tracedDigitalPins.isEmpty();
			case ArduinoTracePackage.TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return arduino_tracedIntegerVariables != null && !arduino_tracedIntegerVariables.isEmpty();
			case ArduinoTracePackage.TRACE__ROOT_STEPS:
				return rootSteps != null && !rootSteps.isEmpty();
			case ArduinoTracePackage.TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl

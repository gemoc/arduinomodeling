/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoFactory;
import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedArduinoCommunicationModule;
import arduinoTrace.States.arduino.TracedArduinoDigitalModule;
import arduinoTrace.States.arduino.TracedArduinoModule;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedIntegerVariable;
import arduinoTrace.States.arduino.TracedModule;
import arduinoTrace.States.arduino.TracedNamedElement;
import arduinoTrace.States.arduino.TracedPin;
import arduinoTrace.States.arduino.TracedVariable;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAnalogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoCommunicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoDigitalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBluetoothTransceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDigitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arduinoTrace.States.arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAnalogPin() {
		return tracedAnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAnalogPin_Module() {
		return (EReference)tracedAnalogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAnalogPin_OriginalObject() {
		return (EReference)tracedAnalogPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoCommunicationModule() {
		return tracedArduinoCommunicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoDigitalModule() {
		return tracedArduinoDigitalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoModule() {
		return tracedArduinoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBluetoothTransceiver() {
		return tracedBluetoothTransceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_ConnectedTransceiver() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_DataReceivedSequence() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_DataToSendSequence() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_OriginalObject() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanVariable() {
		return tracedBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_OriginalObject() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_ValueSequence() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDigitalPin() {
		return tracedDigitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDigitalPin_Module() {
		return (EReference)tracedDigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDigitalPin_OriginalObject() {
		return (EReference)tracedDigitalPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerVariable() {
		return tracedIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_OriginalObject() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_ValueSequence() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedModule() {
		return tracedModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPin() {
		return tracedPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPin_LevelSequence() {
		return (EReference)tracedPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariable() {
		return tracedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tracedAnalogPinEClass = createEClass(TRACED_ANALOG_PIN);
		createEReference(tracedAnalogPinEClass, TRACED_ANALOG_PIN__MODULE);
		createEReference(tracedAnalogPinEClass, TRACED_ANALOG_PIN__ORIGINAL_OBJECT);

		tracedArduinoCommunicationModuleEClass = createEClass(TRACED_ARDUINO_COMMUNICATION_MODULE);

		tracedArduinoDigitalModuleEClass = createEClass(TRACED_ARDUINO_DIGITAL_MODULE);

		tracedArduinoModuleEClass = createEClass(TRACED_ARDUINO_MODULE);

		tracedBluetoothTransceiverEClass = createEClass(TRACED_BLUETOOTH_TRANSCEIVER);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE);

		tracedDigitalPinEClass = createEClass(TRACED_DIGITAL_PIN);
		createEReference(tracedDigitalPinEClass, TRACED_DIGITAL_PIN__MODULE);
		createEReference(tracedDigitalPinEClass, TRACED_DIGITAL_PIN__ORIGINAL_OBJECT);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE);

		tracedModuleEClass = createEClass(TRACED_MODULE);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedPinEClass = createEClass(TRACED_PIN);
		createEReference(tracedPinEClass, TRACED_PIN__LEVEL_SEQUENCE);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage theArduinoPackage_1 = (org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedAnalogPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedArduinoCommunicationModuleEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedArduinoDigitalModuleEClass.getESuperTypes().add(this.getTracedArduinoModule());
		tracedArduinoModuleEClass.getESuperTypes().add(this.getTracedModule());
		tracedBluetoothTransceiverEClass.getESuperTypes().add(this.getTracedArduinoCommunicationModule());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedDigitalPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedModuleEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedPinEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedVariableEClass.getESuperTypes().add(this.getTracedNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedAnalogPinEClass, TracedAnalogPin.class, "TracedAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAnalogPin_Module(), theArduinoPackage_1.getArduinoAnalogModule(), null, "module", null, 0, 1, TracedAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedAnalogPin_OriginalObject(), theArduinoPackage_1.getAnalogPin(), null, "originalObject", null, 0, 1, TracedAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedArduinoCommunicationModuleEClass, TracedArduinoCommunicationModule.class, "TracedArduinoCommunicationModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedArduinoDigitalModuleEClass, TracedArduinoDigitalModule.class, "TracedArduinoDigitalModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedArduinoModuleEClass, TracedArduinoModule.class, "TracedArduinoModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedBluetoothTransceiverEClass, TracedBluetoothTransceiver.class, "TracedBluetoothTransceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBluetoothTransceiver_ConnectedTransceiver(), this.getTracedBluetoothTransceiver(), null, "connectedTransceiver", null, 0, 1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_DataReceivedSequence(), theStatesPackage.getBluetoothTransceiver_dataReceived_Value(), theStatesPackage.getBluetoothTransceiver_dataReceived_Value_Parent(), "dataReceivedSequence", null, 0, -1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_DataToSendSequence(), theStatesPackage.getBluetoothTransceiver_dataToSend_Value(), theStatesPackage.getBluetoothTransceiver_dataToSend_Value_Parent(), "dataToSendSequence", null, 0, -1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_OriginalObject(), theArduinoPackage_1.getBluetoothTransceiver(), null, "originalObject", null, 0, 1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanVariable_OriginalObject(), theArduinoPackage_1.getBooleanVariable(), null, "originalObject", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanVariable_ValueSequence(), theStatesPackage.getBooleanVariable_value_Value(), theStatesPackage.getBooleanVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedDigitalPinEClass, TracedDigitalPin.class, "TracedDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDigitalPin_Module(), this.getTracedArduinoDigitalModule(), null, "module", null, 0, 1, TracedDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedDigitalPin_OriginalObject(), theArduinoPackage_1.getDigitalPin(), null, "originalObject", null, 0, 1, TracedDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerVariable_OriginalObject(), theArduinoPackage_1.getIntegerVariable(), null, "originalObject", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerVariable_ValueSequence(), theStatesPackage.getIntegerVariable_value_Value(), theStatesPackage.getIntegerVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedModuleEClass, TracedModule.class, "TracedModule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedPinEClass, TracedPin.class, "TracedPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPin_LevelSequence(), theStatesPackage.getPin_level_Value(), theStatesPackage.getPin_level_Value_Parent(), "levelSequence", null, 0, -1, TracedPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ArduinoPackageImpl

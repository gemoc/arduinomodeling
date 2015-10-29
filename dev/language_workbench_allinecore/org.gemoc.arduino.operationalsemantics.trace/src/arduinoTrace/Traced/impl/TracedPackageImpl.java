/**
 */
package arduinoTrace.Traced.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.Traced.TracedFactory;
import arduinoTrace.Traced.TracedObjects;
import arduinoTrace.Traced.TracedPackage;

import arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.Values.ValuesPackage;

import arduinoTrace.Values.impl.ValuesPackageImpl;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import fr.obeo.dsl.arduino.ArduinoPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracedPackageImpl extends EPackageImpl implements TracedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectsEClass = null;

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
	 * @see arduinoTrace.Traced.TracedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracedPackageImpl() {
		super(eNS_URI, TracedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracedPackage init() {
		if (isInited) return (TracedPackage)EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI);

		// Obtain or create and register package
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArduinoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.Traced.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theTracedPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theTracedPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracedPackage.eNS_URI, theTracedPackage);
		return theTracedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjects() {
		return tracedObjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Arduino_tracedDigitalPins() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Arduino_tracedAnalogPins() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Arduino_tracedVariables() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Arduino_tracedNumberValues() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Arduino_tracedStringValues() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjects_Arduino_tracedBooleanValues() {
		return (EReference)tracedObjectsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFactory getTracedFactory() {
		return (TracedFactory)getEFactoryInstance();
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
		tracedObjectsEClass = createEClass(TRACED_OBJECTS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES);
		createEReference(tracedObjectsEClass, TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES);
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
		arduinoTrace.Traced.arduino.ArduinoPackage theArduinoPackage_1 = (arduinoTrace.Traced.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theArduinoPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedObjectsEClass, TracedObjects.class, "TracedObjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedObjects_Arduino_tracedDigitalPins(), theArduinoPackage_1.getTracedDigitalPin(), null, "arduino_tracedDigitalPins", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Arduino_tracedAnalogPins(), theArduinoPackage_1.getTracedAnalogPin(), null, "arduino_tracedAnalogPins", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Arduino_tracedVariables(), theArduinoPackage_1.getTracedVariable(), null, "arduino_tracedVariables", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Arduino_tracedNumberValues(), theArduinoPackage_1.getTracedNumberValue(), null, "arduino_tracedNumberValues", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Arduino_tracedStringValues(), theArduinoPackage_1.getTracedStringValue(), null, "arduino_tracedStringValues", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTracedObjects_Arduino_tracedBooleanValues(), theArduinoPackage_1.getTracedBooleanValue(), null, "arduino_tracedBooleanValues", null, 0, -1, TracedObjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //TracedPackageImpl

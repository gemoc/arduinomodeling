/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoFactory;
import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedBooleanExpression;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedExpression;
import arduinoTrace.States.arduino.TracedIntegerExpression;
import arduinoTrace.States.arduino.TracedIntegerVariable;
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
	private EClass tracedPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableEClass = null;

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
	private EClass tracedAnalogPinEClass = null;

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
	private EClass tracedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerExpressionEClass = null;

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
	private EClass tracedBooleanExpressionEClass = null;

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
		org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eINSTANCE.eClass();

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
	public EClass getTracedAnalogPin() {
		return tracedAnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAnalogPin_OriginalObject() {
		return (EReference)tracedAnalogPinEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedDigitalPin_OriginalObject() {
		return (EReference)tracedDigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExpression() {
		return tracedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerExpression() {
		return tracedIntegerExpressionEClass;
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
	public EClass getTracedBooleanExpression() {
		return tracedBooleanExpressionEClass;
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
		tracedPinEClass = createEClass(TRACED_PIN);
		createEReference(tracedPinEClass, TRACED_PIN__LEVEL_SEQUENCE);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE);

		tracedAnalogPinEClass = createEClass(TRACED_ANALOG_PIN);
		createEReference(tracedAnalogPinEClass, TRACED_ANALOG_PIN__ORIGINAL_OBJECT);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE);

		tracedDigitalPinEClass = createEClass(TRACED_DIGITAL_PIN);
		createEReference(tracedDigitalPinEClass, TRACED_DIGITAL_PIN__ORIGINAL_OBJECT);

		tracedExpressionEClass = createEClass(TRACED_EXPRESSION);

		tracedIntegerExpressionEClass = createEClass(TRACED_INTEGER_EXPRESSION);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedBooleanExpressionEClass = createEClass(TRACED_BOOLEAN_EXPRESSION);
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage theArduinoPackage_1 = (org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedVariableEClass.getESuperTypes().add(this.getTracedExpression());
		tracedVariableEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedIntegerExpression());
		tracedAnalogPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedBooleanExpression());
		tracedDigitalPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedIntegerExpressionEClass.getESuperTypes().add(this.getTracedExpression());
		tracedBooleanExpressionEClass.getESuperTypes().add(this.getTracedExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedPinEClass, TracedPin.class, "TracedPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPin_LevelSequence(), theStatesPackage.getPin_level_Value(), theStatesPackage.getPin_level_Value_Parent(), "levelSequence", null, 0, -1, TracedPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerVariable_OriginalObject(), theArduinoPackage_1.getIntegerVariable(), null, "originalObject", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerVariable_ValueSequence(), theStatesPackage.getIntegerVariable_value_Value(), theStatesPackage.getIntegerVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedAnalogPinEClass, TracedAnalogPin.class, "TracedAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAnalogPin_OriginalObject(), theArduinoPackage_1.getAnalogPin(), null, "originalObject", null, 0, 1, TracedAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanVariable_OriginalObject(), theArduinoPackage_1.getBooleanVariable(), null, "originalObject", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanVariable_ValueSequence(), theStatesPackage.getBooleanVariable_value_Value(), theStatesPackage.getBooleanVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedDigitalPinEClass, TracedDigitalPin.class, "TracedDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDigitalPin_OriginalObject(), theArduinoPackage_1.getDigitalPin(), null, "originalObject", null, 0, 1, TracedDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedExpressionEClass, TracedExpression.class, "TracedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedIntegerExpressionEClass, TracedIntegerExpression.class, "TracedIntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedBooleanExpressionEClass, TracedBooleanExpression.class, "TracedBooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ArduinoPackageImpl

/**
 */
package arduinoTrace.Traced.arduino.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.Traced.TracedPackage;

import arduinoTrace.Traced.arduino.ArduinoFactory;
import arduinoTrace.Traced.arduino.ArduinoPackage;
import arduinoTrace.Traced.arduino.TracedAnalogPin;
import arduinoTrace.Traced.arduino.TracedBooleanValue;
import arduinoTrace.Traced.arduino.TracedDigitalPin;
import arduinoTrace.Traced.arduino.TracedExpression;
import arduinoTrace.Traced.arduino.TracedInstruction;
import arduinoTrace.Traced.arduino.TracedNumberValue;
import arduinoTrace.Traced.arduino.TracedParameter;
import arduinoTrace.Traced.arduino.TracedPin;
import arduinoTrace.Traced.arduino.TracedStringValue;
import arduinoTrace.Traced.arduino.TracedValue;
import arduinoTrace.Traced.arduino.TracedVariable;

import arduinoTrace.Traced.impl.TracedPackageImpl;

import arduinoTrace.Values.ValuesPackage;

import arduinoTrace.Values.impl.ValuesPackageImpl;

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
	private EClass tracedDigitalPinEClass = null;

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
	private EClass tracedParameterEClass = null;

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
	private EClass tracedValueEClass = null;

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
	private EClass tracedNumberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInstructionEClass = null;

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
	private EClass tracedBooleanValueEClass = null;

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
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#eNS_URI
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
		fr.obeo.dsl.arduino.ArduinoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) : TracedPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theTracedPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theTracedPackage.initializePackageContents();

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
	public EClass getTracedParameter() {
		return tracedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedParameter_Definition() {
		return (EReference)tracedParameterEClass.getEStructuralFeatures().get(0);
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
	public EReference getTracedVariable_Value() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_OriginalObject() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedVariable_ValueTrace() {
		return (EReference)tracedVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValue() {
		return tracedValueEClass;
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
	public EReference getTracedPin_LevelTrace() {
		return (EReference)tracedPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNumberValue() {
		return tracedNumberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedNumberValue_ValueTrace() {
		return (EReference)tracedNumberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStringValue() {
		return tracedStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedStringValue_ValueTrace() {
		return (EReference)tracedStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInstruction() {
		return tracedInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInstruction_Previous() {
		return (EReference)tracedInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInstruction_Next() {
		return (EReference)tracedInstructionEClass.getEStructuralFeatures().get(1);
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
	public EClass getTracedBooleanValue() {
		return tracedBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanValue_ValueTrace() {
		return (EReference)tracedBooleanValueEClass.getEStructuralFeatures().get(0);
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
		tracedDigitalPinEClass = createEClass(TRACED_DIGITAL_PIN);
		createEReference(tracedDigitalPinEClass, TRACED_DIGITAL_PIN__ORIGINAL_OBJECT);

		tracedAnalogPinEClass = createEClass(TRACED_ANALOG_PIN);
		createEReference(tracedAnalogPinEClass, TRACED_ANALOG_PIN__ORIGINAL_OBJECT);

		tracedParameterEClass = createEClass(TRACED_PARAMETER);
		createEReference(tracedParameterEClass, TRACED_PARAMETER__DEFINITION);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__VALUE);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedVariableEClass, TRACED_VARIABLE__VALUE_TRACE);

		tracedValueEClass = createEClass(TRACED_VALUE);

		tracedPinEClass = createEClass(TRACED_PIN);
		createEReference(tracedPinEClass, TRACED_PIN__LEVEL_TRACE);

		tracedNumberValueEClass = createEClass(TRACED_NUMBER_VALUE);
		createEReference(tracedNumberValueEClass, TRACED_NUMBER_VALUE__VALUE_TRACE);

		tracedStringValueEClass = createEClass(TRACED_STRING_VALUE);
		createEReference(tracedStringValueEClass, TRACED_STRING_VALUE__VALUE_TRACE);

		tracedInstructionEClass = createEClass(TRACED_INSTRUCTION);
		createEReference(tracedInstructionEClass, TRACED_INSTRUCTION__PREVIOUS);
		createEReference(tracedInstructionEClass, TRACED_INSTRUCTION__NEXT);

		tracedExpressionEClass = createEClass(TRACED_EXPRESSION);

		tracedBooleanValueEClass = createEClass(TRACED_BOOLEAN_VALUE);
		createEReference(tracedBooleanValueEClass, TRACED_BOOLEAN_VALUE__VALUE_TRACE);
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
		fr.obeo.dsl.arduino.ArduinoPackage theArduinoPackage_1 = (fr.obeo.dsl.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(fr.obeo.dsl.arduino.ArduinoPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedDigitalPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedAnalogPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedVariableEClass.getESuperTypes().add(this.getTracedExpression());
		tracedVariableEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedNumberValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedStringValueEClass.getESuperTypes().add(this.getTracedValue());
		tracedExpressionEClass.getESuperTypes().add(this.getTracedInstruction());
		tracedExpressionEClass.getESuperTypes().add(this.getTracedParameter());
		tracedBooleanValueEClass.getESuperTypes().add(this.getTracedValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedDigitalPinEClass, TracedDigitalPin.class, "TracedDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDigitalPin_OriginalObject(), theArduinoPackage_1.getDigitalPin(), null, "originalObject", null, 0, 1, TracedDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedAnalogPinEClass, TracedAnalogPin.class, "TracedAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAnalogPin_OriginalObject(), theArduinoPackage_1.getAnalogPin(), null, "originalObject", null, 0, 1, TracedAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedParameterEClass, TracedParameter.class, "TracedParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedParameter_Definition(), theArduinoPackage_1.getParameterDefinition(), null, "definition", null, 0, 1, TracedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedVariable_Value(), theArduinoPackage_1.getValue(), null, "value", null, 0, 1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_OriginalObject(), theArduinoPackage_1.getVariable(), null, "originalObject", null, 0, 1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedVariable_ValueTrace(), theValuesPackage.getVariable_value_Value(), theValuesPackage.getVariable_value_Value_Parent(), "valueTrace", null, 0, -1, TracedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedValueEClass, TracedValue.class, "TracedValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedPinEClass, TracedPin.class, "TracedPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPin_LevelTrace(), theValuesPackage.getPin_level_Value(), theValuesPackage.getPin_level_Value_Parent(), "levelTrace", null, 0, -1, TracedPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedNumberValueEClass, TracedNumberValue.class, "TracedNumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedNumberValue_ValueTrace(), theValuesPackage.getNumberValue_value_Value(), theValuesPackage.getNumberValue_value_Value_Parent(), "valueTrace", null, 0, -1, TracedNumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedStringValueEClass, TracedStringValue.class, "TracedStringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedStringValue_ValueTrace(), theValuesPackage.getStringValue_value_Value(), theValuesPackage.getStringValue_value_Value_Parent(), "valueTrace", null, 0, -1, TracedStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedInstructionEClass, TracedInstruction.class, "TracedInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInstruction_Previous(), this.getTracedInstruction(), null, "previous", null, 0, 1, TracedInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedInstruction_Next(), this.getTracedInstruction(), null, "next", null, 0, 1, TracedInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedExpressionEClass, TracedExpression.class, "TracedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedBooleanValueEClass, TracedBooleanValue.class, "TracedBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanValue_ValueTrace(), theValuesPackage.getBooleanValue_value_Value(), theValuesPackage.getBooleanValue_value_Value_Parent(), "valueTrace", null, 0, -1, TracedBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (getTracedVariable_Value(), 
		   source, 
		   new String[] {
		   });
	}

} //ArduinoPackageImpl

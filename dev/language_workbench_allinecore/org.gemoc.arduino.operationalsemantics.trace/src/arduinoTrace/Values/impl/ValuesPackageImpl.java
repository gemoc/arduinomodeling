/**
 */
package arduinoTrace.Values.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.Traced.TracedPackage;

import arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.Traced.impl.TracedPackageImpl;

import arduinoTrace.Values.BooleanValue_value_Value;
import arduinoTrace.Values.NumberValue_value_Value;
import arduinoTrace.Values.Pin_level_Value;
import arduinoTrace.Values.StringValue_value_Value;
import arduinoTrace.Values.ValuesFactory;
import arduinoTrace.Values.ValuesPackage;
import arduinoTrace.Values.Variable_value_Value;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import fr.obeo.dsl.arduino.ArduinoPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variable_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pin_level_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValue_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValue_value_ValueEClass = null;

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
	 * @see arduinoTrace.Values.ValuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuesPackageImpl() {
		super(eNS_URI, ValuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuesPackage init() {
		if (isInited) return (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Obtain or create and register package
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArduinoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) : TracedPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.Traced.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theValuesPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theTracedPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theValuesPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theTracedPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValuesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
		return theValuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable_value_Value() {
		return variable_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_value_Value_Value() {
		return (EReference)variable_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_value_Value_Parent() {
		return (EReference)variable_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_value_Value_States() {
		return (EReference)variable_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin_level_Value() {
		return pin_level_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_level_Value_Level() {
		return (EAttribute)pin_level_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_level_Value_Parent() {
		return (EReference)pin_level_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_level_Value_States() {
		return (EReference)pin_level_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue_value_Value() {
		return numberValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberValue_value_Value_Value() {
		return (EAttribute)numberValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberValue_value_Value_Parent() {
		return (EReference)numberValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberValue_value_Value_States() {
		return (EReference)numberValue_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue_value_Value() {
		return stringValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_value_Value_Value() {
		return (EAttribute)stringValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringValue_value_Value_Parent() {
		return (EReference)stringValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringValue_value_Value_States() {
		return (EReference)stringValue_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue_value_Value() {
		return booleanValue_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_value_Value_Value() {
		return (EAttribute)booleanValue_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_Value_Parent() {
		return (EReference)booleanValue_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanValue_value_Value_States() {
		return (EReference)booleanValue_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactory getValuesFactory() {
		return (ValuesFactory)getEFactoryInstance();
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
		variable_value_ValueEClass = createEClass(VARIABLE_VALUE_VALUE);
		createEReference(variable_value_ValueEClass, VARIABLE_VALUE_VALUE__VALUE);
		createEReference(variable_value_ValueEClass, VARIABLE_VALUE_VALUE__PARENT);
		createEReference(variable_value_ValueEClass, VARIABLE_VALUE_VALUE__STATES);

		pin_level_ValueEClass = createEClass(PIN_LEVEL_VALUE);
		createEAttribute(pin_level_ValueEClass, PIN_LEVEL_VALUE__LEVEL);
		createEReference(pin_level_ValueEClass, PIN_LEVEL_VALUE__PARENT);
		createEReference(pin_level_ValueEClass, PIN_LEVEL_VALUE__STATES);

		numberValue_value_ValueEClass = createEClass(NUMBER_VALUE_VALUE_VALUE);
		createEAttribute(numberValue_value_ValueEClass, NUMBER_VALUE_VALUE_VALUE__VALUE);
		createEReference(numberValue_value_ValueEClass, NUMBER_VALUE_VALUE_VALUE__PARENT);
		createEReference(numberValue_value_ValueEClass, NUMBER_VALUE_VALUE_VALUE__STATES);

		stringValue_value_ValueEClass = createEClass(STRING_VALUE_VALUE_VALUE);
		createEAttribute(stringValue_value_ValueEClass, STRING_VALUE_VALUE_VALUE__VALUE);
		createEReference(stringValue_value_ValueEClass, STRING_VALUE_VALUE_VALUE__PARENT);
		createEReference(stringValue_value_ValueEClass, STRING_VALUE_VALUE_VALUE__STATES);

		booleanValue_value_ValueEClass = createEClass(BOOLEAN_VALUE_VALUE_VALUE);
		createEAttribute(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__VALUE);
		createEReference(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__PARENT);
		createEReference(booleanValue_value_ValueEClass, BOOLEAN_VALUE_VALUE_VALUE__STATES);
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
		ArduinoTracePackage theArduinoTracePackage = (ArduinoTracePackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(variable_value_ValueEClass, Variable_value_Value.class, "Variable_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_value_Value_Value(), theArduinoPackage_1.getTracedValue(), null, "value", null, 0, 1, Variable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_value_Value_Parent(), theArduinoPackage_1.getTracedVariable(), theArduinoPackage_1.getTracedVariable_ValueTrace(), "parent", null, 1, 1, Variable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_value_Value_States(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_Variable_value_Values(), "states", null, 1, -1, Variable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pin_level_ValueEClass, Pin_level_Value.class, "Pin_level_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_level_Value_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_level_Value_Parent(), theArduinoPackage_1.getTracedPin(), theArduinoPackage_1.getTracedPin_LevelTrace(), "parent", null, 1, 1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_level_Value_States(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_Pin_level_Values(), "states", null, 1, -1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberValue_value_ValueEClass, NumberValue_value_Value.class, "NumberValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_value_Value_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NumberValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberValue_value_Value_Parent(), theArduinoPackage_1.getTracedNumberValue(), theArduinoPackage_1.getTracedNumberValue_ValueTrace(), "parent", null, 1, 1, NumberValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberValue_value_Value_States(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_NumberValue_value_Values(), "states", null, 1, -1, NumberValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValue_value_ValueEClass, StringValue_value_Value.class, "StringValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_value_Value_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringValue_value_Value_Parent(), theArduinoPackage_1.getTracedStringValue(), theArduinoPackage_1.getTracedStringValue_ValueTrace(), "parent", null, 1, 1, StringValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringValue_value_Value_States(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_StringValue_value_Values(), "states", null, 1, -1, StringValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValue_value_ValueEClass, BooleanValue_value_Value.class, "BooleanValue_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_value_Value_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanValue_value_Value_Parent(), theArduinoPackage_1.getTracedBooleanValue(), theArduinoPackage_1.getTracedBooleanValue_ValueTrace(), "parent", null, 1, 1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanValue_value_Value_States(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_BooleanValue_value_Values(), "states", null, 1, -1, BooleanValue_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (variable_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (pin_level_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (numberValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (stringValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (booleanValue_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
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
		  (getVariable_value_Value_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPin_level_Value_Level(), 
		   source, 
		   new String[] {
		   });
	}

} //ValuesPackageImpl

/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.BooleanVariable_value_Value;
import arduinoTrace.States.IntegerVariable_value_Value;
import arduinoTrace.States.Pin_level_Value;
import arduinoTrace.States.State;
import arduinoTrace.States.StatesFactory;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import fr.obeo.dsl.arduino.ArduinoPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariable_value_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariable_value_ValueEClass = null;

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
	private EClass stateEClass = null;

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
	 * @see arduinoTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArduinoPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.States.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable_value_Value() {
		return booleanVariable_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariable_value_Value_Parent() {
		return (EReference)booleanVariable_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariable_value_Value_States() {
		return (EReference)booleanVariable_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_value_Value_Value() {
		return (EAttribute)booleanVariable_value_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable_value_Value() {
		return integerVariable_value_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariable_value_Value_Parent() {
		return (EReference)integerVariable_value_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariable_value_Value_States() {
		return (EReference)integerVariable_value_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_value_Value_Value() {
		return (EAttribute)integerVariable_value_ValueEClass.getEStructuralFeatures().get(2);
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
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BooleanVariable_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IntegerVariable_value_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Pin_level_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		booleanVariable_value_ValueEClass = createEClass(BOOLEAN_VARIABLE_VALUE_VALUE);
		createEReference(booleanVariable_value_ValueEClass, BOOLEAN_VARIABLE_VALUE_VALUE__PARENT);
		createEReference(booleanVariable_value_ValueEClass, BOOLEAN_VARIABLE_VALUE_VALUE__STATES);
		createEAttribute(booleanVariable_value_ValueEClass, BOOLEAN_VARIABLE_VALUE_VALUE__VALUE);

		integerVariable_value_ValueEClass = createEClass(INTEGER_VARIABLE_VALUE_VALUE);
		createEReference(integerVariable_value_ValueEClass, INTEGER_VARIABLE_VALUE_VALUE__PARENT);
		createEReference(integerVariable_value_ValueEClass, INTEGER_VARIABLE_VALUE_VALUE__STATES);
		createEAttribute(integerVariable_value_ValueEClass, INTEGER_VARIABLE_VALUE_VALUE__VALUE);

		pin_level_ValueEClass = createEClass(PIN_LEVEL_VALUE);
		createEAttribute(pin_level_ValueEClass, PIN_LEVEL_VALUE__LEVEL);
		createEReference(pin_level_ValueEClass, PIN_LEVEL_VALUE__PARENT);
		createEReference(pin_level_ValueEClass, PIN_LEVEL_VALUE__STATES);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__BOOLEAN_VARIABLE_VALUE_VALUES);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__INTEGER_VARIABLE_VALUE_VALUES);
		createEReference(stateEClass, STATE__PIN_LEVEL_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);
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
		arduinoTrace.States.arduino.ArduinoPackage theArduinoPackage_1 = (arduinoTrace.States.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theArduinoPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(booleanVariable_value_ValueEClass, BooleanVariable_value_Value.class, "BooleanVariable_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariable_value_Value_Parent(), theArduinoPackage_1.getTracedBooleanVariable(), theArduinoPackage_1.getTracedBooleanVariable_ValueSequence(), "parent", null, 1, 1, BooleanVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanVariable_value_Value_States(), this.getState(), this.getState_BooleanVariable_value_Values(), "states", null, 1, -1, BooleanVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanVariable_value_Value_Value(), ecorePackage.getEBooleanObject(), "value", "false", 0, 1, BooleanVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariable_value_ValueEClass, IntegerVariable_value_Value.class, "IntegerVariable_value_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariable_value_Value_Parent(), theArduinoPackage_1.getTracedIntegerVariable(), theArduinoPackage_1.getTracedIntegerVariable_ValueSequence(), "parent", null, 1, 1, IntegerVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerVariable_value_Value_States(), this.getState(), this.getState_IntegerVariable_value_Values(), "states", null, 1, -1, IntegerVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerVariable_value_Value_Value(), ecorePackage.getEIntegerObject(), "value", "0", 0, 1, IntegerVariable_value_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pin_level_ValueEClass, Pin_level_Value.class, "Pin_level_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_level_Value_Level(), ecorePackage.getEIntegerObject(), "level", null, 0, 1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_level_Value_Parent(), theArduinoPackage_1.getTracedPin(), theArduinoPackage_1.getTracedPin_LevelSequence(), "parent", null, 1, 1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_level_Value_States(), this.getState(), this.getState_Pin_level_Values(), "states", null, 1, -1, Pin_level_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_BooleanVariable_value_Values(), this.getBooleanVariable_value_Value(), this.getBooleanVariable_value_Value_States(), "booleanVariable_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_EndedSteps(), theStepsPackage.getStep(), theStepsPackage.getStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_IntegerVariable_value_Values(), this.getIntegerVariable_value_Value(), this.getIntegerVariable_value_Value_States(), "integerVariable_value_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Pin_level_Values(), this.getPin_level_Value(), this.getPin_level_Value_States(), "pin_level_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getStep(), theStepsPackage.getStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// dynamic
		createDynamicAnnotations();
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
		  (booleanVariable_value_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (integerVariable_value_ValueEClass, 
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
	}

	/**
	 * Initializes the annotations for <b>dynamic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDynamicAnnotations() {
		String source = "dynamic";	
		addAnnotation
		  (getBooleanVariable_value_Value_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntegerVariable_value_Value_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPin_level_Value_Level(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl

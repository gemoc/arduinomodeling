/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate;
import arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_If_Execute_FillStep;
import arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate;
import arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Call;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Call_AbstractSubStep;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Call_FillStep;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute_FillStep;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.Arduino_While_Execute;
import arduinoTrace.Steps.Arduino_While_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_While_Execute_FillStep;
import arduinoTrace.Steps.BigStep;
import arduinoTrace.Steps.RootFillStep;
import arduinoTrace.Steps.SmallStep;
import arduinoTrace.Steps.Step;
import arduinoTrace.Steps.StepsFactory;
import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootFillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_BooleanModuleGet_EvaluateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_IntegerConstant_EvaluateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_BooleanConstant_EvaluateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_IntegerModuleGet_EvaluateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_While_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_While_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_While_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Utilities_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableAssignment_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Delay_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableDeclaration_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Repeat_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableAssignment_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableAssignment_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Repeat_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Repeat_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_CallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_Call_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_ModuleAssignment_Call_FillStepEClass = null;

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
	 * @see arduinoTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArduinoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.States.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.States.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theArduinoPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallStep() {
		return smallStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigStep() {
		return bigStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_StartingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_EndingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootFillStep() {
		return rootFillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_BooleanModuleGet_Evaluate() {
		return arduino_BooleanModuleGet_EvaluateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_BooleanModuleGet_Evaluate_This() {
		return (EReference)arduino_BooleanModuleGet_EvaluateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Execute() {
		return arduino_ModuleAssignment_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_ModuleAssignment_Execute_This() {
		return (EReference)arduino_ModuleAssignment_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_ModuleAssignment_Execute_SubSteps() {
		return (EReference)arduino_ModuleAssignment_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Execute_AbstractSubStep() {
		return arduino_ModuleAssignment_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Execute_FillStep() {
		return arduino_ModuleAssignment_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_IntegerConstant_Evaluate() {
		return arduino_IntegerConstant_EvaluateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_IntegerConstant_Evaluate_This() {
		return (EReference)arduino_IntegerConstant_EvaluateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_BooleanConstant_Evaluate() {
		return arduino_BooleanConstant_EvaluateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_BooleanConstant_Evaluate_This() {
		return (EReference)arduino_BooleanConstant_EvaluateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_IntegerModuleGet_Evaluate() {
		return arduino_IntegerModuleGet_EvaluateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_IntegerModuleGet_Evaluate_This() {
		return (EReference)arduino_IntegerModuleGet_EvaluateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_While_Execute() {
		return arduino_While_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_While_Execute_This() {
		return (EReference)arduino_While_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_While_Execute_SubSteps() {
		return (EReference)arduino_While_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_While_Execute_AbstractSubStep() {
		return arduino_While_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_While_Execute_FillStep() {
		return arduino_While_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Utilities_Execute() {
		return arduino_Utilities_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Utilities_Execute_This() {
		return (EReference)arduino_Utilities_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableAssignment_Execute() {
		return arduino_VariableAssignment_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_VariableAssignment_Execute_This() {
		return (EReference)arduino_VariableAssignment_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_VariableAssignment_Execute_SubSteps() {
		return (EReference)arduino_VariableAssignment_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_If_Execute() {
		return arduino_If_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_If_Execute_This() {
		return (EReference)arduino_If_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_If_Execute_SubSteps() {
		return (EReference)arduino_If_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Delay_Execute() {
		return arduino_Delay_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Delay_Execute_This() {
		return (EReference)arduino_Delay_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableDeclaration_Execute() {
		return arduino_VariableDeclaration_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_VariableDeclaration_Execute_This() {
		return (EReference)arduino_VariableDeclaration_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Repeat_Execute() {
		return arduino_Repeat_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Repeat_Execute_This() {
		return (EReference)arduino_Repeat_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Repeat_Execute_SubSteps() {
		return (EReference)arduino_Repeat_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_If_Execute_AbstractSubStep() {
		return arduino_If_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_If_Execute_FillStep() {
		return arduino_If_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableAssignment_Execute_AbstractSubStep() {
		return arduino_VariableAssignment_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableAssignment_Execute_FillStep() {
		return arduino_VariableAssignment_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Repeat_Execute_AbstractSubStep() {
		return arduino_Repeat_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Repeat_Execute_FillStep() {
		return arduino_Repeat_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Call() {
		return arduino_ModuleAssignment_CallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_ModuleAssignment_Call_This() {
		return (EReference)arduino_ModuleAssignment_CallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_ModuleAssignment_Call_SubSteps() {
		return (EReference)arduino_ModuleAssignment_CallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Call_AbstractSubStep() {
		return arduino_ModuleAssignment_Call_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_ModuleAssignment_Call_FillStep() {
		return arduino_ModuleAssignment_Call_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
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
		smallStepEClass = createEClass(SMALL_STEP);

		bigStepEClass = createEClass(BIG_STEP);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__STARTING_STATE);
		createEReference(stepEClass, STEP__ENDING_STATE);

		rootFillStepEClass = createEClass(ROOT_FILL_STEP);

		arduino_BooleanModuleGet_EvaluateEClass = createEClass(ARDUINO_BOOLEAN_MODULE_GET_EVALUATE);
		createEReference(arduino_BooleanModuleGet_EvaluateEClass, ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS);

		arduino_ModuleAssignment_ExecuteEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE);
		createEReference(arduino_ModuleAssignment_ExecuteEClass, ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS);
		createEReference(arduino_ModuleAssignment_ExecuteEClass, ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS);

		arduino_ModuleAssignment_Execute_AbstractSubStepEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_ModuleAssignment_Execute_FillStepEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP);

		arduino_IntegerConstant_EvaluateEClass = createEClass(ARDUINO_INTEGER_CONSTANT_EVALUATE);
		createEReference(arduino_IntegerConstant_EvaluateEClass, ARDUINO_INTEGER_CONSTANT_EVALUATE__THIS);

		arduino_BooleanConstant_EvaluateEClass = createEClass(ARDUINO_BOOLEAN_CONSTANT_EVALUATE);
		createEReference(arduino_BooleanConstant_EvaluateEClass, ARDUINO_BOOLEAN_CONSTANT_EVALUATE__THIS);

		arduino_IntegerModuleGet_EvaluateEClass = createEClass(ARDUINO_INTEGER_MODULE_GET_EVALUATE);
		createEReference(arduino_IntegerModuleGet_EvaluateEClass, ARDUINO_INTEGER_MODULE_GET_EVALUATE__THIS);

		arduino_While_ExecuteEClass = createEClass(ARDUINO_WHILE_EXECUTE);
		createEReference(arduino_While_ExecuteEClass, ARDUINO_WHILE_EXECUTE__THIS);
		createEReference(arduino_While_ExecuteEClass, ARDUINO_WHILE_EXECUTE__SUB_STEPS);

		arduino_While_Execute_AbstractSubStepEClass = createEClass(ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_While_Execute_FillStepEClass = createEClass(ARDUINO_WHILE_EXECUTE_FILL_STEP);

		arduino_Utilities_ExecuteEClass = createEClass(ARDUINO_UTILITIES_EXECUTE);
		createEReference(arduino_Utilities_ExecuteEClass, ARDUINO_UTILITIES_EXECUTE__THIS);

		arduino_VariableAssignment_ExecuteEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE);
		createEReference(arduino_VariableAssignment_ExecuteEClass, ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS);
		createEReference(arduino_VariableAssignment_ExecuteEClass, ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS);

		arduino_If_ExecuteEClass = createEClass(ARDUINO_IF_EXECUTE);
		createEReference(arduino_If_ExecuteEClass, ARDUINO_IF_EXECUTE__THIS);
		createEReference(arduino_If_ExecuteEClass, ARDUINO_IF_EXECUTE__SUB_STEPS);

		arduino_Delay_ExecuteEClass = createEClass(ARDUINO_DELAY_EXECUTE);
		createEReference(arduino_Delay_ExecuteEClass, ARDUINO_DELAY_EXECUTE__THIS);

		arduino_VariableDeclaration_ExecuteEClass = createEClass(ARDUINO_VARIABLE_DECLARATION_EXECUTE);
		createEReference(arduino_VariableDeclaration_ExecuteEClass, ARDUINO_VARIABLE_DECLARATION_EXECUTE__THIS);

		arduino_Repeat_ExecuteEClass = createEClass(ARDUINO_REPEAT_EXECUTE);
		createEReference(arduino_Repeat_ExecuteEClass, ARDUINO_REPEAT_EXECUTE__THIS);
		createEReference(arduino_Repeat_ExecuteEClass, ARDUINO_REPEAT_EXECUTE__SUB_STEPS);

		arduino_If_Execute_AbstractSubStepEClass = createEClass(ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_If_Execute_FillStepEClass = createEClass(ARDUINO_IF_EXECUTE_FILL_STEP);

		arduino_VariableAssignment_Execute_AbstractSubStepEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_VariableAssignment_Execute_FillStepEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP);

		arduino_Repeat_Execute_AbstractSubStepEClass = createEClass(ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Repeat_Execute_FillStepEClass = createEClass(ARDUINO_REPEAT_EXECUTE_FILL_STEP);

		arduino_ModuleAssignment_CallEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_CALL);
		createEReference(arduino_ModuleAssignment_CallEClass, ARDUINO_MODULE_ASSIGNMENT_CALL__THIS);
		createEReference(arduino_ModuleAssignment_CallEClass, ARDUINO_MODULE_ASSIGNMENT_CALL__SUB_STEPS);

		arduino_ModuleAssignment_Call_AbstractSubStepEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP);

		arduino_ModuleAssignment_Call_FillStepEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP);
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
		ArduinoPackage theArduinoPackage = (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smallStepEClass.getESuperTypes().add(this.getStep());
		bigStepEClass.getESuperTypes().add(this.getStep());
		rootFillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_BooleanModuleGet_EvaluateEClass.getESuperTypes().add(this.getSmallStep());
		arduino_BooleanModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_BooleanModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_BooleanModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_BooleanModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Call_AbstractSubStep());
		arduino_ModuleAssignment_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_IntegerConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_IntegerConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_IntegerConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_IntegerConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_IntegerConstant_EvaluateEClass.getESuperTypes().add(this.getSmallStep());
		arduino_BooleanConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_BooleanConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_BooleanConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_BooleanConstant_EvaluateEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_BooleanConstant_EvaluateEClass.getESuperTypes().add(this.getSmallStep());
		arduino_IntegerModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_IntegerModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_IntegerModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_IntegerModuleGet_EvaluateEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_IntegerModuleGet_EvaluateEClass.getESuperTypes().add(this.getSmallStep());
		arduino_While_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_While_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_While_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_While_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_While_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_Utilities_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_Utilities_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Utilities_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_Utilities_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_Repeat_ExecuteEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_Repeat_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_Repeat_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Repeat_ExecuteEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_If_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_VariableAssignment_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_Repeat_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_ModuleAssignment_CallEClass.getESuperTypes().add(this.getBigStep());
		arduino_ModuleAssignment_Call_FillStepEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Call_AbstractSubStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootFillStepEClass, RootFillStep.class, "RootFillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_BooleanModuleGet_EvaluateEClass, Arduino_BooleanModuleGet_Evaluate.class, "Arduino_BooleanModuleGet_Evaluate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_BooleanModuleGet_Evaluate_This(), theArduinoPackage.getBooleanModuleGet(), null, "this", null, 0, 1, Arduino_BooleanModuleGet_Evaluate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_ModuleAssignment_ExecuteEClass, Arduino_ModuleAssignment_Execute.class, "Arduino_ModuleAssignment_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_ModuleAssignment_Execute_This(), theArduinoPackage.getModuleAssignment(), null, "this", null, 0, 1, Arduino_ModuleAssignment_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_ModuleAssignment_Execute_SubSteps(), this.getArduino_ModuleAssignment_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_ModuleAssignment_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_ModuleAssignment_Execute_AbstractSubStepEClass, Arduino_ModuleAssignment_Execute_AbstractSubStep.class, "Arduino_ModuleAssignment_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_ModuleAssignment_Execute_FillStepEClass, Arduino_ModuleAssignment_Execute_FillStep.class, "Arduino_ModuleAssignment_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_IntegerConstant_EvaluateEClass, Arduino_IntegerConstant_Evaluate.class, "Arduino_IntegerConstant_Evaluate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_IntegerConstant_Evaluate_This(), theArduinoPackage.getIntegerConstant(), null, "this", null, 0, 1, Arduino_IntegerConstant_Evaluate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_BooleanConstant_EvaluateEClass, Arduino_BooleanConstant_Evaluate.class, "Arduino_BooleanConstant_Evaluate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_BooleanConstant_Evaluate_This(), theArduinoPackage.getBooleanConstant(), null, "this", null, 0, 1, Arduino_BooleanConstant_Evaluate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_IntegerModuleGet_EvaluateEClass, Arduino_IntegerModuleGet_Evaluate.class, "Arduino_IntegerModuleGet_Evaluate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_IntegerModuleGet_Evaluate_This(), theArduinoPackage.getIntegerModuleGet(), null, "this", null, 0, 1, Arduino_IntegerModuleGet_Evaluate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_While_ExecuteEClass, Arduino_While_Execute.class, "Arduino_While_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_While_Execute_This(), theArduinoPackage.getWhile(), null, "this", null, 0, 1, Arduino_While_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_While_Execute_SubSteps(), this.getArduino_While_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_While_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_While_Execute_AbstractSubStepEClass, Arduino_While_Execute_AbstractSubStep.class, "Arduino_While_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_While_Execute_FillStepEClass, Arduino_While_Execute_FillStep.class, "Arduino_While_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Utilities_ExecuteEClass, Arduino_Utilities_Execute.class, "Arduino_Utilities_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Utilities_Execute_This(), theArduinoPackage.getUtilities(), null, "this", null, 0, 1, Arduino_Utilities_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_VariableAssignment_ExecuteEClass, Arduino_VariableAssignment_Execute.class, "Arduino_VariableAssignment_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_VariableAssignment_Execute_This(), theArduinoPackage.getVariableAssignment(), null, "this", null, 0, 1, Arduino_VariableAssignment_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_VariableAssignment_Execute_SubSteps(), this.getArduino_VariableAssignment_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_VariableAssignment_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_If_ExecuteEClass, Arduino_If_Execute.class, "Arduino_If_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_If_Execute_This(), theArduinoPackage.getIf(), null, "this", null, 0, 1, Arduino_If_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_If_Execute_SubSteps(), this.getArduino_If_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_If_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Delay_ExecuteEClass, Arduino_Delay_Execute.class, "Arduino_Delay_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Delay_Execute_This(), theArduinoPackage.getDelay(), null, "this", null, 0, 1, Arduino_Delay_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_VariableDeclaration_ExecuteEClass, Arduino_VariableDeclaration_Execute.class, "Arduino_VariableDeclaration_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_VariableDeclaration_Execute_This(), theArduinoPackage.getVariableDeclaration(), null, "this", null, 0, 1, Arduino_VariableDeclaration_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Repeat_ExecuteEClass, Arduino_Repeat_Execute.class, "Arduino_Repeat_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Repeat_Execute_This(), theArduinoPackage.getRepeat(), null, "this", null, 0, 1, Arduino_Repeat_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Repeat_Execute_SubSteps(), this.getArduino_Repeat_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Repeat_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_If_Execute_AbstractSubStepEClass, Arduino_If_Execute_AbstractSubStep.class, "Arduino_If_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_If_Execute_FillStepEClass, Arduino_If_Execute_FillStep.class, "Arduino_If_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_VariableAssignment_Execute_AbstractSubStepEClass, Arduino_VariableAssignment_Execute_AbstractSubStep.class, "Arduino_VariableAssignment_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_VariableAssignment_Execute_FillStepEClass, Arduino_VariableAssignment_Execute_FillStep.class, "Arduino_VariableAssignment_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Repeat_Execute_AbstractSubStepEClass, Arduino_Repeat_Execute_AbstractSubStep.class, "Arduino_Repeat_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Repeat_Execute_FillStepEClass, Arduino_Repeat_Execute_FillStep.class, "Arduino_Repeat_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_ModuleAssignment_CallEClass, Arduino_ModuleAssignment_Call.class, "Arduino_ModuleAssignment_Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_ModuleAssignment_Call_This(), theArduinoPackage.getModuleAssignment(), null, "this", null, 0, 1, Arduino_ModuleAssignment_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_ModuleAssignment_Call_SubSteps(), this.getArduino_ModuleAssignment_Call_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_ModuleAssignment_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_ModuleAssignment_Call_AbstractSubStepEClass, Arduino_ModuleAssignment_Call_AbstractSubStep.class, "Arduino_ModuleAssignment_Call_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_ModuleAssignment_Call_FillStepEClass, Arduino_ModuleAssignment_Call_FillStep.class, "Arduino_ModuleAssignment_Call_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl

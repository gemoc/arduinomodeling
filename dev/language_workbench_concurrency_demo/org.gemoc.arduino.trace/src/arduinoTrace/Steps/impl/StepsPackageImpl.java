/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_Delay_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Delay_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute_ImplicitStep;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_ImplicitStep;
import arduinoTrace.Steps.BigStep;
import arduinoTrace.Steps.RootImplicitStep;
import arduinoTrace.Steps.SmallStep;
import arduinoTrace.Steps.Step;
import arduinoTrace.Steps.StepsFactory;
import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import fr.obeo.dsl.arduino.ArduinoPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
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
	private EClass arduino_Delay_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Delay_Execute_ImplicitStepEClass = null;

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
	private EClass arduino_If_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_If_Execute_ImplicitStepEClass = null;

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
	private EClass arduino_ModuleAssignment_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Project_SetupEClass = null;

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
	private EClass arduino_VariableAssignment_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableAssignment_Execute_ImplicitStepEClass = null;

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
	private EClass arduino_VariableDeclaration_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_VariableDeclaration_Execute_ImplicitStepEClass = null;

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
	private EClass rootImplicitStepEClass = null;

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
	private EClass stepEClass = null;

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
		MsePackage.eINSTANCE.eClass();

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
	public EClass getArduino_Delay_Execute() {
		return arduino_Delay_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Delay_Execute_SubSteps() {
		return (EReference)arduino_Delay_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArduino_Delay_Execute__GetCaller() {
		return arduino_Delay_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Delay_Execute_AbstractSubStep() {
		return arduino_Delay_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Delay_Execute_ImplicitStep() {
		return arduino_Delay_Execute_ImplicitStepEClass;
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
	public EReference getArduino_If_Execute_SubSteps() {
		return (EReference)arduino_If_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArduino_If_Execute__GetCaller() {
		return arduino_If_ExecuteEClass.getEOperations().get(0);
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
	public EClass getArduino_If_Execute_ImplicitStep() {
		return arduino_If_Execute_ImplicitStepEClass;
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
	public EReference getArduino_ModuleAssignment_Execute_SubSteps() {
		return (EReference)arduino_ModuleAssignment_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArduino_ModuleAssignment_Execute__GetCaller() {
		return arduino_ModuleAssignment_ExecuteEClass.getEOperations().get(0);
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
	public EClass getArduino_ModuleAssignment_Execute_ImplicitStep() {
		return arduino_ModuleAssignment_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Project_Setup() {
		return arduino_Project_SetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArduino_Project_Setup__GetCaller() {
		return arduino_Project_SetupEClass.getEOperations().get(0);
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
	public EReference getArduino_VariableAssignment_Execute_SubSteps() {
		return (EReference)arduino_VariableAssignment_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArduino_VariableAssignment_Execute__GetCaller() {
		return arduino_VariableAssignment_ExecuteEClass.getEOperations().get(0);
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
	public EClass getArduino_VariableAssignment_Execute_ImplicitStep() {
		return arduino_VariableAssignment_Execute_ImplicitStepEClass;
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
	public EReference getArduino_VariableDeclaration_Execute_SubSteps() {
		return (EReference)arduino_VariableDeclaration_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArduino_VariableDeclaration_Execute__GetCaller() {
		return arduino_VariableDeclaration_ExecuteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableDeclaration_Execute_AbstractSubStep() {
		return arduino_VariableDeclaration_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_VariableDeclaration_Execute_ImplicitStep() {
		return arduino_VariableDeclaration_Execute_ImplicitStepEClass;
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
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
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
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_EndingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_StartingState() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
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
		arduino_Delay_ExecuteEClass = createEClass(ARDUINO_DELAY_EXECUTE);
		createEReference(arduino_Delay_ExecuteEClass, ARDUINO_DELAY_EXECUTE__SUB_STEPS);
		createEOperation(arduino_Delay_ExecuteEClass, ARDUINO_DELAY_EXECUTE___GET_CALLER);

		arduino_Delay_Execute_AbstractSubStepEClass = createEClass(ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Delay_Execute_ImplicitStepEClass = createEClass(ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP);

		arduino_If_ExecuteEClass = createEClass(ARDUINO_IF_EXECUTE);
		createEReference(arduino_If_ExecuteEClass, ARDUINO_IF_EXECUTE__SUB_STEPS);
		createEOperation(arduino_If_ExecuteEClass, ARDUINO_IF_EXECUTE___GET_CALLER);

		arduino_If_Execute_AbstractSubStepEClass = createEClass(ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_If_Execute_ImplicitStepEClass = createEClass(ARDUINO_IF_EXECUTE_IMPLICIT_STEP);

		arduino_ModuleAssignment_ExecuteEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE);
		createEReference(arduino_ModuleAssignment_ExecuteEClass, ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS);
		createEOperation(arduino_ModuleAssignment_ExecuteEClass, ARDUINO_MODULE_ASSIGNMENT_EXECUTE___GET_CALLER);

		arduino_ModuleAssignment_Execute_AbstractSubStepEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_ModuleAssignment_Execute_ImplicitStepEClass = createEClass(ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP);

		arduino_Project_SetupEClass = createEClass(ARDUINO_PROJECT_SETUP);
		createEOperation(arduino_Project_SetupEClass, ARDUINO_PROJECT_SETUP___GET_CALLER);

		arduino_VariableAssignment_ExecuteEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE);
		createEReference(arduino_VariableAssignment_ExecuteEClass, ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS);
		createEOperation(arduino_VariableAssignment_ExecuteEClass, ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE___GET_CALLER);

		arduino_VariableAssignment_Execute_AbstractSubStepEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_VariableAssignment_Execute_ImplicitStepEClass = createEClass(ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP);

		arduino_VariableDeclaration_ExecuteEClass = createEClass(ARDUINO_VARIABLE_DECLARATION_EXECUTE);
		createEReference(arduino_VariableDeclaration_ExecuteEClass, ARDUINO_VARIABLE_DECLARATION_EXECUTE__SUB_STEPS);
		createEOperation(arduino_VariableDeclaration_ExecuteEClass, ARDUINO_VARIABLE_DECLARATION_EXECUTE___GET_CALLER);

		arduino_VariableDeclaration_Execute_AbstractSubStepEClass = createEClass(ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_VariableDeclaration_Execute_ImplicitStepEClass = createEClass(ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP);

		bigStepEClass = createEClass(BIG_STEP);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		smallStepEClass = createEClass(SMALL_STEP);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ENDING_STATE);
		createEReference(stepEClass, STEP__STARTING_STATE);
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
		ArduinoPackage theArduinoPackage = (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);
		MsePackage theMsePackage = (MsePackage)EPackage.Registry.INSTANCE.getEPackage(MsePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_Delay_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableDeclaration_Execute_AbstractSubStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Delay_Execute_ImplicitStepEClass.getESuperTypes().add(this.getArduino_Delay_Execute_AbstractSubStep());
		arduino_Delay_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_Delay_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableDeclaration_Execute_AbstractSubStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_If_Execute_ImplicitStepEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_If_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_Delay_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableDeclaration_Execute_AbstractSubStep());
		arduino_ModuleAssignment_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_ModuleAssignment_Execute_ImplicitStepEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_ModuleAssignment_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Project_SetupEClass.getESuperTypes().add(this.getSmallStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_Delay_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableDeclaration_Execute_AbstractSubStep());
		arduino_VariableAssignment_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_VariableAssignment_Execute_ImplicitStepEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_VariableAssignment_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_Delay_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_ModuleAssignment_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableAssignment_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getArduino_VariableDeclaration_Execute_AbstractSubStep());
		arduino_VariableDeclaration_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_VariableDeclaration_Execute_ImplicitStepEClass.getESuperTypes().add(this.getArduino_VariableDeclaration_Execute_AbstractSubStep());
		arduino_VariableDeclaration_Execute_ImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		bigStepEClass.getESuperTypes().add(this.getStep());
		rootImplicitStepEClass.getESuperTypes().add(this.getSmallStep());
		smallStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(theMsePackage.getMSEOccurrence());

		// Initialize classes, features, and operations; add parameters
		initEClass(arduino_Delay_ExecuteEClass, Arduino_Delay_Execute.class, "Arduino_Delay_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Delay_Execute_SubSteps(), this.getArduino_Delay_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Delay_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArduino_Delay_Execute__GetCaller(), theArduinoPackage.getDelay(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_Delay_Execute_AbstractSubStepEClass, Arduino_Delay_Execute_AbstractSubStep.class, "Arduino_Delay_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Delay_Execute_ImplicitStepEClass, Arduino_Delay_Execute_ImplicitStep.class, "Arduino_Delay_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_If_ExecuteEClass, Arduino_If_Execute.class, "Arduino_If_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_If_Execute_SubSteps(), this.getArduino_If_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_If_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArduino_If_Execute__GetCaller(), theArduinoPackage.getIf(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_If_Execute_AbstractSubStepEClass, Arduino_If_Execute_AbstractSubStep.class, "Arduino_If_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_If_Execute_ImplicitStepEClass, Arduino_If_Execute_ImplicitStep.class, "Arduino_If_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_ModuleAssignment_ExecuteEClass, Arduino_ModuleAssignment_Execute.class, "Arduino_ModuleAssignment_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_ModuleAssignment_Execute_SubSteps(), this.getArduino_ModuleAssignment_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_ModuleAssignment_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArduino_ModuleAssignment_Execute__GetCaller(), theArduinoPackage.getModuleAssignment(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_ModuleAssignment_Execute_AbstractSubStepEClass, Arduino_ModuleAssignment_Execute_AbstractSubStep.class, "Arduino_ModuleAssignment_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_ModuleAssignment_Execute_ImplicitStepEClass, Arduino_ModuleAssignment_Execute_ImplicitStep.class, "Arduino_ModuleAssignment_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Project_SetupEClass, Arduino_Project_Setup.class, "Arduino_Project_Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getArduino_Project_Setup__GetCaller(), theArduinoPackage.getProject(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_VariableAssignment_ExecuteEClass, Arduino_VariableAssignment_Execute.class, "Arduino_VariableAssignment_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_VariableAssignment_Execute_SubSteps(), this.getArduino_VariableAssignment_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_VariableAssignment_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArduino_VariableAssignment_Execute__GetCaller(), theArduinoPackage.getVariableAssignment(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_VariableAssignment_Execute_AbstractSubStepEClass, Arduino_VariableAssignment_Execute_AbstractSubStep.class, "Arduino_VariableAssignment_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_VariableAssignment_Execute_ImplicitStepEClass, Arduino_VariableAssignment_Execute_ImplicitStep.class, "Arduino_VariableAssignment_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_VariableDeclaration_ExecuteEClass, Arduino_VariableDeclaration_Execute.class, "Arduino_VariableDeclaration_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_VariableDeclaration_Execute_SubSteps(), this.getArduino_VariableDeclaration_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_VariableDeclaration_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArduino_VariableDeclaration_Execute__GetCaller(), theArduinoPackage.getVariableDeclaration(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduino_VariableDeclaration_Execute_AbstractSubStepEClass, Arduino_VariableDeclaration_Execute_AbstractSubStep.class, "Arduino_VariableDeclaration_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_VariableDeclaration_Execute_ImplicitStepEClass, Arduino_VariableDeclaration_Execute_ImplicitStep.class, "Arduino_VariableDeclaration_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl

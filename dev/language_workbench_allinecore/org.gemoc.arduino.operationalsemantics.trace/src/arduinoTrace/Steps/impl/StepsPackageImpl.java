/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_If_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Level_Execute;
import arduinoTrace.Steps.Arduino_Level_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Level_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Project_Setup_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Project_Setup_FillStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Set_Execute;
import arduinoTrace.Steps.Arduino_Set_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Set_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Status_Call;
import arduinoTrace.Steps.Arduino_Status_Call_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Status_Call_FillStep;
import arduinoTrace.Steps.Arduino_Status_Execute;
import arduinoTrace.Steps.Arduino_Status_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Status_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Utilities_Call;
import arduinoTrace.Steps.Arduino_Utilities_Call_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Utilities_Call_FillStep;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_While_Execute;
import arduinoTrace.Steps.Arduino_While_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_While_Execute_FillStep;
import arduinoTrace.Steps.BigStep;
import arduinoTrace.Steps.FillStep;
import arduinoTrace.Steps.SmallStep;
import arduinoTrace.Steps.Steps;
import arduinoTrace.Steps.StepsFactory;
import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Traced.TracedPackage;

import arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl;

import arduinoTrace.Traced.impl.TracedPackageImpl;

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
	private EClass stepsEClass = null;

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
	private EClass arduino_Status_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Status_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Project_Setup_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Project_Setup_FillStepEClass = null;

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
	private EClass arduino_Level_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Level_Execute_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Set_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Set_Execute_FillStepEClass = null;

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
	private EClass arduino_Utilities_Call_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Utilities_Call_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_FunctionCall_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_FunctionCall_Execute_FillStepEClass = null;

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
	private EClass arduino_Status_Call_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Status_Call_FillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Status_ExecuteEClass = null;

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
	private EClass arduino_Repeat_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Level_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Set_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Utilities_CallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_FunctionCall_ExecuteEClass = null;

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
	private EClass arduino_While_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduino_Status_CallEClass = null;

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
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		TracedPackageImpl theTracedPackage = (TracedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) instanceof TracedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracedPackage.eNS_URI) : TracedPackage.eINSTANCE);
		ArduinoPackageImpl theArduinoPackage_1 = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(arduinoTrace.Traced.arduino.ArduinoPackage.eNS_URI) : arduinoTrace.Traced.arduino.ArduinoPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theTracedPackage.createPackageContents();
		theArduinoPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theTracedPackage.initializePackageContents();
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
	public EReference getSmallStep_PrecedingState() {
		return (EReference)smallStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSteps() {
		return stepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Status_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Project_Setup_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Repeat_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Level_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Set_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Delay_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Utilities_Call_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_FunctionCall_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Utilities_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_If_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_While_Execute_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Status_Call_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_FillStep_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Status_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Project_Setup_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Repeat_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Level_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Set_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Utilities_Call_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_FunctionCall_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_If_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_While_Execute_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSteps_Arduino_Status_Call_Trace() {
		return (EReference)stepsEClass.getEStructuralFeatures().get(22);
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
	public EReference getBigStep_StartingState() {
		return (EReference)bigStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBigStep_EndingState() {
		return (EReference)bigStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Status_Execute_AbstractSubStep() {
		return arduino_Status_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Status_Execute_FillStep() {
		return arduino_Status_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Project_Setup_AbstractSubStep() {
		return arduino_Project_Setup_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Project_Setup_FillStep() {
		return arduino_Project_Setup_FillStepEClass;
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
	public EClass getArduino_Level_Execute_AbstractSubStep() {
		return arduino_Level_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Level_Execute_FillStep() {
		return arduino_Level_Execute_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Set_Execute_AbstractSubStep() {
		return arduino_Set_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Set_Execute_FillStep() {
		return arduino_Set_Execute_FillStepEClass;
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
	public EClass getArduino_Utilities_Call_AbstractSubStep() {
		return arduino_Utilities_Call_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Utilities_Call_FillStep() {
		return arduino_Utilities_Call_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_FunctionCall_Execute_AbstractSubStep() {
		return arduino_FunctionCall_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_FunctionCall_Execute_FillStep() {
		return arduino_FunctionCall_Execute_FillStepEClass;
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
	public EClass getArduino_Status_Call_AbstractSubStep() {
		return arduino_Status_Call_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Status_Call_FillStep() {
		return arduino_Status_Call_FillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFillStep() {
		return fillStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Status_Execute() {
		return arduino_Status_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Status_Execute_This() {
		return (EReference)arduino_Status_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Status_Execute_SubSteps() {
		return (EReference)arduino_Status_ExecuteEClass.getEStructuralFeatures().get(1);
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
	public EReference getArduino_Project_Setup_This() {
		return (EReference)arduino_Project_SetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Project_Setup_SubSteps() {
		return (EReference)arduino_Project_SetupEClass.getEStructuralFeatures().get(1);
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
	public EClass getArduino_Level_Execute() {
		return arduino_Level_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Level_Execute_This() {
		return (EReference)arduino_Level_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Level_Execute_SubSteps() {
		return (EReference)arduino_Level_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Set_Execute() {
		return arduino_Set_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Set_Execute_This() {
		return (EReference)arduino_Set_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Set_Execute_SubSteps() {
		return (EReference)arduino_Set_ExecuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_Utilities_Call() {
		return arduino_Utilities_CallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Utilities_Call_This() {
		return (EReference)arduino_Utilities_CallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Utilities_Call_SubSteps() {
		return (EReference)arduino_Utilities_CallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino_FunctionCall_Execute() {
		return arduino_FunctionCall_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_FunctionCall_Execute_This() {
		return (EReference)arduino_FunctionCall_ExecuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_FunctionCall_Execute_SubSteps() {
		return (EReference)arduino_FunctionCall_ExecuteEClass.getEStructuralFeatures().get(1);
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
	public EClass getArduino_Status_Call() {
		return arduino_Status_CallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Status_Call_This() {
		return (EReference)arduino_Status_CallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Status_Call_SubSteps() {
		return (EReference)arduino_Status_CallEClass.getEStructuralFeatures().get(1);
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
		createEReference(smallStepEClass, SMALL_STEP__PRECEDING_STATE);

		stepsEClass = createEClass(STEPS);
		createEReference(stepsEClass, STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_DELAY_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__FILL_STEP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_STATUS_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_PROJECT_SETUP_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_REPEAT_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_LEVEL_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_SET_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_UTILITIES_CALL_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_IF_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_WHILE_EXECUTE_TRACE);
		createEReference(stepsEClass, STEPS__ARDUINO_STATUS_CALL_TRACE);

		bigStepEClass = createEClass(BIG_STEP);
		createEReference(bigStepEClass, BIG_STEP__STARTING_STATE);
		createEReference(bigStepEClass, BIG_STEP__ENDING_STATE);

		arduino_Status_Execute_AbstractSubStepEClass = createEClass(ARDUINO_STATUS_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Status_Execute_FillStepEClass = createEClass(ARDUINO_STATUS_EXECUTE_FILL_STEP);

		arduino_Project_Setup_AbstractSubStepEClass = createEClass(ARDUINO_PROJECT_SETUP_ABSTRACT_SUB_STEP);

		arduino_Project_Setup_FillStepEClass = createEClass(ARDUINO_PROJECT_SETUP_FILL_STEP);

		arduino_Repeat_Execute_AbstractSubStepEClass = createEClass(ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Repeat_Execute_FillStepEClass = createEClass(ARDUINO_REPEAT_EXECUTE_FILL_STEP);

		arduino_Level_Execute_AbstractSubStepEClass = createEClass(ARDUINO_LEVEL_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Level_Execute_FillStepEClass = createEClass(ARDUINO_LEVEL_EXECUTE_FILL_STEP);

		arduino_Set_Execute_AbstractSubStepEClass = createEClass(ARDUINO_SET_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_Set_Execute_FillStepEClass = createEClass(ARDUINO_SET_EXECUTE_FILL_STEP);

		arduino_Delay_ExecuteEClass = createEClass(ARDUINO_DELAY_EXECUTE);
		createEReference(arduino_Delay_ExecuteEClass, ARDUINO_DELAY_EXECUTE__THIS);

		arduino_Utilities_Call_AbstractSubStepEClass = createEClass(ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP);

		arduino_Utilities_Call_FillStepEClass = createEClass(ARDUINO_UTILITIES_CALL_FILL_STEP);

		arduino_FunctionCall_Execute_AbstractSubStepEClass = createEClass(ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_FunctionCall_Execute_FillStepEClass = createEClass(ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP);

		arduino_Utilities_ExecuteEClass = createEClass(ARDUINO_UTILITIES_EXECUTE);
		createEReference(arduino_Utilities_ExecuteEClass, ARDUINO_UTILITIES_EXECUTE__THIS);

		arduino_If_Execute_AbstractSubStepEClass = createEClass(ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_If_Execute_FillStepEClass = createEClass(ARDUINO_IF_EXECUTE_FILL_STEP);

		arduino_While_Execute_AbstractSubStepEClass = createEClass(ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP);

		arduino_While_Execute_FillStepEClass = createEClass(ARDUINO_WHILE_EXECUTE_FILL_STEP);

		arduino_Status_Call_AbstractSubStepEClass = createEClass(ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP);

		arduino_Status_Call_FillStepEClass = createEClass(ARDUINO_STATUS_CALL_FILL_STEP);

		fillStepEClass = createEClass(FILL_STEP);

		arduino_Status_ExecuteEClass = createEClass(ARDUINO_STATUS_EXECUTE);
		createEReference(arduino_Status_ExecuteEClass, ARDUINO_STATUS_EXECUTE__THIS);
		createEReference(arduino_Status_ExecuteEClass, ARDUINO_STATUS_EXECUTE__SUB_STEPS);

		arduino_Project_SetupEClass = createEClass(ARDUINO_PROJECT_SETUP);
		createEReference(arduino_Project_SetupEClass, ARDUINO_PROJECT_SETUP__THIS);
		createEReference(arduino_Project_SetupEClass, ARDUINO_PROJECT_SETUP__SUB_STEPS);

		arduino_Repeat_ExecuteEClass = createEClass(ARDUINO_REPEAT_EXECUTE);
		createEReference(arduino_Repeat_ExecuteEClass, ARDUINO_REPEAT_EXECUTE__THIS);
		createEReference(arduino_Repeat_ExecuteEClass, ARDUINO_REPEAT_EXECUTE__SUB_STEPS);

		arduino_Level_ExecuteEClass = createEClass(ARDUINO_LEVEL_EXECUTE);
		createEReference(arduino_Level_ExecuteEClass, ARDUINO_LEVEL_EXECUTE__THIS);
		createEReference(arduino_Level_ExecuteEClass, ARDUINO_LEVEL_EXECUTE__SUB_STEPS);

		arduino_Set_ExecuteEClass = createEClass(ARDUINO_SET_EXECUTE);
		createEReference(arduino_Set_ExecuteEClass, ARDUINO_SET_EXECUTE__THIS);
		createEReference(arduino_Set_ExecuteEClass, ARDUINO_SET_EXECUTE__SUB_STEPS);

		arduino_Utilities_CallEClass = createEClass(ARDUINO_UTILITIES_CALL);
		createEReference(arduino_Utilities_CallEClass, ARDUINO_UTILITIES_CALL__THIS);
		createEReference(arduino_Utilities_CallEClass, ARDUINO_UTILITIES_CALL__SUB_STEPS);

		arduino_FunctionCall_ExecuteEClass = createEClass(ARDUINO_FUNCTION_CALL_EXECUTE);
		createEReference(arduino_FunctionCall_ExecuteEClass, ARDUINO_FUNCTION_CALL_EXECUTE__THIS);
		createEReference(arduino_FunctionCall_ExecuteEClass, ARDUINO_FUNCTION_CALL_EXECUTE__SUB_STEPS);

		arduino_If_ExecuteEClass = createEClass(ARDUINO_IF_EXECUTE);
		createEReference(arduino_If_ExecuteEClass, ARDUINO_IF_EXECUTE__THIS);
		createEReference(arduino_If_ExecuteEClass, ARDUINO_IF_EXECUTE__SUB_STEPS);

		arduino_While_ExecuteEClass = createEClass(ARDUINO_WHILE_EXECUTE);
		createEReference(arduino_While_ExecuteEClass, ARDUINO_WHILE_EXECUTE__THIS);
		createEReference(arduino_While_ExecuteEClass, ARDUINO_WHILE_EXECUTE__SUB_STEPS);

		arduino_Status_CallEClass = createEClass(ARDUINO_STATUS_CALL);
		createEReference(arduino_Status_CallEClass, ARDUINO_STATUS_CALL__THIS);
		createEReference(arduino_Status_CallEClass, ARDUINO_STATUS_CALL__SUB_STEPS);
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
		ArduinoTracePackage theArduinoTracePackage = (ArduinoTracePackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI);
		ArduinoPackage theArduinoPackage = (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arduino_Status_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_Status_Execute_AbstractSubStep());
		arduino_Status_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Project_Setup_FillStepEClass.getESuperTypes().add(this.getArduino_Project_Setup_AbstractSubStep());
		arduino_Project_Setup_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Repeat_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_Repeat_Execute_AbstractSubStep());
		arduino_Repeat_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Level_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_Level_Execute_AbstractSubStep());
		arduino_Level_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Set_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_Set_Execute_AbstractSubStep());
		arduino_Set_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Delay_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Utilities_Call_FillStepEClass.getESuperTypes().add(this.getArduino_Utilities_Call_AbstractSubStep());
		arduino_Utilities_Call_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_FunctionCall_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_FunctionCall_Execute_AbstractSubStep());
		arduino_FunctionCall_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Utilities_ExecuteEClass.getESuperTypes().add(this.getSmallStep());
		arduino_If_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_If_Execute_AbstractSubStep());
		arduino_If_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_While_Execute_FillStepEClass.getESuperTypes().add(this.getArduino_While_Execute_AbstractSubStep());
		arduino_While_Execute_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Status_Call_FillStepEClass.getESuperTypes().add(this.getArduino_Status_Call_AbstractSubStep());
		arduino_Status_Call_FillStepEClass.getESuperTypes().add(this.getSmallStep());
		fillStepEClass.getESuperTypes().add(this.getSmallStep());
		arduino_Status_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Project_SetupEClass.getESuperTypes().add(this.getBigStep());
		arduino_Repeat_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Level_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Set_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Utilities_CallEClass.getESuperTypes().add(this.getBigStep());
		arduino_FunctionCall_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_If_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_While_ExecuteEClass.getESuperTypes().add(this.getBigStep());
		arduino_Status_CallEClass.getESuperTypes().add(this.getBigStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(smallStepEClass, SmallStep.class, "SmallStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmallStep_PrecedingState(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_FollowingStep(), "precedingState", null, 1, 1, SmallStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepsEClass, Steps.class, "Steps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSteps_Arduino_Status_Execute_FillStep_Trace(), this.getArduino_Status_Execute_FillStep(), null, "Arduino_Status_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Project_Setup_FillStep_Trace(), this.getArduino_Project_Setup_FillStep(), null, "Arduino_Project_Setup_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Repeat_Execute_FillStep_Trace(), this.getArduino_Repeat_Execute_FillStep(), null, "Arduino_Repeat_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Level_Execute_FillStep_Trace(), this.getArduino_Level_Execute_FillStep(), null, "Arduino_Level_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Set_Execute_FillStep_Trace(), this.getArduino_Set_Execute_FillStep(), null, "Arduino_Set_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Delay_Execute_Trace(), this.getArduino_Delay_Execute(), null, "Arduino_Delay_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Utilities_Call_FillStep_Trace(), this.getArduino_Utilities_Call_FillStep(), null, "Arduino_Utilities_Call_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_FunctionCall_Execute_FillStep_Trace(), this.getArduino_FunctionCall_Execute_FillStep(), null, "Arduino_FunctionCall_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Utilities_Execute_Trace(), this.getArduino_Utilities_Execute(), null, "Arduino_Utilities_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_If_Execute_FillStep_Trace(), this.getArduino_If_Execute_FillStep(), null, "Arduino_If_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_While_Execute_FillStep_Trace(), this.getArduino_While_Execute_FillStep(), null, "Arduino_While_Execute_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Status_Call_FillStep_Trace(), this.getArduino_Status_Call_FillStep(), null, "Arduino_Status_Call_FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_FillStep_Trace(), this.getFillStep(), null, "FillStep_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Status_Execute_Trace(), this.getArduino_Status_Execute(), null, "Arduino_Status_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Project_Setup_Trace(), this.getArduino_Project_Setup(), null, "Arduino_Project_Setup_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Repeat_Execute_Trace(), this.getArduino_Repeat_Execute(), null, "Arduino_Repeat_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Level_Execute_Trace(), this.getArduino_Level_Execute(), null, "Arduino_Level_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Set_Execute_Trace(), this.getArduino_Set_Execute(), null, "Arduino_Set_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Utilities_Call_Trace(), this.getArduino_Utilities_Call(), null, "Arduino_Utilities_Call_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_FunctionCall_Execute_Trace(), this.getArduino_FunctionCall_Execute(), null, "Arduino_FunctionCall_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_If_Execute_Trace(), this.getArduino_If_Execute(), null, "Arduino_If_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_While_Execute_Trace(), this.getArduino_While_Execute(), null, "Arduino_While_Execute_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteps_Arduino_Status_Call_Trace(), this.getArduino_Status_Call(), null, "Arduino_Status_Call_Trace", null, 0, -1, Steps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigStepEClass, BigStep.class, "BigStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBigStep_StartingState(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_StartedBigSteps(), "startingState", null, 1, 1, BigStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBigStep_EndingState(), theArduinoTracePackage.getState(), theArduinoTracePackage.getState_EndedBigSteps(), "endingState", null, 0, 1, BigStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Status_Execute_AbstractSubStepEClass, Arduino_Status_Execute_AbstractSubStep.class, "Arduino_Status_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Status_Execute_FillStepEClass, Arduino_Status_Execute_FillStep.class, "Arduino_Status_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Project_Setup_AbstractSubStepEClass, Arduino_Project_Setup_AbstractSubStep.class, "Arduino_Project_Setup_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Project_Setup_FillStepEClass, Arduino_Project_Setup_FillStep.class, "Arduino_Project_Setup_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Repeat_Execute_AbstractSubStepEClass, Arduino_Repeat_Execute_AbstractSubStep.class, "Arduino_Repeat_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Repeat_Execute_FillStepEClass, Arduino_Repeat_Execute_FillStep.class, "Arduino_Repeat_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Level_Execute_AbstractSubStepEClass, Arduino_Level_Execute_AbstractSubStep.class, "Arduino_Level_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Level_Execute_FillStepEClass, Arduino_Level_Execute_FillStep.class, "Arduino_Level_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Set_Execute_AbstractSubStepEClass, Arduino_Set_Execute_AbstractSubStep.class, "Arduino_Set_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Set_Execute_FillStepEClass, Arduino_Set_Execute_FillStep.class, "Arduino_Set_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Delay_ExecuteEClass, Arduino_Delay_Execute.class, "Arduino_Delay_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Delay_Execute_This(), theArduinoPackage.getDelay(), null, "this", null, 0, 1, Arduino_Delay_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Utilities_Call_AbstractSubStepEClass, Arduino_Utilities_Call_AbstractSubStep.class, "Arduino_Utilities_Call_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Utilities_Call_FillStepEClass, Arduino_Utilities_Call_FillStep.class, "Arduino_Utilities_Call_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_FunctionCall_Execute_AbstractSubStepEClass, Arduino_FunctionCall_Execute_AbstractSubStep.class, "Arduino_FunctionCall_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_FunctionCall_Execute_FillStepEClass, Arduino_FunctionCall_Execute_FillStep.class, "Arduino_FunctionCall_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Utilities_ExecuteEClass, Arduino_Utilities_Execute.class, "Arduino_Utilities_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Utilities_Execute_This(), theArduinoPackage.getUtilities(), null, "this", null, 0, 1, Arduino_Utilities_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_If_Execute_AbstractSubStepEClass, Arduino_If_Execute_AbstractSubStep.class, "Arduino_If_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_If_Execute_FillStepEClass, Arduino_If_Execute_FillStep.class, "Arduino_If_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_While_Execute_AbstractSubStepEClass, Arduino_While_Execute_AbstractSubStep.class, "Arduino_While_Execute_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_While_Execute_FillStepEClass, Arduino_While_Execute_FillStep.class, "Arduino_While_Execute_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Status_Call_AbstractSubStepEClass, Arduino_Status_Call_AbstractSubStep.class, "Arduino_Status_Call_AbstractSubStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Status_Call_FillStepEClass, Arduino_Status_Call_FillStep.class, "Arduino_Status_Call_FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fillStepEClass, FillStep.class, "FillStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduino_Status_ExecuteEClass, Arduino_Status_Execute.class, "Arduino_Status_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Status_Execute_This(), theArduinoPackage.getStatus(), null, "this", null, 0, 1, Arduino_Status_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Status_Execute_SubSteps(), this.getArduino_Status_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Status_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Project_SetupEClass, Arduino_Project_Setup.class, "Arduino_Project_Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Project_Setup_This(), theArduinoPackage.getProject(), null, "this", null, 0, 1, Arduino_Project_Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Project_Setup_SubSteps(), this.getArduino_Project_Setup_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Project_Setup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Repeat_ExecuteEClass, Arduino_Repeat_Execute.class, "Arduino_Repeat_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Repeat_Execute_This(), theArduinoPackage.getRepeat(), null, "this", null, 0, 1, Arduino_Repeat_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Repeat_Execute_SubSteps(), this.getArduino_Repeat_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Repeat_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Level_ExecuteEClass, Arduino_Level_Execute.class, "Arduino_Level_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Level_Execute_This(), theArduinoPackage.getLevel(), null, "this", null, 0, 1, Arduino_Level_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Level_Execute_SubSteps(), this.getArduino_Level_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Level_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Set_ExecuteEClass, Arduino_Set_Execute.class, "Arduino_Set_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Set_Execute_This(), theArduinoPackage.getSet(), null, "this", null, 0, 1, Arduino_Set_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Set_Execute_SubSteps(), this.getArduino_Set_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Set_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Utilities_CallEClass, Arduino_Utilities_Call.class, "Arduino_Utilities_Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Utilities_Call_This(), theArduinoPackage.getUtilities(), null, "this", null, 0, 1, Arduino_Utilities_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Utilities_Call_SubSteps(), this.getArduino_Utilities_Call_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Utilities_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_FunctionCall_ExecuteEClass, Arduino_FunctionCall_Execute.class, "Arduino_FunctionCall_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_FunctionCall_Execute_This(), theArduinoPackage.getFunctionCall(), null, "this", null, 0, 1, Arduino_FunctionCall_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_FunctionCall_Execute_SubSteps(), this.getArduino_FunctionCall_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_FunctionCall_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_If_ExecuteEClass, Arduino_If_Execute.class, "Arduino_If_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_If_Execute_This(), theArduinoPackage.getIf(), null, "this", null, 0, 1, Arduino_If_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_If_Execute_SubSteps(), this.getArduino_If_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_If_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_While_ExecuteEClass, Arduino_While_Execute.class, "Arduino_While_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_While_Execute_This(), theArduinoPackage.getWhile(), null, "this", null, 0, 1, Arduino_While_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_While_Execute_SubSteps(), this.getArduino_While_Execute_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_While_Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduino_Status_CallEClass, Arduino_Status_Call.class, "Arduino_Status_Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduino_Status_Call_This(), theArduinoPackage.getStatus(), null, "this", null, 0, 1, Arduino_Status_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Status_Call_SubSteps(), this.getArduino_Status_Call_AbstractSubStep(), null, "subSteps", null, 0, -1, Arduino_Status_Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl

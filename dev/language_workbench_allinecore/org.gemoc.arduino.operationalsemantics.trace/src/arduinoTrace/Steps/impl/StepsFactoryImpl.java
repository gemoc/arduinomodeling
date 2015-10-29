/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.STEPS: return createSteps();
			case StepsPackage.ARDUINO_STATUS_EXECUTE_FILL_STEP: return createArduino_Status_Execute_FillStep();
			case StepsPackage.ARDUINO_PROJECT_SETUP_FILL_STEP: return createArduino_Project_Setup_FillStep();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_FILL_STEP: return createArduino_Repeat_Execute_FillStep();
			case StepsPackage.ARDUINO_LEVEL_EXECUTE_FILL_STEP: return createArduino_Level_Execute_FillStep();
			case StepsPackage.ARDUINO_SET_EXECUTE_FILL_STEP: return createArduino_Set_Execute_FillStep();
			case StepsPackage.ARDUINO_DELAY_EXECUTE: return createArduino_Delay_Execute();
			case StepsPackage.ARDUINO_UTILITIES_CALL_FILL_STEP: return createArduino_Utilities_Call_FillStep();
			case StepsPackage.ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP: return createArduino_FunctionCall_Execute_FillStep();
			case StepsPackage.ARDUINO_UTILITIES_EXECUTE: return createArduino_Utilities_Execute();
			case StepsPackage.ARDUINO_IF_EXECUTE_FILL_STEP: return createArduino_If_Execute_FillStep();
			case StepsPackage.ARDUINO_WHILE_EXECUTE_FILL_STEP: return createArduino_While_Execute_FillStep();
			case StepsPackage.ARDUINO_STATUS_CALL_FILL_STEP: return createArduino_Status_Call_FillStep();
			case StepsPackage.FILL_STEP: return createFillStep();
			case StepsPackage.ARDUINO_STATUS_EXECUTE: return createArduino_Status_Execute();
			case StepsPackage.ARDUINO_PROJECT_SETUP: return createArduino_Project_Setup();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE: return createArduino_Repeat_Execute();
			case StepsPackage.ARDUINO_LEVEL_EXECUTE: return createArduino_Level_Execute();
			case StepsPackage.ARDUINO_SET_EXECUTE: return createArduino_Set_Execute();
			case StepsPackage.ARDUINO_UTILITIES_CALL: return createArduino_Utilities_Call();
			case StepsPackage.ARDUINO_FUNCTION_CALL_EXECUTE: return createArduino_FunctionCall_Execute();
			case StepsPackage.ARDUINO_IF_EXECUTE: return createArduino_If_Execute();
			case StepsPackage.ARDUINO_WHILE_EXECUTE: return createArduino_While_Execute();
			case StepsPackage.ARDUINO_STATUS_CALL: return createArduino_Status_Call();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steps createSteps() {
		StepsImpl steps = new StepsImpl();
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Status_Execute_FillStep createArduino_Status_Execute_FillStep() {
		Arduino_Status_Execute_FillStepImpl arduino_Status_Execute_FillStep = new Arduino_Status_Execute_FillStepImpl();
		return arduino_Status_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Project_Setup_FillStep createArduino_Project_Setup_FillStep() {
		Arduino_Project_Setup_FillStepImpl arduino_Project_Setup_FillStep = new Arduino_Project_Setup_FillStepImpl();
		return arduino_Project_Setup_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Repeat_Execute_FillStep createArduino_Repeat_Execute_FillStep() {
		Arduino_Repeat_Execute_FillStepImpl arduino_Repeat_Execute_FillStep = new Arduino_Repeat_Execute_FillStepImpl();
		return arduino_Repeat_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Level_Execute_FillStep createArduino_Level_Execute_FillStep() {
		Arduino_Level_Execute_FillStepImpl arduino_Level_Execute_FillStep = new Arduino_Level_Execute_FillStepImpl();
		return arduino_Level_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Set_Execute_FillStep createArduino_Set_Execute_FillStep() {
		Arduino_Set_Execute_FillStepImpl arduino_Set_Execute_FillStep = new Arduino_Set_Execute_FillStepImpl();
		return arduino_Set_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Delay_Execute createArduino_Delay_Execute() {
		Arduino_Delay_ExecuteImpl arduino_Delay_Execute = new Arduino_Delay_ExecuteImpl();
		return arduino_Delay_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Utilities_Call_FillStep createArduino_Utilities_Call_FillStep() {
		Arduino_Utilities_Call_FillStepImpl arduino_Utilities_Call_FillStep = new Arduino_Utilities_Call_FillStepImpl();
		return arduino_Utilities_Call_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_FunctionCall_Execute_FillStep createArduino_FunctionCall_Execute_FillStep() {
		Arduino_FunctionCall_Execute_FillStepImpl arduino_FunctionCall_Execute_FillStep = new Arduino_FunctionCall_Execute_FillStepImpl();
		return arduino_FunctionCall_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Utilities_Execute createArduino_Utilities_Execute() {
		Arduino_Utilities_ExecuteImpl arduino_Utilities_Execute = new Arduino_Utilities_ExecuteImpl();
		return arduino_Utilities_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_If_Execute_FillStep createArduino_If_Execute_FillStep() {
		Arduino_If_Execute_FillStepImpl arduino_If_Execute_FillStep = new Arduino_If_Execute_FillStepImpl();
		return arduino_If_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_While_Execute_FillStep createArduino_While_Execute_FillStep() {
		Arduino_While_Execute_FillStepImpl arduino_While_Execute_FillStep = new Arduino_While_Execute_FillStepImpl();
		return arduino_While_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Status_Call_FillStep createArduino_Status_Call_FillStep() {
		Arduino_Status_Call_FillStepImpl arduino_Status_Call_FillStep = new Arduino_Status_Call_FillStepImpl();
		return arduino_Status_Call_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillStep createFillStep() {
		FillStepImpl fillStep = new FillStepImpl();
		return fillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Status_Execute createArduino_Status_Execute() {
		Arduino_Status_ExecuteImpl arduino_Status_Execute = new Arduino_Status_ExecuteImpl();
		return arduino_Status_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Project_Setup createArduino_Project_Setup() {
		Arduino_Project_SetupImpl arduino_Project_Setup = new Arduino_Project_SetupImpl();
		return arduino_Project_Setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Repeat_Execute createArduino_Repeat_Execute() {
		Arduino_Repeat_ExecuteImpl arduino_Repeat_Execute = new Arduino_Repeat_ExecuteImpl();
		return arduino_Repeat_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Level_Execute createArduino_Level_Execute() {
		Arduino_Level_ExecuteImpl arduino_Level_Execute = new Arduino_Level_ExecuteImpl();
		return arduino_Level_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Set_Execute createArduino_Set_Execute() {
		Arduino_Set_ExecuteImpl arduino_Set_Execute = new Arduino_Set_ExecuteImpl();
		return arduino_Set_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Utilities_Call createArduino_Utilities_Call() {
		Arduino_Utilities_CallImpl arduino_Utilities_Call = new Arduino_Utilities_CallImpl();
		return arduino_Utilities_Call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_FunctionCall_Execute createArduino_FunctionCall_Execute() {
		Arduino_FunctionCall_ExecuteImpl arduino_FunctionCall_Execute = new Arduino_FunctionCall_ExecuteImpl();
		return arduino_FunctionCall_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_If_Execute createArduino_If_Execute() {
		Arduino_If_ExecuteImpl arduino_If_Execute = new Arduino_If_ExecuteImpl();
		return arduino_If_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_While_Execute createArduino_While_Execute() {
		Arduino_While_ExecuteImpl arduino_While_Execute = new Arduino_While_ExecuteImpl();
		return arduino_While_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Status_Call createArduino_Status_Call() {
		Arduino_Status_CallImpl arduino_Status_Call = new Arduino_Status_CallImpl();
		return arduino_Status_Call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl

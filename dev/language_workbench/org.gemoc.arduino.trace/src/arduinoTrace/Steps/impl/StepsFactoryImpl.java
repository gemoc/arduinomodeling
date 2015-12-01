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
			case StepsPackage.ROOT_FILL_STEP: return createRootFillStep();
			case StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE: return createArduino_BooleanModuleGet_Evaluate();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE: return createArduino_ModuleAssignment_Execute();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP: return createArduino_ModuleAssignment_Execute_FillStep();
			case StepsPackage.ARDUINO_INTEGER_CONSTANT_EVALUATE: return createArduino_IntegerConstant_Evaluate();
			case StepsPackage.ARDUINO_BOOLEAN_CONSTANT_EVALUATE: return createArduino_BooleanConstant_Evaluate();
			case StepsPackage.ARDUINO_INTEGER_MODULE_GET_EVALUATE: return createArduino_IntegerModuleGet_Evaluate();
			case StepsPackage.ARDUINO_WHILE_EXECUTE: return createArduino_While_Execute();
			case StepsPackage.ARDUINO_WHILE_EXECUTE_FILL_STEP: return createArduino_While_Execute_FillStep();
			case StepsPackage.ARDUINO_UTILITIES_EXECUTE: return createArduino_Utilities_Execute();
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE: return createArduino_VariableAssignment_Execute();
			case StepsPackage.ARDUINO_IF_EXECUTE: return createArduino_If_Execute();
			case StepsPackage.ARDUINO_DELAY_EXECUTE: return createArduino_Delay_Execute();
			case StepsPackage.ARDUINO_VARIABLE_DECLARATION_EXECUTE: return createArduino_VariableDeclaration_Execute();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE: return createArduino_Repeat_Execute();
			case StepsPackage.ARDUINO_IF_EXECUTE_FILL_STEP: return createArduino_If_Execute_FillStep();
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP: return createArduino_VariableAssignment_Execute_FillStep();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_FILL_STEP: return createArduino_Repeat_Execute_FillStep();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_CALL: return createArduino_ModuleAssignment_Call();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP: return createArduino_ModuleAssignment_Call_FillStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootFillStep createRootFillStep() {
		RootFillStepImpl rootFillStep = new RootFillStepImpl();
		return rootFillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_BooleanModuleGet_Evaluate createArduino_BooleanModuleGet_Evaluate() {
		Arduino_BooleanModuleGet_EvaluateImpl arduino_BooleanModuleGet_Evaluate = new Arduino_BooleanModuleGet_EvaluateImpl();
		return arduino_BooleanModuleGet_Evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_ModuleAssignment_Execute createArduino_ModuleAssignment_Execute() {
		Arduino_ModuleAssignment_ExecuteImpl arduino_ModuleAssignment_Execute = new Arduino_ModuleAssignment_ExecuteImpl();
		return arduino_ModuleAssignment_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_ModuleAssignment_Execute_FillStep createArduino_ModuleAssignment_Execute_FillStep() {
		Arduino_ModuleAssignment_Execute_FillStepImpl arduino_ModuleAssignment_Execute_FillStep = new Arduino_ModuleAssignment_Execute_FillStepImpl();
		return arduino_ModuleAssignment_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_IntegerConstant_Evaluate createArduino_IntegerConstant_Evaluate() {
		Arduino_IntegerConstant_EvaluateImpl arduino_IntegerConstant_Evaluate = new Arduino_IntegerConstant_EvaluateImpl();
		return arduino_IntegerConstant_Evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_BooleanConstant_Evaluate createArduino_BooleanConstant_Evaluate() {
		Arduino_BooleanConstant_EvaluateImpl arduino_BooleanConstant_Evaluate = new Arduino_BooleanConstant_EvaluateImpl();
		return arduino_BooleanConstant_Evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_IntegerModuleGet_Evaluate createArduino_IntegerModuleGet_Evaluate() {
		Arduino_IntegerModuleGet_EvaluateImpl arduino_IntegerModuleGet_Evaluate = new Arduino_IntegerModuleGet_EvaluateImpl();
		return arduino_IntegerModuleGet_Evaluate;
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
	public Arduino_While_Execute_FillStep createArduino_While_Execute_FillStep() {
		Arduino_While_Execute_FillStepImpl arduino_While_Execute_FillStep = new Arduino_While_Execute_FillStepImpl();
		return arduino_While_Execute_FillStep;
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
	public Arduino_VariableAssignment_Execute createArduino_VariableAssignment_Execute() {
		Arduino_VariableAssignment_ExecuteImpl arduino_VariableAssignment_Execute = new Arduino_VariableAssignment_ExecuteImpl();
		return arduino_VariableAssignment_Execute;
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
	public Arduino_Delay_Execute createArduino_Delay_Execute() {
		Arduino_Delay_ExecuteImpl arduino_Delay_Execute = new Arduino_Delay_ExecuteImpl();
		return arduino_Delay_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_VariableDeclaration_Execute createArduino_VariableDeclaration_Execute() {
		Arduino_VariableDeclaration_ExecuteImpl arduino_VariableDeclaration_Execute = new Arduino_VariableDeclaration_ExecuteImpl();
		return arduino_VariableDeclaration_Execute;
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
	public Arduino_If_Execute_FillStep createArduino_If_Execute_FillStep() {
		Arduino_If_Execute_FillStepImpl arduino_If_Execute_FillStep = new Arduino_If_Execute_FillStepImpl();
		return arduino_If_Execute_FillStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_VariableAssignment_Execute_FillStep createArduino_VariableAssignment_Execute_FillStep() {
		Arduino_VariableAssignment_Execute_FillStepImpl arduino_VariableAssignment_Execute_FillStep = new Arduino_VariableAssignment_Execute_FillStepImpl();
		return arduino_VariableAssignment_Execute_FillStep;
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
	public Arduino_ModuleAssignment_Call createArduino_ModuleAssignment_Call() {
		Arduino_ModuleAssignment_CallImpl arduino_ModuleAssignment_Call = new Arduino_ModuleAssignment_CallImpl();
		return arduino_ModuleAssignment_Call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_ModuleAssignment_Call_FillStep createArduino_ModuleAssignment_Call_FillStep() {
		Arduino_ModuleAssignment_Call_FillStepImpl arduino_ModuleAssignment_Call_FillStep = new Arduino_ModuleAssignment_Call_FillStepImpl();
		return arduino_ModuleAssignment_Call_FillStep;
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

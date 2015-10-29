/**
 */
package arduinoTrace.Steps.util;

import arduinoTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.SMALL_STEP: {
				SmallStep smallStep = (SmallStep)theEObject;
				T result = caseSmallStep(smallStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.STEPS: {
				Steps steps = (Steps)theEObject;
				T result = caseSteps(steps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.BIG_STEP: {
				BigStep bigStep = (BigStep)theEObject;
				T result = caseBigStep(bigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_STATUS_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_Status_Execute_AbstractSubStep arduino_Status_Execute_AbstractSubStep = (Arduino_Status_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_Status_Execute_AbstractSubStep(arduino_Status_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_STATUS_EXECUTE_FILL_STEP: {
				Arduino_Status_Execute_FillStep arduino_Status_Execute_FillStep = (Arduino_Status_Execute_FillStep)theEObject;
				T result = caseArduino_Status_Execute_FillStep(arduino_Status_Execute_FillStep);
				if (result == null) result = caseArduino_Status_Execute_AbstractSubStep(arduino_Status_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_Status_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_PROJECT_SETUP_ABSTRACT_SUB_STEP: {
				Arduino_Project_Setup_AbstractSubStep arduino_Project_Setup_AbstractSubStep = (Arduino_Project_Setup_AbstractSubStep)theEObject;
				T result = caseArduino_Project_Setup_AbstractSubStep(arduino_Project_Setup_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_PROJECT_SETUP_FILL_STEP: {
				Arduino_Project_Setup_FillStep arduino_Project_Setup_FillStep = (Arduino_Project_Setup_FillStep)theEObject;
				T result = caseArduino_Project_Setup_FillStep(arduino_Project_Setup_FillStep);
				if (result == null) result = caseArduino_Project_Setup_AbstractSubStep(arduino_Project_Setup_FillStep);
				if (result == null) result = caseSmallStep(arduino_Project_Setup_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_Repeat_Execute_AbstractSubStep arduino_Repeat_Execute_AbstractSubStep = (Arduino_Repeat_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_Repeat_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_FILL_STEP: {
				Arduino_Repeat_Execute_FillStep arduino_Repeat_Execute_FillStep = (Arduino_Repeat_Execute_FillStep)theEObject;
				T result = caseArduino_Repeat_Execute_FillStep(arduino_Repeat_Execute_FillStep);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_Repeat_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_Repeat_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_LEVEL_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_Level_Execute_AbstractSubStep arduino_Level_Execute_AbstractSubStep = (Arduino_Level_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_Level_Execute_AbstractSubStep(arduino_Level_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_LEVEL_EXECUTE_FILL_STEP: {
				Arduino_Level_Execute_FillStep arduino_Level_Execute_FillStep = (Arduino_Level_Execute_FillStep)theEObject;
				T result = caseArduino_Level_Execute_FillStep(arduino_Level_Execute_FillStep);
				if (result == null) result = caseArduino_Level_Execute_AbstractSubStep(arduino_Level_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_Level_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_SET_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_Set_Execute_AbstractSubStep arduino_Set_Execute_AbstractSubStep = (Arduino_Set_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_Set_Execute_AbstractSubStep(arduino_Set_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_SET_EXECUTE_FILL_STEP: {
				Arduino_Set_Execute_FillStep arduino_Set_Execute_FillStep = (Arduino_Set_Execute_FillStep)theEObject;
				T result = caseArduino_Set_Execute_FillStep(arduino_Set_Execute_FillStep);
				if (result == null) result = caseArduino_Set_Execute_AbstractSubStep(arduino_Set_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_Set_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_DELAY_EXECUTE: {
				Arduino_Delay_Execute arduino_Delay_Execute = (Arduino_Delay_Execute)theEObject;
				T result = caseArduino_Delay_Execute(arduino_Delay_Execute);
				if (result == null) result = caseSmallStep(arduino_Delay_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP: {
				Arduino_Utilities_Call_AbstractSubStep arduino_Utilities_Call_AbstractSubStep = (Arduino_Utilities_Call_AbstractSubStep)theEObject;
				T result = caseArduino_Utilities_Call_AbstractSubStep(arduino_Utilities_Call_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_UTILITIES_CALL_FILL_STEP: {
				Arduino_Utilities_Call_FillStep arduino_Utilities_Call_FillStep = (Arduino_Utilities_Call_FillStep)theEObject;
				T result = caseArduino_Utilities_Call_FillStep(arduino_Utilities_Call_FillStep);
				if (result == null) result = caseArduino_Utilities_Call_AbstractSubStep(arduino_Utilities_Call_FillStep);
				if (result == null) result = caseSmallStep(arduino_Utilities_Call_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_FunctionCall_Execute_AbstractSubStep arduino_FunctionCall_Execute_AbstractSubStep = (Arduino_FunctionCall_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_FunctionCall_Execute_AbstractSubStep(arduino_FunctionCall_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP: {
				Arduino_FunctionCall_Execute_FillStep arduino_FunctionCall_Execute_FillStep = (Arduino_FunctionCall_Execute_FillStep)theEObject;
				T result = caseArduino_FunctionCall_Execute_FillStep(arduino_FunctionCall_Execute_FillStep);
				if (result == null) result = caseArduino_FunctionCall_Execute_AbstractSubStep(arduino_FunctionCall_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_FunctionCall_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_UTILITIES_EXECUTE: {
				Arduino_Utilities_Execute arduino_Utilities_Execute = (Arduino_Utilities_Execute)theEObject;
				T result = caseArduino_Utilities_Execute(arduino_Utilities_Execute);
				if (result == null) result = caseSmallStep(arduino_Utilities_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_If_Execute_AbstractSubStep arduino_If_Execute_AbstractSubStep = (Arduino_If_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_If_Execute_AbstractSubStep(arduino_If_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE_FILL_STEP: {
				Arduino_If_Execute_FillStep arduino_If_Execute_FillStep = (Arduino_If_Execute_FillStep)theEObject;
				T result = caseArduino_If_Execute_FillStep(arduino_If_Execute_FillStep);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_If_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_If_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_While_Execute_AbstractSubStep arduino_While_Execute_AbstractSubStep = (Arduino_While_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_While_Execute_AbstractSubStep(arduino_While_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_WHILE_EXECUTE_FILL_STEP: {
				Arduino_While_Execute_FillStep arduino_While_Execute_FillStep = (Arduino_While_Execute_FillStep)theEObject;
				T result = caseArduino_While_Execute_FillStep(arduino_While_Execute_FillStep);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_While_Execute_FillStep);
				if (result == null) result = caseSmallStep(arduino_While_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP: {
				Arduino_Status_Call_AbstractSubStep arduino_Status_Call_AbstractSubStep = (Arduino_Status_Call_AbstractSubStep)theEObject;
				T result = caseArduino_Status_Call_AbstractSubStep(arduino_Status_Call_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_STATUS_CALL_FILL_STEP: {
				Arduino_Status_Call_FillStep arduino_Status_Call_FillStep = (Arduino_Status_Call_FillStep)theEObject;
				T result = caseArduino_Status_Call_FillStep(arduino_Status_Call_FillStep);
				if (result == null) result = caseArduino_Status_Call_AbstractSubStep(arduino_Status_Call_FillStep);
				if (result == null) result = caseSmallStep(arduino_Status_Call_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.FILL_STEP: {
				FillStep fillStep = (FillStep)theEObject;
				T result = caseFillStep(fillStep);
				if (result == null) result = caseSmallStep(fillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_STATUS_EXECUTE: {
				Arduino_Status_Execute arduino_Status_Execute = (Arduino_Status_Execute)theEObject;
				T result = caseArduino_Status_Execute(arduino_Status_Execute);
				if (result == null) result = caseBigStep(arduino_Status_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_PROJECT_SETUP: {
				Arduino_Project_Setup arduino_Project_Setup = (Arduino_Project_Setup)theEObject;
				T result = caseArduino_Project_Setup(arduino_Project_Setup);
				if (result == null) result = caseBigStep(arduino_Project_Setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_REPEAT_EXECUTE: {
				Arduino_Repeat_Execute arduino_Repeat_Execute = (Arduino_Repeat_Execute)theEObject;
				T result = caseArduino_Repeat_Execute(arduino_Repeat_Execute);
				if (result == null) result = caseBigStep(arduino_Repeat_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_LEVEL_EXECUTE: {
				Arduino_Level_Execute arduino_Level_Execute = (Arduino_Level_Execute)theEObject;
				T result = caseArduino_Level_Execute(arduino_Level_Execute);
				if (result == null) result = caseBigStep(arduino_Level_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_SET_EXECUTE: {
				Arduino_Set_Execute arduino_Set_Execute = (Arduino_Set_Execute)theEObject;
				T result = caseArduino_Set_Execute(arduino_Set_Execute);
				if (result == null) result = caseBigStep(arduino_Set_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_UTILITIES_CALL: {
				Arduino_Utilities_Call arduino_Utilities_Call = (Arduino_Utilities_Call)theEObject;
				T result = caseArduino_Utilities_Call(arduino_Utilities_Call);
				if (result == null) result = caseBigStep(arduino_Utilities_Call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_FUNCTION_CALL_EXECUTE: {
				Arduino_FunctionCall_Execute arduino_FunctionCall_Execute = (Arduino_FunctionCall_Execute)theEObject;
				T result = caseArduino_FunctionCall_Execute(arduino_FunctionCall_Execute);
				if (result == null) result = caseBigStep(arduino_FunctionCall_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE: {
				Arduino_If_Execute arduino_If_Execute = (Arduino_If_Execute)theEObject;
				T result = caseArduino_If_Execute(arduino_If_Execute);
				if (result == null) result = caseBigStep(arduino_If_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_WHILE_EXECUTE: {
				Arduino_While_Execute arduino_While_Execute = (Arduino_While_Execute)theEObject;
				T result = caseArduino_While_Execute(arduino_While_Execute);
				if (result == null) result = caseBigStep(arduino_While_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_STATUS_CALL: {
				Arduino_Status_Call arduino_Status_Call = (Arduino_Status_Call)theEObject;
				T result = caseArduino_Status_Call(arduino_Status_Call);
				if (result == null) result = caseBigStep(arduino_Status_Call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteps(Steps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigStep(BigStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Status Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Status Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Status_Execute_AbstractSubStep(Arduino_Status_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Status Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Status Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Status_Execute_FillStep(Arduino_Status_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Project Setup Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Project Setup Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Project_Setup_AbstractSubStep(Arduino_Project_Setup_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Project Setup Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Project Setup Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Project_Setup_FillStep(Arduino_Project_Setup_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Repeat Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Repeat Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Repeat_Execute_AbstractSubStep(Arduino_Repeat_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Repeat Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Repeat Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Repeat_Execute_FillStep(Arduino_Repeat_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Level Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Level Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Level_Execute_AbstractSubStep(Arduino_Level_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Level Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Level Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Level_Execute_FillStep(Arduino_Level_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Set Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Set Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Set_Execute_AbstractSubStep(Arduino_Set_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Set Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Set Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Set_Execute_FillStep(Arduino_Set_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Delay Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Delay Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Delay_Execute(Arduino_Delay_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Utilities Call Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Utilities Call Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Utilities_Call_AbstractSubStep(Arduino_Utilities_Call_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Utilities Call Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Utilities Call Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Utilities_Call_FillStep(Arduino_Utilities_Call_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Function Call Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Function Call Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_FunctionCall_Execute_AbstractSubStep(Arduino_FunctionCall_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Function Call Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Function Call Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_FunctionCall_Execute_FillStep(Arduino_FunctionCall_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Utilities Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Utilities Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Utilities_Execute(Arduino_Utilities_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino If Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino If Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_If_Execute_AbstractSubStep(Arduino_If_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino If Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino If Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_If_Execute_FillStep(Arduino_If_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino While Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino While Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_While_Execute_AbstractSubStep(Arduino_While_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino While Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino While Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_While_Execute_FillStep(Arduino_While_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Status Call Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Status Call Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Status_Call_AbstractSubStep(Arduino_Status_Call_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Status Call Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Status Call Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Status_Call_FillStep(Arduino_Status_Call_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFillStep(FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Status Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Status Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Status_Execute(Arduino_Status_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Project Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Project Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Project_Setup(Arduino_Project_Setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Repeat Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Repeat Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Repeat_Execute(Arduino_Repeat_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Level Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Level Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Level_Execute(Arduino_Level_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Set Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Set Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Set_Execute(Arduino_Set_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Utilities Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Utilities Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Utilities_Call(Arduino_Utilities_Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Function Call Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Function Call Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_FunctionCall_Execute(Arduino_FunctionCall_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino If Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino If Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_If_Execute(Arduino_If_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino While Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino While Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_While_Execute(Arduino_While_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Status Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Status Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Status_Call(Arduino_Status_Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch

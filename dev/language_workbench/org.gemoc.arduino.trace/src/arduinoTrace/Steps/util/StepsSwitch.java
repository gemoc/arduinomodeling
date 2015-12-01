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
				if (result == null) result = caseStep(smallStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.BIG_STEP: {
				BigStep bigStep = (BigStep)theEObject;
				T result = caseBigStep(bigStep);
				if (result == null) result = caseStep(bigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_FILL_STEP: {
				RootFillStep rootFillStep = (RootFillStep)theEObject;
				T result = caseRootFillStep(rootFillStep);
				if (result == null) result = caseSmallStep(rootFillStep);
				if (result == null) result = caseStep(rootFillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE: {
				Arduino_BooleanModuleGet_Evaluate arduino_BooleanModuleGet_Evaluate = (Arduino_BooleanModuleGet_Evaluate)theEObject;
				T result = caseArduino_BooleanModuleGet_Evaluate(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = caseSmallStep(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = caseStep(arduino_BooleanModuleGet_Evaluate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE: {
				Arduino_ModuleAssignment_Execute arduino_ModuleAssignment_Execute = (Arduino_ModuleAssignment_Execute)theEObject;
				T result = caseArduino_ModuleAssignment_Execute(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseBigStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_ModuleAssignment_Call_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_ModuleAssignment_Execute_AbstractSubStep arduino_ModuleAssignment_Execute_AbstractSubStep = (Arduino_ModuleAssignment_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP: {
				Arduino_ModuleAssignment_Execute_FillStep arduino_ModuleAssignment_Execute_FillStep = (Arduino_ModuleAssignment_Execute_FillStep)theEObject;
				T result = caseArduino_ModuleAssignment_Execute_FillStep(arduino_ModuleAssignment_Execute_FillStep);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute_FillStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_INTEGER_CONSTANT_EVALUATE: {
				Arduino_IntegerConstant_Evaluate arduino_IntegerConstant_Evaluate = (Arduino_IntegerConstant_Evaluate)theEObject;
				T result = caseArduino_IntegerConstant_Evaluate(arduino_IntegerConstant_Evaluate);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_IntegerConstant_Evaluate);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_IntegerConstant_Evaluate);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_IntegerConstant_Evaluate);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_IntegerConstant_Evaluate);
				if (result == null) result = caseSmallStep(arduino_IntegerConstant_Evaluate);
				if (result == null) result = caseStep(arduino_IntegerConstant_Evaluate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_BOOLEAN_CONSTANT_EVALUATE: {
				Arduino_BooleanConstant_Evaluate arduino_BooleanConstant_Evaluate = (Arduino_BooleanConstant_Evaluate)theEObject;
				T result = caseArduino_BooleanConstant_Evaluate(arduino_BooleanConstant_Evaluate);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_BooleanConstant_Evaluate);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_BooleanConstant_Evaluate);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_BooleanConstant_Evaluate);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_BooleanConstant_Evaluate);
				if (result == null) result = caseSmallStep(arduino_BooleanConstant_Evaluate);
				if (result == null) result = caseStep(arduino_BooleanConstant_Evaluate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_INTEGER_MODULE_GET_EVALUATE: {
				Arduino_IntegerModuleGet_Evaluate arduino_IntegerModuleGet_Evaluate = (Arduino_IntegerModuleGet_Evaluate)theEObject;
				T result = caseArduino_IntegerModuleGet_Evaluate(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = caseSmallStep(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = caseStep(arduino_IntegerModuleGet_Evaluate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_WHILE_EXECUTE: {
				Arduino_While_Execute arduino_While_Execute = (Arduino_While_Execute)theEObject;
				T result = caseArduino_While_Execute(arduino_While_Execute);
				if (result == null) result = caseBigStep(arduino_While_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_While_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_While_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_While_Execute);
				if (result == null) result = caseStep(arduino_While_Execute);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_UTILITIES_EXECUTE: {
				Arduino_Utilities_Execute arduino_Utilities_Execute = (Arduino_Utilities_Execute)theEObject;
				T result = caseArduino_Utilities_Execute(arduino_Utilities_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_Utilities_Execute);
				if (result == null) result = caseSmallStep(arduino_Utilities_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_Utilities_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_Utilities_Execute);
				if (result == null) result = caseStep(arduino_Utilities_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE: {
				Arduino_VariableAssignment_Execute arduino_VariableAssignment_Execute = (Arduino_VariableAssignment_Execute)theEObject;
				T result = caseArduino_VariableAssignment_Execute(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseBigStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseStep(arduino_VariableAssignment_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE: {
				Arduino_If_Execute arduino_If_Execute = (Arduino_If_Execute)theEObject;
				T result = caseArduino_If_Execute(arduino_If_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseBigStep(arduino_If_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseStep(arduino_If_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_DELAY_EXECUTE: {
				Arduino_Delay_Execute arduino_Delay_Execute = (Arduino_Delay_Execute)theEObject;
				T result = caseArduino_Delay_Execute(arduino_Delay_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseSmallStep(arduino_Delay_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseStep(arduino_Delay_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_DECLARATION_EXECUTE: {
				Arduino_VariableDeclaration_Execute arduino_VariableDeclaration_Execute = (Arduino_VariableDeclaration_Execute)theEObject;
				T result = caseArduino_VariableDeclaration_Execute(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseSmallStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_REPEAT_EXECUTE: {
				Arduino_Repeat_Execute arduino_Repeat_Execute = (Arduino_Repeat_Execute)theEObject;
				T result = caseArduino_Repeat_Execute(arduino_Repeat_Execute);
				if (result == null) result = caseArduino_While_Execute_AbstractSubStep(arduino_Repeat_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_Repeat_Execute);
				if (result == null) result = caseBigStep(arduino_Repeat_Execute);
				if (result == null) result = caseArduino_Repeat_Execute_AbstractSubStep(arduino_Repeat_Execute);
				if (result == null) result = caseStep(arduino_Repeat_Execute);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_VariableAssignment_Execute_AbstractSubStep arduino_VariableAssignment_Execute_AbstractSubStep = (Arduino_VariableAssignment_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_VariableAssignment_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP: {
				Arduino_VariableAssignment_Execute_FillStep arduino_VariableAssignment_Execute_FillStep = (Arduino_VariableAssignment_Execute_FillStep)theEObject;
				T result = caseArduino_VariableAssignment_Execute_FillStep(arduino_VariableAssignment_Execute_FillStep);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_VariableAssignment_Execute_FillStep);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_CALL: {
				Arduino_ModuleAssignment_Call arduino_ModuleAssignment_Call = (Arduino_ModuleAssignment_Call)theEObject;
				T result = caseArduino_ModuleAssignment_Call(arduino_ModuleAssignment_Call);
				if (result == null) result = caseBigStep(arduino_ModuleAssignment_Call);
				if (result == null) result = caseStep(arduino_ModuleAssignment_Call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP: {
				Arduino_ModuleAssignment_Call_AbstractSubStep arduino_ModuleAssignment_Call_AbstractSubStep = (Arduino_ModuleAssignment_Call_AbstractSubStep)theEObject;
				T result = caseArduino_ModuleAssignment_Call_AbstractSubStep(arduino_ModuleAssignment_Call_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP: {
				Arduino_ModuleAssignment_Call_FillStep arduino_ModuleAssignment_Call_FillStep = (Arduino_ModuleAssignment_Call_FillStep)theEObject;
				T result = caseArduino_ModuleAssignment_Call_FillStep(arduino_ModuleAssignment_Call_FillStep);
				if (result == null) result = caseArduino_ModuleAssignment_Call_AbstractSubStep(arduino_ModuleAssignment_Call_FillStep);
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
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootFillStep(RootFillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Boolean Module Get Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Boolean Module Get Evaluate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_BooleanModuleGet_Evaluate(Arduino_BooleanModuleGet_Evaluate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Execute(Arduino_ModuleAssignment_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Execute_AbstractSubStep(Arduino_ModuleAssignment_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Execute_FillStep(Arduino_ModuleAssignment_Execute_FillStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Integer Constant Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Integer Constant Evaluate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_IntegerConstant_Evaluate(Arduino_IntegerConstant_Evaluate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Boolean Constant Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Boolean Constant Evaluate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_BooleanConstant_Evaluate(Arduino_BooleanConstant_Evaluate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Integer Module Get Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Integer Module Get Evaluate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_IntegerModuleGet_Evaluate(Arduino_IntegerModuleGet_Evaluate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableAssignment_Execute(Arduino_VariableAssignment_Execute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Declaration Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Declaration Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableDeclaration_Execute(Arduino_VariableDeclaration_Execute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableAssignment_Execute_AbstractSubStep(Arduino_VariableAssignment_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableAssignment_Execute_FillStep(Arduino_VariableAssignment_Execute_FillStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Call(Arduino_ModuleAssignment_Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Call Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Call Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Call_AbstractSubStep(Arduino_ModuleAssignment_Call_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Call Fill Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Call Fill Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Call_FillStep(Arduino_ModuleAssignment_Call_FillStep object) {
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

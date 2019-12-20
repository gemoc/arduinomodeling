/**
 */
package arduinoTrace.Steps.util;

import arduinoTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.executionframework.engine.mse.MSEOccurrence;

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
			case StepsPackage.ARDUINO_DELAY_EXECUTE: {
				Arduino_Delay_Execute arduino_Delay_Execute = (Arduino_Delay_Execute)theEObject;
				T result = caseArduino_Delay_Execute(arduino_Delay_Execute);
				if (result == null) result = caseArduino_Delay_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_Delay_Execute);
				if (result == null) result = caseBigStep(arduino_Delay_Execute);
				if (result == null) result = caseStep(arduino_Delay_Execute);
				if (result == null) result = caseMSEOccurrence(arduino_Delay_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_Delay_Execute_AbstractSubStep arduino_Delay_Execute_AbstractSubStep = (Arduino_Delay_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_Delay_Execute_AbstractSubStep(arduino_Delay_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP: {
				Arduino_Delay_Execute_ImplicitStep arduino_Delay_Execute_ImplicitStep = (Arduino_Delay_Execute_ImplicitStep)theEObject;
				T result = caseArduino_Delay_Execute_ImplicitStep(arduino_Delay_Execute_ImplicitStep);
				if (result == null) result = caseArduino_Delay_Execute_AbstractSubStep(arduino_Delay_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(arduino_Delay_Execute_ImplicitStep);
				if (result == null) result = caseStep(arduino_Delay_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(arduino_Delay_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE: {
				Arduino_If_Execute arduino_If_Execute = (Arduino_If_Execute)theEObject;
				T result = caseArduino_If_Execute(arduino_If_Execute);
				if (result == null) result = caseArduino_Delay_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_If_Execute);
				if (result == null) result = caseBigStep(arduino_If_Execute);
				if (result == null) result = caseStep(arduino_If_Execute);
				if (result == null) result = caseMSEOccurrence(arduino_If_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_If_Execute_AbstractSubStep arduino_If_Execute_AbstractSubStep = (Arduino_If_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_If_Execute_AbstractSubStep(arduino_If_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_IF_EXECUTE_IMPLICIT_STEP: {
				Arduino_If_Execute_ImplicitStep arduino_If_Execute_ImplicitStep = (Arduino_If_Execute_ImplicitStep)theEObject;
				T result = caseArduino_If_Execute_ImplicitStep(arduino_If_Execute_ImplicitStep);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_If_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(arduino_If_Execute_ImplicitStep);
				if (result == null) result = caseStep(arduino_If_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(arduino_If_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE: {
				Arduino_ModuleAssignment_Execute arduino_ModuleAssignment_Execute = (Arduino_ModuleAssignment_Execute)theEObject;
				T result = caseArduino_ModuleAssignment_Execute(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_Delay_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseBigStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseStep(arduino_ModuleAssignment_Execute);
				if (result == null) result = caseMSEOccurrence(arduino_ModuleAssignment_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_ModuleAssignment_Execute_AbstractSubStep arduino_ModuleAssignment_Execute_AbstractSubStep = (Arduino_ModuleAssignment_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP: {
				Arduino_ModuleAssignment_Execute_ImplicitStep arduino_ModuleAssignment_Execute_ImplicitStep = (Arduino_ModuleAssignment_Execute_ImplicitStep)theEObject;
				T result = caseArduino_ModuleAssignment_Execute_ImplicitStep(arduino_ModuleAssignment_Execute_ImplicitStep);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_ModuleAssignment_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(arduino_ModuleAssignment_Execute_ImplicitStep);
				if (result == null) result = caseStep(arduino_ModuleAssignment_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(arduino_ModuleAssignment_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_PROJECT_SETUP: {
				Arduino_Project_Setup arduino_Project_Setup = (Arduino_Project_Setup)theEObject;
				T result = caseArduino_Project_Setup(arduino_Project_Setup);
				if (result == null) result = caseSmallStep(arduino_Project_Setup);
				if (result == null) result = caseStep(arduino_Project_Setup);
				if (result == null) result = caseMSEOccurrence(arduino_Project_Setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE: {
				Arduino_VariableAssignment_Execute arduino_VariableAssignment_Execute = (Arduino_VariableAssignment_Execute)theEObject;
				T result = caseArduino_VariableAssignment_Execute(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_Delay_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseBigStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseStep(arduino_VariableAssignment_Execute);
				if (result == null) result = caseMSEOccurrence(arduino_VariableAssignment_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_VariableAssignment_Execute_AbstractSubStep arduino_VariableAssignment_Execute_AbstractSubStep = (Arduino_VariableAssignment_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_VariableAssignment_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP: {
				Arduino_VariableAssignment_Execute_ImplicitStep arduino_VariableAssignment_Execute_ImplicitStep = (Arduino_VariableAssignment_Execute_ImplicitStep)theEObject;
				T result = caseArduino_VariableAssignment_Execute_ImplicitStep(arduino_VariableAssignment_Execute_ImplicitStep);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_VariableAssignment_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(arduino_VariableAssignment_Execute_ImplicitStep);
				if (result == null) result = caseStep(arduino_VariableAssignment_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(arduino_VariableAssignment_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_DECLARATION_EXECUTE: {
				Arduino_VariableDeclaration_Execute arduino_VariableDeclaration_Execute = (Arduino_VariableDeclaration_Execute)theEObject;
				T result = caseArduino_VariableDeclaration_Execute(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_Delay_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_If_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_ModuleAssignment_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_VariableAssignment_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseBigStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseStep(arduino_VariableDeclaration_Execute);
				if (result == null) result = caseMSEOccurrence(arduino_VariableDeclaration_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP: {
				Arduino_VariableDeclaration_Execute_AbstractSubStep arduino_VariableDeclaration_Execute_AbstractSubStep = (Arduino_VariableDeclaration_Execute_AbstractSubStep)theEObject;
				T result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP: {
				Arduino_VariableDeclaration_Execute_ImplicitStep arduino_VariableDeclaration_Execute_ImplicitStep = (Arduino_VariableDeclaration_Execute_ImplicitStep)theEObject;
				T result = caseArduino_VariableDeclaration_Execute_ImplicitStep(arduino_VariableDeclaration_Execute_ImplicitStep);
				if (result == null) result = caseArduino_VariableDeclaration_Execute_AbstractSubStep(arduino_VariableDeclaration_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(arduino_VariableDeclaration_Execute_ImplicitStep);
				if (result == null) result = caseStep(arduino_VariableDeclaration_Execute_ImplicitStep);
				if (result == null) result = caseMSEOccurrence(arduino_VariableDeclaration_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.BIG_STEP: {
				BigStep bigStep = (BigStep)theEObject;
				T result = caseBigStep(bigStep);
				if (result == null) result = caseStep(bigStep);
				if (result == null) result = caseMSEOccurrence(bigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = caseMSEOccurrence(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SMALL_STEP: {
				SmallStep smallStep = (SmallStep)theEObject;
				T result = caseSmallStep(smallStep);
				if (result == null) result = caseStep(smallStep);
				if (result == null) result = caseMSEOccurrence(smallStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseMSEOccurrence(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Delay Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Delay Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Delay_Execute_AbstractSubStep(Arduino_Delay_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Delay Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Delay Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_Delay_Execute_ImplicitStep(Arduino_Delay_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino If Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino If Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_If_Execute_ImplicitStep(Arduino_If_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module Assignment Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_ModuleAssignment_Execute_ImplicitStep(Arduino_ModuleAssignment_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Assignment Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableAssignment_Execute_ImplicitStep(Arduino_VariableAssignment_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Declaration Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Declaration Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableDeclaration_Execute_AbstractSubStep(Arduino_VariableDeclaration_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Variable Declaration Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Variable Declaration Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino_VariableDeclaration_Execute_ImplicitStep(Arduino_VariableDeclaration_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSEOccurrence(MSEOccurrence object) {
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

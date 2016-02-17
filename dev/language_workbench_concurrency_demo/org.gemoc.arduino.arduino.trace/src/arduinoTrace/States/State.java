/**
 */
package arduinoTrace.States;

import arduinoTrace.Steps.Step;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.States.State#getBooleanVariable_value_Values <em>Boolean Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getIntegerVariable_value_Values <em>Integer Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getPin_level_Values <em>Pin level Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean Variable value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.BooleanVariable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.BooleanVariable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Variable value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Variable value Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_BooleanVariable_value_Values()
	 * @see arduinoTrace.States.BooleanVariable_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanVariable_value_Value> getBooleanVariable_value_Values();

	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_EndedSteps()
	 * @see arduinoTrace.Steps.Step#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<Step> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Integer Variable value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.IntegerVariable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.IntegerVariable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Variable value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Variable value Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_IntegerVariable_value_Values()
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<IntegerVariable_value_Value> getIntegerVariable_value_Values();

	/**
	 * Returns the value of the '<em><b>Pin level Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.Pin_level_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.Pin_level_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin level Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin level Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_Pin_level_Values()
	 * @see arduinoTrace.States.Pin_level_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Pin_level_Value> getPin_level_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Step}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_StartedSteps()
	 * @see arduinoTrace.Steps.Step#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<Step> getStartedSteps();

} // State

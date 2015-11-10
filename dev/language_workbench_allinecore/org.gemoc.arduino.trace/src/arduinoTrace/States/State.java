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
 *   <li>{@link arduinoTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getPin_level_Values <em>Pin level Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getVariable_value_Values <em>Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getNumberValue_value_Values <em>Number Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.State#getStringValue_value_Values <em>String Value value Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * Returns the value of the '<em><b>Variable value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.Variable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.Variable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable value Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_Variable_value_Values()
	 * @see arduinoTrace.States.Variable_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_value_Value> getVariable_value_Values();

	/**
	 * Returns the value of the '<em><b>Number Value value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.NumberValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.NumberValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Value value Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_NumberValue_value_Values()
	 * @see arduinoTrace.States.NumberValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<NumberValue_value_Value> getNumberValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value value Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_BooleanValue_value_Values()
	 * @see arduinoTrace.States.BooleanValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getBooleanValue_value_Values();

	/**
	 * Returns the value of the '<em><b>String Value value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.StringValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.StringValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value value Values</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getState_StringValue_value_Values()
	 * @see arduinoTrace.States.StringValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<StringValue_value_Value> getStringValue_value_Values();

} // State

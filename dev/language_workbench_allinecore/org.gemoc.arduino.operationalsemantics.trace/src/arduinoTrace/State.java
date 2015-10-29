/**
 */
package arduinoTrace;

import arduinoTrace.Steps.BigStep;
import arduinoTrace.Steps.SmallStep;

import arduinoTrace.Values.BooleanValue_value_Value;
import arduinoTrace.Values.NumberValue_value_Value;
import arduinoTrace.Values.Pin_level_Value;
import arduinoTrace.Values.StringValue_value_Value;
import arduinoTrace.Values.Variable_value_Value;

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
 *   <li>{@link arduinoTrace.State#getFollowingStep <em>Following Step</em>}</li>
 *   <li>{@link arduinoTrace.State#getStartedBigSteps <em>Started Big Steps</em>}</li>
 *   <li>{@link arduinoTrace.State#getEndedBigSteps <em>Ended Big Steps</em>}</li>
 *   <li>{@link arduinoTrace.State#getVariable_value_Values <em>Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.State#getPin_level_Values <em>Pin level Values</em>}</li>
 *   <li>{@link arduinoTrace.State#getNumberValue_value_Values <em>Number Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.State#getStringValue_value_Values <em>String Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.ArduinoTracePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Following Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Steps.SmallStep#getPrecedingState <em>Preceding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following Step</em>' reference.
	 * @see #setFollowingStep(SmallStep)
	 * @see arduinoTrace.ArduinoTracePackage#getState_FollowingStep()
	 * @see arduinoTrace.Steps.SmallStep#getPrecedingState
	 * @model opposite="precedingState"
	 * @generated
	 */
	SmallStep getFollowingStep();

	/**
	 * Sets the value of the '{@link arduinoTrace.State#getFollowingStep <em>Following Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following Step</em>' reference.
	 * @see #getFollowingStep()
	 * @generated
	 */
	void setFollowingStep(SmallStep value);

	/**
	 * Returns the value of the '<em><b>Started Big Steps</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.BigStep}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Steps.BigStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Big Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Big Steps</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_StartedBigSteps()
	 * @see arduinoTrace.Steps.BigStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<BigStep> getStartedBigSteps();

	/**
	 * Returns the value of the '<em><b>Ended Big Steps</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.BigStep}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Steps.BigStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Big Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Big Steps</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_EndedBigSteps()
	 * @see arduinoTrace.Steps.BigStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<BigStep> getEndedBigSteps();

	/**
	 * Returns the value of the '<em><b>Variable value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Values.Variable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.Variable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable value Values</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_Variable_value_Values()
	 * @see arduinoTrace.Values.Variable_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Variable_value_Value> getVariable_value_Values();

	/**
	 * Returns the value of the '<em><b>Pin level Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Values.Pin_level_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.Pin_level_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin level Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin level Values</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_Pin_level_Values()
	 * @see arduinoTrace.Values.Pin_level_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Pin_level_Value> getPin_level_Values();

	/**
	 * Returns the value of the '<em><b>Number Value value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Values.NumberValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.NumberValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Value value Values</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_NumberValue_value_Values()
	 * @see arduinoTrace.Values.NumberValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<NumberValue_value_Value> getNumberValue_value_Values();

	/**
	 * Returns the value of the '<em><b>String Value value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Values.StringValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.StringValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value value Values</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_StringValue_value_Values()
	 * @see arduinoTrace.Values.StringValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<StringValue_value_Value> getStringValue_value_Values();

	/**
	 * Returns the value of the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Values.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value value Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value value Values</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getState_BooleanValue_value_Values()
	 * @see arduinoTrace.Values.BooleanValue_value_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getBooleanValue_value_Values();

} // State

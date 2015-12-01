/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Step#getStartingState <em>Starting State</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Step#getEndingState <em>Ending State</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting State</em>' reference.
	 * @see #setStartingState(State)
	 * @see arduinoTrace.Steps.StepsPackage#getStep_StartingState()
	 * @see arduinoTrace.States.State#getStartedSteps
	 * @model opposite="startedSteps" required="true"
	 * @generated
	 */
	State getStartingState();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Step#getStartingState <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting State</em>' reference.
	 * @see #getStartingState()
	 * @generated
	 */
	void setStartingState(State value);

	/**
	 * Returns the value of the '<em><b>Ending State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending State</em>' reference.
	 * @see #setEndingState(State)
	 * @see arduinoTrace.Steps.StepsPackage#getStep_EndingState()
	 * @see arduinoTrace.States.State#getEndedSteps
	 * @model opposite="endedSteps"
	 * @generated
	 */
	State getEndingState();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Step#getEndingState <em>Ending State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending State</em>' reference.
	 * @see #getEndingState()
	 * @generated
	 */
	void setEndingState(State value);

} // Step

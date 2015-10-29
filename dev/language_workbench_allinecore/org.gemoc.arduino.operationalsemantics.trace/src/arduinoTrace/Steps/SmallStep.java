/**
 */
package arduinoTrace.Steps;

import arduinoTrace.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Small Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.SmallStep#getPrecedingState <em>Preceding State</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getSmallStep()
 * @model abstract="true"
 * @generated
 */
public interface SmallStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Preceding State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.State#getFollowingStep <em>Following Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding State</em>' reference.
	 * @see #setPrecedingState(State)
	 * @see arduinoTrace.Steps.StepsPackage#getSmallStep_PrecedingState()
	 * @see arduinoTrace.State#getFollowingStep
	 * @model opposite="followingStep" required="true"
	 * @generated
	 */
	State getPrecedingState();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.SmallStep#getPrecedingState <em>Preceding State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding State</em>' reference.
	 * @see #getPrecedingState()
	 * @generated
	 */
	void setPrecedingState(State value);

} // SmallStep

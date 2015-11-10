/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.FunctionCall;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Function Call Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute#getThis <em>This</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_FunctionCall_Execute()
 * @model
 * @generated
 */
public interface Arduino_FunctionCall_Execute extends Arduino_If_Execute_AbstractSubStep, Arduino_Repeat_Execute_AbstractSubStep, Arduino_Utilities_Call_AbstractSubStep, BigStep, Arduino_FunctionCall_Execute_AbstractSubStep, Arduino_While_Execute_AbstractSubStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(FunctionCall)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_FunctionCall_Execute_This()
	 * @model
	 * @generated
	 */
	FunctionCall getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(FunctionCall value);

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_FunctionCall_Execute_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_FunctionCall_Execute_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_FunctionCall_Execute_AbstractSubStep> getSubSteps();

} // Arduino_FunctionCall_Execute
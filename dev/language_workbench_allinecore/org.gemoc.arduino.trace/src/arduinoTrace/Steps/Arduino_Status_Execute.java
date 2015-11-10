/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.Status;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Status Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_Status_Execute#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Status_Execute()
 * @model
 * @generated
 */
public interface Arduino_Status_Execute extends Arduino_If_Execute_AbstractSubStep, SmallStep, Arduino_Status_Call_AbstractSubStep, Arduino_Repeat_Execute_AbstractSubStep, Arduino_Utilities_Call_AbstractSubStep, Arduino_FunctionCall_Execute_AbstractSubStep, Arduino_While_Execute_AbstractSubStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(Status)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Status_Execute_This()
	 * @model
	 * @generated
	 */
	Status getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_Status_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Status value);

} // Arduino_Status_Execute

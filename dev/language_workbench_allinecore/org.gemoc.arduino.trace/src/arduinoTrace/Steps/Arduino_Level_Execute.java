/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.Level;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Level Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_Level_Execute#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Level_Execute()
 * @model
 * @generated
 */
public interface Arduino_Level_Execute extends Arduino_If_Execute_AbstractSubStep, SmallStep, Arduino_Status_Call_AbstractSubStep, Arduino_Repeat_Execute_AbstractSubStep, Arduino_Utilities_Call_AbstractSubStep, Arduino_FunctionCall_Execute_AbstractSubStep, Arduino_While_Execute_AbstractSubStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(Level)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Level_Execute_This()
	 * @model
	 * @generated
	 */
	Level getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_Level_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Level value);

} // Arduino_Level_Execute

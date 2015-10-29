/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.Delay;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Delay Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_Delay_Execute#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Delay_Execute()
 * @model
 * @generated
 */
public interface Arduino_Delay_Execute extends SmallStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(Delay)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Delay_Execute_This()
	 * @model
	 * @generated
	 */
	Delay getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_Delay_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Delay value);

} // Arduino_Delay_Execute

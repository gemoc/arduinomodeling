/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.Utilities;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Utilities Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_Utilities_Execute#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Utilities_Execute()
 * @model
 * @generated
 */
public interface Arduino_Utilities_Execute extends SmallStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(Utilities)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Utilities_Execute_This()
	 * @model
	 * @generated
	 */
	Utilities getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_Utilities_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Utilities value);

} // Arduino_Utilities_Execute

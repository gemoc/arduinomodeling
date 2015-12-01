/**
 */
package arduinoTrace.Steps;

import org.gemoc.arduino.melange.arduinomt.arduino.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Variable Declaration Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_VariableDeclaration_Execute()
 * @model
 * @generated
 */
public interface Arduino_VariableDeclaration_Execute extends Arduino_While_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep, SmallStep, Arduino_Repeat_Execute_AbstractSubStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(VariableDeclaration)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_VariableDeclaration_Execute_This()
	 * @model
	 * @generated
	 */
	VariableDeclaration getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(VariableDeclaration value);

} // Arduino_VariableDeclaration_Execute

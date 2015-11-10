/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Project Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_Project_Setup#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Project_Setup()
 * @model
 * @generated
 */
public interface Arduino_Project_Setup extends SmallStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(Project)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Project_Setup_This()
	 * @model
	 * @generated
	 */
	Project getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_Project_Setup#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Project value);

} // Arduino_Project_Setup

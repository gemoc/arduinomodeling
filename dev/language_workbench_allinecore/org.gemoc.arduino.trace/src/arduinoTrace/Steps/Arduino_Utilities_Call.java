/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.Utilities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Utilities Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_Utilities_Call#getThis <em>This</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Arduino_Utilities_Call#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Utilities_Call()
 * @model
 * @generated
 */
public interface Arduino_Utilities_Call extends BigStep, Arduino_FunctionCall_Execute_AbstractSubStep {
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
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Utilities_Call_This()
	 * @model
	 * @generated
	 */
	Utilities getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_Utilities_Call#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(Utilities value);

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Call_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_Utilities_Call_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Utilities_Call_AbstractSubStep> getSubSteps();

} // Arduino_Utilities_Call

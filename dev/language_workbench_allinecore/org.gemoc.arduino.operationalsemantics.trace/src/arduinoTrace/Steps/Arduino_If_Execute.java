/**
 */
package arduinoTrace.Steps;

import fr.obeo.dsl.arduino.If;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino If Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_If_Execute#getThis <em>This</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Arduino_If_Execute#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_If_Execute()
 * @model
 * @generated
 */
public interface Arduino_If_Execute extends BigStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(If)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_If_Execute_This()
	 * @model
	 * @generated
	 */
	If getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_If_Execute#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(If value);

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_If_Execute_SubSteps()
	 * @model
	 * @generated
	 */
	EList<Arduino_If_Execute_AbstractSubStep> getSubSteps();

} // Arduino_If_Execute

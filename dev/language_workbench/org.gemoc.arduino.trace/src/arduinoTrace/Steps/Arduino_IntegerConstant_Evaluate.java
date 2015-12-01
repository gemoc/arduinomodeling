/**
 */
package arduinoTrace.Steps;

import org.gemoc.arduino.melange.arduinomt.arduino.IntegerConstant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Integer Constant Evaluate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_IntegerConstant_Evaluate()
 * @model
 * @generated
 */
public interface Arduino_IntegerConstant_Evaluate extends Arduino_ModuleAssignment_Execute_AbstractSubStep, Arduino_While_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep, Arduino_VariableAssignment_Execute_AbstractSubStep, SmallStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(IntegerConstant)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_IntegerConstant_Evaluate_This()
	 * @model
	 * @generated
	 */
	IntegerConstant getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(IntegerConstant value);

} // Arduino_IntegerConstant_Evaluate

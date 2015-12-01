/**
 */
package arduinoTrace.Steps;

import org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Boolean Module Get Evaluate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_BooleanModuleGet_Evaluate()
 * @model
 * @generated
 */
public interface Arduino_BooleanModuleGet_Evaluate extends SmallStep, Arduino_ModuleAssignment_Execute_AbstractSubStep, Arduino_While_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep, Arduino_VariableAssignment_Execute_AbstractSubStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(BooleanModuleGet)
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_BooleanModuleGet_Evaluate_This()
	 * @model
	 * @generated
	 */
	BooleanModuleGet getThis();

	/**
	 * Sets the value of the '{@link arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(BooleanModuleGet value);

} // Arduino_BooleanModuleGet_Evaluate

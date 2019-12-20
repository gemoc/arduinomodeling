/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getVariableRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.gemoc.arduino.xdsml.arduinomt.arduino.Object"
	 * @generated
	 */
	Object evaluate();

} // VariableRef

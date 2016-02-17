/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.IntegerVariable_value_Value;

import fr.obeo.dsl.arduino.IntegerVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject_IntegerVariable <em>Original Object Integer Variable</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedIntegerVariable#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedIntegerVariable()
 * @model
 * @generated
 */
public interface TracedIntegerVariable extends TracedIntegerExpression, TracedVariable {
	/**
	 * Returns the value of the '<em><b>Original Object Integer Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object Integer Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object Integer Variable</em>' reference.
	 * @see #setOriginalObject_IntegerVariable(IntegerVariable)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedIntegerVariable_OriginalObject_IntegerVariable()
	 * @model
	 * @generated
	 */
	IntegerVariable getOriginalObject_IntegerVariable();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject_IntegerVariable <em>Original Object Integer Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object Integer Variable</em>' reference.
	 * @see #getOriginalObject_IntegerVariable()
	 * @generated
	 */
	void setOriginalObject_IntegerVariable(IntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.IntegerVariable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.IntegerVariable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedIntegerVariable_ValueSequence()
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IntegerVariable_value_Value> getValueSequence();

} // TracedIntegerVariable

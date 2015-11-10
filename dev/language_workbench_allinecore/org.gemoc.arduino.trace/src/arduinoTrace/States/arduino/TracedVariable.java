/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.Variable_value_Value;

import fr.obeo.dsl.arduino.Value;
import fr.obeo.dsl.arduino.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedVariable#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedVariable#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedVariable#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedVariable()
 * @model
 * @generated
 */
public interface TracedVariable extends TracedExpression, TracedInstruction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedVariable_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedVariable#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Variable)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	Variable getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Variable value);

	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.Variable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.Variable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedVariable_ValueSequence()
	 * @see arduinoTrace.States.Variable_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_value_Value> getValueSequence();

} // TracedVariable

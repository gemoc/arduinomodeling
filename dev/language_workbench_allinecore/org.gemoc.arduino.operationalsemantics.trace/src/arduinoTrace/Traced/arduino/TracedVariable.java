/**
 */
package arduinoTrace.Traced.arduino;

import arduinoTrace.Values.Variable_value_Value;

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
 *   <li>{@link arduinoTrace.Traced.arduino.TracedVariable#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedVariable#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedVariable#getValueTrace <em>Value Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedVariable()
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
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedVariable_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link arduinoTrace.Traced.arduino.TracedVariable#getValue <em>Value</em>}' reference.
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
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedVariable_OriginalObject()
	 * @model
	 * @generated
	 */
	Variable getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.Traced.arduino.TracedVariable#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Variable value);

	/**
	 * Returns the value of the '<em><b>Value Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Values.Variable_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.Variable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Trace</em>' containment reference list.
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedVariable_ValueTrace()
	 * @see arduinoTrace.Values.Variable_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Variable_value_Value> getValueTrace();

} // TracedVariable

/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.BooleanValue_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedBooleanValue#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBooleanValue()
 * @model
 * @generated
 */
public interface TracedBooleanValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sequence</em>' containment reference list.
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBooleanValue_ValueSequence()
	 * @see arduinoTrace.States.BooleanValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getValueSequence();

} // TracedBooleanValue

/**
 */
package arduinoTrace.Traced.arduino;

import arduinoTrace.Values.BooleanValue_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedBooleanValue#getValueTrace <em>Value Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedBooleanValue()
 * @model
 * @generated
 */
public interface TracedBooleanValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Value Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Values.BooleanValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.BooleanValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Trace</em>' containment reference list.
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedBooleanValue_ValueTrace()
	 * @see arduinoTrace.Values.BooleanValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanValue_value_Value> getValueTrace();

} // TracedBooleanValue

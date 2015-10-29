/**
 */
package arduinoTrace.Traced.arduino;

import arduinoTrace.Values.NumberValue_value_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedNumberValue#getValueTrace <em>Value Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedNumberValue()
 * @model
 * @generated
 */
public interface TracedNumberValue extends TracedValue {
	/**
	 * Returns the value of the '<em><b>Value Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Values.NumberValue_value_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.NumberValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Trace</em>' containment reference list.
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedNumberValue_ValueTrace()
	 * @see arduinoTrace.Values.NumberValue_value_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<NumberValue_value_Value> getValueTrace();

} // TracedNumberValue

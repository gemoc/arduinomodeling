/**
 */
package arduinoTrace.Traced.arduino;

import arduinoTrace.Values.Pin_level_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedPin#getLevelTrace <em>Level Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedPin()
 * @model abstract="true"
 * @generated
 */
public interface TracedPin extends EObject {
	/**
	 * Returns the value of the '<em><b>Level Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Values.Pin_level_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Values.Pin_level_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Trace</em>' containment reference list.
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedPin_LevelTrace()
	 * @see arduinoTrace.Values.Pin_level_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Pin_level_Value> getLevelTrace();

} // TracedPin

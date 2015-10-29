/**
 */
package arduinoTrace.Traced;

import arduinoTrace.Traced.arduino.TracedAnalogPin;
import arduinoTrace.Traced.arduino.TracedBooleanValue;
import arduinoTrace.Traced.arduino.TracedDigitalPin;
import arduinoTrace.Traced.arduino.TracedNumberValue;
import arduinoTrace.Traced.arduino.TracedStringValue;
import arduinoTrace.Traced.arduino.TracedVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedVariables <em>Arduino traced Variables</em>}</li>
 *   <li>{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedNumberValues <em>Arduino traced Number Values</em>}</li>
 *   <li>{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedStringValues <em>Arduino traced String Values</em>}</li>
 *   <li>{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedBooleanValues <em>Arduino traced Boolean Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects()
 * @model
 * @generated
 */
public interface TracedObjects extends EObject {
	/**
	 * Returns the value of the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Traced.arduino.TracedDigitalPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Digital Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Digital Pins</em>' containment reference list.
	 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects_Arduino_tracedDigitalPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDigitalPin> getArduino_tracedDigitalPins();

	/**
	 * Returns the value of the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Traced.arduino.TracedAnalogPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Analog Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Analog Pins</em>' containment reference list.
	 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects_Arduino_tracedAnalogPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedAnalogPin> getArduino_tracedAnalogPins();

	/**
	 * Returns the value of the '<em><b>Arduino traced Variables</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Traced.arduino.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Variables</em>' containment reference list.
	 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects_Arduino_tracedVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedVariable> getArduino_tracedVariables();

	/**
	 * Returns the value of the '<em><b>Arduino traced Number Values</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Traced.arduino.TracedNumberValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Number Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Number Values</em>' containment reference list.
	 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects_Arduino_tracedNumberValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedNumberValue> getArduino_tracedNumberValues();

	/**
	 * Returns the value of the '<em><b>Arduino traced String Values</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Traced.arduino.TracedStringValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced String Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced String Values</em>' containment reference list.
	 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects_Arduino_tracedStringValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedStringValue> getArduino_tracedStringValues();

	/**
	 * Returns the value of the '<em><b>Arduino traced Boolean Values</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Traced.arduino.TracedBooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Boolean Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Boolean Values</em>' containment reference list.
	 * @see arduinoTrace.Traced.TracedPackage#getTracedObjects_Arduino_tracedBooleanValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanValue> getArduino_tracedBooleanValues();

} // TracedObjects

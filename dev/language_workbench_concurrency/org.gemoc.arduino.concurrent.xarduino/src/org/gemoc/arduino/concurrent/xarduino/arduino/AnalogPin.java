/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.AnalogPin#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getAnalogPin()
 * @model
 * @generated
 */
public interface AnalogPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(ArduinoAnalogModule)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getAnalogPin_Module()
	 * @model containment="true"
	 * @generated
	 */
	ArduinoAnalogModule getModule();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.AnalogPin#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ArduinoAnalogModule value);

} // AnalogPin

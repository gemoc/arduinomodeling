/**
 */
package org.gemoc.arduino.sequential.model.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.model.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.sequential.model.arduino.ArduinoPackage#getBluetoothTransceiver()
 * @model
 * @generated
 */
public interface BluetoothTransceiver extends ArduinoCommunicationModule {
	/**
	 * Returns the value of the '<em><b>Connected Transceiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Transceiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Transceiver</em>' reference.
	 * @see #setConnectedTransceiver(BluetoothTransceiver)
	 * @see org.gemoc.arduino.sequential.model.arduino.ArduinoPackage#getBluetoothTransceiver_ConnectedTransceiver()
	 * @model
	 * @generated
	 */
	BluetoothTransceiver getConnectedTransceiver();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.model.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Transceiver</em>' reference.
	 * @see #getConnectedTransceiver()
	 * @generated
	 */
	void setConnectedTransceiver(BluetoothTransceiver value);

} // BluetoothTransceiver

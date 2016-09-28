/**
 */
package org.gemoc.arduino.concurrent.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.arduino.ArduinoPackage#getBluetoothTransceiver()
 * @model
 * @generated
 */
public interface BluetoothTransceiver extends ArduinoCommunicationModule {
	/**
	 * Returns the value of the '<em><b>Connected Transceiver</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.arduino.concurrent.arduino.BluetoothTransceiver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Transceiver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Transceiver</em>' reference list.
	 * @see org.gemoc.arduino.concurrent.arduino.ArduinoPackage#getBluetoothTransceiver_ConnectedTransceiver()
	 * @model
	 * @generated
	 */
	EList<BluetoothTransceiver> getConnectedTransceiver();

} // BluetoothTransceiver

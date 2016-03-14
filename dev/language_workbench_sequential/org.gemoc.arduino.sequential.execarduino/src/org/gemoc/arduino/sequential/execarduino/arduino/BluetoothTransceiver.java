/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getDataToSend <em>Data To Send</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getDataReceived <em>Data Received</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getBluetoothTransceiver()
 * @model
 * @generated
 */
public interface BluetoothTransceiver extends ArduinoAnalogModule {
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
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getBluetoothTransceiver_ConnectedTransceiver()
	 * @model
	 * @generated
	 */
	BluetoothTransceiver getConnectedTransceiver();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Transceiver</em>' reference.
	 * @see #getConnectedTransceiver()
	 * @generated
	 */
	void setConnectedTransceiver(BluetoothTransceiver value);

	/**
	 * Returns the value of the '<em><b>Data To Send</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data To Send</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Send</em>' attribute list.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getBluetoothTransceiver_DataToSend()
	 * @model
	 * @generated
	 */
	EList<Integer> getDataToSend();

	/**
	 * Returns the value of the '<em><b>Data Received</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Received</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Received</em>' attribute list.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getBluetoothTransceiver_DataReceived()
	 * @model
	 * @generated
	 */
	EList<Integer> getDataReceived();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void push();

} // BluetoothTransceiver

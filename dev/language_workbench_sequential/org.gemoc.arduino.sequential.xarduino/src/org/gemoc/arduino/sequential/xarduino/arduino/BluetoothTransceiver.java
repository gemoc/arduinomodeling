/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino;

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
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver#getDataToSend <em>Data To Send</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver#getDataReceived <em>Data Received</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getBluetoothTransceiver()
 * @model
 * @generated
 */
public interface BluetoothTransceiver extends ArduinoAnalogModule {
	/**
	 * Returns the value of the '<em><b>Connected Transceiver</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Transceiver</em>' reference list.
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getBluetoothTransceiver_ConnectedTransceiver()
	 * @model
	 * @generated
	 */
	EList<BluetoothTransceiver> getConnectedTransceiver();

	/**
	 * Returns the value of the '<em><b>Data To Send</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Send</em>' attribute list.
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getBluetoothTransceiver_DataToSend()
	 * @model unique="false"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<Integer> getDataToSend();

	/**
	 * Returns the value of the '<em><b>Data Received</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Received</em>' attribute list.
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getBluetoothTransceiver_DataReceived()
	 * @model unique="false"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<Integer> getDataReceived();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void push();

} // BluetoothTransceiver

/**
 */
package org.gemoc.arduino.sequential.model.arduino.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.gemoc.arduino.sequential.model.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.model.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.model.arduino.impl.BluetoothTransceiverImpl#getDataToSend <em>Data To Send</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.model.arduino.impl.BluetoothTransceiverImpl#getDataReceived <em>Data Received</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.model.arduino.impl.BluetoothTransceiverImpl#getConnectedTransceiver <em>Connected Transceiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BluetoothTransceiverImpl extends ArduinoCommunicationModuleImpl implements BluetoothTransceiver {
	/**
	 * The cached value of the '{@link #getDataToSend() <em>Data To Send</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataToSend()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dataToSend;

	/**
	 * The cached value of the '{@link #getDataReceived() <em>Data Received</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReceived()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dataReceived;

	/**
	 * The cached value of the '{@link #getConnectedTransceiver() <em>Connected Transceiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTransceiver()
	 * @generated
	 * @ordered
	 */
	protected BluetoothTransceiver connectedTransceiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothTransceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.BLUETOOTH_TRANSCEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDataToSend() {
		if (dataToSend == null) {
			dataToSend = new EDataTypeUniqueEList<Integer>(Integer.class, this, ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND);
		}
		return dataToSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDataReceived() {
		if (dataReceived == null) {
			dataReceived = new EDataTypeUniqueEList<Integer>(Integer.class, this, ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED);
		}
		return dataReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver getConnectedTransceiver() {
		if (connectedTransceiver != null && connectedTransceiver.eIsProxy()) {
			InternalEObject oldConnectedTransceiver = (InternalEObject)connectedTransceiver;
			connectedTransceiver = (BluetoothTransceiver)eResolveProxy(oldConnectedTransceiver);
			if (connectedTransceiver != oldConnectedTransceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER, oldConnectedTransceiver, connectedTransceiver));
			}
		}
		return connectedTransceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiver basicGetConnectedTransceiver() {
		return connectedTransceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedTransceiver(BluetoothTransceiver newConnectedTransceiver) {
		BluetoothTransceiver oldConnectedTransceiver = connectedTransceiver;
		connectedTransceiver = newConnectedTransceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER, oldConnectedTransceiver, connectedTransceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				return getDataToSend();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				return getDataReceived();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				if (resolve) return getConnectedTransceiver();
				return basicGetConnectedTransceiver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				getDataToSend().clear();
				getDataToSend().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				getDataReceived().clear();
				getDataReceived().addAll((Collection<? extends Integer>)newValue);
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				setConnectedTransceiver((BluetoothTransceiver)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				getDataToSend().clear();
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				getDataReceived().clear();
				return;
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				setConnectedTransceiver((BluetoothTransceiver)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_TO_SEND:
				return dataToSend != null && !dataToSend.isEmpty();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__DATA_RECEIVED:
				return dataReceived != null && !dataReceived.isEmpty();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER:
				return connectedTransceiver != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataToSend: ");
		result.append(dataToSend);
		result.append(", dataReceived: ");
		result.append(dataReceived);
		result.append(')');
		return result.toString();
	}

} //BluetoothTransceiverImpl

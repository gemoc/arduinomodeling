/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BluetoothTransceiverTest extends ArduinoCommunicationModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BluetoothTransceiverTest.class);
	}

	/**
	 * Constructs a new Bluetooth Transceiver test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothTransceiverTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bluetooth Transceiver test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BluetoothTransceiver getFixture() {
		return (BluetoothTransceiver)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createBluetoothTransceiver());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BluetoothTransceiverTest

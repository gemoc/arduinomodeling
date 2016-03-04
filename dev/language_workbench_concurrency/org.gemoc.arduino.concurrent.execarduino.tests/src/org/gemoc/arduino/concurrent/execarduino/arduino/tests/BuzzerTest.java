/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.Buzzer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Buzzer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuzzerTest extends ArduinoDigitalModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BuzzerTest.class);
	}

	/**
	 * Constructs a new Buzzer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Buzzer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Buzzer getFixture() {
		return (Buzzer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createBuzzer());
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

} //BuzzerTest

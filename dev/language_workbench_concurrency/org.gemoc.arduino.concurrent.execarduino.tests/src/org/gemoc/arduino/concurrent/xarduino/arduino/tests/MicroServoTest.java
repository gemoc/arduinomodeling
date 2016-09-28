/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino.tests;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Micro Servo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroServoTest extends ArduinoDigitalModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MicroServoTest.class);
	}

	/**
	 * Constructs a new Micro Servo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroServoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Micro Servo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.gemoc.arduino.concurrent.xarduino.arduino.MicroServo getFixture() {
		return (org.gemoc.arduino.concurrent.xarduino.arduino.MicroServo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoFactory.eINSTANCE.createMicroServo());
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

} //MicroServoTest

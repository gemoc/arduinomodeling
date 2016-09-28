/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino.tests;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoBoardTest extends BoardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArduinoBoardTest.class);
	}

	/**
	 * Constructs a new Board test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoBoardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Board test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoBoard getFixture() {
		return (org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoBoard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoFactory.eINSTANCE.createArduinoBoard());
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

} //ArduinoBoardTest

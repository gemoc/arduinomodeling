/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.PushButton;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Push Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.execarduino.arduino.PushButton#toggle() <em>Toggle</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PushButtonTest extends ArduinoDigitalModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PushButtonTest.class);
	}

	/**
	 * Constructs a new Push Button test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButtonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Push Button test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PushButton getFixture() {
		return (PushButton)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createPushButton());
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

	/**
	 * Tests the '{@link org.gemoc.arduino.concurrent.execarduino.arduino.PushButton#toggle() <em>Toggle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.concurrent.execarduino.arduino.PushButton#toggle()
	 * @generated
	 */
	public void testToggle() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PushButtonTest

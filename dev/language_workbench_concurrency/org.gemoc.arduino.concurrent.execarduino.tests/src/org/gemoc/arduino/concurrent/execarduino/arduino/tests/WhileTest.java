/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.While;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileTest extends ControlTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhileTest.class);
	}

	/**
	 * Constructs a new While test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this While test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected While getFixture() {
		return (While)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createWhile());
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

} //WhileTest

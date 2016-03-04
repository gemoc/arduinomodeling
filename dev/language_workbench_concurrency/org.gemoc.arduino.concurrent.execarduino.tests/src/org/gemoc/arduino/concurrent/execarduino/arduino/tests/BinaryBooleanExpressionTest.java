/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.BinaryBooleanExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryBooleanExpressionTest extends BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryBooleanExpressionTest.class);
	}

	/**
	 * Constructs a new Binary Boolean Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Boolean Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryBooleanExpression getFixture() {
		return (BinaryBooleanExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createBinaryBooleanExpression());
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

} //BinaryBooleanExpressionTest

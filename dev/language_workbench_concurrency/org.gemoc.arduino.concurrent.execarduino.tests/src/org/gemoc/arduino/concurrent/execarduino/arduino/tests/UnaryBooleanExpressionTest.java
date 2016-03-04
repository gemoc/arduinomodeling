/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.concurrent.execarduino.arduino.UnaryBooleanExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unary Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryBooleanExpressionTest extends UnaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnaryBooleanExpressionTest.class);
	}

	/**
	 * Constructs a new Unary Boolean Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unary Boolean Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnaryBooleanExpression getFixture() {
		return (UnaryBooleanExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createUnaryBooleanExpression());
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

} //UnaryBooleanExpressionTest

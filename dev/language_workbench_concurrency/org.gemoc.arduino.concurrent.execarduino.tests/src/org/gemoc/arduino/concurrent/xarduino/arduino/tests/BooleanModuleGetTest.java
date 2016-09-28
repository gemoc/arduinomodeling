/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino.tests;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Module Get</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanModuleGetTest extends ModuleGetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanModuleGetTest.class);
	}

	/**
	 * Constructs a new Boolean Module Get test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanModuleGetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Module Get test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet getFixture() {
		return (org.gemoc.arduino.concurrent.xarduino.arduino.BooleanModuleGet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoFactory.eINSTANCE.createBooleanModuleGet());
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

} //BooleanModuleGetTest

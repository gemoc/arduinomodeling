/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ExecArduino</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecArduinoAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ExecArduinoAllTests("ExecArduino Tests");
		suite.addTest(ArduinoTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecArduinoAllTests(String name) {
		super(name);
	}

} //ExecArduinoAllTests

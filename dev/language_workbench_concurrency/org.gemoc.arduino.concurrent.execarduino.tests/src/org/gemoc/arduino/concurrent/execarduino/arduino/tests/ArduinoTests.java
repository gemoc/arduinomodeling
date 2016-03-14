/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>arduino</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoTests extends TestSuite {

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
		TestSuite suite = new ArduinoTests("arduino Tests");
		suite.addTestSuite(ProjectTest.class);
		suite.addTestSuite(ModuleAssignmentTest.class);
		suite.addTestSuite(DelayTest.class);
		suite.addTestSuite(RepeatTest.class);
		suite.addTestSuite(WhileTest.class);
		suite.addTestSuite(VariableAssignmentTest.class);
		suite.addTestSuite(IfTest.class);
		suite.addTestSuite(BooleanModuleGetTest.class);
		suite.addTestSuite(IntegerModuleGetTest.class);
		suite.addTestSuite(VariableDeclarationTest.class);
		suite.addTestSuite(PushButtonTest.class);
		suite.addTestSuite(BlockTest.class);
		suite.addTestSuite(BluetoothTransceiverTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoTests(String name) {
		super(name);
	}

} //ArduinoTests

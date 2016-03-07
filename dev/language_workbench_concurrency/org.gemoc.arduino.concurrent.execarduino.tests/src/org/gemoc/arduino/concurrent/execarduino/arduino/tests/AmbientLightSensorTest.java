/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.tests;

import junit.textui.TestRunner;

import org.gemoc.arduino.concurrent.execarduino.arduino.AmbientLightSensor;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ambient Light Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmbientLightSensorTest extends ArduinoAnalogModuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AmbientLightSensorTest.class);
	}

	/**
	 * Constructs a new Ambient Light Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbientLightSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ambient Light Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AmbientLightSensor getFixture() {
		return (AmbientLightSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArduinoFactory.eINSTANCE.createAmbientLightSensor());
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

} //AmbientLightSensorTest

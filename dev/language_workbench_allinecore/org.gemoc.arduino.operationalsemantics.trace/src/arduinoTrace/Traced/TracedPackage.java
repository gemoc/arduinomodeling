/**
 */
package arduinoTrace.Traced;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arduinoTrace.Traced.TracedFactory
 * @model kind="package"
 * @generated
 */
public interface TracedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Traced";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_Traced";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracedPackage eINSTANCE = arduinoTrace.Traced.impl.TracedPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.impl.TracedObjectsImpl <em>Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.impl.TracedObjectsImpl
	 * @see arduinoTrace.Traced.impl.TracedPackageImpl#getTracedObjects()
	 * @generated
	 */
	int TRACED_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS = 0;

	/**
	 * The feature id for the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS = 1;

	/**
	 * The feature id for the '<em><b>Arduino traced Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Arduino traced Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Arduino traced String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Arduino traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES = 5;

	/**
	 * The number of structural features of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.TracedObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objects</em>'.
	 * @see arduinoTrace.Traced.TracedObjects
	 * @generated
	 */
	EClass getTracedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Digital Pins</em>'.
	 * @see arduinoTrace.Traced.TracedObjects#getArduino_tracedDigitalPins()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Arduino_tracedDigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Analog Pins</em>'.
	 * @see arduinoTrace.Traced.TracedObjects#getArduino_tracedAnalogPins()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Arduino_tracedAnalogPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedVariables <em>Arduino traced Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Variables</em>'.
	 * @see arduinoTrace.Traced.TracedObjects#getArduino_tracedVariables()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Arduino_tracedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedNumberValues <em>Arduino traced Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Number Values</em>'.
	 * @see arduinoTrace.Traced.TracedObjects#getArduino_tracedNumberValues()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Arduino_tracedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedStringValues <em>Arduino traced String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced String Values</em>'.
	 * @see arduinoTrace.Traced.TracedObjects#getArduino_tracedStringValues()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Arduino_tracedStringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.TracedObjects#getArduino_tracedBooleanValues <em>Arduino traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Boolean Values</em>'.
	 * @see arduinoTrace.Traced.TracedObjects#getArduino_tracedBooleanValues()
	 * @see #getTracedObjects()
	 * @generated
	 */
	EReference getTracedObjects_Arduino_tracedBooleanValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracedFactory getTracedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.impl.TracedObjectsImpl <em>Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.impl.TracedObjectsImpl
		 * @see arduinoTrace.Traced.impl.TracedPackageImpl#getTracedObjects()
		 * @generated
		 */
		EClass TRACED_OBJECTS = eINSTANCE.getTracedObjects();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS = eINSTANCE.getTracedObjects_Arduino_tracedDigitalPins();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS = eINSTANCE.getTracedObjects_Arduino_tracedAnalogPins();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES = eINSTANCE.getTracedObjects_Arduino_tracedVariables();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES = eINSTANCE.getTracedObjects_Arduino_tracedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Arduino traced String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES = eINSTANCE.getTracedObjects_Arduino_tracedStringValues();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES = eINSTANCE.getTracedObjects_Arduino_tracedBooleanValues();

	}

} //TracedPackage

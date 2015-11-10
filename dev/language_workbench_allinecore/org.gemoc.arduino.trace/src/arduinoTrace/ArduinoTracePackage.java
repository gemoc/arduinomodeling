/**
 */
package arduinoTrace;

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
 * @see arduinoTrace.ArduinoTraceFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoTracePackage eINSTANCE = arduinoTrace.impl.ArduinoTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.impl.TraceImpl
	 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATES_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ROOT_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Arduino traced Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_TRACED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Arduino traced Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_TRACED_NUMBER_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Arduino traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_TRACED_BOOLEAN_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Arduino traced String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_TRACED_STRING_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_TRACED_DIGITAL_PINS = 6;

	/**
	 * The feature id for the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_TRACED_ANALOG_PINS = 7;

	/**
	 * The feature id for the '<em><b>Arduino If Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_IF_EXECUTE_SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Arduino Level Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Arduino Status Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE = 10;

	/**
	 * The feature id for the '<em><b>Arduino Set Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_SET_EXECUTE_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Arduino Utilities Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE = 12;

	/**
	 * The feature id for the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE = 13;

	/**
	 * The feature id for the '<em><b>Arduino Status Call Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_STATUS_CALL_SEQUENCE = 14;

	/**
	 * The feature id for the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>Arduino Project Setup Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE = 16;

	/**
	 * The feature id for the '<em><b>Arduino Utilities Call Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE = 17;

	/**
	 * The feature id for the '<em><b>Arduino Function Call Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE = 18;

	/**
	 * The feature id for the '<em><b>Arduino While Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE = 19;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see arduinoTrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see arduinoTrace.Trace#getStatesTrace()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_StatesTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see arduinoTrace.Trace#getRootSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getArduino_tracedVariables <em>Arduino traced Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Variables</em>'.
	 * @see arduinoTrace.Trace#getArduino_tracedVariables()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_tracedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getArduino_tracedNumberValues <em>Arduino traced Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Number Values</em>'.
	 * @see arduinoTrace.Trace#getArduino_tracedNumberValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_tracedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getArduino_tracedBooleanValues <em>Arduino traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Boolean Values</em>'.
	 * @see arduinoTrace.Trace#getArduino_tracedBooleanValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getArduino_tracedStringValues <em>Arduino traced String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced String Values</em>'.
	 * @see arduinoTrace.Trace#getArduino_tracedStringValues()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_tracedStringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Digital Pins</em>'.
	 * @see arduinoTrace.Trace#getArduino_tracedDigitalPins()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_tracedDigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Trace#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Analog Pins</em>'.
	 * @see arduinoTrace.Trace#getArduino_tracedAnalogPins()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_tracedAnalogPins();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino If Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_If_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_If_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Level_Execute_Sequence <em>Arduino Level Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Level Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Level_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Level_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Status_Execute_Sequence <em>Arduino Status Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Status Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Status_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Status_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Set_Execute_Sequence <em>Arduino Set Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Set Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Set_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Set_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Utilities Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Utilities_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Utilities_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Delay Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Delay_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Delay_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Status_Call_Sequence <em>Arduino Status Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Status Call Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Status_Call_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Status_Call_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Repeat Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Repeat_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Repeat_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Project Setup Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Project_Setup_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Project_Setup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_Utilities_Call_Sequence <em>Arduino Utilities Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Utilities Call Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_Utilities_Call_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_Utilities_Call_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_FunctionCall_Execute_Sequence <em>Arduino Function Call Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Function Call Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_FunctionCall_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_FunctionCall_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.Trace#getArduino_While_Execute_Sequence <em>Arduino While Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino While Execute Sequence</em>'.
	 * @see arduinoTrace.Trace#getArduino_While_Execute_Sequence()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Arduino_While_Execute_Sequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoTraceFactory getArduinoTraceFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.impl.TraceImpl
		 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STATES_TRACE = eINSTANCE.getTrace_StatesTrace();

		/**
		 * The meta object literal for the '<em><b>Root Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ROOT_STEPS = eINSTANCE.getTrace_RootSteps();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_TRACED_VARIABLES = eINSTANCE.getTrace_Arduino_tracedVariables();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_TRACED_NUMBER_VALUES = eINSTANCE.getTrace_Arduino_tracedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_TRACED_BOOLEAN_VALUES = eINSTANCE.getTrace_Arduino_tracedBooleanValues();

		/**
		 * The meta object literal for the '<em><b>Arduino traced String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_TRACED_STRING_VALUES = eINSTANCE.getTrace_Arduino_tracedStringValues();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_TRACED_DIGITAL_PINS = eINSTANCE.getTrace_Arduino_tracedDigitalPins();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_TRACED_ANALOG_PINS = eINSTANCE.getTrace_Arduino_tracedAnalogPins();

		/**
		 * The meta object literal for the '<em><b>Arduino If Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_IF_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_If_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Level Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_LEVEL_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_Level_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Status Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_STATUS_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_Status_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Set Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_SET_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_Set_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Utilities Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_UTILITIES_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_Utilities_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_Delay_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Status Call Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_STATUS_CALL_SEQUENCE = eINSTANCE.getTrace_Arduino_Status_Call_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_Repeat_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Project Setup Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE = eINSTANCE.getTrace_Arduino_Project_Setup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Utilities Call Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_UTILITIES_CALL_SEQUENCE = eINSTANCE.getTrace_Arduino_Utilities_Call_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Function Call Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_FUNCTION_CALL_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_FunctionCall_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino While Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARDUINO_WHILE_EXECUTE_SEQUENCE = eINSTANCE.getTrace_Arduino_While_Execute_Sequence();

	}

} //ArduinoTracePackage

/**
 */
package arduinoTrace.Traced.arduino;

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
 * @see arduinoTrace.Traced.arduino.ArduinoFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_arduino";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedPinImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedPin()
	 * @generated
	 */
	int TRACED_PIN = 5;

	/**
	 * The feature id for the '<em><b>Level Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN__LEVEL_TRACE = 0;

	/**
	 * The number of structural features of the '<em>Traced Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedDigitalPinImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
	 * @generated
	 */
	int TRACED_DIGITAL_PIN = 0;

	/**
	 * The feature id for the '<em><b>Level Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__LEVEL_TRACE = TRACED_PIN__LEVEL_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_OPERATION_COUNT = TRACED_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedAnalogPinImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
	 * @generated
	 */
	int TRACED_ANALOG_PIN = 1;

	/**
	 * The feature id for the '<em><b>Level Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__LEVEL_TRACE = TRACED_PIN__LEVEL_TRACE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_OPERATION_COUNT = TRACED_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedParameterImpl <em>Traced Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedParameterImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedParameter()
	 * @generated
	 */
	int TRACED_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER__DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Traced Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traced Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedInstructionImpl <em>Traced Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedInstructionImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedInstruction()
	 * @generated
	 */
	int TRACED_INSTRUCTION = 8;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTRUCTION__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTRUCTION__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Traced Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traced Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedExpressionImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedExpression()
	 * @generated
	 */
	int TRACED_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION__PREVIOUS = TRACED_INSTRUCTION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION__NEXT = TRACED_INSTRUCTION__NEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION__DEFINITION = TRACED_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_FEATURE_COUNT = TRACED_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_OPERATION_COUNT = TRACED_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedVariableImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__PREVIOUS = TRACED_EXPRESSION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__NEXT = TRACED_EXPRESSION__NEXT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__DEFINITION = TRACED_EXPRESSION__DEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__VALUE = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__ORIGINAL_OBJECT = TRACED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE__VALUE_TRACE = TRACED_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_OPERATION_COUNT = TRACED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedValueImpl <em>Traced Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedValueImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedValue()
	 * @generated
	 */
	int TRACED_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedNumberValueImpl <em>Traced Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedNumberValueImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedNumberValue()
	 * @generated
	 */
	int TRACED_NUMBER_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NUMBER_VALUE__VALUE_TRACE = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NUMBER_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NUMBER_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedStringValueImpl <em>Traced String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedStringValueImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedStringValue()
	 * @generated
	 */
	int TRACED_STRING_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_VALUE__VALUE_TRACE = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STRING_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Traced.arduino.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Traced.arduino.impl.TracedBooleanValueImpl
	 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedBooleanValue()
	 * @generated
	 */
	int TRACED_BOOLEAN_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE__VALUE_TRACE = TRACED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_FEATURE_COUNT = TRACED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VALUE_OPERATION_COUNT = TRACED_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedDigitalPin <em>Traced Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Digital Pin</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedDigitalPin
	 * @generated
	 */
	EClass getTracedDigitalPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedDigitalPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedDigitalPin#getOriginalObject()
	 * @see #getTracedDigitalPin()
	 * @generated
	 */
	EReference getTracedDigitalPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedAnalogPin <em>Traced Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Analog Pin</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedAnalogPin
	 * @generated
	 */
	EClass getTracedAnalogPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedAnalogPin#getOriginalObject()
	 * @see #getTracedAnalogPin()
	 * @generated
	 */
	EReference getTracedAnalogPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedParameter <em>Traced Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Parameter</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedParameter
	 * @generated
	 */
	EClass getTracedParameter();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedParameter#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedParameter#getDefinition()
	 * @see #getTracedParameter()
	 * @generated
	 */
	EReference getTracedParameter_Definition();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedVariable#getValue()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_Value();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedVariable#getOriginalObject()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.arduino.TracedVariable#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedVariable#getValueTrace()
	 * @see #getTracedVariable()
	 * @generated
	 */
	EReference getTracedVariable_ValueTrace();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Value</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedValue
	 * @generated
	 */
	EClass getTracedValue();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedPin <em>Traced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedPin
	 * @generated
	 */
	EClass getTracedPin();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.arduino.TracedPin#getLevelTrace <em>Level Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Trace</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedPin#getLevelTrace()
	 * @see #getTracedPin()
	 * @generated
	 */
	EReference getTracedPin_LevelTrace();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedNumberValue <em>Traced Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Number Value</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedNumberValue
	 * @generated
	 */
	EClass getTracedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.arduino.TracedNumberValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedNumberValue#getValueTrace()
	 * @see #getTracedNumberValue()
	 * @generated
	 */
	EReference getTracedNumberValue_ValueTrace();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedStringValue <em>Traced String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced String Value</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedStringValue
	 * @generated
	 */
	EClass getTracedStringValue();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.arduino.TracedStringValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedStringValue#getValueTrace()
	 * @see #getTracedStringValue()
	 * @generated
	 */
	EReference getTracedStringValue_ValueTrace();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedInstruction <em>Traced Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Instruction</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedInstruction
	 * @generated
	 */
	EClass getTracedInstruction();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedInstruction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedInstruction#getPrevious()
	 * @see #getTracedInstruction()
	 * @generated
	 */
	EReference getTracedInstruction_Previous();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Traced.arduino.TracedInstruction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedInstruction#getNext()
	 * @see #getTracedInstruction()
	 * @generated
	 */
	EReference getTracedInstruction_Next();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedExpression <em>Traced Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Expression</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedExpression
	 * @generated
	 */
	EClass getTracedExpression();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Traced.arduino.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Value</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedBooleanValue
	 * @generated
	 */
	EClass getTracedBooleanValue();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Traced.arduino.TracedBooleanValue#getValueTrace <em>Value Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Trace</em>'.
	 * @see arduinoTrace.Traced.arduino.TracedBooleanValue#getValueTrace()
	 * @see #getTracedBooleanValue()
	 * @generated
	 */
	EReference getTracedBooleanValue_ValueTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoFactory getArduinoFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedDigitalPinImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
		 * @generated
		 */
		EClass TRACED_DIGITAL_PIN = eINSTANCE.getTracedDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedDigitalPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedAnalogPinImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
		 * @generated
		 */
		EClass TRACED_ANALOG_PIN = eINSTANCE.getTracedAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ANALOG_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedAnalogPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedParameterImpl <em>Traced Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedParameterImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedParameter()
		 * @generated
		 */
		EClass TRACED_PARAMETER = eINSTANCE.getTracedParameter();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PARAMETER__DEFINITION = eINSTANCE.getTracedParameter_Definition();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedVariableImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__VALUE = eINSTANCE.getTracedVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedVariable_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_VARIABLE__VALUE_TRACE = eINSTANCE.getTracedVariable_ValueTrace();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedValueImpl <em>Traced Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedValueImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedValue()
		 * @generated
		 */
		EClass TRACED_VALUE = eINSTANCE.getTracedValue();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedPinImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedPin()
		 * @generated
		 */
		EClass TRACED_PIN = eINSTANCE.getTracedPin();

		/**
		 * The meta object literal for the '<em><b>Level Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PIN__LEVEL_TRACE = eINSTANCE.getTracedPin_LevelTrace();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedNumberValueImpl <em>Traced Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedNumberValueImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedNumberValue()
		 * @generated
		 */
		EClass TRACED_NUMBER_VALUE = eINSTANCE.getTracedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_NUMBER_VALUE__VALUE_TRACE = eINSTANCE.getTracedNumberValue_ValueTrace();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedStringValueImpl <em>Traced String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedStringValueImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedStringValue()
		 * @generated
		 */
		EClass TRACED_STRING_VALUE = eINSTANCE.getTracedStringValue();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STRING_VALUE__VALUE_TRACE = eINSTANCE.getTracedStringValue_ValueTrace();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedInstructionImpl <em>Traced Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedInstructionImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedInstruction()
		 * @generated
		 */
		EClass TRACED_INSTRUCTION = eINSTANCE.getTracedInstruction();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INSTRUCTION__PREVIOUS = eINSTANCE.getTracedInstruction_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INSTRUCTION__NEXT = eINSTANCE.getTracedInstruction_Next();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedExpressionImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedExpression()
		 * @generated
		 */
		EClass TRACED_EXPRESSION = eINSTANCE.getTracedExpression();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Traced.arduino.impl.TracedBooleanValueImpl <em>Traced Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Traced.arduino.impl.TracedBooleanValueImpl
		 * @see arduinoTrace.Traced.arduino.impl.ArduinoPackageImpl#getTracedBooleanValue()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VALUE = eINSTANCE.getTracedBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VALUE__VALUE_TRACE = eINSTANCE.getTracedBooleanValue_ValueTrace();

	}

} //ArduinoPackage

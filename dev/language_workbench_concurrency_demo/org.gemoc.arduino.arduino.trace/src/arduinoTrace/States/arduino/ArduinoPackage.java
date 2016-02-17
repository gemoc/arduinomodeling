/**
 */
package arduinoTrace.States.arduino;

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
 * @see arduinoTrace.States.arduino.ArduinoFactory
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
	ArduinoPackage eINSTANCE = arduinoTrace.States.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPin()
	 * @generated
	 */
	int TRACED_PIN = 8;

	/**
	 * The feature id for the '<em><b>Level Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN__LEVEL_SEQUENCE = 0;

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
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedAnalogPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
	 * @generated
	 */
	int TRACED_ANALOG_PIN = 0;

	/**
	 * The feature id for the '<em><b>Level Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__LEVEL_SEQUENCE = TRACED_PIN__LEVEL_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__MODULE = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_OPERATION_COUNT = TRACED_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedExpressionImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedExpression()
	 * @generated
	 */
	int TRACED_EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanExpressionImpl <em>Traced Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBooleanExpressionImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanExpression()
	 * @generated
	 */
	int TRACED_BOOLEAN_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_EXPRESSION_OPERATION_COUNT = TRACED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_FEATURE_COUNT = TRACED_BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_OPERATION_COUNT = TRACED_BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedDigitalPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
	 * @generated
	 */
	int TRACED_DIGITAL_PIN = 3;

	/**
	 * The feature id for the '<em><b>Level Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__LEVEL_SEQUENCE = TRACED_PIN__LEVEL_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__MODULE = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_OPERATION_COUNT = TRACED_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerExpressionImpl <em>Traced Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedIntegerExpressionImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerExpression()
	 * @generated
	 */
	int TRACED_INTEGER_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Traced Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_EXPRESSION_OPERATION_COUNT = TRACED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Original Object Integer Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_FEATURE_COUNT = TRACED_INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_OPERATION_COUNT = TRACED_INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedNamedElementImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedSharedResourceImpl <em>Traced Shared Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedSharedResourceImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSharedResource()
	 * @generated
	 */
	int TRACED_SHARED_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Original Object Integer Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SHARED_RESOURCE__ORIGINAL_OBJECT_INTEGER_VARIABLE = TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SHARED_RESOURCE__VALUE_SEQUENCE = TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE;

	/**
	 * The number of structural features of the '<em>Traced Shared Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SHARED_RESOURCE_FEATURE_COUNT = TRACED_INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Shared Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SHARED_RESOURCE_OPERATION_COUNT = TRACED_INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 10;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = TRACED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_OPERATION_COUNT = TRACED_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedAnalogPin <em>Traced Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Analog Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin
	 * @generated
	 */
	EClass getTracedAnalogPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedAnalogPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin#getModule()
	 * @see #getTracedAnalogPin()
	 * @generated
	 */
	EReference getTracedAnalogPin_Module();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject()
	 * @see #getTracedAnalogPin()
	 * @generated
	 */
	EReference getTracedAnalogPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBooleanExpression <em>Traced Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Expression</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanExpression
	 * @generated
	 */
	EClass getTracedBooleanExpression();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable
	 * @generated
	 */
	EClass getTracedBooleanVariable();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable#getValueSequence()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_ValueSequence();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedDigitalPin <em>Traced Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Digital Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin
	 * @generated
	 */
	EClass getTracedDigitalPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedDigitalPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin#getModule()
	 * @see #getTracedDigitalPin()
	 * @generated
	 */
	EReference getTracedDigitalPin_Module();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedDigitalPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin#getOriginalObject()
	 * @see #getTracedDigitalPin()
	 * @generated
	 */
	EReference getTracedDigitalPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedExpression <em>Traced Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Expression</em>'.
	 * @see arduinoTrace.States.arduino.TracedExpression
	 * @generated
	 */
	EClass getTracedExpression();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedIntegerExpression <em>Traced Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Expression</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerExpression
	 * @generated
	 */
	EClass getTracedIntegerExpression();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable
	 * @generated
	 */
	EClass getTracedIntegerVariable();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject_IntegerVariable <em>Original Object Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object Integer Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject_IntegerVariable()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_OriginalObject_IntegerVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable#getValueSequence()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_ValueSequence();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see arduinoTrace.States.arduino.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedPin <em>Traced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedPin
	 * @generated
	 */
	EClass getTracedPin();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedPin#getLevelSequence <em>Level Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedPin#getLevelSequence()
	 * @see #getTracedPin()
	 * @generated
	 */
	EReference getTracedPin_LevelSequence();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedSharedResource <em>Traced Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Shared Resource</em>'.
	 * @see arduinoTrace.States.arduino.TracedSharedResource
	 * @generated
	 */
	EClass getTracedSharedResource();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

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
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedAnalogPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
		 * @generated
		 */
		EClass TRACED_ANALOG_PIN = eINSTANCE.getTracedAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ANALOG_PIN__MODULE = eINSTANCE.getTracedAnalogPin_Module();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ANALOG_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedAnalogPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanExpressionImpl <em>Traced Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBooleanExpressionImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanExpression()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_EXPRESSION = eINSTANCE.getTracedBooleanExpression();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanVariable()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VARIABLE = eINSTANCE.getTracedBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanVariable_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE = eINSTANCE.getTracedBooleanVariable_ValueSequence();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedDigitalPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
		 * @generated
		 */
		EClass TRACED_DIGITAL_PIN = eINSTANCE.getTracedDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DIGITAL_PIN__MODULE = eINSTANCE.getTracedDigitalPin_Module();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedDigitalPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedExpressionImpl <em>Traced Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedExpressionImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedExpression()
		 * @generated
		 */
		EClass TRACED_EXPRESSION = eINSTANCE.getTracedExpression();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerExpressionImpl <em>Traced Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedIntegerExpressionImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerExpression()
		 * @generated
		 */
		EClass TRACED_INTEGER_EXPRESSION = eINSTANCE.getTracedIntegerExpression();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerVariable()
		 * @generated
		 */
		EClass TRACED_INTEGER_VARIABLE = eINSTANCE.getTracedIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object Integer Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE = eINSTANCE.getTracedIntegerVariable_OriginalObject_IntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE = eINSTANCE.getTracedIntegerVariable_ValueSequence();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedNamedElementImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPin()
		 * @generated
		 */
		EClass TRACED_PIN = eINSTANCE.getTracedPin();

		/**
		 * The meta object literal for the '<em><b>Level Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PIN__LEVEL_SEQUENCE = eINSTANCE.getTracedPin_LevelSequence();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedSharedResourceImpl <em>Traced Shared Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedSharedResourceImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSharedResource()
		 * @generated
		 */
		EClass TRACED_SHARED_RESOURCE = eINSTANCE.getTracedSharedResource();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

	}

} //ArduinoPackage

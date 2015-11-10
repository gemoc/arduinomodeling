/**
 */
package arduinoTrace.States;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see arduinoTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_States";

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
	StatesPackage eINSTANCE = arduinoTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.StateImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Pin level Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PIN_LEVEL_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Variable value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_VALUE_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Number Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NUMBER_VALUE_VALUE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VALUE_VALUE_VALUES = 5;

	/**
	 * The feature id for the '<em><b>String Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STRING_VALUE_VALUE_VALUES = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Pin_level_ValueImpl <em>Pin level Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Pin_level_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Value()
	 * @generated
	 */
	int PIN_LEVEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Pin level Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pin level Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Variable_value_ValueImpl <em>Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Variable_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getVariable_value_Value()
	 * @generated
	 */
	int VARIABLE_VALUE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.NumberValue_value_ValueImpl <em>Number Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.NumberValue_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getNumberValue_value_Value()
	 * @generated
	 */
	int NUMBER_VALUE_VALUE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Number Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Number Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BooleanValue_value_ValueImpl <em>Boolean Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BooleanValue_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanValue_value_Value()
	 * @generated
	 */
	int BOOLEAN_VALUE_VALUE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.StringValue_value_ValueImpl <em>String Value value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.StringValue_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getStringValue_value_Value()
	 * @generated
	 */
	int STRING_VALUE_VALUE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_VALUE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_VALUE_VALUE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_VALUE_VALUE__STATES = 2;

	/**
	 * The number of structural features of the '<em>String Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_VALUE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>String Value value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_VALUE_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see arduinoTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see arduinoTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see arduinoTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getPin_level_Values <em>Pin level Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin level Values</em>'.
	 * @see arduinoTrace.States.State#getPin_level_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Pin_level_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getVariable_value_Values <em>Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable value Values</em>'.
	 * @see arduinoTrace.States.State#getVariable_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getNumberValue_value_Values <em>Number Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Number Value value Values</em>'.
	 * @see arduinoTrace.States.State#getNumberValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_NumberValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Value value Values</em>'.
	 * @see arduinoTrace.States.State#getBooleanValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getStringValue_value_Values <em>String Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Value value Values</em>'.
	 * @see arduinoTrace.States.State#getStringValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StringValue_value_Values();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Pin_level_Value <em>Pin level Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin level Value</em>'.
	 * @see arduinoTrace.States.Pin_level_Value
	 * @generated
	 */
	EClass getPin_level_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.Pin_level_Value#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getLevel()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EAttribute getPin_level_Value_Level();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.Pin_level_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getParent()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EReference getPin_level_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.Pin_level_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getStates()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EReference getPin_level_Value_States();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Variable_value_Value <em>Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable value Value</em>'.
	 * @see arduinoTrace.States.Variable_value_Value
	 * @generated
	 */
	EClass getVariable_value_Value();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.Variable_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see arduinoTrace.States.Variable_value_Value#getValue()
	 * @see #getVariable_value_Value()
	 * @generated
	 */
	EReference getVariable_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.Variable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.Variable_value_Value#getParent()
	 * @see #getVariable_value_Value()
	 * @generated
	 */
	EReference getVariable_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.Variable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.Variable_value_Value#getStates()
	 * @see #getVariable_value_Value()
	 * @generated
	 */
	EReference getVariable_value_Value_States();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.NumberValue_value_Value <em>Number Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value value Value</em>'.
	 * @see arduinoTrace.States.NumberValue_value_Value
	 * @generated
	 */
	EClass getNumberValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.NumberValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.NumberValue_value_Value#getValue()
	 * @see #getNumberValue_value_Value()
	 * @generated
	 */
	EAttribute getNumberValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.NumberValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.NumberValue_value_Value#getParent()
	 * @see #getNumberValue_value_Value()
	 * @generated
	 */
	EReference getNumberValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.NumberValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.NumberValue_value_Value#getStates()
	 * @see #getNumberValue_value_Value()
	 * @generated
	 */
	EReference getNumberValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BooleanValue_value_Value <em>Boolean Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value value Value</em>'.
	 * @see arduinoTrace.States.BooleanValue_value_Value
	 * @generated
	 */
	EClass getBooleanValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.BooleanValue_value_Value#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.BooleanValue_value_Value#isValue()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EAttribute getBooleanValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.BooleanValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.BooleanValue_value_Value#getParent()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.BooleanValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.BooleanValue_value_Value#getStates()
	 * @see #getBooleanValue_value_Value()
	 * @generated
	 */
	EReference getBooleanValue_value_Value_States();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.StringValue_value_Value <em>String Value value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value value Value</em>'.
	 * @see arduinoTrace.States.StringValue_value_Value
	 * @generated
	 */
	EClass getStringValue_value_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.StringValue_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.StringValue_value_Value#getValue()
	 * @see #getStringValue_value_Value()
	 * @generated
	 */
	EAttribute getStringValue_value_Value_Value();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.StringValue_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.StringValue_value_Value#getParent()
	 * @see #getStringValue_value_Value()
	 * @generated
	 */
	EReference getStringValue_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.StringValue_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.StringValue_value_Value#getStates()
	 * @see #getStringValue_value_Value()
	 * @generated
	 */
	EReference getStringValue_value_Value_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.StateImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Pin level Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PIN_LEVEL_VALUES = eINSTANCE.getState_Pin_level_Values();

		/**
		 * The meta object literal for the '<em><b>Variable value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_VALUE_VALUES = eINSTANCE.getState_Variable_value_Values();

		/**
		 * The meta object literal for the '<em><b>Number Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NUMBER_VALUE_VALUE_VALUES = eINSTANCE.getState_NumberValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VALUE_VALUE_VALUES = eINSTANCE.getState_BooleanValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>String Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STRING_VALUE_VALUE_VALUES = eINSTANCE.getState_StringValue_value_Values();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Pin_level_ValueImpl <em>Pin level Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Pin_level_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Value()
		 * @generated
		 */
		EClass PIN_LEVEL_VALUE = eINSTANCE.getPin_level_Value();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_LEVEL_VALUE__LEVEL = eINSTANCE.getPin_level_Value_Level();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_LEVEL_VALUE__PARENT = eINSTANCE.getPin_level_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_LEVEL_VALUE__STATES = eINSTANCE.getPin_level_Value_States();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Variable_value_ValueImpl <em>Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Variable_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getVariable_value_Value()
		 * @generated
		 */
		EClass VARIABLE_VALUE_VALUE = eINSTANCE.getVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getVariable_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_VALUE__PARENT = eINSTANCE.getVariable_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_VALUE__STATES = eINSTANCE.getVariable_value_Value_States();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.NumberValue_value_ValueImpl <em>Number Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.NumberValue_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getNumberValue_value_Value()
		 * @generated
		 */
		EClass NUMBER_VALUE_VALUE_VALUE = eINSTANCE.getNumberValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getNumberValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getNumberValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_VALUE_VALUE_VALUE__STATES = eINSTANCE.getNumberValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BooleanValue_value_ValueImpl <em>Boolean Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BooleanValue_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanValue_value_Value()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_VALUE_VALUE = eINSTANCE.getBooleanValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getBooleanValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getBooleanValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VALUE_VALUE_VALUE__STATES = eINSTANCE.getBooleanValue_value_Value_States();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.StringValue_value_ValueImpl <em>String Value value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.StringValue_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getStringValue_value_Value()
		 * @generated
		 */
		EClass STRING_VALUE_VALUE_VALUE = eINSTANCE.getStringValue_value_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE_VALUE_VALUE__VALUE = eINSTANCE.getStringValue_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_VALUE_VALUE_VALUE__PARENT = eINSTANCE.getStringValue_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_VALUE_VALUE_VALUE__STATES = eINSTANCE.getStringValue_value_Value_States();

	}

} //StatesPackage

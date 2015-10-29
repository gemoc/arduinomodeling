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
	 * The feature id for the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Traced Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACED_OBJECTS = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.impl.StateImpl
	 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Following Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FOLLOWING_STEP = 0;

	/**
	 * The feature id for the '<em><b>Started Big Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_BIG_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Ended Big Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_BIG_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Variable value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VARIABLE_VALUE_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Pin level Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PIN_LEVEL_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Number Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NUMBER_VALUE_VALUE_VALUES = 5;

	/**
	 * The feature id for the '<em><b>String Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STRING_VALUE_VALUE_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Boolean Value value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VALUE_VALUE_VALUES = 7;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference '{@link arduinoTrace.Trace#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Steps</em>'.
	 * @see arduinoTrace.Trace#getSteps()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link arduinoTrace.Trace#getTracedObjects <em>Traced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traced Objects</em>'.
	 * @see arduinoTrace.Trace#getTracedObjects()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_TracedObjects();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see arduinoTrace.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.State#getFollowingStep <em>Following Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Following Step</em>'.
	 * @see arduinoTrace.State#getFollowingStep()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FollowingStep();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getStartedBigSteps <em>Started Big Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Big Steps</em>'.
	 * @see arduinoTrace.State#getStartedBigSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedBigSteps();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getEndedBigSteps <em>Ended Big Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Big Steps</em>'.
	 * @see arduinoTrace.State#getEndedBigSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedBigSteps();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getVariable_value_Values <em>Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable value Values</em>'.
	 * @see arduinoTrace.State#getVariable_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Variable_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getPin_level_Values <em>Pin level Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin level Values</em>'.
	 * @see arduinoTrace.State#getPin_level_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Pin_level_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getNumberValue_value_Values <em>Number Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Number Value value Values</em>'.
	 * @see arduinoTrace.State#getNumberValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_NumberValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getStringValue_value_Values <em>String Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Value value Values</em>'.
	 * @see arduinoTrace.State#getStringValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StringValue_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.State#getBooleanValue_value_Values <em>Boolean Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Value value Values</em>'.
	 * @see arduinoTrace.State#getBooleanValue_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanValue_value_Values();

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
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__STEPS = eINSTANCE.getTrace_Steps();

		/**
		 * The meta object literal for the '<em><b>Traced Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRACED_OBJECTS = eINSTANCE.getTrace_TracedObjects();

		/**
		 * The meta object literal for the '{@link arduinoTrace.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.impl.StateImpl
		 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Following Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FOLLOWING_STEP = eINSTANCE.getState_FollowingStep();

		/**
		 * The meta object literal for the '<em><b>Started Big Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_BIG_STEPS = eINSTANCE.getState_StartedBigSteps();

		/**
		 * The meta object literal for the '<em><b>Ended Big Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_BIG_STEPS = eINSTANCE.getState_EndedBigSteps();

		/**
		 * The meta object literal for the '<em><b>Variable value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__VARIABLE_VALUE_VALUES = eINSTANCE.getState_Variable_value_Values();

		/**
		 * The meta object literal for the '<em><b>Pin level Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PIN_LEVEL_VALUES = eINSTANCE.getState_Pin_level_Values();

		/**
		 * The meta object literal for the '<em><b>Number Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NUMBER_VALUE_VALUE_VALUES = eINSTANCE.getState_NumberValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>String Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STRING_VALUE_VALUE_VALUES = eINSTANCE.getState_StringValue_value_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Value value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VALUE_VALUE_VALUES = eINSTANCE.getState_BooleanValue_value_Values();

	}

} //ArduinoTracePackage

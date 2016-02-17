/**
 */
package arduinoTrace.Steps;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
 * @see arduinoTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = arduinoTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_Execute_AbstractSubStepImpl <em>Arduino Delay Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Delay_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP = 1;

	/**
	 * The number of structural features of the '<em>Arduino Delay Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Delay Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl <em>Arduino Delay Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute()
	 * @generated
	 */
	int ARDUINO_DELAY_EXECUTE = 0;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__MSE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__PARAMETERS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__RESULT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__LOGICAL_STEP = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__ENDING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__STARTING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__SUB_STEPS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_FEATURE_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE___GET_CALLER = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_OPERATION_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_Execute_ImplicitStepImpl <em>Arduino Delay Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Delay_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP__MSE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP__PARAMETERS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP__RESULT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Arduino Delay Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Arduino Delay Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl <em>Arduino If Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE = 3;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__MSE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__PARAMETERS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__RESULT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__LOGICAL_STEP = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__ENDING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__STARTING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__SUB_STEPS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_FEATURE_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE___GET_CALLER = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_OPERATION_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl <em>Arduino If Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP = 4;

	/**
	 * The number of structural features of the '<em>Arduino If Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino If Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl <em>Arduino If Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__MSE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__PARAMETERS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__RESULT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Arduino If Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Arduino If Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl <em>Arduino Module Assignment Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE = 6;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__MSE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__PARAMETERS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__RESULT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__LOGICAL_STEP = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__ENDING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__STARTING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FEATURE_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE___GET_CALLER = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_OPERATION_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_AbstractSubStepImpl <em>Arduino Module Assignment Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP = 7;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_ImplicitStepImpl <em>Arduino Module Assignment Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__MSE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__PARAMETERS = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__RESULT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.StepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 19;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MSE = MsePackage.MSE_OCCURRENCE__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = MsePackage.MSE_OCCURRENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESULT = MsePackage.MSE_OCCURRENCE__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOGICAL_STEP = MsePackage.MSE_OCCURRENCE__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENDING_STATE = MsePackage.MSE_OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STARTING_STATE = MsePackage.MSE_OCCURRENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = MsePackage.MSE_OCCURRENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = MsePackage.MSE_OCCURRENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.SmallStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSmallStep()
	 * @generated
	 */
	int SMALL_STEP = 18;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__LOGICAL_STEP = STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Small Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Project_SetupImpl <em>Arduino Project Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Project_SetupImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Project_Setup()
	 * @generated
	 */
	int ARDUINO_PROJECT_SETUP = 9;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Arduino Project Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP___GET_CALLER = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Project Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl <em>Arduino Variable Assignment Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE = 10;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__MSE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__PARAMETERS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__RESULT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__LOGICAL_STEP = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Arduino Variable Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FEATURE_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE___GET_CALLER = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Variable Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_OPERATION_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_AbstractSubStepImpl <em>Arduino Variable Assignment Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP = 11;

	/**
	 * The number of structural features of the '<em>Arduino Variable Assignment Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Variable Assignment Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_ImplicitStepImpl <em>Arduino Variable Assignment Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__MSE = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__PARAMETERS = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__RESULT = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Arduino Variable Assignment Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Arduino Variable Assignment Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl <em>Arduino Variable Declaration Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute()
	 * @generated
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE = 13;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__MSE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__PARAMETERS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__RESULT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__LOGICAL_STEP = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__ENDING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__STARTING_STATE = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__SUB_STEPS = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Arduino Variable Declaration Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_FEATURE_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Caller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE___GET_CALLER = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Variable Declaration Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_OPERATION_COUNT = ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_AbstractSubStepImpl <em>Arduino Variable Declaration Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP = 14;

	/**
	 * The number of structural features of the '<em>Arduino Variable Declaration Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Variable Declaration Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_ImplicitStepImpl <em>Arduino Variable Declaration Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_ImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute_ImplicitStep()
	 * @generated
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP = 15;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP__MSE = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP__PARAMETERS = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP__RESULT = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP__ENDING_STATE = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP__STARTING_STATE = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Arduino Variable Declaration Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Arduino Variable Declaration Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP_OPERATION_COUNT = ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.BigStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getBigStep()
	 * @generated
	 */
	int BIG_STEP = 16;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__MSE = STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__PARAMETERS = STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__RESULT = STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__LOGICAL_STEP = STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__ENDING_STATE = STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Big Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.RootImplicitStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 17;

	/**
	 * The feature id for the '<em><b>Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSE = SMALL_STEP__MSE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__PARAMETERS = SMALL_STEP__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__RESULT = SMALL_STEP__RESULT;

	/**
	 * The feature id for the '<em><b>Logical Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__LOGICAL_STEP = SMALL_STEP__LOGICAL_STEP;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Delay_Execute <em>Arduino Delay Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Delay Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute
	 * @generated
	 */
	EClass getArduino_Delay_Execute();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_Delay_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute#getSubSteps()
	 * @see #getArduino_Delay_Execute()
	 * @generated
	 */
	EReference getArduino_Delay_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.Steps.Arduino_Delay_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute#getCaller()
	 * @generated
	 */
	EOperation getArduino_Delay_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Delay_Execute_AbstractSubStep <em>Arduino Delay Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Delay Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_Delay_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Delay_Execute_ImplicitStep <em>Arduino Delay Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Delay Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_Delay_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute <em>Arduino If Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute
	 * @generated
	 */
	EClass getArduino_If_Execute();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_If_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute#getSubSteps()
	 * @see #getArduino_If_Execute()
	 * @generated
	 */
	EReference getArduino_If_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.Steps.Arduino_If_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see arduinoTrace.Steps.Arduino_If_Execute#getCaller()
	 * @generated
	 */
	EOperation getArduino_If_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep <em>Arduino If Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_If_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep <em>Arduino If Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_If_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute <em>Arduino Module Assignment Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Execute();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute#getSubSteps()
	 * @see #getArduino_ModuleAssignment_Execute()
	 * @generated
	 */
	EReference getArduino_ModuleAssignment_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute#getCaller()
	 * @generated
	 */
	EOperation getArduino_ModuleAssignment_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep <em>Arduino Module Assignment Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_ImplicitStep <em>Arduino Module Assignment Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Project_Setup <em>Arduino Project Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Project Setup</em>'.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup
	 * @generated
	 */
	EClass getArduino_Project_Setup();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.Steps.Arduino_Project_Setup#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup#getCaller()
	 * @generated
	 */
	EOperation getArduino_Project_Setup__GetCaller();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute <em>Arduino Variable Assignment Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Assignment Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute
	 * @generated
	 */
	EClass getArduino_VariableAssignment_Execute();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute#getSubSteps()
	 * @see #getArduino_VariableAssignment_Execute()
	 * @generated
	 */
	EReference getArduino_VariableAssignment_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute#getCaller()
	 * @generated
	 */
	EOperation getArduino_VariableAssignment_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep <em>Arduino Variable Assignment Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Assignment Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_VariableAssignment_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute_ImplicitStep <em>Arduino Variable Assignment Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Assignment Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_VariableAssignment_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute <em>Arduino Variable Declaration Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Declaration Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute
	 * @generated
	 */
	EClass getArduino_VariableDeclaration_Execute();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getSubSteps()
	 * @see #getArduino_VariableDeclaration_Execute()
	 * @generated
	 */
	EReference getArduino_VariableDeclaration_Execute_SubSteps();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getCaller() <em>Get Caller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Caller</em>' operation.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getCaller()
	 * @generated
	 */
	EOperation getArduino_VariableDeclaration_Execute__GetCaller();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_AbstractSubStep <em>Arduino Variable Declaration Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Declaration Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_VariableDeclaration_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_ImplicitStep <em>Arduino Variable Declaration Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Declaration Execute Implicit Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute_ImplicitStep
	 * @generated
	 */
	EClass getArduino_VariableDeclaration_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Step</em>'.
	 * @see arduinoTrace.Steps.BigStep
	 * @generated
	 */
	EClass getBigStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see arduinoTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Step</em>'.
	 * @see arduinoTrace.Steps.SmallStep
	 * @generated
	 */
	EClass getSmallStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see arduinoTrace.Steps.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Step#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see arduinoTrace.Steps.Step#getEndingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Step#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see arduinoTrace.Steps.Step#getStartingState()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl <em>Arduino Delay Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute()
		 * @generated
		 */
		EClass ARDUINO_DELAY_EXECUTE = eINSTANCE.getArduino_Delay_Execute();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_DELAY_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_Delay_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARDUINO_DELAY_EXECUTE___GET_CALLER = eINSTANCE.getArduino_Delay_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_Execute_AbstractSubStepImpl <em>Arduino Delay Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Delay_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_DELAY_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_Delay_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_Execute_ImplicitStepImpl <em>Arduino Delay Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Delay_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_DELAY_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_Delay_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl <em>Arduino If Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE = eINSTANCE.getArduino_If_Execute();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_IF_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_If_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARDUINO_IF_EXECUTE___GET_CALLER = eINSTANCE.getArduino_If_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl <em>Arduino If Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_If_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl <em>Arduino If Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_If_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl <em>Arduino Module Assignment Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_EXECUTE = eINSTANCE.getArduino_ModuleAssignment_Execute();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_ModuleAssignment_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARDUINO_MODULE_ASSIGNMENT_EXECUTE___GET_CALLER = eINSTANCE.getArduino_ModuleAssignment_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_AbstractSubStepImpl <em>Arduino Module Assignment Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_ModuleAssignment_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_ImplicitStepImpl <em>Arduino Module Assignment Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_ModuleAssignment_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Project_SetupImpl <em>Arduino Project Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Project_SetupImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Project_Setup()
		 * @generated
		 */
		EClass ARDUINO_PROJECT_SETUP = eINSTANCE.getArduino_Project_Setup();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARDUINO_PROJECT_SETUP___GET_CALLER = eINSTANCE.getArduino_Project_Setup__GetCaller();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl <em>Arduino Variable Assignment Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE = eINSTANCE.getArduino_VariableAssignment_Execute();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_VariableAssignment_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE___GET_CALLER = eINSTANCE.getArduino_VariableAssignment_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_AbstractSubStepImpl <em>Arduino Variable Assignment Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_VariableAssignment_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_ImplicitStepImpl <em>Arduino Variable Assignment Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_VariableAssignment_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl <em>Arduino Variable Declaration Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_DECLARATION_EXECUTE = eINSTANCE.getArduino_VariableDeclaration_Execute();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_VARIABLE_DECLARATION_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_VariableDeclaration_Execute_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Get Caller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARDUINO_VARIABLE_DECLARATION_EXECUTE___GET_CALLER = eINSTANCE.getArduino_VariableDeclaration_Execute__GetCaller();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_AbstractSubStepImpl <em>Arduino Variable Declaration Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_DECLARATION_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_VariableDeclaration_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_ImplicitStepImpl <em>Arduino Variable Declaration Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_Execute_ImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute_ImplicitStep()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_DECLARATION_EXECUTE_IMPLICIT_STEP = eINSTANCE.getArduino_VariableDeclaration_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.BigStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getBigStep()
		 * @generated
		 */
		EClass BIG_STEP = eINSTANCE.getBigStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.RootImplicitStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.SmallStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSmallStep()
		 * @generated
		 */
		EClass SMALL_STEP = eINSTANCE.getSmallStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.StepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENDING_STATE = eINSTANCE.getStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STARTING_STATE = eINSTANCE.getStep_StartingState();

	}

} //StepsPackage

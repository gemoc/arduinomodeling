/**
 */
package arduinoTrace.Steps;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.StepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 2;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STARTING_STATE = 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENDING_STATE = 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.SmallStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSmallStep()
	 * @generated
	 */
	int SMALL_STEP = 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STEP__ENDING_STATE = STEP__ENDING_STATE;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.BigStepImpl <em>Big Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.BigStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getBigStep()
	 * @generated
	 */
	int BIG_STEP = 1;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__STARTING_STATE = STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_STEP__ENDING_STATE = STEP__ENDING_STATE;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.RootFillStepImpl <em>Root Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.RootFillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getRootFillStep()
	 * @generated
	 */
	int ROOT_FILL_STEP = 3;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FILL_STEP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FILL_STEP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Root Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FILL_STEP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FILL_STEP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_BooleanModuleGet_EvaluateImpl <em>Arduino Boolean Module Get Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_BooleanModuleGet_EvaluateImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_BooleanModuleGet_Evaluate()
	 * @generated
	 */
	int ARDUINO_BOOLEAN_MODULE_GET_EVALUATE = 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arduino Boolean Module Get Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arduino Boolean Module Get Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_MODULE_GET_EVALUATE_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl <em>Arduino Module Assignment Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE = 5;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_AbstractSubStepImpl <em>Arduino Module Assignment Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP = 6;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_FillStepImpl <em>Arduino Module Assignment Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_FillStep()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP = 7;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP_FEATURE_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP_OPERATION_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_IntegerConstant_EvaluateImpl <em>Arduino Integer Constant Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_IntegerConstant_EvaluateImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_IntegerConstant_Evaluate()
	 * @generated
	 */
	int ARDUINO_INTEGER_CONSTANT_EVALUATE = 8;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_CONSTANT_EVALUATE__STARTING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_CONSTANT_EVALUATE__ENDING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_CONSTANT_EVALUATE__THIS = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Integer Constant Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_CONSTANT_EVALUATE_FEATURE_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Integer Constant Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_CONSTANT_EVALUATE_OPERATION_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_BooleanConstant_EvaluateImpl <em>Arduino Boolean Constant Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_BooleanConstant_EvaluateImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_BooleanConstant_Evaluate()
	 * @generated
	 */
	int ARDUINO_BOOLEAN_CONSTANT_EVALUATE = 9;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_CONSTANT_EVALUATE__STARTING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_CONSTANT_EVALUATE__ENDING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_CONSTANT_EVALUATE__THIS = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Boolean Constant Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_CONSTANT_EVALUATE_FEATURE_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Boolean Constant Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOOLEAN_CONSTANT_EVALUATE_OPERATION_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_IntegerModuleGet_EvaluateImpl <em>Arduino Integer Module Get Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_IntegerModuleGet_EvaluateImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_IntegerModuleGet_Evaluate()
	 * @generated
	 */
	int ARDUINO_INTEGER_MODULE_GET_EVALUATE = 10;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_MODULE_GET_EVALUATE__STARTING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_MODULE_GET_EVALUATE__ENDING_STATE = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_MODULE_GET_EVALUATE__THIS = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Integer Module Get Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_MODULE_GET_EVALUATE_FEATURE_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Integer Module Get Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_INTEGER_MODULE_GET_EVALUATE_OPERATION_COUNT = ARDUINO_MODULE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_While_ExecuteImpl <em>Arduino While Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_While_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute()
	 * @generated
	 */
	int ARDUINO_WHILE_EXECUTE = 11;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino While Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arduino While Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_While_Execute_AbstractSubStepImpl <em>Arduino While Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_While_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP = 12;

	/**
	 * The number of structural features of the '<em>Arduino While Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino While Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_While_Execute_FillStepImpl <em>Arduino While Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_While_Execute_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute_FillStep()
	 * @generated
	 */
	int ARDUINO_WHILE_EXECUTE_FILL_STEP = 13;

	/**
	 * The number of structural features of the '<em>Arduino While Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_FILL_STEP_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino While Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_FILL_STEP_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl <em>Arduino Utilities Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Execute()
	 * @generated
	 */
	int ARDUINO_UTILITIES_EXECUTE = 14;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__STARTING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__ENDING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__THIS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Utilities Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Utilities Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl <em>Arduino Variable Assignment Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE = 15;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arduino Variable Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arduino Variable Assignment Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl <em>Arduino If Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE = 16;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__STARTING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__ENDING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__THIS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__SUB_STEPS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl <em>Arduino Delay Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute()
	 * @generated
	 */
	int ARDUINO_DELAY_EXECUTE = 17;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__STARTING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__ENDING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__THIS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl <em>Arduino Variable Declaration Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableDeclaration_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableDeclaration_Execute()
	 * @generated
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE = 18;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__STARTING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__ENDING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE__THIS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Variable Declaration Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Variable Declaration Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_DECLARATION_EXECUTE_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl <em>Arduino Repeat Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE = 19;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__STARTING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__ENDING_STATE = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__THIS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__SUB_STEPS = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_FEATURE_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arduino Repeat Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_OPERATION_COUNT = ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl <em>Arduino If Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP = 20;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_FillStepImpl <em>Arduino If Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_FillStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_FILL_STEP = 21;

	/**
	 * The number of structural features of the '<em>Arduino If Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_FILL_STEP_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino If Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_FILL_STEP_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_AbstractSubStepImpl <em>Arduino Variable Assignment Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP = 22;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_FillStepImpl <em>Arduino Variable Assignment Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_FillStep()
	 * @generated
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP = 23;

	/**
	 * The number of structural features of the '<em>Arduino Variable Assignment Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP_FEATURE_COUNT = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Variable Assignment Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP_OPERATION_COUNT = ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_AbstractSubStepImpl <em>Arduino Repeat Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP = 24;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Repeat Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_FillStepImpl <em>Arduino Repeat Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_FillStep()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE_FILL_STEP = 25;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_FILL_STEP_FEATURE_COUNT = ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Repeat Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_FILL_STEP_OPERATION_COUNT = ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_CallImpl <em>Arduino Module Assignment Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_CallImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Call()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL = 26;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_AbstractSubStepImpl <em>Arduino Module Assignment Call Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Call_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP = 27;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Call Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Call Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_FillStepImpl <em>Arduino Module Assignment Call Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Call_FillStep()
	 * @generated
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP = 28;

	/**
	 * The number of structural features of the '<em>Arduino Module Assignment Call Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP_FEATURE_COUNT = ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Module Assignment Call Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP_OPERATION_COUNT = ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Step</em>'.
	 * @see arduinoTrace.Steps.BigStep
	 * @generated
	 */
	EClass getBigStep();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.RootFillStep <em>Root Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Fill Step</em>'.
	 * @see arduinoTrace.Steps.RootFillStep
	 * @generated
	 */
	EClass getRootFillStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate <em>Arduino Boolean Module Get Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Boolean Module Get Evaluate</em>'.
	 * @see arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate
	 * @generated
	 */
	EClass getArduino_BooleanModuleGet_Evaluate();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate#getThis()
	 * @see #getArduino_BooleanModuleGet_Evaluate()
	 * @generated
	 */
	EReference getArduino_BooleanModuleGet_Evaluate_This();

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
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute#getThis()
	 * @see #getArduino_ModuleAssignment_Execute()
	 * @generated
	 */
	EReference getArduino_ModuleAssignment_Execute_This();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep <em>Arduino Module Assignment Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_FillStep <em>Arduino Module Assignment Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Execute Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_FillStep
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Execute_FillStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate <em>Arduino Integer Constant Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Integer Constant Evaluate</em>'.
	 * @see arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate
	 * @generated
	 */
	EClass getArduino_IntegerConstant_Evaluate();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate#getThis()
	 * @see #getArduino_IntegerConstant_Evaluate()
	 * @generated
	 */
	EReference getArduino_IntegerConstant_Evaluate_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate <em>Arduino Boolean Constant Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Boolean Constant Evaluate</em>'.
	 * @see arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate
	 * @generated
	 */
	EClass getArduino_BooleanConstant_Evaluate();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate#getThis()
	 * @see #getArduino_BooleanConstant_Evaluate()
	 * @generated
	 */
	EReference getArduino_BooleanConstant_Evaluate_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate <em>Arduino Integer Module Get Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Integer Module Get Evaluate</em>'.
	 * @see arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate
	 * @generated
	 */
	EClass getArduino_IntegerModuleGet_Evaluate();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate#getThis()
	 * @see #getArduino_IntegerModuleGet_Evaluate()
	 * @generated
	 */
	EReference getArduino_IntegerModuleGet_Evaluate_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_While_Execute <em>Arduino While Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino While Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_While_Execute
	 * @generated
	 */
	EClass getArduino_While_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_While_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_While_Execute#getThis()
	 * @see #getArduino_While_Execute()
	 * @generated
	 */
	EReference getArduino_While_Execute_This();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_While_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_While_Execute#getSubSteps()
	 * @see #getArduino_While_Execute()
	 * @generated
	 */
	EReference getArduino_While_Execute_SubSteps();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_While_Execute_AbstractSubStep <em>Arduino While Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino While Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_While_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_While_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_While_Execute_FillStep <em>Arduino While Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino While Execute Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_While_Execute_FillStep
	 * @generated
	 */
	EClass getArduino_While_Execute_FillStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Utilities_Execute <em>Arduino Utilities Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Utilities Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Execute
	 * @generated
	 */
	EClass getArduino_Utilities_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Utilities_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Execute#getThis()
	 * @see #getArduino_Utilities_Execute()
	 * @generated
	 */
	EReference getArduino_Utilities_Execute_This();

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
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute#getThis()
	 * @see #getArduino_VariableAssignment_Execute()
	 * @generated
	 */
	EReference getArduino_VariableAssignment_Execute_This();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute <em>Arduino If Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute
	 * @generated
	 */
	EClass getArduino_If_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_If_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute#getThis()
	 * @see #getArduino_If_Execute()
	 * @generated
	 */
	EReference getArduino_If_Execute_This();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Delay_Execute <em>Arduino Delay Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Delay Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute
	 * @generated
	 */
	EClass getArduino_Delay_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Delay_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Delay_Execute#getThis()
	 * @see #getArduino_Delay_Execute()
	 * @generated
	 */
	EReference getArduino_Delay_Execute_This();

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
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableDeclaration_Execute#getThis()
	 * @see #getArduino_VariableDeclaration_Execute()
	 * @generated
	 */
	EReference getArduino_VariableDeclaration_Execute_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute <em>Arduino Repeat Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Repeat Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute
	 * @generated
	 */
	EClass getArduino_Repeat_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Repeat_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute#getThis()
	 * @see #getArduino_Repeat_Execute()
	 * @generated
	 */
	EReference getArduino_Repeat_Execute_This();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_Repeat_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute#getSubSteps()
	 * @see #getArduino_Repeat_Execute()
	 * @generated
	 */
	EReference getArduino_Repeat_Execute_SubSteps();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_If_Execute_FillStep <em>Arduino If Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino If Execute Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_If_Execute_FillStep
	 * @generated
	 */
	EClass getArduino_If_Execute_FillStep();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute_FillStep <em>Arduino Variable Assignment Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Variable Assignment Execute Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_VariableAssignment_Execute_FillStep
	 * @generated
	 */
	EClass getArduino_VariableAssignment_Execute_FillStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep <em>Arduino Repeat Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Repeat Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_Repeat_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep <em>Arduino Repeat Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Repeat Execute Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep
	 * @generated
	 */
	EClass getArduino_Repeat_Execute_FillStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call <em>Arduino Module Assignment Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Call</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Call();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call#getThis()
	 * @see #getArduino_ModuleAssignment_Call()
	 * @generated
	 */
	EReference getArduino_ModuleAssignment_Call_This();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call#getSubSteps()
	 * @see #getArduino_ModuleAssignment_Call()
	 * @generated
	 */
	EReference getArduino_ModuleAssignment_Call_SubSteps();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call_AbstractSubStep <em>Arduino Module Assignment Call Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Call Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Call_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call_FillStep <em>Arduino Module Assignment Call Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module Assignment Call Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_ModuleAssignment_Call_FillStep
	 * @generated
	 */
	EClass getArduino_ModuleAssignment_Call_FillStep();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.SmallStepImpl <em>Small Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.SmallStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getSmallStep()
		 * @generated
		 */
		EClass SMALL_STEP = eINSTANCE.getSmallStep();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.StepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STARTING_STATE = eINSTANCE.getStep_StartingState();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENDING_STATE = eINSTANCE.getStep_EndingState();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.RootFillStepImpl <em>Root Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.RootFillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getRootFillStep()
		 * @generated
		 */
		EClass ROOT_FILL_STEP = eINSTANCE.getRootFillStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_BooleanModuleGet_EvaluateImpl <em>Arduino Boolean Module Get Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_BooleanModuleGet_EvaluateImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_BooleanModuleGet_Evaluate()
		 * @generated
		 */
		EClass ARDUINO_BOOLEAN_MODULE_GET_EVALUATE = eINSTANCE.getArduino_BooleanModuleGet_Evaluate();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS = eINSTANCE.getArduino_BooleanModuleGet_Evaluate_This();

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
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS = eINSTANCE.getArduino_ModuleAssignment_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_ModuleAssignment_Execute_SubSteps();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_FillStepImpl <em>Arduino Module Assignment Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Execute_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Execute_FillStep()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_EXECUTE_FILL_STEP = eINSTANCE.getArduino_ModuleAssignment_Execute_FillStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_IntegerConstant_EvaluateImpl <em>Arduino Integer Constant Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_IntegerConstant_EvaluateImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_IntegerConstant_Evaluate()
		 * @generated
		 */
		EClass ARDUINO_INTEGER_CONSTANT_EVALUATE = eINSTANCE.getArduino_IntegerConstant_Evaluate();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_INTEGER_CONSTANT_EVALUATE__THIS = eINSTANCE.getArduino_IntegerConstant_Evaluate_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_BooleanConstant_EvaluateImpl <em>Arduino Boolean Constant Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_BooleanConstant_EvaluateImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_BooleanConstant_Evaluate()
		 * @generated
		 */
		EClass ARDUINO_BOOLEAN_CONSTANT_EVALUATE = eINSTANCE.getArduino_BooleanConstant_Evaluate();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_BOOLEAN_CONSTANT_EVALUATE__THIS = eINSTANCE.getArduino_BooleanConstant_Evaluate_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_IntegerModuleGet_EvaluateImpl <em>Arduino Integer Module Get Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_IntegerModuleGet_EvaluateImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_IntegerModuleGet_Evaluate()
		 * @generated
		 */
		EClass ARDUINO_INTEGER_MODULE_GET_EVALUATE = eINSTANCE.getArduino_IntegerModuleGet_Evaluate();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_INTEGER_MODULE_GET_EVALUATE__THIS = eINSTANCE.getArduino_IntegerModuleGet_Evaluate_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_While_ExecuteImpl <em>Arduino While Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_While_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute()
		 * @generated
		 */
		EClass ARDUINO_WHILE_EXECUTE = eINSTANCE.getArduino_While_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_WHILE_EXECUTE__THIS = eINSTANCE.getArduino_While_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_WHILE_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_While_Execute_SubSteps();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_While_Execute_AbstractSubStepImpl <em>Arduino While Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_While_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_While_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_While_Execute_FillStepImpl <em>Arduino While Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_While_Execute_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute_FillStep()
		 * @generated
		 */
		EClass ARDUINO_WHILE_EXECUTE_FILL_STEP = eINSTANCE.getArduino_While_Execute_FillStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl <em>Arduino Utilities Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Execute()
		 * @generated
		 */
		EClass ARDUINO_UTILITIES_EXECUTE = eINSTANCE.getArduino_Utilities_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_UTILITIES_EXECUTE__THIS = eINSTANCE.getArduino_Utilities_Execute_This();

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
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS = eINSTANCE.getArduino_VariableAssignment_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_VariableAssignment_Execute_SubSteps();

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
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_IF_EXECUTE__THIS = eINSTANCE.getArduino_If_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_IF_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_If_Execute_SubSteps();

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
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_DELAY_EXECUTE__THIS = eINSTANCE.getArduino_Delay_Execute_This();

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
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_VARIABLE_DECLARATION_EXECUTE__THIS = eINSTANCE.getArduino_VariableDeclaration_Execute_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl <em>Arduino Repeat Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute()
		 * @generated
		 */
		EClass ARDUINO_REPEAT_EXECUTE = eINSTANCE.getArduino_Repeat_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_REPEAT_EXECUTE__THIS = eINSTANCE.getArduino_Repeat_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_REPEAT_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_Repeat_Execute_SubSteps();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_FillStepImpl <em>Arduino If Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_FillStep()
		 * @generated
		 */
		EClass ARDUINO_IF_EXECUTE_FILL_STEP = eINSTANCE.getArduino_If_Execute_FillStep();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_FillStepImpl <em>Arduino Variable Assignment Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_VariableAssignment_Execute_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_VariableAssignment_Execute_FillStep()
		 * @generated
		 */
		EClass ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_FILL_STEP = eINSTANCE.getArduino_VariableAssignment_Execute_FillStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_AbstractSubStepImpl <em>Arduino Repeat Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_Repeat_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_FillStepImpl <em>Arduino Repeat Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_FillStep()
		 * @generated
		 */
		EClass ARDUINO_REPEAT_EXECUTE_FILL_STEP = eINSTANCE.getArduino_Repeat_Execute_FillStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_CallImpl <em>Arduino Module Assignment Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_CallImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Call()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_CALL = eINSTANCE.getArduino_ModuleAssignment_Call();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_MODULE_ASSIGNMENT_CALL__THIS = eINSTANCE.getArduino_ModuleAssignment_Call_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_MODULE_ASSIGNMENT_CALL__SUB_STEPS = eINSTANCE.getArduino_ModuleAssignment_Call_SubSteps();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_AbstractSubStepImpl <em>Arduino Module Assignment Call Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Call_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_CALL_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_ModuleAssignment_Call_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_FillStepImpl <em>Arduino Module Assignment Call Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_ModuleAssignment_Call_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_ModuleAssignment_Call_FillStep()
		 * @generated
		 */
		EClass ARDUINO_MODULE_ASSIGNMENT_CALL_FILL_STEP = eINSTANCE.getArduino_ModuleAssignment_Call_FillStep();

	}

} //StepsPackage

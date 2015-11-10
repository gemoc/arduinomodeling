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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl <em>Arduino If Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE = 4;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arduino If Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_IF_EXECUTE_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl <em>Arduino If Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_If_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_If_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP = 5;

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
	int ARDUINO_IF_EXECUTE_FILL_STEP = 6;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Set_ExecuteImpl <em>Arduino Set Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Set_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Set_Execute()
	 * @generated
	 */
	int ARDUINO_SET_EXECUTE = 7;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_SET_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_SET_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_SET_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Set Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_SET_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Set Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_SET_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Level_ExecuteImpl <em>Arduino Level Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Level_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Level_Execute()
	 * @generated
	 */
	int ARDUINO_LEVEL_EXECUTE = 8;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_LEVEL_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_LEVEL_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_LEVEL_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Level Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_LEVEL_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Level Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_LEVEL_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Status_ExecuteImpl <em>Arduino Status Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Status_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Execute()
	 * @generated
	 */
	int ARDUINO_STATUS_EXECUTE = 9;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Status Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Status Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl <em>Arduino Delay Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Delay_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Delay_Execute()
	 * @generated
	 */
	int ARDUINO_DELAY_EXECUTE = 10;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Delay Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DELAY_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl <em>Arduino Repeat Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE = 11;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE__SUB_STEPS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arduino Repeat Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arduino Repeat Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_REPEAT_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_While_ExecuteImpl <em>Arduino While Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_While_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute()
	 * @generated
	 */
	int ARDUINO_WHILE_EXECUTE = 12;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE__SUB_STEPS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arduino While Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arduino While Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_WHILE_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl <em>Arduino Utilities Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Utilities_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Execute()
	 * @generated
	 */
	int ARDUINO_UTILITIES_EXECUTE = 13;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arduino Utilities Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arduino Utilities Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_FunctionCall_ExecuteImpl <em>Arduino Function Call Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_FunctionCall_ExecuteImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_FunctionCall_Execute()
	 * @generated
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE = 14;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE__STARTING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE__ENDING_STATE = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE__THIS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE__SUB_STEPS = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arduino Function Call Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_FEATURE_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arduino Function Call Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_OPERATION_COUNT = ARDUINO_IF_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Status_CallImpl <em>Arduino Status Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Status_CallImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Call()
	 * @generated
	 */
	int ARDUINO_STATUS_CALL = 15;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino Status Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arduino Status Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Status_Call_AbstractSubStepImpl <em>Arduino Status Call Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Status_Call_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Call_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP = 16;

	/**
	 * The number of structural features of the '<em>Arduino Status Call Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Status Call Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Status_Call_FillStepImpl <em>Arduino Status Call Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Status_Call_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Call_FillStep()
	 * @generated
	 */
	int ARDUINO_STATUS_CALL_FILL_STEP = 17;

	/**
	 * The number of structural features of the '<em>Arduino Status Call Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL_FILL_STEP_FEATURE_COUNT = ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Status Call Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_STATUS_CALL_FILL_STEP_OPERATION_COUNT = ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_AbstractSubStepImpl <em>Arduino Repeat Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Repeat_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Repeat_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_REPEAT_EXECUTE_ABSTRACT_SUB_STEP = 18;

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
	int ARDUINO_REPEAT_EXECUTE_FILL_STEP = 19;

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
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Project_SetupImpl <em>Arduino Project Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Project_SetupImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Project_Setup()
	 * @generated
	 */
	int ARDUINO_PROJECT_SETUP = 20;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__STARTING_STATE = SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__ENDING_STATE = SMALL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP__THIS = SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arduino Project Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP_FEATURE_COUNT = SMALL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arduino Project Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_PROJECT_SETUP_OPERATION_COUNT = SMALL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_CallImpl <em>Arduino Utilities Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Utilities_CallImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Call()
	 * @generated
	 */
	int ARDUINO_UTILITIES_CALL = 21;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL__STARTING_STATE = BIG_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL__ENDING_STATE = BIG_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL__THIS = BIG_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL__SUB_STEPS = BIG_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino Utilities Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL_FEATURE_COUNT = BIG_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arduino Utilities Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL_OPERATION_COUNT = BIG_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_Call_AbstractSubStepImpl <em>Arduino Utilities Call Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Utilities_Call_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Call_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP = 22;

	/**
	 * The number of structural features of the '<em>Arduino Utilities Call Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Utilities Call Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_Call_FillStepImpl <em>Arduino Utilities Call Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_Utilities_Call_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Call_FillStep()
	 * @generated
	 */
	int ARDUINO_UTILITIES_CALL_FILL_STEP = 23;

	/**
	 * The number of structural features of the '<em>Arduino Utilities Call Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL_FILL_STEP_FEATURE_COUNT = ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Utilities Call Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UTILITIES_CALL_FILL_STEP_OPERATION_COUNT = ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_AbstractSubStepImpl <em>Arduino Function Call Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_FunctionCall_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP = 24;

	/**
	 * The number of structural features of the '<em>Arduino Function Call Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arduino Function Call Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_FillStepImpl <em>Arduino Function Call Execute Fill Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_FillStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_FunctionCall_Execute_FillStep()
	 * @generated
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP = 25;

	/**
	 * The number of structural features of the '<em>Arduino Function Call Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_FEATURE_COUNT = ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arduino Function Call Execute Fill Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_OPERATION_COUNT = ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.Steps.impl.Arduino_While_Execute_AbstractSubStepImpl <em>Arduino While Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.Steps.impl.Arduino_While_Execute_AbstractSubStepImpl
	 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_While_Execute_AbstractSubStep()
	 * @generated
	 */
	int ARDUINO_WHILE_EXECUTE_ABSTRACT_SUB_STEP = 26;

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
	int ARDUINO_WHILE_EXECUTE_FILL_STEP = 27;

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Set_Execute <em>Arduino Set Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Set Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Set_Execute
	 * @generated
	 */
	EClass getArduino_Set_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Set_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Set_Execute#getThis()
	 * @see #getArduino_Set_Execute()
	 * @generated
	 */
	EReference getArduino_Set_Execute_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Level_Execute <em>Arduino Level Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Level Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Level_Execute
	 * @generated
	 */
	EClass getArduino_Level_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Level_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Level_Execute#getThis()
	 * @see #getArduino_Level_Execute()
	 * @generated
	 */
	EReference getArduino_Level_Execute_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Status_Execute <em>Arduino Status Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Status Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Execute
	 * @generated
	 */
	EClass getArduino_Status_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Status_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Execute#getThis()
	 * @see #getArduino_Status_Execute()
	 * @generated
	 */
	EReference getArduino_Status_Execute_This();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute <em>Arduino Function Call Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Function Call Execute</em>'.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute
	 * @generated
	 */
	EClass getArduino_FunctionCall_Execute();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute#getThis()
	 * @see #getArduino_FunctionCall_Execute()
	 * @generated
	 */
	EReference getArduino_FunctionCall_Execute_This();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute#getSubSteps()
	 * @see #getArduino_FunctionCall_Execute()
	 * @generated
	 */
	EReference getArduino_FunctionCall_Execute_SubSteps();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Status_Call <em>Arduino Status Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Status Call</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Call
	 * @generated
	 */
	EClass getArduino_Status_Call();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Status_Call#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Call#getThis()
	 * @see #getArduino_Status_Call()
	 * @generated
	 */
	EReference getArduino_Status_Call_This();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_Status_Call#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Call#getSubSteps()
	 * @see #getArduino_Status_Call()
	 * @generated
	 */
	EReference getArduino_Status_Call_SubSteps();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Status_Call_AbstractSubStep <em>Arduino Status Call Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Status Call Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Call_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_Status_Call_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Status_Call_FillStep <em>Arduino Status Call Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Status Call Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Status_Call_FillStep
	 * @generated
	 */
	EClass getArduino_Status_Call_FillStep();

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
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Project_Setup <em>Arduino Project Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Project Setup</em>'.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup
	 * @generated
	 */
	EClass getArduino_Project_Setup();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Project_Setup#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Project_Setup#getThis()
	 * @see #getArduino_Project_Setup()
	 * @generated
	 */
	EReference getArduino_Project_Setup_This();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Utilities_Call <em>Arduino Utilities Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Utilities Call</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call
	 * @generated
	 */
	EClass getArduino_Utilities_Call();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.Steps.Arduino_Utilities_Call#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call#getThis()
	 * @see #getArduino_Utilities_Call()
	 * @generated
	 */
	EReference getArduino_Utilities_Call_This();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.Steps.Arduino_Utilities_Call#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call#getSubSteps()
	 * @see #getArduino_Utilities_Call()
	 * @generated
	 */
	EReference getArduino_Utilities_Call_SubSteps();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Utilities_Call_AbstractSubStep <em>Arduino Utilities Call Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Utilities Call Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_Utilities_Call_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_Utilities_Call_FillStep <em>Arduino Utilities Call Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Utilities Call Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_Utilities_Call_FillStep
	 * @generated
	 */
	EClass getArduino_Utilities_Call_FillStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute_AbstractSubStep <em>Arduino Function Call Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Function Call Execute Abstract Sub Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getArduino_FunctionCall_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep <em>Arduino Function Call Execute Fill Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Function Call Execute Fill Step</em>'.
	 * @see arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep
	 * @generated
	 */
	EClass getArduino_FunctionCall_Execute_FillStep();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Set_ExecuteImpl <em>Arduino Set Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Set_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Set_Execute()
		 * @generated
		 */
		EClass ARDUINO_SET_EXECUTE = eINSTANCE.getArduino_Set_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_SET_EXECUTE__THIS = eINSTANCE.getArduino_Set_Execute_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Level_ExecuteImpl <em>Arduino Level Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Level_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Level_Execute()
		 * @generated
		 */
		EClass ARDUINO_LEVEL_EXECUTE = eINSTANCE.getArduino_Level_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_LEVEL_EXECUTE__THIS = eINSTANCE.getArduino_Level_Execute_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Status_ExecuteImpl <em>Arduino Status Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Status_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Execute()
		 * @generated
		 */
		EClass ARDUINO_STATUS_EXECUTE = eINSTANCE.getArduino_Status_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_STATUS_EXECUTE__THIS = eINSTANCE.getArduino_Status_Execute_This();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_FunctionCall_ExecuteImpl <em>Arduino Function Call Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_FunctionCall_ExecuteImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_FunctionCall_Execute()
		 * @generated
		 */
		EClass ARDUINO_FUNCTION_CALL_EXECUTE = eINSTANCE.getArduino_FunctionCall_Execute();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_FUNCTION_CALL_EXECUTE__THIS = eINSTANCE.getArduino_FunctionCall_Execute_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_FUNCTION_CALL_EXECUTE__SUB_STEPS = eINSTANCE.getArduino_FunctionCall_Execute_SubSteps();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Status_CallImpl <em>Arduino Status Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Status_CallImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Call()
		 * @generated
		 */
		EClass ARDUINO_STATUS_CALL = eINSTANCE.getArduino_Status_Call();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_STATUS_CALL__THIS = eINSTANCE.getArduino_Status_Call_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_STATUS_CALL__SUB_STEPS = eINSTANCE.getArduino_Status_Call_SubSteps();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Status_Call_AbstractSubStepImpl <em>Arduino Status Call Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Status_Call_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Call_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_STATUS_CALL_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_Status_Call_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Status_Call_FillStepImpl <em>Arduino Status Call Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Status_Call_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Status_Call_FillStep()
		 * @generated
		 */
		EClass ARDUINO_STATUS_CALL_FILL_STEP = eINSTANCE.getArduino_Status_Call_FillStep();

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
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Project_SetupImpl <em>Arduino Project Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Project_SetupImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Project_Setup()
		 * @generated
		 */
		EClass ARDUINO_PROJECT_SETUP = eINSTANCE.getArduino_Project_Setup();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_PROJECT_SETUP__THIS = eINSTANCE.getArduino_Project_Setup_This();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_CallImpl <em>Arduino Utilities Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Utilities_CallImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Call()
		 * @generated
		 */
		EClass ARDUINO_UTILITIES_CALL = eINSTANCE.getArduino_Utilities_Call();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_UTILITIES_CALL__THIS = eINSTANCE.getArduino_Utilities_Call_This();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_UTILITIES_CALL__SUB_STEPS = eINSTANCE.getArduino_Utilities_Call_SubSteps();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_Call_AbstractSubStepImpl <em>Arduino Utilities Call Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Utilities_Call_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Call_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_UTILITIES_CALL_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_Utilities_Call_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_Utilities_Call_FillStepImpl <em>Arduino Utilities Call Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_Utilities_Call_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_Utilities_Call_FillStep()
		 * @generated
		 */
		EClass ARDUINO_UTILITIES_CALL_FILL_STEP = eINSTANCE.getArduino_Utilities_Call_FillStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_AbstractSubStepImpl <em>Arduino Function Call Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_AbstractSubStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_FunctionCall_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass ARDUINO_FUNCTION_CALL_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getArduino_FunctionCall_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_FillStepImpl <em>Arduino Function Call Execute Fill Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.Steps.impl.Arduino_FunctionCall_Execute_FillStepImpl
		 * @see arduinoTrace.Steps.impl.StepsPackageImpl#getArduino_FunctionCall_Execute_FillStep()
		 * @generated
		 */
		EClass ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP = eINSTANCE.getArduino_FunctionCall_Execute_FillStep();

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

	}

} //StepsPackage

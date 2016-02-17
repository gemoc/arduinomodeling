/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoFactory
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
	String eNS_URI = "http://arduinomt/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.NamedElementImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BoardImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__THREADS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Module <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Module
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PinImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DigitalPinImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getDigitalPin()
	 * @generated
	 */
	int DIGITAL_PIN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__ID = PIN__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__LEVEL = PIN__LEVEL;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__MODULE = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AnalogPinImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getAnalogPin()
	 * @generated
	 */
	int ANALOG_PIN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__ID = PIN__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__LEVEL = PIN__LEVEL;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__MODULE = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SketchImpl <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SketchImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getSketch()
	 * @generated
	 */
	int SKETCH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__THREADS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__CHANNELS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ProjectImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BOARDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SKETCH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LINKS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OWNED_BLOCK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleInstructionImpl <em>Module Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleInstructionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModuleInstruction()
	 * @generated
	 */
	int MODULE_INSTRUCTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__OWNED_BLOCK = INSTRUCTION__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__MODULE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleAssignmentImpl <em>Module Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleAssignmentImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModuleAssignment()
	 * @generated
	 */
	int MODULE_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT__NAME = MODULE_INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT__OWNED_BLOCK = MODULE_INSTRUCTION__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT__MODULE = MODULE_INSTRUCTION__MODULE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT__OPERAND = MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT_FEATURE_COUNT = MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ControlImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OWNED_BLOCK = INSTRUCTION__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__BLOCK = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UtilitiesImpl <em>Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UtilitiesImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUtilities()
	 * @generated
	 */
	int UTILITIES = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES__OWNED_BLOCK = INSTRUCTION__OWNED_BLOCK;

	/**
	 * The number of structural features of the '<em>Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DelayImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NAME = UTILITIES__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__OWNED_BLOCK = UTILITIES__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__UNIT = UTILITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__VALUE = UTILITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = UTILITIES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RepeatImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_BLOCK = CONTROL__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__BLOCK = CONTROL__BLOCK;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ITERATION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleGetImpl <em>Module Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleGetImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModuleGet()
	 * @generated
	 */
	int MODULE_GET = 15;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_GET__MODULE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_GET_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.WhileImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__OWNED_BLOCK = CONTROL__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOCK = CONTROL__BLOCK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableAssignmentImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__OWNED_BLOCK = INSTRUCTION__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__OPERAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VARIABLE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryIntegerExpressionImpl <em>Binary Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryIntegerExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryIntegerExpression()
	 * @generated
	 */
	int BINARY_INTEGER_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryBooleanExpressionImpl <em>Binary Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryBooleanExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryBooleanExpression()
	 * @generated
	 */
	int BINARY_BOOLEAN_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ConstantImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 23;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IfImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIf()
	 * @generated
	 */
	int IF = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__OWNED_BLOCK = CONTROL__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BLOCK = CONTROL__BLOCK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BLOCK = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerConstantImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanConstantImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 27;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 28;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AssignmentImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OWNED_BLOCK = INSTRUCTION__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerVariableImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanVariableImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanModuleGetImpl <em>Boolean Module Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanModuleGetImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanModuleGet()
	 * @generated
	 */
	int BOOLEAN_MODULE_GET = 32;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MODULE_GET__MODULE = MODULE_GET__MODULE;

	/**
	 * The number of structural features of the '<em>Boolean Module Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MODULE_GET_FEATURE_COUNT = MODULE_GET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerModuleGetImpl <em>Integer Module Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerModuleGetImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerModuleGet()
	 * @generated
	 */
	int INTEGER_MODULE_GET = 33;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MODULE_GET__MODULE = MODULE_GET__MODULE;

	/**
	 * The number of structural features of the '<em>Integer Module Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MODULE_GET_FEATURE_COUNT = MODULE_GET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryBooleanExpressionImpl <em>Unary Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryBooleanExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryBooleanExpression()
	 * @generated
	 */
	int UNARY_BOOLEAN_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION__OPERATOR = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryIntegerExpressionImpl <em>Unary Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryIntegerExpressionImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryIntegerExpression()
	 * @generated
	 */
	int UNARY_INTEGER_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION__OPERATOR = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableDeclarationImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__OWNED_BLOCK = INSTRUCTION__OWNED_BLOCK;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableRefImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 38;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoModuleImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoModule()
	 * @generated
	 */
	int ARDUINO_MODULE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE__LEVEL = MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoDigitalModuleImpl <em>Digital Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoDigitalModuleImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoDigitalModule()
	 * @generated
	 */
	int ARDUINO_DIGITAL_MODULE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE__NAME = ARDUINO_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE__LEVEL = ARDUINO_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Digital Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE_FEATURE_COUNT = ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LEDImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getLED()
	 * @generated
	 */
	int LED = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__LEVEL = ARDUINO_DIGITAL_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PushButtonImpl <em>Push Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PushButtonImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getPushButton()
	 * @generated
	 */
	int PUSH_BUTTON = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__LEVEL = ARDUINO_DIGITAL_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BuzzerImpl <em>Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BuzzerImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBuzzer()
	 * @generated
	 */
	int BUZZER = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__LEVEL = ARDUINO_DIGITAL_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoAnalogModuleImpl <em>Analog Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoAnalogModuleImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoAnalogModule()
	 * @generated
	 */
	int ARDUINO_ANALOG_MODULE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE__NAME = ARDUINO_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE__LEVEL = ARDUINO_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Analog Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE_FEATURE_COUNT = ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RotationSensorImpl <em>Rotation Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RotationSensorImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getRotationSensor()
	 * @generated
	 */
	int ROTATION_SENSOR = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SENSOR__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SENSOR__LEVEL = ARDUINO_ANALOG_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Rotation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SENSOR_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MicroServoImpl <em>Micro Servo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MicroServoImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getMicroServo()
	 * @generated
	 */
	int MICRO_SERVO = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVO__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVO__LEVEL = ARDUINO_DIGITAL_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Micro Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVO_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InfraRedSensorImpl <em>Infra Red Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InfraRedSensorImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getInfraRedSensor()
	 * @generated
	 */
	int INFRA_RED_SENSOR = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRA_RED_SENSOR__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRA_RED_SENSOR__LEVEL = ARDUINO_DIGITAL_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Infra Red Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRA_RED_SENSOR_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AmbientLightSensorImpl <em>Ambient Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AmbientLightSensorImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getAmbientLightSensor()
	 * @generated
	 */
	int AMBIENT_LIGHT_SENSOR = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_SENSOR__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_SENSOR__LEVEL = ARDUINO_ANALOG_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Ambient Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_SENSOR_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SoundSensorImpl <em>Sound Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SoundSensorImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getSoundSensor()
	 * @generated
	 */
	int SOUND_SENSOR = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_SENSOR__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_SENSOR__LEVEL = ARDUINO_ANALOG_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Sound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_SENSOR_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.FanImpl <em>Fan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.FanImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getFan()
	 * @generated
	 */
	int FAN = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__LEVEL = ARDUINO_DIGITAL_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Fan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MusicPlayerImpl <em>Music Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MusicPlayerImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getMusicPlayer()
	 * @generated
	 */
	int MUSIC_PLAYER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_PLAYER__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_PLAYER__LEVEL = ARDUINO_ANALOG_MODULE__LEVEL;

	/**
	 * The number of structural features of the '<em>Music Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_PLAYER_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoBoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoBoardImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoBoard()
	 * @generated
	 */
	int ARDUINO_BOARD = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__NAME = BOARD__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__PROJECT = BOARD__PROJECT;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__THREADS = BOARD__THREADS;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__DIGITAL_PINS = BOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__ANALOG_PINS = BOARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD_FEATURE_COUNT = BOARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__BLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__CHANNELS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__CYCLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__CURRENT_INSTRUCTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__FIRST = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__LAST = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ChannelImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__IN_RATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__OUT_RATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CAPACITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CURRENT_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LinkImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>In Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IN_BOARD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUT_BOARD = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadInstructionBlockImpl <em>Thread Instruction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadInstructionBlockImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getThreadInstructionBlock()
	 * @generated
	 */
	int THREAD_INSTRUCTION_BLOCK = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INSTRUCTION_BLOCK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INSTRUCTION_BLOCK__THREAD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thread Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SynchronizationBlockImpl <em>Synchronization Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SynchronizationBlockImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getSynchronizationBlock()
	 * @generated
	 */
	int SYNCHRONIZATION_BLOCK = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_BLOCK__NAME = THREAD_INSTRUCTION_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_BLOCK__THREAD = THREAD_INSTRUCTION_BLOCK__THREAD;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_BLOCK__NEXT = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_BLOCK__PREVIOUS = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_BLOCK_FEATURE_COUNT = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionBlockImpl
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getInstructionBlock()
	 * @generated
	 */
	int INSTRUCTION_BLOCK = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__NAME = THREAD_INSTRUCTION_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__THREAD = THREAD_INSTRUCTION_BLOCK__THREAD;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__INSTRUCTIONS = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__NEXT = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK__PREVIOUS = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_BLOCK_FEATURE_COUNT = THREAD_INSTRUCTION_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Time <em>Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Time
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 59;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind <em>Binary Integer Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryIntegerOperatorKind()
	 * @generated
	 */
	int BINARY_INTEGER_OPERATOR_KIND = 60;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind <em>Binary Boolean Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryBooleanOperatorKind()
	 * @generated
	 */
	int BINARY_BOOLEAN_OPERATOR_KIND = 61;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind <em>Unary Integer Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryIntegerOperatorKind()
	 * @generated
	 */
	int UNARY_INTEGER_OPERATOR_KIND = 62;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind <em>Unary Boolean Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryBooleanOperatorKind()
	 * @generated
	 */
	int UNARY_BOOLEAN_OPERATOR_KIND = 63;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 64;


	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getProject()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Project();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threads</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getThreads()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Threads();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Module#isLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Module#isLevel()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Level();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Pin</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin
	 * @generated
	 */
	EClass getDigitalPin();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin#getModule()
	 * @see #getDigitalPin()
	 * @generated
	 */
	EReference getDigitalPin_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Pin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Pin#getId()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Pin#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Pin#getLevel()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Level();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Pin</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin
	 * @generated
	 */
	EClass getAnalogPin();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin#getModule()
	 * @see #getAnalogPin()
	 * @generated
	 */
	EReference getAnalogPin_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch
	 * @generated
	 */
	EClass getSketch();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getProject()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threads</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getThreads()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Threads();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getChannels()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Channels();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getBoards()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Boards();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getSketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sketch</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getSketch()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Sketch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getLinks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Links();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Block</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction#getOwnedBlock()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_OwnedBlock();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleAssignment <em>Module Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Assignment</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleAssignment
	 * @generated
	 */
	EClass getModuleAssignment();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction <em>Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instruction</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction
	 * @generated
	 */
	EClass getModuleInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction#getModule()
	 * @see #getModuleInstruction()
	 * @generated
	 */
	EReference getModuleInstruction_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Control#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Control#getBlock()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Block();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Utilities <em>Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilities</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Utilities
	 * @generated
	 */
	EClass getUtilities();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Delay#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Delay#getUnit()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Delay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Delay#getValue()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat#getIteration()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_Iteration();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet <em>Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Get</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet
	 * @generated
	 */
	EClass getModuleGet();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet#getModule()
	 * @see #getModuleGet()
	 * @generated
	 */
	EReference getModuleGet_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment#getVariable()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression <em>Binary Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression
	 * @generated
	 */
	EClass getBinaryIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression#getOperator()
	 * @see #getBinaryIntegerExpression()
	 * @generated
	 */
	EAttribute getBinaryIntegerExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression <em>Binary Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression
	 * @generated
	 */
	EClass getBinaryBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression#getOperator()
	 * @see #getBinaryBooleanExpression()
	 * @generated
	 */
	EAttribute getBinaryBooleanExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.If#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.If#getElseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment#getOperand()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable#getInitialValue()
	 * @see #getIntegerVariable()
	 * @generated
	 */
	EAttribute getIntegerVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable#getValue()
	 * @see #getIntegerVariable()
	 * @generated
	 */
	EAttribute getIntegerVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable#isInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable#isInitialValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable#getValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanModuleGet <em>Boolean Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Module Get</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanModuleGet
	 * @generated
	 */
	EClass getBooleanModuleGet();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet <em>Integer Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Module Get</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet
	 * @generated
	 */
	EClass getIntegerModuleGet();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression <em>Unary Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression
	 * @generated
	 */
	EClass getUnaryBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression#getOperator()
	 * @see #getUnaryBooleanExpression()
	 * @generated
	 */
	EAttribute getUnaryBooleanExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression <em>Unary Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Expression</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression
	 * @generated
	 */
	EClass getUnaryIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression#getOperator()
	 * @see #getUnaryIntegerExpression()
	 * @generated
	 */
	EAttribute getUnaryIntegerExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration#getVariable()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.PushButton <em>Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Button</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.PushButton
	 * @generated
	 */
	EClass getPushButton();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzzer</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Buzzer
	 * @generated
	 */
	EClass getBuzzer();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.RotationSensor <em>Rotation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Sensor</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.RotationSensor
	 * @generated
	 */
	EClass getRotationSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.MicroServo <em>Micro Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Servo</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.MicroServo
	 * @generated
	 */
	EClass getMicroServo();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InfraRedSensor <em>Infra Red Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infra Red Sensor</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InfraRedSensor
	 * @generated
	 */
	EClass getInfraRedSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.AmbientLightSensor <em>Ambient Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambient Light Sensor</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.AmbientLightSensor
	 * @generated
	 */
	EClass getAmbientLightSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SoundSensor <em>Sound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Sensor</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SoundSensor
	 * @generated
	 */
	EClass getSoundSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fan</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Fan
	 * @generated
	 */
	EClass getFan();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.MusicPlayer <em>Music Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Player</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.MusicPlayer
	 * @generated
	 */
	EClass getMusicPlayer();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoModule
	 * @generated
	 */
	EClass getArduinoModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard
	 * @generated
	 */
	EClass getArduinoBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard#getDigitalPins <em>Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Pins</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard#getDigitalPins()
	 * @see #getArduinoBoard()
	 * @generated
	 */
	EReference getArduinoBoard_DigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard#getAnalogPins <em>Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analog Pins</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard#getAnalogPins()
	 * @see #getArduinoBoard()
	 * @generated
	 */
	EReference getArduinoBoard_AnalogPins();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoDigitalModule <em>Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoDigitalModule
	 * @generated
	 */
	EClass getArduinoDigitalModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoAnalogModule <em>Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Module</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoAnalogModule
	 * @generated
	 */
	EClass getArduinoAnalogModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getBlocks()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Blocks();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getChannels()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Channels();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycles</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getCycles()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Cycles();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getCurrentInstruction <em>Current Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Instruction</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getCurrentInstruction()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_CurrentInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getFirst()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_First();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getLast()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Last();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getSource()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getTarget()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getInRate <em>In Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Rate</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getInRate()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_InRate();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getOutRate <em>Out Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Rate</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getOutRate()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_OutRate();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCapacity()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCurrentSize <em>Current Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Size</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCurrentSize()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_CurrentSize();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getInBoard <em>In Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Board</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getInBoard()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_InBoard();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getOutBoard <em>Out Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Board</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getOutBoard()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_OutBoard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock <em>Synchronization Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Block</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock
	 * @generated
	 */
	EClass getSynchronizationBlock();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getNext()
	 * @see #getSynchronizationBlock()
	 * @generated
	 */
	EReference getSynchronizationBlock_Next();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getPrevious()
	 * @see #getSynchronizationBlock()
	 * @generated
	 */
	EReference getSynchronizationBlock_Previous();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Block</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock
	 * @generated
	 */
	EClass getInstructionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getInstructions()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Instructions();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getNext()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Next();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getPrevious()
	 * @see #getInstructionBlock()
	 * @generated
	 */
	EReference getInstructionBlock_Previous();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock <em>Thread Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Instruction Block</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock
	 * @generated
	 */
	EClass getThreadInstructionBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Thread</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getThread()
	 * @see #getThreadInstructionBlock()
	 * @generated
	 */
	EReference getThreadInstructionBlock_Thread();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Time
	 * @generated
	 */
	EEnum getTime();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind <em>Binary Integer Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Integer Operator Kind</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind
	 * @generated
	 */
	EEnum getBinaryIntegerOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind <em>Binary Boolean Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Boolean Operator Kind</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind
	 * @generated
	 */
	EEnum getBinaryBooleanOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind <em>Unary Integer Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Integer Operator Kind</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind
	 * @generated
	 */
	EEnum getUnaryIntegerOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind <em>Unary Boolean Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Boolean Operator Kind</em>'.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind
	 * @generated
	 */
	EEnum getUnaryBooleanOperatorKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BoardImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PROJECT = eINSTANCE.getBoard_Project();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__THREADS = eINSTANCE.getBoard_Threads();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Module <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Module
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__LEVEL = eINSTANCE.getModule_Level();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DigitalPinImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getDigitalPin()
		 * @generated
		 */
		EClass DIGITAL_PIN = eINSTANCE.getDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_PIN__MODULE = eINSTANCE.getDigitalPin_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PinImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__ID = eINSTANCE.getPin_Id();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__LEVEL = eINSTANCE.getPin_Level();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AnalogPinImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getAnalogPin()
		 * @generated
		 */
		EClass ANALOG_PIN = eINSTANCE.getAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_PIN__MODULE = eINSTANCE.getAnalogPin_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SketchImpl <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SketchImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getSketch()
		 * @generated
		 */
		EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__PROJECT = eINSTANCE.getSketch_Project();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__THREADS = eINSTANCE.getSketch_Threads();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__CHANNELS = eINSTANCE.getSketch_Channels();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ProjectImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BOARDS = eINSTANCE.getProject_Boards();

		/**
		 * The meta object literal for the '<em><b>Sketch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SKETCH = eINSTANCE.getProject_Sketch();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LINKS = eINSTANCE.getProject_Links();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Owned Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__OWNED_BLOCK = eINSTANCE.getInstruction_OwnedBlock();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleAssignmentImpl <em>Module Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleAssignmentImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModuleAssignment()
		 * @generated
		 */
		EClass MODULE_ASSIGNMENT = eINSTANCE.getModuleAssignment();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleInstructionImpl <em>Module Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleInstructionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModuleInstruction()
		 * @generated
		 */
		EClass MODULE_INSTRUCTION = eINSTANCE.getModuleInstruction();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTRUCTION__MODULE = eINSTANCE.getModuleInstruction_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ControlImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__BLOCK = eINSTANCE.getControl_Block();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UtilitiesImpl <em>Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UtilitiesImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUtilities()
		 * @generated
		 */
		EClass UTILITIES = eINSTANCE.getUtilities();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.DelayImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__UNIT = eINSTANCE.getDelay_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__VALUE = eINSTANCE.getDelay_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.NamedElementImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RepeatImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__ITERATION = eINSTANCE.getRepeat_Iteration();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleGetImpl <em>Module Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ModuleGetImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getModuleGet()
		 * @generated
		 */
		EClass MODULE_GET = eINSTANCE.getModuleGet();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_GET__MODULE = eINSTANCE.getModuleGet_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.WhileImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableAssignmentImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__VARIABLE = eINSTANCE.getVariableAssignment_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryIntegerExpressionImpl <em>Binary Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryIntegerExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryIntegerExpression()
		 * @generated
		 */
		EClass BINARY_INTEGER_EXPRESSION = eINSTANCE.getBinaryIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_INTEGER_EXPRESSION__OPERATOR = eINSTANCE.getBinaryIntegerExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryBooleanExpressionImpl <em>Binary Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BinaryBooleanExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryBooleanExpression()
		 * @generated
		 */
		EClass BINARY_BOOLEAN_EXPRESSION = eINSTANCE.getBinaryBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_BOOLEAN_EXPRESSION__OPERATOR = eINSTANCE.getBinaryBooleanExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ConstantImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IfImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BLOCK = eINSTANCE.getIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerConstantImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanConstantImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AssignmentImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__OPERAND = eINSTANCE.getAssignment_Operand();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerVariableImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE__INITIAL_VALUE = eINSTANCE.getIntegerVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE__VALUE = eINSTANCE.getIntegerVariable_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanVariableImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__INITIAL_VALUE = eINSTANCE.getBooleanVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__VALUE = eINSTANCE.getBooleanVariable_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanModuleGetImpl <em>Boolean Module Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BooleanModuleGetImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBooleanModuleGet()
		 * @generated
		 */
		EClass BOOLEAN_MODULE_GET = eINSTANCE.getBooleanModuleGet();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerModuleGetImpl <em>Integer Module Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.IntegerModuleGetImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getIntegerModuleGet()
		 * @generated
		 */
		EClass INTEGER_MODULE_GET = eINSTANCE.getIntegerModuleGet();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryBooleanExpressionImpl <em>Unary Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryBooleanExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryBooleanExpression()
		 * @generated
		 */
		EClass UNARY_BOOLEAN_EXPRESSION = eINSTANCE.getUnaryBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_BOOLEAN_EXPRESSION__OPERATOR = eINSTANCE.getUnaryBooleanExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryIntegerExpressionImpl <em>Unary Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.UnaryIntegerExpressionImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryIntegerExpression()
		 * @generated
		 */
		EClass UNARY_INTEGER_EXPRESSION = eINSTANCE.getUnaryIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_INTEGER_EXPRESSION__OPERATOR = eINSTANCE.getUnaryIntegerExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableDeclarationImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getVariableDeclaration_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.VariableRefImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LEDImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PushButtonImpl <em>Push Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.PushButtonImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getPushButton()
		 * @generated
		 */
		EClass PUSH_BUTTON = eINSTANCE.getPushButton();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BuzzerImpl <em>Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.BuzzerImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBuzzer()
		 * @generated
		 */
		EClass BUZZER = eINSTANCE.getBuzzer();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RotationSensorImpl <em>Rotation Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.RotationSensorImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getRotationSensor()
		 * @generated
		 */
		EClass ROTATION_SENSOR = eINSTANCE.getRotationSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MicroServoImpl <em>Micro Servo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MicroServoImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getMicroServo()
		 * @generated
		 */
		EClass MICRO_SERVO = eINSTANCE.getMicroServo();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InfraRedSensorImpl <em>Infra Red Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InfraRedSensorImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getInfraRedSensor()
		 * @generated
		 */
		EClass INFRA_RED_SENSOR = eINSTANCE.getInfraRedSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AmbientLightSensorImpl <em>Ambient Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.AmbientLightSensorImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getAmbientLightSensor()
		 * @generated
		 */
		EClass AMBIENT_LIGHT_SENSOR = eINSTANCE.getAmbientLightSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SoundSensorImpl <em>Sound Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SoundSensorImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getSoundSensor()
		 * @generated
		 */
		EClass SOUND_SENSOR = eINSTANCE.getSoundSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.FanImpl <em>Fan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.FanImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getFan()
		 * @generated
		 */
		EClass FAN = eINSTANCE.getFan();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MusicPlayerImpl <em>Music Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.MusicPlayerImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getMusicPlayer()
		 * @generated
		 */
		EClass MUSIC_PLAYER = eINSTANCE.getMusicPlayer();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoModuleImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoModule()
		 * @generated
		 */
		EClass ARDUINO_MODULE = eINSTANCE.getArduinoModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoBoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoBoardImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoBoard()
		 * @generated
		 */
		EClass ARDUINO_BOARD = eINSTANCE.getArduinoBoard();

		/**
		 * The meta object literal for the '<em><b>Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_BOARD__DIGITAL_PINS = eINSTANCE.getArduinoBoard_DigitalPins();

		/**
		 * The meta object literal for the '<em><b>Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_BOARD__ANALOG_PINS = eINSTANCE.getArduinoBoard_AnalogPins();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoDigitalModuleImpl <em>Digital Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoDigitalModuleImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoDigitalModule()
		 * @generated
		 */
		EClass ARDUINO_DIGITAL_MODULE = eINSTANCE.getArduinoDigitalModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoAnalogModuleImpl <em>Analog Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoAnalogModuleImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getArduinoAnalogModule()
		 * @generated
		 */
		EClass ARDUINO_ANALOG_MODULE = eINSTANCE.getArduinoAnalogModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__BLOCKS = eINSTANCE.getThread_Blocks();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__CHANNELS = eINSTANCE.getThread_Channels();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__CYCLES = eINSTANCE.getThread_Cycles();

		/**
		 * The meta object literal for the '<em><b>Current Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__CURRENT_INSTRUCTION = eINSTANCE.getThread_CurrentInstruction();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__FIRST = eINSTANCE.getThread_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__LAST = eINSTANCE.getThread_Last();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ChannelImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__SOURCE = eINSTANCE.getChannel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__TARGET = eINSTANCE.getChannel_Target();

		/**
		 * The meta object literal for the '<em><b>In Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__IN_RATE = eINSTANCE.getChannel_InRate();

		/**
		 * The meta object literal for the '<em><b>Out Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__OUT_RATE = eINSTANCE.getChannel_OutRate();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CAPACITY = eINSTANCE.getChannel_Capacity();

		/**
		 * The meta object literal for the '<em><b>Current Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CURRENT_SIZE = eINSTANCE.getChannel_CurrentSize();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.LinkImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>In Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__IN_BOARD = eINSTANCE.getLink_InBoard();

		/**
		 * The meta object literal for the '<em><b>Out Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__OUT_BOARD = eINSTANCE.getLink_OutBoard();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SynchronizationBlockImpl <em>Synchronization Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.SynchronizationBlockImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getSynchronizationBlock()
		 * @generated
		 */
		EClass SYNCHRONIZATION_BLOCK = eINSTANCE.getSynchronizationBlock();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_BLOCK__NEXT = eINSTANCE.getSynchronizationBlock_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_BLOCK__PREVIOUS = eINSTANCE.getSynchronizationBlock_Previous();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionBlockImpl <em>Instruction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.InstructionBlockImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getInstructionBlock()
		 * @generated
		 */
		EClass INSTRUCTION_BLOCK = eINSTANCE.getInstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__INSTRUCTIONS = eINSTANCE.getInstructionBlock_Instructions();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__NEXT = eINSTANCE.getInstructionBlock_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_BLOCK__PREVIOUS = eINSTANCE.getInstructionBlock_Previous();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadInstructionBlockImpl <em>Thread Instruction Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ThreadInstructionBlockImpl
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getThreadInstructionBlock()
		 * @generated
		 */
		EClass THREAD_INSTRUCTION_BLOCK = eINSTANCE.getThreadInstructionBlock();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD_INSTRUCTION_BLOCK__THREAD = eINSTANCE.getThreadInstructionBlock_Thread();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Time <em>Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Time
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getTime()
		 * @generated
		 */
		EEnum TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind <em>Binary Integer Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryIntegerOperatorKind()
		 * @generated
		 */
		EEnum BINARY_INTEGER_OPERATOR_KIND = eINSTANCE.getBinaryIntegerOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind <em>Binary Boolean Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getBinaryBooleanOperatorKind()
		 * @generated
		 */
		EEnum BINARY_BOOLEAN_OPERATOR_KIND = eINSTANCE.getBinaryBooleanOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind <em>Unary Integer Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryIntegerOperatorKind()
		 * @generated
		 */
		EEnum UNARY_INTEGER_OPERATOR_KIND = eINSTANCE.getUnaryIntegerOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind <em>Unary Boolean Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getUnaryBooleanOperatorKind()
		 * @generated
		 */
		EEnum UNARY_BOOLEAN_OPERATOR_KIND = eINSTANCE.getUnaryBooleanOperatorKind();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.impl.ArduinoPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //ArduinoPackage

/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.arduino.xdsml.arduinomt.arduino.AmbientLightSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoFactory;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanModuleGet;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Buzzer;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Channel;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Delay;
import org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Fan;
import org.gemoc.arduino.xdsml.arduinomt.arduino.If;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InfraRedSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable;
import org.gemoc.arduino.xdsml.arduinomt.arduino.LED;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Link;
import org.gemoc.arduino.xdsml.arduinomt.arduino.MicroServo;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleAssignment;
import org.gemoc.arduino.xdsml.arduinomt.arduino.MusicPlayer;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Project;
import org.gemoc.arduino.xdsml.arduinomt.arduino.PushButton;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat;
import org.gemoc.arduino.xdsml.arduinomt.arduino.RotationSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch;
import org.gemoc.arduino.xdsml.arduinomt.arduino.SoundSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Time;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanOperatorKind;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerOperatorKind;
import org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment;
import org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration;
import org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef;
import org.gemoc.arduino.xdsml.arduinomt.arduino.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoFactoryImpl extends EFactoryImpl implements ArduinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoFactory init() {
		try {
			ArduinoFactory theArduinoFactory = (ArduinoFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoPackage.eNS_URI);
			if (theArduinoFactory != null) {
				return theArduinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArduinoPackage.DIGITAL_PIN: return createDigitalPin();
			case ArduinoPackage.ANALOG_PIN: return createAnalogPin();
			case ArduinoPackage.SKETCH: return createSketch();
			case ArduinoPackage.PROJECT: return createProject();
			case ArduinoPackage.MODULE_ASSIGNMENT: return createModuleAssignment();
			case ArduinoPackage.DELAY: return createDelay();
			case ArduinoPackage.REPEAT: return createRepeat();
			case ArduinoPackage.WHILE: return createWhile();
			case ArduinoPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case ArduinoPackage.BINARY_INTEGER_EXPRESSION: return createBinaryIntegerExpression();
			case ArduinoPackage.BINARY_BOOLEAN_EXPRESSION: return createBinaryBooleanExpression();
			case ArduinoPackage.IF: return createIf();
			case ArduinoPackage.INTEGER_CONSTANT: return createIntegerConstant();
			case ArduinoPackage.BOOLEAN_CONSTANT: return createBooleanConstant();
			case ArduinoPackage.INTEGER_VARIABLE: return createIntegerVariable();
			case ArduinoPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case ArduinoPackage.BOOLEAN_MODULE_GET: return createBooleanModuleGet();
			case ArduinoPackage.INTEGER_MODULE_GET: return createIntegerModuleGet();
			case ArduinoPackage.UNARY_BOOLEAN_EXPRESSION: return createUnaryBooleanExpression();
			case ArduinoPackage.UNARY_INTEGER_EXPRESSION: return createUnaryIntegerExpression();
			case ArduinoPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case ArduinoPackage.VARIABLE_REF: return createVariableRef();
			case ArduinoPackage.LED: return createLED();
			case ArduinoPackage.PUSH_BUTTON: return createPushButton();
			case ArduinoPackage.BUZZER: return createBuzzer();
			case ArduinoPackage.ROTATION_SENSOR: return createRotationSensor();
			case ArduinoPackage.MICRO_SERVO: return createMicroServo();
			case ArduinoPackage.INFRA_RED_SENSOR: return createInfraRedSensor();
			case ArduinoPackage.AMBIENT_LIGHT_SENSOR: return createAmbientLightSensor();
			case ArduinoPackage.SOUND_SENSOR: return createSoundSensor();
			case ArduinoPackage.FAN: return createFan();
			case ArduinoPackage.MUSIC_PLAYER: return createMusicPlayer();
			case ArduinoPackage.ARDUINO_BOARD: return createArduinoBoard();
			case ArduinoPackage.THREAD: return createThread();
			case ArduinoPackage.CHANNEL: return createChannel();
			case ArduinoPackage.LINK: return createLink();
			case ArduinoPackage.SYNCHRONIZATION_BLOCK: return createSynchronizationBlock();
			case ArduinoPackage.INSTRUCTION_BLOCK: return createInstructionBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			case ArduinoPackage.BINARY_INTEGER_OPERATOR_KIND:
				return createBinaryIntegerOperatorKindFromString(eDataType, initialValue);
			case ArduinoPackage.BINARY_BOOLEAN_OPERATOR_KIND:
				return createBinaryBooleanOperatorKindFromString(eDataType, initialValue);
			case ArduinoPackage.UNARY_INTEGER_OPERATOR_KIND:
				return createUnaryIntegerOperatorKindFromString(eDataType, initialValue);
			case ArduinoPackage.UNARY_BOOLEAN_OPERATOR_KIND:
				return createUnaryBooleanOperatorKindFromString(eDataType, initialValue);
			case ArduinoPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			case ArduinoPackage.BINARY_INTEGER_OPERATOR_KIND:
				return convertBinaryIntegerOperatorKindToString(eDataType, instanceValue);
			case ArduinoPackage.BINARY_BOOLEAN_OPERATOR_KIND:
				return convertBinaryBooleanOperatorKindToString(eDataType, instanceValue);
			case ArduinoPackage.UNARY_INTEGER_OPERATOR_KIND:
				return convertUnaryIntegerOperatorKindToString(eDataType, instanceValue);
			case ArduinoPackage.UNARY_BOOLEAN_OPERATOR_KIND:
				return convertUnaryBooleanOperatorKindToString(eDataType, instanceValue);
			case ArduinoPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalPin createDigitalPin() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogPin createAnalogPin() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch createSketch() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleAssignment createModuleAssignment() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment createVariableAssignment() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerExpression createBinaryIntegerExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanExpression createBinaryBooleanExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstant createIntegerConstant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstant createBooleanConstant() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable createIntegerVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanModuleGet createBooleanModuleGet() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerModuleGet createIntegerModuleGet() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanExpression createUnaryBooleanExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerExpression createUnaryIntegerExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButton createPushButton() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buzzer createBuzzer() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationSensor createRotationSensor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroServo createMicroServo() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfraRedSensor createInfraRedSensor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbientLightSensor createAmbientLightSensor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundSensor createSoundSensor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fan createFan() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicPlayer createMusicPlayer() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoBoard createArduinoBoard() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.arduino.xdsml.arduinomt.arduino.Thread createThread() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationBlock createSynchronizationBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionBlock createInstructionBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTimeFromString(EDataType eDataType, String initialValue) {
		Time result = Time.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerOperatorKind createBinaryIntegerOperatorKindFromString(EDataType eDataType, String initialValue) {
		BinaryIntegerOperatorKind result = BinaryIntegerOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryIntegerOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanOperatorKind createBinaryBooleanOperatorKindFromString(EDataType eDataType, String initialValue) {
		BinaryBooleanOperatorKind result = BinaryBooleanOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryBooleanOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerOperatorKind createUnaryIntegerOperatorKindFromString(EDataType eDataType, String initialValue) {
		UnaryIntegerOperatorKind result = UnaryIntegerOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryIntegerOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanOperatorKind createUnaryBooleanOperatorKindFromString(EDataType eDataType, String initialValue) {
		UnaryBooleanOperatorKind result = UnaryBooleanOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryBooleanOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoPackage getArduinoPackage() {
		return (ArduinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoPackage getPackage() {
		return ArduinoPackage.eINSTANCE;
	}

} //ArduinoFactoryImpl

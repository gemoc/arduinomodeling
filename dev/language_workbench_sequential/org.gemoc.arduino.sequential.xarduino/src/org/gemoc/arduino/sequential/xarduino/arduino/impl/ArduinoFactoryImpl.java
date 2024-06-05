/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.arduino.sequential.xarduino.arduino.AmbientLightSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.AnalogPin;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoBoard;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoFactory;
import org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.sequential.xarduino.arduino.Block;
import org.gemoc.arduino.sequential.xarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.BooleanVariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.Buzzer;
import org.gemoc.arduino.sequential.xarduino.arduino.Color;
import org.gemoc.arduino.sequential.xarduino.arduino.Delay;
import org.gemoc.arduino.sequential.xarduino.arduino.DigitalPin;
import org.gemoc.arduino.sequential.xarduino.arduino.Fan;
import org.gemoc.arduino.sequential.xarduino.arduino.If;
import org.gemoc.arduino.sequential.xarduino.arduino.InfraRedSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerConstant;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.xarduino.arduino.IntegerVariableRef;
import org.gemoc.arduino.sequential.xarduino.arduino.LED;
import org.gemoc.arduino.sequential.xarduino.arduino.MicroServo;
import org.gemoc.arduino.sequential.xarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.xarduino.arduino.MusicPlayer;
import org.gemoc.arduino.sequential.xarduino.arduino.Project;
import org.gemoc.arduino.sequential.xarduino.arduino.PushButton;
import org.gemoc.arduino.sequential.xarduino.arduino.Repeat;
import org.gemoc.arduino.sequential.xarduino.arduino.RotationSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.Sketch;
import org.gemoc.arduino.sequential.xarduino.arduino.SoundSensor;
import org.gemoc.arduino.sequential.xarduino.arduino.Time;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryBooleanOperatorKind;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerOperatorKind;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableAssignment;
import org.gemoc.arduino.sequential.xarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.sequential.xarduino.arduino.While;

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
			case ArduinoPackage.INTEGER_VARIABLE_REF: return createIntegerVariableRef();
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
			case ArduinoPackage.BLOCK: return createBlock();
			case ArduinoPackage.ARDUINO_BOARD: return createArduinoBoard();
			case ArduinoPackage.BOOLEAN_VARIABLE_REF: return createBooleanVariableRef();
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER: return createBluetoothTransceiver();
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
			case ArduinoPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
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
			case ArduinoPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
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
	@Override
	public DigitalPin createDigitalPin() {
		DigitalPinImpl digitalPin = new DigitalPinImpl();
		return digitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalogPin createAnalogPin() {
		AnalogPinImpl analogPin = new AnalogPinImpl();
		return analogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sketch createSketch() {
		SketchImpl sketch = new SketchImpl();
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleAssignment createModuleAssignment() {
		ModuleAssignmentImpl moduleAssignment = new ModuleAssignmentImpl();
		return moduleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryIntegerExpression createBinaryIntegerExpression() {
		BinaryIntegerExpressionImpl binaryIntegerExpression = new BinaryIntegerExpressionImpl();
		return binaryIntegerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryBooleanExpression createBinaryBooleanExpression() {
		BinaryBooleanExpressionImpl binaryBooleanExpression = new BinaryBooleanExpressionImpl();
		return binaryBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanConstant createBooleanConstant() {
		BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
		return booleanConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanModuleGet createBooleanModuleGet() {
		BooleanModuleGetImpl booleanModuleGet = new BooleanModuleGetImpl();
		return booleanModuleGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerModuleGet createIntegerModuleGet() {
		IntegerModuleGetImpl integerModuleGet = new IntegerModuleGetImpl();
		return integerModuleGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryBooleanExpression createUnaryBooleanExpression() {
		UnaryBooleanExpressionImpl unaryBooleanExpression = new UnaryBooleanExpressionImpl();
		return unaryBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryIntegerExpression createUnaryIntegerExpression() {
		UnaryIntegerExpressionImpl unaryIntegerExpression = new UnaryIntegerExpressionImpl();
		return unaryIntegerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerVariableRef createIntegerVariableRef() {
		IntegerVariableRefImpl integerVariableRef = new IntegerVariableRefImpl();
		return integerVariableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushButton createPushButton() {
		PushButtonImpl pushButton = new PushButtonImpl();
		return pushButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Buzzer createBuzzer() {
		BuzzerImpl buzzer = new BuzzerImpl();
		return buzzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotationSensor createRotationSensor() {
		RotationSensorImpl rotationSensor = new RotationSensorImpl();
		return rotationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroServo createMicroServo() {
		MicroServoImpl microServo = new MicroServoImpl();
		return microServo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfraRedSensor createInfraRedSensor() {
		InfraRedSensorImpl infraRedSensor = new InfraRedSensorImpl();
		return infraRedSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmbientLightSensor createAmbientLightSensor() {
		AmbientLightSensorImpl ambientLightSensor = new AmbientLightSensorImpl();
		return ambientLightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoundSensor createSoundSensor() {
		SoundSensorImpl soundSensor = new SoundSensorImpl();
		return soundSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fan createFan() {
		FanImpl fan = new FanImpl();
		return fan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicPlayer createMusicPlayer() {
		MusicPlayerImpl musicPlayer = new MusicPlayerImpl();
		return musicPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoBoard createArduinoBoard() {
		ArduinoBoardImpl arduinoBoard = new ArduinoBoardImpl();
		return arduinoBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanVariableRef createBooleanVariableRef() {
		BooleanVariableRefImpl booleanVariableRef = new BooleanVariableRefImpl();
		return booleanVariableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BluetoothTransceiver createBluetoothTransceiver() {
		BluetoothTransceiverImpl bluetoothTransceiver = new BluetoothTransceiverImpl();
		return bluetoothTransceiver;
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
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
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
	@Override
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

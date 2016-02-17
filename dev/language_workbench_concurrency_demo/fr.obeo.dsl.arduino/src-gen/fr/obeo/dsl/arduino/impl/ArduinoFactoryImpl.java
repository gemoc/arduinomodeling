/**
 *  Copyright (c) 2013 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.arduino.impl;

import fr.obeo.dsl.arduino.AbstractInstructionBlock;
import fr.obeo.dsl.arduino.AmbientLightSensor;
import fr.obeo.dsl.arduino.AnalogPin;
import fr.obeo.dsl.arduino.ArduinoBoard;
import fr.obeo.dsl.arduino.ArduinoFactory;
import fr.obeo.dsl.arduino.ArduinoPackage;
import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.BinaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import fr.obeo.dsl.arduino.BinaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Block;
import fr.obeo.dsl.arduino.BooleanConstant;
import fr.obeo.dsl.arduino.BooleanModuleGet;
import fr.obeo.dsl.arduino.BooleanVariable;
import fr.obeo.dsl.arduino.Buzzer;
import fr.obeo.dsl.arduino.Channel;
import fr.obeo.dsl.arduino.Delay;
import fr.obeo.dsl.arduino.DigitalPin;
import fr.obeo.dsl.arduino.Fan;
import fr.obeo.dsl.arduino.If;
import fr.obeo.dsl.arduino.InfraRedSensor;
import fr.obeo.dsl.arduino.InstructionBlock;
import fr.obeo.dsl.arduino.IntegerConstant;
import fr.obeo.dsl.arduino.IntegerModuleGet;
import fr.obeo.dsl.arduino.IntegerVariable;
import fr.obeo.dsl.arduino.LED;
import fr.obeo.dsl.arduino.Link;
import fr.obeo.dsl.arduino.MicroServo;
import fr.obeo.dsl.arduino.ModuleAssignment;
import fr.obeo.dsl.arduino.MusicPlayer;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.PushButton;
import fr.obeo.dsl.arduino.Repeat;
import fr.obeo.dsl.arduino.RotationSensor;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.SoundSensor;
import fr.obeo.dsl.arduino.Synchonization;
import fr.obeo.dsl.arduino.Synchronization;
import fr.obeo.dsl.arduino.SynchronizationBlock;
import fr.obeo.dsl.arduino.Time;
import fr.obeo.dsl.arduino.UnaryBooleanExpression;
import fr.obeo.dsl.arduino.UnaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.UnaryIntegerExpression;
import fr.obeo.dsl.arduino.UnaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.VariableAssignment;
import fr.obeo.dsl.arduino.VariableDeclaration;
import fr.obeo.dsl.arduino.VariableRef;
import fr.obeo.dsl.arduino.While;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
		DigitalPinImpl digitalPin = new DigitalPinImpl();
		return digitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogPin createAnalogPin() {
		AnalogPinImpl analogPin = new AnalogPinImpl();
		return analogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch createSketch() {
		SketchImpl sketch = new SketchImpl();
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleAssignment createModuleAssignment() {
		ModuleAssignmentImpl moduleAssignment = new ModuleAssignmentImpl();
		return moduleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryIntegerExpression createBinaryIntegerExpression() {
		BinaryIntegerExpressionImpl binaryIntegerExpression = new BinaryIntegerExpressionImpl();
		return binaryIntegerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanExpression createBinaryBooleanExpression() {
		BinaryBooleanExpressionImpl binaryBooleanExpression = new BinaryBooleanExpressionImpl();
		return binaryBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstant createBooleanConstant() {
		BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
		return booleanConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanModuleGet createBooleanModuleGet() {
		BooleanModuleGetImpl booleanModuleGet = new BooleanModuleGetImpl();
		return booleanModuleGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerModuleGet createIntegerModuleGet() {
		IntegerModuleGetImpl integerModuleGet = new IntegerModuleGetImpl();
		return integerModuleGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryBooleanExpression createUnaryBooleanExpression() {
		UnaryBooleanExpressionImpl unaryBooleanExpression = new UnaryBooleanExpressionImpl();
		return unaryBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryIntegerExpression createUnaryIntegerExpression() {
		UnaryIntegerExpressionImpl unaryIntegerExpression = new UnaryIntegerExpressionImpl();
		return unaryIntegerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButton createPushButton() {
		PushButtonImpl pushButton = new PushButtonImpl();
		return pushButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buzzer createBuzzer() {
		BuzzerImpl buzzer = new BuzzerImpl();
		return buzzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationSensor createRotationSensor() {
		RotationSensorImpl rotationSensor = new RotationSensorImpl();
		return rotationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroServo createMicroServo() {
		MicroServoImpl microServo = new MicroServoImpl();
		return microServo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfraRedSensor createInfraRedSensor() {
		InfraRedSensorImpl infraRedSensor = new InfraRedSensorImpl();
		return infraRedSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbientLightSensor createAmbientLightSensor() {
		AmbientLightSensorImpl ambientLightSensor = new AmbientLightSensorImpl();
		return ambientLightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundSensor createSoundSensor() {
		SoundSensorImpl soundSensor = new SoundSensorImpl();
		return soundSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fan createFan() {
		FanImpl fan = new FanImpl();
		return fan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicPlayer createMusicPlayer() {
		MusicPlayerImpl musicPlayer = new MusicPlayerImpl();
		return musicPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoBoard createArduinoBoard() {
		ArduinoBoardImpl arduinoBoard = new ArduinoBoardImpl();
		return arduinoBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationBlock createSynchronizationBlock() {
		SynchronizationBlockImpl synchronizationBlock = new SynchronizationBlockImpl();
		return synchronizationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionBlock createInstructionBlock() {
		InstructionBlockImpl instructionBlock = new InstructionBlockImpl();
		return instructionBlock;
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

/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.arduino.xdsml.arduinomt.arduino.AmbientLightSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoModule;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Board;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanModuleGet;
import org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Buzzer;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Channel;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Constant;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Control;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Delay;
import org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Expression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Fan;
import org.gemoc.arduino.xdsml.arduinomt.arduino.If;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InfraRedSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction;
import org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet;
import org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable;
import org.gemoc.arduino.xdsml.arduinomt.arduino.LED;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Link;
import org.gemoc.arduino.xdsml.arduinomt.arduino.MicroServo;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Module;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleAssignment;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction;
import org.gemoc.arduino.xdsml.arduinomt.arduino.MusicPlayer;
import org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Pin;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Project;
import org.gemoc.arduino.xdsml.arduinomt.arduino.PushButton;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat;
import org.gemoc.arduino.xdsml.arduinomt.arduino.RotationSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch;
import org.gemoc.arduino.xdsml.arduinomt.arduino.SoundSensor;
import org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Utilities;
import org.gemoc.arduino.xdsml.arduinomt.arduino.Variable;
import org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment;
import org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration;
import org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef;
import org.gemoc.arduino.xdsml.arduinomt.arduino.While;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoSwitch<Adapter> modelSwitch =
		new ArduinoSwitch<Adapter>() {
			@Override
			public Adapter caseBoard(Board object) {
				return createBoardAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseDigitalPin(DigitalPin object) {
				return createDigitalPinAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseAnalogPin(AnalogPin object) {
				return createAnalogPinAdapter();
			}
			@Override
			public Adapter caseSketch(Sketch object) {
				return createSketchAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseModuleAssignment(ModuleAssignment object) {
				return createModuleAssignmentAdapter();
			}
			@Override
			public Adapter caseModuleInstruction(ModuleInstruction object) {
				return createModuleInstructionAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseUtilities(Utilities object) {
				return createUtilitiesAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseRepeat(Repeat object) {
				return createRepeatAdapter();
			}
			@Override
			public Adapter caseModuleGet(ModuleGet object) {
				return createModuleGetAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseVariableAssignment(VariableAssignment object) {
				return createVariableAssignmentAdapter();
			}
			@Override
			public Adapter caseBinaryIntegerExpression(BinaryIntegerExpression object) {
				return createBinaryIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryBooleanExpression(BinaryBooleanExpression object) {
				return createBinaryBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseIntegerConstant(IntegerConstant object) {
				return createIntegerConstantAdapter();
			}
			@Override
			public Adapter caseBooleanConstant(BooleanConstant object) {
				return createBooleanConstantAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseBooleanModuleGet(BooleanModuleGet object) {
				return createBooleanModuleGetAdapter();
			}
			@Override
			public Adapter caseIntegerModuleGet(IntegerModuleGet object) {
				return createIntegerModuleGetAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryBooleanExpression(UnaryBooleanExpression object) {
				return createUnaryBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryIntegerExpression(UnaryIntegerExpression object) {
				return createUnaryIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableRef(VariableRef object) {
				return createVariableRefAdapter();
			}
			@Override
			public Adapter caseLED(LED object) {
				return createLEDAdapter();
			}
			@Override
			public Adapter casePushButton(PushButton object) {
				return createPushButtonAdapter();
			}
			@Override
			public Adapter caseBuzzer(Buzzer object) {
				return createBuzzerAdapter();
			}
			@Override
			public Adapter caseRotationSensor(RotationSensor object) {
				return createRotationSensorAdapter();
			}
			@Override
			public Adapter caseMicroServo(MicroServo object) {
				return createMicroServoAdapter();
			}
			@Override
			public Adapter caseInfraRedSensor(InfraRedSensor object) {
				return createInfraRedSensorAdapter();
			}
			@Override
			public Adapter caseAmbientLightSensor(AmbientLightSensor object) {
				return createAmbientLightSensorAdapter();
			}
			@Override
			public Adapter caseSoundSensor(SoundSensor object) {
				return createSoundSensorAdapter();
			}
			@Override
			public Adapter caseFan(Fan object) {
				return createFanAdapter();
			}
			@Override
			public Adapter caseMusicPlayer(MusicPlayer object) {
				return createMusicPlayerAdapter();
			}
			@Override
			public Adapter caseArduinoModule(ArduinoModule object) {
				return createArduinoModuleAdapter();
			}
			@Override
			public Adapter caseArduinoBoard(ArduinoBoard object) {
				return createArduinoBoardAdapter();
			}
			@Override
			public Adapter caseArduinoDigitalModule(ArduinoDigitalModule object) {
				return createArduinoDigitalModuleAdapter();
			}
			@Override
			public Adapter caseArduinoAnalogModule(ArduinoAnalogModule object) {
				return createArduinoAnalogModuleAdapter();
			}
			@Override
			public Adapter caseThread(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseSynchronizationBlock(SynchronizationBlock object) {
				return createSynchronizationBlockAdapter();
			}
			@Override
			public Adapter caseInstructionBlock(InstructionBlock object) {
				return createInstructionBlockAdapter();
			}
			@Override
			public Adapter caseThreadInstructionBlock(ThreadInstructionBlock object) {
				return createThreadInstructionBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.DigitalPin
	 * @generated
	 */
	public Adapter createDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.AnalogPin
	 * @generated
	 */
	public Adapter createAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch
	 * @generated
	 */
	public Adapter createSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleAssignment <em>Module Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleAssignment
	 * @generated
	 */
	public Adapter createModuleAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction <em>Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleInstruction
	 * @generated
	 */
	public Adapter createModuleInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Utilities <em>Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Utilities
	 * @generated
	 */
	public Adapter createUtilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet <em>Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ModuleGet
	 * @generated
	 */
	public Adapter createModuleGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableAssignment
	 * @generated
	 */
	public Adapter createVariableAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression <em>Binary Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryIntegerExpression
	 * @generated
	 */
	public Adapter createBinaryIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression <em>Binary Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BinaryBooleanExpression
	 * @generated
	 */
	public Adapter createBinaryBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerConstant
	 * @generated
	 */
	public Adapter createIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanConstant
	 * @generated
	 */
	public Adapter createBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanModuleGet <em>Boolean Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.BooleanModuleGet
	 * @generated
	 */
	public Adapter createBooleanModuleGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet <em>Integer Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.IntegerModuleGet
	 * @generated
	 */
	public Adapter createIntegerModuleGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression <em>Unary Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryBooleanExpression
	 * @generated
	 */
	public Adapter createUnaryBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression <em>Unary Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.UnaryIntegerExpression
	 * @generated
	 */
	public Adapter createUnaryIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.LED
	 * @generated
	 */
	public Adapter createLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.PushButton <em>Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.PushButton
	 * @generated
	 */
	public Adapter createPushButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Buzzer
	 * @generated
	 */
	public Adapter createBuzzerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.RotationSensor <em>Rotation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.RotationSensor
	 * @generated
	 */
	public Adapter createRotationSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.MicroServo <em>Micro Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.MicroServo
	 * @generated
	 */
	public Adapter createMicroServoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InfraRedSensor <em>Infra Red Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InfraRedSensor
	 * @generated
	 */
	public Adapter createInfraRedSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.AmbientLightSensor <em>Ambient Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.AmbientLightSensor
	 * @generated
	 */
	public Adapter createAmbientLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SoundSensor <em>Sound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SoundSensor
	 * @generated
	 */
	public Adapter createSoundSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Fan
	 * @generated
	 */
	public Adapter createFanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.MusicPlayer <em>Music Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.MusicPlayer
	 * @generated
	 */
	public Adapter createMusicPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoModule
	 * @generated
	 */
	public Adapter createArduinoModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoBoard
	 * @generated
	 */
	public Adapter createArduinoBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoDigitalModule <em>Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoDigitalModule
	 * @generated
	 */
	public Adapter createArduinoDigitalModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoAnalogModule <em>Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoAnalogModule
	 * @generated
	 */
	public Adapter createArduinoAnalogModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock <em>Synchronization Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock
	 * @generated
	 */
	public Adapter createSynchronizationBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock <em>Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock
	 * @generated
	 */
	public Adapter createInstructionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock <em>Thread Instruction Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock
	 * @generated
	 */
	public Adapter createThreadInstructionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArduinoAdapterFactory

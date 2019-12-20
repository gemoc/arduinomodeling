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
import fr.obeo.dsl.arduino.ArduinoAnalogModule;
import fr.obeo.dsl.arduino.ArduinoBoard;
import fr.obeo.dsl.arduino.ArduinoDigitalModule;
import fr.obeo.dsl.arduino.ArduinoFactory;
import fr.obeo.dsl.arduino.ArduinoModule;
import fr.obeo.dsl.arduino.ArduinoPackage;
import fr.obeo.dsl.arduino.Assignment;
import fr.obeo.dsl.arduino.BinaryBooleanExpression;
import fr.obeo.dsl.arduino.BinaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.BinaryExpression;
import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import fr.obeo.dsl.arduino.BinaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Block;
import fr.obeo.dsl.arduino.Board;
import fr.obeo.dsl.arduino.BooleanConstant;
import fr.obeo.dsl.arduino.BooleanExpression;
import fr.obeo.dsl.arduino.BooleanModuleGet;
import fr.obeo.dsl.arduino.BooleanVariable;
import fr.obeo.dsl.arduino.Buzzer;
import fr.obeo.dsl.arduino.Channel;
import fr.obeo.dsl.arduino.Constant;
import fr.obeo.dsl.arduino.Control;
import fr.obeo.dsl.arduino.Delay;
import fr.obeo.dsl.arduino.DigitalPin;
import fr.obeo.dsl.arduino.Expression;
import fr.obeo.dsl.arduino.Fan;
import fr.obeo.dsl.arduino.If;
import fr.obeo.dsl.arduino.InfraRedSensor;
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.InstructionBlock;
import fr.obeo.dsl.arduino.IntegerConstant;
import fr.obeo.dsl.arduino.IntegerExpression;
import fr.obeo.dsl.arduino.IntegerModuleGet;
import fr.obeo.dsl.arduino.IntegerVariable;
import fr.obeo.dsl.arduino.Link;
import fr.obeo.dsl.arduino.MicroServo;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.ModuleAssignment;
import fr.obeo.dsl.arduino.ModuleGet;
import fr.obeo.dsl.arduino.ModuleInstruction;
import fr.obeo.dsl.arduino.MusicPlayer;
import fr.obeo.dsl.arduino.NamedElement;
import fr.obeo.dsl.arduino.Pin;
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.PushButton;
import fr.obeo.dsl.arduino.Repeat;
import fr.obeo.dsl.arduino.RotationSensor;
import fr.obeo.dsl.arduino.Sketch;
import fr.obeo.dsl.arduino.SoundSensor;
import fr.obeo.dsl.arduino.Synchonization;
import fr.obeo.dsl.arduino.Synchronization;
import fr.obeo.dsl.arduino.SynchronizationBlock;
import fr.obeo.dsl.arduino.ThreadInstructionBlock;
import fr.obeo.dsl.arduino.Time;
import fr.obeo.dsl.arduino.UnaryBooleanExpression;
import fr.obeo.dsl.arduino.UnaryBooleanOperatorKind;
import fr.obeo.dsl.arduino.UnaryExpression;
import fr.obeo.dsl.arduino.UnaryIntegerExpression;
import fr.obeo.dsl.arduino.UnaryIntegerOperatorKind;
import fr.obeo.dsl.arduino.Utilities;
import fr.obeo.dsl.arduino.Variable;
import fr.obeo.dsl.arduino.VariableAssignment;
import fr.obeo.dsl.arduino.VariableDeclaration;
import fr.obeo.dsl.arduino.VariableRef;
import fr.obeo.dsl.arduino.While;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanModuleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerModuleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microServoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infraRedSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambientLightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass musicPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoDigitalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoAnalogModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadInstructionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryIntegerOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryBooleanOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryIntegerOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryBooleanOperatorKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Project() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Threads() {
		return (EReference)boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Level() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalPin() {
		return digitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalPin_Module() {
		return (EReference)digitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Id() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Level() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogPin() {
		return analogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogPin_Module() {
		return (EReference)analogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Project() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Threads() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Channels() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Boards() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Sketch() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Links() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_OwnedBlock() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleAssignment() {
		return moduleAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleInstruction() {
		return moduleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInstruction_Module() {
		return (EReference)moduleInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Block() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilities() {
		return utilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Unit() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Value() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_Iteration() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleGet() {
		return moduleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleGet_Module() {
		return (EReference)moduleGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Condition() {
		return (EReference)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Variable() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerExpression() {
		return binaryIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryIntegerExpression_Operator() {
		return (EAttribute)binaryIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanExpression() {
		return binaryBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryBooleanExpression_Operator() {
		return (EAttribute)binaryBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ElseBlock() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstant() {
		return integerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConstant_Value() {
		return (EAttribute)integerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstant() {
		return booleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstant_Value() {
		return (EAttribute)booleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Operand() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_InitialValue() {
		return (EAttribute)integerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_Value() {
		return (EAttribute)integerVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_InitialValue() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_Value() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanModuleGet() {
		return booleanModuleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerModuleGet() {
		return integerModuleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanExpression() {
		return unaryBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryBooleanExpression_Operator() {
		return (EAttribute)unaryBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerExpression() {
		return unaryIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryIntegerExpression_Operator() {
		return (EAttribute)unaryIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Variable() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRef_Variable() {
		return (EReference)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushButton() {
		return pushButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzer() {
		return buzzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationSensor() {
		return rotationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroServo() {
		return microServoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfraRedSensor() {
		return infraRedSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbientLightSensor() {
		return ambientLightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundSensor() {
		return soundSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFan() {
		return fanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMusicPlayer() {
		return musicPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoModule() {
		return arduinoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoBoard() {
		return arduinoBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduinoBoard_DigitalPins() {
		return (EReference)arduinoBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduinoBoard_AnalogPins() {
		return (EReference)arduinoBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoDigitalModule() {
		return arduinoDigitalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoAnalogModule() {
		return arduinoAnalogModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Blocks() {
		return (EReference)threadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Channels() {
		return (EReference)threadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_CurrentInstruction() {
		return (EReference)threadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_First() {
		return (EReference)threadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThread_Last() {
		return (EReference)threadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThread_NbCycle() {
		return (EAttribute)threadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Source() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Target() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_InRate() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_OutRate() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Capacity() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_CurrentSize() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_InBoard() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_OutBoard() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Channels() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationBlock() {
		return synchronizationBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionBlock() {
		return instructionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionBlock_Instructions() {
		return (EReference)instructionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadInstructionBlock() {
		return threadInstructionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadInstructionBlock_Thread() {
		return (EReference)threadInstructionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadInstructionBlock_Next() {
		return (EReference)threadInstructionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTime() {
		return timeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryIntegerOperatorKind() {
		return binaryIntegerOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryBooleanOperatorKind() {
		return binaryBooleanOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryIntegerOperatorKind() {
		return unaryIntegerOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryBooleanOperatorKind() {
		return unaryBooleanOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__PROJECT);
		createEReference(boardEClass, BOARD__THREADS);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__LEVEL);

		digitalPinEClass = createEClass(DIGITAL_PIN);
		createEReference(digitalPinEClass, DIGITAL_PIN__MODULE);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__ID);
		createEAttribute(pinEClass, PIN__LEVEL);

		analogPinEClass = createEClass(ANALOG_PIN);
		createEReference(analogPinEClass, ANALOG_PIN__MODULE);

		sketchEClass = createEClass(SKETCH);
		createEReference(sketchEClass, SKETCH__PROJECT);
		createEReference(sketchEClass, SKETCH__THREADS);
		createEReference(sketchEClass, SKETCH__CHANNELS);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__BOARDS);
		createEReference(projectEClass, PROJECT__SKETCH);
		createEReference(projectEClass, PROJECT__LINKS);

		instructionEClass = createEClass(INSTRUCTION);
		createEReference(instructionEClass, INSTRUCTION__OWNED_BLOCK);

		moduleAssignmentEClass = createEClass(MODULE_ASSIGNMENT);

		moduleInstructionEClass = createEClass(MODULE_INSTRUCTION);
		createEReference(moduleInstructionEClass, MODULE_INSTRUCTION__MODULE);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__BLOCK);

		utilitiesEClass = createEClass(UTILITIES);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__UNIT);
		createEAttribute(delayEClass, DELAY__VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__ITERATION);

		moduleGetEClass = createEClass(MODULE_GET);
		createEReference(moduleGetEClass, MODULE_GET__MODULE);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__CONDITION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		variableEClass = createEClass(VARIABLE);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE);

		binaryIntegerExpressionEClass = createEClass(BINARY_INTEGER_EXPRESSION);
		createEAttribute(binaryIntegerExpressionEClass, BINARY_INTEGER_EXPRESSION__OPERATOR);

		binaryBooleanExpressionEClass = createEClass(BINARY_BOOLEAN_EXPRESSION);
		createEAttribute(binaryBooleanExpressionEClass, BINARY_BOOLEAN_EXPRESSION__OPERATOR);

		expressionEClass = createEClass(EXPRESSION);

		constantEClass = createEClass(CONSTANT);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__ELSE_BLOCK);

		integerConstantEClass = createEClass(INTEGER_CONSTANT);
		createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);

		booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
		createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VALUE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__OPERAND);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);
		createEAttribute(integerVariableEClass, INTEGER_VARIABLE__INITIAL_VALUE);
		createEAttribute(integerVariableEClass, INTEGER_VARIABLE__VALUE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__INITIAL_VALUE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__VALUE);

		booleanModuleGetEClass = createEClass(BOOLEAN_MODULE_GET);

		integerModuleGetEClass = createEClass(INTEGER_MODULE_GET);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERAND);

		unaryBooleanExpressionEClass = createEClass(UNARY_BOOLEAN_EXPRESSION);
		createEAttribute(unaryBooleanExpressionEClass, UNARY_BOOLEAN_EXPRESSION__OPERATOR);

		unaryIntegerExpressionEClass = createEClass(UNARY_INTEGER_EXPRESSION);
		createEAttribute(unaryIntegerExpressionEClass, UNARY_INTEGER_EXPRESSION__OPERATOR);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEReference(variableRefEClass, VARIABLE_REF__VARIABLE);

		ledEClass = createEClass(LED);

		pushButtonEClass = createEClass(PUSH_BUTTON);

		buzzerEClass = createEClass(BUZZER);

		rotationSensorEClass = createEClass(ROTATION_SENSOR);

		microServoEClass = createEClass(MICRO_SERVO);

		infraRedSensorEClass = createEClass(INFRA_RED_SENSOR);

		ambientLightSensorEClass = createEClass(AMBIENT_LIGHT_SENSOR);

		soundSensorEClass = createEClass(SOUND_SENSOR);

		fanEClass = createEClass(FAN);

		musicPlayerEClass = createEClass(MUSIC_PLAYER);

		arduinoModuleEClass = createEClass(ARDUINO_MODULE);

		arduinoBoardEClass = createEClass(ARDUINO_BOARD);
		createEReference(arduinoBoardEClass, ARDUINO_BOARD__DIGITAL_PINS);
		createEReference(arduinoBoardEClass, ARDUINO_BOARD__ANALOG_PINS);

		arduinoDigitalModuleEClass = createEClass(ARDUINO_DIGITAL_MODULE);

		arduinoAnalogModuleEClass = createEClass(ARDUINO_ANALOG_MODULE);

		threadEClass = createEClass(THREAD);
		createEReference(threadEClass, THREAD__BLOCKS);
		createEReference(threadEClass, THREAD__CHANNELS);
		createEReference(threadEClass, THREAD__CURRENT_INSTRUCTION);
		createEReference(threadEClass, THREAD__FIRST);
		createEReference(threadEClass, THREAD__LAST);
		createEAttribute(threadEClass, THREAD__NB_CYCLE);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__SOURCE);
		createEReference(channelEClass, CHANNEL__TARGET);
		createEAttribute(channelEClass, CHANNEL__IN_RATE);
		createEAttribute(channelEClass, CHANNEL__OUT_RATE);
		createEAttribute(channelEClass, CHANNEL__CAPACITY);
		createEAttribute(channelEClass, CHANNEL__CURRENT_SIZE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__IN_BOARD);
		createEReference(linkEClass, LINK__OUT_BOARD);
		createEReference(linkEClass, LINK__CHANNELS);

		synchronizationBlockEClass = createEClass(SYNCHRONIZATION_BLOCK);

		instructionBlockEClass = createEClass(INSTRUCTION_BLOCK);
		createEReference(instructionBlockEClass, INSTRUCTION_BLOCK__INSTRUCTIONS);

		threadInstructionBlockEClass = createEClass(THREAD_INSTRUCTION_BLOCK);
		createEReference(threadInstructionBlockEClass, THREAD_INSTRUCTION_BLOCK__THREAD);
		createEReference(threadInstructionBlockEClass, THREAD_INSTRUCTION_BLOCK__NEXT);

		// Create enums
		timeEEnum = createEEnum(TIME);
		binaryIntegerOperatorKindEEnum = createEEnum(BINARY_INTEGER_OPERATOR_KIND);
		binaryBooleanOperatorKindEEnum = createEEnum(BINARY_BOOLEAN_OPERATOR_KIND);
		unaryIntegerOperatorKindEEnum = createEEnum(UNARY_INTEGER_OPERATOR_KIND);
		unaryBooleanOperatorKindEEnum = createEEnum(UNARY_BOOLEAN_OPERATOR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boardEClass.getESuperTypes().add(this.getNamedElement());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		digitalPinEClass.getESuperTypes().add(this.getPin());
		analogPinEClass.getESuperTypes().add(this.getPin());
		sketchEClass.getESuperTypes().add(this.getNamedElement());
		projectEClass.getESuperTypes().add(this.getNamedElement());
		instructionEClass.getESuperTypes().add(this.getNamedElement());
		moduleAssignmentEClass.getESuperTypes().add(this.getModuleInstruction());
		moduleAssignmentEClass.getESuperTypes().add(this.getAssignment());
		moduleInstructionEClass.getESuperTypes().add(this.getInstruction());
		controlEClass.getESuperTypes().add(this.getInstruction());
		utilitiesEClass.getESuperTypes().add(this.getInstruction());
		delayEClass.getESuperTypes().add(this.getUtilities());
		repeatEClass.getESuperTypes().add(this.getControl());
		moduleGetEClass.getESuperTypes().add(this.getExpression());
		whileEClass.getESuperTypes().add(this.getControl());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		variableEClass.getESuperTypes().add(this.getExpression());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		variableAssignmentEClass.getESuperTypes().add(this.getInstruction());
		variableAssignmentEClass.getESuperTypes().add(this.getAssignment());
		binaryIntegerExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		binaryIntegerExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		binaryBooleanExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		binaryBooleanExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		constantEClass.getESuperTypes().add(this.getExpression());
		ifEClass.getESuperTypes().add(this.getControl());
		integerConstantEClass.getESuperTypes().add(this.getConstant());
		integerConstantEClass.getESuperTypes().add(this.getIntegerExpression());
		booleanConstantEClass.getESuperTypes().add(this.getConstant());
		booleanConstantEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		integerExpressionEClass.getESuperTypes().add(this.getExpression());
		assignmentEClass.getESuperTypes().add(this.getInstruction());
		integerVariableEClass.getESuperTypes().add(this.getVariable());
		integerVariableEClass.getESuperTypes().add(this.getIntegerExpression());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanModuleGetEClass.getESuperTypes().add(this.getModuleGet());
		booleanModuleGetEClass.getESuperTypes().add(this.getBooleanExpression());
		integerModuleGetEClass.getESuperTypes().add(this.getModuleGet());
		integerModuleGetEClass.getESuperTypes().add(this.getIntegerExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryBooleanExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		unaryBooleanExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		unaryIntegerExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		unaryIntegerExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		variableDeclarationEClass.getESuperTypes().add(this.getInstruction());
		variableRefEClass.getESuperTypes().add(this.getExpression());
		ledEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		pushButtonEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		buzzerEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		rotationSensorEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		microServoEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		infraRedSensorEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		ambientLightSensorEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		soundSensorEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		fanEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		musicPlayerEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		arduinoModuleEClass.getESuperTypes().add(this.getModule());
		arduinoBoardEClass.getESuperTypes().add(this.getBoard());
		arduinoDigitalModuleEClass.getESuperTypes().add(this.getArduinoModule());
		arduinoAnalogModuleEClass.getESuperTypes().add(this.getArduinoModule());
		threadEClass.getESuperTypes().add(this.getNamedElement());
		channelEClass.getESuperTypes().add(this.getNamedElement());
		linkEClass.getESuperTypes().add(this.getNamedElement());
		synchronizationBlockEClass.getESuperTypes().add(this.getThreadInstructionBlock());
		instructionBlockEClass.getESuperTypes().add(this.getThreadInstructionBlock());
		threadInstructionBlockEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(boardEClass, Board.class, "Board", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Project(), this.getProject(), this.getProject_Boards(), "project", null, 1, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Threads(), this.getThread(), null, "threads", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Level(), ecorePackage.getEBoolean(), "level", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalPinEClass, DigitalPin.class, "DigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalPin_Module(), this.getArduinoDigitalModule(), null, "module", null, 0, 1, DigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Level(), ecorePackage.getEIntegerObject(), "level", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogPinEClass, AnalogPin.class, "AnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogPin_Module(), this.getArduinoAnalogModule(), null, "module", null, 0, 1, AnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketch_Project(), this.getProject(), this.getProject_Sketch(), "project", null, 1, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Threads(), this.getThread(), null, "threads", null, 0, -1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Channels(), this.getChannel(), null, "channels", null, 0, -1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Boards(), this.getBoard(), this.getBoard_Project(), "boards", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Sketch(), this.getSketch(), this.getSketch_Project(), "sketch", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Links(), this.getLink(), null, "links", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_OwnedBlock(), this.getInstructionBlock(), this.getInstructionBlock_Instructions(), "ownedBlock", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(instructionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moduleAssignmentEClass, ModuleAssignment.class, "ModuleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleInstructionEClass, ModuleInstruction.class, "ModuleInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleInstruction_Module(), this.getModule(), null, "module", null, 1, 1, ModuleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Block(), this.getInstructionBlock(), null, "block", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilitiesEClass, Utilities.class, "Utilities", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Unit(), this.getTime(), "unit", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_Iteration(), ecorePackage.getEInt(), "iteration", "5", 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleGetEClass, ModuleGet.class, "ModuleGet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleGet_Module(), this.getModule(), null, "module", null, 1, 1, ModuleGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryIntegerExpressionEClass, BinaryIntegerExpression.class, "BinaryIntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryIntegerExpression_Operator(), this.getBinaryIntegerOperatorKind(), "operator", null, 0, 1, BinaryIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryBooleanExpressionEClass, BinaryBooleanExpression.class, "BinaryBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryBooleanExpression_Operator(), this.getBinaryBooleanOperatorKind(), "operator", null, 0, 1, BinaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_ElseBlock(), this.getInstructionBlock(), null, "elseBlock", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, IntegerConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstant_Value(), ecorePackage.getEBoolean(), "value", "false", 0, 1, BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Operand(), this.getExpression(), null, "operand", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVariable_InitialValue(), ecorePackage.getEInt(), "initialValue", "0", 0, 1, IntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerVariable_Value(), ecorePackage.getEIntegerObject(), "value", "0", 0, 1, IntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVariable_InitialValue(), ecorePackage.getEBoolean(), "initialValue", "false", 0, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanVariable_Value(), ecorePackage.getEBooleanObject(), "value", "false", 0, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanModuleGetEClass, BooleanModuleGet.class, "BooleanModuleGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerModuleGetEClass, IntegerModuleGet.class, "IntegerModuleGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryBooleanExpressionEClass, UnaryBooleanExpression.class, "UnaryBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryBooleanExpression_Operator(), this.getUnaryBooleanOperatorKind(), "operator", null, 0, 1, UnaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryIntegerExpressionEClass, UnaryIntegerExpression.class, "UnaryIntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryIntegerExpression_Operator(), this.getUnaryIntegerOperatorKind(), "operator", null, 0, 1, UnaryIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRef_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, fr.obeo.dsl.arduino.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pushButtonEClass, PushButton.class, "PushButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buzzerEClass, Buzzer.class, "Buzzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotationSensorEClass, RotationSensor.class, "RotationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microServoEClass, MicroServo.class, "MicroServo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infraRedSensorEClass, InfraRedSensor.class, "InfraRedSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ambientLightSensorEClass, AmbientLightSensor.class, "AmbientLightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soundSensorEClass, SoundSensor.class, "SoundSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fanEClass, Fan.class, "Fan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(musicPlayerEClass, MusicPlayer.class, "MusicPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoModuleEClass, ArduinoModule.class, "ArduinoModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoBoardEClass, ArduinoBoard.class, "ArduinoBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduinoBoard_DigitalPins(), this.getDigitalPin(), null, "digitalPins", null, 0, -1, ArduinoBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduinoBoard_AnalogPins(), this.getAnalogPin(), null, "analogPins", null, 0, -1, ArduinoBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoDigitalModuleEClass, ArduinoDigitalModule.class, "ArduinoDigitalModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoAnalogModuleEClass, ArduinoAnalogModule.class, "ArduinoAnalogModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadEClass, fr.obeo.dsl.arduino.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThread_Blocks(), this.getThreadInstructionBlock(), null, "blocks", null, 0, -1, fr.obeo.dsl.arduino.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Channels(), this.getChannel(), this.getChannel_Source(), "channels", null, 0, -1, fr.obeo.dsl.arduino.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_CurrentInstruction(), this.getInstruction(), null, "currentInstruction", null, 0, 1, fr.obeo.dsl.arduino.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_First(), this.getThreadInstructionBlock(), null, "first", null, 0, 1, fr.obeo.dsl.arduino.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThread_Last(), this.getThreadInstructionBlock(), null, "last", null, 0, 1, fr.obeo.dsl.arduino.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThread_NbCycle(), ecorePackage.getEInt(), "nbCycle", null, 0, 1, fr.obeo.dsl.arduino.Thread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_Source(), this.getThread(), this.getThread_Channels(), "source", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Target(), this.getThread(), null, "target", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_InRate(), ecorePackage.getEInt(), "inRate", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_OutRate(), ecorePackage.getEInt(), "outRate", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_CurrentSize(), ecorePackage.getEInt(), "currentSize", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_InBoard(), this.getBoard(), null, "inBoard", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_OutBoard(), this.getBoard(), null, "outBoard", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Channels(), this.getChannel(), null, "channels", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationBlockEClass, SynchronizationBlock.class, "SynchronizationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instructionBlockEClass, InstructionBlock.class, "InstructionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionBlock_Instructions(), this.getInstruction(), this.getInstruction_OwnedBlock(), "instructions", null, 0, -1, InstructionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadInstructionBlockEClass, ThreadInstructionBlock.class, "ThreadInstructionBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreadInstructionBlock_Thread(), this.getThread(), null, "thread", null, 0, 1, ThreadInstructionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreadInstructionBlock_Next(), this.getThreadInstructionBlock(), null, "next", null, 0, 1, ThreadInstructionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(threadInstructionBlockEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeEEnum, Time.class, "Time");
		addEEnumLiteral(timeEEnum, Time.MILLI_SECOND);
		addEEnumLiteral(timeEEnum, Time.MICRO_SECOND);

		initEEnum(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.class, "BinaryIntegerOperatorKind");
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MINUS);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.PLUS);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MUL);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.DIV);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MIN);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MAX);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.POURCENT);

		initEEnum(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.class, "BinaryBooleanOperatorKind");
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.INF);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.SUP);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.INF_OR_EQUAL);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.SUP_OR_EQUAL);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.EQUAL);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.AND);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.OR);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.DIFFERENT);

		initEEnum(unaryIntegerOperatorKindEEnum, UnaryIntegerOperatorKind.class, "UnaryIntegerOperatorKind");
		addEEnumLiteral(unaryIntegerOperatorKindEEnum, UnaryIntegerOperatorKind.MINUS);
		addEEnumLiteral(unaryIntegerOperatorKindEEnum, UnaryIntegerOperatorKind.SQUARE_ROOT);

		initEEnum(unaryBooleanOperatorKindEEnum, UnaryBooleanOperatorKind.class, "UnaryBooleanOperatorKind");
		addEEnumLiteral(unaryBooleanOperatorKindEEnum, UnaryBooleanOperatorKind.NOT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dynamic
		createDynamicAnnotations();
	}

	/**
	 * Initializes the annotations for <b>dynamic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDynamicAnnotations() {
		String source = "dynamic";	
		addAnnotation
		  (getPin_Level(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntegerVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanVariable_Value(), 
		   source, 
		   new String[] {
		   });
	}

} //ArduinoPackageImpl

/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_If_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Level_Execute;
import arduinoTrace.Steps.Arduino_Level_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Project_Setup_FillStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Set_Execute;
import arduinoTrace.Steps.Arduino_Set_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Status_Call;
import arduinoTrace.Steps.Arduino_Status_Call_FillStep;
import arduinoTrace.Steps.Arduino_Status_Execute;
import arduinoTrace.Steps.Arduino_Status_Execute_FillStep;
import arduinoTrace.Steps.Arduino_Utilities_Call;
import arduinoTrace.Steps.Arduino_Utilities_Call_FillStep;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_While_Execute;
import arduinoTrace.Steps.Arduino_While_Execute_FillStep;
import arduinoTrace.Steps.FillStep;
import arduinoTrace.Steps.Steps;
import arduinoTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Status_Execute_FillStep_Trace <em>Arduino Status Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Project_Setup_FillStep_Trace <em>Arduino Project Setup Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Repeat_Execute_FillStep_Trace <em>Arduino Repeat Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Level_Execute_FillStep_Trace <em>Arduino Level Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Set_Execute_FillStep_Trace <em>Arduino Set Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Delay_Execute_Trace <em>Arduino Delay Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Utilities_Call_FillStep_Trace <em>Arduino Utilities Call Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_FunctionCall_Execute_FillStep_Trace <em>Arduino Function Call Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Utilities_Execute_Trace <em>Arduino Utilities Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_If_Execute_FillStep_Trace <em>Arduino If Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_While_Execute_FillStep_Trace <em>Arduino While Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Status_Call_FillStep_Trace <em>Arduino Status Call Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getFillStep_Trace <em>Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Status_Execute_Trace <em>Arduino Status Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Project_Setup_Trace <em>Arduino Project Setup Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Repeat_Execute_Trace <em>Arduino Repeat Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Level_Execute_Trace <em>Arduino Level Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Set_Execute_Trace <em>Arduino Set Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Utilities_Call_Trace <em>Arduino Utilities Call Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_FunctionCall_Execute_Trace <em>Arduino Function Call Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_If_Execute_Trace <em>Arduino If Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_While_Execute_Trace <em>Arduino While Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.StepsImpl#getArduino_Status_Call_Trace <em>Arduino Status Call Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepsImpl extends MinimalEObjectImpl.Container implements Steps {
	/**
	 * The cached value of the '{@link #getArduino_Status_Execute_FillStep_Trace() <em>Arduino Status Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Status_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Status_Execute_FillStep> arduino_Status_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Project_Setup_FillStep_Trace() <em>Arduino Project Setup Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Project_Setup_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Project_Setup_FillStep> arduino_Project_Setup_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Repeat_Execute_FillStep_Trace() <em>Arduino Repeat Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Repeat_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Repeat_Execute_FillStep> arduino_Repeat_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Level_Execute_FillStep_Trace() <em>Arduino Level Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Level_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Level_Execute_FillStep> arduino_Level_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Set_Execute_FillStep_Trace() <em>Arduino Set Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Set_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Set_Execute_FillStep> arduino_Set_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Delay_Execute_Trace() <em>Arduino Delay Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Delay_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Delay_Execute> arduino_Delay_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Utilities_Call_FillStep_Trace() <em>Arduino Utilities Call Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Utilities_Call_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Utilities_Call_FillStep> arduino_Utilities_Call_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_FunctionCall_Execute_FillStep_Trace() <em>Arduino Function Call Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_FunctionCall_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_FunctionCall_Execute_FillStep> arduino_FunctionCall_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Utilities_Execute_Trace() <em>Arduino Utilities Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Utilities_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Utilities_Execute> arduino_Utilities_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_If_Execute_FillStep_Trace() <em>Arduino If Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_If_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_If_Execute_FillStep> arduino_If_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_While_Execute_FillStep_Trace() <em>Arduino While Execute Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_While_Execute_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_While_Execute_FillStep> arduino_While_Execute_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Status_Call_FillStep_Trace() <em>Arduino Status Call Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Status_Call_FillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Status_Call_FillStep> arduino_Status_Call_FillStep_Trace;

	/**
	 * The cached value of the '{@link #getFillStep_Trace() <em>Fill Step Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillStep_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<FillStep> fillStep_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Status_Execute_Trace() <em>Arduino Status Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Status_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Status_Execute> arduino_Status_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Project_Setup_Trace() <em>Arduino Project Setup Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Project_Setup_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Project_Setup> arduino_Project_Setup_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Repeat_Execute_Trace() <em>Arduino Repeat Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Repeat_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Repeat_Execute> arduino_Repeat_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Level_Execute_Trace() <em>Arduino Level Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Level_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Level_Execute> arduino_Level_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Set_Execute_Trace() <em>Arduino Set Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Set_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Set_Execute> arduino_Set_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Utilities_Call_Trace() <em>Arduino Utilities Call Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Utilities_Call_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Utilities_Call> arduino_Utilities_Call_Trace;

	/**
	 * The cached value of the '{@link #getArduino_FunctionCall_Execute_Trace() <em>Arduino Function Call Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_FunctionCall_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_FunctionCall_Execute> arduino_FunctionCall_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_If_Execute_Trace() <em>Arduino If Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_If_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_If_Execute> arduino_If_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_While_Execute_Trace() <em>Arduino While Execute Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_While_Execute_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_While_Execute> arduino_While_Execute_Trace;

	/**
	 * The cached value of the '{@link #getArduino_Status_Call_Trace() <em>Arduino Status Call Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Status_Call_Trace()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Status_Call> arduino_Status_Call_Trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Status_Execute_FillStep> getArduino_Status_Execute_FillStep_Trace() {
		if (arduino_Status_Execute_FillStep_Trace == null) {
			arduino_Status_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_Status_Execute_FillStep>(Arduino_Status_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_Status_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Project_Setup_FillStep> getArduino_Project_Setup_FillStep_Trace() {
		if (arduino_Project_Setup_FillStep_Trace == null) {
			arduino_Project_Setup_FillStep_Trace = new EObjectContainmentEList<Arduino_Project_Setup_FillStep>(Arduino_Project_Setup_FillStep.class, this, StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE);
		}
		return arduino_Project_Setup_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Repeat_Execute_FillStep> getArduino_Repeat_Execute_FillStep_Trace() {
		if (arduino_Repeat_Execute_FillStep_Trace == null) {
			arduino_Repeat_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_Repeat_Execute_FillStep>(Arduino_Repeat_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_Repeat_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Level_Execute_FillStep> getArduino_Level_Execute_FillStep_Trace() {
		if (arduino_Level_Execute_FillStep_Trace == null) {
			arduino_Level_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_Level_Execute_FillStep>(Arduino_Level_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_Level_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Set_Execute_FillStep> getArduino_Set_Execute_FillStep_Trace() {
		if (arduino_Set_Execute_FillStep_Trace == null) {
			arduino_Set_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_Set_Execute_FillStep>(Arduino_Set_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_Set_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Trace() {
		if (arduino_Delay_Execute_Trace == null) {
			arduino_Delay_Execute_Trace = new EObjectContainmentEList<Arduino_Delay_Execute>(Arduino_Delay_Execute.class, this, StepsPackage.STEPS__ARDUINO_DELAY_EXECUTE_TRACE);
		}
		return arduino_Delay_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Utilities_Call_FillStep> getArduino_Utilities_Call_FillStep_Trace() {
		if (arduino_Utilities_Call_FillStep_Trace == null) {
			arduino_Utilities_Call_FillStep_Trace = new EObjectContainmentEList<Arduino_Utilities_Call_FillStep>(Arduino_Utilities_Call_FillStep.class, this, StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE);
		}
		return arduino_Utilities_Call_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_FunctionCall_Execute_FillStep> getArduino_FunctionCall_Execute_FillStep_Trace() {
		if (arduino_FunctionCall_Execute_FillStep_Trace == null) {
			arduino_FunctionCall_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_FunctionCall_Execute_FillStep>(Arduino_FunctionCall_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_FunctionCall_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Utilities_Execute> getArduino_Utilities_Execute_Trace() {
		if (arduino_Utilities_Execute_Trace == null) {
			arduino_Utilities_Execute_Trace = new EObjectContainmentEList<Arduino_Utilities_Execute>(Arduino_Utilities_Execute.class, this, StepsPackage.STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE);
		}
		return arduino_Utilities_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_If_Execute_FillStep> getArduino_If_Execute_FillStep_Trace() {
		if (arduino_If_Execute_FillStep_Trace == null) {
			arduino_If_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_If_Execute_FillStep>(Arduino_If_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_If_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_While_Execute_FillStep> getArduino_While_Execute_FillStep_Trace() {
		if (arduino_While_Execute_FillStep_Trace == null) {
			arduino_While_Execute_FillStep_Trace = new EObjectContainmentEList<Arduino_While_Execute_FillStep>(Arduino_While_Execute_FillStep.class, this, StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE);
		}
		return arduino_While_Execute_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Status_Call_FillStep> getArduino_Status_Call_FillStep_Trace() {
		if (arduino_Status_Call_FillStep_Trace == null) {
			arduino_Status_Call_FillStep_Trace = new EObjectContainmentEList<Arduino_Status_Call_FillStep>(Arduino_Status_Call_FillStep.class, this, StepsPackage.STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE);
		}
		return arduino_Status_Call_FillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FillStep> getFillStep_Trace() {
		if (fillStep_Trace == null) {
			fillStep_Trace = new EObjectContainmentEList<FillStep>(FillStep.class, this, StepsPackage.STEPS__FILL_STEP_TRACE);
		}
		return fillStep_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Status_Execute> getArduino_Status_Execute_Trace() {
		if (arduino_Status_Execute_Trace == null) {
			arduino_Status_Execute_Trace = new EObjectContainmentEList<Arduino_Status_Execute>(Arduino_Status_Execute.class, this, StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_TRACE);
		}
		return arduino_Status_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Project_Setup> getArduino_Project_Setup_Trace() {
		if (arduino_Project_Setup_Trace == null) {
			arduino_Project_Setup_Trace = new EObjectContainmentEList<Arduino_Project_Setup>(Arduino_Project_Setup.class, this, StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_TRACE);
		}
		return arduino_Project_Setup_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Trace() {
		if (arduino_Repeat_Execute_Trace == null) {
			arduino_Repeat_Execute_Trace = new EObjectContainmentEList<Arduino_Repeat_Execute>(Arduino_Repeat_Execute.class, this, StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_TRACE);
		}
		return arduino_Repeat_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Level_Execute> getArduino_Level_Execute_Trace() {
		if (arduino_Level_Execute_Trace == null) {
			arduino_Level_Execute_Trace = new EObjectContainmentEList<Arduino_Level_Execute>(Arduino_Level_Execute.class, this, StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_TRACE);
		}
		return arduino_Level_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Set_Execute> getArduino_Set_Execute_Trace() {
		if (arduino_Set_Execute_Trace == null) {
			arduino_Set_Execute_Trace = new EObjectContainmentEList<Arduino_Set_Execute>(Arduino_Set_Execute.class, this, StepsPackage.STEPS__ARDUINO_SET_EXECUTE_TRACE);
		}
		return arduino_Set_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Utilities_Call> getArduino_Utilities_Call_Trace() {
		if (arduino_Utilities_Call_Trace == null) {
			arduino_Utilities_Call_Trace = new EObjectContainmentEList<Arduino_Utilities_Call>(Arduino_Utilities_Call.class, this, StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_TRACE);
		}
		return arduino_Utilities_Call_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_FunctionCall_Execute> getArduino_FunctionCall_Execute_Trace() {
		if (arduino_FunctionCall_Execute_Trace == null) {
			arduino_FunctionCall_Execute_Trace = new EObjectContainmentEList<Arduino_FunctionCall_Execute>(Arduino_FunctionCall_Execute.class, this, StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE);
		}
		return arduino_FunctionCall_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_If_Execute> getArduino_If_Execute_Trace() {
		if (arduino_If_Execute_Trace == null) {
			arduino_If_Execute_Trace = new EObjectContainmentEList<Arduino_If_Execute>(Arduino_If_Execute.class, this, StepsPackage.STEPS__ARDUINO_IF_EXECUTE_TRACE);
		}
		return arduino_If_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_While_Execute> getArduino_While_Execute_Trace() {
		if (arduino_While_Execute_Trace == null) {
			arduino_While_Execute_Trace = new EObjectContainmentEList<Arduino_While_Execute>(Arduino_While_Execute.class, this, StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_TRACE);
		}
		return arduino_While_Execute_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Status_Call> getArduino_Status_Call_Trace() {
		if (arduino_Status_Call_Trace == null) {
			arduino_Status_Call_Trace = new EObjectContainmentEList<Arduino_Status_Call>(Arduino_Status_Call.class, this, StepsPackage.STEPS__ARDUINO_STATUS_CALL_TRACE);
		}
		return arduino_Status_Call_Trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Status_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Project_Setup_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Repeat_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Level_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Set_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_DELAY_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_Delay_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Utilities_Call_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_FunctionCall_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_Utilities_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_If_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_While_Execute_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE:
				return ((InternalEList<?>)getArduino_Status_Call_FillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__FILL_STEP_TRACE:
				return ((InternalEList<?>)getFillStep_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_Status_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_TRACE:
				return ((InternalEList<?>)getArduino_Project_Setup_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_Repeat_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_Level_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_Set_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_TRACE:
				return ((InternalEList<?>)getArduino_Utilities_Call_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_FunctionCall_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_If_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_TRACE:
				return ((InternalEList<?>)getArduino_While_Execute_Trace()).basicRemove(otherEnd, msgs);
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_TRACE:
				return ((InternalEList<?>)getArduino_Status_Call_Trace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE:
				return getArduino_Status_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE:
				return getArduino_Project_Setup_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE:
				return getArduino_Repeat_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE:
				return getArduino_Level_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE:
				return getArduino_Set_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_DELAY_EXECUTE_TRACE:
				return getArduino_Delay_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE:
				return getArduino_Utilities_Call_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE:
				return getArduino_FunctionCall_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE:
				return getArduino_Utilities_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE:
				return getArduino_If_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE:
				return getArduino_While_Execute_FillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE:
				return getArduino_Status_Call_FillStep_Trace();
			case StepsPackage.STEPS__FILL_STEP_TRACE:
				return getFillStep_Trace();
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_TRACE:
				return getArduino_Status_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_TRACE:
				return getArduino_Project_Setup_Trace();
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_TRACE:
				return getArduino_Repeat_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_TRACE:
				return getArduino_Level_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_TRACE:
				return getArduino_Set_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_TRACE:
				return getArduino_Utilities_Call_Trace();
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE:
				return getArduino_FunctionCall_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_TRACE:
				return getArduino_If_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_TRACE:
				return getArduino_While_Execute_Trace();
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_TRACE:
				return getArduino_Status_Call_Trace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE:
				getArduino_Status_Execute_FillStep_Trace().clear();
				getArduino_Status_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_Status_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE:
				getArduino_Project_Setup_FillStep_Trace().clear();
				getArduino_Project_Setup_FillStep_Trace().addAll((Collection<? extends Arduino_Project_Setup_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE:
				getArduino_Repeat_Execute_FillStep_Trace().clear();
				getArduino_Repeat_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_Repeat_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE:
				getArduino_Level_Execute_FillStep_Trace().clear();
				getArduino_Level_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_Level_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE:
				getArduino_Set_Execute_FillStep_Trace().clear();
				getArduino_Set_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_Set_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_DELAY_EXECUTE_TRACE:
				getArduino_Delay_Execute_Trace().clear();
				getArduino_Delay_Execute_Trace().addAll((Collection<? extends Arduino_Delay_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE:
				getArduino_Utilities_Call_FillStep_Trace().clear();
				getArduino_Utilities_Call_FillStep_Trace().addAll((Collection<? extends Arduino_Utilities_Call_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE:
				getArduino_FunctionCall_Execute_FillStep_Trace().clear();
				getArduino_FunctionCall_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_FunctionCall_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE:
				getArduino_Utilities_Execute_Trace().clear();
				getArduino_Utilities_Execute_Trace().addAll((Collection<? extends Arduino_Utilities_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE:
				getArduino_If_Execute_FillStep_Trace().clear();
				getArduino_If_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_If_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE:
				getArduino_While_Execute_FillStep_Trace().clear();
				getArduino_While_Execute_FillStep_Trace().addAll((Collection<? extends Arduino_While_Execute_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE:
				getArduino_Status_Call_FillStep_Trace().clear();
				getArduino_Status_Call_FillStep_Trace().addAll((Collection<? extends Arduino_Status_Call_FillStep>)newValue);
				return;
			case StepsPackage.STEPS__FILL_STEP_TRACE:
				getFillStep_Trace().clear();
				getFillStep_Trace().addAll((Collection<? extends FillStep>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_TRACE:
				getArduino_Status_Execute_Trace().clear();
				getArduino_Status_Execute_Trace().addAll((Collection<? extends Arduino_Status_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_TRACE:
				getArduino_Project_Setup_Trace().clear();
				getArduino_Project_Setup_Trace().addAll((Collection<? extends Arduino_Project_Setup>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_TRACE:
				getArduino_Repeat_Execute_Trace().clear();
				getArduino_Repeat_Execute_Trace().addAll((Collection<? extends Arduino_Repeat_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_TRACE:
				getArduino_Level_Execute_Trace().clear();
				getArduino_Level_Execute_Trace().addAll((Collection<? extends Arduino_Level_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_TRACE:
				getArduino_Set_Execute_Trace().clear();
				getArduino_Set_Execute_Trace().addAll((Collection<? extends Arduino_Set_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_TRACE:
				getArduino_Utilities_Call_Trace().clear();
				getArduino_Utilities_Call_Trace().addAll((Collection<? extends Arduino_Utilities_Call>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE:
				getArduino_FunctionCall_Execute_Trace().clear();
				getArduino_FunctionCall_Execute_Trace().addAll((Collection<? extends Arduino_FunctionCall_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_TRACE:
				getArduino_If_Execute_Trace().clear();
				getArduino_If_Execute_Trace().addAll((Collection<? extends Arduino_If_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_TRACE:
				getArduino_While_Execute_Trace().clear();
				getArduino_While_Execute_Trace().addAll((Collection<? extends Arduino_While_Execute>)newValue);
				return;
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_TRACE:
				getArduino_Status_Call_Trace().clear();
				getArduino_Status_Call_Trace().addAll((Collection<? extends Arduino_Status_Call>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE:
				getArduino_Status_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE:
				getArduino_Project_Setup_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE:
				getArduino_Repeat_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE:
				getArduino_Level_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE:
				getArduino_Set_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_DELAY_EXECUTE_TRACE:
				getArduino_Delay_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE:
				getArduino_Utilities_Call_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE:
				getArduino_FunctionCall_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE:
				getArduino_Utilities_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE:
				getArduino_If_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE:
				getArduino_While_Execute_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE:
				getArduino_Status_Call_FillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__FILL_STEP_TRACE:
				getFillStep_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_TRACE:
				getArduino_Status_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_TRACE:
				getArduino_Project_Setup_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_TRACE:
				getArduino_Repeat_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_TRACE:
				getArduino_Level_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_TRACE:
				getArduino_Set_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_TRACE:
				getArduino_Utilities_Call_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE:
				getArduino_FunctionCall_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_TRACE:
				getArduino_If_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_TRACE:
				getArduino_While_Execute_Trace().clear();
				return;
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_TRACE:
				getArduino_Status_Call_Trace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_FILL_STEP_TRACE:
				return arduino_Status_Execute_FillStep_Trace != null && !arduino_Status_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_FILL_STEP_TRACE:
				return arduino_Project_Setup_FillStep_Trace != null && !arduino_Project_Setup_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_FILL_STEP_TRACE:
				return arduino_Repeat_Execute_FillStep_Trace != null && !arduino_Repeat_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_FILL_STEP_TRACE:
				return arduino_Level_Execute_FillStep_Trace != null && !arduino_Level_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_FILL_STEP_TRACE:
				return arduino_Set_Execute_FillStep_Trace != null && !arduino_Set_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_DELAY_EXECUTE_TRACE:
				return arduino_Delay_Execute_Trace != null && !arduino_Delay_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_FILL_STEP_TRACE:
				return arduino_Utilities_Call_FillStep_Trace != null && !arduino_Utilities_Call_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_FILL_STEP_TRACE:
				return arduino_FunctionCall_Execute_FillStep_Trace != null && !arduino_FunctionCall_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_UTILITIES_EXECUTE_TRACE:
				return arduino_Utilities_Execute_Trace != null && !arduino_Utilities_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_FILL_STEP_TRACE:
				return arduino_If_Execute_FillStep_Trace != null && !arduino_If_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_FILL_STEP_TRACE:
				return arduino_While_Execute_FillStep_Trace != null && !arduino_While_Execute_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_FILL_STEP_TRACE:
				return arduino_Status_Call_FillStep_Trace != null && !arduino_Status_Call_FillStep_Trace.isEmpty();
			case StepsPackage.STEPS__FILL_STEP_TRACE:
				return fillStep_Trace != null && !fillStep_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_STATUS_EXECUTE_TRACE:
				return arduino_Status_Execute_Trace != null && !arduino_Status_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_PROJECT_SETUP_TRACE:
				return arduino_Project_Setup_Trace != null && !arduino_Project_Setup_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_REPEAT_EXECUTE_TRACE:
				return arduino_Repeat_Execute_Trace != null && !arduino_Repeat_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_LEVEL_EXECUTE_TRACE:
				return arduino_Level_Execute_Trace != null && !arduino_Level_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_SET_EXECUTE_TRACE:
				return arduino_Set_Execute_Trace != null && !arduino_Set_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_UTILITIES_CALL_TRACE:
				return arduino_Utilities_Call_Trace != null && !arduino_Utilities_Call_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_FUNCTION_CALL_EXECUTE_TRACE:
				return arduino_FunctionCall_Execute_Trace != null && !arduino_FunctionCall_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_IF_EXECUTE_TRACE:
				return arduino_If_Execute_Trace != null && !arduino_If_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_WHILE_EXECUTE_TRACE:
				return arduino_While_Execute_Trace != null && !arduino_While_Execute_Trace.isEmpty();
			case StepsPackage.STEPS__ARDUINO_STATUS_CALL_TRACE:
				return arduino_Status_Call_Trace != null && !arduino_Status_Call_Trace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StepsImpl

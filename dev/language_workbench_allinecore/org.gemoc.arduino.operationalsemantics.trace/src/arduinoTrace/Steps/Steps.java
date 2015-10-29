/**
 */
package arduinoTrace.Steps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Status_Execute_FillStep_Trace <em>Arduino Status Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Project_Setup_FillStep_Trace <em>Arduino Project Setup Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Repeat_Execute_FillStep_Trace <em>Arduino Repeat Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Level_Execute_FillStep_Trace <em>Arduino Level Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Set_Execute_FillStep_Trace <em>Arduino Set Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Delay_Execute_Trace <em>Arduino Delay Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Utilities_Call_FillStep_Trace <em>Arduino Utilities Call Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_FunctionCall_Execute_FillStep_Trace <em>Arduino Function Call Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Utilities_Execute_Trace <em>Arduino Utilities Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_If_Execute_FillStep_Trace <em>Arduino If Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_While_Execute_FillStep_Trace <em>Arduino While Execute Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Status_Call_FillStep_Trace <em>Arduino Status Call Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getFillStep_Trace <em>Fill Step Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Status_Execute_Trace <em>Arduino Status Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Project_Setup_Trace <em>Arduino Project Setup Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Repeat_Execute_Trace <em>Arduino Repeat Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Level_Execute_Trace <em>Arduino Level Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Set_Execute_Trace <em>Arduino Set Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Utilities_Call_Trace <em>Arduino Utilities Call Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_FunctionCall_Execute_Trace <em>Arduino Function Call Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_If_Execute_Trace <em>Arduino If Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_While_Execute_Trace <em>Arduino While Execute Trace</em>}</li>
 *   <li>{@link arduinoTrace.Steps.Steps#getArduino_Status_Call_Trace <em>Arduino Status Call Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getSteps()
 * @model
 * @generated
 */
public interface Steps extends EObject {
	/**
	 * Returns the value of the '<em><b>Arduino Status Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Status_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Status Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Status Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Status_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Status_Execute_FillStep> getArduino_Status_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Project Setup Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Project_Setup_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Project Setup Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Project Setup Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Project_Setup_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Project_Setup_FillStep> getArduino_Project_Setup_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Repeat Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Repeat_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Repeat Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Repeat Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Repeat_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Repeat_Execute_FillStep> getArduino_Repeat_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Level Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Level_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Level Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Level Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Level_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Level_Execute_FillStep> getArduino_Level_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Set Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Set_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Set Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Set Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Set_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Set_Execute_FillStep> getArduino_Set_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Delay Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Delay_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Delay Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Delay Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Delay_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Utilities Call Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Call_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Utilities Call Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Utilities Call Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Utilities_Call_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Utilities_Call_FillStep> getArduino_Utilities_Call_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Function Call Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_FunctionCall_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Function Call Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Function Call Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_FunctionCall_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_FunctionCall_Execute_FillStep> getArduino_FunctionCall_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Utilities Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Utilities Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Utilities Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Utilities_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Utilities_Execute> getArduino_Utilities_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino If Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_If_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino If Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino If Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_If_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_If_Execute_FillStep> getArduino_If_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino While Execute Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_While_Execute_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino While Execute Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino While Execute Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_While_Execute_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_While_Execute_FillStep> getArduino_While_Execute_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Status Call Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Status_Call_FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Status Call Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Status Call Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Status_Call_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Status_Call_FillStep> getArduino_Status_Call_FillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Fill Step Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.FillStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Step Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Step Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_FillStep_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<FillStep> getFillStep_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Status Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Status_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Status Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Status Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Status_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Status_Execute> getArduino_Status_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Project Setup Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Project_Setup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Project Setup Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Project Setup Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Project_Setup_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Project_Setup> getArduino_Project_Setup_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Repeat Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Repeat_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Repeat Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Repeat Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Repeat_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Level Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Level_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Level Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Level Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Level_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Level_Execute> getArduino_Level_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Set Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Set_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Set Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Set Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Set_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Set_Execute> getArduino_Set_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Utilities Call Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Call}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Utilities Call Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Utilities Call Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Utilities_Call_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Utilities_Call> getArduino_Utilities_Call_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Function Call Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_FunctionCall_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Function Call Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Function Call Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_FunctionCall_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_FunctionCall_Execute> getArduino_FunctionCall_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino If Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_If_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino If Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino If Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_If_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_If_Execute> getArduino_If_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino While Execute Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_While_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino While Execute Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino While Execute Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_While_Execute_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_While_Execute> getArduino_While_Execute_Trace();

	/**
	 * Returns the value of the '<em><b>Arduino Status Call Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Status_Call}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Status Call Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Status Call Trace</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getSteps_Arduino_Status_Call_Trace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_Status_Call> getArduino_Status_Call_Trace();

} // Steps

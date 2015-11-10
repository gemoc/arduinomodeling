/**
 */
package arduinoTrace;

import arduinoTrace.States.State;

import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedBooleanValue;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedNumberValue;
import arduinoTrace.States.arduino.TracedStringValue;
import arduinoTrace.States.arduino.TracedVariable;

import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_FunctionCall_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_Level_Execute;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Set_Execute;
import arduinoTrace.Steps.Arduino_Status_Call;
import arduinoTrace.Steps.Arduino_Status_Execute;
import arduinoTrace.Steps.Arduino_Utilities_Call;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_While_Execute;
import arduinoTrace.Steps.Step;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Trace#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getRootSteps <em>Root Steps</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedVariables <em>Arduino traced Variables</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedNumberValues <em>Arduino traced Number Values</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedBooleanValues <em>Arduino traced Boolean Values</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedStringValues <em>Arduino traced String Values</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Level_Execute_Sequence <em>Arduino Level Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Status_Execute_Sequence <em>Arduino Status Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Set_Execute_Sequence <em>Arduino Set Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Status_Call_Sequence <em>Arduino Status Call Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Utilities_Call_Sequence <em>Arduino Utilities Call Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_FunctionCall_Execute_Sequence <em>Arduino Function Call Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_While_Execute_Sequence <em>Arduino While Execute Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.ArduinoTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_RootSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getRootSteps();

	/**
	 * Returns the value of the '<em><b>Arduino traced Variables</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Variables</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedVariable> getArduino_tracedVariables();

	/**
	 * Returns the value of the '<em><b>Arduino traced Number Values</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedNumberValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Number Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Number Values</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedNumberValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedNumberValue> getArduino_tracedNumberValues();

	/**
	 * Returns the value of the '<em><b>Arduino traced Boolean Values</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedBooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Boolean Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Boolean Values</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedBooleanValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanValue> getArduino_tracedBooleanValues();

	/**
	 * Returns the value of the '<em><b>Arduino traced String Values</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedStringValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced String Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced String Values</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedStringValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedStringValue> getArduino_tracedStringValues();

	/**
	 * Returns the value of the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedDigitalPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Digital Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Digital Pins</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedDigitalPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDigitalPin> getArduino_tracedDigitalPins();

	/**
	 * Returns the value of the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedAnalogPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Analog Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Analog Pins</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedAnalogPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedAnalogPin> getArduino_tracedAnalogPins();

	/**
	 * Returns the value of the '<em><b>Arduino If Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_If_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino If Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino If Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_If_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_If_Execute> getArduino_If_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Level Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Level_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Level Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Level Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Level_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Level_Execute> getArduino_Level_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Status Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Status_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Status Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Status Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Status_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Status_Execute> getArduino_Status_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Set Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Set_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Set Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Set Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Set_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Set_Execute> getArduino_Set_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Utilities Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Utilities Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Utilities Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Utilities_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Utilities_Execute> getArduino_Utilities_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Delay_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Delay Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Delay Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Delay_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Status Call Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Status_Call}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Status Call Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Status Call Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Status_Call_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Status_Call> getArduino_Status_Call_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Repeat_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Repeat Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Repeat Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Repeat_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Project Setup Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Project_Setup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Project Setup Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Project Setup Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Project_Setup_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Project_Setup> getArduino_Project_Setup_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Utilities Call Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Utilities_Call}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Utilities Call Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Utilities Call Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_Utilities_Call_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Utilities_Call> getArduino_Utilities_Call_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Function Call Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_FunctionCall_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Function Call Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Function Call Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_FunctionCall_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_FunctionCall_Execute> getArduino_FunctionCall_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino While Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_While_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino While Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino While Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_While_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_While_Execute> getArduino_While_Execute_Sequence();

} // Trace

/**
 */
package arduinoTrace;

import arduinoTrace.States.State;

import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedIntegerVariable;

import arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate;
import arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate;
import arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Call;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_Utilities_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
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
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedIntegerVariables <em>Arduino traced Integer Variables</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedBooleanVariables <em>Arduino traced Boolean Variables</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_BooleanModuleGet_Evaluate_Sequence <em>Arduino Boolean Module Get Evaluate Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_While_Execute_Sequence <em>Arduino While Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Utilities_Execute_Sequence <em>Arduino Utilities Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_IntegerModuleGet_Evaluate_Sequence <em>Arduino Integer Module Get Evaluate Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_BooleanConstant_Evaluate_Sequence <em>Arduino Boolean Constant Evaluate Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_ModuleAssignment_Call_Sequence <em>Arduino Module Assignment Call Sequence</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getArduino_IntegerConstant_Evaluate_Sequence <em>Arduino Integer Constant Evaluate Sequence</em>}</li>
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
	 * Returns the value of the '<em><b>Arduino traced Integer Variables</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedIntegerVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Integer Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Integer Variables</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedIntegerVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerVariable> getArduino_tracedIntegerVariables();

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
	 * Returns the value of the '<em><b>Arduino traced Boolean Variables</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedBooleanVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Boolean Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Boolean Variables</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_tracedBooleanVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanVariable> getArduino_tracedBooleanVariables();

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
	 * Returns the value of the '<em><b>Arduino Boolean Module Get Evaluate Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Boolean Module Get Evaluate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Boolean Module Get Evaluate Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_BooleanModuleGet_Evaluate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_BooleanModuleGet_Evaluate> getArduino_BooleanModuleGet_Evaluate_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Module Assignment Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Module Assignment Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_ModuleAssignment_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_ModuleAssignment_Execute> getArduino_ModuleAssignment_Execute_Sequence();

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
	 * Returns the value of the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Variable Declaration Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Variable Declaration Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_VariableDeclaration_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_VariableDeclaration_Execute> getArduino_VariableDeclaration_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Variable Assignment Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Variable Assignment Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_VariableAssignment_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_VariableAssignment_Execute> getArduino_VariableAssignment_Execute_Sequence();

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
	 * Returns the value of the '<em><b>Arduino Integer Module Get Evaluate Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_IntegerModuleGet_Evaluate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Integer Module Get Evaluate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Integer Module Get Evaluate Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_IntegerModuleGet_Evaluate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_IntegerModuleGet_Evaluate> getArduino_IntegerModuleGet_Evaluate_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Boolean Constant Evaluate Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_BooleanConstant_Evaluate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Boolean Constant Evaluate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Boolean Constant Evaluate Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_BooleanConstant_Evaluate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_BooleanConstant_Evaluate> getArduino_BooleanConstant_Evaluate_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Module Assignment Call Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_ModuleAssignment_Call}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Module Assignment Call Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Module Assignment Call Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_ModuleAssignment_Call_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_ModuleAssignment_Call> getArduino_ModuleAssignment_Call_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Integer Constant Evaluate Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_IntegerConstant_Evaluate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Integer Constant Evaluate Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Integer Constant Evaluate Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Arduino_IntegerConstant_Evaluate_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_IntegerConstant_Evaluate> getArduino_IntegerConstant_Evaluate_Sequence();

} // Trace

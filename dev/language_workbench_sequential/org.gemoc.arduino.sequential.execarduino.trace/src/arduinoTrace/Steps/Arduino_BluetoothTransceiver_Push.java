/**
 */
package arduinoTrace.Steps;

import org.eclipse.emf.common.util.EList;

import org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Bluetooth Transceiver Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_BluetoothTransceiver_Push()
 * @model
 * @generated
 */
public interface Arduino_BluetoothTransceiver_Push extends Arduino_BluetoothTransceiver_Push_AbstractSubStep, Arduino_Delay_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep, Arduino_ModuleAssignment_Execute_AbstractSubStep, Arduino_Repeat_Execute_AbstractSubStep, Arduino_VariableAssignment_Execute_AbstractSubStep, Arduino_VariableDeclaration_Execute_AbstractSubStep, BigStep {
	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push_AbstractSubStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see arduinoTrace.Steps.StepsPackage#getArduino_BluetoothTransceiver_Push_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino_BluetoothTransceiver_Push_AbstractSubStep> getSubSteps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (BluetoothTransceiver) this.getMse().getCaller();\n'"
	 * @generated
	 */
	BluetoothTransceiver getCaller();

} // Arduino_BluetoothTransceiver_Push

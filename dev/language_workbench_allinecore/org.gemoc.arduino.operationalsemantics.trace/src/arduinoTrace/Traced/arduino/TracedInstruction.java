/**
 */
package arduinoTrace.Traced.arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedInstruction#getPrevious <em>Previous</em>}</li>
 *   <li>{@link arduinoTrace.Traced.arduino.TracedInstruction#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedInstruction()
 * @model abstract="true"
 * @generated
 */
public interface TracedInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(TracedInstruction)
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedInstruction_Previous()
	 * @model
	 * @generated
	 */
	TracedInstruction getPrevious();

	/**
	 * Sets the value of the '{@link arduinoTrace.Traced.arduino.TracedInstruction#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(TracedInstruction value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(TracedInstruction)
	 * @see arduinoTrace.Traced.arduino.ArduinoPackage#getTracedInstruction_Next()
	 * @model
	 * @generated
	 */
	TracedInstruction getNext();

	/**
	 * Sets the value of the '{@link arduinoTrace.Traced.arduino.TracedInstruction#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(TracedInstruction value);

} // TracedInstruction

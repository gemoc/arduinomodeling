/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getNext <em>Next</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSynchronizationBlock()
 * @model
 * @generated
 */
public interface SynchronizationBlock extends ThreadInstructionBlock {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(InstructionBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSynchronizationBlock_Next()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	InstructionBlock getNext();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(InstructionBlock value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(InstructionBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSynchronizationBlock_Previous()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getNext
	 * @model opposite="next"
	 * @generated
	 */
	InstructionBlock getPrevious();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(InstructionBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // SynchronizationBlock

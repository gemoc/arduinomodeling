/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThreadInstructionBlock()
 * @model abstract="true"
 * @generated
 */
public interface ThreadInstructionBlock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Thread</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' container reference.
	 * @see #setThread(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThreadInstructionBlock_Thread()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getBlocks
	 * @model opposite="blocks" transient="false"
	 * @generated
	 */
	org.gemoc.arduino.xdsml.arduinomt.arduino.Thread getThread();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' container reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ThreadInstructionBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThreadInstructionBlock_Next()
	 * @model
	 * @generated
	 */
	ThreadInstructionBlock getNext();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ThreadInstructionBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // ThreadInstructionBlock

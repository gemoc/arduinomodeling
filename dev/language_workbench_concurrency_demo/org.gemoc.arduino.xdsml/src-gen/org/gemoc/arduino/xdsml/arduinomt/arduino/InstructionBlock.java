/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getNext <em>Next</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getInstructionBlock()
 * @model
 * @generated
 */
public interface InstructionBlock extends ThreadInstructionBlock {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getInstructionBlock_Instructions()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction#getOwnedBlock
	 * @model opposite="ownedBlock" containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(SynchronizationBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getInstructionBlock_Next()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	SynchronizationBlock getNext();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(SynchronizationBlock value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(SynchronizationBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getInstructionBlock_Previous()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.SynchronizationBlock#getNext
	 * @model opposite="next"
	 * @generated
	 */
	SynchronizationBlock getPrevious();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(SynchronizationBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // InstructionBlock

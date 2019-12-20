/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Block</em>' container reference.
	 * @see #setOwnedBlock(InstructionBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getInstruction_OwnedBlock()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.InstructionBlock#getInstructions
	 * @model opposite="instructions" transient="false"
	 * @generated
	 */
	InstructionBlock getOwnedBlock();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Block</em>' container reference.
	 * @see #getOwnedBlock()
	 * @generated
	 */
	void setOwnedBlock(InstructionBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finalize();

} // Instruction

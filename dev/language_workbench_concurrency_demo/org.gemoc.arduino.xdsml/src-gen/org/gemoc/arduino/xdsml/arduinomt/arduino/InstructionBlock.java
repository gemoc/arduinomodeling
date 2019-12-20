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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // InstructionBlock

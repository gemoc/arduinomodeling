/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getCurrentInstruction <em>Current Instruction</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getFirst <em>First</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThread_Blocks()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ThreadInstructionBlock#getThread
	 * @model opposite="thread" containment="true"
	 * @generated
	 */
	EList<ThreadInstructionBlock> getBlocks();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThread_Channels()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Current Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Instruction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Instruction</em>' reference.
	 * @see #setCurrentInstruction(Instruction)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThread_CurrentInstruction()
	 * @model
	 * @generated
	 */
	Instruction getCurrentInstruction();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getCurrentInstruction <em>Current Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Instruction</em>' reference.
	 * @see #getCurrentInstruction()
	 * @generated
	 */
	void setCurrentInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(ThreadInstructionBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThread_First()
	 * @model
	 * @generated
	 */
	ThreadInstructionBlock getFirst();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(ThreadInstructionBlock value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(ThreadInstructionBlock)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getThread_Last()
	 * @model
	 * @generated
	 */
	ThreadInstructionBlock getLast();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(ThreadInstructionBlock value);

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
	void synchronize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

} // Thread

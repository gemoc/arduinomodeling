/**
 *  Copyright (c) 2013 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Thread#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Thread#getChannels <em>Channels</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Thread#getCurrentInstruction <em>Current Instruction</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Thread#getFirst <em>First</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Thread#getLast <em>Last</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Thread#getNbCycle <em>Nb Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.ThreadInstructionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread_Blocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThreadInstructionBlock> getBlocks();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.Channel}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.Channel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread_Channels()
	 * @see fr.obeo.dsl.arduino.Channel#getSource
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
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread_CurrentInstruction()
	 * @model
	 * @generated
	 */
	Instruction getCurrentInstruction();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Thread#getCurrentInstruction <em>Current Instruction</em>}' reference.
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
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread_First()
	 * @model
	 * @generated
	 */
	ThreadInstructionBlock getFirst();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Thread#getFirst <em>First</em>}' reference.
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
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread_Last()
	 * @model
	 * @generated
	 */
	ThreadInstructionBlock getLast();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Thread#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(ThreadInstructionBlock value);

	/**
	 * Returns the value of the '<em><b>Nb Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Cycle</em>' attribute.
	 * @see #setNbCycle(int)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThread_NbCycle()
	 * @model
	 * @generated
	 */
	int getNbCycle();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Thread#getNbCycle <em>Nb Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cycle</em>' attribute.
	 * @see #getNbCycle()
	 * @generated
	 */
	void setNbCycle(int value);

} // Thread

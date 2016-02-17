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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Block#getAbstractInstructionBlocks <em>Abstract Instruction Blocks</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Block#getThread <em>Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Instruction Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.AbstractInstructionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Instruction Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Instruction Blocks</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getBlock_AbstractInstructionBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInstructionBlock> getAbstractInstructionBlocks();

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.Thread#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' container reference.
	 * @see #setThread(fr.obeo.dsl.arduino.Thread)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getBlock_Thread()
	 * @see fr.obeo.dsl.arduino.Thread#getBlock
	 * @model opposite="block" transient="false"
	 * @generated
	 */
	fr.obeo.dsl.arduino.Thread getThread();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Block#getThread <em>Thread</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' container reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(fr.obeo.dsl.arduino.Thread value);

} // Block

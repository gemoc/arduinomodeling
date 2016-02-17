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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThreadInstructionBlock()
 * @model abstract="true"
 * @generated
 */
public interface ThreadInstructionBlock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Thread</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.Thread#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' container reference.
	 * @see #setThread(fr.obeo.dsl.arduino.Thread)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThreadInstructionBlock_Thread()
	 * @see fr.obeo.dsl.arduino.Thread#getBlocks
	 * @model opposite="blocks" transient="false"
	 * @generated
	 */
	fr.obeo.dsl.arduino.Thread getThread();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' container reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(fr.obeo.dsl.arduino.Thread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // ThreadInstructionBlock

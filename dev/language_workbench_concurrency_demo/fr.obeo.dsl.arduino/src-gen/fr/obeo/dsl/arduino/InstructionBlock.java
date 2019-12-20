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
 * A representation of the model object '<em><b>Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.InstructionBlock#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getInstructionBlock()
 * @model
 * @generated
 */
public interface InstructionBlock extends ThreadInstructionBlock {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.Instruction}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getInstructionBlock_Instructions()
	 * @see fr.obeo.dsl.arduino.Instruction#getOwnedBlock
	 * @model opposite="ownedBlock" containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // InstructionBlock

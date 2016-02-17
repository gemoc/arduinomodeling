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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.InstructionBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Block</em>' container reference.
	 * @see #setOwnedBlock(InstructionBlock)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getInstruction_OwnedBlock()
	 * @see fr.obeo.dsl.arduino.InstructionBlock#getInstructions
	 * @model opposite="instructions" transient="false"
	 * @generated
	 */
	InstructionBlock getOwnedBlock();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Instruction#getOwnedBlock <em>Owned Block</em>}' container reference.
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

} // Instruction

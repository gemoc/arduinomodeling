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
 * A representation of the model object '<em><b>Synchronization Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.SynchronizationBlock#getNext <em>Next</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.SynchronizationBlock#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getSynchronizationBlock()
 * @model
 * @generated
 */
public interface SynchronizationBlock extends ThreadInstructionBlock {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.InstructionBlock#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(InstructionBlock)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getSynchronizationBlock_Next()
	 * @see fr.obeo.dsl.arduino.InstructionBlock#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	InstructionBlock getNext();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.SynchronizationBlock#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(InstructionBlock value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.InstructionBlock#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(InstructionBlock)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getSynchronizationBlock_Previous()
	 * @see fr.obeo.dsl.arduino.InstructionBlock#getNext
	 * @model opposite="next"
	 * @generated
	 */
	InstructionBlock getPrevious();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.SynchronizationBlock#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(InstructionBlock value);

} // SynchronizationBlock

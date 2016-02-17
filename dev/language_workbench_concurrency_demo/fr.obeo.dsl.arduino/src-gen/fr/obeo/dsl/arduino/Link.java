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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Link#getInBoard <em>In Board</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Link#getOutBoard <em>Out Board</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>In Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Board</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Board</em>' reference.
	 * @see #setInBoard(Board)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getLink_InBoard()
	 * @model required="true"
	 * @generated
	 */
	Board getInBoard();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Link#getInBoard <em>In Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Board</em>' reference.
	 * @see #getInBoard()
	 * @generated
	 */
	void setInBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Out Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Board</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Board</em>' reference.
	 * @see #setOutBoard(Board)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getLink_OutBoard()
	 * @model required="true"
	 * @generated
	 */
	Board getOutBoard();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Link#getOutBoard <em>Out Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Board</em>' reference.
	 * @see #getOutBoard()
	 * @generated
	 */
	void setOutBoard(Board value);

} // Link

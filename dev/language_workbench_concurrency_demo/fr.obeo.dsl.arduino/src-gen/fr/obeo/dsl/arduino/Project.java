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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.Project#getBoards <em>Boards</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Project#getSketch <em>Sketch</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.Project#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.Board}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getProject_Boards()
	 * @see fr.obeo.dsl.arduino.Board#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.obeo.dsl.arduino.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getProject_Sketch()
	 * @see fr.obeo.dsl.arduino.Sketch#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	Sketch getSketch();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.Project#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	void setSketch(Sketch value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.arduino.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getProject_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Project

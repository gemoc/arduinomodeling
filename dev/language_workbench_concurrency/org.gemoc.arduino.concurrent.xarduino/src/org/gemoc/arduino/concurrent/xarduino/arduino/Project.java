/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.Project#getBoards <em>Boards</em>}</li>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.Project#getSketches <em>Sketches</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.concurrent.xarduino.arduino.Board}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.concurrent.xarduino.arduino.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getProject_Boards()
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.Board#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Sketches</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.concurrent.xarduino.arduino.Sketch}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.concurrent.xarduino.arduino.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketches</em>' containment reference list.
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getProject_Sketches()
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.Sketch#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Sketch> getSketches();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 *        annotation="aspect"
	 * @generated
	 */
	void initializeModel(EList<String> args);

} // Project

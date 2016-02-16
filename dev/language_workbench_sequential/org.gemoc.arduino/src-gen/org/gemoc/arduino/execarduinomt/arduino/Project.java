/**
 */
package org.gemoc.arduino.execarduinomt.arduino;

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
 *   <li>{@link org.gemoc.arduino.execarduinomt.arduino.Project#getBoard <em>Board</em>}</li>
 *   <li>{@link org.gemoc.arduino.execarduinomt.arduino.Project#getSketch <em>Sketch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.execarduinomt.arduino.ArduinoPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.execarduinomt.arduino.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see org.gemoc.arduino.execarduinomt.arduino.ArduinoPackage#getProject_Board()
	 * @see org.gemoc.arduino.execarduinomt.arduino.Board#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.execarduinomt.arduino.Project#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.execarduinomt.arduino.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see org.gemoc.arduino.execarduinomt.arduino.ArduinoPackage#getProject_Sketch()
	 * @see org.gemoc.arduino.execarduinomt.arduino.Sketch#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	Sketch getSketch();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.execarduinomt.arduino.Project#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	void setSketch(Sketch value);

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
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

} // Project

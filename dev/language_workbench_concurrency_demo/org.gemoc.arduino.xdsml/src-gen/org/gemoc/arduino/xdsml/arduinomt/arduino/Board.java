/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getProject <em>Project</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getThreads <em>Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getBoard()
 * @model abstract="true"
 * @generated
 */
public interface Board extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getBoard_Project()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getBoards
	 * @model opposite="boards" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getBoard_Threads()
	 * @model
	 * @generated
	 */
	EList<org.gemoc.arduino.xdsml.arduinomt.arduino.Thread> getThreads();

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
	void idle();

} // Board

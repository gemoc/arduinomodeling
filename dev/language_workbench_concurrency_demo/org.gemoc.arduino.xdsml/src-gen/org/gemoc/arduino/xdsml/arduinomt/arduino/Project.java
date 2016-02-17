/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getBoards <em>Boards</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getSketch <em>Sketch</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getProject_Boards()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Board#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getProject_Sketch()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	Sketch getSketch();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	void setSketch(Sketch value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getProject_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

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

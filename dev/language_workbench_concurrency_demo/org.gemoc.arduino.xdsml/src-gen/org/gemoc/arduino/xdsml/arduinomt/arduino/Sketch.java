/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getProject <em>Project</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getChannels <em>Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSketch()
 * @model
 * @generated
 */
public interface Sketch extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getSketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSketch_Project()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Project#getSketch
	 * @model opposite="sketch" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Sketch#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSketch_Threads()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.gemoc.arduino.xdsml.arduinomt.arduino.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getSketch_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

} // Sketch

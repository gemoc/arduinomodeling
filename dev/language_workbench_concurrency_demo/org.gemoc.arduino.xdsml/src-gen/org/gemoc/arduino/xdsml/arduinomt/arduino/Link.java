/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getInBoard <em>In Board</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getOutBoard <em>Out Board</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getChannels <em>Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getLink()
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
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getLink_InBoard()
	 * @model required="true"
	 * @generated
	 */
	Board getInBoard();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getInBoard <em>In Board</em>}' reference.
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
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getLink_OutBoard()
	 * @model required="true"
	 * @generated
	 */
	Board getOutBoard();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Link#getOutBoard <em>Out Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Board</em>' reference.
	 * @see #getOutBoard()
	 * @generated
	 */
	void setOutBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getLink_Channels()
	 * @model
	 * @generated
	 */
	EList<Channel> getChannels();

} // Link

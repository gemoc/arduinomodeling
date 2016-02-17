/**
 */
package org.gemoc.arduino.xdsml.arduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getSource <em>Source</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getInRate <em>In Rate</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getOutRate <em>Out Rate</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCurrentSize <em>Current Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel_Source()
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.Thread#getChannels
	 * @model opposite="channels" required="true"
	 * @generated
	 */
	org.gemoc.arduino.xdsml.arduinomt.arduino.Thread getSource();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel_Target()
	 * @model required="true"
	 * @generated
	 */
	org.gemoc.arduino.xdsml.arduinomt.arduino.Thread getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(org.gemoc.arduino.xdsml.arduinomt.arduino.Thread value);

	/**
	 * Returns the value of the '<em><b>In Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Rate</em>' attribute.
	 * @see #setInRate(int)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel_InRate()
	 * @model
	 * @generated
	 */
	int getInRate();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getInRate <em>In Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Rate</em>' attribute.
	 * @see #getInRate()
	 * @generated
	 */
	void setInRate(int value);

	/**
	 * Returns the value of the '<em><b>Out Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Rate</em>' attribute.
	 * @see #setOutRate(int)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel_OutRate()
	 * @model
	 * @generated
	 */
	int getOutRate();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getOutRate <em>Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Rate</em>' attribute.
	 * @see #getOutRate()
	 * @generated
	 */
	void setOutRate(int value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Current Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Size</em>' attribute.
	 * @see #setCurrentSize(int)
	 * @see org.gemoc.arduino.xdsml.arduinomt.arduino.ArduinoPackage#getChannel_CurrentSize()
	 * @model
	 * @generated
	 */
	int getCurrentSize();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.xdsml.arduinomt.arduino.Channel#getCurrentSize <em>Current Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Size</em>' attribute.
	 * @see #getCurrentSize()
	 * @generated
	 */
	void setCurrentSize(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void read();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void write();

} // Channel

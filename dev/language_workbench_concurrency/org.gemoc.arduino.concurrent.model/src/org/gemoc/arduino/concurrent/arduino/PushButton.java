/**
 */
package org.gemoc.arduino.concurrent.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.arduino.PushButton#getIsPushed <em>Is Pushed</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.arduino.ArduinoPackage#getPushButton()
 * @model
 * @generated
 */
public interface PushButton extends ArduinoDigitalModule {
	/**
	 * Returns the value of the '<em><b>Is Pushed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pushed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pushed</em>' attribute.
	 * @see #setIsPushed(Boolean)
	 * @see org.gemoc.arduino.concurrent.arduino.ArduinoPackage#getPushButton_IsPushed()
	 * @model
	 * @generated
	 */
	Boolean getIsPushed();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.arduino.PushButton#getIsPushed <em>Is Pushed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pushed</em>' attribute.
	 * @see #getIsPushed()
	 * @generated
	 */
	void setIsPushed(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void toggle();

} // PushButton

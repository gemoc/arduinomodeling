/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.PushButton#isIsPushed <em>Is Pushed</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getPushButton()
 * @model
 * @generated
 */
public interface PushButton extends ArduinoDigitalModule {
	/**
	 * Returns the value of the '<em><b>Is Pushed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pushed</em>' attribute.
	 * @see #setIsPushed(boolean)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getPushButton_IsPushed()
	 * @model unique="false"
	 *        annotation="aspect"
	 * @generated
	 */
	boolean isIsPushed();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.PushButton#isIsPushed <em>Is Pushed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pushed</em>' attribute.
	 * @see #isIsPushed()
	 * @generated
	 */
	void setIsPushed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void toggle();

} // PushButton

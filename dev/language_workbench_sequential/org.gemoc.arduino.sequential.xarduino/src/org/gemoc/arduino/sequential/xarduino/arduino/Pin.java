/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.Pin#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getPin()
 * @model abstract="true"
 * @generated
 */
public interface Pin extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Integer)
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getPin_Level()
	 * @model unique="false"
	 *        annotation="aspect"
	 * @generated
	 */
	Integer getLevel();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduino.arduino.Pin#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Integer value);

} // Pin

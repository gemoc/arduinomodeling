/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.Repeat#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.Repeat#getI <em>I</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends Control {
	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' attribute.
	 * @see #setIteration(int)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getRepeat_Iteration()
	 * @model default="5"
	 * @generated
	 */
	int getIteration();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.Repeat#getIteration <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' attribute.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(int value);

	/**
	 * Returns the value of the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' attribute.
	 * @see #setI(Integer)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getRepeat_I()
	 * @model unique="false"
	 * @generated
	 */
	Integer getI();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.Repeat#getI <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' attribute.
	 * @see #getI()
	 * @generated
	 */
	void setI(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean evaluate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finalize();

} // Repeat

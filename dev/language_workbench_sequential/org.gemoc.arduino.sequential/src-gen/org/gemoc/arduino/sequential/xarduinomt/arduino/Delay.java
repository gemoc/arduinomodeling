/**
 */
package org.gemoc.arduino.sequential.xarduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Delay#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Delay#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends Utilities {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.arduino.sequential.xarduinomt.arduino.Time}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Time
	 * @see #setUnit(Time)
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getDelay_Unit()
	 * @model
	 * @generated
	 */
	Time getUnit();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Delay#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.Time
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Time value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.gemoc.arduino.sequential.xarduinomt.arduino.ArduinoPackage#getDelay_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduinomt.arduino.Delay#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void execute();

} // Delay

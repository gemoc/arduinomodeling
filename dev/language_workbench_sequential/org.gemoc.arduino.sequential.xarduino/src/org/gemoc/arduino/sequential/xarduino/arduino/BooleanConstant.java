/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getBooleanConstant()
 * @model
 * @generated
 */
public interface BooleanConstant extends Constant, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getBooleanConstant_Value()
	 * @model default="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduino.arduino.BooleanConstant#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.gemoc.arduino.sequential.xarduino.arduino.Object"
	 *        annotation="aspect"
	 * @generated
	 */
	Object evaluate();

} // BooleanConstant

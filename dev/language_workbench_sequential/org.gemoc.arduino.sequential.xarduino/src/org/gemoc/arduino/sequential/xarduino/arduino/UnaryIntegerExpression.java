/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getUnaryIntegerExpression()
 * @model
 * @generated
 */
public interface UnaryIntegerExpression extends UnaryExpression, IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerOperatorKind
	 * @see #setOperator(UnaryIntegerOperatorKind)
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getUnaryIntegerExpression_Operator()
	 * @model
	 * @generated
	 */
	UnaryIntegerOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.UnaryIntegerOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryIntegerOperatorKind value);

} // UnaryIntegerExpression

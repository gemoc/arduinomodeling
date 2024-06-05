/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.If#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.If#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Control {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExpression)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getCondition();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getIf_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.If#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean evaluate();

} // If

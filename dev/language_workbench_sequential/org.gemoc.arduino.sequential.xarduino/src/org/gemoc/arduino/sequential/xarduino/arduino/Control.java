/**
 */
package org.gemoc.arduino.sequential.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.xarduino.arduino.Control#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends Instruction {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see org.gemoc.arduino.sequential.xarduino.arduino.ArduinoPackage#getControl_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.xarduino.arduino.Control#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean evaluate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void execute();

} // Control

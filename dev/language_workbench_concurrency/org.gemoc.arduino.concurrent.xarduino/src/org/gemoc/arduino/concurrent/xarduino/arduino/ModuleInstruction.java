/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getModuleInstruction()
 * @model abstract="true"
 * @generated
 */
public interface ModuleInstruction extends Instruction {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(org.gemoc.arduino.concurrent.xarduino.arduino.Module)
	 * @see org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage#getModuleInstruction_Module()
	 * @model required="true"
	 * @generated
	 */
	org.gemoc.arduino.concurrent.xarduino.arduino.Module getModule();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.concurrent.xarduino.arduino.ModuleInstruction#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.gemoc.arduino.concurrent.xarduino.arduino.Module value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void execute();

} // ModuleInstruction

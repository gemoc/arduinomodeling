/**
 *  Copyright (c) 2013 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.DigitalPin#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getDigitalPin()
 * @model
 * @generated
 */
public interface DigitalPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(ArduinoDigitalModule)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getDigitalPin_Module()
	 * @model containment="true"
	 * @generated
	 */
	ArduinoDigitalModule getModule();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.DigitalPin#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ArduinoDigitalModule value);

} // DigitalPin

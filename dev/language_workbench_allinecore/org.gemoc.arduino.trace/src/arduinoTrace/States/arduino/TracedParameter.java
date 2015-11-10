/**
 */
package arduinoTrace.States.arduino;

import fr.obeo.dsl.arduino.ParameterDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedParameter#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedParameter()
 * @model abstract="true"
 * @generated
 */
public interface TracedParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ParameterDefinition)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedParameter_Definition()
	 * @model
	 * @generated
	 */
	ParameterDefinition getDefinition();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedParameter#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ParameterDefinition value);

} // TracedParameter

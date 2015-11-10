/**
 */
package arduinoTrace.States;

import arduinoTrace.States.arduino.TracedStringValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.States.StringValue_value_Value#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoTrace.States.StringValue_value_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link arduinoTrace.States.StringValue_value_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.States.StatesPackage#getStringValue_value_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface StringValue_value_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see arduinoTrace.States.StatesPackage#getStringValue_value_Value_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.StringValue_value_Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.arduino.TracedStringValue#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedStringValue)
	 * @see arduinoTrace.States.StatesPackage#getStringValue_value_Value_Parent()
	 * @see arduinoTrace.States.arduino.TracedStringValue#getValueSequence
	 * @model opposite="valueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedStringValue getParent();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.StringValue_value_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedStringValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.State#getStringValue_value_Values <em>String Value value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getStringValue_value_Value_States()
	 * @see arduinoTrace.States.State#getStringValue_value_Values
	 * @model opposite="stringValue_value_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // StringValue_value_Value

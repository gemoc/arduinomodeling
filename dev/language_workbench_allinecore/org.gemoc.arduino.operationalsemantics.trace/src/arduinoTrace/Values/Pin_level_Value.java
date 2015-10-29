/**
 */
package arduinoTrace.Values;

import arduinoTrace.State;

import arduinoTrace.Traced.arduino.TracedPin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin level Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Values.Pin_level_Value#getLevel <em>Level</em>}</li>
 *   <li>{@link arduinoTrace.Values.Pin_level_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link arduinoTrace.Values.Pin_level_Value#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.Values.ValuesPackage#getPin_level_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Pin_level_Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see arduinoTrace.Values.ValuesPackage#getPin_level_Value_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link arduinoTrace.Values.Pin_level_Value#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.Traced.arduino.TracedPin#getLevelTrace <em>Level Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPin)
	 * @see arduinoTrace.Values.ValuesPackage#getPin_level_Value_Parent()
	 * @see arduinoTrace.Traced.arduino.TracedPin#getLevelTrace
	 * @model opposite="levelTrace" required="true" transient="false"
	 * @generated
	 */
	TracedPin getParent();

	/**
	 * Sets the value of the '{@link arduinoTrace.Values.Pin_level_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPin value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.State}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.State#getPin_level_Values <em>Pin level Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see arduinoTrace.Values.ValuesPackage#getPin_level_Value_States()
	 * @see arduinoTrace.State#getPin_level_Values
	 * @model opposite="pin_level_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // Pin_level_Value

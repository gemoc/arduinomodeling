/**
 */
package arduinoTrace;

import arduinoTrace.Steps.Steps;

import arduinoTrace.Traced.TracedObjects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoTrace.Trace#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getSteps <em>Steps</em>}</li>
 *   <li>{@link arduinoTrace.Trace#getTracedObjects <em>Traced Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoTrace.ArduinoTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference.
	 * @see #setSteps(Steps)
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Steps getSteps();

	/**
	 * Sets the value of the '{@link arduinoTrace.Trace#getSteps <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' containment reference.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(Steps value);

	/**
	 * Returns the value of the '<em><b>Traced Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traced Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traced Objects</em>' containment reference.
	 * @see #setTracedObjects(TracedObjects)
	 * @see arduinoTrace.ArduinoTracePackage#getTrace_TracedObjects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TracedObjects getTracedObjects();

	/**
	 * Sets the value of the '{@link arduinoTrace.Trace#getTracedObjects <em>Traced Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traced Objects</em>' containment reference.
	 * @see #getTracedObjects()
	 * @generated
	 */
	void setTracedObjects(TracedObjects value);

} // Trace

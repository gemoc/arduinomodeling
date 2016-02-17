/**
 */
package arduinoTrace.States.arduino.util;

import arduinoTrace.States.arduino.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArduinoPackage.TRACED_ANALOG_PIN: {
				TracedAnalogPin tracedAnalogPin = (TracedAnalogPin)theEObject;
				T result = caseTracedAnalogPin(tracedAnalogPin);
				if (result == null) result = caseTracedPin(tracedAnalogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BOOLEAN_EXPRESSION: {
				TracedBooleanExpression tracedBooleanExpression = (TracedBooleanExpression)theEObject;
				T result = caseTracedBooleanExpression(tracedBooleanExpression);
				if (result == null) result = caseTracedExpression(tracedBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE: {
				TracedBooleanVariable tracedBooleanVariable = (TracedBooleanVariable)theEObject;
				T result = caseTracedBooleanVariable(tracedBooleanVariable);
				if (result == null) result = caseTracedBooleanExpression(tracedBooleanVariable);
				if (result == null) result = caseTracedVariable(tracedBooleanVariable);
				if (result == null) result = caseTracedExpression(tracedBooleanVariable);
				if (result == null) result = caseTracedNamedElement(tracedBooleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_DIGITAL_PIN: {
				TracedDigitalPin tracedDigitalPin = (TracedDigitalPin)theEObject;
				T result = caseTracedDigitalPin(tracedDigitalPin);
				if (result == null) result = caseTracedPin(tracedDigitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_EXPRESSION: {
				TracedExpression tracedExpression = (TracedExpression)theEObject;
				T result = caseTracedExpression(tracedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_INTEGER_EXPRESSION: {
				TracedIntegerExpression tracedIntegerExpression = (TracedIntegerExpression)theEObject;
				T result = caseTracedIntegerExpression(tracedIntegerExpression);
				if (result == null) result = caseTracedExpression(tracedIntegerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_INTEGER_VARIABLE: {
				TracedIntegerVariable tracedIntegerVariable = (TracedIntegerVariable)theEObject;
				T result = caseTracedIntegerVariable(tracedIntegerVariable);
				if (result == null) result = caseTracedIntegerExpression(tracedIntegerVariable);
				if (result == null) result = caseTracedVariable(tracedIntegerVariable);
				if (result == null) result = caseTracedExpression(tracedIntegerVariable);
				if (result == null) result = caseTracedNamedElement(tracedIntegerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_NAMED_ELEMENT: {
				TracedNamedElement tracedNamedElement = (TracedNamedElement)theEObject;
				T result = caseTracedNamedElement(tracedNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_PIN: {
				TracedPin tracedPin = (TracedPin)theEObject;
				T result = caseTracedPin(tracedPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_VARIABLE: {
				TracedVariable tracedVariable = (TracedVariable)theEObject;
				T result = caseTracedVariable(tracedVariable);
				if (result == null) result = caseTracedExpression(tracedVariable);
				if (result == null) result = caseTracedNamedElement(tracedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAnalogPin(TracedAnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanExpression(TracedBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanVariable(TracedBooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDigitalPin(TracedDigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedExpression(TracedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerExpression(TracedIntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerVariable(TracedIntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamedElement(TracedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPin(TracedPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVariable(TracedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinoSwitch

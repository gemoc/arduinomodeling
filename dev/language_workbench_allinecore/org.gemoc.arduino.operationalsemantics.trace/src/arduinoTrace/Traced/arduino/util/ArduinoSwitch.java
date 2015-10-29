/**
 */
package arduinoTrace.Traced.arduino.util;

import arduinoTrace.Traced.arduino.*;

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
 * @see arduinoTrace.Traced.arduino.ArduinoPackage
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
			case ArduinoPackage.TRACED_DIGITAL_PIN: {
				TracedDigitalPin tracedDigitalPin = (TracedDigitalPin)theEObject;
				T result = caseTracedDigitalPin(tracedDigitalPin);
				if (result == null) result = caseTracedPin(tracedDigitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ANALOG_PIN: {
				TracedAnalogPin tracedAnalogPin = (TracedAnalogPin)theEObject;
				T result = caseTracedAnalogPin(tracedAnalogPin);
				if (result == null) result = caseTracedPin(tracedAnalogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_PARAMETER: {
				TracedParameter tracedParameter = (TracedParameter)theEObject;
				T result = caseTracedParameter(tracedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_VARIABLE: {
				TracedVariable tracedVariable = (TracedVariable)theEObject;
				T result = caseTracedVariable(tracedVariable);
				if (result == null) result = caseTracedExpression(tracedVariable);
				if (result == null) result = caseTracedInstruction(tracedVariable);
				if (result == null) result = caseTracedParameter(tracedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_VALUE: {
				TracedValue tracedValue = (TracedValue)theEObject;
				T result = caseTracedValue(tracedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_PIN: {
				TracedPin tracedPin = (TracedPin)theEObject;
				T result = caseTracedPin(tracedPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_NUMBER_VALUE: {
				TracedNumberValue tracedNumberValue = (TracedNumberValue)theEObject;
				T result = caseTracedNumberValue(tracedNumberValue);
				if (result == null) result = caseTracedValue(tracedNumberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_STRING_VALUE: {
				TracedStringValue tracedStringValue = (TracedStringValue)theEObject;
				T result = caseTracedStringValue(tracedStringValue);
				if (result == null) result = caseTracedValue(tracedStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_INSTRUCTION: {
				TracedInstruction tracedInstruction = (TracedInstruction)theEObject;
				T result = caseTracedInstruction(tracedInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_EXPRESSION: {
				TracedExpression tracedExpression = (TracedExpression)theEObject;
				T result = caseTracedExpression(tracedExpression);
				if (result == null) result = caseTracedInstruction(tracedExpression);
				if (result == null) result = caseTracedParameter(tracedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BOOLEAN_VALUE: {
				TracedBooleanValue tracedBooleanValue = (TracedBooleanValue)theEObject;
				T result = caseTracedBooleanValue(tracedBooleanValue);
				if (result == null) result = caseTracedValue(tracedBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedParameter(TracedParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedValue(TracedValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNumberValue(TracedNumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedStringValue(TracedStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInstruction(TracedInstruction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanValue(TracedBooleanValue object) {
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

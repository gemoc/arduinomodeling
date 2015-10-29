/**
 */
package arduinoTrace.Traced.arduino.util;

import arduinoTrace.Traced.arduino.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Traced.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoSwitch<Adapter> modelSwitch =
		new ArduinoSwitch<Adapter>() {
			@Override
			public Adapter caseTracedDigitalPin(TracedDigitalPin object) {
				return createTracedDigitalPinAdapter();
			}
			@Override
			public Adapter caseTracedAnalogPin(TracedAnalogPin object) {
				return createTracedAnalogPinAdapter();
			}
			@Override
			public Adapter caseTracedParameter(TracedParameter object) {
				return createTracedParameterAdapter();
			}
			@Override
			public Adapter caseTracedVariable(TracedVariable object) {
				return createTracedVariableAdapter();
			}
			@Override
			public Adapter caseTracedValue(TracedValue object) {
				return createTracedValueAdapter();
			}
			@Override
			public Adapter caseTracedPin(TracedPin object) {
				return createTracedPinAdapter();
			}
			@Override
			public Adapter caseTracedNumberValue(TracedNumberValue object) {
				return createTracedNumberValueAdapter();
			}
			@Override
			public Adapter caseTracedStringValue(TracedStringValue object) {
				return createTracedStringValueAdapter();
			}
			@Override
			public Adapter caseTracedInstruction(TracedInstruction object) {
				return createTracedInstructionAdapter();
			}
			@Override
			public Adapter caseTracedExpression(TracedExpression object) {
				return createTracedExpressionAdapter();
			}
			@Override
			public Adapter caseTracedBooleanValue(TracedBooleanValue object) {
				return createTracedBooleanValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedDigitalPin <em>Traced Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedDigitalPin
	 * @generated
	 */
	public Adapter createTracedDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedAnalogPin <em>Traced Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedAnalogPin
	 * @generated
	 */
	public Adapter createTracedAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedParameter <em>Traced Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedParameter
	 * @generated
	 */
	public Adapter createTracedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedVariable
	 * @generated
	 */
	public Adapter createTracedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedValue <em>Traced Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedValue
	 * @generated
	 */
	public Adapter createTracedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedPin <em>Traced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedPin
	 * @generated
	 */
	public Adapter createTracedPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedNumberValue <em>Traced Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedNumberValue
	 * @generated
	 */
	public Adapter createTracedNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedStringValue <em>Traced String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedStringValue
	 * @generated
	 */
	public Adapter createTracedStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedInstruction <em>Traced Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedInstruction
	 * @generated
	 */
	public Adapter createTracedInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedExpression <em>Traced Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedExpression
	 * @generated
	 */
	public Adapter createTracedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.Traced.arduino.TracedBooleanValue <em>Traced Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.Traced.arduino.TracedBooleanValue
	 * @generated
	 */
	public Adapter createTracedBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArduinoAdapterFactory

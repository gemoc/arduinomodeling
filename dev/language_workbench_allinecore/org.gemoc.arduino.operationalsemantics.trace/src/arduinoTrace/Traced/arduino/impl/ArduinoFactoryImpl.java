/**
 */
package arduinoTrace.Traced.arduino.impl;

import arduinoTrace.Traced.arduino.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoFactoryImpl extends EFactoryImpl implements ArduinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoFactory init() {
		try {
			ArduinoFactory theArduinoFactory = (ArduinoFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoPackage.eNS_URI);
			if (theArduinoFactory != null) {
				return theArduinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArduinoPackage.TRACED_DIGITAL_PIN: return createTracedDigitalPin();
			case ArduinoPackage.TRACED_ANALOG_PIN: return createTracedAnalogPin();
			case ArduinoPackage.TRACED_VARIABLE: return createTracedVariable();
			case ArduinoPackage.TRACED_NUMBER_VALUE: return createTracedNumberValue();
			case ArduinoPackage.TRACED_STRING_VALUE: return createTracedStringValue();
			case ArduinoPackage.TRACED_BOOLEAN_VALUE: return createTracedBooleanValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDigitalPin createTracedDigitalPin() {
		TracedDigitalPinImpl tracedDigitalPin = new TracedDigitalPinImpl();
		return tracedDigitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAnalogPin createTracedAnalogPin() {
		TracedAnalogPinImpl tracedAnalogPin = new TracedAnalogPinImpl();
		return tracedAnalogPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariable createTracedVariable() {
		TracedVariableImpl tracedVariable = new TracedVariableImpl();
		return tracedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedNumberValue createTracedNumberValue() {
		TracedNumberValueImpl tracedNumberValue = new TracedNumberValueImpl();
		return tracedNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStringValue createTracedStringValue() {
		TracedStringValueImpl tracedStringValue = new TracedStringValueImpl();
		return tracedStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBooleanValue createTracedBooleanValue() {
		TracedBooleanValueImpl tracedBooleanValue = new TracedBooleanValueImpl();
		return tracedBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoPackage getArduinoPackage() {
		return (ArduinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoPackage getPackage() {
		return ArduinoPackage.eINSTANCE;
	}

} //ArduinoFactoryImpl

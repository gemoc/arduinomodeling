/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.arduino.*;

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
			case ArduinoPackage.TRACED_ANALOG_PIN: return createTracedAnalogPin();
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE: return createTracedBooleanVariable();
			case ArduinoPackage.TRACED_DIGITAL_PIN: return createTracedDigitalPin();
			case ArduinoPackage.TRACED_INTEGER_VARIABLE: return createTracedIntegerVariable();
			case ArduinoPackage.TRACED_SHARED_RESOURCE: return createTracedSharedResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public TracedBooleanVariable createTracedBooleanVariable() {
		TracedBooleanVariableImpl tracedBooleanVariable = new TracedBooleanVariableImpl();
		return tracedBooleanVariable;
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
	public TracedIntegerVariable createTracedIntegerVariable() {
		TracedIntegerVariableImpl tracedIntegerVariable = new TracedIntegerVariableImpl();
		return tracedIntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSharedResource createTracedSharedResource() {
		TracedSharedResourceImpl tracedSharedResource = new TracedSharedResourceImpl();
		return tracedSharedResource;
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

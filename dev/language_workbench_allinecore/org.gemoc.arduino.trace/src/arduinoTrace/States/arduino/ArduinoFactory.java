/**
 */
package arduinoTrace.States.arduino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.arduino.ArduinoPackage
 * @generated
 */
public interface ArduinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoFactory eINSTANCE = arduinoTrace.States.arduino.impl.ArduinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Variable</em>'.
	 * @generated
	 */
	TracedVariable createTracedVariable();

	/**
	 * Returns a new object of class '<em>Traced Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Number Value</em>'.
	 * @generated
	 */
	TracedNumberValue createTracedNumberValue();

	/**
	 * Returns a new object of class '<em>Traced Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Boolean Value</em>'.
	 * @generated
	 */
	TracedBooleanValue createTracedBooleanValue();

	/**
	 * Returns a new object of class '<em>Traced String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced String Value</em>'.
	 * @generated
	 */
	TracedStringValue createTracedStringValue();

	/**
	 * Returns a new object of class '<em>Traced Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Digital Pin</em>'.
	 * @generated
	 */
	TracedDigitalPin createTracedDigitalPin();

	/**
	 * Returns a new object of class '<em>Traced Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Analog Pin</em>'.
	 * @generated
	 */
	TracedAnalogPin createTracedAnalogPin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinoPackage getArduinoPackage();

} //ArduinoFactory
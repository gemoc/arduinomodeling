/**
 */
package arduinoTrace.Values;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Values.ValuesPackage
 * @generated
 */
public interface ValuesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuesFactory eINSTANCE = arduinoTrace.Values.impl.ValuesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable value Value</em>'.
	 * @generated
	 */
	Variable_value_Value createVariable_value_Value();

	/**
	 * Returns a new object of class '<em>Pin level Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin level Value</em>'.
	 * @generated
	 */
	Pin_level_Value createPin_level_Value();

	/**
	 * Returns a new object of class '<em>Number Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Value value Value</em>'.
	 * @generated
	 */
	NumberValue_value_Value createNumberValue_value_Value();

	/**
	 * Returns a new object of class '<em>String Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value value Value</em>'.
	 * @generated
	 */
	StringValue_value_Value createStringValue_value_Value();

	/**
	 * Returns a new object of class '<em>Boolean Value value Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value value Value</em>'.
	 * @generated
	 */
	BooleanValue_value_Value createBooleanValue_value_Value();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValuesPackage getValuesPackage();

} //ValuesFactory

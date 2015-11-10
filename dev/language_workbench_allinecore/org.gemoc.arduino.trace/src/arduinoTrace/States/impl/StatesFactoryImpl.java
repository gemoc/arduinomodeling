/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.*;

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
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
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
			case StatesPackage.STATE: return createState();
			case StatesPackage.PIN_LEVEL_VALUE: return createPin_level_Value();
			case StatesPackage.VARIABLE_VALUE_VALUE: return createVariable_value_Value();
			case StatesPackage.NUMBER_VALUE_VALUE_VALUE: return createNumberValue_value_Value();
			case StatesPackage.BOOLEAN_VALUE_VALUE_VALUE: return createBooleanValue_value_Value();
			case StatesPackage.STRING_VALUE_VALUE_VALUE: return createStringValue_value_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin_level_Value createPin_level_Value() {
		Pin_level_ValueImpl pin_level_Value = new Pin_level_ValueImpl();
		return pin_level_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable_value_Value createVariable_value_Value() {
		Variable_value_ValueImpl variable_value_Value = new Variable_value_ValueImpl();
		return variable_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValue_value_Value createNumberValue_value_Value() {
		NumberValue_value_ValueImpl numberValue_value_Value = new NumberValue_value_ValueImpl();
		return numberValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue_value_Value createBooleanValue_value_Value() {
		BooleanValue_value_ValueImpl booleanValue_value_Value = new BooleanValue_value_ValueImpl();
		return booleanValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue_value_Value createStringValue_value_Value() {
		StringValue_value_ValueImpl stringValue_value_Value = new StringValue_value_ValueImpl();
		return stringValue_value_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl

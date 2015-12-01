/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.Steps.Arduino_BooleanModuleGet_Evaluate;
import arduinoTrace.Steps.StepsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.arduino.melange.arduinomt.arduino.BooleanModuleGet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Boolean Module Get Evaluate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_BooleanModuleGet_EvaluateImpl#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Arduino_BooleanModuleGet_EvaluateImpl extends SmallStepImpl implements Arduino_BooleanModuleGet_Evaluate {
	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected BooleanModuleGet this_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_BooleanModuleGet_EvaluateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanModuleGet getThis() {
		if (this_ != null && this_.eIsProxy()) {
			InternalEObject oldThis = (InternalEObject)this_;
			this_ = (BooleanModuleGet)eResolveProxy(oldThis);
			if (this_ != oldThis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS, oldThis, this_));
			}
		}
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanModuleGet basicGetThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(BooleanModuleGet newThis) {
		BooleanModuleGet oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS:
				if (resolve) return getThis();
				return basicGetThis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS:
				setThis((BooleanModuleGet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS:
				setThis((BooleanModuleGet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepsPackage.ARDUINO_BOOLEAN_MODULE_GET_EVALUATE__THIS:
				return this_ != null;
		}
		return super.eIsSet(featureID);
	}

} //Arduino_BooleanModuleGet_EvaluateImpl

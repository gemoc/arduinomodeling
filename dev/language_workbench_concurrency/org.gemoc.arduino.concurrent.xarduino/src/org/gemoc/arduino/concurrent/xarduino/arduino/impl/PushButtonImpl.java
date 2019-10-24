/**
 */
package org.gemoc.arduino.concurrent.xarduino.arduino.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.arduino.concurrent.xarduino.arduino.ArduinoPackage;
import org.gemoc.arduino.concurrent.xarduino.arduino.PushButton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.xarduino.arduino.impl.PushButtonImpl#isIsPushed <em>Is Pushed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushButtonImpl extends ArduinoDigitalModuleImpl implements PushButton {
	/**
	 * The default value of the '{@link #isIsPushed() <em>Is Pushed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPushed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUSHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPushed() <em>Is Pushed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPushed()
	 * @generated
	 * @ordered
	 */
	protected boolean isPushed = IS_PUSHED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.PUSH_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPushed() {
		return isPushed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPushed(boolean newIsPushed) {
		boolean oldIsPushed = isPushed;
		isPushed = newIsPushed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.PUSH_BUTTON__IS_PUSHED, oldIsPushed, isPushed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void toggle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.PUSH_BUTTON__IS_PUSHED:
				return isIsPushed();
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
			case ArduinoPackage.PUSH_BUTTON__IS_PUSHED:
				setIsPushed((Boolean)newValue);
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
			case ArduinoPackage.PUSH_BUTTON__IS_PUSHED:
				setIsPushed(IS_PUSHED_EDEFAULT);
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
			case ArduinoPackage.PUSH_BUTTON__IS_PUSHED:
				return isPushed != IS_PUSHED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isPushed: ");
		result.append(isPushed);
		result.append(')');
		return result.toString();
	}

} //PushButtonImpl

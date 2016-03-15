/**
 */
package org.gemoc.arduino.concurrent.execarduino.arduino.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.arduino.concurrent.execarduino.ArduinoUtils;
import org.gemoc.arduino.concurrent.execarduino.arduino.ArduinoPackage;
import org.gemoc.arduino.concurrent.execarduino.arduino.Pin;
import org.gemoc.arduino.concurrent.execarduino.arduino.PushButton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.arduino.concurrent.execarduino.arduino.impl.PushButtonImpl#getIsPushed <em>Is Pushed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PushButtonImpl extends ArduinoDigitalModuleImpl implements PushButton {
	/**
	 * The default value of the '{@link #getIsPushed() <em>Is Pushed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPushed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PUSHED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIsPushed() <em>Is Pushed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPushed()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPushed = IS_PUSHED_EDEFAULT;

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
	public Boolean getIsPushed() {
		return isPushed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPushed(Boolean newIsPushed) {
		Boolean oldIsPushed = isPushed;
		isPushed = newIsPushed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.PUSH_BUTTON__IS_PUSHED, oldIsPushed, isPushed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void toggle() {
		System.out.println("Java toggle() call");
		this.isPushed = ! this.isPushed;
		Pin pin = ArduinoUtils.getPin(this);
		if(this.isPushed){
			pin.setLevel(1023);
		}else{
			pin.setLevel(0);
		}
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
				return getIsPushed();
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
				return IS_PUSHED_EDEFAULT == null ? isPushed != null : !IS_PUSHED_EDEFAULT.equals(isPushed);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isPushed: ");
		result.append(isPushed);
		result.append(')');
		return result.toString();
	}

} //PushButtonImpl

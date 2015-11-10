/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.BooleanValue_value_Value;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedBooleanValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedBooleanValueImpl#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedBooleanValueImpl extends TracedValueImpl implements TracedBooleanValue {
	/**
	 * The cached value of the '{@link #getValueSequence() <em>Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_Value> valueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedBooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_Value> getValueSequence() {
		if (valueSequence == null) {
			valueSequence = new EObjectContainmentWithInverseEList<BooleanValue_value_Value>(BooleanValue_value_Value.class, this, ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE, StatesPackage.BOOLEAN_VALUE_VALUE_VALUE__PARENT);
		}
		return valueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE:
				return ((InternalEList<?>)getValueSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE:
				return getValueSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE:
				getValueSequence().clear();
				getValueSequence().addAll((Collection<? extends BooleanValue_value_Value>)newValue);
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
			case ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE:
				getValueSequence().clear();
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
			case ArduinoPackage.TRACED_BOOLEAN_VALUE__VALUE_SEQUENCE:
				return valueSequence != null && !valueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedBooleanValueImpl

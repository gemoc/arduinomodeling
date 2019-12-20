/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.States.IntegerVariable_value_Value;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedIntegerVariable;

import fr.obeo.dsl.arduino.IntegerVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl#getOriginalObject_IntegerVariable <em>Original Object Integer Variable</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl#getValueSequence <em>Value Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedIntegerVariableImpl extends TracedIntegerExpressionImpl implements TracedIntegerVariable {
	/**
	 * The cached value of the '{@link #getOriginalObject_IntegerVariable() <em>Original Object Integer Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_IntegerVariable()
	 * @generated
	 * @ordered
	 */
	protected IntegerVariable originalObject_IntegerVariable;

	/**
	 * The cached value of the '{@link #getValueSequence() <em>Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerVariable_value_Value> valueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedIntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.TRACED_INTEGER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable getOriginalObject_IntegerVariable() {
		if (originalObject_IntegerVariable != null && originalObject_IntegerVariable.eIsProxy()) {
			InternalEObject oldOriginalObject_IntegerVariable = (InternalEObject)originalObject_IntegerVariable;
			originalObject_IntegerVariable = (IntegerVariable)eResolveProxy(oldOriginalObject_IntegerVariable);
			if (originalObject_IntegerVariable != oldOriginalObject_IntegerVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE, oldOriginalObject_IntegerVariable, originalObject_IntegerVariable));
			}
		}
		return originalObject_IntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable basicGetOriginalObject_IntegerVariable() {
		return originalObject_IntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_IntegerVariable(IntegerVariable newOriginalObject_IntegerVariable) {
		IntegerVariable oldOriginalObject_IntegerVariable = originalObject_IntegerVariable;
		originalObject_IntegerVariable = newOriginalObject_IntegerVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE, oldOriginalObject_IntegerVariable, originalObject_IntegerVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerVariable_value_Value> getValueSequence() {
		if (valueSequence == null) {
			valueSequence = new EObjectContainmentWithInverseEList<IntegerVariable_value_Value>(IntegerVariable_value_Value.class, this, ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE, StatesPackage.INTEGER_VARIABLE_VALUE_VALUE__PARENT);
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE:
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE:
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE:
				if (resolve) return getOriginalObject_IntegerVariable();
				return basicGetOriginalObject_IntegerVariable();
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE:
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE:
				setOriginalObject_IntegerVariable((IntegerVariable)newValue);
				return;
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE:
				getValueSequence().clear();
				getValueSequence().addAll((Collection<? extends IntegerVariable_value_Value>)newValue);
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE:
				setOriginalObject_IntegerVariable((IntegerVariable)null);
				return;
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE:
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
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT_INTEGER_VARIABLE:
				return originalObject_IntegerVariable != null;
			case ArduinoPackage.TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE:
				return valueSequence != null && !valueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedIntegerVariableImpl

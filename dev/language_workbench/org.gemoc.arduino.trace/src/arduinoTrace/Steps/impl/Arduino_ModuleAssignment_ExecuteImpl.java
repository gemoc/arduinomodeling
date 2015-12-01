/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute_AbstractSubStep;
import arduinoTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.arduino.melange.arduinomt.arduino.ModuleAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Module Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl#getThis <em>This</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_ModuleAssignment_ExecuteImpl#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Arduino_ModuleAssignment_ExecuteImpl extends BigStepImpl implements Arduino_ModuleAssignment_Execute {
	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected ModuleAssignment this_;

	/**
	 * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleAssignment_Execute_AbstractSubStep> subSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_ModuleAssignment_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_MODULE_ASSIGNMENT_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleAssignment getThis() {
		if (this_ != null && this_.eIsProxy()) {
			InternalEObject oldThis = (InternalEObject)this_;
			this_ = (ModuleAssignment)eResolveProxy(oldThis);
			if (this_ != oldThis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS, oldThis, this_));
			}
		}
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleAssignment basicGetThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(ModuleAssignment newThis) {
		ModuleAssignment oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_ModuleAssignment_Execute_AbstractSubStep> getSubSteps() {
		if (subSteps == null) {
			subSteps = new EObjectContainmentEList<Arduino_ModuleAssignment_Execute_AbstractSubStep>(Arduino_ModuleAssignment_Execute_AbstractSubStep.class, this, StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS);
		}
		return subSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				return ((InternalEList<?>)getSubSteps()).basicRemove(otherEnd, msgs);
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
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS:
				if (resolve) return getThis();
				return basicGetThis();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				return getSubSteps();
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
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS:
				setThis((ModuleAssignment)newValue);
				return;
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				getSubSteps().clear();
				getSubSteps().addAll((Collection<? extends Arduino_ModuleAssignment_Execute_AbstractSubStep>)newValue);
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
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS:
				setThis((ModuleAssignment)null);
				return;
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				getSubSteps().clear();
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
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__THIS:
				return this_ != null;
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				return subSteps != null && !subSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Arduino_ModuleAssignment_ExecuteImpl

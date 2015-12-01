/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.State;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.Steps.Arduino_If_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_Repeat_Execute_AbstractSubStep;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute_AbstractSubStep;
import arduinoTrace.Steps.BigStep;
import arduinoTrace.Steps.Step;
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

import org.gemoc.arduino.melange.arduinomt.arduino.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Variable Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl#getStartingState <em>Starting State</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl#getEndingState <em>Ending State</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl#getThis <em>This</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_VariableAssignment_ExecuteImpl#getSubSteps <em>Sub Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Arduino_VariableAssignment_ExecuteImpl extends Arduino_While_Execute_AbstractSubStepImpl implements Arduino_VariableAssignment_Execute {
	/**
	 * The cached value of the '{@link #getStartingState() <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingState()
	 * @generated
	 * @ordered
	 */
	protected State startingState;

	/**
	 * The cached value of the '{@link #getEndingState() <em>Ending State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingState()
	 * @generated
	 * @ordered
	 */
	protected State endingState;

	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected VariableAssignment this_;

	/**
	 * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableAssignment_Execute_AbstractSubStep> subSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_VariableAssignment_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStartingState() {
		if (startingState != null && startingState.eIsProxy()) {
			InternalEObject oldStartingState = (InternalEObject)startingState;
			startingState = (State)eResolveProxy(oldStartingState);
			if (startingState != oldStartingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE, oldStartingState, startingState));
			}
		}
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartingState() {
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingState(State newStartingState, NotificationChain msgs) {
		State oldStartingState = startingState;
		startingState = newStartingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE, oldStartingState, newStartingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingState(State newStartingState) {
		if (newStartingState != startingState) {
			NotificationChain msgs = null;
			if (startingState != null)
				msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
			if (newStartingState != null)
				msgs = ((InternalEObject)newStartingState).eInverseAdd(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
			msgs = basicSetStartingState(newStartingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE, newStartingState, newStartingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEndingState() {
		if (endingState != null && endingState.eIsProxy()) {
			InternalEObject oldEndingState = (InternalEObject)endingState;
			endingState = (State)eResolveProxy(oldEndingState);
			if (endingState != oldEndingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE, oldEndingState, endingState));
			}
		}
		return endingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetEndingState() {
		return endingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndingState(State newEndingState, NotificationChain msgs) {
		State oldEndingState = endingState;
		endingState = newEndingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE, oldEndingState, newEndingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingState(State newEndingState) {
		if (newEndingState != endingState) {
			NotificationChain msgs = null;
			if (endingState != null)
				msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
			if (newEndingState != null)
				msgs = ((InternalEObject)newEndingState).eInverseAdd(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
			msgs = basicSetEndingState(newEndingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE, newEndingState, newEndingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment getThis() {
		if (this_ != null && this_.eIsProxy()) {
			InternalEObject oldThis = (InternalEObject)this_;
			this_ = (VariableAssignment)eResolveProxy(oldThis);
			if (this_ != oldThis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS, oldThis, this_));
			}
		}
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment basicGetThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(VariableAssignment newThis) {
		VariableAssignment oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableAssignment_Execute_AbstractSubStep> getSubSteps() {
		if (subSteps == null) {
			subSteps = new EObjectContainmentEList<Arduino_VariableAssignment_Execute_AbstractSubStep>(Arduino_VariableAssignment_Execute_AbstractSubStep.class, this, StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS);
		}
		return subSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE:
				if (startingState != null)
					msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
				return basicSetStartingState((State)otherEnd, msgs);
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE:
				if (endingState != null)
					msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
				return basicSetEndingState((State)otherEnd, msgs);
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
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE:
				return basicSetStartingState(null, msgs);
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE:
				return basicSetEndingState(null, msgs);
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS:
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
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE:
				if (resolve) return getStartingState();
				return basicGetStartingState();
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE:
				if (resolve) return getEndingState();
				return basicGetEndingState();
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS:
				if (resolve) return getThis();
				return basicGetThis();
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS:
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
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE:
				setStartingState((State)newValue);
				return;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE:
				setEndingState((State)newValue);
				return;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS:
				setThis((VariableAssignment)newValue);
				return;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				getSubSteps().clear();
				getSubSteps().addAll((Collection<? extends Arduino_VariableAssignment_Execute_AbstractSubStep>)newValue);
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
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE:
				setStartingState((State)null);
				return;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE:
				setEndingState((State)null);
				return;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS:
				setThis((VariableAssignment)null);
				return;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS:
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
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE:
				return startingState != null;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE:
				return endingState != null;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__THIS:
				return this_ != null;
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__SUB_STEPS:
				return subSteps != null && !subSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Arduino_If_Execute_AbstractSubStep.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE: return StepsPackage.STEP__STARTING_STATE;
				case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE: return StepsPackage.STEP__ENDING_STATE;
				default: return -1;
			}
		}
		if (baseClass == BigStep.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Arduino_Repeat_Execute_AbstractSubStep.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Arduino_If_Execute_AbstractSubStep.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case StepsPackage.STEP__STARTING_STATE: return StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__STARTING_STATE;
				case StepsPackage.STEP__ENDING_STATE: return StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE__ENDING_STATE;
				default: return -1;
			}
		}
		if (baseClass == BigStep.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Arduino_Repeat_Execute_AbstractSubStep.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Arduino_VariableAssignment_ExecuteImpl

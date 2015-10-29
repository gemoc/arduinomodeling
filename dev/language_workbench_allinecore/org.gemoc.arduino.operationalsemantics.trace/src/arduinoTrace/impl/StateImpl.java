/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTracePackage;
import arduinoTrace.State;

import arduinoTrace.Steps.BigStep;
import arduinoTrace.Steps.SmallStep;
import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Values.BooleanValue_value_Value;
import arduinoTrace.Values.NumberValue_value_Value;
import arduinoTrace.Values.Pin_level_Value;
import arduinoTrace.Values.StringValue_value_Value;
import arduinoTrace.Values.ValuesPackage;
import arduinoTrace.Values.Variable_value_Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.impl.StateImpl#getFollowingStep <em>Following Step</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getStartedBigSteps <em>Started Big Steps</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getEndedBigSteps <em>Ended Big Steps</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getVariable_value_Values <em>Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getPin_level_Values <em>Pin level Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getNumberValue_value_Values <em>Number Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getStringValue_value_Values <em>String Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.impl.StateImpl#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getFollowingStep() <em>Following Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingStep()
	 * @generated
	 * @ordered
	 */
	protected SmallStep followingStep;

	/**
	 * The cached value of the '{@link #getStartedBigSteps() <em>Started Big Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedBigSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<BigStep> startedBigSteps;

	/**
	 * The cached value of the '{@link #getEndedBigSteps() <em>Ended Big Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedBigSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<BigStep> endedBigSteps;

	/**
	 * The cached value of the '{@link #getVariable_value_Values() <em>Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_value_Value> variable_value_Values;

	/**
	 * The cached value of the '{@link #getPin_level_Values() <em>Pin level Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin_level_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin_level_Value> pin_level_Values;

	/**
	 * The cached value of the '{@link #getNumberValue_value_Values() <em>Number Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<NumberValue_value_Value> numberValue_value_Values;

	/**
	 * The cached value of the '{@link #getStringValue_value_Values() <em>String Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<StringValue_value_Value> stringValue_value_Values;

	/**
	 * The cached value of the '{@link #getBooleanValue_value_Values() <em>Boolean Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_Value> booleanValue_value_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoTracePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallStep getFollowingStep() {
		if (followingStep != null && followingStep.eIsProxy()) {
			InternalEObject oldFollowingStep = (InternalEObject)followingStep;
			followingStep = (SmallStep)eResolveProxy(oldFollowingStep);
			if (followingStep != oldFollowingStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoTracePackage.STATE__FOLLOWING_STEP, oldFollowingStep, followingStep));
			}
		}
		return followingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallStep basicGetFollowingStep() {
		return followingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowingStep(SmallStep newFollowingStep, NotificationChain msgs) {
		SmallStep oldFollowingStep = followingStep;
		followingStep = newFollowingStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoTracePackage.STATE__FOLLOWING_STEP, oldFollowingStep, newFollowingStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowingStep(SmallStep newFollowingStep) {
		if (newFollowingStep != followingStep) {
			NotificationChain msgs = null;
			if (followingStep != null)
				msgs = ((InternalEObject)followingStep).eInverseRemove(this, StepsPackage.SMALL_STEP__PRECEDING_STATE, SmallStep.class, msgs);
			if (newFollowingStep != null)
				msgs = ((InternalEObject)newFollowingStep).eInverseAdd(this, StepsPackage.SMALL_STEP__PRECEDING_STATE, SmallStep.class, msgs);
			msgs = basicSetFollowingStep(newFollowingStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoTracePackage.STATE__FOLLOWING_STEP, newFollowingStep, newFollowingStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigStep> getStartedBigSteps() {
		if (startedBigSteps == null) {
			startedBigSteps = new EObjectWithInverseResolvingEList<BigStep>(BigStep.class, this, ArduinoTracePackage.STATE__STARTED_BIG_STEPS, StepsPackage.BIG_STEP__STARTING_STATE);
		}
		return startedBigSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigStep> getEndedBigSteps() {
		if (endedBigSteps == null) {
			endedBigSteps = new EObjectWithInverseResolvingEList<BigStep>(BigStep.class, this, ArduinoTracePackage.STATE__ENDED_BIG_STEPS, StepsPackage.BIG_STEP__ENDING_STATE);
		}
		return endedBigSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable_value_Value> getVariable_value_Values() {
		if (variable_value_Values == null) {
			variable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_value_Value>(Variable_value_Value.class, this, ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES, ValuesPackage.VARIABLE_VALUE_VALUE__STATES);
		}
		return variable_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin_level_Value> getPin_level_Values() {
		if (pin_level_Values == null) {
			pin_level_Values = new EObjectWithInverseResolvingEList.ManyInverse<Pin_level_Value>(Pin_level_Value.class, this, ArduinoTracePackage.STATE__PIN_LEVEL_VALUES, ValuesPackage.PIN_LEVEL_VALUE__STATES);
		}
		return pin_level_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberValue_value_Value> getNumberValue_value_Values() {
		if (numberValue_value_Values == null) {
			numberValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<NumberValue_value_Value>(NumberValue_value_Value.class, this, ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES, ValuesPackage.NUMBER_VALUE_VALUE_VALUE__STATES);
		}
		return numberValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringValue_value_Value> getStringValue_value_Values() {
		if (stringValue_value_Values == null) {
			stringValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<StringValue_value_Value>(StringValue_value_Value.class, this, ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES, ValuesPackage.STRING_VALUE_VALUE_VALUE__STATES);
		}
		return stringValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_Value> getBooleanValue_value_Values() {
		if (booleanValue_value_Values == null) {
			booleanValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanValue_value_Value>(BooleanValue_value_Value.class, this, ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES, ValuesPackage.BOOLEAN_VALUE_VALUE_VALUE__STATES);
		}
		return booleanValue_value_Values;
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
			case ArduinoTracePackage.STATE__FOLLOWING_STEP:
				if (followingStep != null)
					msgs = ((InternalEObject)followingStep).eInverseRemove(this, StepsPackage.SMALL_STEP__PRECEDING_STATE, SmallStep.class, msgs);
				return basicSetFollowingStep((SmallStep)otherEnd, msgs);
			case ArduinoTracePackage.STATE__STARTED_BIG_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedBigSteps()).basicAdd(otherEnd, msgs);
			case ArduinoTracePackage.STATE__ENDED_BIG_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedBigSteps()).basicAdd(otherEnd, msgs);
			case ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_value_Values()).basicAdd(otherEnd, msgs);
			case ArduinoTracePackage.STATE__PIN_LEVEL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPin_level_Values()).basicAdd(otherEnd, msgs);
			case ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNumberValue_value_Values()).basicAdd(otherEnd, msgs);
			case ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStringValue_value_Values()).basicAdd(otherEnd, msgs);
			case ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanValue_value_Values()).basicAdd(otherEnd, msgs);
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
			case ArduinoTracePackage.STATE__FOLLOWING_STEP:
				return basicSetFollowingStep(null, msgs);
			case ArduinoTracePackage.STATE__STARTED_BIG_STEPS:
				return ((InternalEList<?>)getStartedBigSteps()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.STATE__ENDED_BIG_STEPS:
				return ((InternalEList<?>)getEndedBigSteps()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getVariable_value_Values()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.STATE__PIN_LEVEL_VALUES:
				return ((InternalEList<?>)getPin_level_Values()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getNumberValue_value_Values()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getStringValue_value_Values()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanValue_value_Values()).basicRemove(otherEnd, msgs);
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
			case ArduinoTracePackage.STATE__FOLLOWING_STEP:
				if (resolve) return getFollowingStep();
				return basicGetFollowingStep();
			case ArduinoTracePackage.STATE__STARTED_BIG_STEPS:
				return getStartedBigSteps();
			case ArduinoTracePackage.STATE__ENDED_BIG_STEPS:
				return getEndedBigSteps();
			case ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES:
				return getVariable_value_Values();
			case ArduinoTracePackage.STATE__PIN_LEVEL_VALUES:
				return getPin_level_Values();
			case ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return getNumberValue_value_Values();
			case ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES:
				return getStringValue_value_Values();
			case ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return getBooleanValue_value_Values();
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
			case ArduinoTracePackage.STATE__FOLLOWING_STEP:
				setFollowingStep((SmallStep)newValue);
				return;
			case ArduinoTracePackage.STATE__STARTED_BIG_STEPS:
				getStartedBigSteps().clear();
				getStartedBigSteps().addAll((Collection<? extends BigStep>)newValue);
				return;
			case ArduinoTracePackage.STATE__ENDED_BIG_STEPS:
				getEndedBigSteps().clear();
				getEndedBigSteps().addAll((Collection<? extends BigStep>)newValue);
				return;
			case ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES:
				getVariable_value_Values().clear();
				getVariable_value_Values().addAll((Collection<? extends Variable_value_Value>)newValue);
				return;
			case ArduinoTracePackage.STATE__PIN_LEVEL_VALUES:
				getPin_level_Values().clear();
				getPin_level_Values().addAll((Collection<? extends Pin_level_Value>)newValue);
				return;
			case ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				getNumberValue_value_Values().clear();
				getNumberValue_value_Values().addAll((Collection<? extends NumberValue_value_Value>)newValue);
				return;
			case ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES:
				getStringValue_value_Values().clear();
				getStringValue_value_Values().addAll((Collection<? extends StringValue_value_Value>)newValue);
				return;
			case ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				getBooleanValue_value_Values().addAll((Collection<? extends BooleanValue_value_Value>)newValue);
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
			case ArduinoTracePackage.STATE__FOLLOWING_STEP:
				setFollowingStep((SmallStep)null);
				return;
			case ArduinoTracePackage.STATE__STARTED_BIG_STEPS:
				getStartedBigSteps().clear();
				return;
			case ArduinoTracePackage.STATE__ENDED_BIG_STEPS:
				getEndedBigSteps().clear();
				return;
			case ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES:
				getVariable_value_Values().clear();
				return;
			case ArduinoTracePackage.STATE__PIN_LEVEL_VALUES:
				getPin_level_Values().clear();
				return;
			case ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				getNumberValue_value_Values().clear();
				return;
			case ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES:
				getStringValue_value_Values().clear();
				return;
			case ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
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
			case ArduinoTracePackage.STATE__FOLLOWING_STEP:
				return followingStep != null;
			case ArduinoTracePackage.STATE__STARTED_BIG_STEPS:
				return startedBigSteps != null && !startedBigSteps.isEmpty();
			case ArduinoTracePackage.STATE__ENDED_BIG_STEPS:
				return endedBigSteps != null && !endedBigSteps.isEmpty();
			case ArduinoTracePackage.STATE__VARIABLE_VALUE_VALUES:
				return variable_value_Values != null && !variable_value_Values.isEmpty();
			case ArduinoTracePackage.STATE__PIN_LEVEL_VALUES:
				return pin_level_Values != null && !pin_level_Values.isEmpty();
			case ArduinoTracePackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return numberValue_value_Values != null && !numberValue_value_Values.isEmpty();
			case ArduinoTracePackage.STATE__STRING_VALUE_VALUE_VALUES:
				return stringValue_value_Values != null && !stringValue_value_Values.isEmpty();
			case ArduinoTracePackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return booleanValue_value_Values != null && !booleanValue_value_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl

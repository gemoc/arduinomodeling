/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.BooleanVariable_value_Value;
import arduinoTrace.States.IntegerVariable_value_Value;
import arduinoTrace.States.Pin_level_Value;
import arduinoTrace.States.State;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.Steps.Step;
import arduinoTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getPin_level_Values <em>Pin level Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getIntegerVariable_value_Values <em>Integer Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getBooleanVariable_value_Values <em>Boolean Variable value Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> startedSteps;

	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> endedSteps;

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
	 * The cached value of the '{@link #getIntegerVariable_value_Values() <em>Integer Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerVariable_value_Value> integerVariable_value_Values;

	/**
	 * The cached value of the '{@link #getBooleanVariable_value_Values() <em>Boolean Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanVariable_value_Value> booleanVariable_value_Values;

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
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<Step>(Step.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<Step>(Step.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin_level_Value> getPin_level_Values() {
		if (pin_level_Values == null) {
			pin_level_Values = new EObjectWithInverseResolvingEList.ManyInverse<Pin_level_Value>(Pin_level_Value.class, this, StatesPackage.STATE__PIN_LEVEL_VALUES, StatesPackage.PIN_LEVEL_VALUE__STATES);
		}
		return pin_level_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerVariable_value_Value> getIntegerVariable_value_Values() {
		if (integerVariable_value_Values == null) {
			integerVariable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<IntegerVariable_value_Value>(IntegerVariable_value_Value.class, this, StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES, StatesPackage.INTEGER_VARIABLE_VALUE_VALUE__STATES);
		}
		return integerVariable_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanVariable_value_Value> getBooleanVariable_value_Values() {
		if (booleanVariable_value_Values == null) {
			booleanVariable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanVariable_value_Value>(BooleanVariable_value_Value.class, this, StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES, StatesPackage.BOOLEAN_VARIABLE_VALUE_VALUE__STATES);
		}
		return booleanVariable_value_Values;
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
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPin_level_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegerVariable_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanVariable_value_Values()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return ((InternalEList<?>)getPin_level_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getIntegerVariable_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanVariable_value_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return getPin_level_Values();
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return getIntegerVariable_value_Values();
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return getBooleanVariable_value_Values();
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
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				getPin_level_Values().clear();
				getPin_level_Values().addAll((Collection<? extends Pin_level_Value>)newValue);
				return;
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				getIntegerVariable_value_Values().clear();
				getIntegerVariable_value_Values().addAll((Collection<? extends IntegerVariable_value_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				getBooleanVariable_value_Values().clear();
				getBooleanVariable_value_Values().addAll((Collection<? extends BooleanVariable_value_Value>)newValue);
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
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				getPin_level_Values().clear();
				return;
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				getIntegerVariable_value_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				getBooleanVariable_value_Values().clear();
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
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__PIN_LEVEL_VALUES:
				return pin_level_Values != null && !pin_level_Values.isEmpty();
			case StatesPackage.STATE__INTEGER_VARIABLE_VALUE_VALUES:
				return integerVariable_value_Values != null && !integerVariable_value_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_VARIABLE_VALUE_VALUES:
				return booleanVariable_value_Values != null && !booleanVariable_value_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl

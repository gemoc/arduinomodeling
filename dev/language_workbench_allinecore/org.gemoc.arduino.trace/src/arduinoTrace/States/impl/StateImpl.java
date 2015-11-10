/**
 */
package arduinoTrace.States.impl;

import arduinoTrace.States.BooleanValue_value_Value;
import arduinoTrace.States.NumberValue_value_Value;
import arduinoTrace.States.Pin_level_Value;
import arduinoTrace.States.State;
import arduinoTrace.States.StatesPackage;
import arduinoTrace.States.StringValue_value_Value;
import arduinoTrace.States.Variable_value_Value;

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
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getVariable_value_Values <em>Variable value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getNumberValue_value_Values <em>Number Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getBooleanValue_value_Values <em>Boolean Value value Values</em>}</li>
 *   <li>{@link arduinoTrace.States.impl.StateImpl#getStringValue_value_Values <em>String Value value Values</em>}</li>
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
	 * The cached value of the '{@link #getVariable_value_Values() <em>Variable value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable_value_Value> variable_value_Values;

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
	 * The cached value of the '{@link #getBooleanValue_value_Values() <em>Boolean Value value Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue_value_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue_value_Value> booleanValue_value_Values;

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
	public EList<Variable_value_Value> getVariable_value_Values() {
		if (variable_value_Values == null) {
			variable_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<Variable_value_Value>(Variable_value_Value.class, this, StatesPackage.STATE__VARIABLE_VALUE_VALUES, StatesPackage.VARIABLE_VALUE_VALUE__STATES);
		}
		return variable_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberValue_value_Value> getNumberValue_value_Values() {
		if (numberValue_value_Values == null) {
			numberValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<NumberValue_value_Value>(NumberValue_value_Value.class, this, StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES, StatesPackage.NUMBER_VALUE_VALUE_VALUE__STATES);
		}
		return numberValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue_value_Value> getBooleanValue_value_Values() {
		if (booleanValue_value_Values == null) {
			booleanValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<BooleanValue_value_Value>(BooleanValue_value_Value.class, this, StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES, StatesPackage.BOOLEAN_VALUE_VALUE_VALUE__STATES);
		}
		return booleanValue_value_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringValue_value_Value> getStringValue_value_Values() {
		if (stringValue_value_Values == null) {
			stringValue_value_Values = new EObjectWithInverseResolvingEList.ManyInverse<StringValue_value_Value>(StringValue_value_Value.class, this, StatesPackage.STATE__STRING_VALUE_VALUE_VALUES, StatesPackage.STRING_VALUE_VALUE_VALUE__STATES);
		}
		return stringValue_value_Values;
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
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNumberValue_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooleanValue_value_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STRING_VALUE_VALUE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStringValue_value_Values()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return ((InternalEList<?>)getVariable_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getNumberValue_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getBooleanValue_value_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STRING_VALUE_VALUE_VALUES:
				return ((InternalEList<?>)getStringValue_value_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return getVariable_value_Values();
			case StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return getNumberValue_value_Values();
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return getBooleanValue_value_Values();
			case StatesPackage.STATE__STRING_VALUE_VALUE_VALUES:
				return getStringValue_value_Values();
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
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				getVariable_value_Values().clear();
				getVariable_value_Values().addAll((Collection<? extends Variable_value_Value>)newValue);
				return;
			case StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				getNumberValue_value_Values().clear();
				getNumberValue_value_Values().addAll((Collection<? extends NumberValue_value_Value>)newValue);
				return;
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				getBooleanValue_value_Values().addAll((Collection<? extends BooleanValue_value_Value>)newValue);
				return;
			case StatesPackage.STATE__STRING_VALUE_VALUE_VALUES:
				getStringValue_value_Values().clear();
				getStringValue_value_Values().addAll((Collection<? extends StringValue_value_Value>)newValue);
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
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				getVariable_value_Values().clear();
				return;
			case StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				getNumberValue_value_Values().clear();
				return;
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				getBooleanValue_value_Values().clear();
				return;
			case StatesPackage.STATE__STRING_VALUE_VALUE_VALUES:
				getStringValue_value_Values().clear();
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
			case StatesPackage.STATE__VARIABLE_VALUE_VALUES:
				return variable_value_Values != null && !variable_value_Values.isEmpty();
			case StatesPackage.STATE__NUMBER_VALUE_VALUE_VALUES:
				return numberValue_value_Values != null && !numberValue_value_Values.isEmpty();
			case StatesPackage.STATE__BOOLEAN_VALUE_VALUE_VALUES:
				return booleanValue_value_Values != null && !booleanValue_value_Values.isEmpty();
			case StatesPackage.STATE__STRING_VALUE_VALUE_VALUES:
				return stringValue_value_Values != null && !stringValue_value_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl

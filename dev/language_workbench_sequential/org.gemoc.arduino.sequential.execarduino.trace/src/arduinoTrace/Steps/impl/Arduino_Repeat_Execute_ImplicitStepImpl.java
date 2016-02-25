/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.States.State;
import arduinoTrace.States.StatesPackage;

import arduinoTrace.Steps.Arduino_Repeat_Execute_ImplicitStep;
import arduinoTrace.Steps.SmallStep;
import arduinoTrace.Steps.Step;
import arduinoTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSE;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.mse.MsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Repeat Execute Implicit Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl#getMse <em>Mse</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl#getResult <em>Result</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl#getLogicalStep <em>Logical Step</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl#getEndingState <em>Ending State</em>}</li>
 *   <li>{@link arduinoTrace.Steps.impl.Arduino_Repeat_Execute_ImplicitStepImpl#getStartingState <em>Starting State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Arduino_Repeat_Execute_ImplicitStepImpl extends Arduino_Repeat_Execute_AbstractSubStepImpl implements Arduino_Repeat_Execute_ImplicitStep {
	/**
	 * The cached value of the '{@link #getMse() <em>Mse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMse()
	 * @generated
	 * @ordered
	 */
	protected MSE mse;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> parameters;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> result;

	/**
	 * The cached value of the '{@link #getLogicalStep() <em>Logical Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalStep()
	 * @generated
	 * @ordered
	 */
	protected LogicalStep logicalStep;

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
	 * The cached value of the '{@link #getStartingState() <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingState()
	 * @generated
	 * @ordered
	 */
	protected State startingState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Arduino_Repeat_Execute_ImplicitStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSE getMse() {
		if (mse != null && mse.eIsProxy()) {
			InternalEObject oldMse = (InternalEObject)mse;
			mse = (MSE)eResolveProxy(oldMse);
			if (mse != oldMse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE, oldMse, mse));
			}
		}
		return mse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSE basicGetMse() {
		return mse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMse(MSE newMse) {
		MSE oldMse = mse;
		mse = newMse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE, oldMse, mse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<Object>(Object.class, this, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getResult() {
		if (result == null) {
			result = new EDataTypeUniqueEList<Object>(Object.class, this, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalStep getLogicalStep() {
		if (logicalStep != null && logicalStep.eIsProxy()) {
			InternalEObject oldLogicalStep = (InternalEObject)logicalStep;
			logicalStep = (LogicalStep)eResolveProxy(oldLogicalStep);
			if (logicalStep != oldLogicalStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP, oldLogicalStep, logicalStep));
			}
		}
		return logicalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalStep basicGetLogicalStep() {
		return logicalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalStep(LogicalStep newLogicalStep, NotificationChain msgs) {
		LogicalStep oldLogicalStep = logicalStep;
		logicalStep = newLogicalStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP, oldLogicalStep, newLogicalStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalStep(LogicalStep newLogicalStep) {
		if (newLogicalStep != logicalStep) {
			NotificationChain msgs = null;
			if (logicalStep != null)
				msgs = ((InternalEObject)logicalStep).eInverseRemove(this, MsePackage.LOGICAL_STEP__MSE_OCCURRENCES, LogicalStep.class, msgs);
			if (newLogicalStep != null)
				msgs = ((InternalEObject)newLogicalStep).eInverseAdd(this, MsePackage.LOGICAL_STEP__MSE_OCCURRENCES, LogicalStep.class, msgs);
			msgs = basicSetLogicalStep(newLogicalStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP, newLogicalStep, newLogicalStep));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE, oldEndingState, endingState));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE, oldEndingState, newEndingState);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE, newEndingState, newEndingState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE, oldStartingState, startingState));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE, oldStartingState, newStartingState);
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
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE, newStartingState, newStartingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP:
				if (logicalStep != null)
					msgs = ((InternalEObject)logicalStep).eInverseRemove(this, MsePackage.LOGICAL_STEP__MSE_OCCURRENCES, LogicalStep.class, msgs);
				return basicSetLogicalStep((LogicalStep)otherEnd, msgs);
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE:
				if (endingState != null)
					msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
				return basicSetEndingState((State)otherEnd, msgs);
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE:
				if (startingState != null)
					msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
				return basicSetStartingState((State)otherEnd, msgs);
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
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP:
				return basicSetLogicalStep(null, msgs);
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE:
				return basicSetEndingState(null, msgs);
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE:
				return basicSetStartingState(null, msgs);
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
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE:
				if (resolve) return getMse();
				return basicGetMse();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS:
				return getParameters();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT:
				return getResult();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP:
				if (resolve) return getLogicalStep();
				return basicGetLogicalStep();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE:
				if (resolve) return getEndingState();
				return basicGetEndingState();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE:
				if (resolve) return getStartingState();
				return basicGetStartingState();
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
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE:
				setMse((MSE)newValue);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Object>)newValue);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Object>)newValue);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP:
				setLogicalStep((LogicalStep)newValue);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE:
				setEndingState((State)newValue);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE:
				setStartingState((State)newValue);
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
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE:
				setMse((MSE)null);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS:
				getParameters().clear();
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT:
				getResult().clear();
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP:
				setLogicalStep((LogicalStep)null);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE:
				setEndingState((State)null);
				return;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE:
				setStartingState((State)null);
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
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE:
				return mse != null;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT:
				return result != null && !result.isEmpty();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP:
				return logicalStep != null;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE:
				return endingState != null;
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE:
				return startingState != null;
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
		if (baseClass == MSEOccurrence.class) {
			switch (derivedFeatureID) {
				case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE: return MsePackage.MSE_OCCURRENCE__MSE;
				case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS: return MsePackage.MSE_OCCURRENCE__PARAMETERS;
				case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT: return MsePackage.MSE_OCCURRENCE__RESULT;
				case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP: return MsePackage.MSE_OCCURRENCE__LOGICAL_STEP;
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE: return StepsPackage.STEP__ENDING_STATE;
				case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE: return StepsPackage.STEP__STARTING_STATE;
				default: return -1;
			}
		}
		if (baseClass == SmallStep.class) {
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
		if (baseClass == MSEOccurrence.class) {
			switch (baseFeatureID) {
				case MsePackage.MSE_OCCURRENCE__MSE: return StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__MSE;
				case MsePackage.MSE_OCCURRENCE__PARAMETERS: return StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__PARAMETERS;
				case MsePackage.MSE_OCCURRENCE__RESULT: return StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__RESULT;
				case MsePackage.MSE_OCCURRENCE__LOGICAL_STEP: return StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__LOGICAL_STEP;
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case StepsPackage.STEP__ENDING_STATE: return StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__ENDING_STATE;
				case StepsPackage.STEP__STARTING_STATE: return StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP__STARTING_STATE;
				default: return -1;
			}
		}
		if (baseClass == SmallStep.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //Arduino_Repeat_Execute_ImplicitStepImpl

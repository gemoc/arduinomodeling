/**
 */
package arduinoTrace.Traced.impl;

import arduinoTrace.Traced.TracedObjects;
import arduinoTrace.Traced.TracedPackage;

import arduinoTrace.Traced.arduino.TracedAnalogPin;
import arduinoTrace.Traced.arduino.TracedBooleanValue;
import arduinoTrace.Traced.arduino.TracedDigitalPin;
import arduinoTrace.Traced.arduino.TracedNumberValue;
import arduinoTrace.Traced.arduino.TracedStringValue;
import arduinoTrace.Traced.arduino.TracedVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoTrace.Traced.impl.TracedObjectsImpl#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.Traced.impl.TracedObjectsImpl#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.Traced.impl.TracedObjectsImpl#getArduino_tracedVariables <em>Arduino traced Variables</em>}</li>
 *   <li>{@link arduinoTrace.Traced.impl.TracedObjectsImpl#getArduino_tracedNumberValues <em>Arduino traced Number Values</em>}</li>
 *   <li>{@link arduinoTrace.Traced.impl.TracedObjectsImpl#getArduino_tracedStringValues <em>Arduino traced String Values</em>}</li>
 *   <li>{@link arduinoTrace.Traced.impl.TracedObjectsImpl#getArduino_tracedBooleanValues <em>Arduino traced Boolean Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedObjectsImpl extends MinimalEObjectImpl.Container implements TracedObjects {
	/**
	 * The cached value of the '{@link #getArduino_tracedDigitalPins() <em>Arduino traced Digital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedDigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDigitalPin> arduino_tracedDigitalPins;

	/**
	 * The cached value of the '{@link #getArduino_tracedAnalogPins() <em>Arduino traced Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAnalogPin> arduino_tracedAnalogPins;

	/**
	 * The cached value of the '{@link #getArduino_tracedVariables() <em>Arduino traced Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVariable> arduino_tracedVariables;

	/**
	 * The cached value of the '{@link #getArduino_tracedNumberValues() <em>Arduino traced Number Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedNumberValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedNumberValue> arduino_tracedNumberValues;

	/**
	 * The cached value of the '{@link #getArduino_tracedStringValues() <em>Arduino traced String Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedStringValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedStringValue> arduino_tracedStringValues;

	/**
	 * The cached value of the '{@link #getArduino_tracedBooleanValues() <em>Arduino traced Boolean Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBooleanValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanValue> arduino_tracedBooleanValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracedPackage.Literals.TRACED_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDigitalPin> getArduino_tracedDigitalPins() {
		if (arduino_tracedDigitalPins == null) {
			arduino_tracedDigitalPins = new EObjectContainmentEList<TracedDigitalPin>(TracedDigitalPin.class, this, TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS);
		}
		return arduino_tracedDigitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedAnalogPin> getArduino_tracedAnalogPins() {
		if (arduino_tracedAnalogPins == null) {
			arduino_tracedAnalogPins = new EObjectContainmentEList<TracedAnalogPin>(TracedAnalogPin.class, this, TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS);
		}
		return arduino_tracedAnalogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVariable> getArduino_tracedVariables() {
		if (arduino_tracedVariables == null) {
			arduino_tracedVariables = new EObjectContainmentEList<TracedVariable>(TracedVariable.class, this, TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES);
		}
		return arduino_tracedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedNumberValue> getArduino_tracedNumberValues() {
		if (arduino_tracedNumberValues == null) {
			arduino_tracedNumberValues = new EObjectContainmentEList<TracedNumberValue>(TracedNumberValue.class, this, TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES);
		}
		return arduino_tracedNumberValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedStringValue> getArduino_tracedStringValues() {
		if (arduino_tracedStringValues == null) {
			arduino_tracedStringValues = new EObjectContainmentEList<TracedStringValue>(TracedStringValue.class, this, TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES);
		}
		return arduino_tracedStringValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanValue> getArduino_tracedBooleanValues() {
		if (arduino_tracedBooleanValues == null) {
			arduino_tracedBooleanValues = new EObjectContainmentEList<TracedBooleanValue>(TracedBooleanValue.class, this, TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES);
		}
		return arduino_tracedBooleanValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS:
				return ((InternalEList<?>)getArduino_tracedDigitalPins()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS:
				return ((InternalEList<?>)getArduino_tracedAnalogPins()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedVariables()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES:
				return ((InternalEList<?>)getArduino_tracedNumberValues()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES:
				return ((InternalEList<?>)getArduino_tracedStringValues()).basicRemove(otherEnd, msgs);
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES:
				return ((InternalEList<?>)getArduino_tracedBooleanValues()).basicRemove(otherEnd, msgs);
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
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS:
				return getArduino_tracedDigitalPins();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS:
				return getArduino_tracedAnalogPins();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES:
				return getArduino_tracedVariables();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES:
				return getArduino_tracedNumberValues();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES:
				return getArduino_tracedStringValues();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES:
				return getArduino_tracedBooleanValues();
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
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				getArduino_tracedDigitalPins().addAll((Collection<? extends TracedDigitalPin>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				getArduino_tracedAnalogPins().addAll((Collection<? extends TracedAnalogPin>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES:
				getArduino_tracedVariables().clear();
				getArduino_tracedVariables().addAll((Collection<? extends TracedVariable>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES:
				getArduino_tracedNumberValues().clear();
				getArduino_tracedNumberValues().addAll((Collection<? extends TracedNumberValue>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES:
				getArduino_tracedStringValues().clear();
				getArduino_tracedStringValues().addAll((Collection<? extends TracedStringValue>)newValue);
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES:
				getArduino_tracedBooleanValues().clear();
				getArduino_tracedBooleanValues().addAll((Collection<? extends TracedBooleanValue>)newValue);
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
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES:
				getArduino_tracedVariables().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES:
				getArduino_tracedNumberValues().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES:
				getArduino_tracedStringValues().clear();
				return;
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES:
				getArduino_tracedBooleanValues().clear();
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
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_DIGITAL_PINS:
				return arduino_tracedDigitalPins != null && !arduino_tracedDigitalPins.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_ANALOG_PINS:
				return arduino_tracedAnalogPins != null && !arduino_tracedAnalogPins.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_VARIABLES:
				return arduino_tracedVariables != null && !arduino_tracedVariables.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_NUMBER_VALUES:
				return arduino_tracedNumberValues != null && !arduino_tracedNumberValues.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_STRING_VALUES:
				return arduino_tracedStringValues != null && !arduino_tracedStringValues.isEmpty();
			case TracedPackage.TRACED_OBJECTS__ARDUINO_TRACED_BOOLEAN_VALUES:
				return arduino_tracedBooleanValues != null && !arduino_tracedBooleanValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedObjectsImpl

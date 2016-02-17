/**
 *  Copyright (c) 2013 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.arduino.impl;

import fr.obeo.dsl.arduino.ArduinoPackage;
import fr.obeo.dsl.arduino.Channel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ChannelImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ChannelImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ChannelImpl#getInRate <em>In Rate</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ChannelImpl#getOutRate <em>Out Rate</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ChannelImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ChannelImpl#getCurrentSize <em>Current Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends NamedElementImpl implements Channel {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected fr.obeo.dsl.arduino.Thread source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected fr.obeo.dsl.arduino.Thread target;

	/**
	 * The default value of the '{@link #getInRate() <em>In Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRate()
	 * @generated
	 * @ordered
	 */
	protected static final int IN_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInRate() <em>In Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRate()
	 * @generated
	 * @ordered
	 */
	protected int inRate = IN_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutRate() <em>Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRate()
	 * @generated
	 * @ordered
	 */
	protected static final int OUT_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutRate() <em>Out Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRate()
	 * @generated
	 * @ordered
	 */
	protected int outRate = OUT_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentSize() <em>Current Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSize()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentSize() <em>Current Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSize()
	 * @generated
	 * @ordered
	 */
	protected int currentSize = CURRENT_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (fr.obeo.dsl.arduino.Thread)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.CHANNEL__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(fr.obeo.dsl.arduino.Thread newSource, NotificationChain msgs) {
		fr.obeo.dsl.arduino.Thread oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(fr.obeo.dsl.arduino.Thread newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ArduinoPackage.THREAD__CHANNELS, fr.obeo.dsl.arduino.Thread.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ArduinoPackage.THREAD__CHANNELS, fr.obeo.dsl.arduino.Thread.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (fr.obeo.dsl.arduino.Thread)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.CHANNEL__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(fr.obeo.dsl.arduino.Thread newTarget) {
		fr.obeo.dsl.arduino.Thread oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInRate() {
		return inRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInRate(int newInRate) {
		int oldInRate = inRate;
		inRate = newInRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__IN_RATE, oldInRate, inRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutRate() {
		return outRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutRate(int newOutRate) {
		int oldOutRate = outRate;
		outRate = newOutRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__OUT_RATE, oldOutRate, outRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentSize() {
		return currentSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSize(int newCurrentSize) {
		int oldCurrentSize = currentSize;
		currentSize = newCurrentSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CHANNEL__CURRENT_SIZE, oldCurrentSize, currentSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void read() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void write() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoPackage.CHANNEL__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ArduinoPackage.THREAD__CHANNELS, fr.obeo.dsl.arduino.Thread.class, msgs);
				return basicSetSource((fr.obeo.dsl.arduino.Thread)otherEnd, msgs);
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
			case ArduinoPackage.CHANNEL__SOURCE:
				return basicSetSource(null, msgs);
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
			case ArduinoPackage.CHANNEL__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ArduinoPackage.CHANNEL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ArduinoPackage.CHANNEL__IN_RATE:
				return getInRate();
			case ArduinoPackage.CHANNEL__OUT_RATE:
				return getOutRate();
			case ArduinoPackage.CHANNEL__CAPACITY:
				return getCapacity();
			case ArduinoPackage.CHANNEL__CURRENT_SIZE:
				return getCurrentSize();
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
			case ArduinoPackage.CHANNEL__SOURCE:
				setSource((fr.obeo.dsl.arduino.Thread)newValue);
				return;
			case ArduinoPackage.CHANNEL__TARGET:
				setTarget((fr.obeo.dsl.arduino.Thread)newValue);
				return;
			case ArduinoPackage.CHANNEL__IN_RATE:
				setInRate((Integer)newValue);
				return;
			case ArduinoPackage.CHANNEL__OUT_RATE:
				setOutRate((Integer)newValue);
				return;
			case ArduinoPackage.CHANNEL__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case ArduinoPackage.CHANNEL__CURRENT_SIZE:
				setCurrentSize((Integer)newValue);
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
			case ArduinoPackage.CHANNEL__SOURCE:
				setSource((fr.obeo.dsl.arduino.Thread)null);
				return;
			case ArduinoPackage.CHANNEL__TARGET:
				setTarget((fr.obeo.dsl.arduino.Thread)null);
				return;
			case ArduinoPackage.CHANNEL__IN_RATE:
				setInRate(IN_RATE_EDEFAULT);
				return;
			case ArduinoPackage.CHANNEL__OUT_RATE:
				setOutRate(OUT_RATE_EDEFAULT);
				return;
			case ArduinoPackage.CHANNEL__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case ArduinoPackage.CHANNEL__CURRENT_SIZE:
				setCurrentSize(CURRENT_SIZE_EDEFAULT);
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
			case ArduinoPackage.CHANNEL__SOURCE:
				return source != null;
			case ArduinoPackage.CHANNEL__TARGET:
				return target != null;
			case ArduinoPackage.CHANNEL__IN_RATE:
				return inRate != IN_RATE_EDEFAULT;
			case ArduinoPackage.CHANNEL__OUT_RATE:
				return outRate != OUT_RATE_EDEFAULT;
			case ArduinoPackage.CHANNEL__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case ArduinoPackage.CHANNEL__CURRENT_SIZE:
				return currentSize != CURRENT_SIZE_EDEFAULT;
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
		result.append(" (inRate: ");
		result.append(inRate);
		result.append(", outRate: ");
		result.append(outRate);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", currentSize: ");
		result.append(currentSize);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl

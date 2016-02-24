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
import fr.obeo.dsl.arduino.ThreadInstructionBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadInstructionBlockImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadInstructionBlockImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ThreadInstructionBlockImpl extends NamedElementImpl implements ThreadInstructionBlock {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ThreadInstructionBlock next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadInstructionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.THREAD_INSTRUCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread getThread() {
		if (eContainerFeatureID() != ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD) return null;
		return (fr.obeo.dsl.arduino.Thread)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThread(fr.obeo.dsl.arduino.Thread newThread, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThread, ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(fr.obeo.dsl.arduino.Thread newThread) {
		if (newThread != eInternalContainer() || (eContainerFeatureID() != ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD && newThread != null)) {
			if (EcoreUtil.isAncestor(this, newThread))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThread != null)
				msgs = ((InternalEObject)newThread).eInverseAdd(this, ArduinoPackage.THREAD__BLOCKS, fr.obeo.dsl.arduino.Thread.class, msgs);
			msgs = basicSetThread(newThread, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD, newThread, newThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadInstructionBlock getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (ThreadInstructionBlock)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadInstructionBlock basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(ThreadInstructionBlock newNext) {
		ThreadInstructionBlock oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
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
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThread((fr.obeo.dsl.arduino.Thread)otherEnd, msgs);
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
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				return basicSetThread(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				return eInternalContainer().eInverseRemove(this, ArduinoPackage.THREAD__BLOCKS, fr.obeo.dsl.arduino.Thread.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				return getThread();
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
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
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				setThread((fr.obeo.dsl.arduino.Thread)newValue);
				return;
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
				setNext((ThreadInstructionBlock)newValue);
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
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				setThread((fr.obeo.dsl.arduino.Thread)null);
				return;
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
				setNext((ThreadInstructionBlock)null);
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
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				return getThread() != null;
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreadInstructionBlockImpl

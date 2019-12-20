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
	 * The cached value of the '{@link #getThread() <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected fr.obeo.dsl.arduino.Thread thread;
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
		if (thread != null && thread.eIsProxy()) {
			InternalEObject oldThread = (InternalEObject)thread;
			thread = (fr.obeo.dsl.arduino.Thread)eResolveProxy(oldThread);
			if (thread != oldThread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD, oldThread, thread));
			}
		}
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.obeo.dsl.arduino.Thread basicGetThread() {
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(fr.obeo.dsl.arduino.Thread newThread) {
		fr.obeo.dsl.arduino.Thread oldThread = thread;
		thread = newThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD, oldThread, thread));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__THREAD:
				if (resolve) return getThread();
				return basicGetThread();
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
				return thread != null;
			case ArduinoPackage.THREAD_INSTRUCTION_BLOCK__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreadInstructionBlockImpl

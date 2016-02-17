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
import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.InstructionBlock;
import fr.obeo.dsl.arduino.SynchronizationBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.InstructionBlockImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.InstructionBlockImpl#getNext <em>Next</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.InstructionBlockImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionBlockImpl extends ThreadInstructionBlockImpl implements InstructionBlock {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationBlock next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationBlock previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.INSTRUCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentWithInverseEList<Instruction>(Instruction.class, this, ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS, ArduinoPackage.INSTRUCTION__OWNED_BLOCK);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationBlock getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (SynchronizationBlock)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.INSTRUCTION_BLOCK__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationBlock basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(SynchronizationBlock newNext, NotificationChain msgs) {
		SynchronizationBlock oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.INSTRUCTION_BLOCK__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(SynchronizationBlock newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, ArduinoPackage.SYNCHRONIZATION_BLOCK__PREVIOUS, SynchronizationBlock.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, ArduinoPackage.SYNCHRONIZATION_BLOCK__PREVIOUS, SynchronizationBlock.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.INSTRUCTION_BLOCK__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationBlock getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (SynchronizationBlock)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationBlock basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(SynchronizationBlock newPrevious, NotificationChain msgs) {
		SynchronizationBlock oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(SynchronizationBlock newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, ArduinoPackage.SYNCHRONIZATION_BLOCK__NEXT, SynchronizationBlock.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, ArduinoPackage.SYNCHRONIZATION_BLOCK__NEXT, SynchronizationBlock.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS, newPrevious, newPrevious));
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
			case ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructions()).basicAdd(otherEnd, msgs);
			case ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, ArduinoPackage.SYNCHRONIZATION_BLOCK__PREVIOUS, SynchronizationBlock.class, msgs);
				return basicSetNext((SynchronizationBlock)otherEnd, msgs);
			case ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, ArduinoPackage.SYNCHRONIZATION_BLOCK__NEXT, SynchronizationBlock.class, msgs);
				return basicSetPrevious((SynchronizationBlock)otherEnd, msgs);
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
			case ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
				return basicSetNext(null, msgs);
			case ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
				return basicSetPrevious(null, msgs);
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
			case ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
				return getInstructions();
			case ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
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
			case ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
				setNext((SynchronizationBlock)newValue);
				return;
			case ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
				setPrevious((SynchronizationBlock)newValue);
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
			case ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
				setNext((SynchronizationBlock)null);
				return;
			case ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
				setPrevious((SynchronizationBlock)null);
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
			case ArduinoPackage.INSTRUCTION_BLOCK__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case ArduinoPackage.INSTRUCTION_BLOCK__NEXT:
				return next != null;
			case ArduinoPackage.INSTRUCTION_BLOCK__PREVIOUS:
				return previous != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionBlockImpl

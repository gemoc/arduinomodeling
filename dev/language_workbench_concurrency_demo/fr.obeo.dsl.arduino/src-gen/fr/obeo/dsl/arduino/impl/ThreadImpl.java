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
import fr.obeo.dsl.arduino.Block;
import fr.obeo.dsl.arduino.Channel;

import fr.obeo.dsl.arduino.Instruction;
import fr.obeo.dsl.arduino.ThreadInstructionBlock;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadImpl#getCurrentInstruction <em>Current Instruction</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadImpl#getFirst <em>First</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadImpl#getLast <em>Last</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ThreadImpl#getNbCycle <em>Nb Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadImpl extends NamedElementImpl implements fr.obeo.dsl.arduino.Thread {
	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreadInstructionBlock> blocks;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getCurrentInstruction() <em>Current Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentInstruction()
	 * @generated
	 * @ordered
	 */
	protected Instruction currentInstruction;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected ThreadInstructionBlock first;

	/**
	 * The cached value of the '{@link #getLast() <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected ThreadInstructionBlock last;

	/**
	 * The default value of the '{@link #getNbCycle() <em>Nb Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCycle()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CYCLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCycle() <em>Nb Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCycle()
	 * @generated
	 * @ordered
	 */
	protected int nbCycle = NB_CYCLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThreadInstructionBlock> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<ThreadInstructionBlock>(ThreadInstructionBlock.class, this, ArduinoPackage.THREAD__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, ArduinoPackage.THREAD__CHANNELS, ArduinoPackage.CHANNEL__SOURCE);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getCurrentInstruction() {
		if (currentInstruction != null && currentInstruction.eIsProxy()) {
			InternalEObject oldCurrentInstruction = (InternalEObject)currentInstruction;
			currentInstruction = (Instruction)eResolveProxy(oldCurrentInstruction);
			if (currentInstruction != oldCurrentInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.THREAD__CURRENT_INSTRUCTION, oldCurrentInstruction, currentInstruction));
			}
		}
		return currentInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetCurrentInstruction() {
		return currentInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentInstruction(Instruction newCurrentInstruction) {
		Instruction oldCurrentInstruction = currentInstruction;
		currentInstruction = newCurrentInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD__CURRENT_INSTRUCTION, oldCurrentInstruction, currentInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadInstructionBlock getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (ThreadInstructionBlock)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.THREAD__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadInstructionBlock basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(ThreadInstructionBlock newFirst) {
		ThreadInstructionBlock oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadInstructionBlock getLast() {
		if (last != null && last.eIsProxy()) {
			InternalEObject oldLast = (InternalEObject)last;
			last = (ThreadInstructionBlock)eResolveProxy(oldLast);
			if (last != oldLast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.THREAD__LAST, oldLast, last));
			}
		}
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadInstructionBlock basicGetLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast(ThreadInstructionBlock newLast) {
		ThreadInstructionBlock oldLast = last;
		last = newLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD__LAST, oldLast, last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCycle() {
		return nbCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCycle(int newNbCycle) {
		int oldNbCycle = nbCycle;
		nbCycle = newNbCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.THREAD__NB_CYCLE, oldNbCycle, nbCycle));
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
			case ArduinoPackage.THREAD__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
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
			case ArduinoPackage.THREAD__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case ArduinoPackage.THREAD__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
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
			case ArduinoPackage.THREAD__BLOCKS:
				return getBlocks();
			case ArduinoPackage.THREAD__CHANNELS:
				return getChannels();
			case ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
				if (resolve) return getCurrentInstruction();
				return basicGetCurrentInstruction();
			case ArduinoPackage.THREAD__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case ArduinoPackage.THREAD__LAST:
				if (resolve) return getLast();
				return basicGetLast();
			case ArduinoPackage.THREAD__NB_CYCLE:
				return getNbCycle();
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
			case ArduinoPackage.THREAD__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends ThreadInstructionBlock>)newValue);
				return;
			case ArduinoPackage.THREAD__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
				setCurrentInstruction((Instruction)newValue);
				return;
			case ArduinoPackage.THREAD__FIRST:
				setFirst((ThreadInstructionBlock)newValue);
				return;
			case ArduinoPackage.THREAD__LAST:
				setLast((ThreadInstructionBlock)newValue);
				return;
			case ArduinoPackage.THREAD__NB_CYCLE:
				setNbCycle((Integer)newValue);
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
			case ArduinoPackage.THREAD__BLOCKS:
				getBlocks().clear();
				return;
			case ArduinoPackage.THREAD__CHANNELS:
				getChannels().clear();
				return;
			case ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
				setCurrentInstruction((Instruction)null);
				return;
			case ArduinoPackage.THREAD__FIRST:
				setFirst((ThreadInstructionBlock)null);
				return;
			case ArduinoPackage.THREAD__LAST:
				setLast((ThreadInstructionBlock)null);
				return;
			case ArduinoPackage.THREAD__NB_CYCLE:
				setNbCycle(NB_CYCLE_EDEFAULT);
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
			case ArduinoPackage.THREAD__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case ArduinoPackage.THREAD__CHANNELS:
				return channels != null && !channels.isEmpty();
			case ArduinoPackage.THREAD__CURRENT_INSTRUCTION:
				return currentInstruction != null;
			case ArduinoPackage.THREAD__FIRST:
				return first != null;
			case ArduinoPackage.THREAD__LAST:
				return last != null;
			case ArduinoPackage.THREAD__NB_CYCLE:
				return nbCycle != NB_CYCLE_EDEFAULT;
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
		result.append(" (nbCycle: ");
		result.append(nbCycle);
		result.append(')');
		return result.toString();
	}

} //ThreadImpl

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
import fr.obeo.dsl.arduino.Board;
import fr.obeo.dsl.arduino.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.LinkImpl#getInBoard <em>In Board</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.LinkImpl#getOutBoard <em>Out Board</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends NamedElementImpl implements Link {
	/**
	 * The cached value of the '{@link #getInBoard() <em>In Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBoard()
	 * @generated
	 * @ordered
	 */
	protected Board inBoard;

	/**
	 * The cached value of the '{@link #getOutBoard() <em>Out Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBoard()
	 * @generated
	 * @ordered
	 */
	protected Board outBoard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getInBoard() {
		if (inBoard != null && inBoard.eIsProxy()) {
			InternalEObject oldInBoard = (InternalEObject)inBoard;
			inBoard = (Board)eResolveProxy(oldInBoard);
			if (inBoard != oldInBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.LINK__IN_BOARD, oldInBoard, inBoard));
			}
		}
		return inBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetInBoard() {
		return inBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBoard(Board newInBoard) {
		Board oldInBoard = inBoard;
		inBoard = newInBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.LINK__IN_BOARD, oldInBoard, inBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getOutBoard() {
		if (outBoard != null && outBoard.eIsProxy()) {
			InternalEObject oldOutBoard = (InternalEObject)outBoard;
			outBoard = (Board)eResolveProxy(oldOutBoard);
			if (outBoard != oldOutBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.LINK__OUT_BOARD, oldOutBoard, outBoard));
			}
		}
		return outBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetOutBoard() {
		return outBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutBoard(Board newOutBoard) {
		Board oldOutBoard = outBoard;
		outBoard = newOutBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.LINK__OUT_BOARD, oldOutBoard, outBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoPackage.LINK__IN_BOARD:
				if (resolve) return getInBoard();
				return basicGetInBoard();
			case ArduinoPackage.LINK__OUT_BOARD:
				if (resolve) return getOutBoard();
				return basicGetOutBoard();
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
			case ArduinoPackage.LINK__IN_BOARD:
				setInBoard((Board)newValue);
				return;
			case ArduinoPackage.LINK__OUT_BOARD:
				setOutBoard((Board)newValue);
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
			case ArduinoPackage.LINK__IN_BOARD:
				setInBoard((Board)null);
				return;
			case ArduinoPackage.LINK__OUT_BOARD:
				setOutBoard((Board)null);
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
			case ArduinoPackage.LINK__IN_BOARD:
				return inBoard != null;
			case ArduinoPackage.LINK__OUT_BOARD:
				return outBoard != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl

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
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Sketch;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ProjectImpl#getBoards <em>Boards</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ProjectImpl#getSketch <em>Sketch</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.ProjectImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends NamedElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getBoards() <em>Boards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoards()
	 * @generated
	 * @ordered
	 */
	protected EList<Board> boards;

	/**
	 * The cached value of the '{@link #getSketch() <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSketch()
	 * @generated
	 * @ordered
	 */
	protected Sketch sketch;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getBoards() {
		if (boards == null) {
			boards = new EObjectContainmentWithInverseEList<Board>(Board.class, this, ArduinoPackage.PROJECT__BOARDS, ArduinoPackage.BOARD__PROJECT);
		}
		return boards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch getSketch() {
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSketch(Sketch newSketch, NotificationChain msgs) {
		Sketch oldSketch = sketch;
		sketch = newSketch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.PROJECT__SKETCH, oldSketch, newSketch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSketch(Sketch newSketch) {
		if (newSketch != sketch) {
			NotificationChain msgs = null;
			if (sketch != null)
				msgs = ((InternalEObject)sketch).eInverseRemove(this, ArduinoPackage.SKETCH__PROJECT, Sketch.class, msgs);
			if (newSketch != null)
				msgs = ((InternalEObject)newSketch).eInverseAdd(this, ArduinoPackage.SKETCH__PROJECT, Sketch.class, msgs);
			msgs = basicSetSketch(newSketch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.PROJECT__SKETCH, newSketch, newSketch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ArduinoPackage.PROJECT__LINKS);
		}
		return links;
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
			case ArduinoPackage.PROJECT__BOARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoards()).basicAdd(otherEnd, msgs);
			case ArduinoPackage.PROJECT__SKETCH:
				if (sketch != null)
					msgs = ((InternalEObject)sketch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoPackage.PROJECT__SKETCH, null, msgs);
				return basicSetSketch((Sketch)otherEnd, msgs);
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
			case ArduinoPackage.PROJECT__BOARDS:
				return ((InternalEList<?>)getBoards()).basicRemove(otherEnd, msgs);
			case ArduinoPackage.PROJECT__SKETCH:
				return basicSetSketch(null, msgs);
			case ArduinoPackage.PROJECT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ArduinoPackage.PROJECT__BOARDS:
				return getBoards();
			case ArduinoPackage.PROJECT__SKETCH:
				return getSketch();
			case ArduinoPackage.PROJECT__LINKS:
				return getLinks();
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
			case ArduinoPackage.PROJECT__BOARDS:
				getBoards().clear();
				getBoards().addAll((Collection<? extends Board>)newValue);
				return;
			case ArduinoPackage.PROJECT__SKETCH:
				setSketch((Sketch)newValue);
				return;
			case ArduinoPackage.PROJECT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case ArduinoPackage.PROJECT__BOARDS:
				getBoards().clear();
				return;
			case ArduinoPackage.PROJECT__SKETCH:
				setSketch((Sketch)null);
				return;
			case ArduinoPackage.PROJECT__LINKS:
				getLinks().clear();
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
			case ArduinoPackage.PROJECT__BOARDS:
				return boards != null && !boards.isEmpty();
			case ArduinoPackage.PROJECT__SKETCH:
				return sketch != null;
			case ArduinoPackage.PROJECT__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl

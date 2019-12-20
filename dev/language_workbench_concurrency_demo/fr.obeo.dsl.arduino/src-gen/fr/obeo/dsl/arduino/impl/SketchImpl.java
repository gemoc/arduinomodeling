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
import fr.obeo.dsl.arduino.Project;
import fr.obeo.dsl.arduino.Sketch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.impl.SketchImpl#getProject <em>Project</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.SketchImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.impl.SketchImpl#getChannels <em>Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SketchImpl extends NamedElementImpl implements Sketch {
	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<fr.obeo.dsl.arduino.Thread> threads;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SketchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.SKETCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != ArduinoPackage.SKETCH__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, ArduinoPackage.SKETCH__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != ArduinoPackage.SKETCH__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ArduinoPackage.PROJECT__SKETCH, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fr.obeo.dsl.arduino.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentEList<fr.obeo.dsl.arduino.Thread>(fr.obeo.dsl.arduino.Thread.class, this, ArduinoPackage.SKETCH__THREADS);
		}
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, ArduinoPackage.SKETCH__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoPackage.SKETCH__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
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
			case ArduinoPackage.SKETCH__PROJECT:
				return basicSetProject(null, msgs);
			case ArduinoPackage.SKETCH__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case ArduinoPackage.SKETCH__CHANNELS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArduinoPackage.SKETCH__PROJECT:
				return eInternalContainer().eInverseRemove(this, ArduinoPackage.PROJECT__SKETCH, Project.class, msgs);
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
			case ArduinoPackage.SKETCH__PROJECT:
				return getProject();
			case ArduinoPackage.SKETCH__THREADS:
				return getThreads();
			case ArduinoPackage.SKETCH__CHANNELS:
				return getChannels();
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
			case ArduinoPackage.SKETCH__PROJECT:
				setProject((Project)newValue);
				return;
			case ArduinoPackage.SKETCH__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends fr.obeo.dsl.arduino.Thread>)newValue);
				return;
			case ArduinoPackage.SKETCH__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
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
			case ArduinoPackage.SKETCH__PROJECT:
				setProject((Project)null);
				return;
			case ArduinoPackage.SKETCH__THREADS:
				getThreads().clear();
				return;
			case ArduinoPackage.SKETCH__CHANNELS:
				getChannels().clear();
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
			case ArduinoPackage.SKETCH__PROJECT:
				return getProject() != null;
			case ArduinoPackage.SKETCH__THREADS:
				return threads != null && !threads.isEmpty();
			case ArduinoPackage.SKETCH__CHANNELS:
				return channels != null && !channels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SketchImpl

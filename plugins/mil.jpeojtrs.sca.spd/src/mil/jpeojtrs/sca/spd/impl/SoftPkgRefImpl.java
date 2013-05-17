/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 // BEGIN GENERATED CODE
package mil.jpeojtrs.sca.spd.impl;

import mil.jpeojtrs.sca.spd.ImplRef;
import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SoftPkgRef;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Soft Pkg Ref</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl#getImplRef <em>Impl Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl#getSoftPkg <em>Soft Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftPkgRefImpl extends EObjectImpl implements SoftPkgRef {
	/**
	 * The cached value of the '{@link #getLocalFile() <em>Local File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFile()
	 * @generated
	 * @ordered
	 */
	protected LocalFile localFile;
	/**
	 * The cached value of the '{@link #getImplRef() <em>Impl Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplRef()
	 * @generated
	 * @ordered
	 */
	protected ImplRef implRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftPkgRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.SOFT_PKG_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile getLocalFile() {
		return localFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalFileGen(LocalFile newLocalFile, NotificationChain msgs) {
		LocalFile oldLocalFile = localFile;
		localFile = newLocalFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__LOCAL_FILE, oldLocalFile, newLocalFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetLocalFile(LocalFile newLocalFile, NotificationChain msgs) {
		SoftPkg oldSpd = getSoftPkg();
		Implementation oldImpl = getImplementation();
		msgs = basicSetLocalFileGen(newLocalFile, msgs);
		if (eNotificationRequired()) {
			ENotificationImpl notificationSpd = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__SOFT_PKG, oldSpd, getSoftPkg());
			if (msgs == null) {
				msgs = notificationSpd;
			} else {
				msgs.add(notificationSpd);
			}
			ENotificationImpl notificationImpl = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__IMPLEMENTATION, oldImpl, getImplementation());
			msgs.add(notificationImpl);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalFile(LocalFile newLocalFile) {
		if (newLocalFile != localFile) {
			NotificationChain msgs = null;
			if (localFile != null)
				msgs = ((InternalEObject)localFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG_REF__LOCAL_FILE, null, msgs);
			if (newLocalFile != null)
				msgs = ((InternalEObject)newLocalFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG_REF__LOCAL_FILE, null, msgs);
			msgs = basicSetLocalFile(newLocalFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__LOCAL_FILE, newLocalFile, newLocalFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplRef getImplRef() {
		return implRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplRefGen(ImplRef newImplRef, NotificationChain msgs) {
		ImplRef oldImplRef = implRef;
		implRef = newImplRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__IMPL_REF, oldImplRef, newImplRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetImplRef(ImplRef newImplRef, NotificationChain msgs) {
		Implementation oldImpl = getImplementation();
		msgs = basicSetImplRefGen(newImplRef, msgs);
		if (eNotificationRequired()) {
			ENotificationImpl notificationImpl = new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__IMPLEMENTATION, oldImpl, getImplementation());
			if (msgs == null) {
				msgs = notificationImpl;
			} else {
				msgs.add(notificationImpl);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplRef(ImplRef newImplRef) {
		if (newImplRef != implRef) {
			NotificationChain msgs = null;
			if (implRef != null)
				msgs = ((InternalEObject)implRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG_REF__IMPL_REF, null, msgs);
			if (newImplRef != null)
				msgs = ((InternalEObject)newImplRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpdPackage.SOFT_PKG_REF__IMPL_REF, null, msgs);
			msgs = basicSetImplRef(newImplRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.SOFT_PKG_REF__IMPL_REF, newImplRef, newImplRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getImplementation() {
		Implementation implementation = basicGetImplementation();
		return implementation != null && implementation.eIsProxy() ? (Implementation)eResolveProxy((InternalEObject)implementation) : implementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SoftPkg basicGetSoftPkg() {
		// END GENERATED CODE
		if (getLocalFile() == null) {
			return null;
		}
		return (SoftPkg) ScaUriHelpers.getLocalFileEObject(getLocalFile().getName(), this, SoftPkg.EOBJECT_PATH,
				SoftPkg.Util.getFileSystem(SoftPkg.Util.getSoftPkg(eResource())));
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setSoftPkg(final SoftPkg newSoftPkg) {
		basicSetSoftPkg(newSoftPkg);
		setImplRef(null);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpdPackage.SOFT_PKG_REF__LOCAL_FILE:
				return basicSetLocalFile(null, msgs);
			case SpdPackage.SOFT_PKG_REF__IMPL_REF:
				return basicSetImplRef(null, msgs);
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
			case SpdPackage.SOFT_PKG_REF__LOCAL_FILE:
				return getLocalFile();
			case SpdPackage.SOFT_PKG_REF__IMPL_REF:
				return getImplRef();
			case SpdPackage.SOFT_PKG_REF__IMPLEMENTATION:
				if (resolve) return getImplementation();
				return basicGetImplementation();
			case SpdPackage.SOFT_PKG_REF__SOFT_PKG:
				if (resolve) return getSoftPkg();
				return basicGetSoftPkg();
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
			case SpdPackage.SOFT_PKG_REF__LOCAL_FILE:
				setLocalFile((LocalFile)newValue);
				return;
			case SpdPackage.SOFT_PKG_REF__IMPL_REF:
				setImplRef((ImplRef)newValue);
				return;
			case SpdPackage.SOFT_PKG_REF__IMPLEMENTATION:
				setImplementation((Implementation)newValue);
				return;
			case SpdPackage.SOFT_PKG_REF__SOFT_PKG:
				setSoftPkg((SoftPkg)newValue);
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
			case SpdPackage.SOFT_PKG_REF__LOCAL_FILE:
				setLocalFile((LocalFile)null);
				return;
			case SpdPackage.SOFT_PKG_REF__IMPL_REF:
				setImplRef((ImplRef)null);
				return;
			case SpdPackage.SOFT_PKG_REF__IMPLEMENTATION:
				setImplementation((Implementation)null);
				return;
			case SpdPackage.SOFT_PKG_REF__SOFT_PKG:
				setSoftPkg((SoftPkg)null);
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
			case SpdPackage.SOFT_PKG_REF__LOCAL_FILE:
				return localFile != null;
			case SpdPackage.SOFT_PKG_REF__IMPL_REF:
				return implRef != null;
			case SpdPackage.SOFT_PKG_REF__IMPLEMENTATION:
				return basicGetImplementation() != null;
			case SpdPackage.SOFT_PKG_REF__SOFT_PKG:
				return basicGetSoftPkg() != null;
		}
		return super.eIsSet(featureID);
	}

	private void basicSetSoftPkg(SoftPkg newSoftPkg) {
		// END GENERATED CODE
		String localFilePath = ScaUriHelpers.getLocalFilePath(this, newSoftPkg);
		LocalFile file = null;
		if (localFilePath != null) {
			file = SpdFactory.eINSTANCE.createLocalFile();
			file.setName(localFilePath);
		}
		setLocalFile(file);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Implementation basicGetImplementation() {
		// END GENERATED CODE
		if (getSoftPkg() != null && getImplRef() != null && getImplRef().getRefid() != null) {
			String implId = getImplRef().getRefid();
			for (Implementation impl : getSoftPkg().getImplementation()) {
				if (implId.equals(impl.getId())) {
					return impl;
				}
			}
		}
		return null;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setImplementation(Implementation newImplementation) {
		// END GENERATED CODE
		ImplRef ref = null;
		if (newImplementation != null) {
			ref = SpdFactory.eINSTANCE.createImplRef();
			ref.setRefid(newImplementation.getId());
			basicSetSoftPkg(newImplementation.getSoftPkg());
		} else {
			basicSetSoftPkg(null);
		}
		setImplRef(ref);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkg getSoftPkg() {
		SoftPkg softPkg = basicGetSoftPkg();
		return softPkg != null && softPkg.eIsProxy() ? (SoftPkg)eResolveProxy((InternalEObject)softPkg) : softPkg;
	}

} // SoftPkgRefImpl

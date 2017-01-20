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
package mil.jpeojtrs.sca.partitioning.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl#getLocalFile <em>Local File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl#getSoftPkg <em>Soft Pkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ComponentFileImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentFileImpl extends EObjectImpl implements ComponentFile {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.COMPONENT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalFile getLocalFile() {
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalFile(LocalFile newLocalFile, NotificationChain msgs) {
		LocalFile oldLocalFile = localFile;
		localFile = newLocalFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_FILE__LOCAL_FILE, oldLocalFile,
				newLocalFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private EContentAdapter notifier = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			boolean spdChanged = false;
			if (notification.getFeature() == PartitioningPackage.Literals.LOCAL_FILE__NAME) {
				spdChanged = true;
			}
			if (spdChanged && eNotificationRequired()) {
				eNotify(new ENotificationImpl(ComponentFileImpl.this, Notification.SET, PartitioningPackage.COMPONENT_FILE__SOFT_PKG, null, getSoftPkg()));
			}
		}
	};
	private SoftPkg spd;

	{
		eAdapters().add(notifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalFileGen(LocalFile newLocalFile) {
		if (newLocalFile != localFile) {
			NotificationChain msgs = null;
			if (localFile != null)
				msgs = ((InternalEObject) localFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_FILE__LOCAL_FILE, null, msgs);
			if (newLocalFile != null)
				msgs = ((InternalEObject) newLocalFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.COMPONENT_FILE__LOCAL_FILE, null, msgs);
			msgs = basicSetLocalFile(newLocalFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_FILE__LOCAL_FILE, newLocalFile, newLocalFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLocalFile(LocalFile newLocalFile) {
		SoftPkg oldValue = getSoftPkg();
		setLocalFileGen(newLocalFile);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_FILE__SOFT_PKG, oldValue, getSoftPkg()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_FILE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftPkg getSoftPkg() {
		SoftPkg softPkg = basicGetSoftPkg();
		return softPkg != null && softPkg.eIsProxy() ? (SoftPkg) eResolveProxy((InternalEObject) softPkg) : softPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SoftPkg basicGetSoftPkg() {
		// END GENERATED CODE
		if (this.localFile == null) {
			return null;
		}
		if (this.spd == null) {
			spd = (SoftPkg) ScaUriHelpers.getLocalFileEObject(getLocalFile().getName(), this, SoftPkg.EOBJECT_PATH, getFileSystem());
		}
		return spd;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSoftPkg(final SoftPkg newSoftPkg) {
		// END GENERATED CODE
		if (newSoftPkg == null) {
			this.setLocalFile(null);
			return;
		}
		if (this.localFile == null) {
			this.setLocalFile(PartitioningFactory.eINSTANCE.createLocalFile());
		}
		final URI spdURI = newSoftPkg.eResource().getURI();
		final String spdPath = ScaUriHelpers.getLocalFilePath(this, newSoftPkg);

		String newId = UUID.randomUUID().toString();
		String name = spdURI.lastSegment();
		if (name != null) {
			int index = name.indexOf('.');
			if (index > 0) {
				name = name.substring(0, index);
				newId = name + "_" + UUID.randomUUID().toString();
			}
		}
		setId(newId);
		setType("SPD");
		this.localFile.setName(spdPath);
		this.spd = newSoftPkg;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.COMPONENT_FILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PartitioningPackage.COMPONENT_FILE__LOCAL_FILE:
			return basicSetLocalFile(null, msgs);
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
		case PartitioningPackage.COMPONENT_FILE__LOCAL_FILE:
			return getLocalFile();
		case PartitioningPackage.COMPONENT_FILE__ID:
			return getId();
		case PartitioningPackage.COMPONENT_FILE__SOFT_PKG:
			if (resolve)
				return getSoftPkg();
			return basicGetSoftPkg();
		case PartitioningPackage.COMPONENT_FILE__TYPE:
			return getType();
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
		case PartitioningPackage.COMPONENT_FILE__LOCAL_FILE:
			setLocalFile((LocalFile) newValue);
			return;
		case PartitioningPackage.COMPONENT_FILE__ID:
			setId((String) newValue);
			return;
		case PartitioningPackage.COMPONENT_FILE__SOFT_PKG:
			setSoftPkg((SoftPkg) newValue);
			return;
		case PartitioningPackage.COMPONENT_FILE__TYPE:
			setType((String) newValue);
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
		case PartitioningPackage.COMPONENT_FILE__LOCAL_FILE:
			setLocalFile((LocalFile) null);
			return;
		case PartitioningPackage.COMPONENT_FILE__ID:
			setId(ID_EDEFAULT);
			return;
		case PartitioningPackage.COMPONENT_FILE__SOFT_PKG:
			setSoftPkg((SoftPkg) null);
			return;
		case PartitioningPackage.COMPONENT_FILE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case PartitioningPackage.COMPONENT_FILE__LOCAL_FILE:
			return localFile != null;
		case PartitioningPackage.COMPONENT_FILE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case PartitioningPackage.COMPONENT_FILE__SOFT_PKG:
			return basicGetSoftPkg() != null;
		case PartitioningPackage.COMPONENT_FILE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	protected abstract String getFileSystem();

} //ComponentFileImpl

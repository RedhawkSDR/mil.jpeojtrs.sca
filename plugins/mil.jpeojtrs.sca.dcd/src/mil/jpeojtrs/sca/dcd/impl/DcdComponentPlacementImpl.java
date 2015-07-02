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
package mil.jpeojtrs.sca.dcd.impl;

import mil.jpeojtrs.sca.dcd.CompositePartOfDevice;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DeployOnDevice;
import mil.jpeojtrs.sca.dcd.DevicePkgFile;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.impl.ComponentPlacementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl#getDeployDevice <em>Deploy Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl#getCompositePartOfDevice <em>Composite Part Of Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl#getDevicePkgFile <em>Device Pkg File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.impl.DcdComponentPlacementImpl#getParentDevice <em>Parent Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcdComponentPlacementImpl extends ComponentPlacementImpl<DcdComponentInstantiation>implements DcdComponentPlacement {
	/**
	 * The cached value of the '{@link #getDeployDevice() <em>Deploy Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployDevice()
	 * @generated
	 * @ordered
	 */
	protected DeployOnDevice deployDevice;
	/**
	 * The cached value of the '{@link #getCompositePartOfDevice() <em>Composite Part Of Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositePartOfDevice()
	 * @generated
	 * @ordered
	 */
	protected CompositePartOfDevice compositePartOfDevice;
	/**
	 * The cached value of the '{@link #getDevicePkgFile() <em>Device Pkg File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicePkgFile()
	 * @generated
	 * @ordered
	 */
	protected DevicePkgFile devicePkgFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcdComponentPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DCD_COMPONENT_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<DcdComponentInstantiation> getComponentInstantiation() {
		if (componentInstantiation == null) {
			componentInstantiation = new EObjectContainmentWithInverseEList<DcdComponentInstantiation>(DcdComponentInstantiation.class, this,
				DcdPackage.DCD_COMPONENT_PLACEMENT__COMPONENT_INSTANTIATION, PartitioningPackage.COMPONENT_INSTANTIATION__PLACEMENT) {
				private static final long serialVersionUID = 1L;

				@Override
				public Class< ? > getInverseFeatureClass() {
					return ComponentInstantiation.class;
				}
			};
		}
		return componentInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeployOnDevice getDeployDevice() {
		return deployDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployDevice(DeployOnDevice newDeployDevice, NotificationChain msgs) {
		DeployOnDevice oldDeployDevice = deployDevice;
		deployDevice = newDeployDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE, oldDeployDevice,
				newDeployDevice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployDevice(DeployOnDevice newDeployDevice) {
		if (newDeployDevice != deployDevice) {
			NotificationChain msgs = null;
			if (deployDevice != null)
				msgs = ((InternalEObject) deployDevice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE, null,
					msgs);
			if (newDeployDevice != null)
				msgs = ((InternalEObject) newDeployDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE, null,
					msgs);
			msgs = basicSetDeployDevice(newDeployDevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE, newDeployDevice, newDeployDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositePartOfDevice getCompositePartOfDevice() {
		return compositePartOfDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositePartOfDevice(CompositePartOfDevice newCompositePartOfDevice, NotificationChain msgs) {
		CompositePartOfDevice oldCompositePartOfDevice = compositePartOfDevice;
		compositePartOfDevice = newCompositePartOfDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE,
				oldCompositePartOfDevice, newCompositePartOfDevice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositePartOfDeviceGen(CompositePartOfDevice newCompositePartOfDevice) {
		if (newCompositePartOfDevice != compositePartOfDevice) {
			NotificationChain msgs = null;
			if (compositePartOfDevice != null)
				msgs = ((InternalEObject) compositePartOfDevice).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE, null, msgs);
			if (newCompositePartOfDevice != null)
				msgs = ((InternalEObject) newCompositePartOfDevice).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE, null, msgs);
			msgs = basicSetCompositePartOfDevice(newCompositePartOfDevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE, newCompositePartOfDevice,
				newCompositePartOfDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositePartOfDevice(CompositePartOfDevice newCompositePartOfDevice) {
		if (newCompositePartOfDevice != compositePartOfDevice) {
			NotificationChain msgs = null;
			if (compositePartOfDevice != null)
				msgs = ((InternalEObject) compositePartOfDevice).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE, null, msgs);
			if (newCompositePartOfDevice != null)
				msgs = ((InternalEObject) newCompositePartOfDevice).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE, null, msgs);
			msgs = basicSetCompositePartOfDevice(newCompositePartOfDevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE, newCompositePartOfDevice,
				newCompositePartOfDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevicePkgFile getDevicePkgFile() {
		return devicePkgFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevicePkgFile(DevicePkgFile newDevicePkgFile, NotificationChain msgs) {
		DevicePkgFile oldDevicePkgFile = devicePkgFile;
		devicePkgFile = newDevicePkgFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE,
				oldDevicePkgFile, newDevicePkgFile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevicePkgFile(DevicePkgFile newDevicePkgFile) {
		if (newDevicePkgFile != devicePkgFile) {
			NotificationChain msgs = null;
			if (devicePkgFile != null)
				msgs = ((InternalEObject) devicePkgFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE,
					null, msgs);
			if (newDevicePkgFile != null)
				msgs = ((InternalEObject) newDevicePkgFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE,
					null, msgs);
			msgs = basicSetDevicePkgFile(newDevicePkgFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE, newDevicePkgFile, newDevicePkgFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DcdComponentInstantiation getParentDevice() {
		DcdComponentInstantiation parentDevice = basicGetParentDevice();
		return parentDevice != null && parentDevice.eIsProxy() ? (DcdComponentInstantiation) eResolveProxy((InternalEObject) parentDevice) : parentDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DcdComponentInstantiation basicGetParentDevice() {
		// END GENERATED CODE
		DcdComponentInstantiation retVal = null;
		if (getCompositePartOfDevice() != null) {
			retVal = getCompositePartOfDevice().getComponent();
		}
		return retVal;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setParentDevice(DcdComponentInstantiation newParentDevice) {
		// END GENERATED CODE
		if (newParentDevice != null) {
			CompositePartOfDevice cpd = DcdFactory.eINSTANCE.createCompositePartOfDevice();
			cpd.setComponent(newParentDevice);
			setCompositePartOfDevice(cpd);
		} else {
			setCompositePartOfDevice(null);
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE:
			return basicSetDeployDevice(null, msgs);
		case DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE:
			return basicSetCompositePartOfDevice(null, msgs);
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE:
			return basicSetDevicePkgFile(null, msgs);
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
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE:
			return getDeployDevice();
		case DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE:
			return getCompositePartOfDevice();
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE:
			return getDevicePkgFile();
		case DcdPackage.DCD_COMPONENT_PLACEMENT__PARENT_DEVICE:
			if (resolve)
				return getParentDevice();
			return basicGetParentDevice();
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
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE:
			setDeployDevice((DeployOnDevice) newValue);
			return;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE:
			setCompositePartOfDevice((CompositePartOfDevice) newValue);
			return;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE:
			setDevicePkgFile((DevicePkgFile) newValue);
			return;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__PARENT_DEVICE:
			setParentDevice((DcdComponentInstantiation) newValue);
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
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE:
			setDeployDevice((DeployOnDevice) null);
			return;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE:
			setCompositePartOfDevice((CompositePartOfDevice) null);
			return;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE:
			setDevicePkgFile((DevicePkgFile) null);
			return;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__PARENT_DEVICE:
			setParentDevice((DcdComponentInstantiation) null);
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
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEPLOY_DEVICE:
			return deployDevice != null;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__COMPOSITE_PART_OF_DEVICE:
			return compositePartOfDevice != null;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__DEVICE_PKG_FILE:
			return devicePkgFile != null;
		case DcdPackage.DCD_COMPONENT_PLACEMENT__PARENT_DEVICE:
			return basicGetParentDevice() != null;
		}
		return super.eIsSet(featureID);
	}

} //DcdComponentPlacementImpl

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
package mil.jpeojtrs.sca.dcd;

import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDeployDevice <em>Deploy Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getCompositePartOfDevice <em>Composite Part Of Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDevicePkgFile <em>Device Pkg File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice <em>Parent Device</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentPlacement()
 * @model extendedMetaData="name='componentplacement' kind='elementOnly'"
 * @generated
 */
public interface DcdComponentPlacement extends ComponentPlacement<DcdComponentInstantiation> {

	/**
	 * Returns the value of the '<em><b>Deploy Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional deployondevice element indicates the device on which the componentinstantiation
	 * element is deployed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Device</em>' containment reference.
	 * @see #setDeployDevice(DeployOnDevice)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentPlacement_DeployDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deployondevice'"
	 * @generated
	 */
	DeployOnDevice getDeployDevice();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDeployDevice <em>Deploy Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Device</em>' containment reference.
	 * @see #getDeployDevice()
	 * @generated
	 */
	void setDeployDevice(DeployOnDevice value);

	/**
	 * Returns the value of the '<em><b>Composite Part Of Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional compositepartofdevice element indicates the device that the
	 * componentinstantiation element is aggregated with to form an aggregate relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Part Of Device</em>' containment reference.
	 * @see #setCompositePartOfDevice(CompositePartOfDevice)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentPlacement_CompositePartOfDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compositepartofdevice'"
	 * @generated
	 */
	CompositePartOfDevice getCompositePartOfDevice();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getCompositePartOfDevice <em>Composite Part Of Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Part Of Device</em>' containment reference.
	 * @see #getCompositePartOfDevice()
	 * @generated
	 */
	void setCompositePartOfDevice(CompositePartOfDevice value);

	/**
	 * Returns the value of the '<em><b>Device Pkg File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the
	 * component is a logical Device, the devicepkgfile element indicates the hardware device
	 * information for the logical Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Pkg File</em>' containment reference.
	 * @see #setDevicePkgFile(DevicePkgFile)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentPlacement_DevicePkgFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devicepkgfile'"
	 * @generated
	 */
	DevicePkgFile getDevicePkgFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getDevicePkgFile <em>Device Pkg File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Pkg File</em>' containment reference.
	 * @see #getDevicePkgFile()
	 * @generated
	 */
	void setDevicePkgFile(DevicePkgFile value);

	/**
	 * Returns the value of the '<em><b>Parent Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Device</em>' reference.
	 * @see #setParentDevice(DcdComponentInstantiation)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDcdComponentPlacement_ParentDevice()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='parentDevice'"
	 * @generated
	 */
	DcdComponentInstantiation getParentDevice();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice <em>Parent Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Device</em>' reference.
	 * @see #getParentDevice()
	 * @generated
	 */
	void setParentDevice(DcdComponentInstantiation value);

	public static final class Util {
		private Util() {

		}

		private static final EStructuralFeature[] PATH = new EStructuralFeature[] { PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_FILE_REF,
			PartitioningPackage.Literals.COMPONENT_FILE_REF__FILE, PartitioningPackage.Literals.COMPONENT_FILE__SOFT_PKG };

		public static boolean isAggregateDevice(DcdComponentPlacement cp) {
			return SoftPkg.Util.isAggregateDevice((SoftPkg) ScaEcoreUtils.getFeature(cp, PATH));
		}
	}

} // DcdComponentPlacement

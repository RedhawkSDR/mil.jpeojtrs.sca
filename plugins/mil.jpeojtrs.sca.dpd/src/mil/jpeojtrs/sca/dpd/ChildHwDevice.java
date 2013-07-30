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
package mil.jpeojtrs.sca.dpd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Hw Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The childhwdevice element (see Figure D-10) indicates additional device-specific information
 * for hardware devices that make up the root or parent hardware device registration. An example
 * of childhwdevice would be a radio's RF module that has receiver and exciter functions within it.
 * In this case, a CF Device representing the RF module itself would be a parent Device with its
 * DPD, and the receiver and exciter are child devices to the module. The parent / child
 * relationship indicates that when the RF module is removed from the system, the receiver and
 * exciter devices are also removed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.ChildHwDevice#getHwDeviceRegistration <em>Hw Device Registration</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.ChildHwDevice#getDevicePkgRef <em>Device Pkg Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getChildHwDevice()
 * @model extendedMetaData="name='childhwdevice' kind='elementOnly'"
 * @generated
 */
public interface ChildHwDevice extends EObject {

	/**
	 * Returns the value of the '<em><b>Hw Device Registration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hwdeviceregistration element provides device-specific information for the child hardware
	 * device. See D.3.1.4 for definition of the hwdeviceregistration element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Device Registration</em>' containment reference.
	 * @see #setHwDeviceRegistration(HwDeviceRegistration)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getChildHwDevice_HwDeviceRegistration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hwdeviceregistration' namespace='##targetNamespace'"
	 * @generated
	 */
	HwDeviceRegistration getHwDeviceRegistration();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.ChildHwDevice#getHwDeviceRegistration <em>Hw Device Registration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Device Registration</em>' containment reference.
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	void setHwDeviceRegistration(HwDeviceRegistration value);

	/**
	 * Returns the value of the '<em><b>Device Pkg Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The devicepkgref element is used to indicate the local filename of a Device Package Descriptor
	 * file pointed to by Device Package Descriptor (e.g., a devicepkg within a devicepkg).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Pkg Ref</em>' containment reference.
	 * @see #setDevicePkgRef(DevicePkgRef)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getChildHwDevice_DevicePkgRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devicepkgref' namespace='##targetNamespace'"
	 * @generated
	 */
	DevicePkgRef getDevicePkgRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.ChildHwDevice#getDevicePkgRef <em>Device Pkg Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Pkg Ref</em>' containment reference.
	 * @see #getDevicePkgRef()
	 * @generated
	 */
	void setDevicePkgRef(DevicePkgRef value);

} // ChildHwDevice

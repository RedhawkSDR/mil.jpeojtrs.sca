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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Device Registration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * At a minimum, the hwdeviceregistration
 * element must include a description, the manufacturer, the model number and the device's
 * hardware class(es) (Refer to SCA section 4, Hardware Architecture Definition).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDeviceClass <em>Device Class</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getChildHwDevice <em>Child Hw Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration()
 * @model extendedMetaData="name='hwdeviceregistration' kind='elementOnly'"
 * @generated
 */
public interface HwDeviceRegistration extends EObject {

	/**
	 * Returns the value of the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The propertyfile element is used to indicate the local filename of the property file associated with
	 * the hwdeviceregistration element. The format of a property file is described in the Properties
	 * Descriptor (Section D.4).
	 * 
	 * The intent of the property file is to provide the definition of properties elements for the hardware
	 * device being deployed and described in the Device Package (devicepkg) or hwdeviceregistration
	 * element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property File</em>' containment reference.
	 * @see #setPropertyFile(PropertyFile)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_PropertyFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyfile' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyFile getPropertyFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getPropertyFile <em>Property File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property File</em>' containment reference.
	 * @see #getPropertyFile()
	 * @generated
	 */
	void setPropertyFile(PropertyFile value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See D.2.1.4 for definition of the description element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufacturer element is used to convey the name of manufacturer of the device being
	 * installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_Manufacturer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modelnumber element is used to indicate the manufacture's model number, for the device
	 * being installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Number</em>' attribute.
	 * @see #setModelNumber(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_ModelNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='modelnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelNumber();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getModelNumber <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' attribute.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(String value);

	/**
	 * Returns the value of the '<em><b>Device Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Class</em>' containment reference.
	 * @see #setDeviceClass(DeviceClass)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_DeviceClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceclass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceClass getDeviceClass();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDeviceClass <em>Device Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Class</em>' containment reference.
	 * @see #getDeviceClass()
	 * @generated
	 */
	void setDeviceClass(DeviceClass value);

	/**
	 * Returns the value of the '<em><b>Child Hw Device</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.dpd.ChildHwDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Hw Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Hw Device</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_ChildHwDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='childhwdevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChildHwDevice> getChildHwDevice();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hwdeviceregistration id attribute uniquely identifies the device and is a
	 * DCE UUID, as defined in paragraph D.2.1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name attribute is a userfriendlylabel
	 * for the hardware device being registered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version attribute specifies the version of the
	 * hwdeviceregistration element. The format of the version string is numerical major and minor
	 * version numbers separated by commas (e.g., \"1,0,0,0\").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getHwDeviceRegistration_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // HwDeviceRegistration

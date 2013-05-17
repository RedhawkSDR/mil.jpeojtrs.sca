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
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DEVICE PACKAGE 
 * The SCA Device Package Descriptor (DPD) is the part of a Device Profile that contains
 * hardware device Registration attributes, which are typically used by a Human Computer
 * Interface application to display information about the device(s) resident in an SCA-compliant
 * radio system. DPD information is intended to provide hardware configuration and revision
 * information to a radio operator or to radio maintenance personnel. A DPD may be used to
 * describe a single hardware element residing in a radio or it may be used to describe the complete
 * hardware structure of a radio. In either case, the description of the hardware structure should be
 * consistent with hardware partitioning as described in the Hardware Architecture Definition in
 * section 4.0 of the SCA.
 * 
 * The devicepkg element (see Figure D-8) is the root element of the DPD.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getTitle <em>Title</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getAuthor <em>Author</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getHwDeviceRegistration <em>Hw Device Registration</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DevicePkg#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg()
 * @model extendedMetaData="name='devicepkg' kind='elementOnly'"
 * @generated
 */
public interface DevicePkg extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title element is used for indicating a title for the hardware device being described by
	 * devicepkg.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.dpd.Author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See D.2.1.3 for a definition of the author element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Author> getAuthor();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description element is used to describe any pertinent information about the device
	 * implementation that the hardware developer wishes to document within the Device Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Hw Device Registration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hwdeviceregistration element (see Figure D-9) provides device-specific information for a
	 * hardware device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hw Device Registration</em>' containment reference.
	 * @see #setHwDeviceRegistration(HwDeviceRegistration)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_HwDeviceRegistration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hwdeviceregistration' namespace='##targetNamespace'"
	 * @generated
	 */
	HwDeviceRegistration getHwDeviceRegistration();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getHwDeviceRegistration <em>Hw Device Registration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Device Registration</em>' containment reference.
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	void setHwDeviceRegistration(HwDeviceRegistration value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The devicepkg id
	 * attribute uniquely identifies the package and is a DCE UUID, as defined in paragraph D.2.1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getId <em>Id</em>}' attribute.
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
	 * The name
	 * attribute is a user-friendly label for the devicepkg.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getName <em>Name</em>}' attribute.
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
	 * The
	 * version attribute specifies the version of the devicepkg.
	 * 
	 * The format of the version string is
	 * numerical major and minor version numbers separated by commas (e.g., \"1,0,0,0\").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDevicePkg_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	public static class Util {
		// END GENERATED CODE
		private Util() {
			
		}
		public static DevicePkg getDevicePkg(Resource resource) {
			if (resource == null) {
				return null;
			}
			EObject obj = resource.getEObject(DevicePkg.EOBJECT_PATH);
			if (obj instanceof DocumentRoot) {
				return ((DocumentRoot) obj).getDevicepkg();
			} else if (obj instanceof DevicePkg) {
				return (DevicePkg) obj;
			} else {
				throw new IllegalArgumentException(resource + " is not a valid dpd resource.");
			}
		}
		// BEGIN GENERATED CODE
	}

	String EOBJECT_PATH = "/";

} // DevicePkg

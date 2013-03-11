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
package mil.jpeojtrs.sca.dpd;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getAuthor <em>Author</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getChildhwdevice <em>Childhwdevice</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getClass_ <em>Class</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getCompany <em>Company</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDeviceclass <em>Deviceclass</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkg <em>Devicepkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkgref <em>Devicepkgref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getHwdeviceregistration <em>Hwdeviceregistration</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getLocalfile <em>Localfile</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getModelnumber <em>Modelnumber</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getPropertyfile <em>Propertyfile</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getWebpage <em>Webpage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Author)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Author()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Author getAuthor();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Author value);

	/**
	 * Returns the value of the '<em><b>Childhwdevice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childhwdevice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childhwdevice</em>' containment reference.
	 * @see #setChildhwdevice(ChildHwDevice)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Childhwdevice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='childhwdevice' namespace='##targetNamespace'"
	 * @generated
	 */
	ChildHwDevice getChildhwdevice();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getChildhwdevice <em>Childhwdevice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Childhwdevice</em>' containment reference.
	 * @see #getChildhwdevice()
	 * @generated
	 */
	void setChildhwdevice(ChildHwDevice value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Class()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Company()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='company' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Deviceclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviceclass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceclass</em>' containment reference.
	 * @see #setDeviceclass(DeviceClass)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Deviceclass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deviceclass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceClass getDeviceclass();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDeviceclass <em>Deviceclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviceclass</em>' containment reference.
	 * @see #getDeviceclass()
	 * @generated
	 */
	void setDeviceclass(DeviceClass value);

	/**
	 * Returns the value of the '<em><b>Devicepkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicepkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicepkg</em>' containment reference.
	 * @see #setDevicepkg(DevicePkg)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Devicepkg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='devicepkg' namespace='##targetNamespace'"
	 * @generated
	 */
	DevicePkg getDevicepkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkg <em>Devicepkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devicepkg</em>' containment reference.
	 * @see #getDevicepkg()
	 * @generated
	 */
	void setDevicepkg(DevicePkg value);

	/**
	 * Returns the value of the '<em><b>Devicepkgref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicepkgref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicepkgref</em>' containment reference.
	 * @see #setDevicepkgref(DevicePkgRef)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Devicepkgref()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='devicepkgref' namespace='##targetNamespace'"
	 * @generated
	 */
	DevicePkgRef getDevicepkgref();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkgref <em>Devicepkgref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devicepkgref</em>' containment reference.
	 * @see #getDevicepkgref()
	 * @generated
	 */
	void setDevicepkgref(DevicePkgRef value);

	/**
	 * Returns the value of the '<em><b>Hwdeviceregistration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwdeviceregistration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hwdeviceregistration</em>' containment reference.
	 * @see #setHwdeviceregistration(HwDeviceRegistration)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Hwdeviceregistration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hwdeviceregistration' namespace='##targetNamespace'"
	 * @generated
	 */
	HwDeviceRegistration getHwdeviceregistration();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getHwdeviceregistration <em>Hwdeviceregistration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwdeviceregistration</em>' containment reference.
	 * @see #getHwdeviceregistration()
	 * @generated
	 */
	void setHwdeviceregistration(HwDeviceRegistration value);

	/**
	 * Returns the value of the '<em><b>Localfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localfile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localfile</em>' containment reference.
	 * @see #setLocalfile(LocalFile)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Localfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='localfile' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalFile getLocalfile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getLocalfile <em>Localfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localfile</em>' containment reference.
	 * @see #getLocalfile()
	 * @generated
	 */
	void setLocalfile(LocalFile value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Manufacturer()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Modelnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelnumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelnumber</em>' attribute.
	 * @see #setModelnumber(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Modelnumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='modelnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelnumber();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getModelnumber <em>Modelnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelnumber</em>' attribute.
	 * @see #getModelnumber()
	 * @generated
	 */
	void setModelnumber(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Propertyfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propertyfile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propertyfile</em>' containment reference.
	 * @see #setPropertyfile(PropertyFile)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Propertyfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertyfile' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyFile getPropertyfile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getPropertyfile <em>Propertyfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propertyfile</em>' containment reference.
	 * @see #getPropertyfile()
	 * @generated
	 */
	void setPropertyfile(PropertyFile value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webpage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' attribute.
	 * @see #setWebpage(String)
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#getDocumentRoot_Webpage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='webpage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebpage();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getWebpage <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' attribute.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(String value);

} // DocumentRoot

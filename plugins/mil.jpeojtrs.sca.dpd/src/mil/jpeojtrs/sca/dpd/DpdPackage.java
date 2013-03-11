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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> DEVICE PACKAGE DESCRIPTOR. The
 * SCA Device Package Descriptor (DPD) is the part of a Device Profile that
 * contains hardware device Registration attributes, which are typically used by
 * a Human Computer Interface application to display information about the
 * device(s) resident in an SCA-compliant radio system. DPD information is
 * intended to provide hardware configuration and revision information to a
 * radio operator or to radio maintenance personnel. A DPD may be used to
 * describe a single hardware element residing in a radio or it may be used to
 * describe the complete hardware structure of a radio. In either case, the
 * description of the hardware structure should be consistent with hardware
 * partitioning as described in the Hardware Architecture Definition in section
 * 4.0 of the SCA. <!-- end-model-doc -->
 * 
 * @see mil.jpeojtrs.sca.dpd.DpdFactory
 * @model kind="package"
 * @generated
 */
public interface DpdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dpd";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/dpd";
	String FILE_EXTENSION = ".dpd.xml";
	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	String eNS_PREFIX = "";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.dpd.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DpdPackage eINSTANCE = mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.AuthorImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 0;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;
	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__COMPANY = 1;
	/**
	 * The feature id for the '<em><b>Webpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__WEBPAGE = 2;
	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.ChildHwDeviceImpl <em>Child Hw Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.ChildHwDeviceImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getChildHwDevice()
	 * @generated
	 */
	int CHILD_HW_DEVICE = 1;
	/**
	 * The feature id for the '<em><b>Hw Device Registration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION = 0;
	/**
	 * The feature id for the '<em><b>Device Pkg Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_HW_DEVICE__DEVICE_PKG_REF = 1;
	/**
	 * The number of structural features of the '<em>Child Hw Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_HW_DEVICE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.DeviceClassImpl <em>Device Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.DeviceClassImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDeviceClass()
	 * @generated
	 */
	int DEVICE_CLASS = 2;
	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CLASS__CLASS = 0;
	/**
	 * The number of structural features of the '<em>Device Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CLASS_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl <em>Device Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDevicePkg()
	 * @generated
	 */
	int DEVICE_PKG = 3;
	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__TITLE = 0;
	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__AUTHOR = 1;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__DESCRIPTION = 2;
	/**
	 * The feature id for the '<em><b>Hw Device Registration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__HW_DEVICE_REGISTRATION = 3;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__ID = 4;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__NAME = 5;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG__VERSION = 6;
	/**
	 * The number of structural features of the '<em>Device Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_FEATURE_COUNT = 7;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgRefImpl <em>Device Pkg Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.DevicePkgRefImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDevicePkgRef()
	 * @generated
	 */
	int DEVICE_PKG_REF = 4;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_REF__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_REF__TYPE = 1;
	/**
	 * The number of structural features of the '<em>Device Pkg Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PKG_REF_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHOR = 3;
	/**
	 * The feature id for the '<em><b>Childhwdevice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHILDHWDEVICE = 4;
	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 5;
	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY = 6;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 7;
	/**
	 * The feature id for the '<em><b>Deviceclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEVICECLASS = 8;
	/**
	 * The feature id for the '<em><b>Devicepkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEVICEPKG = 9;
	/**
	 * The feature id for the '<em><b>Devicepkgref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEVICEPKGREF = 10;
	/**
	 * The feature id for the '<em><b>Hwdeviceregistration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HWDEVICEREGISTRATION = 11;
	/**
	 * The feature id for the '<em><b>Localfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALFILE = 12;
	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MANUFACTURER = 13;
	/**
	 * The feature id for the '<em><b>Modelnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODELNUMBER = 14;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 15;
	/**
	 * The feature id for the '<em><b>Propertyfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTYFILE = 16;
	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 17;
	/**
	 * The feature id for the '<em><b>Webpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBPAGE = 18;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 19;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl <em>Hw Device Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getHwDeviceRegistration()
	 * @generated
	 */
	int HW_DEVICE_REGISTRATION = 6;
	/**
	 * The feature id for the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__PROPERTY_FILE = 0;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__DESCRIPTION = 1;
	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__MANUFACTURER = 2;
	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__MODEL_NUMBER = 3;
	/**
	 * The feature id for the '<em><b>Device Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__DEVICE_CLASS = 4;
	/**
	 * The feature id for the '<em><b>Child Hw Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE = 5;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__ID = 6;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__NAME = 7;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION__VERSION = 8;
	/**
	 * The number of structural features of the '<em>Hw Device Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_REGISTRATION_FEATURE_COUNT = 9;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.LocalFileImpl <em>Local File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.LocalFileImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getLocalFile()
	 * @generated
	 */
	int LOCAL_FILE = 7;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FILE__NAME = 0;
	/**
	 * The number of structural features of the '<em>Local File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FILE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.dpd.impl.PropertyFileImpl <em>Property File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.impl.PropertyFileImpl
	 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getPropertyFile()
	 * @generated
	 */
	int PROPERTY_FILE = 8;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__TYPE = 1;
	/**
	 * The number of structural features of the '<em>Property File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see mil.jpeojtrs.sca.dpd.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.dpd.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dpd.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.Author#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see mil.jpeojtrs.sca.dpd.Author#getCompany()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Company();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.Author#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webpage</em>'.
	 * @see mil.jpeojtrs.sca.dpd.Author#getWebpage()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Webpage();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.ChildHwDevice <em>Child Hw Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Hw Device</em>'.
	 * @see mil.jpeojtrs.sca.dpd.ChildHwDevice
	 * @generated
	 */
	EClass getChildHwDevice();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.ChildHwDevice#getHwDeviceRegistration <em>Hw Device Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Device Registration</em>'.
	 * @see mil.jpeojtrs.sca.dpd.ChildHwDevice#getHwDeviceRegistration()
	 * @see #getChildHwDevice()
	 * @generated
	 */
	EReference getChildHwDevice_HwDeviceRegistration();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.ChildHwDevice#getDevicePkgRef <em>Device Pkg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Pkg Ref</em>'.
	 * @see mil.jpeojtrs.sca.dpd.ChildHwDevice#getDevicePkgRef()
	 * @see #getChildHwDevice()
	 * @generated
	 */
	EReference getChildHwDevice_DevicePkgRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.DeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Class</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DeviceClass
	 * @generated
	 */
	EClass getDeviceClass();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.dpd.DeviceClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DeviceClass#getClass_()
	 * @see #getDeviceClass()
	 * @generated
	 */
	EAttribute getDeviceClass_Class();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.DevicePkg <em>Device Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Pkg</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg
	 * @generated
	 */
	EClass getDevicePkg();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getTitle()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EAttribute getDevicePkg_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getAuthor()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EReference getDevicePkg_Author();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getDescription()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EAttribute getDevicePkg_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getHwDeviceRegistration <em>Hw Device Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Device Registration</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getHwDeviceRegistration()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EReference getDevicePkg_HwDeviceRegistration();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getId()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EAttribute getDevicePkg_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getName()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EAttribute getDevicePkg_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DevicePkg#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg#getVersion()
	 * @see #getDevicePkg()
	 * @generated
	 */
	EAttribute getDevicePkg_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef <em>Device Pkg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Pkg Ref</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkgRef
	 * @generated
	 */
	EClass getDevicePkgRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkgRef#getLocalFile()
	 * @see #getDevicePkgRef()
	 * @generated
	 */
	EReference getDevicePkgRef_LocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkgRef#getType()
	 * @see #getDevicePkgRef()
	 * @generated
	 */
	EAttribute getDevicePkgRef_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getAuthor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Author();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getChildhwdevice <em>Childhwdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Childhwdevice</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getChildhwdevice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Childhwdevice();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Class();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getCompany()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Company();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDeviceclass <em>Deviceclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviceclass</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getDeviceclass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Deviceclass();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkg <em>Devicepkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devicepkg</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Devicepkg();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkgref <em>Devicepkgref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devicepkgref</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getDevicepkgref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Devicepkgref();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getHwdeviceregistration <em>Hwdeviceregistration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hwdeviceregistration</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getHwdeviceregistration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Hwdeviceregistration();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getLocalfile <em>Localfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localfile</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getLocalfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Localfile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getManufacturer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getModelnumber <em>Modelnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelnumber</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getModelnumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Modelnumber();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getPropertyfile <em>Propertyfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propertyfile</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getPropertyfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Propertyfile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.DocumentRoot#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webpage</em>'.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot#getWebpage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Webpage();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration <em>Hw Device Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Device Registration</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration
	 * @generated
	 */
	EClass getHwDeviceRegistration();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getPropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getPropertyFile()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EReference getHwDeviceRegistration_PropertyFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDescription()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EAttribute getHwDeviceRegistration_Description();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getManufacturer()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EAttribute getHwDeviceRegistration_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getModelNumber <em>Model Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Number</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getModelNumber()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EAttribute getHwDeviceRegistration_ModelNumber();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Class</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getDeviceClass()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EReference getHwDeviceRegistration_DeviceClass();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getChildHwDevice <em>Child Hw Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Hw Device</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getChildHwDevice()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EReference getHwDeviceRegistration_ChildHwDevice();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getId()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EAttribute getHwDeviceRegistration_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getName()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EAttribute getHwDeviceRegistration_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration#getVersion()
	 * @see #getHwDeviceRegistration()
	 * @generated
	 */
	EAttribute getHwDeviceRegistration_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dpd.LocalFile
	 * @generated
	 */
	EClass getLocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.LocalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.dpd.LocalFile#getName()
	 * @see #getLocalFile()
	 * @generated
	 */
	EAttribute getLocalFile_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.dpd.PropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.dpd.PropertyFile
	 * @generated
	 */
	EClass getPropertyFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.dpd.PropertyFile#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.dpd.PropertyFile#getLocalFile()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EReference getPropertyFile_LocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.dpd.PropertyFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.dpd.PropertyFile#getType()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EAttribute getPropertyFile_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DpdFactory getDpdFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.AuthorImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();
		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__COMPANY = eINSTANCE.getAuthor_Company();
		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__WEBPAGE = eINSTANCE.getAuthor_Webpage();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.ChildHwDeviceImpl <em>Child Hw Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.ChildHwDeviceImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getChildHwDevice()
		 * @generated
		 */
		EClass CHILD_HW_DEVICE = eINSTANCE.getChildHwDevice();
		/**
		 * The meta object literal for the '<em><b>Hw Device Registration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION = eINSTANCE.getChildHwDevice_HwDeviceRegistration();
		/**
		 * The meta object literal for the '<em><b>Device Pkg Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_HW_DEVICE__DEVICE_PKG_REF = eINSTANCE.getChildHwDevice_DevicePkgRef();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.DeviceClassImpl <em>Device Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.DeviceClassImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDeviceClass()
		 * @generated
		 */
		EClass DEVICE_CLASS = eINSTANCE.getDeviceClass();
		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CLASS__CLASS = eINSTANCE.getDeviceClass_Class();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl <em>Device Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.DevicePkgImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDevicePkg()
		 * @generated
		 */
		EClass DEVICE_PKG = eINSTANCE.getDevicePkg();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG__TITLE = eINSTANCE.getDevicePkg_Title();
		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PKG__AUTHOR = eINSTANCE.getDevicePkg_Author();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG__DESCRIPTION = eINSTANCE.getDevicePkg_Description();
		/**
		 * The meta object literal for the '<em><b>Hw Device Registration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PKG__HW_DEVICE_REGISTRATION = eINSTANCE.getDevicePkg_HwDeviceRegistration();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG__ID = eINSTANCE.getDevicePkg_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG__NAME = eINSTANCE.getDevicePkg_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG__VERSION = eINSTANCE.getDevicePkg_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.DevicePkgRefImpl <em>Device Pkg Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.DevicePkgRefImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDevicePkgRef()
		 * @generated
		 */
		EClass DEVICE_PKG_REF = eINSTANCE.getDevicePkgRef();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PKG_REF__LOCAL_FILE = eINSTANCE.getDevicePkgRef_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PKG_REF__TYPE = eINSTANCE.getDevicePkgRef_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.DocumentRootImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();
		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();
		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();
		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();
		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHOR = eINSTANCE.getDocumentRoot_Author();
		/**
		 * The meta object literal for the '<em><b>Childhwdevice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHILDHWDEVICE = eINSTANCE.getDocumentRoot_Childhwdevice();
		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLASS = eINSTANCE.getDocumentRoot_Class();
		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMPANY = eINSTANCE.getDocumentRoot_Company();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();
		/**
		 * The meta object literal for the '<em><b>Deviceclass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEVICECLASS = eINSTANCE.getDocumentRoot_Deviceclass();
		/**
		 * The meta object literal for the '<em><b>Devicepkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEVICEPKG = eINSTANCE.getDocumentRoot_Devicepkg();
		/**
		 * The meta object literal for the '<em><b>Devicepkgref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEVICEPKGREF = eINSTANCE.getDocumentRoot_Devicepkgref();
		/**
		 * The meta object literal for the '<em><b>Hwdeviceregistration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HWDEVICEREGISTRATION = eINSTANCE.getDocumentRoot_Hwdeviceregistration();
		/**
		 * The meta object literal for the '<em><b>Localfile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCALFILE = eINSTANCE.getDocumentRoot_Localfile();
		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MANUFACTURER = eINSTANCE.getDocumentRoot_Manufacturer();
		/**
		 * The meta object literal for the '<em><b>Modelnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MODELNUMBER = eINSTANCE.getDocumentRoot_Modelnumber();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();
		/**
		 * The meta object literal for the '<em><b>Propertyfile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTYFILE = eINSTANCE.getDocumentRoot_Propertyfile();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();
		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WEBPAGE = eINSTANCE.getDocumentRoot_Webpage();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl <em>Hw Device Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.HwDeviceRegistrationImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getHwDeviceRegistration()
		 * @generated
		 */
		EClass HW_DEVICE_REGISTRATION = eINSTANCE.getHwDeviceRegistration();
		/**
		 * The meta object literal for the '<em><b>Property File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE_REGISTRATION__PROPERTY_FILE = eINSTANCE.getHwDeviceRegistration_PropertyFile();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_DEVICE_REGISTRATION__DESCRIPTION = eINSTANCE.getHwDeviceRegistration_Description();
		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_DEVICE_REGISTRATION__MANUFACTURER = eINSTANCE.getHwDeviceRegistration_Manufacturer();
		/**
		 * The meta object literal for the '<em><b>Model Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_DEVICE_REGISTRATION__MODEL_NUMBER = eINSTANCE.getHwDeviceRegistration_ModelNumber();
		/**
		 * The meta object literal for the '<em><b>Device Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE_REGISTRATION__DEVICE_CLASS = eINSTANCE.getHwDeviceRegistration_DeviceClass();
		/**
		 * The meta object literal for the '<em><b>Child Hw Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE = eINSTANCE.getHwDeviceRegistration_ChildHwDevice();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_DEVICE_REGISTRATION__ID = eINSTANCE.getHwDeviceRegistration_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_DEVICE_REGISTRATION__NAME = eINSTANCE.getHwDeviceRegistration_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_DEVICE_REGISTRATION__VERSION = eINSTANCE.getHwDeviceRegistration_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.LocalFileImpl <em>Local File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.LocalFileImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getLocalFile()
		 * @generated
		 */
		EClass LOCAL_FILE = eINSTANCE.getLocalFile();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_FILE__NAME = eINSTANCE.getLocalFile_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.dpd.impl.PropertyFileImpl <em>Property File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.dpd.impl.PropertyFileImpl
		 * @see mil.jpeojtrs.sca.dpd.impl.DpdPackageImpl#getPropertyFile()
		 * @generated
		 */
		EClass PROPERTY_FILE = eINSTANCE.getPropertyFile();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE__LOCAL_FILE = eINSTANCE.getPropertyFile_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILE__TYPE = eINSTANCE.getPropertyFile_Type();

	}

} // DpdPackage

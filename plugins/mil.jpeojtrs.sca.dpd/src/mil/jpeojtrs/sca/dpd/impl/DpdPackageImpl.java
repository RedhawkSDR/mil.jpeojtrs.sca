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
package mil.jpeojtrs.sca.dpd.impl;

import mil.jpeojtrs.sca.dpd.Author;
import mil.jpeojtrs.sca.dpd.ChildHwDevice;
import mil.jpeojtrs.sca.dpd.DeviceClass;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DevicePkgRef;
import mil.jpeojtrs.sca.dpd.DocumentRoot;
import mil.jpeojtrs.sca.dpd.DpdFactory;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;
import mil.jpeojtrs.sca.dpd.LocalFile;
import mil.jpeojtrs.sca.dpd.PropertyFile;
import mil.jpeojtrs.sca.validator.AdvancedEObjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DpdPackageImpl extends EPackageImpl implements DpdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childHwDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePkgEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePkgRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwDeviceRegistrationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mil.jpeojtrs.sca.dpd.DpdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DpdPackageImpl() {
		super(eNS_URI, DpdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DpdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DpdPackage initGen() {
		if (isInited) return (DpdPackage)EPackage.Registry.INSTANCE.getEPackage(DpdPackage.eNS_URI);

		// Obtain or create and register package
		DpdPackageImpl theDpdPackage = (DpdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DpdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DpdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDpdPackage.createPackageContents();

		// Initialize created meta-data
		theDpdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDpdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DpdPackage.eNS_URI, theDpdPackage);
		return theDpdPackage;
	}

	public static DpdPackage init() {
		final DpdPackage retVal = DpdPackageImpl.initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			AdvancedEObjectValidator validator = new AdvancedEObjectValidator();
			public EValidator getEValidator() {
				return this.validator;
			}
		});

		return retVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Name() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Company() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Webpage() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildHwDevice() {
		return childHwDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildHwDevice_HwDeviceRegistration() {
		return (EReference)childHwDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildHwDevice_DevicePkgRef() {
		return (EReference)childHwDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceClass() {
		return deviceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceClass_Class() {
		return (EAttribute)deviceClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevicePkg() {
		return devicePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicePkg_Title() {
		return (EAttribute)devicePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicePkg_Author() {
		return (EReference)devicePkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicePkg_Description() {
		return (EAttribute)devicePkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicePkg_HwDeviceRegistration() {
		return (EReference)devicePkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicePkg_Id() {
		return (EAttribute)devicePkgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicePkg_Name() {
		return (EAttribute)devicePkgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicePkg_Version() {
		return (EAttribute)devicePkgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevicePkgRef() {
		return devicePkgRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicePkgRef_LocalFile() {
		return (EReference)devicePkgRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevicePkgRef_Type() {
		return (EAttribute)devicePkgRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Author() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Childhwdevice() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Class() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Company() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Description() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Deviceclass() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Devicepkg() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Devicepkgref() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Hwdeviceregistration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Localfile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Manufacturer() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Modelnumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Propertyfile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Webpage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwDeviceRegistration() {
		return hwDeviceRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDeviceRegistration_PropertyFile() {
		return (EReference)hwDeviceRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwDeviceRegistration_Description() {
		return (EAttribute)hwDeviceRegistrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwDeviceRegistration_Manufacturer() {
		return (EAttribute)hwDeviceRegistrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwDeviceRegistration_ModelNumber() {
		return (EAttribute)hwDeviceRegistrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDeviceRegistration_DeviceClass() {
		return (EReference)hwDeviceRegistrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDeviceRegistration_ChildHwDevice() {
		return (EReference)hwDeviceRegistrationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwDeviceRegistration_Id() {
		return (EAttribute)hwDeviceRegistrationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwDeviceRegistration_Name() {
		return (EAttribute)hwDeviceRegistrationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwDeviceRegistration_Version() {
		return (EAttribute)hwDeviceRegistrationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalFile() {
		return localFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalFile_Name() {
		return (EAttribute)localFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFile() {
		return propertyFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyFile_LocalFile() {
		return (EReference)propertyFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyFile_Type() {
		return (EAttribute)propertyFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpdFactory getDpdFactory() {
		return (DpdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__NAME);
		createEAttribute(authorEClass, AUTHOR__COMPANY);
		createEAttribute(authorEClass, AUTHOR__WEBPAGE);

		childHwDeviceEClass = createEClass(CHILD_HW_DEVICE);
		createEReference(childHwDeviceEClass, CHILD_HW_DEVICE__HW_DEVICE_REGISTRATION);
		createEReference(childHwDeviceEClass, CHILD_HW_DEVICE__DEVICE_PKG_REF);

		deviceClassEClass = createEClass(DEVICE_CLASS);
		createEAttribute(deviceClassEClass, DEVICE_CLASS__CLASS);

		devicePkgEClass = createEClass(DEVICE_PKG);
		createEAttribute(devicePkgEClass, DEVICE_PKG__TITLE);
		createEReference(devicePkgEClass, DEVICE_PKG__AUTHOR);
		createEAttribute(devicePkgEClass, DEVICE_PKG__DESCRIPTION);
		createEReference(devicePkgEClass, DEVICE_PKG__HW_DEVICE_REGISTRATION);
		createEAttribute(devicePkgEClass, DEVICE_PKG__ID);
		createEAttribute(devicePkgEClass, DEVICE_PKG__NAME);
		createEAttribute(devicePkgEClass, DEVICE_PKG__VERSION);

		devicePkgRefEClass = createEClass(DEVICE_PKG_REF);
		createEReference(devicePkgRefEClass, DEVICE_PKG_REF__LOCAL_FILE);
		createEAttribute(devicePkgRefEClass, DEVICE_PKG_REF__TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHILDHWDEVICE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLASS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMPANY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEVICECLASS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEVICEPKG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEVICEPKGREF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HWDEVICEREGISTRATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCALFILE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MANUFACTURER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MODELNUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTYFILE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WEBPAGE);

		hwDeviceRegistrationEClass = createEClass(HW_DEVICE_REGISTRATION);
		createEReference(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__PROPERTY_FILE);
		createEAttribute(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__DESCRIPTION);
		createEAttribute(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__MANUFACTURER);
		createEAttribute(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__MODEL_NUMBER);
		createEReference(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__DEVICE_CLASS);
		createEReference(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__CHILD_HW_DEVICE);
		createEAttribute(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__ID);
		createEAttribute(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__NAME);
		createEAttribute(hwDeviceRegistrationEClass, HW_DEVICE_REGISTRATION__VERSION);

		localFileEClass = createEClass(LOCAL_FILE);
		createEAttribute(localFileEClass, LOCAL_FILE__NAME);

		propertyFileEClass = createEClass(PROPERTY_FILE);
		createEReference(propertyFileEClass, PROPERTY_FILE__LOCAL_FILE);
		createEAttribute(propertyFileEClass, PROPERTY_FILE__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_Name(), theXMLTypePackage.getString(), "name", null, 0, -1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Company(), theXMLTypePackage.getString(), "company", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Webpage(), theXMLTypePackage.getAnyURI(), "webpage", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childHwDeviceEClass, ChildHwDevice.class, "ChildHwDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildHwDevice_HwDeviceRegistration(), this.getHwDeviceRegistration(), null, "hwDeviceRegistration", null, 0, 1, ChildHwDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildHwDevice_DevicePkgRef(), this.getDevicePkgRef(), null, "devicePkgRef", null, 0, 1, ChildHwDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceClassEClass, DeviceClass.class, "DeviceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceClass_Class(), theXMLTypePackage.getString(), "class", null, 1, -1, DeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devicePkgEClass, DevicePkg.class, "DevicePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevicePkg_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevicePkg_Author(), this.getAuthor(), null, "author", null, 1, -1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevicePkg_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevicePkg_HwDeviceRegistration(), this.getHwDeviceRegistration(), null, "hwDeviceRegistration", null, 1, 1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevicePkg_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevicePkg_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevicePkg_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, DevicePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devicePkgRefEClass, DevicePkgRef.class, "DevicePkgRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevicePkgRef_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, DevicePkgRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevicePkgRef_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, DevicePkgRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Author(), this.getAuthor(), null, "author", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Childhwdevice(), this.getChildHwDevice(), null, "childhwdevice", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Class(), theXMLTypePackage.getString(), "class", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Company(), theXMLTypePackage.getString(), "company", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Description(), theXMLTypePackage.getString(), "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Deviceclass(), this.getDeviceClass(), null, "deviceclass", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Devicepkg(), this.getDevicePkg(), null, "devicepkg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Devicepkgref(), this.getDevicePkgRef(), null, "devicepkgref", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Hwdeviceregistration(), this.getHwDeviceRegistration(), null, "hwdeviceregistration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Localfile(), this.getLocalFile(), null, "localfile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Manufacturer(), theXMLTypePackage.getString(), "manufacturer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Modelnumber(), theXMLTypePackage.getString(), "modelnumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theXMLTypePackage.getString(), "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Propertyfile(), this.getPropertyFile(), null, "propertyfile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Webpage(), theXMLTypePackage.getAnyURI(), "webpage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hwDeviceRegistrationEClass, HwDeviceRegistration.class, "HwDeviceRegistration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwDeviceRegistration_PropertyFile(), this.getPropertyFile(), null, "propertyFile", null, 0, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwDeviceRegistration_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwDeviceRegistration_Manufacturer(), theXMLTypePackage.getString(), "manufacturer", null, 1, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwDeviceRegistration_ModelNumber(), theXMLTypePackage.getString(), "modelNumber", null, 1, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwDeviceRegistration_DeviceClass(), this.getDeviceClass(), null, "deviceClass", null, 1, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwDeviceRegistration_ChildHwDevice(), this.getChildHwDevice(), null, "childHwDevice", null, 0, -1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwDeviceRegistration_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwDeviceRegistration_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwDeviceRegistration_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, HwDeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localFileEClass, LocalFile.class, "LocalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalFile_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LocalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFileEClass, PropertyFile.class, "PropertyFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyFile_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyFile_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (authorEClass, 
		   source, 
		   new String[] {
			 "name", "author",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthor_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthor_Company(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "company",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthor_Webpage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "webpage",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (childHwDeviceEClass, 
		   source, 
		   new String[] {
			 "name", "childhwdevice",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getChildHwDevice_HwDeviceRegistration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hwdeviceregistration",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getChildHwDevice_DevicePkgRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "devicepkgref",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (deviceClassEClass, 
		   source, 
		   new String[] {
			 "name", "deviceclass",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeviceClass_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (devicePkgEClass, 
		   source, 
		   new String[] {
			 "name", "devicepkg",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDevicePkg_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDevicePkg_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDevicePkg_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDevicePkg_HwDeviceRegistration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hwdeviceregistration",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDevicePkg_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (getDevicePkg_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getDevicePkg_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (devicePkgRefEClass, 
		   source, 
		   new String[] {
			 "name", "devicepkgref",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDevicePkgRef_LocalFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDevicePkgRef_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Childhwdevice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "childhwdevice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Company(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "company",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Deviceclass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deviceclass",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Devicepkg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "devicepkg",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Devicepkgref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "devicepkgref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Hwdeviceregistration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hwdeviceregistration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Localfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Manufacturer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "manufacturer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Modelnumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modelnumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Propertyfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "propertyfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Webpage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "webpage",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (hwDeviceRegistrationEClass, 
		   source, 
		   new String[] {
			 "name", "hwdeviceregistration",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_PropertyFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "propertyfile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_Manufacturer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "manufacturer",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_ModelNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modelnumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHwDeviceRegistration_DeviceClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deviceclass",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHwDeviceRegistration_ChildHwDevice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "childhwdevice",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getHwDeviceRegistration_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (localFileEClass, 
		   source, 
		   new String[] {
			 "name", "localfile",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLocalFile_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (propertyFileEClass, 
		   source, 
		   new String[] {
			 "name", "propertyfile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPropertyFile_LocalFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "localfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyFile_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });
	}

} //DpdPackageImpl

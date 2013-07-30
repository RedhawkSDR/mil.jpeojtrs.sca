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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DpdFactoryImpl extends EFactoryImpl implements DpdFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DpdFactory init() {
		try {
			DpdFactory theDpdFactory = (DpdFactory)EPackage.Registry.INSTANCE.getEFactory(DpdPackage.eNS_URI);
			if (theDpdFactory != null) {
				return theDpdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DpdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DpdPackage.AUTHOR: return createAuthor();
			case DpdPackage.CHILD_HW_DEVICE: return createChildHwDevice();
			case DpdPackage.DEVICE_CLASS: return createDeviceClass();
			case DpdPackage.DEVICE_PKG: return createDevicePkg();
			case DpdPackage.DEVICE_PKG_REF: return createDevicePkgRef();
			case DpdPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DpdPackage.HW_DEVICE_REGISTRATION: return createHwDeviceRegistration();
			case DpdPackage.LOCAL_FILE: return createLocalFile();
			case DpdPackage.PROPERTY_FILE: return createPropertyFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildHwDevice createChildHwDevice() {
		ChildHwDeviceImpl childHwDevice = new ChildHwDeviceImpl();
		return childHwDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceClass createDeviceClass() {
		DeviceClassImpl deviceClass = new DeviceClassImpl();
		return deviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePkg createDevicePkg() {
		DevicePkgImpl devicePkg = new DevicePkgImpl();
		return devicePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePkgRef createDevicePkgRef() {
		DevicePkgRefImpl devicePkgRef = new DevicePkgRefImpl();
		return devicePkgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceRegistration createHwDeviceRegistration() {
		HwDeviceRegistrationImpl hwDeviceRegistration = new HwDeviceRegistrationImpl();
		return hwDeviceRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile createLocalFile() {
		LocalFileImpl localFile = new LocalFileImpl();
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFile createPropertyFile() {
		PropertyFileImpl propertyFile = new PropertyFileImpl();
		return propertyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpdPackage getDpdPackage() {
		return (DpdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DpdPackage getPackage() {
		return DpdPackage.eINSTANCE;
	}

} //DpdFactoryImpl

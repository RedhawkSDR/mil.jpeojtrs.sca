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
package mil.jpeojtrs.sca.cf.extended.impl;

import mil.jpeojtrs.sca.cf.CfPackage;
import mil.jpeojtrs.sca.cf.extended.ExtendedFactory;
import mil.jpeojtrs.sca.cf.extended.ExtendedPackage;
import mil.jpeojtrs.sca.cf.impl.CfPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ExtendedCF.QueryablePort;
import ExtendedCF.QueryablePortOperations;
import ExtendedCF.UsesConnection;
import ExtendedEvent.PropertySetChangeEventType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedPackageImpl extends EPackageImpl implements ExtendedPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryablePortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryablePortOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType usesConnectionEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType usesConnectionArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertySetChangeEventTypeEDataType = null;

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
	 * @see mil.jpeojtrs.sca.cf.extended.ExtendedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtendedPackageImpl() {
		super(eNS_URI, ExtendedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtendedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtendedPackage init() {
		if (isInited)
			return (ExtendedPackage) EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI);

		// Obtain or create and register package
		ExtendedPackageImpl theExtendedPackage = (ExtendedPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtendedPackageImpl
			? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtendedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CfPackageImpl theCfPackage = (CfPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CfPackage.eNS_URI) instanceof CfPackageImpl
			? EPackage.Registry.INSTANCE.getEPackage(CfPackage.eNS_URI) : CfPackage.eINSTANCE);

		// Create package meta-data objects
		theExtendedPackage.createPackageContents();
		theCfPackage.createPackageContents();

		// Initialize created meta-data
		theExtendedPackage.initializePackageContents();
		theCfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtendedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtendedPackage.eNS_URI, theExtendedPackage);
		return theExtendedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryablePort() {
		return queryablePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryablePortOperations() {
		return queryablePortOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUsesConnection() {
		return usesConnectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUsesConnectionArray() {
		return usesConnectionArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertySetChangeEventType() {
		return propertySetChangeEventTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedFactory getExtendedFactory() {
		return (ExtendedFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		queryablePortEClass = createEClass(QUERYABLE_PORT);

		queryablePortOperationsEClass = createEClass(QUERYABLE_PORT_OPERATIONS);

		// Create data types
		usesConnectionEDataType = createEDataType(USES_CONNECTION);
		usesConnectionArrayEDataType = createEDataType(USES_CONNECTION_ARRAY);
		propertySetChangeEventTypeEDataType = createEDataType(PROPERTY_SET_CHANGE_EVENT_TYPE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CfPackage theCfPackage = (CfPackage) EPackage.Registry.INSTANCE.getEPackage(CfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		queryablePortEClass.getESuperTypes().add(this.getQueryablePortOperations());
		queryablePortEClass.getESuperTypes().add(theCfPackage.getPort());
		queryablePortEClass.getESuperTypes().add(theCfPackage.getIDLEntity());
		queryablePortOperationsEClass.getESuperTypes().add(theCfPackage.getPortOperations());

		// Initialize classes and features; add operations and parameters
		initEClass(queryablePortEClass, QueryablePort.class, "QueryablePort", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryablePortOperationsEClass, QueryablePortOperations.class, "QueryablePortOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		addEOperation(queryablePortOperationsEClass, this.getUsesConnectionArray(), "connections", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(usesConnectionEDataType, UsesConnection.class, "UsesConnection", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(usesConnectionArrayEDataType, UsesConnection[].class, "UsesConnectionArray", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertySetChangeEventTypeEDataType, PropertySetChangeEventType.class, "PropertySetChangeEventType", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtendedPackageImpl

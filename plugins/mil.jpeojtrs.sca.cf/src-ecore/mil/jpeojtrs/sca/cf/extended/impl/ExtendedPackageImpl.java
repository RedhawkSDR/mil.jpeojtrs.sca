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

import ExtendedCF.ConnectionStatus;
import ExtendedCF.NegotiablePort;
import ExtendedCF.NegotiablePortOperations;
import ExtendedCF.NegotiableProvidesPort;
import ExtendedCF.NegotiableProvidesPortOperations;
import ExtendedCF.NegotiableUsesPort;
import ExtendedCF.NegotiableUsesPortOperations;
import ExtendedCF.NegotiationError;
import ExtendedCF.NegotiationResult;
import mil.jpeojtrs.sca.cf.CfPackage;
import mil.jpeojtrs.sca.cf.extended.ExtendedFactory;
import mil.jpeojtrs.sca.cf.extended.ExtendedPackage;
import mil.jpeojtrs.sca.cf.impl.CfPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ExtendedCF.QueryablePort;
import ExtendedCF.QueryablePortOperations;
import ExtendedCF.TransportInfo;
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
	private EClass negotiablePortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negotiablePortOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negotiableProvidesPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negotiableProvidesPortOperationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negotiableUsesPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negotiableUsesPortOperationsEClass = null;
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
	private EDataType connectionStatusEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionStatusArrayEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType negotiationErrorEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType negotiationResultEDataType = null;
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
	private EDataType transportInfoEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transportInfoArrayEDataType = null;
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
			? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new ExtendedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CfPackageImpl theCfPackage = (CfPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CfPackage.eNS_URI) instanceof CfPackageImpl
			? EPackage.Registry.INSTANCE.getEPackage(CfPackage.eNS_URI)
			: CfPackage.eINSTANCE);

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
	public EClass getNegotiablePort() {
		return negotiablePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegotiablePortOperations() {
		return negotiablePortOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegotiableProvidesPort() {
		return negotiableProvidesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegotiableProvidesPortOperations() {
		return negotiableProvidesPortOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegotiableUsesPort() {
		return negotiableUsesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegotiableUsesPortOperations() {
		return negotiableUsesPortOperationsEClass;
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
	public EDataType getConnectionStatus() {
		return connectionStatusEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectionStatusArray() {
		return connectionStatusArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNegotiationError() {
		return negotiationErrorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNegotiationResult() {
		return negotiationResultEDataType;
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
	public EDataType getTransportInfo() {
		return transportInfoEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransportInfoArray() {
		return transportInfoArrayEDataType;
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
		negotiablePortEClass = createEClass(NEGOTIABLE_PORT);

		negotiablePortOperationsEClass = createEClass(NEGOTIABLE_PORT_OPERATIONS);

		negotiableProvidesPortEClass = createEClass(NEGOTIABLE_PROVIDES_PORT);

		negotiableProvidesPortOperationsEClass = createEClass(NEGOTIABLE_PROVIDES_PORT_OPERATIONS);

		negotiableUsesPortEClass = createEClass(NEGOTIABLE_USES_PORT);

		negotiableUsesPortOperationsEClass = createEClass(NEGOTIABLE_USES_PORT_OPERATIONS);

		queryablePortEClass = createEClass(QUERYABLE_PORT);

		queryablePortOperationsEClass = createEClass(QUERYABLE_PORT_OPERATIONS);

		// Create data types
		connectionStatusEDataType = createEDataType(CONNECTION_STATUS);
		connectionStatusArrayEDataType = createEDataType(CONNECTION_STATUS_ARRAY);
		negotiationErrorEDataType = createEDataType(NEGOTIATION_ERROR);
		negotiationResultEDataType = createEDataType(NEGOTIATION_RESULT);
		propertySetChangeEventTypeEDataType = createEDataType(PROPERTY_SET_CHANGE_EVENT_TYPE);
		usesConnectionEDataType = createEDataType(USES_CONNECTION);
		usesConnectionArrayEDataType = createEDataType(USES_CONNECTION_ARRAY);
		transportInfoEDataType = createEDataType(TRANSPORT_INFO);
		transportInfoArrayEDataType = createEDataType(TRANSPORT_INFO_ARRAY);
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
		negotiablePortEClass.getESuperTypes().add(this.getNegotiablePortOperations());
		negotiablePortEClass.getESuperTypes().add(theCfPackage.getObject());
		negotiablePortEClass.getESuperTypes().add(theCfPackage.getIDLEntity());
		negotiableProvidesPortEClass.getESuperTypes().add(this.getNegotiableProvidesPortOperations());
		negotiableProvidesPortEClass.getESuperTypes().add(this.getNegotiablePort());
		negotiableProvidesPortEClass.getESuperTypes().add(theCfPackage.getIDLEntity());
		negotiableProvidesPortOperationsEClass.getESuperTypes().add(this.getNegotiablePortOperations());
		negotiableUsesPortEClass.getESuperTypes().add(this.getNegotiableUsesPortOperations());
		negotiableUsesPortEClass.getESuperTypes().add(this.getQueryablePort());
		negotiableUsesPortEClass.getESuperTypes().add(this.getNegotiablePort());
		negotiableUsesPortOperationsEClass.getESuperTypes().add(this.getQueryablePortOperations());
		negotiableUsesPortOperationsEClass.getESuperTypes().add(this.getNegotiablePortOperations());
		queryablePortEClass.getESuperTypes().add(this.getQueryablePortOperations());
		queryablePortEClass.getESuperTypes().add(theCfPackage.getPort());
		queryablePortEClass.getESuperTypes().add(theCfPackage.getIDLEntity());
		queryablePortOperationsEClass.getESuperTypes().add(theCfPackage.getPortOperations());

		// Initialize classes and features; add operations and parameters
		initEClass(negotiablePortEClass, NegotiablePort.class, "NegotiablePort", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(negotiablePortOperationsEClass, NegotiablePortOperations.class, "NegotiablePortOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		addEOperation(negotiablePortOperationsEClass, this.getTransportInfoArray(), "supportedTransports", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(negotiableProvidesPortEClass, NegotiableProvidesPort.class, "NegotiableProvidesPort", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		initEClass(negotiableProvidesPortOperationsEClass, NegotiableProvidesPortOperations.class, "NegotiableProvidesPortOperations", IS_ABSTRACT,
			IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(negotiableProvidesPortOperationsEClass, this.getNegotiationResult(), "negotiateTransport", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transportType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCfPackage.getDataTypeArray(), "transportProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNegotiationError());

		op = addEOperation(negotiableProvidesPortOperationsEClass, null, "disconnectTransport", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transportId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNegotiationError());

		initEClass(negotiableUsesPortEClass, NegotiableUsesPort.class, "NegotiableUsesPort", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(negotiableUsesPortOperationsEClass, NegotiableUsesPortOperations.class, "NegotiableUsesPortOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		addEOperation(negotiableUsesPortOperationsEClass, this.getConnectionStatusArray(), "connectionStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryablePortEClass, QueryablePort.class, "QueryablePort", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryablePortOperationsEClass, QueryablePortOperations.class, "QueryablePortOperations", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		addEOperation(queryablePortOperationsEClass, this.getUsesConnectionArray(), "connections", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(connectionStatusEDataType, ConnectionStatus.class, "ConnectionStatus", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectionStatusArrayEDataType, ConnectionStatus[].class, "ConnectionStatusArray", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(negotiationErrorEDataType, NegotiationError.class, "NegotiationError", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(negotiationResultEDataType, NegotiationResult.class, "NegotiationResult", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertySetChangeEventTypeEDataType, PropertySetChangeEventType.class, "PropertySetChangeEventType", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(usesConnectionEDataType, UsesConnection.class, "UsesConnection", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(usesConnectionArrayEDataType, UsesConnection[].class, "UsesConnectionArray", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transportInfoEDataType, TransportInfo.class, "TransportInfo", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transportInfoArrayEDataType, TransportInfo[].class, "TransportInfoArray", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtendedPackageImpl

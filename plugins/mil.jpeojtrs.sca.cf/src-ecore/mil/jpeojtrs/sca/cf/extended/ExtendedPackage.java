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
package mil.jpeojtrs.sca.cf.extended;

import mil.jpeojtrs.sca.cf.CfPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.cf.extended.ExtendedFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extended";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///mil/jpeojtrs/sca/cf/extended.ecore";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExtendedCF";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtendedPackage eINSTANCE = mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl.init();
	/**
	 * The meta object id for the '{@link ExtendedCF.QueryablePortOperations <em>Queryable Port Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedCF.QueryablePortOperations
	 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getQueryablePortOperations()
	 * @generated
	 */
	int QUERYABLE_PORT_OPERATIONS = 1;
	/**
	 * The number of structural features of the '<em>Queryable Port Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERYABLE_PORT_OPERATIONS_FEATURE_COUNT = CfPackage.PORT_OPERATIONS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link ExtendedCF.QueryablePort <em>Queryable Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedCF.QueryablePort
	 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getQueryablePort()
	 * @generated
	 */
	int QUERYABLE_PORT = 0;
	/**
	 * The number of structural features of the '<em>Queryable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERYABLE_PORT_FEATURE_COUNT = QUERYABLE_PORT_OPERATIONS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '<em>Uses Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedCF.UsesConnection
	 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getUsesConnection()
	 * @generated
	 */
	int USES_CONNECTION = 2;
	/**
	 * The meta object id for the '<em>Uses Connection Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getUsesConnectionArray()
	 * @generated
	 */
	int USES_CONNECTION_ARRAY = 3;

	/**
	 * The meta object id for the '<em>Property Set Change Event Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtendedEvent.PropertySetChangeEventType
	 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getPropertySetChangeEventType()
	 * @generated
	 */
	int PROPERTY_SET_CHANGE_EVENT_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link ExtendedCF.QueryablePort <em>Queryable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queryable Port</em>'.
	 * @see ExtendedCF.QueryablePort
	 * @model instanceClass="ExtendedCF.QueryablePort" superTypes="mil.jpeojtrs.sca.cf.extended.QueryablePortOperations mil.jpeojtrs.sca.cf.Port mil.jpeojtrs.sca.cf.IDLEntity"
	 * @generated
	 */
	EClass getQueryablePort();

	/**
	 * Returns the meta object for class '{@link ExtendedCF.QueryablePortOperations <em>Queryable Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queryable Port Operations</em>'.
	 * @see ExtendedCF.QueryablePortOperations
	 * @model instanceClass="ExtendedCF.QueryablePortOperations" superTypes="mil.jpeojtrs.sca.cf.PortOperations"
	 * @generated
	 */
	EClass getQueryablePortOperations();

	/**
	 * Returns the meta object for data type '{@link ExtendedCF.UsesConnection <em>Uses Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uses Connection</em>'.
	 * @see ExtendedCF.UsesConnection
	 * @model instanceClass="ExtendedCF.UsesConnection" serializeable="false"
	 * @generated
	 */
	EDataType getUsesConnection();

	/**
	 * Returns the meta object for data type '<em>Uses Connection Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uses Connection Array</em>'.
	 * @model instanceClass="ExtendedCF.UsesConnection[]" serializeable="false"
	 * @generated
	 */
	EDataType getUsesConnectionArray();

	/**
	 * Returns the meta object for data type '{@link ExtendedEvent.PropertySetChangeEventType <em>Property Set Change Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Set Change Event Type</em>'.
	 * @see ExtendedEvent.PropertySetChangeEventType
	 * @model instanceClass="ExtendedEvent.PropertySetChangeEventType"
	 * @generated
	 */
	EDataType getPropertySetChangeEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtendedFactory getExtendedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link ExtendedCF.QueryablePort <em>Queryable Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedCF.QueryablePort
		 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getQueryablePort()
		 * @generated
		 */
		EClass QUERYABLE_PORT = eINSTANCE.getQueryablePort();
		/**
		 * The meta object literal for the '{@link ExtendedCF.QueryablePortOperations <em>Queryable Port Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedCF.QueryablePortOperations
		 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getQueryablePortOperations()
		 * @generated
		 */
		EClass QUERYABLE_PORT_OPERATIONS = eINSTANCE.getQueryablePortOperations();
		/**
		 * The meta object literal for the '<em>Uses Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedCF.UsesConnection
		 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getUsesConnection()
		 * @generated
		 */
		EDataType USES_CONNECTION = eINSTANCE.getUsesConnection();
		/**
		 * The meta object literal for the '<em>Uses Connection Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getUsesConnectionArray()
		 * @generated
		 */
		EDataType USES_CONNECTION_ARRAY = eINSTANCE.getUsesConnectionArray();
		/**
		 * The meta object literal for the '<em>Property Set Change Event Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtendedEvent.PropertySetChangeEventType
		 * @see mil.jpeojtrs.sca.cf.extended.impl.ExtendedPackageImpl#getPropertySetChangeEventType()
		 * @generated
		 */
		EDataType PROPERTY_SET_CHANGE_EVENT_TYPE = eINSTANCE.getPropertySetChangeEventType();

	}

} //ExtendedPackage

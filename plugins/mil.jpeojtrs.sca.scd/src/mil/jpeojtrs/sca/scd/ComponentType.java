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
package mil.jpeojtrs.sca.scd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getComponentType()
 * @model
 * @generated
 */
public enum ComponentType implements Enumerator {
	/**
	 * The '<em><b>RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(0, "RESOURCE", "resource"),
	/**
	 * The '<em><b>DEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(1, "DEVICE", "device"),
	/**
	 * The '<em><b>RESOURCE FACTORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_FACTORY_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_FACTORY(2, "RESOURCE_FACTORY", "resourcefactory"),
	/**
	 * The '<em><b>DOMAIN MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_MANAGER(3, "DOMAIN_MANAGER", "domainmanager"),
	/**
	 * The '<em><b>LOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LOG(4, "LOG", "log"),
	/**
	 * The '<em><b>FILE SYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_SYSTEM(5, "FILE_SYSTEM", "filesystem"),
	/**
	 * The '<em><b>FILE MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_MANAGER(6, "FILE_MANAGER", "filemanager"),
	/**
	 * The '<em><b>DEVICE MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_MANAGER(7, "DEVICE_MANAGER", "devicemanager"),
	/**
	 * The '<em><b>NAMING SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMING_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	NAMING_SERVICE(8, "NAMING_SERVICE", "namingservice"),
	/**
	 * The '<em><b>EVENT SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_SERVICE(9, "EVENT_SERVICE", "eventservice"),
	/**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(10, "SERVICE", "service"),
	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(11, "OTHER", "OTHER");

	/**
	 * The '<em><b>RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model literal="resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 0;
	/**
	 * The '<em><b>DEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model literal="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 1;
	/**
	 * The '<em><b>RESOURCE FACTORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE FACTORY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_FACTORY
	 * @model literal="resourcefactory"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_FACTORY_VALUE = 2;
	/**
	 * The '<em><b>DOMAIN MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOMAIN MANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_MANAGER
	 * @model literal="domainmanager"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_MANAGER_VALUE = 3;
	/**
	 * The '<em><b>LOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOG
	 * @model literal="log"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_VALUE = 4;
	/**
	 * The '<em><b>FILE SYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILE SYSTEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_SYSTEM
	 * @model literal="filesystem"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_SYSTEM_VALUE = 5;
	/**
	 * The '<em><b>FILE MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILE MANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_MANAGER
	 * @model literal="filemanager"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_MANAGER_VALUE = 6;
	/**
	 * The '<em><b>DEVICE MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEVICE MANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE_MANAGER
	 * @model literal="devicemanager"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_MANAGER_VALUE = 7;
	/**
	 * The '<em><b>NAMING SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAMING SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMING_SERVICE
	 * @model literal="namingservice"
	 * @generated
	 * @ordered
	 */
	public static final int NAMING_SERVICE_VALUE = 8;
	/**
	 * The '<em><b>EVENT SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVENT SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_SERVICE
	 * @model literal="eventservice"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_SERVICE_VALUE = 9;
	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model literal="service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 10;
	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 11;
	/**
	 * An array of all the '<em><b>Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentType[] VALUES_ARRAY =
		new ComponentType[]
		{
			RESOURCE,
			DEVICE,
			RESOURCE_FACTORY,
			DOMAIN_MANAGER,
			LOG,
			FILE_SYSTEM,
			FILE_MANAGER,
			DEVICE_MANAGER,
			NAMING_SERVICE,
			EVENT_SERVICE,
			SERVICE,
			OTHER,
		};
/**
	 * A public read-only list of all the '<em><b>Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentType get(int value) {
		switch (value) {
		case RESOURCE_VALUE:
			return RESOURCE;
		case DEVICE_VALUE:
			return DEVICE;
		case RESOURCE_FACTORY_VALUE:
			return RESOURCE_FACTORY;
		case DOMAIN_MANAGER_VALUE:
			return DOMAIN_MANAGER;
		case LOG_VALUE:
			return LOG;
		case FILE_SYSTEM_VALUE:
			return FILE_SYSTEM;
		case FILE_MANAGER_VALUE:
			return FILE_MANAGER;
		case DEVICE_MANAGER_VALUE:
			return DEVICE_MANAGER;
		case NAMING_SERVICE_VALUE:
			return NAMING_SERVICE;
		case EVENT_SERVICE_VALUE:
			return EVENT_SERVICE;
		case SERVICE_VALUE:
			return SERVICE;
		case OTHER_VALUE:
			return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComponentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ComponentType

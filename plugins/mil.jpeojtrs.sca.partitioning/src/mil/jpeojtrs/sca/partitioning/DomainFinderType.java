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
package mil.jpeojtrs.sca.partitioning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Domain Finder Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getDomainFinderType()
 * @model extendedMetaData="name='domainfindertype' qualified='false'"
 * @generated
 */
public enum DomainFinderType implements Enumerator {
	/**
	 * The '<em><b>Filemanager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILEMANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	FILEMANAGER(0, "filemanager", "filemanager"), /**
	 * The '<em><b>Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LOG(1, "log", "log"), /**
	 * The '<em><b>Eventchannel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENTCHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	EVENTCHANNEL(2, "eventchannel", "eventchannel"), /**
	 * The '<em><b>Namingservice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMINGSERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	NAMINGSERVICE(3, "namingservice", "namingservice"), /**
	 * The '<em><b>Domainmanager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAINMANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAINMANAGER(4, "domainmanager", "domainmanager"), /**
	 * The '<em><b>Servicename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICENAME_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICENAME(5, "servicename", "servicename"), /**
	 * The '<em><b>Servicetype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICETYPE(6, "servicetype", "servicetype");

/**
	 * The '<em><b>Filemanager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filemanager</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILEMANAGER
	 * @model name="filemanager"
	 * @generated
	 * @ordered
	 */
	public static final int FILEMANAGER_VALUE = 0;
/**
	 * The '<em><b>Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Log</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOG
	 * @model name="log"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_VALUE = 1;
/**
	 * The '<em><b>Eventchannel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eventchannel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENTCHANNEL
	 * @model name="eventchannel"
	 * @generated
	 * @ordered
	 */
	public static final int EVENTCHANNEL_VALUE = 2;
/**
	 * The '<em><b>Namingservice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Namingservice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMINGSERVICE
	 * @model name="namingservice"
	 * @generated
	 * @ordered
	 */
	public static final int NAMINGSERVICE_VALUE = 3;
/**
	 * The '<em><b>Domainmanager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Domainmanager</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAINMANAGER
	 * @model name="domainmanager"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAINMANAGER_VALUE = 4;
/**
	 * The '<em><b>Servicename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Servicename</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICENAME
	 * @model name="servicename"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICENAME_VALUE = 5;
/**
	 * The '<em><b>Servicetype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Servicetype</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICETYPE
	 * @model name="servicetype"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICETYPE_VALUE = 6;
/**
	 * An array of all the '<em><b>Domain Finder Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DomainFinderType[] VALUES_ARRAY =
		new DomainFinderType[] {
			FILEMANAGER,
			LOG,
			EVENTCHANNEL,
			NAMINGSERVICE,
			DOMAINMANAGER,
			SERVICENAME,
			SERVICETYPE,
		};
/**
	 * A public read-only list of all the '<em><b>Domain Finder Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DomainFinderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

/**
	 * Returns the '<em><b>Domain Finder Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFinderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DomainFinderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

/**
	 * Returns the '<em><b>Domain Finder Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFinderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DomainFinderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

/**
	 * Returns the '<em><b>Domain Finder Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFinderType get(int value) {
		switch (value) {
			case FILEMANAGER_VALUE: return FILEMANAGER;
			case LOG_VALUE: return LOG;
			case EVENTCHANNEL_VALUE: return EVENTCHANNEL;
			case NAMINGSERVICE_VALUE: return NAMINGSERVICE;
			case DOMAINMANAGER_VALUE: return DOMAINMANAGER;
			case SERVICENAME_VALUE: return SERVICENAME;
			case SERVICETYPE_VALUE: return SERVICETYPE;
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
	private DomainFinderType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //DomainFinderType

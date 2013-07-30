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
package mil.jpeojtrs.sca.spd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Code File Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getCodeFileType()
 * @model extendedMetaData="name='type_._type'"
 * @generated
 */
public enum CodeFileType implements Enumerator {
	/**
	 * The '<em><b>Executable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTABLE(0, "Executable", "Executable"), /**
	 * The '<em><b>Kernel Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KERNEL_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	KERNEL_MODULE(1, "KernelModule", "KernelModule"), /**
	 * The '<em><b>Shared Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED_LIBRARY(2, "SharedLibrary", "SharedLibrary"), /**
	 * The '<em><b>Driver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIVER_VALUE
	 * @generated
	 * @ordered
	 */
	DRIVER(3, "Driver", "Driver"), /**
	 * The '<em><b>Node Booter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_BOOTER_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_BOOTER(4, "NodeBooter", "NodeBooter");

/**
	 * The '<em><b>Executable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Executable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTABLE
	 * @model name="Executable"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTABLE_VALUE = 0;
/**
	 * The '<em><b>Kernel Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kernel Module</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KERNEL_MODULE
	 * @model name="KernelModule"
	 * @generated
	 * @ordered
	 */
	public static final int KERNEL_MODULE_VALUE = 1;
/**
	 * The '<em><b>Shared Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shared Library</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHARED_LIBRARY
	 * @model name="SharedLibrary"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_LIBRARY_VALUE = 2;
/**
	 * The '<em><b>Driver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Driver</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIVER
	 * @model name="Driver"
	 * @generated
	 * @ordered
	 */
	public static final int DRIVER_VALUE = 3;
/**
	 * The '<em><b>Node Booter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Node Booter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODE_BOOTER
	 * @model name="NodeBooter"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_BOOTER_VALUE = 4;
/**
	 * An array of all the '<em><b>Code File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeFileType[] VALUES_ARRAY =
		new CodeFileType[]
		{
			EXECUTABLE,
			KERNEL_MODULE,
			SHARED_LIBRARY,
			DRIVER,
			NODE_BOOTER,
		};
/**
	 * A public read-only list of all the '<em><b>Code File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeFileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

/**
	 * Returns the '<em><b>Code File Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CodeFileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

/**
	 * Returns the '<em><b>Code File Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			CodeFileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

/**
	 * Returns the '<em><b>Code File Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFileType get(int value) {
		switch (value)
		{
			case EXECUTABLE_VALUE: return EXECUTABLE;
			case KERNEL_MODULE_VALUE: return KERNEL_MODULE;
			case SHARED_LIBRARY_VALUE: return SHARED_LIBRARY;
			case DRIVER_VALUE: return DRIVER;
			case NODE_BOOTER_VALUE: return NODE_BOOTER;
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
	private CodeFileType(int value, String name, String literal) {
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
	
} //CodeFileType

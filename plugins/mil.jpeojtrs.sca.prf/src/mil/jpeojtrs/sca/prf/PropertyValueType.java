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
package mil.jpeojtrs.sca.prf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import mil.jpeojtrs.sca.util.AnyUtils;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyValueType()
 * @model extendedMetaData="name='PropertyValueType'"
 * @generated
 */
public enum PropertyValueType implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "string", "string"),
	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(1, "boolean", "boolean"),
	/**
	 * The '<em><b>Ulong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULONG_VALUE
	 * @generated
	 * @ordered
	 */
	ULONG(2, "ulong", "ulong"),
	/**
	 * The '<em><b>Objref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJREF_VALUE
	 * @generated
	 * @ordered
	 */
	OBJREF(3, "objref", "objref"),
	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(4, "short", "short"),
	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(5, "float", "float"),
	/**
	 * The '<em><b>Octet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTET_VALUE
	 * @generated
	 * @ordered
	 */
	OCTET(6, "octet", "octet"),
	/**
	 * The '<em><b>Char</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CHAR(7, "char", "char"),
	/**
	 * The '<em><b>Ushort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USHORT_VALUE
	 * @generated
	 * @ordered
	 */
	USHORT(8, "ushort", "ushort"),
	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(9, "double", "double"),
	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(10, "long", "long"),
	/**
	 * The '<em><b>Longlong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONGLONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONGLONG(11, "longlong", "longlong"),
	/**
	 * The '<em><b>Ulonglong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULONGLONG_VALUE
	 * @generated
	 * @ordered
	 */
	ULONGLONG(12, "ulonglong", "ulonglong");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;
	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 1;
	/**
	 * The '<em><b>Ulong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ulong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ULONG
	 * @model name="ulong"
	 * @generated
	 * @ordered
	 */
	public static final int ULONG_VALUE = 2;
	/**
	 * The '<em><b>Objref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Objref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJREF
	 * @model name="objref"
	 * @generated
	 * @ordered
	 */
	public static final int OBJREF_VALUE = 3;
	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model name="short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 4;
	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 5;
	/**
	 * The '<em><b>Octet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Octet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCTET
	 * @model name="octet"
	 * @generated
	 * @ordered
	 */
	public static final int OCTET_VALUE = 6;
	/**
	 * The '<em><b>Char</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Char</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR
	 * @model name="char"
	 * @generated
	 * @ordered
	 */
	public static final int CHAR_VALUE = 7;
	/**
	 * The '<em><b>Ushort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ushort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USHORT
	 * @model name="ushort"
	 * @generated
	 * @ordered
	 */
	public static final int USHORT_VALUE = 8;
	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 9;
	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 10;
	/**
	 * The '<em><b>Longlong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Longlong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONGLONG
	 * @model name="longlong"
	 * @generated
	 * @ordered
	 */
	public static final int LONGLONG_VALUE = 11;
	/**
	 * The '<em><b>Ulonglong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ulonglong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ULONGLONG
	 * @model name="ulonglong"
	 * @generated
	 * @ordered
	 */
	public static final int ULONGLONG_VALUE = 12;
	/**
	 * An array of all the '<em><b>Property Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyValueType[] VALUES_ARRAY = new PropertyValueType[] { STRING, BOOLEAN, ULONG, OBJREF, SHORT, FLOAT, OCTET, CHAR, USHORT, DOUBLE,
		LONG, LONGLONG, ULONGLONG, };
	/**
	 * A public read-only list of all the '<em><b>Property Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyValueType get(int value) {
		switch (value) {
		case STRING_VALUE:
			return STRING;
		case BOOLEAN_VALUE:
			return BOOLEAN;
		case ULONG_VALUE:
			return ULONG;
		case OBJREF_VALUE:
			return OBJREF;
		case SHORT_VALUE:
			return SHORT;
		case FLOAT_VALUE:
			return FLOAT;
		case OCTET_VALUE:
			return OCTET;
		case CHAR_VALUE:
			return CHAR;
		case USHORT_VALUE:
			return USHORT;
		case DOUBLE_VALUE:
			return DOUBLE;
		case LONG_VALUE:
			return LONG;
		case LONGLONG_VALUE:
			return LONGLONG;
		case ULONGLONG_VALUE:
			return ULONGLONG;
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
	private PropertyValueType(int value, String name, String literal) {
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

	// END GENERATED CODE

	/**
	 * @deprecated With introduction of complex type use the {@link #isValueOfType(String, Boolean)} instead
	 */
	@Deprecated
	public boolean isValueOfType(String value) {
		return isValueOfType(value, false);
	}

	/**
	 * Checks the given value against the current PropertyValueType.
	 * 
	 * @since 3.0
	 * @param value the String value to check
	 * @param complex if the string is a complex number
	 * @return <code> true </code> if the value is valid for this PropertyValueType; <code> false </code> otherwise
	 */
	public boolean isValueOfType(String value, boolean complex) {
		if (value == null) {
			return false;
		}
		try {
			AnyUtils.convertString(value, getLiteral(), complex);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * NOTE Assumes not Complex Type
	 * @deprecated Use {@link #toEDataType(boolean)}
	 * @return
	 */
	@Deprecated
	public EDataType toDataType() {
		return toEDataType(false);
	}

	/**
	 * Converts PropertyValueType to associated EDataType
	 * @param complex True if complex number type
	 * @return
	 * @since 3.0
	 */
	public EDataType toEDataType(boolean complex) {
		if (complex) {
			switch (this) {
			case BOOLEAN:
				return PrfPackage.Literals.COMPLEX_BOOLEAN;
			case CHAR:
				return PrfPackage.Literals.COMPLEX_UBYTE;
			case DOUBLE:
				return PrfPackage.Literals.COMPLEX_DOUBLE;
			case FLOAT:
				return PrfPackage.Literals.COMPLEX_FLOAT;
			case LONG:
				return PrfPackage.Literals.COMPLEX_LONG;
			case LONGLONG:
				return PrfPackage.Literals.COMPLEX_LONG_LONG;
			case OCTET:
				return PrfPackage.Literals.COMPLEX_OCTET;
			case SHORT:
				return PrfPackage.Literals.COMPLEX_SHORT;
			case ULONG:
				return PrfPackage.Literals.COMPLEX_ULONG;
			case USHORT:
				return PrfPackage.Literals.COMPLEX_USHORT;
			case ULONGLONG:
				return PrfPackage.Literals.COMPLEX_ULONG_LONG;
			case OBJREF:
			case STRING:
			default:
				return null;
			}
		} else {
			switch (this) {
			case BOOLEAN:
				return EcorePackage.Literals.EBOOLEAN_OBJECT;
			case CHAR:
				return PrfPackage.Literals.CHARACTER_OBJECT;
			case DOUBLE:
				return EcorePackage.Literals.EDOUBLE_OBJECT;
			case FLOAT:
				return EcorePackage.Literals.EFLOAT_OBJECT;
			case LONG:
				return EcorePackage.Literals.EINTEGER_OBJECT;
			case LONGLONG:
				return EcorePackage.Literals.ELONG_OBJECT;
			case OBJREF:
				return EcorePackage.Literals.ESTRING;
			case OCTET:
				return EcorePackage.Literals.ESHORT_OBJECT;
			case SHORT:
				return EcorePackage.Literals.ESHORT_OBJECT;
			case STRING:
				return EcorePackage.Literals.ESTRING;
			case ULONG:
				return EcorePackage.Literals.ELONG_OBJECT;
			case USHORT:
				return EcorePackage.Literals.EINTEGER_OBJECT;
			case ULONGLONG:
				return EcorePackage.Literals.EBIG_INTEGER;
			default:
				return null;
			}
		}
	}

	/**
	 * @return A user-displayable help string about how to format string values of this type. Some help strings may be
	 * empty.
	 * @since 6.2
	 */
	public String getFormattingHelp() {
		switch (this) {
		case BOOLEAN:
			return "Valid values are 'true' and 'false'.";
		case CHAR:
			return "";
		case DOUBLE:
			return "";
		case FLOAT:
			return "";
		case LONG:
			return "Valid long values are between -2^31 and 2^31 - 1.";
		case LONGLONG:
			return "Valid longlong values are between -2^63 and 2^63 - 1.";
		case OBJREF:
			return "";
		case OCTET:
			return "";
		case SHORT:
			return "Valid short values are between -2^15 and 2^15 - 1.";
		case STRING:
			return "";
		case ULONG:
			return "Valid ulonglong values are between 0 and 2^32 - 1.";
		case USHORT:
			return "Valid ushort values are between 0 and 2^16 - 1.";
		case ULONGLONG:
			return "Valid ulonglong values are between 0 and 2^64 - 1.";
		default:
			return "";
		}
	}

	// BEGIN GENERATED CODE

} //PropertyValueType

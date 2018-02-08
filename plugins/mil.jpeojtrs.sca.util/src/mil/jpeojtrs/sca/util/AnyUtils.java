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
package mil.jpeojtrs.sca.util;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;
import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.BooleanSeqHelper;
import org.omg.CORBA.CharSeqHelper;
import org.omg.CORBA.DoubleSeqHelper;
import org.omg.CORBA.FloatSeqHelper;
import org.omg.CORBA.LongLongSeqHelper;
import org.omg.CORBA.LongSeqHelper;
import org.omg.CORBA.ORB;
import org.omg.CORBA.OctetSeqHelper;
import org.omg.CORBA.ShortSeqHelper;
import org.omg.CORBA.StringSeqHelper;
import org.omg.CORBA.TCKind;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.ULongLongSeqHelper;
import org.omg.CORBA.ULongSeqHelper;
import org.omg.CORBA.UShortSeqHelper;
import org.omg.CORBA.WCharSeqHelper;
import org.omg.CORBA.WStringSeqHelper;
import org.omg.CORBA.TypeCodePackage.BadKind;

import CF.DataType;
import CF.DataTypeHelper;
import CF.PropertiesHelper;
import CF.UTCTimeHelper;
import CF.UTCTimeSequenceHelper;
import CF.complexBooleanHelper;
import CF.complexBooleanSeqHelper;
import CF.complexCharHelper;
import CF.complexCharSeqHelper;
import CF.complexDoubleHelper;
import CF.complexDoubleSeqHelper;
import CF.complexFloatHelper;
import CF.complexFloatSeqHelper;
import CF.complexLongHelper;
import CF.complexLongLongHelper;
import CF.complexLongLongSeqHelper;
import CF.complexLongSeqHelper;
import CF.complexOctetHelper;
import CF.complexOctetSeqHelper;
import CF.complexShortHelper;
import CF.complexShortSeqHelper;
import CF.complexULongHelper;
import CF.complexULongLongHelper;
import CF.complexULongLongSeqHelper;
import CF.complexULongSeqHelper;
import CF.complexUShortHelper;
import CF.complexUShortSeqHelper;
import mil.jpeojtrs.sca.util.math.ComplexBoolean;
import mil.jpeojtrs.sca.util.math.ComplexByte;
import mil.jpeojtrs.sca.util.math.ComplexDouble;
import mil.jpeojtrs.sca.util.math.ComplexFloat;
import mil.jpeojtrs.sca.util.math.ComplexLong;
import mil.jpeojtrs.sca.util.math.ComplexLongLong;
import mil.jpeojtrs.sca.util.math.ComplexNumber;
import mil.jpeojtrs.sca.util.math.ComplexOctet;
import mil.jpeojtrs.sca.util.math.ComplexShort;
import mil.jpeojtrs.sca.util.math.ComplexUByte;
import mil.jpeojtrs.sca.util.math.ComplexULong;
import mil.jpeojtrs.sca.util.math.ComplexULongLong;
import mil.jpeojtrs.sca.util.math.ComplexUShort;
import mil.jpeojtrs.sca.util.time.UTCTime;

public final class AnyUtils {

	// Redhawk property types
	private static final String BOOLEAN = "boolean";
	private static final String CHAR = "char";
	private static final String DOUBLE = "double";
	private static final String FLOAT = "float";
	private static final String LONG = "long";
	private static final String LONGLONG = "longlong";
	private static final String OBJREF = "objref";
	private static final String OCTET = "octet";
	private static final String SHORT = "short";
	private static final String STRING = "string";
	private static final String ULONG = "ulong";
	private static final String ULONGLONG = "ulonglong";
	private static final String USHORT = "ushort";
	private static final String UTCTIME = "utctime";

	// Additional CORBA types used in Anys
	private static final String CORBA_ANY = "any";
	private static final String CORBA_FIXED = "fixed";
	private static final String CORBA_TYPECODE = "typecode";
	private static final String CORBA_VALUE = "value";
	private static final String CORBA_WCHAR = "wchar";
	private static final String CORBA_WSTRING = "wstring";

	private static final int RADIX_DECIMAL = 10;
	private static final int RADIX_HEX = 16;
	private static final int RADIX_OCTAL = 8;

	private static final ORB ORB = JacorbUtil.init();

	private AnyUtils() {
	}

	/**
	 * Attempts to parse the string value to the appropriate Java type.
	 *
	 * @param stringValue the string form of the value
	 * @param type the property value type (e.g. "long")
	 * @param complex If the value should be interrupted as a complex number
	 * @return The Java object
	 * @since 3.4
	 */
	public static Object convertString(final String stringValue, final String type, boolean complex) {
		if (complex) {
			return ComplexNumber.valueOf(type, stringValue);
		} else {
			return AnyUtils.primitiveConvertString(stringValue, type);
		}
	}

	/**
	 * @deprecated Use {@link #convertString(String, String, boolean)}
	 */
	@Deprecated
	public static Object convertString(final String stringValue, final String type) {
		return AnyUtils.convertString(stringValue, type, false);
	}

	/**
	 * Attempts to parse the string value for a simple to the appropriate Java type. Complex numbers are not handled.
	 *
	 * @param stringValue the string form of the value
	 * @param type the property value type (e.g. "long")
	 * @return A Java object
	 */
	private static Object primitiveConvertString(final String stringValue, final String type) {
		if (stringValue == null) {
			return null;
		}
		if (type == null) {
			throw new IllegalArgumentException("null property type");
		}

		switch (type) {
		case STRING:
			return stringValue;
		case CORBA_WSTRING:
			return stringValue;
		case BOOLEAN:
			if ("true".equalsIgnoreCase(stringValue)) {
				return true;
			}
			if ("false".equalsIgnoreCase(stringValue)) {
				return false;
			}
			throw new IllegalArgumentException(stringValue + " is not a valid boolean value");
		case CHAR:
			switch (stringValue.length()) {
			case 1:
				return stringValue.charAt(0);
			case 0:
				return null;
			default:
				throw new IllegalArgumentException(stringValue + " is not a valid char value");
			}
		case CORBA_WCHAR:
			return stringValue.charAt(0);
		case DOUBLE:
			return Double.parseDouble(stringValue);
		case FLOAT:
			return Float.parseFloat(stringValue);
		case SHORT:
			return Short.decode(stringValue);
		case LONG:
			return Integer.decode(stringValue);
		case LONGLONG:
			return Long.decode(stringValue);
		case ULONG:
			final long MAX_UINT = 2L * Integer.MAX_VALUE + 1L;
			final Long ulong = Long.decode(stringValue);
			if (ulong < 0 || ulong > MAX_UINT) {
				throw new IllegalArgumentException("ulong value must be greater than '0' and less than " + MAX_UINT);
			}
			return ulong;
		case USHORT:
			final int MAX_USHORT = 2 * Short.MAX_VALUE + 1;
			final Integer ushort = Integer.decode(stringValue);
			if (ushort < 0 || ushort > MAX_USHORT) {
				throw new IllegalArgumentException("ushort value must be greater than '0' and less than " + MAX_USHORT);
			}
			return ushort;
		case ULONGLONG:
			final BigInteger MAX_ULONG_LONG = BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);
			final BigInteger ulonglong = AnyUtils.bigIntegerDecode(stringValue);
			if (ulonglong.compareTo(BigInteger.ZERO) < 0 || ulonglong.compareTo(MAX_ULONG_LONG) > 0) {
				throw new IllegalArgumentException("ulonglong value must be greater than '0' and less than " + MAX_ULONG_LONG.toString());
			}
			return ulonglong;
		case OBJREF:
			if ("".equals(stringValue)) {
				return null;
			}
			for (final String prefix : new String[] { "IOR:", "corbaname:", "corbaloc:" }) {
				if (stringValue.startsWith(prefix)) {
					return stringValue;
				}
			}
			throw new IllegalArgumentException(stringValue + " is not a valid objref value");
		case OCTET:
			final short MIN_OCTET = 0;
			final short MAX_OCTET = 0xFF;
			final short val = Short.decode(stringValue);
			if (val <= MAX_OCTET && val >= MIN_OCTET) {
				return Short.valueOf(val);
			}
			throw new IllegalArgumentException(stringValue + " is not a valid octet value");
		case UTCTIME:
			return UTCTime.valueOf(stringValue);
		default:
			throw new IllegalArgumentException("Unknown CORBA Type: " + type);
		}
	}

	/**
	 * Attempts to parse the string value to a {@link BigInteger}.
	 *
	 * @param nm the string form of the number
	 * @since 3.0
	 * @throws NumberFormatException
	 */
	public static BigInteger bigIntegerDecode(final String nm) {
		int radix = AnyUtils.RADIX_DECIMAL;
		int index = 0;
		boolean negative = false;
		BigInteger result;

		// Handle minus sign, if present
		if (nm.startsWith("-")) {
			negative = true;
			index++;
		}

		// Handle radix specifier, if present
		if (nm.startsWith("0x", index) || nm.startsWith("0X", index)) {
			index += 2;
			radix = AnyUtils.RADIX_HEX;
		} else if (nm.startsWith("#", index)) {
			index++;
			radix = AnyUtils.RADIX_HEX;
		} else if (nm.startsWith("0", index) && nm.length() > 1 + index) {
			index++;
			radix = AnyUtils.RADIX_OCTAL;
		}

		if (nm.startsWith("-", index)) {
			throw new NumberFormatException("Negative sign in wrong position");
		}
		try {
			result = new BigInteger(nm.substring(index), radix);
			if (negative) {
				result = result.negate();
			}
		} catch (final NumberFormatException e) {
			// If number is Long.MIN_VALUE, we'll end up here. The next line
			// handles this case, and causes any genuine format error to be
			// rethrown.
			final String constant;
			if (negative) {
				constant = "-" + nm.substring(index);
			} else {
				constant = nm.substring(index);
			}
			result = new BigInteger(constant, radix);
		}
		return result;
	}

	/**
	 * Attempts to convert the any to the appropriate Java type.
	 *
	 * @param theAny the Any to convert
	 * @return a Java object that corresponds to theAny's type
	 */
	public static Object convertAny(final Any theAny) {
		if (theAny == null) {
			return null;
		}
		return AnyUtils.convertAny(theAny, theAny.type());
	}

	/**
	 * Attempts to convert the Any using the specified typeCode to the appropriate Java type. May be called
	 * recursively to resolve the Any.
	 *
	 * @param theAny the Any to convert
	 * @param typeCode the TypeCode of the desired value
	 * @return a Java object from theAny that corresponds to the typeCode
	 */
	private static Object convertAny(final Any theAny, final TypeCode typeCode) {
		if (theAny == null) {
			return null;
		}

		// Do this check because extract doesn't throw correctly
		try {
			final TCKind kind = typeCode.kind();
			switch (kind.value()) {
			case TCKind._tk_any:
				return theAny.extract_any();
			case TCKind._tk_boolean:
				return theAny.extract_boolean();
			case TCKind._tk_char:
				return theAny.extract_char();
			case TCKind._tk_double:
				return theAny.extract_double();
			case TCKind._tk_fixed:
				return theAny.extract_fixed();
			case TCKind._tk_float:
				return theAny.extract_float();
			case TCKind._tk_long:
				return theAny.extract_long();
			case TCKind._tk_longlong:
				return theAny.extract_longlong();
			case TCKind._tk_objref:
				return theAny.extract_Object();
			case TCKind._tk_octet:
				return UnsignedUtils.toSigned(theAny.extract_octet());
			case TCKind._tk_short:
				return theAny.extract_short();
			case TCKind._tk_string:
				return theAny.extract_string();
			case TCKind._tk_TypeCode:
				return theAny.extract_TypeCode();
			case TCKind._tk_ulong:
				// return theAny.extract_ulong() & 0xffffffffL;
				// return Integer.valueOf(Integer.toBinaryString(theAny.extract_ulong()), 2);
				return UnsignedUtils.toSigned(theAny.extract_ulong());
			case TCKind._tk_ulonglong:
				// return Long.toBinaryString(theAny.extract_ulonglong()), 2);
				return UnsignedUtils.toSigned(theAny.extract_ulonglong());
			case TCKind._tk_ushort:
				// return (short) (theAny.extract_ushort() & AnyUtils.MAX_SHORT);
				return UnsignedUtils.toSigned(theAny.extract_ushort());
			case TCKind._tk_value:
				return theAny.extract_Value();
			case TCKind._tk_wchar:
				return theAny.extract_wchar();
			case TCKind._tk_wstring:
				return theAny.extract_wstring();
			case TCKind._tk_null:
				return null;
			case TCKind._tk_sequence:
				if (PropertiesHelper.type().equivalent(typeCode)) {
					return PropertiesHelper.extract(theAny);
				} else if (UTCTimeSequenceHelper.type().equivalent(typeCode)) {
					return UTCTime.valueOfSequence(theAny);
				}
				ComplexNumber[] array = ComplexNumber.valueOfSequence(theAny);
				if (array != null) {
					return array;
				}
				return AnyUtils.extractSequence(theAny, typeCode.content_type());
			case TCKind._tk_alias:
				final TypeCode contentType = typeCode.content_type();
				if (contentType.kind().value() == TCKind._tk_sequence) {
					return AnyUtils.convertAny(theAny, contentType);
				} else {
					return theAny.extract_Object();
				}
			case TCKind._tk_struct:
				// Extract Complex Types
				switch (typeCode.id()) {
				case "IDL:CF/complexBoolean:1.0":
					if (complexBooleanHelper.type().equivalent(typeCode)) {
						return ComplexBoolean.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexDouble:1.0":
					if (complexDoubleHelper.type().equivalent(typeCode)) {
						return ComplexDouble.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexFloat:1.0":
					if (complexFloatHelper.type().equivalent(typeCode)) {
						return ComplexFloat.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexLong:1.0":
					if (complexLongHelper.type().equivalent(typeCode)) {
						return ComplexLong.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexLongLong:1.0":
					if (complexLongLongHelper.type().equivalent(typeCode)) {
						return ComplexLongLong.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexShort:1.0":
					if (complexShortHelper.type().equivalent(typeCode)) {
						return ComplexShort.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexULong:1.0":
					if (complexULongHelper.type().equivalent(typeCode)) {
						return ComplexULong.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexULongLong:1.0":
					if (complexULongLongHelper.type().equivalent(typeCode)) {
						return ComplexULongLong.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexUShort:1.0":
					if (complexUShortHelper.type().equivalent(typeCode)) {
						return ComplexUShort.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexOctet:1.0":
					if (complexOctetHelper.type().equivalent(typeCode)) {
						return ComplexOctet.valueOf(theAny);
					}
					break;
				case "IDL:CF/complexChar:1.0":
					if (complexCharHelper.type().equivalent(typeCode)) {
						return ComplexUByte.valueOf(theAny);
					}
					break;
				case "IDL:CF/UTCTime:1.0":
					if (UTCTimeHelper.type().equivalent(typeCode)) {
						return UTCTime.valueOf(theAny);
					}
					break;
				default:
					break;
				}

				throw new IllegalArgumentException("Unknown struct: " + typeCode);
			case TCKind._tk_longdouble:
			case TCKind._tk_array:
			case TCKind._tk_abstract_interface:
			case TCKind._tk_enum:
			case TCKind._tk_except:
			case TCKind._tk_native:
			case TCKind._tk_Principal:
			case TCKind._tk_union:
			case TCKind._tk_value_box:
			case TCKind._tk_void:
			default:
				throw new IllegalArgumentException("Only primitive types supported, unknown conversion: " + typeCode);
			}
		} catch (final BAD_OPERATION ex) {
			return null;
		} catch (final BadKind e) {
			return null;
		}
	}

	/**
	 * Internal function used to extract a sequence from an any.
	 * 
	 * @param theAny the Any to convert
	 * @param contentType the TypeCode of the desired value
	 * @return an array of Java objects from theAny that corresponds to the typeCode
	 */
	private static Object[] extractSequence(final Any theAny, final TypeCode contentType) {
		try {
			final TCKind kind = contentType.kind();
			switch (kind.value()) {
			case TCKind._tk_any:
				Any[] anyArray = AnySeqHelper.extract(theAny);
				Object[] objArray = new Object[anyArray.length];
				for (int i = 0; i < objArray.length; i++) {
					objArray[i] = AnyUtils.convertAny(anyArray[i]);
				}
				return objArray;
			case TCKind._tk_boolean:
				return ArrayUtils.toObject(BooleanSeqHelper.extract(theAny));
			case TCKind._tk_char:
				return ArrayUtils.toObject(CharSeqHelper.extract(theAny));
			case TCKind._tk_double:
				return ArrayUtils.toObject(DoubleSeqHelper.extract(theAny));
			case TCKind._tk_float:
				return ArrayUtils.toObject(FloatSeqHelper.extract(theAny));
			case TCKind._tk_long:
				return ArrayUtils.toObject(LongSeqHelper.extract(theAny));
			case TCKind._tk_longlong:
				return ArrayUtils.toObject(LongLongSeqHelper.extract(theAny));
			case TCKind._tk_octet:
				final byte[] octetArray = OctetSeqHelper.extract(theAny);
				final short[] shortArray = new short[octetArray.length];
				for (int i = 0; i < octetArray.length; i++) {
					shortArray[i] = UnsignedUtils.toSigned(octetArray[i]);
				}
				return ArrayUtils.toObject(shortArray);
			case TCKind._tk_short:
				return ArrayUtils.toObject(ShortSeqHelper.extract(theAny));
			case TCKind._tk_string:
				return StringSeqHelper.extract(theAny);
			case TCKind._tk_ulong:
				return ArrayUtils.toObject(UnsignedUtils.toSigned(ULongSeqHelper.extract(theAny)));
			case TCKind._tk_ulonglong:
				return UnsignedUtils.toSigned(ULongLongSeqHelper.extract(theAny));
			case TCKind._tk_ushort:
				return ArrayUtils.toObject(UnsignedUtils.toSigned(UShortSeqHelper.extract(theAny)));
			case TCKind._tk_wchar:
				return ArrayUtils.toObject(WCharSeqHelper.extract(theAny));
			case TCKind._tk_wstring:
				return WStringSeqHelper.extract(theAny);
			case TCKind._tk_null:
				return null;
			case TCKind._tk_sequence:
				if (PropertiesHelper.type().equivalent(contentType)) {
					return PropertiesHelper.extract(theAny);
				} else {
					return AnyUtils.extractSequence(theAny, contentType.content_type());
				}
			case TCKind._tk_alias:
				final TypeCode innerContentType = contentType.content_type();
				if (innerContentType.kind().value() == TCKind._tk_sequence) {
					return AnyUtils.extractSequence(theAny, innerContentType);
				} else {
					throw new IllegalArgumentException("Unsupported alias content type: " + innerContentType);
				}
			case TCKind._tk_struct:
				if (DataTypeHelper.type().equivalent(contentType)) {
					return PropertiesHelper.extract(theAny);
				} else {
					throw new IllegalArgumentException("Unsupported struct content type: " + contentType);
				}
			default:
				throw new IllegalArgumentException("Only primitive sequence types supported, unknown conversion: " + contentType);
			}
		} catch (final BAD_OPERATION ex) {
			return null;
		} catch (final BadKind e) {
			return null;
		}
	}

	/**
	 * @deprecated Do not use.
	 */
	@Deprecated
	public static String convertToStringName(final TCKind type) throws BadKind {
		if (type == null) {
			throw new NullPointerException();
		}

		switch (type.value()) {
		case TCKind._tk_any:
			return CORBA_ANY;
		case TCKind._tk_boolean:
			return BOOLEAN;
		case TCKind._tk_char:
			return CHAR;
		case TCKind._tk_double:
			return DOUBLE;
		case TCKind._tk_fixed:
			return CORBA_FIXED;
		case TCKind._tk_float:
			return FLOAT;
		case TCKind._tk_long:
			return LONG;
		case TCKind._tk_longlong:
			return LONGLONG;
		case TCKind._tk_objref:
			return OBJREF;
		case TCKind._tk_octet:
			return OCTET;
		case TCKind._tk_short:
			return SHORT;
		case TCKind._tk_string:
			return STRING;
		case TCKind._tk_TypeCode:
			return CORBA_TYPECODE;
		case TCKind._tk_ulong:
			return ULONG;
		case TCKind._tk_ulonglong:
			return ULONGLONG;
		case TCKind._tk_ushort:
			return USHORT;
		case TCKind._tk_value:
			return CORBA_VALUE;
		case TCKind._tk_wchar:
			return CORBA_WCHAR;
		case TCKind._tk_wstring:
			return CORBA_WSTRING;
		default:
			return ORB.get_primitive_tc(type).name();
		}
	}

	/**
	 * @deprecated Do not use.
	 */
	@Deprecated
	public static TCKind convertToTCKind(final String type) {
		if (type == null || "".equals(type)) {
			return TCKind.tk_null;
		}

		switch (type) {
		case BOOLEAN:
			return TCKind.tk_boolean;
		case CHAR:
			return TCKind.tk_char;
		case DOUBLE:
			return TCKind.tk_double;
		case CORBA_FIXED:
			return TCKind.tk_fixed;
		case FLOAT:
			return TCKind.tk_float;
		case LONG:
			return TCKind.tk_long;
		case LONGLONG:
			return TCKind.tk_longlong;
		case OBJREF:
			return TCKind.tk_objref;
		case OCTET:
			return TCKind.tk_octet;
		case SHORT:
			return TCKind.tk_short;
		case STRING:
			return TCKind.tk_string;
		case CORBA_TYPECODE:
			return TCKind.tk_TypeCode;
		case ULONG:
			return TCKind.tk_ulong;
		case ULONGLONG:
			return TCKind.tk_ulonglong;
		case USHORT:
			return TCKind.tk_ushort;
		case CORBA_VALUE:
			return TCKind.tk_value;
		case CORBA_WCHAR:
			return TCKind.tk_wchar;
		case CORBA_WSTRING:
			return TCKind.tk_wstring;
		default:
			throw new IllegalArgumentException("Unknown type: " + type);
		}
	}

	/**
	 * @since 3.4
	 * @deprecated Use {@link #toAny(Object, String, boolean)}
	 */
	@Deprecated
	public static Any toAny(final Object value, final TCKind type, boolean complex) {
		if (type == null || type.value() == TCKind._tk_null) {
			return ORB.create_any();
		}

		try {
			return toAny(value, convertToStringName(type), complex);
		} catch (BadKind e) {
			return null;
		}
	}

	/**
	 * @since 3.0
	 * @deprecated Do not use.
	 */
	@Deprecated
	public static Any insertInto(final Any retVal, final Object value, final TCKind type) {
		if (retVal == null) {
			return null;
		}
		return AnyUtils.toAny(value, type, false);
	}

	private static Any primitiveToAny(final Object value, final String type) {
		final Any retVal = ORB.create_any();

		// Null yields null
		if (value == null) {
			return retVal;
		}

		switch (type) {
		case CORBA_ANY:
			retVal.insert_any((Any) value);
			return retVal;
		case BOOLEAN:
			retVal.insert_boolean((Boolean) value);
			return retVal;
		case CHAR:
			retVal.insert_char((Character) value);
			return retVal;
		case DOUBLE:
			retVal.insert_double(((Number) value).doubleValue());
			return retVal;
		case CORBA_FIXED:
			retVal.insert_fixed((BigDecimal) value);
			return retVal;
		case FLOAT:
			retVal.insert_float(((Number) value).floatValue());
			return retVal;
		case LONG:
			retVal.insert_long(((Number) value).intValue());
			return retVal;
		case LONGLONG:
			retVal.insert_longlong(((Number) value).longValue());
			return retVal;
		case OBJREF:
			if (value instanceof org.omg.CORBA.Object) {
				retVal.insert_Object((org.omg.CORBA.Object) value);
			}
			return retVal;
		case OCTET:
			retVal.insert_octet(UnsignedUtils.toUnsigned(((Number) value).shortValue()));
			return retVal;
		case SHORT:
			retVal.insert_short(((Number) value).shortValue());
			return retVal;
		case STRING:
			retVal.insert_string(value.toString());
			return retVal;
		case CORBA_TYPECODE:
			retVal.insert_TypeCode((TypeCode) value);
			return retVal;
		case ULONG:
			retVal.insert_ulong(((Number) value).intValue());
			return retVal;
		case ULONGLONG:
			retVal.insert_ulonglong(((Number) value).longValue());
			return retVal;
		case USHORT:
			retVal.insert_ushort(((Number) value).shortValue());
			return retVal;
		case CORBA_VALUE:
			retVal.insert_Value((Serializable) value);
			return retVal;
		case CORBA_WCHAR:
			retVal.insert_wchar((Character) value);
			return retVal;
		case CORBA_WSTRING:
			retVal.insert_wstring(value.toString());
			return retVal;
		case UTCTIME:
			return ((UTCTime) value).toAny();
		default:
			throw new IllegalArgumentException("Unknown target type: " + type);
		}
	}

	/**
	 * Inserts a Java value into an Any using the specified type and complex flag.
	 * @param value the Java value (e.g. {@link Boolean}, {@link Float}, {@link ComplexNumber})
	 * @param type the property type (e.g. "boolean", "float", "ulong")
	 * @param complex true if the type is complex
	 * @since 3.4
	 * @see #stringToAny(String, String, boolean)
	 */
	public static Any toAny(Object value, final String type, boolean complex) {
		// Null yields null
		if (value == null || type == null) {
			return ORB.create_any();
		}

		// If the value is a string, but the requested type isn't, parse the string to the requested Java type
		if ((value instanceof String) && !STRING.equals(type)) {
			value = AnyUtils.convertString((String) value, type, complex);
		}

		// Sequences
		if (value.getClass().isArray()) {
			return AnyUtils.toAnySequence(value, type, complex);
		}

		// Simples
		if (!complex) {
			return AnyUtils.primitiveToAny(value, type);
		} else {
			if (value instanceof ComplexNumber) {
				return ((ComplexNumber) value).toAny();
			} else {
				throw new IllegalArgumentException("Complex numbers must be of type: " + ComplexNumber.class.getName());
			}
		}
	}

	/**
	 * @since 3.4
	 */
	public static Any toAny(final Object[] array, final String type, boolean complex) {
		final Object[] convArray = AnyUtils.convertStringArray(array, type, complex);
		return AnyUtils.toAnySequence(convArray, type, complex);
	}

	/**
	 * Attempts to parse an array of strings to an array of Java values.
	 * 
	 * @param values the string form of the values
	 * @param type the property values' type (e.g. "long")
	 * @param complex If the values should be interrupted as a complex numbers
	 * @return The Java objects in an {@link Object} array
	 * @since 4.7
	 */
	public static Object[] convertStringArray(final Object[] values, final String type, boolean complex) {
		Object[] retVal = values;
		if (values instanceof String[] && !STRING.equals(type)) {
			retVal = new Object[values.length];
			for (int i = 0; i < values.length; ++i) {
				final String val = (String) values[i];
				retVal[i] = AnyUtils.convertString(val, type, complex);
			}
		}

		return retVal;
	}

	/**
	 * Converts an array of values to the appropriate <code>Any</code> sequence.
	 * @param array The <b>contents</b> of the array must be of an appropriate type (the array's type is unimportant)
	 * @param type A REDHAWK property type
	 * @param complex
	 * @return
	 * @since 4.0
	 */
	public static Any toAnySequence(final Object array, final String type, boolean complex) {
		if (type == null) {
			throw new NullPointerException("REDHAWK property type");
		}

		final Any any = ORB.create_any();

		if (complex) {
			switch (type) {
			case BOOLEAN:
				insertComplexBooleanArray(any, array);
				return any;
			case CHAR:
				insertComplexUByteArray(any, array);
				return any;
			case DOUBLE:
				insertComplexDoubleArray(any, array);
				return any;
			case FLOAT:
				insertComplexFloatArray(any, array);
				return any;
			case LONG:
				insertComplexLongArray(any, array);
				return any;
			case LONGLONG:
				insertComplexLongLongArray(any, array);
				return any;
			case OCTET:
				insertComplexOctetArray(any, array);
				return any;
			case SHORT:
				insertComplexShortArray(any, array);
				return any;
			case ULONG:
				insertComplexULongArray(any, array);
				return any;
			case ULONGLONG:
				insertComplexULongLongArray(any, array);
				return any;
			case USHORT:
				insertComplexUShortArray(any, array);
				return any;
			default:
				String msg = String.format("Type %s cannot be complex", type);
				throw new IllegalArgumentException(msg);
			}
		}

		switch (type) {
		case BOOLEAN:
			AnyUtils.insertBooleanArray(any, array);
			return any;
		case CHAR:
			AnyUtils.insertCharArray(any, array);
			return any;
		case DOUBLE:
			AnyUtils.insertDoubleArray(any, array);
			return any;
		case FLOAT:
			AnyUtils.insertFloatArray(any, array);
			return any;
		case LONG:
			AnyUtils.insertLongArray(any, array);
			return any;
		case LONGLONG:
			AnyUtils.insertLongLongArray(any, array);
			return any;
		case OBJREF:
			throw new IllegalArgumentException("Sequences of type objref are not supported");
		case OCTET:
			AnyUtils.insertOctetArray(any, array);
			return any;
		case SHORT:
			AnyUtils.insertShortArray(any, array);
			return any;
		case STRING:
			StringSeqHelper.insert(any, AnyUtils.convertStringArray(array));
			return any;
		case ULONG:
			AnyUtils.insertULongArray(any, array);
			return any;
		case ULONGLONG:
			AnyUtils.insertULongLongArray(any, array);
			return any;
		case USHORT:
			AnyUtils.insertUShortArray(any, array);
			return any;
		case UTCTIME:
			insertUTCTimeArray(any, array);
			return any;
		default:
			throw new IllegalArgumentException("Unknown REDHAWK property type: " + type);
		}
	}

	private static String[] convertStringArray(final Object value) {
		if (value instanceof String[]) {
			return (String[]) value;
		}
		Object[] objArray;
		if (value instanceof Object[]) {
			objArray = (Object[]) value;
		} else {
			objArray = new Object[] { value };
		}
		try {
			return Arrays.asList(objArray).toArray(new String[objArray.length]);
		} catch (final ArrayStoreException e) {
			final String[] retVal = new String[objArray.length];
			for (int i = 0; i < retVal.length; i++) {
				if (objArray[i] == null) {
					retVal[i] = "";
				} else {
					retVal[i] = objArray[i].toString();
				}
			}
			return retVal;
		}
	}

	/**
	 * Insert an array containing <code>UTCTime</code> into an <code>Any</code> as a CORBA CF.UTCTime
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertUTCTimeArray(Any any, Object array) {
		final int len = Array.getLength(array);
		final CF.UTCTime[] newArray = new CF.UTCTime[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((UTCTime) Array.get(array, i)).getWrappedTime();
		}
		UTCTimeSequenceHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>short</code>, <code>Short</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA unsigned short sequence.
	 * @param any
	 * @param array
	 */
	private static void insertUShortArray(final Any any, final Object array) {
		final short[] primValue = PrimitiveArrayUtils.convertToShortArray(array);
		if (primValue != null) {
			UShortSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>long</code>, <code>Long</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA unsigned long long sequence.
	 * @param any
	 * @param array
	 */
	private static void insertULongLongArray(final Any any, final Object array) {
		final long[] primValue = PrimitiveArrayUtils.convertToLongArray(array);
		if (primValue != null) {
			ULongLongSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>int</code>, <code>Integer</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA unsigned long sequence.
	 * @param any
	 * @param array
	 */
	private static void insertULongArray(final Any any, final Object array) {
		final int[] primValue = PrimitiveArrayUtils.convertToIntArray(array);
		if (primValue != null) {
			ULongSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>short</code>, <code>Short</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA short sequence.
	 * @param any
	 * @param array
	 */
	private static void insertShortArray(final Any any, final Object array) {
		final short[] primValue = PrimitiveArrayUtils.convertToShortArray(array);
		if (primValue != null) {
			ShortSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>byte</code>, <code>Byte</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA octet sequence.
	 * @param any
	 * @param array
	 */
	private static void insertOctetArray(final Any any, final Object array) {
		final byte[] primValue = PrimitiveArrayUtils.convertToByteArray(array);
		if (primValue != null) {
			OctetSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>long</code>, <code>Long</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA long sequence.
	 * @param any
	 * @param array
	 */
	private static void insertLongLongArray(final Any any, final Object array) {
		final long[] primValue = PrimitiveArrayUtils.convertToLongArray(array);
		if (primValue != null) {
			LongLongSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>int</code>, <code>Integer</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA long sequence.
	 * @param any
	 * @param array
	 */
	private static void insertLongArray(final Any any, final Object array) {
		final int[] primValue = PrimitiveArrayUtils.convertToIntArray(array);
		if (primValue != null) {
			LongSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>float</code>, <code>Float</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA float sequence.
	 * @param any
	 * @param array
	 */
	private static void insertFloatArray(final Any any, final Object array) {
		final float[] primValue = PrimitiveArrayUtils.convertToFloatArray(array);
		if (primValue != null) {
			FloatSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>double</code>, <code>Double</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA double sequence.
	 * @param any
	 * @param array
	 */
	private static void insertDoubleArray(final Any any, final Object array) {
		final double[] primValue = PrimitiveArrayUtils.convertToDoubleArray(array);
		if (primValue != null) {
			DoubleSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>char</code>, <code>Character</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA character sequence.
	 * @param any
	 * @param array
	 */
	private static void insertCharArray(final Any any, final Object array) {
		final char[] primValue = PrimitiveArrayUtils.convertToCharArray(array);
		if (primValue != null) {
			CharSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>bool</code>, <code>Boolean</code>, or <code>Number</code> into an
	 * <code>Any</code> as a CORBA boolean sequence.
	 * @param any
	 * @param array
	 */
	private static void insertBooleanArray(final Any any, final Object array) {
		final boolean[] primValue = PrimitiveArrayUtils.convertToBooleanArray(array);
		if (primValue != null) {
			BooleanSeqHelper.insert(any, primValue);
		}
	}

	/**
	 * Insert an array containing <code>ComplexBoolean</code> into an <code>Any</code> as a CORBA complexBoolean
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexBooleanArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexBoolean[] newArray = new CF.complexBoolean[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexBoolean) Array.get(array, i)).toCFType();
		}
		complexBooleanSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexOctet</code> into an <code>Any</code> as a CORBA complexOctet
	 * sequence.
	 * <p/>
	 * For legacy reasons, also supports {@link ComplexByte}.
	 * @param any
	 * @param array
	 */
	@SuppressWarnings("deprecation")
	private static void insertComplexOctetArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexOctet[] newArray = new CF.complexOctet[len];
		if (Array.getLength(array) > 0) {
			if (Array.get(array, 0) instanceof ComplexOctet) {
				for (int i = 0; i < len; i++) {
					newArray[i] = ((ComplexOctet) Array.get(array, i)).toCFType();
				}
			} else {
				for (int i = 0; i < len; i++) {
					newArray[i] = ((ComplexByte) Array.get(array, i)).toCFType();
				}
			}
		}
		complexOctetSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexDouble</code> into an <code>Any</code> as a CORBA complexDouble
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexDoubleArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexDouble[] newArray = new CF.complexDouble[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexDouble) Array.get(array, i)).toCFType();
		}
		complexDoubleSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexFloat</code> into an <code>Any</code> as a CORBA complexFloat
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexFloatArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexFloat[] newArray = new CF.complexFloat[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexFloat) Array.get(array, i)).toCFType();
		}
		complexFloatSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexLong</code> into an <code>Any</code> as a CORBA complexLong
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexLongArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexLong[] newArray = new CF.complexLong[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexLong) Array.get(array, i)).toCFType();
		}
		complexLongSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexLongLong</code> into an <code>Any</code> as a CORBA complexLongLong
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexLongLongArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexLongLong[] newArray = new CF.complexLongLong[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexLongLong) Array.get(array, i)).toCFType();
		}
		complexLongLongSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexShort</code> into an <code>Any</code> as a CORBA complexShort
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexShortArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexShort[] newArray = new CF.complexShort[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexShort) Array.get(array, i)).toCFType();
		}
		complexShortSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexUByte</code> into an <code>Any</code> as a CORBA complexChar
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexUByteArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexChar[] newArray = new CF.complexChar[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexUByte) Array.get(array, i)).toCFType();
		}
		complexCharSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexULong</code> into an <code>Any</code> as a CORBA complexULong
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexULongArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexULong[] newArray = new CF.complexULong[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexULong) Array.get(array, i)).toCFType();
		}
		complexULongSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexULongLong</code> into an <code>Any</code> as a CORBA complexULongLong
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexULongLongArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexULongLong[] newArray = new CF.complexULongLong[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexULongLong) Array.get(array, i)).toCFType();
		}
		complexULongLongSeqHelper.insert(any, newArray);
	}

	/**
	 * Insert an array containing <code>ComplexUShort</code> into an <code>Any</code> as a CORBA complexUShort
	 * sequence.
	 * @param any
	 * @param array
	 */
	private static void insertComplexUShortArray(final Any any, final Object array) {
		final int len = Array.getLength(array);
		final CF.complexUShort[] newArray = new CF.complexUShort[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = ((ComplexUShort) Array.get(array, i)).toCFType();
		}
		complexUShortSeqHelper.insert(any, newArray);
	}

	/**
	 * Attempts to parse the string value to the appropriate Java type, and then insert it into an {@link Any}.
	 *
	 * @param value the string form of the value
	 * @param type the property value type (e.g. "long")
	 * @param complex If the value should be interrupted as a complex number
	 * @since 3.4
	 */
	public static Any stringToAny(final String value, final String type, boolean complex) {
		final Object newValue = AnyUtils.convertString(value, type, complex);
		return AnyUtils.toAny(newValue, type, complex);
	}

	/**
	 * @since 3.6
	 */
	public static boolean isSequence(DataType dt) {
		TypeCode typeCode = dt.value.type();
		// Do this check because extract doesn't throw correctly
		try {
			final TCKind kind = typeCode.kind();
			switch (kind.value()) {
			case TCKind._tk_sequence:
				return !PropertiesHelper.type().equivalent(typeCode);
			case TCKind._tk_alias:
				return ComplexNumber.isSequence(dt.value) || UTCTimeSequenceHelper.type().equal(typeCode);
			default:
				return false;
			}
		} catch (final BAD_OPERATION ex) {
			return false;
		}
	}

	/**
	 * @since 3.6
	 */
	public static boolean isStructSequence(DataType dt) {
		return AnySeqHelper.type().equivalent(dt.value.type());
	}

	/**
	 * @since 3.6
	 */
	public static boolean isStruct(DataType dt) {
		return PropertiesHelper.type().equivalent(dt.value.type());
	}

	/**
	 * @since 3.6
	 */
	public static boolean isSimple(DataType dt) {
		TypeCode typeCode = dt.value.type();
		// Do this check because extract doesn't throw correctly
		try {
			// Check Complex Types
			if (complexBooleanHelper.type().equivalent(typeCode) //
				|| complexDoubleHelper.type().equivalent(typeCode) //
				|| complexFloatHelper.type().equivalent(typeCode) //
				|| complexLongHelper.type().equivalent(typeCode) //
				|| complexLongLongHelper.type().equivalent(typeCode) //
				|| complexShortHelper.type().equivalent(typeCode) //
				|| complexULongHelper.type().equivalent(typeCode) //
				|| complexULongLongHelper.type().equivalent(typeCode) //
				|| complexUShortHelper.type().equivalent(typeCode) //
				|| complexOctetHelper.type().equivalent(typeCode) //
				|| complexCharHelper.type().equivalent(typeCode) //
				|| UTCTimeHelper.type().equivalent(typeCode)) {
				return true;
			}

			final TCKind kind = typeCode.kind();
			switch (kind.value()) {
			case TCKind._tk_boolean:
			case TCKind._tk_char:
			case TCKind._tk_double:
			case TCKind._tk_float:
			case TCKind._tk_long:
			case TCKind._tk_longlong:
			case TCKind._tk_octet:
			case TCKind._tk_short:
			case TCKind._tk_string:
			case TCKind._tk_ulong:
			case TCKind._tk_ulonglong:
			case TCKind._tk_ushort:
			case TCKind._tk_wchar:
			case TCKind._tk_wstring:
			case TCKind._tk_null:
				return true;
			case TCKind._tk_any:
			case TCKind._tk_fixed:
			case TCKind._tk_objref:
			case TCKind._tk_TypeCode:
			case TCKind._tk_value:
			case TCKind._tk_sequence:
			case TCKind._tk_alias:
			case TCKind._tk_struct:
			case TCKind._tk_longdouble:
			case TCKind._tk_array:
			case TCKind._tk_abstract_interface:
			case TCKind._tk_enum:
			case TCKind._tk_except:
			case TCKind._tk_native:
			case TCKind._tk_Principal:
			case TCKind._tk_union:
			case TCKind._tk_value_box:
			case TCKind._tk_void:
			default:
				return false;
			}
		} catch (final BAD_OPERATION ex) {
			return false;
		}
	}

}

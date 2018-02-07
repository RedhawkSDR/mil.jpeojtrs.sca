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
import java.util.List;

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

public final class AnyUtils {

	private static final int RADIX_DECIMAL = 10;
	private static final int RADIX_HEX = 16;
	private static final int RADIX_OCTAL = 8;

	private AnyUtils() {
	}

	/**
	 * Attempts to convert the string value to the appropriate Java type.
	 * 
	 * @param stringValue the string form of the value
	 * @param type the string form of the TypeCode
	 * @param complex If the value should be interrupted as a complex number, pass null if it is not a number
	 * @return A Java object of theString corresponding to the typecode
	 * @since 3.4
	 */
	public static Object convertString(final String stringValue, final String type, boolean complex) {
		if (!complex) {
			return AnyUtils.primitiveConvertString(stringValue, type);
		}
		return ComplexNumber.valueOf(type, stringValue);
	}

	public static Object convertString(final String stringValue, final String type) {
		return AnyUtils.convertString(stringValue, type, false);

	}

	/**
	 * Attempts to convert the string value to the appropriate Java type.
	 * 
	 * @param stringValue the string form of the value
	 * @param type the string form of the TypeCode
	 * @return A Java object of theString corresponding to the typecode
	 */
	private static Object primitiveConvertString(final String stringValue, final String type) {
		if (stringValue == null) {
			return null;
		}
		if ("string".equals(type)) {
			return stringValue;
		} else if ("wstring".equals(type)) {
			return stringValue;
		} else if ("boolean".equals(type)) {
			if ("true".equalsIgnoreCase(stringValue) || "false".equalsIgnoreCase(stringValue)) {
				return Boolean.parseBoolean(stringValue);
			}
			throw new IllegalArgumentException(stringValue + " is not a valid boolean value");
		} else if ("char".equals(type)) {
			switch (stringValue.length()) {
			case 1:
				return stringValue.charAt(0);
			case 0:
				return null;
			default:
				throw new IllegalArgumentException(stringValue + " is not a valid char value");
			}
		} else if ("wchar".equals(type)) {
			return stringValue.charAt(0);
		} else if ("double".equals(type)) {
			return Double.parseDouble(stringValue);
		} else if ("float".equals(type)) {
			return Float.parseFloat(stringValue);
		} else if ("short".equals(type)) {
			return Short.decode(stringValue);
		} else if ("long".equals(type)) {
			return Integer.decode(stringValue);
		} else if ("longlong".equals(type)) {
			return Long.decode(stringValue);
		} else if ("ulong".equals(type)) {
			final long MAX_UINT = 2L * Integer.MAX_VALUE + 1L;
			final Long retVal = Long.decode(stringValue);
			if (retVal < 0 || retVal > MAX_UINT) {
				throw new IllegalArgumentException("ulong value must be greater than '0' and less than " + MAX_UINT);
			}
			return retVal;
		} else if ("ushort".equals(type)) {
			final int MAX_USHORT = 2 * Short.MAX_VALUE + 1;
			final Integer retVal = Integer.decode(stringValue);
			if (retVal < 0 || retVal > MAX_USHORT) {
				throw new IllegalArgumentException("ushort value must be greater than '0' and less than " + MAX_USHORT);
			}
			return retVal;
		} else if ("ulonglong".equals(type)) {
			final BigInteger MAX_ULONG_LONG = BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);
			final BigInteger retVal = AnyUtils.bigIntegerDecode(stringValue);
			if (retVal.compareTo(BigInteger.ZERO) < 0 || retVal.compareTo(MAX_ULONG_LONG) > 0) {
				throw new IllegalArgumentException("ulonglong value must be greater than '0' and less than " + MAX_ULONG_LONG.toString());
			}
			return retVal;
		} else if ("objref".equals(type)) {
			if ("".equals(stringValue)) {
				return null;
			}
			final List<String> objrefPrefix = Arrays.asList("IOR:", "corbaname:", "corbaloc:");
			for (final String prefix : objrefPrefix) {
				if (stringValue.startsWith(prefix)) {
					return stringValue;
				}
			}
			throw new IllegalArgumentException(stringValue + " is not a valid objref value");
		} else if ("octet".equals(type)) {
			final short MIN_OCTET = 0;
			final short MAX_OCTET = 0xFF;
			final short val = Short.decode(stringValue);
			if (val <= MAX_OCTET && val >= MIN_OCTET) {
				return Short.valueOf(val);
			}
			throw new IllegalArgumentException(stringValue + " is not a valid octet value");
		} else {
			throw new IllegalArgumentException("Unknown CORBA Type: " + type);
		}
	}

	/**
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
	 * @since 3.0
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
				//				return Long.toBinaryString(theAny.extract_ulonglong()), 2);
				return UnsignedUtils.toSigned(theAny.extract_ulonglong());
			case TCKind._tk_ushort:
				//				return (short) (theAny.extract_ushort() & AnyUtils.MAX_SHORT);
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
				if (complexBooleanHelper.type().equivalent(typeCode)) {
					return ComplexBoolean.valueOf(theAny);
				} else if (complexDoubleHelper.type().equivalent(typeCode)) {
					return ComplexDouble.valueOf(theAny);
				} else if (complexFloatHelper.type().equivalent(typeCode)) {
					return ComplexFloat.valueOf(theAny);
				} else if (complexLongHelper.type().equivalent(typeCode)) {
					return ComplexLong.valueOf(theAny);
				} else if (complexLongLongHelper.type().equivalent(typeCode)) {
					return ComplexLongLong.valueOf(theAny);
				} else if (complexShortHelper.type().equivalent(typeCode)) {
					return ComplexShort.valueOf(theAny);
				} else if (complexULongHelper.type().equivalent(typeCode)) {
					return ComplexULong.valueOf(theAny);
				} else if (complexULongLongHelper.type().equivalent(typeCode)) {
					return ComplexULongLong.valueOf(theAny);
				} else if (complexUShortHelper.type().equivalent(typeCode)) {
					return ComplexUShort.valueOf(theAny);
				} else if (complexOctetHelper.type().equivalent(typeCode)) {
					return ComplexOctet.valueOf(theAny);
				} else if (complexCharHelper.type().equivalent(typeCode)) {
					return ComplexUByte.valueOf(theAny);
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

	public static String convertToStringName(final TCKind type) throws BadKind {
		if (type == null) {
			throw new NullPointerException();
		}
		return JacorbUtil.init().get_primitive_tc(type).name();
	}

	public static TCKind convertToTCKind(final String type) {
		if (type == null || "".equals(type)) {
			return TCKind.tk_null;
		} else if ("boolean".equals(type)) {
			return TCKind.tk_boolean;
		} else if ("char".equals(type)) {
			return TCKind.tk_char;
		} else if ("double".equals(type)) {
			return TCKind.tk_double;
		} else if ("fixed".equals(type)) {
			return TCKind.tk_fixed;
		} else if ("float".equals(type)) {
			return TCKind.tk_float;
		} else if ("long".equals(type)) {
			return TCKind.tk_long;
		} else if ("longlong".equals(type)) {
			return TCKind.tk_longlong;
		} else if ("objref".equals(type)) {
			return TCKind.tk_objref;
		} else if ("octet".equals(type)) {
			return TCKind.tk_octet;
		} else if ("short".equals(type)) {
			return TCKind.tk_short;
		} else if ("string".equals(type)) {
			return TCKind.tk_string;
		} else if ("typecode".equals(type)) {
			return TCKind.tk_TypeCode;
		} else if ("ulong".equals(type)) {
			return TCKind.tk_ulong;
		} else if ("ulonglong".equals(type)) {
			return TCKind.tk_ulonglong;
		} else if ("ushort".equals(type)) {
			return TCKind.tk_ushort;
		} else if ("value".equals(type)) {
			return TCKind.tk_value;
		} else if ("wchar".equals(type)) {
			return TCKind.tk_wchar;
		} else if ("wstring".equals(type)) {
			return TCKind.tk_wstring;
		} else {
			throw new IllegalArgumentException("Unknown type: " + type);
		}
	}

	/**
	 * @since 3.4
	 */
	public static Any toAny(final Object value, final TCKind type, boolean complex) {
		if (value == null) {
			return JacorbUtil.init().create_any();
		}
		if (value.getClass().isArray()) {
			try {
				return AnyUtils.toAnySequence(value, convertToStringName(type), complex);
			} catch (BadKind e) {
				return null;
			}
		}
		if (value instanceof ComplexNumber) {
			complex = true;
		}
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
	 * @since 3.0
	 */
	public static Any insertInto(final Any retVal, final Object value, final TCKind type) {
		if (retVal == null) {
			return null;
		}
		return AnyUtils.toAny(value, type, false);
	}

	/**
	 * @since 3.0
	 */
	private static Any primitiveToAny(final Object value, final TCKind type) {
		final Any retVal = JacorbUtil.init().create_any();
		if (value == null) {
			return retVal;
		}
		switch (type.value()) {
		case TCKind._tk_null:
			break;
		case TCKind._tk_any:
			retVal.insert_any((Any) value);
			break;
		case TCKind._tk_boolean:
			retVal.insert_boolean((Boolean) value);
			break;
		case TCKind._tk_char:
			retVal.insert_char((Character) value);
			break;
		case TCKind._tk_double:
			retVal.insert_double(((Number) value).doubleValue());
			break;
		case TCKind._tk_fixed:
			retVal.insert_fixed((BigDecimal) value);
			break;
		case TCKind._tk_float:
			retVal.insert_float(((Number) value).floatValue());
			break;
		case TCKind._tk_long:
			retVal.insert_long(((Number) value).intValue());
			break;
		case TCKind._tk_longlong:
			retVal.insert_longlong(((Number) value).longValue());
			break;
		case TCKind._tk_objref:
			if (value instanceof org.omg.CORBA.Object) {
				retVal.insert_Object((org.omg.CORBA.Object) value);
			}
			break;
		case TCKind._tk_octet:
			retVal.insert_octet(UnsignedUtils.toUnsigned(((Number) value).shortValue()));
			break;
		case TCKind._tk_short:
			retVal.insert_short(((Number) value).shortValue());
			break;
		case TCKind._tk_string:
			retVal.insert_string(value.toString());
			break;
		case TCKind._tk_TypeCode:
			retVal.insert_TypeCode((TypeCode) value);
			break;
		case TCKind._tk_ulong:
			retVal.insert_ulong(((Number) value).intValue());
			break;
		case TCKind._tk_ulonglong:
			retVal.insert_ulonglong(((Number) value).longValue());
			break;
		case TCKind._tk_ushort:
			retVal.insert_ushort(((Number) value).shortValue());
			break;
		case TCKind._tk_value:
			retVal.insert_Value((Serializable) value);
			break;
		case TCKind._tk_wchar:
			retVal.insert_wchar((Character) value);
			break;
		case TCKind._tk_wstring:
			retVal.insert_wstring(value.toString());
			break;
		default:
			throw new IllegalArgumentException("Unknown target type: TCKind value " + type.value());
		}
		return retVal;
	}

	/**
	 * @since 3.4
	 */
	public static Any toAny(final Object value, final String type, boolean complex) {
		final TCKind kind = AnyUtils.convertToTCKind(type);
		if (value instanceof ComplexNumber) {
			complex = true;
		}

		if ((value instanceof String) && (kind != TCKind.tk_string)) {

			return AnyUtils.stringToAny((String) value, type, complex);
		}

		return AnyUtils.toAny(value, kind, complex);
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
	 * @since 4.6
	 */
	public static Object[] convertStringArray(final Object[] values, final String type, boolean complex) {
		Object[] retVal = values;
		if (values instanceof String[] && !"string".equals(type)) {
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

		final Any any = JacorbUtil.init().create_any();

		if (complex) {
			if ("boolean".equals(type)) {
				insertComplexBooleanArray(any, array);
			} else if ("char".equals(type)) {
				insertComplexUByteArray(any, array);
			} else if ("double".equals(type)) {
				insertComplexDoubleArray(any, array);
			} else if ("float".equals(type)) {
				insertComplexFloatArray(any, array);
			} else if ("long".equals(type)) {
				insertComplexLongArray(any, array);
			} else if ("longlong".equals(type)) {
				insertComplexLongLongArray(any, array);
			} else if ("octet".equals(type)) {
				insertComplexOctetArray(any, array);
			} else if ("short".equals(type)) {
				insertComplexShortArray(any, array);
			} else if ("ulong".equals(type)) {
				insertComplexULongArray(any, array);
			} else if ("ulonglong".equals(type)) {
				insertComplexULongLongArray(any, array);
			} else if ("ushort".equals(type)) {
				insertComplexUShortArray(any, array);
			} else {
				String msg = String.format("Type %s cannot be complex", type);
				throw new IllegalArgumentException(msg);
			}
			return any;
		}

		if ("boolean".equals(type)) {
			AnyUtils.insertBooleanArray(any, array);
		} else if ("char".equals(type)) {
			AnyUtils.insertCharArray(any, array);
		} else if ("double".equals(type)) {
			AnyUtils.insertDoubleArray(any, array);
		} else if ("float".equals(type)) {
			AnyUtils.insertFloatArray(any, array);
		} else if ("long".equals(type)) {
			AnyUtils.insertLongArray(any, array);
		} else if ("longlong".equals(type)) {
			AnyUtils.insertLongLongArray(any, array);
		} else if ("objref".equals(type)) {
			throw new IllegalArgumentException("Sequences of type objref are not supported");
		} else if ("octet".equals(type)) {
			AnyUtils.insertOctetArray(any, array);
		} else if ("short".equals(type)) {
			AnyUtils.insertShortArray(any, array);
		} else if ("string".equals(type)) {
			StringSeqHelper.insert(any, AnyUtils.convertStringArray(array));
		} else if ("ulong".equals(type)) {
			AnyUtils.insertULongArray(any, array);
		} else if ("ulonglong".equals(type)) {
			AnyUtils.insertULongLongArray(any, array);
		} else if ("ushort".equals(type)) {
			AnyUtils.insertUShortArray(any, array);
		} else {
			throw new IllegalArgumentException("Unknown REDHAWK property type: " + type);
		}
		return any;
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
	 * @since 3.4
	 */
	public static Any stringToAny(final String value, final String type, boolean complex) {
		final Object newValue = AnyUtils.convertString(value, type, complex);
		return AnyUtils.toAny(newValue, AnyUtils.convertToTCKind(type), complex);
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
				return ComplexNumber.isSequence(dt.value);
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
				|| complexCharHelper.type().equivalent(typeCode)) {
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

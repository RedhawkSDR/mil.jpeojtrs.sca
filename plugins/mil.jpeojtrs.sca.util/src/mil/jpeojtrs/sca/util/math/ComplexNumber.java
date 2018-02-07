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
package mil.jpeojtrs.sca.util.math;

import org.omg.CORBA.Any;
import org.omg.CORBA.TCKind;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.TypeCodePackage.BadKind;

import CF.complexCharSeqHelper;
import CF.complexDoubleSeqHelper;
import CF.complexFloatSeqHelper;
import CF.complexLongLongSeqHelper;
import CF.complexLongSeqHelper;
import CF.complexOctetSeqHelper;
import CF.complexShortSeqHelper;
import CF.complexULongLongSeqHelper;
import CF.complexULongSeqHelper;
import CF.complexUShortSeqHelper;

/**
 * @since 3.4
 */
public abstract class ComplexNumber {

	public abstract Any toAny();

	public abstract Object getValue(int index);

	public abstract int getSize();

	/**
	 * Returns a functional interface to a method that can extract the {@link Any} into an appropriate array
	 * of {@link ComplexNumber}.
	 * @param any
	 * @return The converter, or null if the {@link Any} is of the wrong type
	 */
	private static IComplexSequenceConverter getSequenceConverter(Any any) {
		TypeCode tc = any.type();
		if (tc.kind().value() != TCKind._tk_alias) {
			return null;
		}

		String name;
		try {
			name = tc.name();
		} catch (BadKind e) {
			// Should never occur (TCKind == alias should guarantee a name)
			return null;
		}

		// Use a string switch to provide a fast "99%" match. We then check the exact types to be sure they match.
		switch (name) {
		case "complexBooleanSeq":
			if (CF.complexBooleanSeqHelper.type().equivalent(tc)) {
				return ComplexBoolean::valueOfSequence;
			}
			return null;
		case "complexDoubleSeq":
			if (complexDoubleSeqHelper.type().equivalent(tc)) {
				return ComplexDouble::valueOfSequence;
			}
			return null;
		case "complexFloatSeq":
			if (complexFloatSeqHelper.type().equivalent(tc)) {
				return ComplexFloat::valueOfSequence;
			}
			return null;
		case "complexLongSeq":
			if (complexLongSeqHelper.type().equivalent(tc)) {
				return ComplexLong::valueOfSequence;
			}
			return null;
		case "complexLongLongSeq":
			if (complexLongLongSeqHelper.type().equivalent(tc)) {
				return ComplexLongLong::valueOfSequence;
			}
			return null;
		case "complexShortSeq":
			if (complexShortSeqHelper.type().equivalent(tc)) {
				return ComplexShort::valueOfSequence;
			}
			return null;
		case "complexULongSeq":
			if (complexULongSeqHelper.type().equivalent(tc)) {
				return ComplexULong::valueOfSequence;
			}
			return null;
		case "complexULongLongSeq":
			if (complexULongLongSeqHelper.type().equivalent(tc)) {
				return ComplexULongLong::valueOfSequence;
			}
			return null;
		case "complexUShortSeq":
			if (complexUShortSeqHelper.type().equivalent(tc)) {
				return ComplexUShort::valueOfSequence;
			}
			return null;
		case "complexOctetSeq":
			if (complexOctetSeqHelper.type().equivalent(tc)) {
				return ComplexOctet::valueOfSequence;
			}
			return null;
		case "complexCharSeq":
			if (complexCharSeqHelper.type().equivalent(tc)) {
				return ComplexUByte::valueOfSequence;
			}
			return null;
		default:
			return null;
		}
	}

	/**
	 * Determine if the {@link Any} holds a Redhawk complex number sequence. Use {@link #valueOfSequence(Any)} instead
	 * if you want to try to extract it.
	 * @param any
	 * @return
	 * @since 4.7
	 */
	public static boolean isSequence(Any any) {
		return getSequenceConverter(any) != null;
	}

	/**
	 * Extracts the Redhawk complex number sequence from the <code>Any</code> to an array of {@link ComplexNumber}. Use
	 * {@link #isSequence(Any)} if you only want to check to if the {@link Any} holds a sequence.
	 * @param any The <code>Any</code> to extract
	 * @return An array of {@link ComplexNumber}, or null if the <code>Any</code>'s type code isn't recognized
	 * @since 4.0
	 */
	public static ComplexNumber[] valueOfSequence(Any any) {
		IComplexSequenceConverter converter = getSequenceConverter(any);
		return (converter != null) ? converter.valueOfSequence(any) : null;
	}

	/**
	 * Converts a string to the appropriate {@link ComplexNumber} type.
	 * @param type The CORBA type name
	 * @param value The value expressed as a string
	 * @return A {@link ComplexNumber} representing the string
	 */
	public static ComplexNumber valueOf(String type, String value) {
		if (value == null) {
			return null;
		}
		if ("boolean".equalsIgnoreCase(type)) {
			return ComplexBoolean.valueOf(value);
		} else if ("double".equalsIgnoreCase(type)) {
			return ComplexDouble.valueOf(value);
		} else if ("float".equalsIgnoreCase(type)) {
			return ComplexFloat.valueOf(value);
		} else if ("short".equalsIgnoreCase(type)) {
			return ComplexShort.valueOf(value);
		} else if ("long".equalsIgnoreCase(type)) {
			return ComplexLong.valueOf(value);
		} else if ("longlong".equalsIgnoreCase(type)) {
			return ComplexLongLong.valueOf(value);
		} else if ("ulong".equalsIgnoreCase(type)) {
			return ComplexULong.valueOf(value);
		} else if ("ushort".equalsIgnoreCase(type)) {
			return ComplexUShort.valueOf(value);
		} else if ("ulonglong".equalsIgnoreCase(type)) {
			return ComplexULongLong.valueOf(value);
		} else if ("octet".equalsIgnoreCase(type)) {
			return ComplexOctet.valueOf(value);
		} else {
			throw new IllegalArgumentException("Unknown CORBA Type: " + type);
		}
	}

	@Override
	public String toString() {
		return (getSize() == 2) ? toStringTwoDimension() : toStringMultiDimension();
	}

	private String toStringTwoDimension() {
		Object complexValue = getValue(1);
		if (complexValue == null) {
			return String.valueOf(getValue(0));
		} else {
			String complexStr = String.valueOf(complexValue);
			char modifier = '+';
			if (complexValue instanceof Number) {
				// Convert to double, then to string. This forces any binary -> base 10 text rounding to occur. If the
				// value is close enough to be displayed as a 1 or -1, we want to leave that out (i.e. "j" or "-j"
				// instead of "j1" or "-j1")
				String doubleStr = Double.toString(((Number) complexValue).doubleValue());
				if ("1.0".equals(doubleStr)) {
					complexStr = "";
				} else if ("-1.0".equals(doubleStr)) {
					complexStr = "";
					modifier = '-';
				}
			}

			if (complexStr.length() > 0 && complexStr.charAt(0) == '-') {
				complexStr = complexStr.substring(1, complexStr.length());
				modifier = '-';
			}
			return getValue(0).toString() + modifier + "j" + complexStr;
		}
	}

	private String toStringMultiDimension() {
		StringBuilder builder = new StringBuilder();
		builder.append("(");
		for (int i = 0; i < getSize(); i++) {
			builder.append(getValue(i));
			if (i + 1 < getSize()) {
				builder.append(", ");
			}
		}
		builder.append(")");
		return builder.toString();
	}
}

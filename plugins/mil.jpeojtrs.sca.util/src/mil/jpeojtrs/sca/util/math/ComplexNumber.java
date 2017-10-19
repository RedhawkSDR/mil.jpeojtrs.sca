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
	 * Extracts the <code>Any</code> to an array of {@link ComplexNumber}.
	 * @param any The <code>Any</code> to extract
	 * @return An array of {@link ComplexNumber}, or null if the <code>Any</code>'s type code isn't recognized
	 * @since 4.0
	 */
	public static ComplexNumber[] valueOfSequence(Any any) {
		TypeCode tc = any.type();
		if (tc.kind().value() != TCKind._tk_alias) {
			return null;
		}

		int hash;
		try {
			hash = tc.name().hashCode();
		} catch (BadKind e) {
			// Should never occur (TCKind == alias should guarantee a name)
			return null;
		}

		switch (hash) {
		case -650662937: // "complexBooleanSeq".hashCode()
			if (CF.complexBooleanSeqHelper.type().equivalent(tc)) {
				return ComplexBoolean.valueOfSequence(any);
			}
			return null;
		case 2102127614: // "complexDoubleSeq".hashCode()
			if (complexDoubleSeqHelper.type().equivalent(tc)) {
				return ComplexDouble.valueOfSequence(any);
			}
			return null;
		case -944124621: // "complexFloatSeq".hashCode()
			if (complexFloatSeqHelper.type().equivalent(tc)) {
				return ComplexFloat.valueOfSequence(any);
			}
			return null;
		case -439309965: // "complexLongSeq".hashCode()
			if (complexLongSeqHelper.type().equivalent(tc)) {
				return ComplexLong.valueOfSequence(any);
			}
			return null;
		case 1886609239: // "complexLongLongSeq".hashCode()
			if (complexLongLongSeqHelper.type().equivalent(tc)) {
				return ComplexLongLong.valueOfSequence(any);
			}
			return null;
		case 998225683: // "complexShortSeq".hashCode()
			if (complexShortSeqHelper.type().equivalent(tc)) {
				return ComplexShort.valueOfSequence(any);
			}
			return null;
		case 1104498398: // "complexULongSeq".hashCode()
			if (complexULongSeqHelper.type().equivalent(tc)) {
				return ComplexULong.valueOfSequence(any);
			}
			return null;
		case 1166104386: // "complexULongLongSeq".hashCode()
			if (complexULongLongSeqHelper.type().equivalent(tc)) {
				return ComplexULongLong.valueOfSequence(any);
			}
			return null;
		case 1611644680: // "complexUShortSeq".hashCode()
			if (complexUShortSeqHelper.type().equivalent(tc)) {
				return ComplexUShort.valueOfSequence(any);
			}
			return null;
		case -1689459488: // "complexOctetSeq".hashCode()
			if (complexOctetSeqHelper.type().equivalent(tc)) {
				return ComplexByte.valueOfSequence(any);
			}
			return null;
		case -48990631: // "complexCharSeq".hashCode()
			if (complexCharSeqHelper.type().equivalent(tc)) {
				return ComplexUByte.valueOfSequence(any);
			}
			return null;
		default:
			return null;
		}
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
		if (getSize() == 2) {
			Object complexValue = getValue(1);
			if (complexValue == null) {
				return String.valueOf(getValue(0));
			} else {
				String complexStr = String.valueOf(complexValue);
				char modifier = '+';
				if (complexValue instanceof Number) {
					Number complexNumber = (Number) complexValue;
					if (1.0 == complexNumber.doubleValue()) {
						complexStr = "";
					} else if (-1.0 == complexNumber.doubleValue()) {
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

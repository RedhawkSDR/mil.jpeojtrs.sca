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
package mil.jpeojtrs.sca.prf.provider;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import mil.jpeojtrs.sca.prf.PropertyValueType;

/**
 * @since 2.1
 */
public final class RadixLabelProviderUtil {

	private static final Pattern HEX_PATTERN = Pattern.compile("-?0[xX](\\p{XDigit}+)");
	private static final Pattern OCT_PATTERN = Pattern.compile("-?0([0-7]+)");

	private static final int BASE_8_CONSTANT = 8;
	private static final int BASE_10_CONSTANT = 10;
	private static final int BASE_16_CONSTANT = 16;

	private RadixLabelProviderUtil() {

	}
	
	/**
	 * @deprecated Use {@link #supports(PropertyValueType, boolean)} instead
	 * @param type
	 * @return
	 */
	@Deprecated
	public static boolean supports(final PropertyValueType type) {
		return supports(type, false);
	}

	/**
     * @since 2.3
     */
	public static boolean supports(final PropertyValueType type, boolean complex) {
		if (complex) {
			return false;
		}
		switch (type) {
		case OCTET:
		case SHORT:
		case LONG:
		case LONGLONG:
		case USHORT:
		case ULONG:
		case ULONGLONG:
			return true;
		default:
			return false;
		}
	}

	public static int[] getRadix(final List<String> defValue) {
		return RadixLabelProviderUtil.getRadix(defValue.toArray(new String[defValue.size()]));
	}

	public static int[] getRadix(final String[] defValue) {
		final int[] retVal = new int[defValue.length];
		for (int i = 0; i < retVal.length; i++) {
			retVal[i] = RadixLabelProviderUtil.getRadix(defValue[i]);
		}
		return retVal;
	}

	public static int getRadix(final String defValue) {
		int radix = RadixLabelProviderUtil.BASE_10_CONSTANT;
		if (defValue != null) {
			if (RadixLabelProviderUtil.HEX_PATTERN.matcher(defValue).matches()) {
				radix = RadixLabelProviderUtil.BASE_16_CONSTANT;
			} else if (RadixLabelProviderUtil.OCT_PATTERN.matcher(defValue).matches()) {
				radix = RadixLabelProviderUtil.BASE_8_CONSTANT;
			}
		}
		return radix;
	}

	private static String getPrefix(final int radix) {
		switch (radix) {
		case BASE_16_CONSTANT:
			return "0x";
		case BASE_8_CONSTANT:
			return "0";
		default:
			return "";
		}
	}

	public static String getText(final Object[] element, final int[] radix) {
		final StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (element != null) {
			final List<Object> elementList = Arrays.asList(element);
			int index = 0;
			for (final Iterator<Object> iterator = elementList.iterator(); iterator.hasNext(); index++) {
				if (index < radix.length) {
					builder.append(RadixLabelProviderUtil.getText(iterator.next(), radix[index]));
				} else if (radix.length > 0) {
					builder.append(RadixLabelProviderUtil.getText(iterator.next(), radix[0]));
				} else {
					builder.append(RadixLabelProviderUtil.getText(iterator.next(), RadixLabelProviderUtil.BASE_10_CONSTANT));
				}
				if (iterator.hasNext()) {
					builder.append(", ");
				}
			}
		}
		builder.append("]");
		return builder.toString();
	}

	public static String getText(final Object element, final int radix) {
		// If the element is null, then return just an empty String.
		// Otherwise, "null" will appear in the corresponding property field.
		if (element == null) {
			return "";
		}
		String retVal = "";
		boolean negative = false;
		if (element instanceof String) {
			return element.toString();
		} else if (element instanceof Short) {
			final Short s = (Short) element;
			int value = s.intValue();
			if (value < 0) {
				negative = true;
				value *= -1;
			}
			retVal = Integer.toString(value, radix);
		} else if (element instanceof Integer) {
			final Integer i = (Integer) element;
			int value = i;
			if (value < 0) {
				negative = true;
				value *= -1;
			}
			retVal = Integer.toString(value, radix);
		} else if (element instanceof Long) {
			final Long l = (Long) element;
			long value = l;
			if (value < 0) {
				negative = true;
				value *= -1;
			}
			retVal = Long.toString(value, radix);
		} else if (element instanceof BigInteger) {
			BigInteger value = (BigInteger) element;
			if (value.compareTo(BigInteger.ZERO) < 0) {
				negative = true;
				value = value.negate();
			}
			retVal = value.toString(radix);
		} else if (element instanceof Byte) {
			Byte b = (Byte) element;
			int value = b.intValue();
			if (value < 0) {
				negative = true;
				value = -value;
			}
			retVal = Integer.toString(value, radix);
		}
		if (retVal.length() != 0) {
			retVal = RadixLabelProviderUtil.getPrefix(radix) + retVal;
			if (negative) {
				retVal = "-" + retVal;
			}
		}
		return retVal;
	}
}

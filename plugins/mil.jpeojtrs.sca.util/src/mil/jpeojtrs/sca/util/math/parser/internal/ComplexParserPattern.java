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
package mil.jpeojtrs.sca.util.math.parser.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ComplexParserPattern {
	private static final Pattern NUMBER = Pattern.compile("([\\-]?[0-9]*\\.?[0-9]+([eE][\\-]?[0-9]+)?)");
	private static final Pattern[] PATTERNS = new Pattern[] {
	        Pattern.compile("^\\s*" + NUMBER.pattern() + "\\s*([\\+\\-])\\s*([\\-]?j[0-9]*\\.?[0-9]+([eE][\\-]?[0-9]+)?)\\s*$"),
	        Pattern.compile("^\\s*" + NUMBER.pattern() + "\\s*([\\+\\-])\\s*([\\-]?i[0-9]*\\.?[0-9]+([eE][\\-]?[0-9]+)?)\\s*$"),
	        Pattern.compile("^\\s*" + NUMBER.pattern() + "\\s*([\\+\\-])\\s*" + NUMBER.pattern() + "j\\s*$"),
	        Pattern.compile("^\\s*" + NUMBER.pattern() + "\\s*([\\+\\-])\\s*" + NUMBER.pattern() + "i\\s*$"),
	        Pattern.compile("\\s*^\\(\\s*" + NUMBER.pattern() + "\\s*(,\\s*" + NUMBER.pattern() + ")+" + "\\s*\\)\\s*$") };
	private static final String[] EMPTY = new String[0];

	private ComplexParserPattern() {

	}

	public static String[] parse(String value) {
		for (Pattern pattern : PATTERNS) {
			Matcher matcher = pattern.matcher(value);
			if (matcher.matches()) {
				List<String> retVal = new ArrayList<String>();
				boolean negative = false;
				for (int i = 1; i < matcher.groupCount() + 1; i++) {
					String group = matcher.group(i);
					if (group == null) {
						continue;
					} else if (group.startsWith(",")) {
						continue;
					} else if ("-".equals(group)) {
						negative = !negative;
					} else if ("+".equals(group)) {
						continue;
					} else if (group.startsWith("e") || group.startsWith("E")) {
						continue;
					} else {
						String number = removeComplex(group);
						Matcher numberMatcher = NUMBER.matcher(number);
						if (numberMatcher.matches()) {
							if (number.startsWith("-")) {
								if (negative) {
									retVal.add(number.substring(1, number.length()));
								} else {
									retVal.add(number);
								}
							} else {
								if (negative) {
									retVal.add("-" + number);
								} else {
									retVal.add(number);
								}
							}
							negative = false;
						} else {
							throw new NumberFormatException(group + " is not a number.");
						}
					}
				}
				return retVal.toArray(new String[retVal.size()]);
			}
		}
		throw new NumberFormatException("Invalid complex format: " + value);
	}

	private static String removeComplex(String substring) {
		return substring.replace("i", "").replace("j", "").trim();
	}
}

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

import mil.jpeojtrs.sca.util.math.parser.internal.ComplexParserCC;
import mil.jpeojtrs.sca.util.math.parser.internal.ParseException;
import mil.jpeojtrs.sca.util.math.parser.internal.TokenMgrError;

public final class ComplexParser {

	private ComplexParser() {

	}

	public static String[] parse(String value) throws NumberFormatException {
		try {
			return ComplexParserCC.fromString(value);
		} catch (ParseException e) {
			throw new NumberFormatException(e.getMessage());
		} catch (TokenMgrError e) {
			throw new NumberFormatException(e.getMessage());
		}
	}
}

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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 */
public final class QueryParser {
	private static final String ENCODING = "UTF-8";

	private QueryParser() {

	}

	@SuppressWarnings("deprecation")
    public static Map<String, String> parseQuery(final String query) {
		if (query == null) {
			return Collections.emptyMap();
		}
		final Map<String, String> retVal = new HashMap<String, String>();
		final String[] paramPairs = query.split("&");
		for (final String paramPair : paramPairs) {
			final String[] splitPair = paramPair.split("=", 2);
			if (splitPair.length == 2) {
				try {
					retVal.put(splitPair[0], URLDecoder.decode(splitPair[1], QueryParser.ENCODING));
				} catch (final UnsupportedEncodingException e) {
					// This shouldn't happen as UTF-8 should always be supported
					// but just in case use the platform default
					retVal.put(splitPair[0], URLDecoder.decode(splitPair[1]));
				}
			} else if (splitPair.length == 1) {
				retVal.put(splitPair[0], null);
			}
		}
		return Collections.unmodifiableMap(retVal);
	}

	@SuppressWarnings("deprecation")
	public static String createQuery(final Map<String, String> params) {
		if (params == null) {
			return "";
		}
		final StringBuilder builder = new StringBuilder();
		for (final Iterator<Entry<String, String>> iterator = params.entrySet().iterator(); iterator.hasNext();) {
			final Entry<String, String> entry = iterator.next();
			builder.append(entry.getKey());
			String value = entry.getValue();
			if (value != null) {
				builder.append("=");
				try {
					builder.append(URLEncoder.encode(value, QueryParser.ENCODING));
				} catch (final UnsupportedEncodingException e) {
					// This shouldn't happen as UTF-8 should always be supported but
					// just in case use the platform default
					builder.append(URLEncoder.encode(entry.getValue()));
				}
			} 
			
			if (iterator.hasNext()) {
				builder.append('&');
			}
		}
		return builder.toString();
	}
}

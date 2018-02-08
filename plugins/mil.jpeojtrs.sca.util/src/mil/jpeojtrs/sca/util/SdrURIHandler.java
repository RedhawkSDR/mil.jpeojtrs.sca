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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
/**
 * @since 3.3
 *
 */
public class SdrURIHandler extends URIHandlerImpl {
	
	private final URI base;
	
	public SdrURIHandler(URI base) {
		this.base = base;
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return uri.scheme().equalsIgnoreCase(ScaFileSystemConstants.SCHEME_TARGET_SDR) 
				|| uri.scheme().equalsIgnoreCase(ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM) 
				|| uri.scheme().equalsIgnoreCase(ScaFileSystemConstants.SCHEME_TARGET_SDR_DEV);
	}
	
	private URI convert(URI uri) {
		URI newUri = this.base; 
		if (uri.scheme().equalsIgnoreCase(ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM)) {
			newUri = base.appendSegment("dom");
		} else if (uri.scheme().equalsIgnoreCase(ScaFileSystemConstants.SCHEME_TARGET_SDR_DEV)) {
			newUri = base.appendSegment("dev");
		}
		newUri = newUri.appendSegments(uri.segments());
		
		return newUri;
	}
	
	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options)
			throws IOException {
		return super.createInputStream(convert(uri), options);
	}
	
	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options)
			throws IOException {
		return super.createOutputStream(convert(uri), options);
	}
	
	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		super.delete(convert(uri), options);
	}
	
	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return super.exists(convert(uri), options);
	}
	
	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes,
			Map<?, ?> options) throws IOException {
		super.setAttributes(convert(uri), attributes, options);
	}
	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		return super.getAttributes(convert(uri), options);
	}

}

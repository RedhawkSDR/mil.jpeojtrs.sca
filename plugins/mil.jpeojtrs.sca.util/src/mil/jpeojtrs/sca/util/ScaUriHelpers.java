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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class ScaUriHelpers {

	private static final String PLUGIN_ID = "mil.jpeojtrs.sca.util";

	private ScaUriHelpers() {
	}

	/**
	 * @since 3.0
	 */
	public static String getLocalFilePath(final EObject reference, final EObject target) {
		if (reference == null || target == null) {
			return null;
		}
		final URI targetUri = EcoreUtil.getURI(target);
		if (targetUri == null) {
			return null;
		}

		// Allow sdr, sca* and file schemes
		String targetScheme = targetUri.scheme();
		if (targetScheme != null && !(targetScheme.startsWith(ScaFileSystemConstants.SCHEME_TARGET_SDR) || ScaFileSystemConstants.SCHEME.equals(targetScheme)
			|| targetUri.isFile())) {
			return targetUri.toString();
		}

		final Resource referenceResource = reference.eResource();
		if (referenceResource == null) {
			return targetUri.path();
		}

		final URI referenceUri = referenceResource.getURI();
		final URI resolved = targetUri.deresolve(referenceUri);
		String path = resolved.path();
		if (path == null || "".equals(path)) {
			path = targetUri.lastSegment();
		}
		return path;
	}

	/**
	 * Loads a {@link Resource} based on a path and a reference {@link EObject}.
	 * @param localFilePath The absolute path in the file system, or a path relative to the <code>reference</code>
	 * @param reference The reference to use when locating the file path
	 * @param targetFileSystem The target file system, or null to use the <code>reference</code> file system
	 * @return The {@link Resource} if it was loaded without error, otherwise null
	 * @since 3.0
	 */
	public static Resource getLocalFileResource(final String localFilePath, final EObject reference, final String targetFileSystem) {
		final URI newUri = ScaUriHelpers.getLocalFileURI(localFilePath, reference, targetFileSystem);
		final Resource refResource = reference.eResource();

		// Refuse to proceed if we couldn't create a URI, or the reference doesn't belong to a Resource
		if (newUri == null || refResource == null) {
			return null;
		}

		final ResourceSet resourceSet = refResource.getResourceSet();
		try {
			// Demand-load the resource
			Resource resource = resourceSet.getResource(newUri, true);

			// If the resource was requested *previously* from the ResourceSet, then it's already in the ResourceSet
			// *even if it had problems loading*. We detect this and still return null.
			if (!resource.getErrors().isEmpty() && resource.getContents().isEmpty()) {
				return null;
			}
			return resource;
		} catch (WrappedException e) {
			// Resource failed to load
			return null;
		} catch (final Exception e) {
			// TODO: We should be able to remove this catch block
			log(new Status(IStatus.ERROR, PLUGIN_ID, "Unexpected error while loading an XML resource", e));
			return null;
		}
	}

	/**
	 * Helper method. Calls {@link #createFileSystemURI(String, URI, String)}.
	 * @param localFilePath
	 * @param reference An object whose URI will be used as a reference
	 * @param targetFileSystem
	 * @since 3.0
	 */
	public static URI getLocalFileURI(final String localFilePath, final EObject reference, final String targetFileSystem) {
		// The URI will be null if the reference doesn't belong to a Resource
		final URI resourceURI = EcoreUtil.getURI(reference);
		if (resourceURI == null) {
			return null;
		}

		final URI fileSystemURI = ScaUriHelpers.createFileSystemURI(localFilePath, resourceURI, targetFileSystem);
		return fileSystemURI;
	}

	/**
	 * Given the path stored in a LocalFile object and the relative EObject attempts to create the reference Root
	 * EObject type
	 * @since 3.0
	 */
	public static EObject getLocalFileEObject(final String localFilePath, final EObject reference, String fragment, final String targetFileSystem) {
		if (fragment == null) {
			fragment = "/";
		}

		final Resource resource = ScaUriHelpers.getLocalFileResource(localFilePath, reference, targetFileSystem);
		if (resource == null) {
			return null;
		}

		try {
			return resource.getEObject(fragment);
		} catch (WrappedException e) {
			// Failure to locate object
			return null;
		} catch (final Exception e) {
			// TODO: We should be able to remove this catch block
			log(new Status(IStatus.ERROR, PLUGIN_ID, "Unexpected error while loading an XML resource", e));
			return null;
		}
	}

	/**
	 * Creates a URI based on a path and a reference URI.
	 * @param path The absolute path in the file system, or a path relative to the <code>reference</code>
	 * @param referenceURI The reference to use when creating the URI
	 * @param targetFileSystem Either {@link ScaFileSystemConstants#SCHEME_TARGET_SDR_DOM} or
	 * {@link ScaFileSystemConstants#SCHEME_TARGET_SDR_DEV}) to indicate which file system the target is in
	 * @since 3.0
	 * @return Absolute URI to resource
	 */
	public static URI createFileSystemURI(final String path, final URI referenceURI, String targetFileSystem) {
		// Path may be null for malformed XML, or XML that is being constructed
		if (path == null || path.isEmpty()) {
			return null;
		}

		// Handle relative path requests
		if (path.charAt(0) != '/') {
			URI uri = ScaUriHelpers.getRelativeFileURI(path, referenceURI);
			if (uri == null) {
				String msg = String.format("Unable to construct URI for relative path '%s' with reference URI '%s' for target file system '%s'", path,
					referenceURI, targetFileSystem);
				log(new Status(IStatus.ERROR, PLUGIN_ID, msg));
			}
			return uri;
		}

		String queryStr = referenceURI.query();
		Map<String, String> query = QueryParser.parseQuery(queryStr);

		// If the target file system is 'dom', check to see if the query specifies a 'dom' file system and if so use
		// that. This occurs when the referenceURI is in a 'dev' file system, but we're trying to get a softpkg
		// dependency (which is by definition in the 'dom' file system)
		if (ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM.equals(targetFileSystem) && query.containsKey(ScaFileSystemConstants.QUERY_PARAM_DOM_FS)) {
			query = new HashMap<>(query);
			query.put(ScaFileSystemConstants.QUERY_PARAM_FS, query.remove(ScaFileSystemConstants.QUERY_PARAM_DOM_FS));
			queryStr = QueryParser.createQuery(query);
		}

		if (query.get(ScaFileSystemConstants.QUERY_PARAM_FS) != null) {
			targetFileSystem = ScaFileSystemConstants.SCHEME;
		}
		if (targetFileSystem == null) {
			String msg = "createFileSystemURI: Returning null, targetFileSystem and QUERY_PARAM_FS are null.";
			log(new Status(IStatus.ERROR, PLUGIN_ID, msg));
			return null;
		}
		return URI.createHierarchicalURI(targetFileSystem, referenceURI.authority(), referenceURI.device(), URI.createURI(path).segments(), queryStr, null);
	}

	/**
	 * @param sourceURI
	 * @param localFileName
	 * @return
	 */
	private static URI getRelativeFileURI(final String localFileName, final URI sourceURI) {
		URI root = sourceURI.trimSegments(1);
		final URI relativeURI = URI.createURI(localFileName);
		if (localFileName.charAt(0) == '/') {
			root = root.trimSegments(root.segmentCount());
		}
		final URI uri = root.appendSegments(relativeURI.segments());
		return uri;
	}

	private static void log(IStatus status) {
		Bundle bundle = FrameworkUtil.getBundle(ScaUriHelpers.class);
		ILog log = Platform.getLog(bundle);
		log.log(status);
	}

}

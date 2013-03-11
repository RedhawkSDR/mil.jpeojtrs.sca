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

import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ScaUriHelpers {
	private static final boolean DEBUG = Boolean.valueOf(Platform.getDebugOption("mil.jpeojtrs.sca.util/debug"));
	private static final boolean EXCEPTION = Boolean.valueOf(Platform.getDebugOption("mil.jpeojtrs.sca.util/debug/exception"));

	private ScaUriHelpers() {

	}

	/**
	 * @since 3.0
	 */
	public static String getLocalFilePath(final EObject reference, final EObject target) {
		if (reference == null || target == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no reference or target");
			}
			return null;
		}
		
		final Resource targetResource = target.eResource();
		if (targetResource == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no target resource");
			}
			return null;
		}
		final URI targetUri = targetResource.getURI();

		if (targetUri == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no target URI.");
			}
			return null;
		}

		if (targetUri.scheme() != null
		        && !(targetUri.scheme().startsWith(ScaFileSystemConstants.SCHEME_TARGET_SDR) || targetUri.scheme().equals(ScaFileSystemConstants.SCHEME))) {
			return targetUri.toString();
		}
		
		final Resource referenceResource = reference.eResource();
		if (referenceResource == null) {
			return targetUri.path();
		}
		
		final URI referenceUri = referenceResource.getURI();
		final URI resolved = targetUri.deresolve(referenceUri);
		String path = resolved.path();
		if (path == null || path.equals("")) {
			path = targetUri.lastSegment();
		}
		return path;
	}

	/**
	 * @since 3.0
	 */
	public static Resource getLocalFileResource(final String localFilePath, final EObject reference, final String targetFileSystem) {
		if (localFilePath == null || localFilePath.length() == 0) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no local path");
			}
			return null;
		}
		if (reference == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no reference");
			}
			return null;
		}
		final Resource resource = reference.eResource();
		if (resource == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no resource");
			}
			return null;
		}
		final ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no resource set");
			}
			return null;
		}

		final URI newUri = ScaUriHelpers.getLocalFileURI(localFilePath, reference, targetFileSystem);
		if (newUri != null) {
			try {
				return resourceSet.getResource(newUri, true);
			} catch (final Exception e) {
				if (ScaUriHelpers.DEBUG) {
					ScaUriHelpers.debug("getLocalFileEObject: Suppressing exception " + e.getMessage());
					if (ScaUriHelpers.EXCEPTION) {
						e.printStackTrace(); // SUPPRESS CHECKSTYLE Trace statement
					}
				}
			}
		}

		return null;
	}

	/**
	 * @since 3.0
	 */
	public static URI getLocalFileURI(final String localFilePath, final EObject reference, final String targetFileSystem) {
		if (localFilePath == null || localFilePath.length() == 0) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no local path");
			}
			return null;
		}
		if (reference == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no reference");
			}
			return null;
		}
		final Resource resource = reference.eResource();
		if (resource == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("getLocalFileEObject: Returning null, no resource");
			}
			return null;
		}
		final URI pathURI = URI.createURI(localFilePath);
		if (pathURI.scheme() != null) {
			return pathURI;
		}
		final URI resourceURI = resource.getURI();
		final URI fileSystemURI = ScaUriHelpers.createFileSystemURI(localFilePath, resourceURI, targetFileSystem);
		if (fileSystemURI != null) {
			return fileSystemURI;
		}

		if (ScaUriHelpers.DEBUG) {
			ScaUriHelpers.debug("getLocalFileEObject: Returning null, no file system URI.");
		}
		return null;
	}

	/**
	 * Given the path stored in a LocalFile object and the relative EObject attempts to create the reference Root EObject type
	 * @since 3.0
	 */
	public static EObject getLocalFileEObject(final String localFilePath, final EObject reference, String fragment, final String targetFileSystem) {
		if (fragment == null) {
			fragment = "/";
		}
		final Resource resource = ScaUriHelpers.getLocalFileResource(localFilePath, reference, targetFileSystem);
		if (resource != null) {
			try {
				return resource.getEObject(fragment);
			} catch (final Exception e) {
				if (ScaUriHelpers.DEBUG) {
					ScaUriHelpers.debug("getLocalFileEObject: Suppressing exception " + e.getMessage());
					if (ScaUriHelpers.EXCEPTION) {
						e.printStackTrace(); // SUPPRESS CHECKSTYLE Trace statement
					}
				}
			}
		}
		return null;
	}

	/**
	 * @param path Path within the target file system 
	 * @param referenceURI the uri of the caller of this function
	 * @param targetFileSystem if the URI does not contain a File system query, this will be used to reference the target file system instead

	 * @since 3.0
	 * @return Absolute URI to resource
	 */
	public static URI createFileSystemURI(final String path, final URI referenceURI, String targetFileSystem) {
		if (path == null || referenceURI == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("createFileSystemURI: Returning null, Path and reference URI is null.");
			}
			return null;
		}
		if (path.charAt(0) != '/') {
			return ScaUriHelpers.getRelativeFileURI(path, referenceURI);
		}

		final String queryStr = referenceURI.query();
		final Map<String, String> query = QueryParser.parseQuery(queryStr);
		if (query.get(ScaFileSystemConstants.QUERY_PARAM_FS) != null) {
			targetFileSystem = ScaFileSystemConstants.SCHEME;
		}
		if (targetFileSystem == null) {
			if (ScaUriHelpers.DEBUG) {
				ScaUriHelpers.debug("createFileSystemURI: Returning null, targetFileSystem and QUERY_PARAM_FS are null.");
			}
			return null;
		} else {
			return URI.createHierarchicalURI(targetFileSystem, referenceURI.authority(), referenceURI.device(), URI.createURI(path).segments(), queryStr, null);
		}
	}

	private static void debug(final String string) {
		System.out.println("DEBUG (mil.jpeojtrs.sca.util.ScaUriHelpers): " + string); // SUPPRESS CHECKSTYLE Trace statement
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

}

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

/**
 * 
 */
public final class ScaFileSystemConstants {

	/**
	 * URI scheme for a location in SDRROOT/dev
	 * @since 3.0
	 */
	public static final String SCHEME_TARGET_SDR_DEV = "sdrdev";

	/**
	 * URI scheme for a location in SDRROOT/dom
	 * @since 3.0
	 */
	public static final String SCHEME_TARGET_SDR_DOM = "sdrdom";

	/**
	 * URI scheme for a location in the SDRROOT
	 * @since 3.0
	 */
	public static final String SCHEME_TARGET_SDR = "sdr";

	/**
	 * URI scheme for an SCA file system (i.e. a {@link CF.FileSystem}, either 'dom' or 'dev').
	 * @see #QUERY_PARAM_FS
	 * @see #QUERY_PARAM_DOM_FS
	 */
	public static final String SCHEME = "sca";

	/**
	 * Key for specifying how to reach the SCA file system (either <code>IOR:</code> or <code>file://</code>) in the
	 * query of an SCA URI.
	 * @see #SCHEME
	 */
	public static final String QUERY_PARAM_FS = "fs";

	/**
	 * Key for specifying how to reach the 'dom' SCA file system (either <code>IOR:</code> or <code>file://</code>) in
	 * the query of an SCA URI.
	 * <p/>
	 * This is used only when {@link #QUERY_PARAM_FS} points to a dev file system. It allows softpkg dependencies
	 * (which are in the 'dom' file system, not 'dev') to be resolved.
	 * @see #SCHEME
	 * @since 4.7
	 */
	public static final String QUERY_PARAM_DOM_FS = "domfs";

	public static final String QUERY_PARAM_WF = "wf";

	public static final String QUERY_PARAM_NAME = "name";

	public static final String FS_SCHEME_CORBA_NAME = "corbaname";

	public static final String FS_SCHEME_CORBA_IOR = "IOR";

	/**
	 * Key for specifying the domain manager's name in the query of an SCA URI.
	 * @see #SCHEME
	 * @since 3.6
	 */
	public static final String QUERY_PARAM_DOMAIN_NAME = "domain";

	/**
	 * Key for specifying the device manager's name in the query of an SCA URI.
	 * @since 3.6
	 */
	public static final String QUERY_PARAM_DEVICE_MGR_NAME = "devMgr";

	private ScaFileSystemConstants() {

	}

}

/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package mil.jpeojtrs.sca.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.UserException;
import org.osgi.framework.Bundle;

import CF.DataType;
import CF.ErrorNumberType;
import CF.ErrorNumberTypeHelper;
import CF.FileException;
import CF.InvalidFileName;
import CF.UnknownProperties;
import CF.DevicePackage.InsufficientCapacity;
import CF.DevicePackage.InvalidCapacity;
import CF.DevicePackage.InvalidState;
import CF.ExecutableDevicePackage.ExecuteFail;
import CF.ExecutableDevicePackage.InvalidFunction;
import CF.ExecutableDevicePackage.InvalidOptions;
import CF.ExecutableDevicePackage.InvalidParameters;
import CF.FileManagerPackage.NonExistentMount;
import CF.FilePackage.InvalidFilePointer;
import CF.LifeCyclePackage.InitializeError;
import CF.LifeCyclePackage.ReleaseError;
import CF.PortPackage.InvalidPort;
import CF.PortPackage.OccupiedPort;
import CF.PortSupplierPackage.UnknownPort;
import CF.PropertyEmitterPackage.AlreadyInitialized;
import CF.PropertySetPackage.InvalidConfiguration;
import CF.PropertySetPackage.PartialConfiguration;
import CF.ResourcePackage.StartError;
import CF.ResourcePackage.StopError;
import CF.TestableObjectPackage.UnknownTest;

/**
 * Utility methods for formatting CF exceptions for display to the user. Since they're CORBA exceptions,
 * <code>toString()</code> doesn't produce a message with the error's details.
 * @since 4.2
 */
public class CFErrorFormatter {

	private static final String PLUGIN_ID = "mil.jpeojtrs.sca.util";

	private static final String EMPTY_PROP_LIST = "(no properties)";
	private static final String EMPTY_ERROR_LIST = "(no error details)";

	// Generic error messages
	private static final String FORMAT_ERRNAME_RESNAME = "%s for %s";
	private static final String FORMAT_ERRNAME_RESNAME_ERRMSG = "%s for %s: %s";
	private static final String FORMAT_ERRNAME_RESNAME_ERRMSG_ERRNUM = "%s for %s: %s (error number %s)";
	private static final String FORMAT_ERRNAME_RESNAME_ERRMSG_ERRCODE = "%s for %s: %s (error code %d)";

	// Property-related error messages
	private static final String FORMAT_ERRNAME_PROPLIST = "%s. Properties: %s";
	private static final String FORMAT_ERRNAME_RESNAME_PROPLIST = "%s for %s. Properties: %s";
	private static final String FORMAT_ERRNAME_ERRMSG_PROPLIST = "%s: %s. Properties: %s";
	private static final String FORMAT_ERRNAME_RESNAME_ERRMSG_PROPLIST = "%s for %s: %s. Properties: %s";

	// Start / stop messages
	private static final String FORMAT_STARTERR_RESNAME_ERRNAME_ERRMSG_ERRNUM = "Error while starting %s. %s: %s (error number %s)";
	private static final String FORMAT_STOPERR_RESNAME_ERRNAME_ERRMSG_ERRNUM = "Error while stopping %s. %s: %s (error number %s)";

	public enum FileOperation {
		Create("%s while creating %s: %s (error number %s)"),
		Delete("%s while deleting %s: %s (error number %s)"),
		Exists("%s while checking existence of %s: %s (error number %s)"),
		List("%s while listing file path %s: %s (error number %s)"),
		Mkdir("%s while making directory %s: %s (error number %s)"),
		/**
		 * @since 4.4
		 */
		Mount("%s while mounting a file system at %s: %s (error number %s)"),
		Open("%s while opening %s: %s (error number %s)"),
		Seek("%s while adjusting file position in %s: %s (error number %s)");

		private String format;

		private FileOperation(String format) {
			this.format = format;
		}

		public String getFormat() {
			return format;
		}
	}

	public enum FileOperation2 {
		Copy("%s while copying %s to %s: %s (error number %s)"),
		Move("%s while moving %s to %s: %s (error number %s)");

		private String format;

		private FileOperation2(String format) {
			this.format = format;
		}

		public String getFormat() {
			return format;
		}
	}

	private CFErrorFormatter() {
	}

	public static String format(AlreadyInitialized e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), resourceDesc);
	}

	public static String format(ExecuteFail e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG_ERRNUM, e.getClass().getName(), resourceDesc, e.msg, toName(e.errorNumber));
	}

	public static String format(FileException e, FileOperation op, String path) {
		return String.format(op.getFormat(), e.getClass().getName(), path, e.msg, toName(e.errorNumber));
	}

	public static String format(FileException e, FileOperation2 op, String path1, String path2) {
		return String.format(op.getFormat(), e.getClass().getName(), path1, path2, e.msg, toName(e.errorNumber));
	}

	public static String format(InitializeError e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG, e.getClass().getName(), resourceDesc, formatToSentences(e.errorMessages));
	}

	/**
	 * @since 4.6
	 */
	public static String format(InsufficientCapacity e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG_PROPLIST, e.getClass().getName(), resourceDesc, e.msg, formatProperties(e.insufficientCapacities));
	}

	/**
	 * @since 4.3
	 */
	public static String format(InvalidCapacity e) {
		return String.format(FORMAT_ERRNAME_ERRMSG_PROPLIST, e.getClass().getName(), e.msg, formatProperties(e.capacities));
	}

	/**
	 * @since 4.3
	 */
	public static String format(InvalidCapacity e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG_PROPLIST, e.getClass().getName(), resourceDesc, e.msg, formatProperties(e.capacities));
	}

	public static String format(InvalidConfiguration e) {
		return String.format(FORMAT_ERRNAME_ERRMSG_PROPLIST, e.getClass().getName(), e.msg, formatProperties(e.invalidProperties));
	}

	public static String format(InvalidConfiguration e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG_PROPLIST, e.getClass().getName(), resourceDesc, e.msg, formatProperties(e.invalidProperties));
	}

	public static String format(InvalidFileName e, FileOperation op, String path) {
		return String.format(op.getFormat(), e.getClass().getName(), path, e.msg, toName(e.errorNumber));
	}

	public static String format(InvalidFileName e, FileOperation2 op, String path1, String path2) {
		return String.format(op.getFormat(), e.getClass().getName(), path1, path2, e.msg, toName(e.errorNumber));
	}

	public static String format(InvalidFilePointer e, String path) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), path);
	}

	/**
	 * @since 4.6
	 */
	public static String format(InvalidFunction e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), resourceDesc);
	}

	/**
	 * @since 4.6
	 */
	public static String format(InvalidOptions e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_PROPLIST, e.getClass().getName(), resourceDesc, formatProperties(e.invalidOpts));
	}

	/**
	 * @since 4.6
	 */
	public static String format(InvalidParameters e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_PROPLIST, e.getClass().getName(), resourceDesc, formatProperties(e.invalidParms));
	}

	public static String format(InvalidPort e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG_ERRCODE, e.getClass().getName(), resourceDesc, e.msg, e.errorCode);
	}

	/**
	 * @since 4.3
	 */
	public static String format(InvalidState e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG, e.getClass().getName(), resourceDesc, e.msg);
	}

	/**
	 * @since 4.4
	 */
	public static String format(NonExistentMount e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), resourceDesc);
	}

	public static String format(OccupiedPort e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), resourceDesc);
	}

	public static String format(PartialConfiguration e) {
		return String.format(FORMAT_ERRNAME_PROPLIST, e.getClass().getName(), formatProperties(e.invalidProperties));
	}

	public static String format(PartialConfiguration e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_PROPLIST, e.getClass().getName(), resourceDesc, formatProperties(e.invalidProperties));
	}

	public static String format(ReleaseError e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_ERRMSG, e.getClass().getName(), resourceDesc, formatToSentences(e.errorMessages));
	}

	public static String format(StartError e, String resourceDesc) {
		return String.format(FORMAT_STARTERR_RESNAME_ERRNAME_ERRMSG_ERRNUM, resourceDesc, e.getClass().getName(), e.msg, toName(e.errorNumber));
	}

	public static String format(StopError e, String resourceDesc) {
		return String.format(FORMAT_STOPERR_RESNAME_ERRNAME_ERRMSG_ERRNUM, resourceDesc, e.getClass().getName(), e.msg, toName(e.errorNumber));
	}

	public static String format(UnknownPort e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), resourceDesc);
	}

	public static String format(UnknownProperties e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME_PROPLIST, e.getClass().getName(), resourceDesc, formatProperties(e.invalidProperties));
	}

	public static String format(UnknownTest e, String resourceDesc) {
		return String.format(FORMAT_ERRNAME_RESNAME, e.getClass().getName(), resourceDesc);
	}

	/**
	 * Converts an {@link ErrorNumberType} to its string constant name.
	 * @param errorNumber
	 * @return The string constant name, or "Unknown"
	 */
	public static String toName(ErrorNumberType errorNumber) {
		TypeCode tc = ErrorNumberTypeHelper.type();
		try {
			if (errorNumber.value() >= 0 && errorNumber.value() < tc.member_count()) {
				return tc.member_name(errorNumber.value());
			}
		} catch (UserException ex) {
			// This should never occur unless there's an IDL mismatch
			Bundle bundle = Platform.getBundle(PLUGIN_ID);
			Platform.getLog(bundle).log(new Status(IStatus.ERROR, PLUGIN_ID, "Exception while resolving a CF.ErrorNumberType", ex));
		}
		return "Unknown";
	}

	private static String formatProperties(DataType[] propList) {
		if (propList.length == 0) {
			return EMPTY_PROP_LIST;
		}

		StringBuilder sb = new StringBuilder();
		for (DataType dt : propList) {
			sb.append(dt.id);
			sb.append(", ");
		}
		sb.setLength(sb.length() - 2);
		return sb.toString();
	}

	private static String formatToSentences(String[] strings) {
		if (strings.length == 0) {
			return EMPTY_ERROR_LIST;
		}

		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			sb.append(string);
			sb.append(". ");
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
}

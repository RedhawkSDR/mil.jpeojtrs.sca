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
package mil.jpeojtrs.sca.util.tests;

import org.junit.Assert;
import org.junit.Test;

import CF.DataType;
import CF.ErrorNumberType;
import CF.FileException;
import CF.InvalidFileName;
import CF.UnknownProperties;
import CF.AllocationManagerPackage.InvalidAllocationId;
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
import mil.jpeojtrs.sca.util.CFErrorFormatter;
import mil.jpeojtrs.sca.util.CFErrorFormatter.FileOperation;
import mil.jpeojtrs.sca.util.CFErrorFormatter.FileOperation2;

/**
 * Tests some of the error messages we generate with {@link CFErrorFormatter}.
 */
public class CFErrorFormatterTest {

	@Test
	public void format_AlreadyInitialized_resName() {
		String msg = CFErrorFormatter.format(new AlreadyInitialized(), "foo");
		Assert.assertEquals("CF.PropertyEmitterPackage.AlreadyInitialized for foo", msg);
	}

	@Test
	public void format_ExecuteFail() {
		String msg = CFErrorFormatter.format(new ExecuteFail(ErrorNumberType.CF_EDOM, "abc"), "def");
		Assert.assertEquals("CF.ExecutableDevicePackage.ExecuteFail for def: abc (error number CF_EDOM)", msg);
	}

	@Test
	public void format_FileException_onePath() {
		String msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_E2BIG, "ABC"), FileOperation.Create, "/a");
		Assert.assertEquals("CF.FileException while creating /a: ABC (error number CF_E2BIG)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_EACCES, "BCD"), FileOperation.Delete, "/b");
		Assert.assertEquals("CF.FileException while deleting /b: BCD (error number CF_EACCES)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_EAGAIN, "CDE"), FileOperation.Exists, "/c");
		Assert.assertEquals("CF.FileException while checking existence of /c: CDE (error number CF_EAGAIN)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_EBADF, "DEF"), FileOperation.List, "/d");
		Assert.assertEquals("CF.FileException while listing file path /d: DEF (error number CF_EBADF)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_EBADMSG, "EFG"), FileOperation.Mkdir, "/e");
		Assert.assertEquals("CF.FileException while making directory /e: EFG (error number CF_EBADMSG)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_EBUSY, "FGH"), FileOperation.Open, "/f");
		Assert.assertEquals("CF.FileException while opening /f: FGH (error number CF_EBUSY)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_ECANCELED, "GHI"), FileOperation.Seek, "/g");
		Assert.assertEquals("CF.FileException while adjusting file position in /g: GHI (error number CF_ECANCELED)", msg);
	}

	@Test
	public void format_FileException_twoPaths() {
		String msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_ECHILD, "HIJ"), FileOperation2.Copy, "/h", "/i");
		Assert.assertEquals("CF.FileException while copying /h to /i: HIJ (error number CF_ECHILD)", msg);
		msg = CFErrorFormatter.format(new FileException(ErrorNumberType.CF_EDEADLK, "IJK"), FileOperation2.Move, "/j", "/k");
		Assert.assertEquals("CF.FileException while moving /j to /k: IJK (error number CF_EDEADLK)", msg);
	}

	@Test
	public void format_InitializeError() {
		String msg = CFErrorFormatter.format(new InitializeError(new String[] { "abc", "def" }), "ghi");
		Assert.assertEquals("CF.LifeCyclePackage.InitializeError for ghi: abc. def.", msg);
		msg = CFErrorFormatter.format(new InitializeError(new String[] {}), "jkl");
		Assert.assertEquals("CF.LifeCyclePackage.InitializeError for jkl: (no error details)", msg);
	}

	@Test
	public void format_InsufficientCapacity_resName() {
		String msg = CFErrorFormatter.format(new InsufficientCapacity(new DataType[] { new DataType("d", null), new DataType("e", null) }, "VWX"), "foo");
		Assert.assertEquals("CF.DevicePackage.InsufficientCapacity for foo: VWX. Properties: d, e", msg);
		msg = CFErrorFormatter.format(new InsufficientCapacity(new DataType[] {}, "YZ"), "foo");
		Assert.assertEquals("CF.DevicePackage.InsufficientCapacity for foo: YZ. Properties: (no properties)", msg);
	}

	@Test
	public void format_InvalidAllocationId() {
		String msg = CFErrorFormatter.format(new InvalidAllocationId(new String[] { "a", "b" }));
		Assert.assertEquals("CF.AllocationManagerPackage.InvalidAllocationId for [a, b]", msg);
	}

	@Test
	public void format_InvalidCapacity() {
		String msg = CFErrorFormatter.format(new InvalidCapacity("STU", new DataType[] { new DataType("a", null), new DataType("b", null) }));
		Assert.assertEquals("CF.DevicePackage.InvalidCapacity: STU. Properties: a, b", msg);
	}

	@Test
	public void format_InvalidCapacity_resName() {
		String msg = CFErrorFormatter.format(new InvalidCapacity("VWX", new DataType[] { new DataType("d", null), new DataType("e", null) }), "foo");
		Assert.assertEquals("CF.DevicePackage.InvalidCapacity for foo: VWX. Properties: d, e", msg);
		msg = CFErrorFormatter.format(new InvalidCapacity("YZ", new DataType[] {}), "foo");
		Assert.assertEquals("CF.DevicePackage.InvalidCapacity for foo: YZ. Properties: (no properties)", msg);
	}

	@Test
	public void format_InvalidConfiguraiton() {
		String msg = CFErrorFormatter.format(new InvalidConfiguration("JKL", new DataType[] { new DataType("a", null), new DataType("b", null) }));
		Assert.assertEquals("CF.PropertySetPackage.InvalidConfiguration: JKL. Properties: a, b", msg);
	}

	@Test
	public void format_InvalidConfiguraiton_resName() {
		String msg = CFErrorFormatter.format(new InvalidConfiguration("MNO", new DataType[] { new DataType("d", null), new DataType("e", null) }), "foo");
		Assert.assertEquals("CF.PropertySetPackage.InvalidConfiguration for foo: MNO. Properties: d, e", msg);
		msg = CFErrorFormatter.format(new InvalidConfiguration("PQR", new DataType[] {}), "foo");
		Assert.assertEquals("CF.PropertySetPackage.InvalidConfiguration for foo: PQR. Properties: (no properties)", msg);
	}

	@Test
	public void format_InvalidFileName_onePath() {
		String msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_E2BIG, "ABC"), FileOperation.Create, "/a");
		Assert.assertEquals("CF.InvalidFileName while creating /a: ABC (error number CF_E2BIG)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EACCES, "BCD"), FileOperation.Delete, "/b");
		Assert.assertEquals("CF.InvalidFileName while deleting /b: BCD (error number CF_EACCES)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EAGAIN, "CDE"), FileOperation.Exists, "/c");
		Assert.assertEquals("CF.InvalidFileName while checking existence of /c: CDE (error number CF_EAGAIN)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EBADF, "DEF"), FileOperation.List, "/d");
		Assert.assertEquals("CF.InvalidFileName while listing file path /d: DEF (error number CF_EBADF)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EBADMSG, "EFG"), FileOperation.Mkdir, "/e");
		Assert.assertEquals("CF.InvalidFileName while making directory /e: EFG (error number CF_EBADMSG)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EBUSY, "FGH"), FileOperation.Mount, "/f");
		Assert.assertEquals("CF.InvalidFileName while mounting a file system at /f: FGH (error number CF_EBUSY)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_ECANCELED, "GHI"), FileOperation.Open, "/g");
		Assert.assertEquals("CF.InvalidFileName while opening /g: GHI (error number CF_ECANCELED)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_ECHILD, "HIJ"), FileOperation.Seek, "/h");
		Assert.assertEquals("CF.InvalidFileName while adjusting file position in /h: HIJ (error number CF_ECHILD)", msg);
	}

	@Test
	public void format_InvalidFileName_twoPaths() {
		String msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EDEADLK, "IJK"), FileOperation2.Copy, "/i", "/j");
		Assert.assertEquals("CF.InvalidFileName while copying /i to /j: IJK (error number CF_EDEADLK)", msg);
		msg = CFErrorFormatter.format(new InvalidFileName(ErrorNumberType.CF_EDOM, "JKL"), FileOperation2.Move, "/k", "/l");
		Assert.assertEquals("CF.InvalidFileName while moving /k to /l: JKL (error number CF_EDOM)", msg);
	}

	@Test
	public void format_InvalidFilePointer() {
		String msg = CFErrorFormatter.format(new InvalidFilePointer(), "/foo");
		Assert.assertEquals("CF.FilePackage.InvalidFilePointer for /foo", msg);
	}

	@Test
	public void format_InvalidFunction() {
		String msg = CFErrorFormatter.format(new InvalidFunction(), "ghi");
		Assert.assertEquals("CF.ExecutableDevicePackage.InvalidFunction for ghi", msg);
	}

	@Test
	public void format_InvalidOptions() {
		String msg = CFErrorFormatter.format(new InvalidOptions(new DataType[] { new DataType("g", null) }), "baz");
		Assert.assertEquals("CF.ExecutableDevicePackage.InvalidOptions for baz. Properties: g", msg);
		msg = CFErrorFormatter.format(new InvalidOptions(new DataType[] {}), "baz");
		Assert.assertEquals("CF.ExecutableDevicePackage.InvalidOptions for baz. Properties: (no properties)", msg);
	}

	@Test
	public void format_InvalidParameters() {
		String msg = CFErrorFormatter.format(new InvalidParameters(new DataType[] { new DataType("h", null) }), "baz");
		Assert.assertEquals("CF.ExecutableDevicePackage.InvalidParameters for baz. Properties: h", msg);
		msg = CFErrorFormatter.format(new InvalidParameters(new DataType[] {}), "baz");
		Assert.assertEquals("CF.ExecutableDevicePackage.InvalidParameters for baz. Properties: (no properties)", msg);
	}

	@Test
	public void format_InvalidPort() {
		String msg = CFErrorFormatter.format(new InvalidPort((short) 123, "abc"), "def");
		Assert.assertEquals("CF.PortPackage.InvalidPort for def: abc (error code 123)", msg);
	}

	@Test
	public void format_InvalidState() {
		String msg = CFErrorFormatter.format(new InvalidState("abc"), "def");
		Assert.assertEquals("CF.DevicePackage.InvalidState for def: abc", msg);
	}

	@Test
	public void format_NonExistentMount() {
		String msg = CFErrorFormatter.format(new NonExistentMount(), "abc");
		Assert.assertEquals("CF.FileManagerPackage.NonExistentMount for abc", msg);
	}

	@Test
	public void format_OccupiedPort() {
		String msg = CFErrorFormatter.format(new OccupiedPort(), "abc");
		Assert.assertEquals("CF.PortPackage.OccupiedPort for abc", msg);
	}

	@Test
	public void format_ParitialConfiguraiton() {
		String msg = CFErrorFormatter.format(new PartialConfiguration(new DataType[] { new DataType("c", null) }));
		Assert.assertEquals("CF.PropertySetPackage.PartialConfiguration. Properties: c", msg);
	}

	@Test
	public void format_ParitialConfiguraiton_resName() {
		String msg = CFErrorFormatter.format(new PartialConfiguration(new DataType[] { new DataType("f", null) }), "bar");
		Assert.assertEquals("CF.PropertySetPackage.PartialConfiguration for bar. Properties: f", msg);
		msg = CFErrorFormatter.format(new PartialConfiguration(new DataType[] {}), "bar");
		Assert.assertEquals("CF.PropertySetPackage.PartialConfiguration for bar. Properties: (no properties)", msg);
	}

	@Test
	public void format_ReleaseError() {
		String msg = CFErrorFormatter.format(new ReleaseError(new String[] { "abc", "def" }), "ghi");
		Assert.assertEquals("CF.LifeCyclePackage.ReleaseError for ghi: abc. def.", msg);
		msg = CFErrorFormatter.format(new ReleaseError(new String[] {}), "jkl");
		Assert.assertEquals("CF.LifeCyclePackage.ReleaseError for jkl: (no error details)", msg);
	}

	@Test
	public void format_StartError() {
		String msg = CFErrorFormatter.format(new StartError(ErrorNumberType.CF_EACCES, "DEF"), "foo");
		Assert.assertEquals("Error while starting foo. CF.ResourcePackage.StartError: DEF (error number CF_EACCES)", msg);
	}

	@Test
	public void format_StopError() {
		String msg = CFErrorFormatter.format(new StopError(ErrorNumberType.CF_EAGAIN, "GHI"), "bar");
		Assert.assertEquals("Error while stopping bar. CF.ResourcePackage.StopError: GHI (error number CF_EAGAIN)", msg);
	}

	@Test
	public void format_UnknownPort() {
		String msg = CFErrorFormatter.format(new UnknownPort(), "abc");
		Assert.assertEquals("CF.PortSupplierPackage.UnknownPort for abc", msg);
	}

	@Test
	public void format_UnknownProperties() {
		String msg = CFErrorFormatter.format(new UnknownProperties(new DataType[] { new DataType("a", null) }), "abc");
		Assert.assertEquals("CF.UnknownProperties for abc. Properties: a", msg);
		msg = CFErrorFormatter.format(new UnknownProperties(new DataType[] {}), "def");
		Assert.assertEquals("CF.UnknownProperties for def. Properties: (no properties)", msg);
	}

	@Test
	public void format_UnknownTest() {
		String msg = CFErrorFormatter.format(new UnknownTest(), "abc");
		Assert.assertEquals("CF.TestableObjectPackage.UnknownTest for abc", msg);
	}

	@Test
	public void toName() {
		Assert.assertEquals("CF_NOTSET", CFErrorFormatter.toName(ErrorNumberType.CF_NOTSET));
		Assert.assertEquals("CF_EXDEV", CFErrorFormatter.toName(ErrorNumberType.CF_EXDEV));
	}
}

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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;

/**
 * @since 3.5
 * 
 */
public final class CorbaUtils {

	private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool(new NamedThreadFactory(CorbaUtils.class.getName()));

	private CorbaUtils() {

	}

	/**
	 * Resolves a CORBA Object from the ORB in an interruptible fashion
	 * 
	 * @exception CoreException exceptions are automatically wrapped in an <code>CoreException</code>
	 * @exception InterruptedException if the operation detects a request to cancel, 
	 *  using <code>IProgressMonitor.isCanceled()</code>, it will exit by throwing 
	 *  <code>InterruptedException</code>
	 * @since 3.5
	 */
	public static org.omg.CORBA.Object string_to_object(final ORB orb, final String ior, IProgressMonitor monitor) throws CoreException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Resoling object in orb ", 1);
		return invoke(new Callable<org.omg.CORBA.Object>() {

			@Override
			public org.omg.CORBA.Object call() throws Exception {
				return orb.string_to_object(ior);
			}

		}, subMonitor);
	}

	/**
	 * Resolves a CORBA Object in an interruptible fashion
	 * 
	 * @exception CoreException exceptions are automatically wrapped in an <code>CoreException</code>
	 * @exception InterruptedException if the operation detects a request to cancel, 
	 *  using <code>IProgressMonitor.isCanceled()</code>, it will exit by throwing 
	 *  <code>InterruptedException</code>
	 * @since 3.5
	 */
	public static org.omg.CORBA.Object resolve_str(final NamingContextExt ext, final String name, IProgressMonitor monitor) throws CoreException,
		InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Resoling object in naming context at ref " + name, 1);
		return invoke(new Callable<org.omg.CORBA.Object>() {

			@Override
			public org.omg.CORBA.Object call() throws Exception {
				return ext.resolve_str(name);
			}

		}, subMonitor);
	}

	/**
	 * Check if a CORBA Object is_a in an interruptible fashion
	 * 
	 * @exception CoreException exceptions are automatically wrapped in an <code>CoreException</code>
	 * @exception InterruptedException if the operation detects a request to cancel, 
	 *  using <code>IProgressMonitor.isCanceled()</code>, it will exit by throwing 
	 *  <code>InterruptedException</code>
	 * @since 3.5
	 */
	public static boolean is_a(final org.omg.CORBA.Object obj, final String repID, final IProgressMonitor monitor) throws CoreException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Checking if obj is a " + repID, 1);
		return invoke(new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				return obj._is_a(repID);
			}

		}, subMonitor);
	}

	/**
	 * Check if a CORBA Object exists in an interruptible fashion
	 * 
	 * @exception CoreException exceptions are automatically wrapped in an <code>CoreException</code>
	 * @exception InterruptedException if the operation detects a request to cancel, 
	 *  using <code>IProgressMonitor.isCanceled()</code>, it will exit by throwing 
	 *  <code>InterruptedException</code>
	 * 
	 * @since 3.5
	 */
	public static boolean non_existent(final org.omg.CORBA.Object obj, final IProgressMonitor monitor) throws CoreException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Checking if obj non existent", 1);
		return invoke(new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				return obj._non_existent();
			}

		}, subMonitor);
	}

	/**
	 * Invokes the given callable in an interruptible fashion
	 * 
	 * @exception CoreException exceptions are automatically wrapped in an <code>CoreException</code>
	 * @exception InterruptedException if the operation detects a request to cancel, 
	 *  using <code>IProgressMonitor.isCanceled()</code>, it will exit by throwing 
	 *  <code>InterruptedException</code>
	 * 
	 * @since 3.5
	 */
	public static < T > T invoke(Callable<T> callable, IProgressMonitor monitor) throws CoreException, InterruptedException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		Future<T> task = EXECUTOR.submit(callable);
		try {
			while (!monitor.isCanceled()) {
				try {
					return task.get(500, TimeUnit.MILLISECONDS);
				} catch (ExecutionException e) {
					throw new CoreException(new Status(Status.ERROR, "mil.jpeojtrs.sca.util", "Error while executing callable", e));
				} catch (TimeoutException e) {
					// PASS
				}
			}
			task.cancel(true);
			throw new InterruptedException();
		} finally {
			monitor.done();
		}
	}
}

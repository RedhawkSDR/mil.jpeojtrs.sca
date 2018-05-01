/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package mil.jpeojtrs.sca.util;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;

/**
 * @since 5.0
 */
public class CorbaUtils2 {

	private CorbaUtils2() {
	}

	/**
	 * Invokes the given {@link Callable} on a separate thread for CORBA calls. The method periodically checks the
	 * monitor for cancellation while waiting for the {@link Callable} to complete.
	 * @param callable The code to execute on a separate thread for CORBA calls
	 * @param monitor A progress monitor to periodically check for cancellation
	 * @exception ExecutionException Wraps an exception thrown by the {@link Callable}
	 * @exception OperationCanceledException Cancellation of the monitor was detected
	 * @since 5.0
	 */
	public static < T > T invoke(Callable<T> callable, IProgressMonitor monitor) throws ExecutionException, OperationCanceledException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		Future<T> task = CorbaUtils.EXECUTOR.submit(callable);

		try {
			while (!monitor.isCanceled()) {
				try {
					return task.get(500, TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					break;
				} catch (TimeoutException e) {
					// PASS
				}
			}
			task.cancel(true);
			throw new OperationCanceledException();
		} finally {
			monitor.done();
		}
	}

	/**
	 * Same as {@link #invoke(Callable, IProgressMonitor)}, but any exception thrown by the {@link Callable} is
	 * wrapped with {@link InvocationTargetException} instead of {@link ExecutionException}. This makes it easy to use
	 * this method within {@link org.eclipse.jface.operation.IRunnableWithProgress#run(IProgressMonitor)} in the UI.
	 * @param callable The code to execute on a separate thread for CORBA calls
	 * @param monitor A progress monitor to periodically check for cancellation
	 * @exception InvocationTargetException Wraps an exception thrown by the {@link Callable}
	 * @exception OperationCanceledException Cancellation of the monitor was detected
	 * @since 5.0
	 */
	public static < T > T invokeUI(Callable<T> callable, IProgressMonitor monitor) throws InvocationTargetException {
		try {
			return invoke(callable, monitor);
		} catch (ExecutionException e) {
			throw new InvocationTargetException(e.getCause());
		}
	}
}

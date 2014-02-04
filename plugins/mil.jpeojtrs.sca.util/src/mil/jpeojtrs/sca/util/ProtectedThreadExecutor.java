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

/**
 * @since 3.1
 * 
 */
public final class ProtectedThreadExecutor {

	private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool(new NamedThreadFactory(ProtectedThreadExecutor.class.getName()));

	private ProtectedThreadExecutor() {

	}

	private static boolean isProtectedThread(final Thread thread) {
		if ("main".equals(thread.getName()) || thread.getId() == 0) {
			return true;
		}
		for (final StackTraceElement element : thread.getStackTrace()) {
			final String className = element.getClassName();
			if (className.startsWith("org.eclipse.swt")) {
				return true;
			} else if ("gov.redhawk.model.sca.commands.ScaModelCommand".equals(className)) {
				return true;
			} else if ("org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl".equals(className)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @since 3.5
	 */
	public static void submit(Runnable runnable, int timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		if (ProtectedThreadExecutor.isProtectedThread(Thread.currentThread())) {
			final Future< ? > future = ProtectedThreadExecutor.EXECUTOR.submit(runnable);
			try {
				future.get(4, TimeUnit.SECONDS);
			} catch (final InterruptedException e) {
				future.cancel(true);
				throw e;
			}
		} else {
			runnable.run();
		}
	}

	/**
	 * @since 3.5
	 */
	public static void submit(Runnable runnable) throws InterruptedException, ExecutionException, TimeoutException {
		ProtectedThreadExecutor.submit(runnable, 4, TimeUnit.SECONDS);
	}

	/**
	 * @since 3.5
	 */
	public static < T > T submit(final Callable<T> callable, int timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		if (ProtectedThreadExecutor.isProtectedThread(Thread.currentThread())) {
			final Future<T> future = ProtectedThreadExecutor.EXECUTOR.submit(callable);
			try {
				return future.get(timeout, unit);
			} catch (final InterruptedException e) {
				future.cancel(true);
				throw e;
			}
		} else {
			try {
				return callable.call();
			} catch (final Exception e) { // SUPPRESS CHECKSTYLE Rethrown
				throw new ExecutionException(e);
			}
		}
	}

	public static < T > T submit(final Callable<T> callable) throws InterruptedException, ExecutionException, TimeoutException {
		return ProtectedThreadExecutor.submit(callable, 4, TimeUnit.SECONDS);
	}
}

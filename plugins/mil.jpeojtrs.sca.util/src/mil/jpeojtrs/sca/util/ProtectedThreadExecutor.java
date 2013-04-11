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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @since 3.1
 * 
 */
public final class ProtectedThreadExecutor {

	private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool(new NamedThreadFactory(ProtectedThreadExecutor.class.getName()));

	private ProtectedThreadExecutor() {

	}

	private static boolean isProtectedThread(final Thread thread) {
		if (thread.getName().equals("main") || thread.getId() == 0) {
			return true;
		}
		for (final StackTraceElement element : thread.getStackTrace()) {
			final String className = element.getClassName();
			if (className.startsWith("org.eclipse.swt")) {
				return true;
			} else if (className.equals("gov.redhawk.model.sca.commands.ScaModelCommand")) {
				return true;
			} else if (className.equals("org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl")) {
				return true;
			}
		}
		return false;
	}

	public static < T > T submit(final Callable<T> callable) throws InterruptedException, ExecutionException, TimeoutException {
		if (ProtectedThreadExecutor.isProtectedThread(Thread.currentThread())) {
			final Future<T> future = ProtectedThreadExecutor.EXECUTOR.submit(callable);
			try {
				return future.get(4, TimeUnit.SECONDS);
			} catch (final InterruptedException e) {
				future.cancel(true);
				throw e;
			}
		}
		try {
			return callable.call();
		} catch (final Exception e) {
			throw new ExecutionException(e);
		}
	}
}

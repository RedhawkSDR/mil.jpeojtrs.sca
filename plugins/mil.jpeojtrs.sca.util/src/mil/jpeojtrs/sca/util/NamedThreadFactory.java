package mil.jpeojtrs.sca.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.core.runtime.Assert;

/**
 * @since 3.3
 */
public class NamedThreadFactory implements ThreadFactory {

	private final ThreadGroup group;
	private final AtomicInteger threadNumber = new AtomicInteger(1);
	private final String namePrefix;

	public NamedThreadFactory(String poolName) {
		Assert.isNotNull(poolName, "Must provide a pool name.");
		group = new ThreadGroup(poolName);
		namePrefix = poolName + "-thread-";
	}

	public Thread newThread(Runnable r) {
		Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
		if (t.isDaemon())
			t.setDaemon(false);
		if (t.getPriority() != Thread.NORM_PRIORITY)
			t.setPriority(Thread.NORM_PRIORITY);
		return t;
	}

}

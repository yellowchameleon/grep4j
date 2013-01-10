package org.grep4j.core.command.linux;

import org.apache.commons.pool.KeyedObjectPool;
import org.apache.commons.pool.impl.StackKeyedObjectPool;
import org.grep4j.core.model.ServerDetails;

import com.jcraft.jsch.Session;

public class StackSessionPool {

	private final KeyedObjectPool<ServerDetails, Session> pool;

	private static class SingletonHolder {
		public static final StackSessionPool INSTANCE = new StackSessionPool();
	}

	public static StackSessionPool getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private StackSessionPool()
	{
		pool = new StackKeyedObjectPool<ServerDetails, Session>(new SessionFactory(), 1);
	}

	public KeyedObjectPool<ServerDetails, Session> getPool() {
		return pool;
	}

}
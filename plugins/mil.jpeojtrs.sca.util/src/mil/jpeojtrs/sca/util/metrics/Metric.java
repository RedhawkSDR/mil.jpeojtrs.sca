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
package mil.jpeojtrs.sca.util.metrics;

import java.util.ArrayList;
import java.util.List;

import org.jacorb.JacorbUtil;
import org.omg.CORBA.Any;
import org.omg.CORBA.SystemException;

import CF.DataType;
import CF.PropertiesHelper;
import mil.jpeojtrs.sca.util.AnyUtils;

/**
 * @since 4.7
 */
public class Metric {

	public static final String APP_UTIL = "application utilization";

	public static final String ATTR_CORES = "cores";
	public static final String ATTR_MEMORY = "memory";
	public static final String ATTR_VALID = "valid";
	public static final String ATTR_SHARED = "shared";
	public static final String ATTR_PROCESSES = "processes";
	public static final String ATTR_THREADS = "threads";
	public static final String ATTR_FILES = "files";
	public static final String ATTR_COMPONENT_HOST = "componenthost";

	private String id;
	private float cores = 0;
	private boolean coresSet = false;
	private float memory = 0;
	private boolean memorySet = false;
	private boolean valid = false;
	private boolean validSet = false;
	private boolean shared = false;
	private boolean sharedSet = false;
	private long processes = 0;
	private boolean processesSet = false;
	private long threads = 0;
	private boolean threadsSet = false;
	private long files = 0;
	private boolean filesSet = false;
	private String componentHost = "";
	private boolean componentHostSet = false;

	/**
	 * Creates a new {@link Metric} object with empty/default values.
	 */
	public Metric() {
	}

	/**
	 * Creates a new {@link Metric} object by demarshalling the provided {@link DataType}. Note that a
	 * {@link SystemException} can be thrown if the metrics cannot be demarshalled.
	 * @param metric The metric to demarshal
	 */
	public Metric(DataType metric) {
		id = metric.id;
		DataType[] props = PropertiesHelper.extract(metric.value);
		for (DataType prop : props) {
			switch (prop.id) {
			case ATTR_CORES:
				setCores(prop.value.extract_float());
				break;
			case ATTR_MEMORY:
				setMemory(prop.value.extract_float());
				break;
			case ATTR_VALID:
				setValid(prop.value.extract_boolean());
				break;
			case ATTR_SHARED:
				setShared(prop.value.extract_boolean());
				break;
			case ATTR_PROCESSES:
				setProcesses(prop.value.extract_ulong());
				break;
			case ATTR_THREADS:
				setThreads(prop.value.extract_ulong());
				break;
			case ATTR_FILES:
				setFiles(prop.value.extract_ulong());
				break;
			case ATTR_COMPONENT_HOST:
				setComponentHost(prop.value.extract_string());
				break;
			default:
				break;
			}
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getCores() {
		return cores;
	}

	public void setCores(float cores) {
		this.cores = cores;
		this.coresSet = true;
	}

	public boolean isSetCores() {
		return this.coresSet;
	}

	public float getMemory() {
		return memory;
	}

	public void setMemory(float memory) {
		this.memory = memory;
		this.memorySet = true;
	}

	public boolean isSetMemory() {
		return this.memorySet;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
		this.validSet = true;
	}

	public boolean isSetValid() {
		return this.validSet;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
		this.sharedSet = true;
	}

	public boolean isSetShared() {
		return this.sharedSet;
	}

	public long getProcesses() {
		return processes;
	}

	public void setProcesses(long processes) {
		this.processes = processes;
		this.processesSet = true;
	}

	public boolean isSetProcesses() {
		return this.processesSet;
	}

	public long getThreads() {
		return threads;
	}

	public void setThreads(long threads) {
		this.threads = threads;
		this.threadsSet = true;
	}

	public boolean isSetThreads() {
		return this.threadsSet;
	}

	public long getFiles() {
		return files;
	}

	public void setFiles(long files) {
		this.files = files;
		this.filesSet = true;
	}

	public boolean isSetFiles() {
		return this.filesSet;
	}

	public String getComponentHost() {
		return componentHost;
	}

	public void setComponentHost(String componentHost) {
		this.componentHost = componentHost;
		this.componentHostSet = true;
	}

	public boolean isSetComponentHost() {
		return this.componentHostSet;
	}

	/**
	 * @return Marshals and returns the metric
	 */
	public DataType toDataType(String[] attributes) {
		List<DataType> props = new ArrayList<>();
		for (String attribute : attributes) {
			switch (attribute) {
			case ATTR_CORES:
				if (coresSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(cores, "float", false)));
				}
				break;
			case ATTR_MEMORY:
				if (memorySet) {
					props.add(new DataType(attribute, AnyUtils.toAny(memory, "float", false)));
				}
				break;
			case ATTR_VALID:
				if (validSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(valid, "boolean", false)));
				}
				break;
			case ATTR_SHARED:
				if (sharedSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(shared, "boolean", false)));
				}
				break;
			case ATTR_PROCESSES:
				if (processesSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(processes, "ulong", false)));
				}
				break;
			case ATTR_THREADS:
				if (threadsSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(threads, "ulong", false)));
				}
				break;
			case ATTR_FILES:
				if (filesSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(files, "ulong", false)));
				}
				break;
			case ATTR_COMPONENT_HOST:
				if (componentHostSet) {
					props.add(new DataType(attribute, AnyUtils.toAny(componentHost, "string", false)));
				}
				break;
			default:
				break;
			}
		}

		Any any = JacorbUtil.init().create_any();
		PropertiesHelper.insert(any, props.toArray(new DataType[props.size()]));
		return new DataType(this.id, any);
	}
}

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
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import mil.jpeojtrs.sca.partitioning.ComponentFiles;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.ExternalProperties;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadConnections;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadPartitioning;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.UsesDeviceDependencies;
import mil.jpeojtrs.sca.util.QueryParser;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Software Assembly</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getComponentFiles <em>Component Files</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getAssemblyController <em>Assembly Controller</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getExternalPorts <em>External Ports</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getExternalProperties <em>External Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.SoftwareAssemblyImpl#getUsesDeviceDependencies <em>Uses Device Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareAssemblyImpl extends EObjectImpl implements SoftwareAssembly {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentFiles() <em>Component Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentFiles()
	 * @generated
	 * @ordered
	 */
	protected ComponentFiles componentFiles;
	/**
	 * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioning()
	 * @generated
	 * @ordered
	 */
	protected SadPartitioning partitioning;
	/**
	 * The cached value of the '{@link #getAssemblyController() <em>Assembly Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyController()
	 * @generated
	 * @ordered
	 */
	protected AssemblyController assemblyController;
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected SadConnections connections;
	/**
	 * The cached value of the '{@link #getExternalPorts() <em>External Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalPorts()
	 * @generated
	 * @ordered
	 */
	protected ExternalPorts externalPorts;
	/**
	 * The cached value of the '{@link #getExternalProperties() <em>External Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @see #getExternalProperties()
	 * @generated
	 * @ordered
	 */
	protected ExternalProperties externalProperties;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsesDeviceDependencies() <em>Uses Device Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesDeviceDependencies()
	 * @generated
	 * @ordered
	 */
	protected UsesDeviceDependencies usesDeviceDependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.SOFTWARE_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFiles getComponentFiles() {
		return componentFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentFiles(ComponentFiles newComponentFiles, NotificationChain msgs) {
		ComponentFiles oldComponentFiles = componentFiles;
		componentFiles = newComponentFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES, oldComponentFiles,
				newComponentFiles);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentFiles(ComponentFiles newComponentFiles) {
		if (newComponentFiles != componentFiles) {
			NotificationChain msgs = null;
			if (componentFiles != null)
				msgs = ((InternalEObject) componentFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES, null,
					msgs);
			if (newComponentFiles != null)
				msgs = ((InternalEObject) newComponentFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES, null,
					msgs);
			msgs = basicSetComponentFiles(newComponentFiles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES, newComponentFiles, newComponentFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadPartitioning getPartitioning() {
		return partitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitioning(SadPartitioning newPartitioning, NotificationChain msgs) {
		SadPartitioning oldPartitioning = partitioning;
		partitioning = newPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING, oldPartitioning,
				newPartitioning);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartitioning(SadPartitioning newPartitioning) {
		if (newPartitioning != partitioning) {
			NotificationChain msgs = null;
			if (partitioning != null)
				msgs = ((InternalEObject) partitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING, null, msgs);
			if (newPartitioning != null)
				msgs = ((InternalEObject) newPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING, null, msgs);
			msgs = basicSetPartitioning(newPartitioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING, newPartitioning, newPartitioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyController getAssemblyController() {
		return assemblyController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyController(AssemblyController newAssemblyController, NotificationChain msgs) {
		AssemblyController oldAssemblyController = assemblyController;
		assemblyController = newAssemblyController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER,
				oldAssemblyController, newAssemblyController);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblyController(AssemblyController newAssemblyController) {
		if (newAssemblyController != assemblyController) {
			NotificationChain msgs = null;
			if (assemblyController != null)
				msgs = ((InternalEObject) assemblyController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER,
					null, msgs);
			if (newAssemblyController != null)
				msgs = ((InternalEObject) newAssemblyController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER,
					null, msgs);
			msgs = basicSetAssemblyController(newAssemblyController, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER, newAssemblyController,
				newAssemblyController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SadConnections getConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnections(SadConnections newConnections, NotificationChain msgs) {
		SadConnections oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS, oldConnections,
				newConnections);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnections(SadConnections newConnections) {
		if (newConnections != connections) {
			NotificationChain msgs = null;
			if (connections != null)
				msgs = ((InternalEObject) connections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS, null, msgs);
			if (newConnections != null)
				msgs = ((InternalEObject) newConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS, null, msgs);
			msgs = basicSetConnections(newConnections, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS, newConnections, newConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalPorts getExternalPorts() {
		return externalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalPorts(ExternalPorts newExternalPorts, NotificationChain msgs) {
		ExternalPorts oldExternalPorts = externalPorts;
		externalPorts = newExternalPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS, oldExternalPorts,
				newExternalPorts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalPorts(ExternalPorts newExternalPorts) {
		if (newExternalPorts != externalPorts) {
			NotificationChain msgs = null;
			if (externalPorts != null)
				msgs = ((InternalEObject) externalPorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS, null, msgs);
			if (newExternalPorts != null)
				msgs = ((InternalEObject) newExternalPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS, null, msgs);
			msgs = basicSetExternalPorts(newExternalPorts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS, newExternalPorts, newExternalPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalProperties getExternalProperties() {
		return externalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalProperties(ExternalProperties newExternalProperties, NotificationChain msgs) {
		ExternalProperties oldExternalProperties = externalProperties;
		externalProperties = newExternalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES,
				oldExternalProperties, newExternalProperties);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalProperties(ExternalProperties newExternalProperties) {
		if (newExternalProperties != externalProperties) {
			NotificationChain msgs = null;
			if (externalProperties != null)
				msgs = ((InternalEObject) externalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES,
					null, msgs);
			if (newExternalProperties != null)
				msgs = ((InternalEObject) newExternalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES,
					null, msgs);
			msgs = basicSetExternalProperties(newExternalProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES, newExternalProperties,
				newExternalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		// END GENERATED CODE
		// If the URI has a name query attribute use it instead
		if ((eResource() != null) && (eResource().getURI() != null) && (eResource().getURI().query() != null)) {
			Map<String, String> queryParams = QueryParser.parseQuery(eResource().getURI().query());
			if (queryParams.containsKey("name")) {
				return queryParams.get("name");
			}
		}
		return name;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceDependencies getUsesDeviceDependencies() {
		return usesDeviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesDeviceDependencies(UsesDeviceDependencies newUsesDeviceDependencies, NotificationChain msgs) {
		UsesDeviceDependencies oldUsesDeviceDependencies = usesDeviceDependencies;
		usesDeviceDependencies = newUsesDeviceDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES,
				oldUsesDeviceDependencies, newUsesDeviceDependencies);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesDeviceDependencies(UsesDeviceDependencies newUsesDeviceDependencies) {
		if (newUsesDeviceDependencies != usesDeviceDependencies) {
			NotificationChain msgs = null;
			if (usesDeviceDependencies != null)
				msgs = ((InternalEObject) usesDeviceDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES, null, msgs);
			if (newUsesDeviceDependencies != null)
				msgs = ((InternalEObject) newUsesDeviceDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES, null, msgs);
			msgs = basicSetUsesDeviceDependencies(newUsesDeviceDependencies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES, newUsesDeviceDependencies,
				newUsesDeviceDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SadComponentInstantiation getComponentInstantiation(String instantiationId) {
		// END GENERATED CODE
		SadComponentInstantiation retVal = null;
		for (SadComponentPlacement cp : getPartitioning().getComponentPlacement()) {
			retVal = getComponentInstantiation(instantiationId, cp.getComponentInstantiation());
			if (retVal != null) {
				break;
			}
		}
		if (retVal == null) {
			for (HostCollocation hc : getPartitioning().getHostCollocation()) {
				for (SadComponentPlacement cp : hc.getComponentPlacement()) {
					retVal = getComponentInstantiation(instantiationId, cp.getComponentInstantiation());
					if (retVal != null) {
						break;
					}
				}
				if (retVal != null) {
					break;
				}
			}
		}
		return retVal;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get's all components in their start order; components without a start order
	 * are listed at the end.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<SadComponentInstantiation> getComponentInstantiationsInStartOrder() {
		// END GENERATED CODE

		final EList<SadComponentInstantiation> result = getAllComponentInstantiations();

		// sort the component instantations
		Collections.sort(result, new Comparator<SadComponentInstantiation>() {

			@Override
			public int compare(SadComponentInstantiation ci1, SadComponentInstantiation ci2) {
				if ((ci1 != null) && (ci2 != null)) {
					if ((ci1.getStartOrder() != null) && (ci2.getStartOrder() != null)) {
						return ci1.getStartOrder().compareTo(ci2.getStartOrder());
					} else if ((ci1.getStartOrder() != null) && (ci2.getStartOrder() == null)) {
						// only ci1 has a start order
						return -1;
					} else if ((ci1.getStartOrder() == null) && (ci2.getStartOrder() != null)) {
						// only ci2 has a start order
						return 1;
					} else {
						return 0;
					}
				}
				return 0;
			}
		});

		return result;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<SadComponentInstantiation> getAllComponentInstantiations() {
		// END GENERATED CODE

		final EList<SadComponentInstantiation> result = new BasicEList<SadComponentInstantiation>();
		if (getPartitioning() == null) {
			return result;
		}

		// get all the component instantiations
		for (SadComponentPlacement cp : getPartitioning().getComponentPlacement()) {
			for (SadComponentInstantiation ci : cp.getComponentInstantiation()) {
				result.add(ci);
			}
		}

		for (HostCollocation hc : getPartitioning().getHostCollocation()) {
			for (SadComponentPlacement cp : hc.getComponentPlacement()) {
				for (SadComponentInstantiation ci : cp.getComponentInstantiation()) {
					result.add(ci);
				}
			}
		}

		return result;

		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES:
			return basicSetComponentFiles(null, msgs);
		case SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING:
			return basicSetPartitioning(null, msgs);
		case SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER:
			return basicSetAssemblyController(null, msgs);
		case SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS:
			return basicSetConnections(null, msgs);
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS:
			return basicSetExternalPorts(null, msgs);
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES:
			return basicSetExternalProperties(null, msgs);
		case SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES:
			return basicSetUsesDeviceDependencies(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SadPackage.SOFTWARE_ASSEMBLY__DESCRIPTION:
			return getDescription();
		case SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES:
			return getComponentFiles();
		case SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING:
			return getPartitioning();
		case SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER:
			return getAssemblyController();
		case SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS:
			return getConnections();
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS:
			return getExternalPorts();
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES:
			return getExternalProperties();
		case SadPackage.SOFTWARE_ASSEMBLY__ID:
			return getId();
		case SadPackage.SOFTWARE_ASSEMBLY__NAME:
			return getName();
		case SadPackage.SOFTWARE_ASSEMBLY__VERSION:
			return getVersion();
		case SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES:
			return getUsesDeviceDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SadPackage.SOFTWARE_ASSEMBLY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES:
			setComponentFiles((ComponentFiles) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING:
			setPartitioning((SadPartitioning) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER:
			setAssemblyController((AssemblyController) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS:
			setConnections((SadConnections) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS:
			setExternalPorts((ExternalPorts) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES:
			setExternalProperties((ExternalProperties) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__ID:
			setId((String) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__NAME:
			setName((String) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__VERSION:
			setVersion((String) newValue);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES:
			setUsesDeviceDependencies((UsesDeviceDependencies) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SadPackage.SOFTWARE_ASSEMBLY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES:
			setComponentFiles((ComponentFiles) null);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING:
			setPartitioning((SadPartitioning) null);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER:
			setAssemblyController((AssemblyController) null);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS:
			setConnections((SadConnections) null);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS:
			setExternalPorts((ExternalPorts) null);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES:
			setExternalProperties((ExternalProperties) null);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__ID:
			setId(ID_EDEFAULT);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES:
			setUsesDeviceDependencies((UsesDeviceDependencies) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SadPackage.SOFTWARE_ASSEMBLY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SadPackage.SOFTWARE_ASSEMBLY__COMPONENT_FILES:
			return componentFiles != null;
		case SadPackage.SOFTWARE_ASSEMBLY__PARTITIONING:
			return partitioning != null;
		case SadPackage.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER:
			return assemblyController != null;
		case SadPackage.SOFTWARE_ASSEMBLY__CONNECTIONS:
			return connections != null;
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PORTS:
			return externalPorts != null;
		case SadPackage.SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES:
			return externalProperties != null;
		case SadPackage.SOFTWARE_ASSEMBLY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SadPackage.SOFTWARE_ASSEMBLY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SadPackage.SOFTWARE_ASSEMBLY__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case SadPackage.SOFTWARE_ASSEMBLY__USES_DEVICE_DEPENDENCIES:
			return usesDeviceDependencies != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

	private SadComponentInstantiation getComponentInstantiation(String instantiationId, List<SadComponentInstantiation> instantiations) {
		for (SadComponentInstantiation inst : instantiations) {
			if (inst.getId().equals(instantiationId)) {
				return inst;
			}
		}
		return null;
	}

} // SoftwareAssemblyImpl

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
package mil.jpeojtrs.sca.partitioning.impl;

import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.ConnectInterface;
import mil.jpeojtrs.sca.partitioning.ConnectionTarget;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.FindByStub;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPort;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.UsesPort;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getUsesPort <em>Uses Port</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getProvidesPort <em>Provides Port</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getComponentSupportedInterface <em>Component Supported Interface</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getFindBy <em>Find By</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectInterfaceImpl< CIR extends ComponentInstantiationRef<?>, UP extends UsesPort<CIR>, PP extends ProvidesPort<CIR>> extends
        EObjectImpl implements ConnectInterface<CIR, UP, PP> {
	/**
	 * The cached value of the '{@link #getUsesPort() <em>Uses Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesPort()
	 * @generated
	 * @ordered
	 */
	protected UP usesPort;
	/**
	 * The cached value of the '{@link #getProvidesPort() <em>Provides Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesPort()
	 * @generated
	 * @ordered
	 */
	protected PP providesPort;
	/**
	 * The cached value of the '{@link #getComponentSupportedInterface() <em>Component Supported Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSupportedInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentSupportedInterface componentSupportedInterface;
	/**
	 * The cached value of the '{@link #getFindBy() <em>Find By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindBy()
	 * @generated
	 * @ordered
	 */
	protected FindBy findBy;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.CONNECT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UP getUsesPort() {
		return usesPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesPort(UP newUsesPort, NotificationChain msgs) {
		UP oldUsesPort = usesPort;
		usesPort = newUsesPort;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__USES_PORT, oldUsesPort, newUsesPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsesPort(UP newUsesPort) {
		if (newUsesPort != usesPort)
		{
			NotificationChain msgs = null;
			if (usesPort != null)
				msgs = ((InternalEObject)usesPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__USES_PORT, null, msgs);
			if (newUsesPort != null)
				msgs = ((InternalEObject)newUsesPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__USES_PORT, null, msgs);
			msgs = basicSetUsesPort(newUsesPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__USES_PORT, newUsesPort, newUsesPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PP getProvidesPort() {
		return providesPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidesPort(PP newProvidesPort, NotificationChain msgs) {
		PP oldProvidesPort = providesPort;
		providesPort = newProvidesPort;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT, oldProvidesPort, newProvidesPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidesPort(PP newProvidesPort) {
		if (newProvidesPort != providesPort)
		{
			NotificationChain msgs = null;
			if (providesPort != null)
				msgs = ((InternalEObject)providesPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT, null, msgs);
			if (newProvidesPort != null)
				msgs = ((InternalEObject)newProvidesPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT, null, msgs);
			msgs = basicSetProvidesPort(newProvidesPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT, newProvidesPort, newProvidesPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSupportedInterface getComponentSupportedInterface() {
		return componentSupportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentSupportedInterface(ComponentSupportedInterface newComponentSupportedInterface, NotificationChain msgs) {
		ComponentSupportedInterface oldComponentSupportedInterface = componentSupportedInterface;
		componentSupportedInterface = newComponentSupportedInterface;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE, oldComponentSupportedInterface, newComponentSupportedInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentSupportedInterface(ComponentSupportedInterface newComponentSupportedInterface) {
		if (newComponentSupportedInterface != componentSupportedInterface)
		{
			NotificationChain msgs = null;
			if (componentSupportedInterface != null)
				msgs = ((InternalEObject)componentSupportedInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE, null, msgs);
			if (newComponentSupportedInterface != null)
				msgs = ((InternalEObject)newComponentSupportedInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE, null, msgs);
			msgs = basicSetComponentSupportedInterface(newComponentSupportedInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE, newComponentSupportedInterface, newComponentSupportedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindBy getFindBy() {
		return findBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFindBy(FindBy newFindBy, NotificationChain msgs) {
		FindBy oldFindBy = findBy;
		findBy = newFindBy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__FIND_BY, oldFindBy, newFindBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindBy(FindBy newFindBy) {
		if (newFindBy != findBy)
		{
			NotificationChain msgs = null;
			if (findBy != null)
				msgs = ((InternalEObject)findBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__FIND_BY, null, msgs);
			if (newFindBy != null)
				msgs = ((InternalEObject)newFindBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartitioningPackage.CONNECT_INTERFACE__FIND_BY, null, msgs);
			msgs = basicSetFindBy(newFindBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__FIND_BY, newFindBy, newFindBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsesPortStub getSource() {
		UsesPortStub source = basicGetSource();
		return source != null && source.eIsProxy() ? (UsesPortStub)eResolveProxy((InternalEObject)source) : source;
	}

	protected UsesPortStub source;
	protected ConnectionTarget target;
	
	private EContentAdapter sourceListener = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			switch(notification.getEventType()) {
			case Notification.SET:
			case Notification.ADD:
			case Notification.ADD_MANY:
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:
				updateSource(getSource());
			}
		}
	};

	private EContentAdapter targetListener = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			switch(notification.getEventType()) {
			case Notification.SET:
			case Notification.ADD:
			case Notification.ADD_MANY:
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:
				updateTarget(ConnectInterfaceImpl.this.getTarget());
			}
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UsesPortStub basicGetSourceGen() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UsesPortStub basicGetSource() {
		// END GENERATED CODE
		if (basicGetSourceGen() != null) {
			return basicGetSourceGen();
		}
		final String identifier = getIdentifier(this.usesPort);
		if (identifier == null) {
			return null;
		}
		if (this.usesPort.getComponentInstantiationRef() != null) {
			final ComponentInstantiation instantiation = this.usesPort.getComponentInstantiationRef().getInstantiation();
			if (instantiation != null) {
				for (final UsesPortStub stub : instantiation.getUses()) {
					if (identifier.equals(getIdentifier(stub))) {
						return stub;
					}
				}
			}
		} else if (this.usesPort.getDeviceThatLoadedThisComponentRef() != null) {
			// FIXME: implement this method to return the 'Source' reference
			// -> do not perform proxy resolution
			// Ensure that you remove @generated or mark it @generated NOT
			return null;
		} else if (this.usesPort.getDeviceUsedByThisComponentRef() != null) {
			// FIXME: implement this method to return the 'Source' reference
			// -> do not perform proxy resolution
			// Ensure that you remove @generated or mark it @generated NOT
			return null;
		} else if (this.usesPort.getFindBy() != null) {
			final FindBy findby = this.usesPort.getFindBy();
			final FindByStub findByStub = getFindStub(findby);
			if (findByStub != null) {
				for (final UsesPortStub stub : findByStub.getUses()) {
					if (identifier.equals(getIdentifier(stub))) {
						return stub;
					}
				}
			}
		}
		return null;

		// BEGIN GENERATED CODE
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSourceGen(UsesPortStub newSource) {
		UsesPortStub oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSource(final UsesPortStub newSource) {
		// END GENERATED CODE
		if (this.source != null) {
			this.source.eContainer().eAdapters().remove(sourceListener);
			this.sourceListener.unsetTarget(this.source.eContainer());
		}
		this.setSourceGen(newSource);
		updateSource(newSource);
		if (this.source != null) {
			this.source.eContainer().eAdapters().add(sourceListener);
			this.sourceListener.setTarget(this.source.eContainer());
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionTarget getTarget() {
		ConnectionTarget target = basicGetTarget();
		return target != null && target.eIsProxy() ? (ConnectionTarget)eResolveProxy((InternalEObject)target) : target;
	}

	private void updateSource(UsesPortStub newSource) {
		final UP newUsesPort = createUsesPort(newSource);
		setUsesPort(newUsesPort);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConnectionTarget basicGetTargetGen() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConnectionTarget basicGetTarget() {
		// END GENERATED CODE
		if (basicGetTargetGen() != null) {
			return basicGetTargetGen();
		}
		if (this.getProvidesPort() != null) {
			final PP port = getProvidesPort();
			final String identifier = getIdentifier(port);
			if (identifier != null) {
				if (port.getComponentInstantiationRef() != null) {
					final ComponentInstantiation instantiation = port.getComponentInstantiationRef().getInstantiation();
					if (instantiation != null) {
						for (final ProvidesPortStub stub : instantiation.getProvides()) {
							if (identifier.equals(getIdentifier(stub))) {
								return stub;
							}
						}
					}
				} else if (port.getFindBy() != null) {
					final FindBy newFindBy = port.getFindBy();
					final FindByStub findByStub = getFindStub(newFindBy);
					if (findByStub != null) {
						for (final ProvidesPortStub stub : findByStub.getProvides()) {
							if (identifier.equals(getIdentifier(stub))) {
								return stub;
							}
						}
					}
				}
			} else if (port.getDeviceUsedByThisComponentRef() != null) {
				// FIXME: implement this method to set the 'Source' reference
				// Ensure that you remove @generated or mark it @generated NOT
				return null;
			} else if (port.getDeviceThatLoadedThisComponentRef() != null) {
				// FIXME: implement this method to set the 'Source' reference
				// Ensure that you remove @generated or mark it @generated NOT
				return null;
			}
		} else if (getFindBy() != null) {
			return getFindStub(getFindBy());
		} else if (getComponentSupportedInterface() != null) {
			final ComponentSupportedInterface csi = getComponentSupportedInterface();
			final String identifier = getIdentifier(csi);
			if (identifier != null && csi != null) {
				if (csi.getComponentInstantiationRef() != null) {
					final ComponentInstantiation instantiation = csi.getComponentInstantiationRef().getInstantiation();
					if (instantiation != null) {
						return instantiation.getInterfaceStub();
					}
				} else if (csi.getFindBy() != null) {
					FindBy csiFindBy = csi.getFindBy();
					FindByStub findByStub = getFindStub(csiFindBy);
					if (findByStub != null) {
						return findByStub.getInterface();
					}
				}
			}
		}

		return null;
		// BEGIN GENERATED CODE
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTargetGen(ConnectionTarget newTarget) {
		ConnectionTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.CONNECT_INTERFACE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTarget(final ConnectionTarget newTarget) {
		// END GENERATED CODE
		if (this.target != null) {
			if (target instanceof FindByStub) {
				this.target.eAdapters().remove(this.targetListener);
				this.targetListener.unsetTarget(this.target);
			} else {
				this.target.eContainer().eAdapters().remove(targetListener);
				this.targetListener.unsetTarget(this.target.eContainer());
			}
		}
		this.setTargetGen(newTarget);
		updateTarget(newTarget);
		if (this.target != null) {
			if (target instanceof FindByStub) {
				this.target.eAdapters().add(targetListener);
				this.targetListener.setTarget(this.target);
			} else {
				this.target.eContainer().eAdapters().add(targetListener);
				this.targetListener.setTarget(this.target.eContainer());
			}
		}
		// BEGIN GENERATED CODE

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PartitioningPackage.CONNECT_INTERFACE__USES_PORT:
				return basicSetUsesPort(null, msgs);
			case PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT:
				return basicSetProvidesPort(null, msgs);
			case PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE:
				return basicSetComponentSupportedInterface(null, msgs);
			case PartitioningPackage.CONNECT_INTERFACE__FIND_BY:
				return basicSetFindBy(null, msgs);
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
		switch (featureID)
		{
			case PartitioningPackage.CONNECT_INTERFACE__USES_PORT:
				return getUsesPort();
			case PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT:
				return getProvidesPort();
			case PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE:
				return getComponentSupportedInterface();
			case PartitioningPackage.CONNECT_INTERFACE__FIND_BY:
				return getFindBy();
			case PartitioningPackage.CONNECT_INTERFACE__ID:
				return getId();
			case PartitioningPackage.CONNECT_INTERFACE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case PartitioningPackage.CONNECT_INTERFACE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PartitioningPackage.CONNECT_INTERFACE__USES_PORT:
				setUsesPort((UP)newValue);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT:
				setProvidesPort((PP)newValue);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE:
				setComponentSupportedInterface((ComponentSupportedInterface)newValue);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__FIND_BY:
				setFindBy((FindBy)newValue);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__ID:
				setId((String)newValue);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__SOURCE:
				setSource((UsesPortStub)newValue);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__TARGET:
				setTarget((ConnectionTarget)newValue);
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
		switch (featureID)
		{
			case PartitioningPackage.CONNECT_INTERFACE__USES_PORT:
				setUsesPort((UP)null);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT:
				setProvidesPort((PP)null);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE:
				setComponentSupportedInterface((ComponentSupportedInterface)null);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__FIND_BY:
				setFindBy((FindBy)null);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__SOURCE:
				setSource((UsesPortStub)null);
				return;
			case PartitioningPackage.CONNECT_INTERFACE__TARGET:
				setTarget((ConnectionTarget)null);
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
		switch (featureID)
		{
			case PartitioningPackage.CONNECT_INTERFACE__USES_PORT:
				return usesPort != null;
			case PartitioningPackage.CONNECT_INTERFACE__PROVIDES_PORT:
				return providesPort != null;
			case PartitioningPackage.CONNECT_INTERFACE__COMPONENT_SUPPORTED_INTERFACE:
				return componentSupportedInterface != null;
			case PartitioningPackage.CONNECT_INTERFACE__FIND_BY:
				return findBy != null;
			case PartitioningPackage.CONNECT_INTERFACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PartitioningPackage.CONNECT_INTERFACE__SOURCE:
				return basicGetSource() != null;
			case PartitioningPackage.CONNECT_INTERFACE__TARGET:
				return basicGetTarget() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	private void updateTarget(ConnectionTarget newTarget) {
		if (newTarget == null) {
			setFindBy(null);
			setProvidesPort(null);
			setComponentSupportedInterface(null);
		} else if (newTarget instanceof FindByStub) {
			final FindByStub findByStub = (FindByStub) newTarget;
			final FindBy newFindBy = createFindBy(findByStub);
			this.setFindBy(newFindBy);
		} else if (newTarget instanceof ProvidesPortStub) {
			final PP newProvidesPort = createProvidesPort((ProvidesPortStub) newTarget);
			this.setProvidesPort(newProvidesPort);
		} else if (newTarget instanceof ComponentSupportedInterfaceStub) {
			String supportedIdentifier = (source !=  null) ? source.getSupportedIdentifier(): null;
			final ComponentSupportedInterface csi = createComponentSupportedInterface((ComponentSupportedInterfaceStub) newTarget, supportedIdentifier);
			this.setComponentSupportedInterface(csi);
		} else {
			// FIXME: implement this method to set the 'Source' reference
			// Ensure that you remove @generated or mark it @generated NOT
			return;
		}
	}

	private UP createUsesPort(final UsesPortStub stub) {
		if (stub == null) {
			return null;
		}
		final EObject container = stub.eContainer();
		final UP newUsesPort = createUsesPort();
		newUsesPort.setUsesIndentifier(stub.getName());
		if (container == null) {
			return null;
		} else if (container instanceof ComponentInstantiation) {
			final CIR value = createComponentInstantiationRef((ComponentInstantiation) container);
			newUsesPort.setComponentInstantiationRef(value);
		} else if (container instanceof FindByStub) {
			final FindByStub findByStub = (FindByStub) container;
			final FindBy newFindBy = createFindBy(findByStub);
			newUsesPort.setFindBy(newFindBy);
		} else {
			// FIXME: implement this method to set the 'Source' reference
			// Ensure that you remove @generated or mark it @generated NOT
			return null;
		}
		return newUsesPort;
	}

	protected abstract UP createUsesPort();

	protected abstract CIR createComponentInstantiationRef(final ComponentInstantiation container);

	private FindBy createFindBy(final FindByStub stub) {
		if (stub == null) {
			return null;
		}
		final FindBy findBy = createFindBy();
		if (stub.getDomainFinder() != null) {
			findBy.setDomainFinder(EcoreUtil.copy(stub.getDomainFinder()));
		} else if (stub.getNamingService() != null) {
			findBy.setNamingService(EcoreUtil.copy(stub.getNamingService()));
		}
		return findBy;
	}

	protected FindBy createFindBy() {
		return PartitioningFactory.eINSTANCE.createFindBy();
	}

	private String getIdentifier(final ProvidesPortStub stub) {
		if (stub == null) {
			return null;
		}
		if (stub.getProvides() == null) {
			return stub.getName();
		}
		return stub.getProvides().getProvidesName();
	}

	private String getIdentifier(final ProvidesPort< ? > port) {
		return (port != null) ? port.getProvidesIdentifier() : null;
	}

	private String getIdentifier(final UsesPortStub stub) {
		if (stub == null) {
			return null;
		}
		if (stub.getUses() == null) {
			return stub.getName();
		}
		return stub.getUses().getUsesName();
	}

	private String getIdentifier(final UsesPort< ? > port) {
		return (port != null) ? port.getUsesIndentifier() : null;
	}

	private String getIdentifier(final ComponentSupportedInterface csi) {
		return (csi != null) ? csi.getSupportedIdentifier() : null;
	}

	private FindByStub getFindStub(final FindBy findby) {
		// TODO Auto-generated method stub
		return null;
	}

	private ComponentSupportedInterface createComponentSupportedInterface(final ComponentSupportedInterfaceStub stub, String supportedIdentifier) {
		if (stub == null) {
			return null;
		}
		final EObject container = stub.eContainer();
		final ComponentSupportedInterface csi = createComponentSupportedInterface();
		csi.setSupportedIdentifier(supportedIdentifier);
		if (container instanceof FindByStub) {
			final FindByStub findByStub = (FindByStub) container;
			final FindBy newFindBy = createFindBy(findByStub);
			csi.setFindBy(newFindBy);
		} else if (container instanceof ComponentInstantiation) {
			final ComponentInstantiation componentInstantiation = (ComponentInstantiation) container;
			final ComponentInstantiationRef< ? > ref = createComponentInstantiationRef(componentInstantiation);
			csi.setComponentInstantiationRef(ref);
		}
		return csi;
	}

	protected ComponentSupportedInterface createComponentSupportedInterface() {
		return PartitioningFactory.eINSTANCE.createComponentSupportedInterface();
	}

	protected abstract PP createProvidesPort();

	private PP createProvidesPort(final ProvidesPortStub stub) {
		if (stub == null) {
			return null;
		}
		final EObject container = stub.eContainer();
		final PP newProvidesPort = createProvidesPort();
		newProvidesPort.setProvidesIdentifier(stub.getName());
		
		if (container instanceof FindByStub) {
			final FindByStub findByStub = (FindByStub) container;
			final FindBy newFindBy = createFindBy(findByStub);
			newProvidesPort.setFindBy(newFindBy);
		} else if (container instanceof ComponentInstantiation) {
			final ComponentInstantiation componentInstantiation = (ComponentInstantiation) container;
			final CIR ref = createComponentInstantiationRef(componentInstantiation);
			newProvidesPort.setComponentInstantiationRef(ref);	
		}
		return newProvidesPort;
	}

} //ConnectInterfaceImpl

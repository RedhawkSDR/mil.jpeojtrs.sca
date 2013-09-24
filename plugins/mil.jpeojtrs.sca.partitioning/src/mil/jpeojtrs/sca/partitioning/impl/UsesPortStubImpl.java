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

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;
import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Port Stub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.impl.UsesPortStubImpl#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsesPortStubImpl extends EObjectImpl implements UsesPortStub {
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
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Uses uses;
	/**
	 * The default value of the '{@link #getSupportedIdentifier() <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSupportedIdentifier() <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String supportedIdentifier = SUPPORTED_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesPortStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartitioningPackage.Literals.USES_PORT_STUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT_STUB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uses getUses() {
		if (uses != null && uses.eIsProxy())
		{
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (Uses)eResolveProxy(oldUses);
			if (uses != oldUses)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartitioningPackage.USES_PORT_STUB__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uses basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesGen(Uses newUses) {
		Uses oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT_STUB__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setUses(Uses newUses) {
		setUsesGen(newUses);
		setName(newUses != null ? newUses.getUsesName() : null);
		setSupportedIdentifier(newUses != null ? newUses.getRepID() : null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupportedIdentifier() {
		return supportedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedIdentifier(String newSupportedIdentifier) {
		String oldSupportedIdentifier = supportedIdentifier;
		supportedIdentifier = newSupportedIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartitioningPackage.USES_PORT_STUB__SUPPORTED_IDENTIFIER, oldSupportedIdentifier, supportedIdentifier));
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
			case PartitioningPackage.USES_PORT_STUB__NAME:
				return getName();
			case PartitioningPackage.USES_PORT_STUB__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case PartitioningPackage.USES_PORT_STUB__SUPPORTED_IDENTIFIER:
				return getSupportedIdentifier();
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
		switch (featureID)
		{
			case PartitioningPackage.USES_PORT_STUB__NAME:
				setName((String)newValue);
				return;
			case PartitioningPackage.USES_PORT_STUB__USES:
				setUses((Uses)newValue);
				return;
			case PartitioningPackage.USES_PORT_STUB__SUPPORTED_IDENTIFIER:
				setSupportedIdentifier((String)newValue);
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
			case PartitioningPackage.USES_PORT_STUB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PartitioningPackage.USES_PORT_STUB__USES:
				setUses((Uses)null);
				return;
			case PartitioningPackage.USES_PORT_STUB__SUPPORTED_IDENTIFIER:
				setSupportedIdentifier(SUPPORTED_IDENTIFIER_EDEFAULT);
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
			case PartitioningPackage.USES_PORT_STUB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PartitioningPackage.USES_PORT_STUB__USES:
				return uses != null;
			case PartitioningPackage.USES_PORT_STUB__SUPPORTED_IDENTIFIER:
				return SUPPORTED_IDENTIFIER_EDEFAULT == null ? supportedIdentifier != null : !SUPPORTED_IDENTIFIER_EDEFAULT.equals(supportedIdentifier);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", supportedIdentifier: ");
		result.append(supportedIdentifier);
		result.append(')');
		return result.toString();
	}

} //UsesPortStubImpl

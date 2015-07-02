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
package mil.jpeojtrs.sca.dcd.impl;

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DcdUsesPort;
import mil.jpeojtrs.sca.partitioning.impl.UsesPortImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DcdUsesPortImpl extends UsesPortImpl<DcdComponentInstantiationRef>implements DcdUsesPort {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcdUsesPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DCD_USES_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetComponentInstantiationRef(DcdComponentInstantiationRef newComponentInstantiationRef, NotificationChain msgs) {
		return super.basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
	}

} //DcdUsesPortImpl

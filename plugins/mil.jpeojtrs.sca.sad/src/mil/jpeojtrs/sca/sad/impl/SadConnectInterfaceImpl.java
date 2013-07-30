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

import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadConnectInterface;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadProvidesPort;
import mil.jpeojtrs.sca.sad.SadUsesPort;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SadConnectInterfaceImpl extends ConnectInterfaceImpl<SadComponentInstantiationRef, SadUsesPort, SadProvidesPort> implements SadConnectInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadConnectInterfaceImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.SAD_CONNECT_INTERFACE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetUsesPort(SadUsesPort newUsesPort, NotificationChain msgs) {
		return super.basicSetUsesPort(newUsesPort, msgs);
	}


	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetProvidesPort(SadProvidesPort newProvidesPort, NotificationChain msgs) {
		return super.basicSetProvidesPort(newProvidesPort, msgs);
	}


	@Override
    protected SadUsesPort createUsesPort() {
	    return SadFactory.eINSTANCE.createSadUsesPort();
    }


	@Override
    protected SadProvidesPort createProvidesPort() {
		return SadFactory.eINSTANCE.createSadProvidesPort();
    }

	@Override
    protected SadComponentInstantiationRef createComponentInstantiationRef(ComponentInstantiation container) {
		SadComponentInstantiationRef retVal = SadFactory.eINSTANCE.createSadComponentInstantiationRef();
		retVal.setInstantiation((SadComponentInstantiation) container);
	    return retVal;
    }

} //SadConnectInterfaceImpl

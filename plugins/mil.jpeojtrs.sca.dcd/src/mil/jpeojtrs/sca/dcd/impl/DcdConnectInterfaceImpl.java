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

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef;
import mil.jpeojtrs.sca.dcd.DcdConnectInterface;
import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.dcd.DcdProvidesPort;
import mil.jpeojtrs.sca.dcd.DcdUsesPort;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.impl.ConnectInterfaceImpl;

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
public class DcdConnectInterfaceImpl extends ConnectInterfaceImpl<DcdComponentInstantiationRef, DcdUsesPort, DcdProvidesPort> implements DcdConnectInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcdConnectInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcdPackage.Literals.DCD_CONNECT_INTERFACE;
	}

	@Override
    protected DcdUsesPort createUsesPort() {
	    return DcdFactory.eINSTANCE.createDcdUsesPort();
    }

	@Override
    protected DcdProvidesPort createProvidesPort() {
	    return DcdFactory.eINSTANCE.createDcdProvidesPort();
    }

	@Override
    protected DcdComponentInstantiationRef createComponentInstantiationRef(ComponentInstantiation container) {
		DcdComponentInstantiationRef retVal = DcdFactory.eINSTANCE.createDcdComponentInstantiationRef();
		retVal.setInstantiation((DcdComponentInstantiation) container);
	    return retVal;
    }

} //DcdConnectInterfaceImpl

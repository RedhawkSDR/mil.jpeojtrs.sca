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
package mil.jpeojtrs.sca.cf.extended.util;

import mil.jpeojtrs.sca.cf.extended.ExtendedPackage;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.omg.CORBA.portable.IDLEntity;
import CF.Port;
import CF.PortOperations;
import ExtendedCF.NegotiablePort;
import ExtendedCF.NegotiablePortOperations;
import ExtendedCF.NegotiableProvidesPort;
import ExtendedCF.NegotiableProvidesPortOperations;
import ExtendedCF.NegotiableUsesPort;
import ExtendedCF.NegotiableUsesPortOperations;
import ExtendedCF.QueryablePort;
import ExtendedCF.QueryablePortOperations;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.cf.extended.ExtendedPackage
 * @generated
 */
public class ExtendedAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtendedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtendedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedSwitch<Adapter> modelSwitch = new ExtendedSwitch<Adapter>() {
		@Override
		public Adapter caseNegotiablePort(NegotiablePort object) {
			return createNegotiablePortAdapter();
		}

		@Override
		public Adapter caseNegotiablePortOperations(NegotiablePortOperations object) {
			return createNegotiablePortOperationsAdapter();
		}

		@Override
		public Adapter caseNegotiableProvidesPort(NegotiableProvidesPort object) {
			return createNegotiableProvidesPortAdapter();
		}

		@Override
		public Adapter caseNegotiableProvidesPortOperations(NegotiableProvidesPortOperations object) {
			return createNegotiableProvidesPortOperationsAdapter();
		}

		@Override
		public Adapter caseNegotiableUsesPort(NegotiableUsesPort object) {
			return createNegotiableUsesPortAdapter();
		}

		@Override
		public Adapter caseNegotiableUsesPortOperations(NegotiableUsesPortOperations object) {
			return createNegotiableUsesPortOperationsAdapter();
		}

		@Override
		public Adapter caseQueryablePort(QueryablePort object) {
			return createQueryablePortAdapter();
		}

		@Override
		public Adapter caseQueryablePortOperations(QueryablePortOperations object) {
			return createQueryablePortOperationsAdapter();
		}

		@Override
		public Adapter caseObject(org.omg.CORBA.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter caseIDLEntity(IDLEntity object) {
			return createIDLEntityAdapter();
		}

		@Override
		public Adapter casePortOperations(PortOperations object) {
			return createPortOperationsAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.NegotiablePort <em>Negotiable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.NegotiablePort
	 * @generated
	 */
	public Adapter createNegotiablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.NegotiablePortOperations <em>Negotiable Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.NegotiablePortOperations
	 * @generated
	 */
	public Adapter createNegotiablePortOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.NegotiableProvidesPort <em>Negotiable Provides Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.NegotiableProvidesPort
	 * @generated
	 */
	public Adapter createNegotiableProvidesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.NegotiableProvidesPortOperations <em>Negotiable Provides Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.NegotiableProvidesPortOperations
	 * @generated
	 */
	public Adapter createNegotiableProvidesPortOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.NegotiableUsesPort <em>Negotiable Uses Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.NegotiableUsesPort
	 * @generated
	 */
	public Adapter createNegotiableUsesPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.NegotiableUsesPortOperations <em>Negotiable Uses Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.NegotiableUsesPortOperations
	 * @generated
	 */
	public Adapter createNegotiableUsesPortOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.QueryablePort <em>Queryable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.QueryablePort
	 * @generated
	 */
	public Adapter createQueryablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExtendedCF.QueryablePortOperations <em>Queryable Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExtendedCF.QueryablePortOperations
	 * @generated
	 */
	public Adapter createQueryablePortOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.PortOperations <em>Port Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.PortOperations
	 * @generated
	 */
	public Adapter createPortOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CORBA.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CORBA.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CORBA.portable.IDLEntity <em>IDL Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CORBA.portable.IDLEntity
	 * @generated
	 */
	public Adapter createIDLEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CF.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CF.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExtendedAdapterFactory

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
package mil.jpeojtrs.sca.dmd.util;

import mil.jpeojtrs.sca.dmd.DmdDocumentRoot;
import mil.jpeojtrs.sca.dmd.DmdPackage;
import mil.jpeojtrs.sca.dmd.DomainFinder;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg;
import mil.jpeojtrs.sca.dmd.FindBy;
import mil.jpeojtrs.sca.dmd.LocalFile;
import mil.jpeojtrs.sca.dmd.NamingService;
import mil.jpeojtrs.sca.dmd.Service;
import mil.jpeojtrs.sca.dmd.Services;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dmd.DmdPackage
 * @generated
 */
public class DmdAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DmdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DmdPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmdSwitch<Adapter> modelSwitch =
		new DmdSwitch<Adapter>() {
			@Override
			public Adapter caseDmdDocumentRoot(DmdDocumentRoot object) {
				return createDmdDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainFinder(DomainFinder object) {
				return createDomainFinderAdapter();
			}
			@Override
			public Adapter caseDomainManagerConfiguration(DomainManagerConfiguration object) {
				return createDomainManagerConfigurationAdapter();
			}
			@Override
			public Adapter caseDomainManagerSoftPkg(DomainManagerSoftPkg object) {
				return createDomainManagerSoftPkgAdapter();
			}
			@Override
			public Adapter caseFindBy(FindBy object) {
				return createFindByAdapter();
			}
			@Override
			public Adapter caseLocalFile(LocalFile object) {
				return createLocalFileAdapter();
			}
			@Override
			public Adapter caseNamingService(NamingService object) {
				return createNamingServiceAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServices(Services object) {
				return createServicesAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.DmdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.DmdDocumentRoot
	 * @generated
	 */
	public Adapter createDmdDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.DomainFinder <em>Domain Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.DomainFinder
	 * @generated
	 */
	public Adapter createDomainFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration <em>Domain Manager Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerConfiguration
	 * @generated
	 */
	public Adapter createDomainManagerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg <em>Domain Manager Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg
	 * @generated
	 */
	public Adapter createDomainManagerSoftPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.FindBy <em>Find By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.FindBy
	 * @generated
	 */
	public Adapter createFindByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.LocalFile
	 * @generated
	 */
	public Adapter createLocalFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.NamingService <em>Naming Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.NamingService
	 * @generated
	 */
	public Adapter createNamingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dmd.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dmd.Services
	 * @generated
	 */
	public Adapter createServicesAdapter() {
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

} //DmdAdapterFactory

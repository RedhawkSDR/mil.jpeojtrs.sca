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
package mil.jpeojtrs.sca.dpd.util;

import mil.jpeojtrs.sca.dpd.Author;
import mil.jpeojtrs.sca.dpd.ChildHwDevice;
import mil.jpeojtrs.sca.dpd.DeviceClass;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DevicePkgRef;
import mil.jpeojtrs.sca.dpd.DocumentRoot;
import mil.jpeojtrs.sca.dpd.DpdPackage;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;
import mil.jpeojtrs.sca.dpd.LocalFile;
import mil.jpeojtrs.sca.dpd.PropertyFile;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dpd.DpdPackage
 * @generated
 */
public class DpdAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DpdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DpdPackage.eINSTANCE;
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
	protected DpdSwitch<Adapter> modelSwitch =
		new DpdSwitch<Adapter>() {
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseChildHwDevice(ChildHwDevice object) {
				return createChildHwDeviceAdapter();
			}
			@Override
			public Adapter caseDeviceClass(DeviceClass object) {
				return createDeviceClassAdapter();
			}
			@Override
			public Adapter caseDevicePkg(DevicePkg object) {
				return createDevicePkgAdapter();
			}
			@Override
			public Adapter caseDevicePkgRef(DevicePkgRef object) {
				return createDevicePkgRefAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseHwDeviceRegistration(HwDeviceRegistration object) {
				return createHwDeviceRegistrationAdapter();
			}
			@Override
			public Adapter caseLocalFile(LocalFile object) {
				return createLocalFileAdapter();
			}
			@Override
			public Adapter casePropertyFile(PropertyFile object) {
				return createPropertyFileAdapter();
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.ChildHwDevice <em>Child Hw Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.ChildHwDevice
	 * @generated
	 */
	public Adapter createChildHwDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.DeviceClass <em>Device Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.DeviceClass
	 * @generated
	 */
	public Adapter createDeviceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.DevicePkg <em>Device Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkg
	 * @generated
	 */
	public Adapter createDevicePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef <em>Device Pkg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.DevicePkgRef
	 * @generated
	 */
	public Adapter createDevicePkgRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.HwDeviceRegistration <em>Hw Device Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.HwDeviceRegistration
	 * @generated
	 */
	public Adapter createHwDeviceRegistrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.LocalFile
	 * @generated
	 */
	public Adapter createLocalFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.dpd.PropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.dpd.PropertyFile
	 * @generated
	 */
	public Adapter createPropertyFileAdapter() {
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

} //DpdAdapterFactory

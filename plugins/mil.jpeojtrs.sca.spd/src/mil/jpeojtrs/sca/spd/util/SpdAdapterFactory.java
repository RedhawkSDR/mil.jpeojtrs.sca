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
package mil.jpeojtrs.sca.spd.util;

import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.prf.PropertyRefGroup;
import mil.jpeojtrs.sca.prf.PropertyRefSet;
import mil.jpeojtrs.sca.spd.Author;
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.Dependency;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.HumanLanguage;
import mil.jpeojtrs.sca.spd.ImplRef;
import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.Os;
import mil.jpeojtrs.sca.spd.Processor;
import mil.jpeojtrs.sca.spd.ProgrammingLanguage;
import mil.jpeojtrs.sca.spd.PropertyFile;
import mil.jpeojtrs.sca.spd.PropertyRef;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SoftPkgRef;
import mil.jpeojtrs.sca.spd.SpdDocumentRoot;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.spd.UsesDevice;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.spd.SpdPackage
 * @generated
 */
public class SpdAdapterFactory extends AdapterFactoryImpl {

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpdPackage.eINSTANCE;
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
	protected SpdSwitch<Adapter> modelSwitch = new SpdSwitch<Adapter>() {
		@Override
		public Adapter caseAuthor(Author object) {
			return createAuthorAdapter();
		}

		@Override
		public Adapter caseCode(Code object) {
			return createCodeAdapter();
		}

		@Override
		public Adapter caseCompiler(mil.jpeojtrs.sca.spd.Compiler object) {
			return createCompilerAdapter();
		}

		@Override
		public Adapter caseDependency(Dependency object) {
			return createDependencyAdapter();
		}

		@Override
		public Adapter caseDescriptor(Descriptor object) {
			return createDescriptorAdapter();
		}

		@Override
		public Adapter caseHumanLanguage(HumanLanguage object) {
			return createHumanLanguageAdapter();
		}

		@Override
		public Adapter caseImplementation(Implementation object) {
			return createImplementationAdapter();
		}

		@Override
		public Adapter caseImplRef(ImplRef object) {
			return createImplRefAdapter();
		}

		@Override
		public Adapter caseLocalFile(LocalFile object) {
			return createLocalFileAdapter();
		}

		@Override
		public Adapter caseOs(Os object) {
			return createOsAdapter();
		}

		@Override
		public Adapter caseProcessor(Processor object) {
			return createProcessorAdapter();
		}

		@Override
		public Adapter caseProgrammingLanguage(ProgrammingLanguage object) {
			return createProgrammingLanguageAdapter();
		}

		@Override
		public Adapter casePropertyFile(PropertyFile object) {
			return createPropertyFileAdapter();
		}

		@Override
		public Adapter casePropertyRef(PropertyRef object) {
			return createPropertyRefAdapter();
		}

		@Override
		public Adapter caseRuntime(mil.jpeojtrs.sca.spd.Runtime object) {
			return createRuntimeAdapter();
		}

		@Override
		public Adapter caseSoftPkg(SoftPkg object) {
			return createSoftPkgAdapter();
		}

		@Override
		public Adapter caseSoftPkgRef(SoftPkgRef object) {
			return createSoftPkgRefAdapter();
		}

		@Override
		public Adapter caseSpdDocumentRoot(SpdDocumentRoot object) {
			return createSpdDocumentRootAdapter();
		}

		@Override
		public Adapter caseUsesDevice(UsesDevice object) {
			return createUsesDeviceAdapter();
		}

		@Override
		public Adapter casePropertyRefContainer(PropertyRefContainer object) {
			return createPropertyRefContainerAdapter();
		}

		@Override
		public Adapter casePropertyRefSet(PropertyRefSet object) {
			return createPropertyRefSetAdapter();
		}

		@Override
		public Adapter casePropertyRefGroup(PropertyRefGroup object) {
			return createPropertyRefGroupAdapter();
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
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Compiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Compiler
	 * @generated
	 */
	public Adapter createCompilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Descriptor
	 * @generated
	 */
	public Adapter createDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.HumanLanguage <em>Human Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.HumanLanguage
	 * @generated
	 */
	public Adapter createHumanLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.ImplRef <em>Impl Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.ImplRef
	 * @generated
	 */
	public Adapter createImplRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.LocalFile
	 * @generated
	 */
	public Adapter createLocalFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Os <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Os
	 * @generated
	 */
	public Adapter createOsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.ProgrammingLanguage
	 * @generated
	 */
	public Adapter createProgrammingLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.PropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.PropertyFile
	 * @generated
	 */
	public Adapter createPropertyFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.PropertyRef
	 * @generated
	 */
	public Adapter createPropertyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.Runtime
	 * @generated
	 */
	public Adapter createRuntimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.SoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg
	 * @generated
	 */
	public Adapter createSoftPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.SoftPkgRef <em>Soft Pkg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef
	 * @generated
	 */
	public Adapter createSoftPkgRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.SpdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.SpdDocumentRoot
	 * @generated
	 */
	public Adapter createSpdDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.spd.UsesDevice <em>Uses Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.spd.UsesDevice
	 * @generated
	 */
	public Adapter createUsesDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer <em>Property Ref Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer
	 * @generated
	 */
	public Adapter createPropertyRefContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.prf.PropertyRefSet <em>Property Ref Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet
	 * @generated
	 */
	public Adapter createPropertyRefSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup <em>Property Ref Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup
	 * @generated
	 */
	public Adapter createPropertyRefGroupAdapter() {
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

} //SpdAdapterFactory

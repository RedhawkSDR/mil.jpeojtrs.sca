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
package mil.jpeojtrs.sca.spd.impl;

import mil.jpeojtrs.sca.spd.AEPComplianceType;
import mil.jpeojtrs.sca.spd.Author;
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.CodeFileType;
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
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.spd.UsesDevice;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdFactoryImpl extends EFactoryImpl implements SpdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpdFactory init() {
		try {
			SpdFactory theSpdFactory = (SpdFactory) EPackage.Registry.INSTANCE.getEFactory(SpdPackage.eNS_URI);
			if (theSpdFactory != null) {
				return theSpdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SpdPackage.AUTHOR:
			return createAuthor();
		case SpdPackage.CODE:
			return createCode();
		case SpdPackage.COMPILER:
			return createCompiler();
		case SpdPackage.DEPENDENCY:
			return createDependency();
		case SpdPackage.DESCRIPTOR:
			return createDescriptor();
		case SpdPackage.HUMAN_LANGUAGE:
			return createHumanLanguage();
		case SpdPackage.IMPLEMENTATION:
			return createImplementation();
		case SpdPackage.IMPL_REF:
			return createImplRef();
		case SpdPackage.LOCAL_FILE:
			return createLocalFile();
		case SpdPackage.OS:
			return createOs();
		case SpdPackage.PROCESSOR:
			return createProcessor();
		case SpdPackage.PROGRAMMING_LANGUAGE:
			return createProgrammingLanguage();
		case SpdPackage.PROPERTY_FILE:
			return createPropertyFile();
		case SpdPackage.PROPERTY_REF:
			return createPropertyRef();
		case SpdPackage.RUNTIME:
			return createRuntime();
		case SpdPackage.SOFT_PKG:
			return createSoftPkg();
		case SpdPackage.SOFT_PKG_REF:
			return createSoftPkgRef();
		case SpdPackage.SPD_DOCUMENT_ROOT:
			return createSpdDocumentRoot();
		case SpdPackage.USES_DEVICE:
			return createUsesDevice();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SpdPackage.AEP_COMPLIANCE_TYPE:
			return createAEPComplianceTypeFromString(eDataType, initialValue);
		case SpdPackage.CODE_FILE_TYPE:
			return createCodeFileTypeFromString(eDataType, initialValue);
		case SpdPackage.AEP_COMPLIANCE_TYPE_OBJECT:
			return createAEPComplianceTypeObjectFromString(eDataType, initialValue);
		case SpdPackage.CODE_FILE_TYPE_OBJECT:
			return createCodeFileTypeObjectFromString(eDataType, initialValue);
		case SpdPackage.URI:
			return createURIFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SpdPackage.AEP_COMPLIANCE_TYPE:
			return convertAEPComplianceTypeToString(eDataType, instanceValue);
		case SpdPackage.CODE_FILE_TYPE:
			return convertCodeFileTypeToString(eDataType, instanceValue);
		case SpdPackage.AEP_COMPLIANCE_TYPE_OBJECT:
			return convertAEPComplianceTypeObjectToString(eDataType, instanceValue);
		case SpdPackage.CODE_FILE_TYPE_OBJECT:
			return convertCodeFileTypeObjectToString(eDataType, instanceValue);
		case SpdPackage.URI:
			return convertURIToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mil.jpeojtrs.sca.spd.Compiler createCompiler() {
		CompilerImpl compiler = new CompilerImpl();
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor createDescriptor() {
		DescriptorImpl descriptor = new DescriptorImpl();
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanLanguage createHumanLanguage() {
		HumanLanguageImpl humanLanguage = new HumanLanguageImpl();
		return humanLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplRef createImplRef() {
		ImplRefImpl implRef = new ImplRefImpl();
		return implRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFile createLocalFile() {
		LocalFileImpl localFile = new LocalFileImpl();
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os createOs() {
		OsImpl os = new OsImpl();
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguage() {
		ProgrammingLanguageImpl programmingLanguage = new ProgrammingLanguageImpl();
		return programmingLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFile createPropertyFile() {
		PropertyFileImpl propertyFile = new PropertyFileImpl();
		return propertyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRef createPropertyRef() {
		PropertyRefImpl propertyRef = new PropertyRefImpl();
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mil.jpeojtrs.sca.spd.Runtime createRuntime() {
		RuntimeImpl runtime = new RuntimeImpl();
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkg createSoftPkg() {
		SoftPkgImpl softPkg = new SoftPkgImpl();
		return softPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkgRef createSoftPkgRef() {
		SoftPkgRefImpl softPkgRef = new SoftPkgRefImpl();
		return softPkgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdDocumentRoot createSpdDocumentRoot() {
		SpdDocumentRootImpl spdDocumentRoot = new SpdDocumentRootImpl();
		return spdDocumentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDevice createUsesDevice() {
		UsesDeviceImpl usesDevice = new UsesDeviceImpl();
		return usesDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEPComplianceType createAEPComplianceTypeFromString(EDataType eDataType, String initialValue) {
		AEPComplianceType result = AEPComplianceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAEPComplianceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFileType createCodeFileTypeFromString(EDataType eDataType, String initialValue) {
		CodeFileType result = CodeFileType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEPComplianceType createAEPComplianceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAEPComplianceTypeFromString(SpdPackage.Literals.AEP_COMPLIANCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAEPComplianceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAEPComplianceTypeToString(SpdPackage.Literals.AEP_COMPLIANCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFileType createCodeFileTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeFileTypeFromString(SpdPackage.Literals.CODE_FILE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeFileTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeFileTypeToString(SpdPackage.Literals.CODE_FILE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (initialValue == null) ? null : URI.createURI(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdPackage getSpdPackage() {
		return (SpdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpdPackage getPackage() {
		return SpdPackage.eINSTANCE;
	}

} //SpdFactoryImpl

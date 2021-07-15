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
package mil.jpeojtrs.sca.spd;

import mil.jpeojtrs.sca.prf.PrfPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.spd.SpdFactory
 * @model kind="package"
 * @generated
 */
public interface SpdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spd";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/spd";
	String FILE_EXTENSION = ".spd.xml";
	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	String eNS_PREFIX = "";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.spd.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpdPackage eINSTANCE = mil.jpeojtrs.sca.spd.impl.SpdPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.AuthorImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 0;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;
	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__COMPANY = 1;
	/**
	 * The feature id for the '<em><b>Webpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__WEBPAGE = 2;
	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.CodeImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 1;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ENTRY_POINT = 1;
	/**
	 * The feature id for the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__STACK_SIZE = 2;
	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__PRIORITY = 3;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TYPE = 4;
	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.CompilerImpl <em>Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.CompilerImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCompiler()
	 * @generated
	 */
	int COMPILER = 2;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__NAME = 0;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__VERSION = 1;
	/**
	 * The number of structural features of the '<em>Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.DependencyImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 3;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__PROPERTIES = PrfPackage.PROPERTY_REF_SET__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SIMPLE_REF = PrfPackage.PROPERTY_REF_SET__SIMPLE_REF;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SIMPLE_SEQUENCE_REF = PrfPackage.PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF;
	/**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__STRUCT_REF = PrfPackage.PROPERTY_REF_SET__STRUCT_REF;
	/**
	 * The feature id for the '<em><b>Struct Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__STRUCT_SEQUENCE_REF = PrfPackage.PROPERTY_REF_SET__STRUCT_SEQUENCE_REF;
	/**
	 * The feature id for the '<em><b>Soft Pkg Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOFT_PKG_REF = PrfPackage.PROPERTY_REF_SET_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__PROPERTY_REF = PrfPackage.PROPERTY_REF_SET_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = PrfPackage.PROPERTY_REF_SET_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = PrfPackage.PROPERTY_REF_SET_FEATURE_COUNT + 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.DescriptorImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 4;
	/**
	 * The feature id for the '<em><b>Localfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__LOCALFILE = 0;
	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__COMPONENT = 1;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__NAME = 2;
	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.HumanLanguageImpl <em>Human Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.HumanLanguageImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getHumanLanguage()
	 * @generated
	 */
	int HUMAN_LANGUAGE = 5;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_LANGUAGE__NAME = 0;
	/**
	 * The number of structural features of the '<em>Human Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_LANGUAGE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.ImplementationImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 6;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__PROPERTY_FILE = 1;
	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__CODE = 2;
	/**
	 * The feature id for the '<em><b>Compiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__COMPILER = 3;
	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__PROGRAMMING_LANGUAGE = 4;
	/**
	 * The feature id for the '<em><b>Human Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__HUMAN_LANGUAGE = 5;
	/**
	 * The feature id for the '<em><b>Runtime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__RUNTIME = 6;
	/**
	 * The feature id for the '<em><b>Dependency Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DEPENDENCY_MAP = 7;
	/**
	 * The feature id for the '<em><b>Os</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__OS = 8;
	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__PROCESSOR = 9;
	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DEPENDENCY = 10;
	/**
	 * The feature id for the '<em><b>Uses Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__USES_DEVICE = 11;
	/**
	 * The feature id for the '<em><b>Aep Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__AEP_COMPLIANCE = 12;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__ID = 13;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SOFT_PKG = 14;
	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 15;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.ImplRefImpl <em>Impl Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.ImplRefImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getImplRef()
	 * @generated
	 */
	int IMPL_REF = 7;
	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF__REFID = 0;
	/**
	 * The number of structural features of the '<em>Impl Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.LocalFileImpl <em>Local File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.LocalFileImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getLocalFile()
	 * @generated
	 */
	int LOCAL_FILE = 8;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FILE__NAME = 0;
	/**
	 * The number of structural features of the '<em>Local File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FILE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.OsImpl <em>Os</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.OsImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getOs()
	 * @generated
	 */
	int OS = 9;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__NAME = 0;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS__VERSION = 1;
	/**
	 * The number of structural features of the '<em>Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.ProcessorImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 10;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;
	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.ProgrammingLanguageImpl <em>Programming Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.ProgrammingLanguageImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 11;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__NAME = 0;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE__VERSION = 1;
	/**
	 * The number of structural features of the '<em>Programming Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_LANGUAGE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.PropertyFileImpl <em>Property File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.PropertyFileImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getPropertyFile()
	 * @generated
	 */
	int PROPERTY_FILE = 12;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__PROPERTIES = 1;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__TYPE = 2;
	/**
	 * The number of structural features of the '<em>Property File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_FEATURE_COUNT = 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.PropertyRefImpl <em>Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.PropertyRefImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getPropertyRef()
	 * @generated
	 */
	int PROPERTY_REF = 13;
	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__REF_ID = 0;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__VALUE = 1;
	/**
	 * The number of structural features of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.RuntimeImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 14;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__NAME = 0;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__VERSION = 1;
	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl <em>Soft Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.SoftPkgImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getSoftPkg()
	 * @generated
	 */
	int SOFT_PKG = 15;
	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__TITLE = 0;
	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__AUTHOR = 1;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__DESCRIPTION = 2;
	/**
	 * The feature id for the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__PROPERTY_FILE = 3;
	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__DESCRIPTOR = 4;
	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__IMPLEMENTATION = 5;
	/**
	 * The feature id for the '<em><b>Uses Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__USES_DEVICE = 6;
	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__CHILD = 7;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__ID = 8;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__NAME = 9;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__TYPE = 10;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG__VERSION = 11;
	/**
	 * The number of structural features of the '<em>Soft Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG_FEATURE_COUNT = 12;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl <em>Soft Pkg Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getSoftPkgRef()
	 * @generated
	 */
	int SOFT_PKG_REF = 16;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG_REF__LOCAL_FILE = 0;
	/**
	 * The feature id for the '<em><b>Impl Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG_REF__IMPL_REF = 1;
	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG_REF__IMPLEMENTATION = 2;
	/**
	 * The feature id for the '<em><b>Soft Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG_REF__SOFT_PKG = 3;
	/**
	 * The number of structural features of the '<em>Soft Pkg Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_PKG_REF_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.SpdDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.SpdDocumentRootImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getSpdDocumentRoot()
	 * @generated
	 */
	int SPD_DOCUMENT_ROOT = 17;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Softpkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_DOCUMENT_ROOT__SOFTPKG = 3;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPD_DOCUMENT_ROOT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.UsesDeviceImpl <em>Uses Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.UsesDeviceImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getUsesDevice()
	 * @generated
	 */
	int USES_DEVICE = 18;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__PROPERTIES = PrfPackage.PROPERTY_REF_GROUP__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__SIMPLE_REF = PrfPackage.PROPERTY_REF_GROUP__SIMPLE_REF;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__SIMPLE_SEQUENCE_REF = PrfPackage.PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF;
	/**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__STRUCT_REF = PrfPackage.PROPERTY_REF_GROUP__STRUCT_REF;
	/**
	 * The feature id for the '<em><b>Struct Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__STRUCT_SEQUENCE_REF = PrfPackage.PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF;
	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__PROPERTY_REF = PrfPackage.PROPERTY_REF_GROUP_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__ID = PrfPackage.PROPERTY_REF_GROUP_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE__TYPE = PrfPackage.PROPERTY_REF_GROUP_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Uses Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_DEVICE_FEATURE_COUNT = PrfPackage.PROPERTY_REF_GROUP_FEATURE_COUNT + 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.ChildSoftwarePackageFileImpl <em>Child Software Package File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.ChildSoftwarePackageFileImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getChildSoftwarePackageFile()
	 * @generated
	 */
	int CHILD_SOFTWARE_PACKAGE_FILE = 19;
	/**
	 * The feature id for the '<em><b>Local File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE = 0;
	/**
	 * The number of structural features of the '<em>Child Software Package File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_SOFTWARE_PACKAGE_FILE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.impl.ChildImpl
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 20;
	/**
	 * The feature id for the '<em><b>Child Software Package File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__CHILD_SOFTWARE_PACKAGE_FILE = 0;
	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.AEPComplianceType <em>AEP Compliance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getAEPComplianceType()
	 * @generated
	 */
	int AEP_COMPLIANCE_TYPE = 21;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.spd.CodeFileType <em>Code File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.CodeFileType
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCodeFileType()
	 * @generated
	 */
	int CODE_FILE_TYPE = 22;
	/**
	 * The meta object id for the '<em>AEP Compliance Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getAEPComplianceTypeObject()
	 * @generated
	 */
	int AEP_COMPLIANCE_TYPE_OBJECT = 23;
	/**
	 * The meta object id for the '<em>Code File Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.CodeFileType
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCodeFileTypeObject()
	 * @generated
	 */
	int CODE_FILE_TYPE_OBJECT = 24;
	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getURI()
	 * @generated
	 */
	int URI = 25;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see mil.jpeojtrs.sca.spd.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.spd.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Author#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see mil.jpeojtrs.sca.spd.Author#getCompany()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Company();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Author#getWebpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webpage</em>'.
	 * @see mil.jpeojtrs.sca.spd.Author#getWebpage()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Webpage();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see mil.jpeojtrs.sca.spd.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Code#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.spd.Code#getLocalFile()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_LocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Code#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point</em>'.
	 * @see mil.jpeojtrs.sca.spd.Code#getEntryPoint()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_EntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Code#getStackSize <em>Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Size</em>'.
	 * @see mil.jpeojtrs.sca.spd.Code#getStackSize()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_StackSize();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Code#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see mil.jpeojtrs.sca.spd.Code#getPriority()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Priority();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Code#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.Code#getType()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Compiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler</em>'.
	 * @see mil.jpeojtrs.sca.spd.Compiler
	 * @generated
	 */
	EClass getCompiler();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Compiler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.Compiler#getName()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Compiler#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.spd.Compiler#getVersion()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see mil.jpeojtrs.sca.spd.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Dependency#getSoftPkgRef <em>Soft Pkg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soft Pkg Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.Dependency#getSoftPkgRef()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_SoftPkgRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Dependency#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.Dependency#getPropertyRef()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_PropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see mil.jpeojtrs.sca.spd.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Descriptor#getLocalfile <em>Localfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localfile</em>'.
	 * @see mil.jpeojtrs.sca.spd.Descriptor#getLocalfile()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_Localfile();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.spd.Descriptor#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see mil.jpeojtrs.sca.spd.Descriptor#getComponent()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_Component();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Descriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.Descriptor#getName()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.HumanLanguage <em>Human Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Language</em>'.
	 * @see mil.jpeojtrs.sca.spd.HumanLanguage
	 * @generated
	 */
	EClass getHumanLanguage();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.HumanLanguage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.HumanLanguage#getName()
	 * @see #getHumanLanguage()
	 * @generated
	 */
	EAttribute getHumanLanguage_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Implementation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getDescription()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Implementation#getPropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getPropertyFile()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_PropertyFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Implementation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getCode()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Code();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Implementation#getCompiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compiler</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getCompiler()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Compiler();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Implementation#getProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programming Language</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getProgrammingLanguage()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_ProgrammingLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Implementation#getHumanLanguage <em>Human Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Human Language</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getHumanLanguage()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_HumanLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Implementation#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getRuntime()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Runtime();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.spd.Implementation#getDependencyMap <em>Dependency Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependency Map</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getDependencyMap()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_DependencyMap();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.Implementation#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getOs()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Os();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.Implementation#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getProcessor()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.Implementation#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getDependency()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Dependency();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.Implementation#getUsesDevice <em>Uses Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Device</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getUsesDevice()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_UsesDevice();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Implementation#getAepCompliance <em>Aep Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aep Compliance</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getAepCompliance()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_AepCompliance();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Implementation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getId()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_Id();

	/**
	 * Returns the meta object for the container reference '{@link mil.jpeojtrs.sca.spd.Implementation#getSoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.spd.Implementation#getSoftPkg()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_SoftPkg();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.ImplRef <em>Impl Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.ImplRef
	 * @generated
	 */
	EClass getImplRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.ImplRef#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see mil.jpeojtrs.sca.spd.ImplRef#getRefid()
	 * @see #getImplRef()
	 * @generated
	 */
	EAttribute getImplRef_Refid();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.LocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.spd.LocalFile
	 * @generated
	 */
	EClass getLocalFile();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.LocalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.LocalFile#getName()
	 * @see #getLocalFile()
	 * @generated
	 */
	EAttribute getLocalFile_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Os <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os</em>'.
	 * @see mil.jpeojtrs.sca.spd.Os
	 * @generated
	 */
	EClass getOs();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Os#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.Os#getName()
	 * @see #getOs()
	 * @generated
	 */
	EAttribute getOs_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Os#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.spd.Os#getVersion()
	 * @see #getOs()
	 * @generated
	 */
	EAttribute getOs_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see mil.jpeojtrs.sca.spd.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programming Language</em>'.
	 * @see mil.jpeojtrs.sca.spd.ProgrammingLanguage
	 * @generated
	 */
	EClass getProgrammingLanguage();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.ProgrammingLanguage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.ProgrammingLanguage#getName()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EAttribute getProgrammingLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.ProgrammingLanguage#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.spd.ProgrammingLanguage#getVersion()
	 * @see #getProgrammingLanguage()
	 * @generated
	 */
	EAttribute getProgrammingLanguage_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.PropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyFile
	 * @generated
	 */
	EClass getPropertyFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.PropertyFile#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyFile#getLocalFile()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EReference getPropertyFile_LocalFile();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.spd.PropertyFile#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyFile#getProperties()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EReference getPropertyFile_Properties();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.PropertyFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyFile#getType()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EAttribute getPropertyFile_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyRef
	 * @generated
	 */
	EClass getPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.PropertyRef#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyRef#getRefId()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EAttribute getPropertyRef_RefId();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.PropertyRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.spd.PropertyRef#getValue()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EAttribute getPropertyRef_Value();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime</em>'.
	 * @see mil.jpeojtrs.sca.spd.Runtime
	 * @generated
	 */
	EClass getRuntime();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Runtime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.Runtime#getName()
	 * @see #getRuntime()
	 * @generated
	 */
	EAttribute getRuntime_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.Runtime#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.spd.Runtime#getVersion()
	 * @see #getRuntime()
	 * @generated
	 */
	EAttribute getRuntime_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.SoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg
	 * @generated
	 */
	EClass getSoftPkg();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.SoftPkg#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getTitle()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EAttribute getSoftPkg_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.SoftPkg#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getAuthor()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EReference getSoftPkg_Author();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.SoftPkg#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getDescription()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EAttribute getSoftPkg_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.SoftPkg#getPropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property File</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getPropertyFile()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EReference getSoftPkg_PropertyFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.SoftPkg#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descriptor</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getDescriptor()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EReference getSoftPkg_Descriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.SoftPkg#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getImplementation()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EReference getSoftPkg_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.SoftPkg#getUsesDevice <em>Uses Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Device</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getUsesDevice()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EReference getSoftPkg_UsesDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.SoftPkg#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getChild()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EReference getSoftPkg_Child();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.SoftPkg#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getId()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EAttribute getSoftPkg_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.SoftPkg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getName()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EAttribute getSoftPkg_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.SoftPkg#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getType()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EAttribute getSoftPkg_Type();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.SoftPkg#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getVersion()
	 * @see #getSoftPkg()
	 * @generated
	 */
	EAttribute getSoftPkg_Version();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.SoftPkgRef <em>Soft Pkg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Pkg Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef
	 * @generated
	 */
	EClass getSoftPkgRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#getLocalFile()
	 * @see #getSoftPkgRef()
	 * @generated
	 */
	EReference getSoftPkgRef_LocalFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplRef <em>Impl Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impl Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#getImplRef()
	 * @see #getSoftPkgRef()
	 * @generated
	 */
	EReference getSoftPkgRef_ImplRef();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation()
	 * @see #getSoftPkgRef()
	 * @generated
	 */
	EReference getSoftPkgRef_Implementation();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Soft Pkg</em>'.
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg()
	 * @see #getSoftPkgRef()
	 * @generated
	 */
	EReference getSoftPkgRef_SoftPkg();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.SpdDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.spd.SpdDocumentRoot
	 * @generated
	 */
	EClass getSpdDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.spd.SpdDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.spd.SpdDocumentRoot#getMixed()
	 * @see #getSpdDocumentRoot()
	 * @generated
	 */
	EAttribute getSpdDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.spd.SpdDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.spd.SpdDocumentRoot#getXMLNSPrefixMap()
	 * @see #getSpdDocumentRoot()
	 * @generated
	 */
	EReference getSpdDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.spd.SpdDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.spd.SpdDocumentRoot#getXSISchemaLocation()
	 * @see #getSpdDocumentRoot()
	 * @generated
	 */
	EReference getSpdDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.SpdDocumentRoot#getSoftpkg <em>Softpkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Softpkg</em>'.
	 * @see mil.jpeojtrs.sca.spd.SpdDocumentRoot#getSoftpkg()
	 * @see #getSpdDocumentRoot()
	 * @generated
	 */
	EReference getSpdDocumentRoot_Softpkg();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.UsesDevice <em>Uses Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Device</em>'.
	 * @see mil.jpeojtrs.sca.spd.UsesDevice
	 * @generated
	 */
	EClass getUsesDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.spd.UsesDevice#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Ref</em>'.
	 * @see mil.jpeojtrs.sca.spd.UsesDevice#getPropertyRef()
	 * @see #getUsesDevice()
	 * @generated
	 */
	EReference getUsesDevice_PropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.UsesDevice#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.spd.UsesDevice#getId()
	 * @see #getUsesDevice()
	 * @generated
	 */
	EAttribute getUsesDevice_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.spd.UsesDevice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.UsesDevice#getType()
	 * @see #getUsesDevice()
	 * @generated
	 */
	EAttribute getUsesDevice_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.ChildSoftwarePackageFile <em>Child Software Package File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Software Package File</em>'.
	 * @see mil.jpeojtrs.sca.spd.ChildSoftwarePackageFile
	 * @generated
	 */
	EClass getChildSoftwarePackageFile();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.ChildSoftwarePackageFile#getLocalFile <em>Local File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local File</em>'.
	 * @see mil.jpeojtrs.sca.spd.ChildSoftwarePackageFile#getLocalFile()
	 * @see #getChildSoftwarePackageFile()
	 * @generated
	 */
	EReference getChildSoftwarePackageFile_LocalFile();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.spd.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see mil.jpeojtrs.sca.spd.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.spd.Child#getChildSoftwarePackageFile <em>Child Software Package File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Software Package File</em>'.
	 * @see mil.jpeojtrs.sca.spd.Child#getChildSoftwarePackageFile()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_ChildSoftwarePackageFile();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.spd.AEPComplianceType <em>AEP Compliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AEP Compliance Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
	 * @generated
	 */
	EEnum getAEPComplianceType();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.spd.CodeFileType <em>Code File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Code File Type</em>'.
	 * @see mil.jpeojtrs.sca.spd.CodeFileType
	 * @generated
	 */
	EEnum getCodeFileType();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.spd.AEPComplianceType <em>AEP Compliance Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>AEP Compliance Type Object</em>'.
	 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
	 * @model instanceClass="mil.jpeojtrs.sca.spd.AEPComplianceType"
	 *        extendedMetaData="name='aepcompliance_._type:Object' baseType='aepcompliance_._type'"
	 * @generated
	 */
	EDataType getAEPComplianceTypeObject();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.spd.CodeFileType <em>Code File Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code File Type Object</em>'.
	 * @see mil.jpeojtrs.sca.spd.CodeFileType
	 * @model instanceClass="mil.jpeojtrs.sca.spd.CodeFileType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getCodeFileTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 *        extendedMetaData="name='URI'"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpdFactory getSpdFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.AuthorImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();
		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__COMPANY = eINSTANCE.getAuthor_Company();
		/**
		 * The meta object literal for the '<em><b>Webpage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__WEBPAGE = eINSTANCE.getAuthor_Webpage();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.CodeImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__LOCAL_FILE = eINSTANCE.getCode_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__ENTRY_POINT = eINSTANCE.getCode_EntryPoint();
		/**
		 * The meta object literal for the '<em><b>Stack Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__STACK_SIZE = eINSTANCE.getCode_StackSize();
		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__PRIORITY = eINSTANCE.getCode_Priority();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__TYPE = eINSTANCE.getCode_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.CompilerImpl <em>Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.CompilerImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCompiler()
		 * @generated
		 */
		EClass COMPILER = eINSTANCE.getCompiler();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__NAME = eINSTANCE.getCompiler_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__VERSION = eINSTANCE.getCompiler_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.DependencyImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();
		/**
		 * The meta object literal for the '<em><b>Soft Pkg Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SOFT_PKG_REF = eINSTANCE.getDependency_SoftPkgRef();
		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__PROPERTY_REF = eINSTANCE.getDependency_PropertyRef();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.DescriptorImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();
		/**
		 * The meta object literal for the '<em><b>Localfile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__LOCALFILE = eINSTANCE.getDescriptor_Localfile();
		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__COMPONENT = eINSTANCE.getDescriptor_Component();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__NAME = eINSTANCE.getDescriptor_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.HumanLanguageImpl <em>Human Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.HumanLanguageImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getHumanLanguage()
		 * @generated
		 */
		EClass HUMAN_LANGUAGE = eINSTANCE.getHumanLanguage();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMAN_LANGUAGE__NAME = eINSTANCE.getHumanLanguage_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.ImplementationImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__DESCRIPTION = eINSTANCE.getImplementation_Description();
		/**
		 * The meta object literal for the '<em><b>Property File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__PROPERTY_FILE = eINSTANCE.getImplementation_PropertyFile();
		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__CODE = eINSTANCE.getImplementation_Code();
		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__COMPILER = eINSTANCE.getImplementation_Compiler();
		/**
		 * The meta object literal for the '<em><b>Programming Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__PROGRAMMING_LANGUAGE = eINSTANCE.getImplementation_ProgrammingLanguage();
		/**
		 * The meta object literal for the '<em><b>Human Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__HUMAN_LANGUAGE = eINSTANCE.getImplementation_HumanLanguage();
		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__RUNTIME = eINSTANCE.getImplementation_Runtime();
		/**
		 * The meta object literal for the '<em><b>Dependency Map</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__DEPENDENCY_MAP = eINSTANCE.getImplementation_DependencyMap();
		/**
		 * The meta object literal for the '<em><b>Os</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__OS = eINSTANCE.getImplementation_Os();
		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__PROCESSOR = eINSTANCE.getImplementation_Processor();
		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__DEPENDENCY = eINSTANCE.getImplementation_Dependency();
		/**
		 * The meta object literal for the '<em><b>Uses Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__USES_DEVICE = eINSTANCE.getImplementation_UsesDevice();
		/**
		 * The meta object literal for the '<em><b>Aep Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__AEP_COMPLIANCE = eINSTANCE.getImplementation_AepCompliance();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__ID = eINSTANCE.getImplementation_Id();
		/**
		 * The meta object literal for the '<em><b>Soft Pkg</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__SOFT_PKG = eINSTANCE.getImplementation_SoftPkg();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.ImplRefImpl <em>Impl Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.ImplRefImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getImplRef()
		 * @generated
		 */
		EClass IMPL_REF = eINSTANCE.getImplRef();
		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPL_REF__REFID = eINSTANCE.getImplRef_Refid();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.LocalFileImpl <em>Local File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.LocalFileImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getLocalFile()
		 * @generated
		 */
		EClass LOCAL_FILE = eINSTANCE.getLocalFile();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_FILE__NAME = eINSTANCE.getLocalFile_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.OsImpl <em>Os</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.OsImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getOs()
		 * @generated
		 */
		EClass OS = eINSTANCE.getOs();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS__NAME = eINSTANCE.getOs_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS__VERSION = eINSTANCE.getOs_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.ProcessorImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.ProgrammingLanguageImpl <em>Programming Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.ProgrammingLanguageImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EClass PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING_LANGUAGE__NAME = eINSTANCE.getProgrammingLanguage_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMING_LANGUAGE__VERSION = eINSTANCE.getProgrammingLanguage_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.PropertyFileImpl <em>Property File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.PropertyFileImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getPropertyFile()
		 * @generated
		 */
		EClass PROPERTY_FILE = eINSTANCE.getPropertyFile();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE__LOCAL_FILE = eINSTANCE.getPropertyFile_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE__PROPERTIES = eINSTANCE.getPropertyFile_Properties();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILE__TYPE = eINSTANCE.getPropertyFile_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.PropertyRefImpl <em>Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.PropertyRefImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getPropertyRef()
		 * @generated
		 */
		EClass PROPERTY_REF = eINSTANCE.getPropertyRef();
		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REF__REF_ID = eINSTANCE.getPropertyRef_RefId();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REF__VALUE = eINSTANCE.getPropertyRef_Value();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.RuntimeImpl <em>Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.RuntimeImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getRuntime()
		 * @generated
		 */
		EClass RUNTIME = eINSTANCE.getRuntime();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME__NAME = eINSTANCE.getRuntime_Name();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME__VERSION = eINSTANCE.getRuntime_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.SoftPkgImpl <em>Soft Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.SoftPkgImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getSoftPkg()
		 * @generated
		 */
		EClass SOFT_PKG = eINSTANCE.getSoftPkg();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_PKG__TITLE = eINSTANCE.getSoftPkg_Title();
		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG__AUTHOR = eINSTANCE.getSoftPkg_Author();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_PKG__DESCRIPTION = eINSTANCE.getSoftPkg_Description();
		/**
		 * The meta object literal for the '<em><b>Property File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG__PROPERTY_FILE = eINSTANCE.getSoftPkg_PropertyFile();
		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG__DESCRIPTOR = eINSTANCE.getSoftPkg_Descriptor();
		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG__IMPLEMENTATION = eINSTANCE.getSoftPkg_Implementation();
		/**
		 * The meta object literal for the '<em><b>Uses Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG__USES_DEVICE = eINSTANCE.getSoftPkg_UsesDevice();
		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG__CHILD = eINSTANCE.getSoftPkg_Child();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_PKG__ID = eINSTANCE.getSoftPkg_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_PKG__NAME = eINSTANCE.getSoftPkg_Name();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_PKG__TYPE = eINSTANCE.getSoftPkg_Type();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_PKG__VERSION = eINSTANCE.getSoftPkg_Version();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl <em>Soft Pkg Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.SoftPkgRefImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getSoftPkgRef()
		 * @generated
		 */
		EClass SOFT_PKG_REF = eINSTANCE.getSoftPkgRef();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG_REF__LOCAL_FILE = eINSTANCE.getSoftPkgRef_LocalFile();
		/**
		 * The meta object literal for the '<em><b>Impl Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG_REF__IMPL_REF = eINSTANCE.getSoftPkgRef_ImplRef();
		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG_REF__IMPLEMENTATION = eINSTANCE.getSoftPkgRef_Implementation();
		/**
		 * The meta object literal for the '<em><b>Soft Pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_PKG_REF__SOFT_PKG = eINSTANCE.getSoftPkgRef_SoftPkg();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.SpdDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.SpdDocumentRootImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getSpdDocumentRoot()
		 * @generated
		 */
		EClass SPD_DOCUMENT_ROOT = eINSTANCE.getSpdDocumentRoot();
		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPD_DOCUMENT_ROOT__MIXED = eINSTANCE.getSpdDocumentRoot_Mixed();
		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getSpdDocumentRoot_XMLNSPrefixMap();
		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getSpdDocumentRoot_XSISchemaLocation();
		/**
		 * The meta object literal for the '<em><b>Softpkg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPD_DOCUMENT_ROOT__SOFTPKG = eINSTANCE.getSpdDocumentRoot_Softpkg();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.UsesDeviceImpl <em>Uses Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.UsesDeviceImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getUsesDevice()
		 * @generated
		 */
		EClass USES_DEVICE = eINSTANCE.getUsesDevice();
		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_DEVICE__PROPERTY_REF = eINSTANCE.getUsesDevice_PropertyRef();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_DEVICE__ID = eINSTANCE.getUsesDevice_Id();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_DEVICE__TYPE = eINSTANCE.getUsesDevice_Type();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.ChildSoftwarePackageFileImpl <em>Child Software Package File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.ChildSoftwarePackageFileImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getChildSoftwarePackageFile()
		 * @generated
		 */
		EClass CHILD_SOFTWARE_PACKAGE_FILE = eINSTANCE.getChildSoftwarePackageFile();
		/**
		 * The meta object literal for the '<em><b>Local File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_SOFTWARE_PACKAGE_FILE__LOCAL_FILE = eINSTANCE.getChildSoftwarePackageFile_LocalFile();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.impl.ChildImpl
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();
		/**
		 * The meta object literal for the '<em><b>Child Software Package File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__CHILD_SOFTWARE_PACKAGE_FILE = eINSTANCE.getChild_ChildSoftwarePackageFile();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.AEPComplianceType <em>AEP Compliance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getAEPComplianceType()
		 * @generated
		 */
		EEnum AEP_COMPLIANCE_TYPE = eINSTANCE.getAEPComplianceType();
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.spd.CodeFileType <em>Code File Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.CodeFileType
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCodeFileType()
		 * @generated
		 */
		EEnum CODE_FILE_TYPE = eINSTANCE.getCodeFileType();
		/**
		 * The meta object literal for the '<em>AEP Compliance Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.AEPComplianceType
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getAEPComplianceTypeObject()
		 * @generated
		 */
		EDataType AEP_COMPLIANCE_TYPE_OBJECT = eINSTANCE.getAEPComplianceTypeObject();
		/**
		 * The meta object literal for the '<em>Code File Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.spd.CodeFileType
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getCodeFileTypeObject()
		 * @generated
		 */
		EDataType CODE_FILE_TYPE_OBJECT = eINSTANCE.getCodeFileTypeObject();
		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see mil.jpeojtrs.sca.spd.impl.SpdPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} // SpdPackage

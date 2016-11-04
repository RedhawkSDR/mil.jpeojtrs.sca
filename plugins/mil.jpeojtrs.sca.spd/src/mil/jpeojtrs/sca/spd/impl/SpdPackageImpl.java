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

import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.spd.AEPComplianceType;
import mil.jpeojtrs.sca.spd.Author;
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.CodeFileType;
import mil.jpeojtrs.sca.spd.Dependency;
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
import mil.jpeojtrs.sca.spd.util.SpdValidator;
import mil.jpeojtrs.sca.validator.AdvancedEObjectValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdPackageImpl extends EPackageImpl implements SpdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanLanguageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmingLanguageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softPkgEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softPkgRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spdDocumentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aepComplianceTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeFileTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aepComplianceTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeFileTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpdPackageImpl() {
		super(eNS_URI, SpdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpdPackage initGen() {
		if (isInited)
			return (SpdPackage) EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		// Obtain or create and register package
		SpdPackageImpl theSpdPackage = (SpdPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpdPackageImpl
			? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ScdPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpdPackage.createPackageContents();

		// Initialize created meta-data
		theSpdPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSpdPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return SpdValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSpdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpdPackage.eNS_URI, theSpdPackage);
		return theSpdPackage;
	}

	/**
	 * Add the custom Advanced object validator
	 * 
	 * @return
	 */
	public static SpdPackage init() {
		if (SpdPackageImpl.isInited)
			return (SpdPackage) EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		final SpdPackage retVal = SpdPackageImpl.initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			AdvancedEObjectValidator validator = new AdvancedEObjectValidator(SpdValidator.INSTANCE);

			public EValidator getEValidator() {
				return this.validator;
			}
		});
		return retVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Name() {
		return (EAttribute) authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Company() {
		return (EAttribute) authorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Webpage() {
		return (EAttribute) authorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCode_LocalFile() {
		return (EReference) codeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_EntryPoint() {
		return (EAttribute) codeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_StackSize() {
		return (EAttribute) codeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Priority() {
		return (EAttribute) codeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Type() {
		return (EAttribute) codeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompiler() {
		return compilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompiler_Name() {
		return (EAttribute) compilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompiler_Version() {
		return (EAttribute) compilerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_SoftPkgRef() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_PropertyRef() {
		return (EReference) dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Type() {
		return (EAttribute) dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptor() {
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_Localfile() {
		return (EReference) descriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_Component() {
		return (EReference) descriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Name() {
		return (EAttribute) descriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanLanguage() {
		return humanLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHumanLanguage_Name() {
		return (EAttribute) humanLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_Description() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_PropertyFile() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Code() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Compiler() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_ProgrammingLanguage() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_HumanLanguage() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Runtime() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_DependencyMap() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Os() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Processor() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_Dependency() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_UsesDevice() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_AepCompliance() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementation_Id() {
		return (EAttribute) implementationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_SoftPkg() {
		return (EReference) implementationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplRef() {
		return implRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplRef_Refid() {
		return (EAttribute) implRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalFile() {
		return localFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalFile_Name() {
		return (EAttribute) localFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOs() {
		return osEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOs_Name() {
		return (EAttribute) osEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOs_Version() {
		return (EAttribute) osEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Name() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammingLanguage() {
		return programmingLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingLanguage_Name() {
		return (EAttribute) programmingLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammingLanguage_Version() {
		return (EAttribute) programmingLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFile() {
		return propertyFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyFile_LocalFile() {
		return (EReference) propertyFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyFile_Properties() {
		return (EReference) propertyFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyFile_Type() {
		return (EAttribute) propertyFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyRef() {
		return propertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyRef_RefId() {
		return (EAttribute) propertyRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyRef_Value() {
		return (EAttribute) propertyRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntime() {
		return runtimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntime_Name() {
		return (EAttribute) runtimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntime_Version() {
		return (EAttribute) runtimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftPkg() {
		return softPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftPkg_Title() {
		return (EAttribute) softPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkg_Author() {
		return (EReference) softPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftPkg_Description() {
		return (EAttribute) softPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkg_PropertyFile() {
		return (EReference) softPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkg_Descriptor() {
		return (EReference) softPkgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkg_Implementation() {
		return (EReference) softPkgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkg_UsesDevice() {
		return (EReference) softPkgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftPkg_Id() {
		return (EAttribute) softPkgEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftPkg_Name() {
		return (EAttribute) softPkgEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftPkg_Type() {
		return (EAttribute) softPkgEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftPkg_Version() {
		return (EAttribute) softPkgEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftPkgRef() {
		return softPkgRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkgRef_LocalFile() {
		return (EReference) softPkgRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkgRef_ImplRef() {
		return (EReference) softPkgRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkgRef_Implementation() {
		return (EReference) softPkgRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftPkgRef_SoftPkg() {
		return (EReference) softPkgRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpdDocumentRoot() {
		return spdDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpdDocumentRoot_Mixed() {
		return (EAttribute) spdDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpdDocumentRoot_XMLNSPrefixMap() {
		return (EReference) spdDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpdDocumentRoot_XSISchemaLocation() {
		return (EReference) spdDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpdDocumentRoot_Softpkg() {
		return (EReference) spdDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsesDevice() {
		return usesDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsesDevice_PropertyRef() {
		return (EReference) usesDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsesDevice_Id() {
		return (EAttribute) usesDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsesDevice_Type() {
		return (EAttribute) usesDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAEPComplianceType() {
		return aepComplianceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeFileType() {
		return codeFileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAEPComplianceTypeObject() {
		return aepComplianceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodeFileTypeObject() {
		return codeFileTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdFactory getSpdFactory() {
		return (SpdFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__NAME);
		createEAttribute(authorEClass, AUTHOR__COMPANY);
		createEAttribute(authorEClass, AUTHOR__WEBPAGE);

		codeEClass = createEClass(CODE);
		createEReference(codeEClass, CODE__LOCAL_FILE);
		createEAttribute(codeEClass, CODE__ENTRY_POINT);
		createEAttribute(codeEClass, CODE__STACK_SIZE);
		createEAttribute(codeEClass, CODE__PRIORITY);
		createEAttribute(codeEClass, CODE__TYPE);

		compilerEClass = createEClass(COMPILER);
		createEAttribute(compilerEClass, COMPILER__NAME);
		createEAttribute(compilerEClass, COMPILER__VERSION);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SOFT_PKG_REF);
		createEReference(dependencyEClass, DEPENDENCY__PROPERTY_REF);
		createEAttribute(dependencyEClass, DEPENDENCY__TYPE);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEReference(descriptorEClass, DESCRIPTOR__LOCALFILE);
		createEReference(descriptorEClass, DESCRIPTOR__COMPONENT);
		createEAttribute(descriptorEClass, DESCRIPTOR__NAME);

		humanLanguageEClass = createEClass(HUMAN_LANGUAGE);
		createEAttribute(humanLanguageEClass, HUMAN_LANGUAGE__NAME);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEAttribute(implementationEClass, IMPLEMENTATION__DESCRIPTION);
		createEReference(implementationEClass, IMPLEMENTATION__PROPERTY_FILE);
		createEReference(implementationEClass, IMPLEMENTATION__CODE);
		createEReference(implementationEClass, IMPLEMENTATION__COMPILER);
		createEReference(implementationEClass, IMPLEMENTATION__PROGRAMMING_LANGUAGE);
		createEReference(implementationEClass, IMPLEMENTATION__HUMAN_LANGUAGE);
		createEReference(implementationEClass, IMPLEMENTATION__RUNTIME);
		createEAttribute(implementationEClass, IMPLEMENTATION__DEPENDENCY_MAP);
		createEReference(implementationEClass, IMPLEMENTATION__OS);
		createEReference(implementationEClass, IMPLEMENTATION__PROCESSOR);
		createEReference(implementationEClass, IMPLEMENTATION__DEPENDENCY);
		createEReference(implementationEClass, IMPLEMENTATION__USES_DEVICE);
		createEAttribute(implementationEClass, IMPLEMENTATION__AEP_COMPLIANCE);
		createEAttribute(implementationEClass, IMPLEMENTATION__ID);
		createEReference(implementationEClass, IMPLEMENTATION__SOFT_PKG);

		implRefEClass = createEClass(IMPL_REF);
		createEAttribute(implRefEClass, IMPL_REF__REFID);

		localFileEClass = createEClass(LOCAL_FILE);
		createEAttribute(localFileEClass, LOCAL_FILE__NAME);

		osEClass = createEClass(OS);
		createEAttribute(osEClass, OS__NAME);
		createEAttribute(osEClass, OS__VERSION);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__NAME);

		programmingLanguageEClass = createEClass(PROGRAMMING_LANGUAGE);
		createEAttribute(programmingLanguageEClass, PROGRAMMING_LANGUAGE__NAME);
		createEAttribute(programmingLanguageEClass, PROGRAMMING_LANGUAGE__VERSION);

		propertyFileEClass = createEClass(PROPERTY_FILE);
		createEReference(propertyFileEClass, PROPERTY_FILE__LOCAL_FILE);
		createEReference(propertyFileEClass, PROPERTY_FILE__PROPERTIES);
		createEAttribute(propertyFileEClass, PROPERTY_FILE__TYPE);

		propertyRefEClass = createEClass(PROPERTY_REF);
		createEAttribute(propertyRefEClass, PROPERTY_REF__REF_ID);
		createEAttribute(propertyRefEClass, PROPERTY_REF__VALUE);

		runtimeEClass = createEClass(RUNTIME);
		createEAttribute(runtimeEClass, RUNTIME__NAME);
		createEAttribute(runtimeEClass, RUNTIME__VERSION);

		softPkgEClass = createEClass(SOFT_PKG);
		createEAttribute(softPkgEClass, SOFT_PKG__TITLE);
		createEReference(softPkgEClass, SOFT_PKG__AUTHOR);
		createEAttribute(softPkgEClass, SOFT_PKG__DESCRIPTION);
		createEReference(softPkgEClass, SOFT_PKG__PROPERTY_FILE);
		createEReference(softPkgEClass, SOFT_PKG__DESCRIPTOR);
		createEReference(softPkgEClass, SOFT_PKG__IMPLEMENTATION);
		createEReference(softPkgEClass, SOFT_PKG__USES_DEVICE);
		createEAttribute(softPkgEClass, SOFT_PKG__ID);
		createEAttribute(softPkgEClass, SOFT_PKG__NAME);
		createEAttribute(softPkgEClass, SOFT_PKG__TYPE);
		createEAttribute(softPkgEClass, SOFT_PKG__VERSION);

		softPkgRefEClass = createEClass(SOFT_PKG_REF);
		createEReference(softPkgRefEClass, SOFT_PKG_REF__LOCAL_FILE);
		createEReference(softPkgRefEClass, SOFT_PKG_REF__IMPL_REF);
		createEReference(softPkgRefEClass, SOFT_PKG_REF__IMPLEMENTATION);
		createEReference(softPkgRefEClass, SOFT_PKG_REF__SOFT_PKG);

		spdDocumentRootEClass = createEClass(SPD_DOCUMENT_ROOT);
		createEAttribute(spdDocumentRootEClass, SPD_DOCUMENT_ROOT__MIXED);
		createEReference(spdDocumentRootEClass, SPD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(spdDocumentRootEClass, SPD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(spdDocumentRootEClass, SPD_DOCUMENT_ROOT__SOFTPKG);

		usesDeviceEClass = createEClass(USES_DEVICE);
		createEReference(usesDeviceEClass, USES_DEVICE__PROPERTY_REF);
		createEAttribute(usesDeviceEClass, USES_DEVICE__ID);
		createEAttribute(usesDeviceEClass, USES_DEVICE__TYPE);

		// Create enums
		aepComplianceTypeEEnum = createEEnum(AEP_COMPLIANCE_TYPE);
		codeFileTypeEEnum = createEEnum(CODE_FILE_TYPE);

		// Create data types
		aepComplianceTypeObjectEDataType = createEDataType(AEP_COMPLIANCE_TYPE_OBJECT);
		codeFileTypeObjectEDataType = createEDataType(CODE_FILE_TYPE_OBJECT);
		uriEDataType = createEDataType(URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		PrfPackage thePrfPackage = (PrfPackage) EPackage.Registry.INSTANCE.getEPackage(PrfPackage.eNS_URI);
		ScdPackage theScdPackage = (ScdPackage) EPackage.Registry.INSTANCE.getEPackage(ScdPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dependencyEClass.getESuperTypes().add(thePrfPackage.getPropertyRefSet());
		usesDeviceEClass.getESuperTypes().add(thePrfPackage.getPropertyRefGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_Name(), theXMLTypePackage.getString(), "name", null, 0, -1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Company(), theXMLTypePackage.getString(), "company", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Webpage(), theXMLTypePackage.getAnyURI(), "webpage", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCode_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCode_EntryPoint(), theXMLTypePackage.getString(), "entryPoint", null, 0, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCode_StackSize(), theXMLTypePackage.getUnsignedLong(), "stackSize", null, 0, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCode_Priority(), theXMLTypePackage.getUnsignedLong(), "priority", null, 0, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCode_Type(), this.getCodeFileType(), "type", null, 0, 1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilerEClass, mil.jpeojtrs.sca.spd.Compiler.class, "Compiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompiler_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, mil.jpeojtrs.sca.spd.Compiler.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompiler_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, mil.jpeojtrs.sca.spd.Compiler.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_SoftPkgRef(), this.getSoftPkgRef(), null, "softPkgRef", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_PropertyRef(), this.getPropertyRef(), null, "propertyRef", null, 0, 1, Dependency.class, IS_TRANSIENT, IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorEClass, mil.jpeojtrs.sca.spd.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptor_Localfile(), this.getLocalFile(), null, "localfile", null, 1, 1, mil.jpeojtrs.sca.spd.Descriptor.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Component(), theScdPackage.getSoftwareComponent(), null, "component", null, 0, 1, mil.jpeojtrs.sca.spd.Descriptor.class,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, mil.jpeojtrs.sca.spd.Descriptor.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanLanguageEClass, HumanLanguage.class, "HumanLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHumanLanguage_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, HumanLanguage.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementation_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Implementation.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_PropertyFile(), this.getPropertyFile(), null, "propertyFile", null, 0, 1, Implementation.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Code(), this.getCode(), null, "code", null, 1, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Compiler(), this.getCompiler(), null, "compiler", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_ProgrammingLanguage(), this.getProgrammingLanguage(), null, "programmingLanguage", null, 0, 1, Implementation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_HumanLanguage(), this.getHumanLanguage(), null, "humanLanguage", null, 0, 1, Implementation.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Runtime(), this.getRuntime(), null, "runtime", null, 0, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementation_DependencyMap(), ecorePackage.getEFeatureMapEntry(), "dependencyMap", null, 0, -1, Implementation.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Os(), this.getOs(), null, "os", null, 0, -1, Implementation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Processor(), this.getProcessor(), null, "processor", null, 0, -1, Implementation.class, IS_TRANSIENT, IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_Dependency(), this.getDependency(), null, "dependency", null, 0, -1, Implementation.class, IS_TRANSIENT, IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_UsesDevice(), this.getUsesDevice(), null, "usesDevice", null, 0, -1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementation_AepCompliance(), this.getAEPComplianceType(), "aepCompliance", "aep_compliant", 0, 1, Implementation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementation_Id(), theXMLTypePackage.getName_(), "id", null, 1, 1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementation_SoftPkg(), this.getSoftPkg(), this.getSoftPkg_Implementation(), "softPkg", null, 0, 1, Implementation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(implementationEClass, theXMLTypePackage.getBoolean(), "isExecutable", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(implementationEClass, theXMLTypePackage.getBoolean(), "isSharedLibrary", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implRefEClass, ImplRef.class, "ImplRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplRef_Refid(), theXMLTypePackage.getString(), "refid", null, 1, 1, ImplRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localFileEClass, LocalFile.class, "LocalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalFile_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LocalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osEClass, Os.class, "Os", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOs_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOs_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Os.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmingLanguageEClass, ProgrammingLanguage.class, "ProgrammingLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgrammingLanguage_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ProgrammingLanguage.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammingLanguage_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ProgrammingLanguage.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFileEClass, PropertyFile.class, "PropertyFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyFile_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyFile_Properties(), thePrfPackage.getProperties(), null, "properties", null, 0, 1, PropertyFile.class, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyFile_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyRefEClass, PropertyRef.class, "PropertyRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyRef_RefId(), theXMLTypePackage.getString(), "refId", null, 1, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyRef_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeEClass, mil.jpeojtrs.sca.spd.Runtime.class, "Runtime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntime_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, mil.jpeojtrs.sca.spd.Runtime.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntime_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, mil.jpeojtrs.sca.spd.Runtime.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softPkgEClass, SoftPkg.class, "SoftPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftPkg_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkg_Author(), this.getAuthor(), null, "author", null, 1, -1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftPkg_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkg_PropertyFile(), this.getPropertyFile(), null, "propertyFile", null, 0, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkg_Descriptor(), this.getDescriptor(), null, "descriptor", null, 0, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkg_Implementation(), this.getImplementation(), this.getImplementation_SoftPkg(), "implementation", null, 1, -1, SoftPkg.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkg_UsesDevice(), this.getUsesDevice(), null, "usesDevice", null, 0, -1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftPkg_Id(), thePrfPackage.getDceUUID(), "id", null, 1, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftPkg_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftPkg_Type(), theEcorePackage.getEString(), "type", "sca_compliant", 0, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftPkg_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, SoftPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(softPkgEClass, this.getImplementation(), "getImplementation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "implID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(softPkgRefEClass, SoftPkgRef.class, "SoftPkgRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftPkgRef_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, SoftPkgRef.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkgRef_ImplRef(), this.getImplRef(), null, "implRef", null, 0, 1, SoftPkgRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkgRef_Implementation(), this.getImplementation(), null, "implementation", null, 0, 1, SoftPkgRef.class, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSoftPkgRef_SoftPkg(), this.getSoftPkg(), null, "softPkg", null, 0, 1, SoftPkgRef.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spdDocumentRootEClass, SpdDocumentRoot.class, "SpdDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpdDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpdDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpdDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null,
			IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpdDocumentRoot_Softpkg(), this.getSoftPkg(), null, "softpkg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(usesDeviceEClass, UsesDevice.class, "UsesDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsesDevice_PropertyRef(), this.getPropertyRef(), null, "propertyRef", null, 1, -1, UsesDevice.class, IS_TRANSIENT, IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsesDevice_Id(), theEcorePackage.getEString(), "id", null, 1, 1, UsesDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsesDevice_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, UsesDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aepComplianceTypeEEnum, AEPComplianceType.class, "AEPComplianceType");
		addEEnumLiteral(aepComplianceTypeEEnum, AEPComplianceType.AEP_COMPLIANT);
		addEEnumLiteral(aepComplianceTypeEEnum, AEPComplianceType.AEP_NON_COMPLIANT);

		initEEnum(codeFileTypeEEnum, CodeFileType.class, "CodeFileType");
		addEEnumLiteral(codeFileTypeEEnum, CodeFileType.EXECUTABLE);
		addEEnumLiteral(codeFileTypeEEnum, CodeFileType.KERNEL_MODULE);
		addEEnumLiteral(codeFileTypeEEnum, CodeFileType.SHARED_LIBRARY);
		addEEnumLiteral(codeFileTypeEEnum, CodeFileType.DRIVER);
		addEEnumLiteral(codeFileTypeEEnum, CodeFileType.NODE_BOOTER);

		// Initialize data types
		initEDataType(aepComplianceTypeObjectEDataType, AEPComplianceType.class, "AEPComplianceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(codeFileTypeObjectEDataType, CodeFileType.class, "CodeFileTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(aepComplianceTypeEEnum, source, new String[] { "name", "aepcompliance_._type" });
		addAnnotation(aepComplianceTypeObjectEDataType, source, new String[] { "name", "aepcompliance_._type:Object", "baseType", "aepcompliance_._type" });
		addAnnotation(authorEClass, source, new String[] { "name", "author", "kind", "elementOnly" });
		addAnnotation(getAuthor_Name(), source, new String[] { "kind", "element", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getAuthor_Company(), source, new String[] { "kind", "element", "name", "company", "namespace", "##targetNamespace" });
		addAnnotation(getAuthor_Webpage(), source, new String[] { "kind", "element", "name", "webpage", "namespace", "##targetNamespace" });
		addAnnotation(codeEClass, source, new String[] { "name", "code", "kind", "elementOnly" });
		addAnnotation(getCode_LocalFile(), source, new String[] { "kind", "element", "name", "localfile", "namespace", "##targetNamespace" });
		addAnnotation(getCode_EntryPoint(), source, new String[] { "kind", "element", "name", "entrypoint", "namespace", "##targetNamespace" });
		addAnnotation(getCode_StackSize(), source, new String[] { "kind", "element", "name", "stacksize", "namespace", "##targetNamespace" });
		addAnnotation(getCode_Priority(), source, new String[] { "kind", "element", "name", "priority", "namespace", "##targetNamespace" });
		addAnnotation(getCode_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(codeFileTypeEEnum, source, new String[] { "name", "type_._type" });
		addAnnotation(codeFileTypeObjectEDataType, source, new String[] { "name", "type_._type:Object", "baseType", "type_._type" });
		addAnnotation(compilerEClass, source, new String[] { "name", "compiler", "kind", "empty" });
		addAnnotation(getCompiler_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getCompiler_Version(), source, new String[] { "kind", "attribute", "name", "version" });
		addAnnotation(dependencyEClass, source, new String[] { "name", "dependency", "kind", "elementOnly" });
		addAnnotation(getDependency_SoftPkgRef(), source, new String[] { "kind", "element", "name", "softpkgref", "namespace", "##targetNamespace" });
		addAnnotation(getDependency_PropertyRef(), source, new String[] { "kind", "element", "name", "propertyref", "group", "#properties:0" });
		addAnnotation(getDependency_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(descriptorEClass, source, new String[] { "name", "descriptor", "kind", "elementOnly" });
		addAnnotation(getDescriptor_Localfile(), source, new String[] { "kind", "element", "name", "localfile", "namespace", "##targetNamespace" });
		addAnnotation(getDescriptor_Component(), source, new String[] { "kind", "attribute", "name", "component" });
		addAnnotation(getDescriptor_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(humanLanguageEClass, source, new String[] { "name", "humanLanguage", "kind", "empty" });
		addAnnotation(getHumanLanguage_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(implementationEClass, source, new String[] { "name", "implementation", "kind", "elementOnly" });
		addAnnotation(getImplementation_Description(), source, new String[] { "kind", "element", "name", "description", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_PropertyFile(), source, new String[] { "kind", "element", "name", "propertyfile", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_Code(), source, new String[] { "kind", "element", "name", "code", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_Compiler(), source, new String[] { "kind", "element", "name", "compiler", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_ProgrammingLanguage(), source,
			new String[] { "kind", "element", "name", "programminglanguage", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_HumanLanguage(), source, new String[] { "kind", "element", "name", "humanlanguage", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_Runtime(), source, new String[] { "kind", "element", "name", "runtime", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_DependencyMap(), source, new String[] { "kind", "group", "name", "dependencyMap:7" });
		addAnnotation(getImplementation_Os(), source,
			new String[] { "kind", "element", "name", "os", "namespace", "##targetNamespace", "group", "#dependencyMap:7" });
		addAnnotation(getImplementation_Processor(), source,
			new String[] { "kind", "element", "name", "processor", "namespace", "##targetNamespace", "group", "#dependencyMap:7" });
		addAnnotation(getImplementation_Dependency(), source,
			new String[] { "kind", "element", "name", "dependency", "namespace", "##targetNamespace", "group", "#dependencyMap:7" });
		addAnnotation(getImplementation_UsesDevice(), source, new String[] { "kind", "element", "name", "usesdevice", "namespace", "##targetNamespace" });
		addAnnotation(getImplementation_AepCompliance(), source, new String[] { "kind", "attribute", "name", "aepcompliance" });
		addAnnotation(getImplementation_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getImplementation_SoftPkg(), source, new String[] { "kind", "attribute", "name", "softPkg" });
		addAnnotation(implRefEClass, source, new String[] { "name", "implRef", "kind", "empty" });
		addAnnotation(getImplRef_Refid(), source, new String[] { "kind", "attribute", "name", "refid" });
		addAnnotation(localFileEClass, source, new String[] { "name", "localFile", "kind", "empty" });
		addAnnotation(getLocalFile_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(osEClass, source, new String[] { "name", "os", "kind", "empty" });
		addAnnotation(getOs_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getOs_Version(), source, new String[] { "kind", "attribute", "name", "version" });
		addAnnotation(processorEClass, source, new String[] { "name", "processor", "kind", "empty" });
		addAnnotation(getProcessor_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(programmingLanguageEClass, source, new String[] { "name", "programmingLanguage", "kind", "empty" });
		addAnnotation(getProgrammingLanguage_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getProgrammingLanguage_Version(), source, new String[] { "kind", "attribute", "name", "version" });
		addAnnotation(propertyFileEClass, source, new String[] { "name", "propertyFile", "kind", "elementOnly" });
		addAnnotation(getPropertyFile_LocalFile(), source, new String[] { "kind", "element", "name", "localfile", "namespace", "##targetNamespace" });
		addAnnotation(getPropertyFile_Properties(), source, new String[] { "kind", "attribute", "name", "properties" });
		addAnnotation(getPropertyFile_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(propertyRefEClass, source, new String[] { "name", "propertyRef", "kind", "empty" });
		addAnnotation(getPropertyRef_RefId(), source, new String[] { "kind", "attribute", "name", "refid" });
		addAnnotation(getPropertyRef_Value(), source, new String[] { "kind", "attribute", "name", "value" });
		addAnnotation(runtimeEClass, source, new String[] { "name", "runtime", "kind", "empty" });
		addAnnotation(getRuntime_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getRuntime_Version(), source, new String[] { "kind", "attribute", "name", "version" });
		addAnnotation(softPkgEClass, source, new String[] { "name", "softPkg", "kind", "elementOnly" });
		addAnnotation(getSoftPkg_Title(), source, new String[] { "kind", "element", "name", "title", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_Author(), source, new String[] { "kind", "element", "name", "author", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_Description(), source, new String[] { "kind", "element", "name", "description", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_PropertyFile(), source, new String[] { "kind", "element", "name", "propertyfile", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_Descriptor(), source, new String[] { "kind", "element", "name", "descriptor", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_Implementation(), source, new String[] { "kind", "element", "name", "implementation", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_UsesDevice(), source, new String[] { "kind", "element", "name", "usesdevice", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkg_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getSoftPkg_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getSoftPkg_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(getSoftPkg_Version(), source, new String[] { "kind", "attribute", "name", "version" });
		addAnnotation(softPkgRefEClass, source, new String[] { "name", "softPkgRef", "kind", "elementOnly" });
		addAnnotation(getSoftPkgRef_LocalFile(), source, new String[] { "kind", "element", "name", "localfile", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkgRef_ImplRef(), source, new String[] { "kind", "element", "name", "implref", "namespace", "##targetNamespace" });
		addAnnotation(getSoftPkgRef_Implementation(), source, new String[] { "kind", "attribute", "name", "implementation" });
		addAnnotation(getSoftPkgRef_SoftPkg(), source, new String[] { "kind", "attribute", "name", "softPkg" });
		addAnnotation(spdDocumentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getSpdDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getSpdDocumentRoot_XMLNSPrefixMap(), source, new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getSpdDocumentRoot_XSISchemaLocation(), source, new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getSpdDocumentRoot_Softpkg(), source, new String[] { "kind", "element", "name", "softpkg", "namespace", "##targetNamespace" });
		addAnnotation(uriEDataType, source, new String[] { "name", "URI" });
		addAnnotation(usesDeviceEClass, source, new String[] { "name", "usesDevice", "kind", "elementOnly" });
		addAnnotation(getUsesDevice_PropertyRef(), source, new String[] { "kind", "element", "name", "propertyref", "group", "#properties:0" });
		addAnnotation(getUsesDevice_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getUsesDevice_Type(), source, new String[] { "kind", "attribute", "name", "type" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(dependencyEClass, source, new String[] { "constraints", "NonEmptyDependency" });
		addAnnotation(softPkgEClass, source, new String[] { "constraints", "isValueConsistent" });
	}

} //SpdPackageImpl

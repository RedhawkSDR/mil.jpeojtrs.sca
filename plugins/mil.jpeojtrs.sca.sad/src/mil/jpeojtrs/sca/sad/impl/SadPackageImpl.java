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

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.ExternalProperties;
import mil.jpeojtrs.sca.sad.ExternalProperty;
import mil.jpeojtrs.sca.sad.FindComponent;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadConnectInterface;
import mil.jpeojtrs.sca.sad.SadConnections;
import mil.jpeojtrs.sca.sad.SadDocumentRoot;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadPartitioning;
import mil.jpeojtrs.sca.sad.SadProvidesPort;
import mil.jpeojtrs.sca.sad.SadUsesPort;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.util.SadValidator;
import mil.jpeojtrs.sca.validator.AdvancedEObjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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
public class SadPackageImpl extends EPackageImpl implements SadPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyControllerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadComponentInstantiationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadComponentInstantiationRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadUsesPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadProvidesPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadConnectInterfaceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadConnectionsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentResourceFactoryRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPortsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPropertiesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalPropertyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findComponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostCollocationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadPartitioningEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadComponentPlacementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceFactoryPropertiesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sadDocumentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareAssemblyEClass = null;

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SadPackageImpl() {
		super(eNS_URI, SadFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SadPackage initGen() {
		if (isInited) return (SadPackage)EPackage.Registry.INSTANCE.getEPackage(SadPackage.eNS_URI);

		// Obtain or create and register package
		SadPackageImpl theSadPackage = (SadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SadPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PartitioningPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSadPackage.createPackageContents();

		// Initialize created meta-data
		theSadPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSadPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SadValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SadPackage.eNS_URI, theSadPackage);
		return theSadPackage;
	}

	public static SadPackage init() {
		// END GENERATED CODE
		SadPackage retVal = initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			private final AdvancedEObjectValidator validator = new AdvancedEObjectValidator(SadValidator.INSTANCE);
			public EValidator getEValidator() {
				return validator;
			}
		});

		return retVal;
		
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyController() {
		return assemblyControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyController_ComponentInstantiationRef() {
		return (EReference)assemblyControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadComponentInstantiation() {
		return sadComponentInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSadComponentInstantiation_FindComponent() {
		return (EReference)sadComponentInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSadComponentInstantiation_StartOrder() {
		return (EAttribute)sadComponentInstantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadComponentInstantiationRef() {
		return sadComponentInstantiationRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadUsesPort() {
		return sadUsesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadProvidesPort() {
		return sadProvidesPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadConnectInterface() {
		return sadConnectInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadConnections() {
		return sadConnectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentResourceFactoryRef() {
		return componentResourceFactoryRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentResourceFactoryRef_ResourceFactoryProperties() {
		return (EReference)componentResourceFactoryRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentResourceFactoryRef_Refid() {
		return (EAttribute)componentResourceFactoryRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentResourceFactoryRef_Component() {
		return (EReference)componentResourceFactoryRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalPorts() {
		return externalPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalPorts_Port() {
		return (EReference)externalPortsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalProperties() {
		return externalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalProperties_Properties() {
		return (EReference)externalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalProperty() {
		return externalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalProperty_CompRefID() {
		return (EAttribute)externalPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalProperty_PropID() {
		return (EAttribute)externalPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalProperty_ExternalPropID() {
		return (EAttribute)externalPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindComponent() {
		return findComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindComponent_ComponentResourceFactoryRef() {
		return (EReference)findComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFindComponent_NamingService() {
		return (EReference)findComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostCollocation() {
		return hostCollocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostCollocation_ComponentPlacement() {
		return (EReference)hostCollocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostCollocation_Id() {
		return (EAttribute)hostCollocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostCollocation_Name() {
		return (EAttribute)hostCollocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Description() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_UsesIdentifier() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_ProvidesIndentifier() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_SupportedIdentifier() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_ComponentInstantiationRef() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_ExternalName() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadPartitioning() {
		return sadPartitioningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSadPartitioning_HostCollocation() {
		return (EReference)sadPartitioningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadComponentPlacement() {
		return sadComponentPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceFactoryProperties() {
		return resourceFactoryPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceFactoryProperties_Group() {
		return (EAttribute)resourceFactoryPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFactoryProperties_SimpleRef() {
		return (EReference)resourceFactoryPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFactoryProperties_SimpleSequenceRef() {
		return (EReference)resourceFactoryPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFactoryProperties_StructRef() {
		return (EReference)resourceFactoryPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFactoryProperties_StructSequenceRef() {
		return (EReference)resourceFactoryPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFactoryProperties_FactoryRef() {
		return (EReference)resourceFactoryPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSadDocumentRoot() {
		return sadDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSadDocumentRoot_Mixed() {
		return (EAttribute)sadDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSadDocumentRoot_XMLNSPrefixMap() {
		return (EReference)sadDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSadDocumentRoot_XSISchemaLocation() {
		return (EReference)sadDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSadDocumentRoot_Softwareassembly() {
		return (EReference)sadDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareAssembly() {
		return softwareAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareAssembly_Description() {
		return (EAttribute)softwareAssemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAssembly_ComponentFiles() {
		return (EReference)softwareAssemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAssembly_Partitioning() {
		return (EReference)softwareAssemblyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAssembly_AssemblyController() {
		return (EReference)softwareAssemblyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAssembly_Connections() {
		return (EReference)softwareAssemblyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAssembly_ExternalPorts() {
		return (EReference)softwareAssemblyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareAssembly_ExternalProperties() {
		return (EReference)softwareAssemblyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareAssembly_Id() {
		return (EAttribute)softwareAssemblyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareAssembly_Name() {
		return (EAttribute)softwareAssemblyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareAssembly_Version() {
		return (EAttribute)softwareAssemblyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadFactory getSadFactory() {
		return (SadFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assemblyControllerEClass = createEClass(ASSEMBLY_CONTROLLER);
		createEReference(assemblyControllerEClass, ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF);

		sadComponentInstantiationEClass = createEClass(SAD_COMPONENT_INSTANTIATION);
		createEReference(sadComponentInstantiationEClass, SAD_COMPONENT_INSTANTIATION__FIND_COMPONENT);
		createEAttribute(sadComponentInstantiationEClass, SAD_COMPONENT_INSTANTIATION__START_ORDER);

		sadComponentInstantiationRefEClass = createEClass(SAD_COMPONENT_INSTANTIATION_REF);

		sadUsesPortEClass = createEClass(SAD_USES_PORT);

		sadProvidesPortEClass = createEClass(SAD_PROVIDES_PORT);

		sadConnectInterfaceEClass = createEClass(SAD_CONNECT_INTERFACE);

		sadConnectionsEClass = createEClass(SAD_CONNECTIONS);

		componentResourceFactoryRefEClass = createEClass(COMPONENT_RESOURCE_FACTORY_REF);
		createEReference(componentResourceFactoryRefEClass, COMPONENT_RESOURCE_FACTORY_REF__RESOURCE_FACTORY_PROPERTIES);
		createEAttribute(componentResourceFactoryRefEClass, COMPONENT_RESOURCE_FACTORY_REF__REFID);
		createEReference(componentResourceFactoryRefEClass, COMPONENT_RESOURCE_FACTORY_REF__COMPONENT);

		externalPortsEClass = createEClass(EXTERNAL_PORTS);
		createEReference(externalPortsEClass, EXTERNAL_PORTS__PORT);

		externalPropertiesEClass = createEClass(EXTERNAL_PROPERTIES);
		createEReference(externalPropertiesEClass, EXTERNAL_PROPERTIES__PROPERTIES);

		externalPropertyEClass = createEClass(EXTERNAL_PROPERTY);
		createEAttribute(externalPropertyEClass, EXTERNAL_PROPERTY__COMP_REF_ID);
		createEAttribute(externalPropertyEClass, EXTERNAL_PROPERTY__PROP_ID);
		createEAttribute(externalPropertyEClass, EXTERNAL_PROPERTY__EXTERNAL_PROP_ID);

		findComponentEClass = createEClass(FIND_COMPONENT);
		createEReference(findComponentEClass, FIND_COMPONENT__COMPONENT_RESOURCE_FACTORY_REF);
		createEReference(findComponentEClass, FIND_COMPONENT__NAMING_SERVICE);

		hostCollocationEClass = createEClass(HOST_COLLOCATION);
		createEReference(hostCollocationEClass, HOST_COLLOCATION__COMPONENT_PLACEMENT);
		createEAttribute(hostCollocationEClass, HOST_COLLOCATION__ID);
		createEAttribute(hostCollocationEClass, HOST_COLLOCATION__NAME);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__DESCRIPTION);
		createEAttribute(portEClass, PORT__USES_IDENTIFIER);
		createEAttribute(portEClass, PORT__PROVIDES_INDENTIFIER);
		createEAttribute(portEClass, PORT__SUPPORTED_IDENTIFIER);
		createEReference(portEClass, PORT__COMPONENT_INSTANTIATION_REF);
		createEAttribute(portEClass, PORT__EXTERNAL_NAME);

		sadPartitioningEClass = createEClass(SAD_PARTITIONING);
		createEReference(sadPartitioningEClass, SAD_PARTITIONING__HOST_COLLOCATION);

		sadComponentPlacementEClass = createEClass(SAD_COMPONENT_PLACEMENT);

		resourceFactoryPropertiesEClass = createEClass(RESOURCE_FACTORY_PROPERTIES);
		createEAttribute(resourceFactoryPropertiesEClass, RESOURCE_FACTORY_PROPERTIES__GROUP);
		createEReference(resourceFactoryPropertiesEClass, RESOURCE_FACTORY_PROPERTIES__SIMPLE_REF);
		createEReference(resourceFactoryPropertiesEClass, RESOURCE_FACTORY_PROPERTIES__SIMPLE_SEQUENCE_REF);
		createEReference(resourceFactoryPropertiesEClass, RESOURCE_FACTORY_PROPERTIES__STRUCT_REF);
		createEReference(resourceFactoryPropertiesEClass, RESOURCE_FACTORY_PROPERTIES__STRUCT_SEQUENCE_REF);
		createEReference(resourceFactoryPropertiesEClass, RESOURCE_FACTORY_PROPERTIES__FACTORY_REF);

		sadDocumentRootEClass = createEClass(SAD_DOCUMENT_ROOT);
		createEAttribute(sadDocumentRootEClass, SAD_DOCUMENT_ROOT__MIXED);
		createEReference(sadDocumentRootEClass, SAD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(sadDocumentRootEClass, SAD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(sadDocumentRootEClass, SAD_DOCUMENT_ROOT__SOFTWAREASSEMBLY);

		softwareAssemblyEClass = createEClass(SOFTWARE_ASSEMBLY);
		createEAttribute(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__DESCRIPTION);
		createEReference(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__COMPONENT_FILES);
		createEReference(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__PARTITIONING);
		createEReference(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER);
		createEReference(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__CONNECTIONS);
		createEReference(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__EXTERNAL_PORTS);
		createEReference(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__EXTERNAL_PROPERTIES);
		createEAttribute(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__ID);
		createEAttribute(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__NAME);
		createEAttribute(softwareAssemblyEClass, SOFTWARE_ASSEMBLY__VERSION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PartitioningPackage thePartitioningPackage = (PartitioningPackage)EPackage.Registry.INSTANCE.getEPackage(PartitioningPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		PrfPackage thePrfPackage = (PrfPackage)EPackage.Registry.INSTANCE.getEPackage(PrfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sadComponentInstantiationEClass.getESuperTypes().add(thePartitioningPackage.getComponentInstantiation());
		EGenericType g1 = createEGenericType(thePartitioningPackage.getComponentInstantiationRef());
		EGenericType g2 = createEGenericType(this.getSadComponentInstantiation());
		g1.getETypeArguments().add(g2);
		sadComponentInstantiationRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getUsesPort());
		g2 = createEGenericType(this.getSadComponentInstantiationRef());
		g1.getETypeArguments().add(g2);
		sadUsesPortEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getProvidesPort());
		g2 = createEGenericType(this.getSadComponentInstantiationRef());
		g1.getETypeArguments().add(g2);
		sadProvidesPortEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getConnectInterface());
		g2 = createEGenericType(this.getSadComponentInstantiationRef());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSadUsesPort());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSadProvidesPort());
		g1.getETypeArguments().add(g2);
		sadConnectInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getConnections());
		g2 = createEGenericType(this.getSadConnectInterface());
		g1.getETypeArguments().add(g2);
		sadConnectionsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getPartitioning());
		g2 = createEGenericType(this.getSadComponentPlacement());
		g1.getETypeArguments().add(g2);
		sadPartitioningEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(thePartitioningPackage.getComponentPlacement());
		g2 = createEGenericType(this.getSadComponentInstantiation());
		g1.getETypeArguments().add(g2);
		sadComponentPlacementEClass.getEGenericSuperTypes().add(g1);
		resourceFactoryPropertiesEClass.getESuperTypes().add(thePrfPackage.getPropertyRefContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(assemblyControllerEClass, AssemblyController.class, "AssemblyController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyController_ComponentInstantiationRef(), this.getSadComponentInstantiationRef(), null, "componentInstantiationRef", null, 1, 1, AssemblyController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sadComponentInstantiationEClass, SadComponentInstantiation.class, "SadComponentInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSadComponentInstantiation_FindComponent(), this.getFindComponent(), null, "findComponent", null, 0, 1, SadComponentInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSadComponentInstantiation_StartOrder(), theXMLTypePackage.getNonNegativeInteger(), "startOrder", null, 0, 1, SadComponentInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sadComponentInstantiationRefEClass, SadComponentInstantiationRef.class, "SadComponentInstantiationRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sadUsesPortEClass, SadUsesPort.class, "SadUsesPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sadProvidesPortEClass, SadProvidesPort.class, "SadProvidesPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sadConnectInterfaceEClass, SadConnectInterface.class, "SadConnectInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sadConnectionsEClass, SadConnections.class, "SadConnections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentResourceFactoryRefEClass, ComponentResourceFactoryRef.class, "ComponentResourceFactoryRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentResourceFactoryRef_ResourceFactoryProperties(), this.getResourceFactoryProperties(), this.getResourceFactoryProperties_FactoryRef(), "resourceFactoryProperties", null, 0, 1, ComponentResourceFactoryRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentResourceFactoryRef_Refid(), theXMLTypePackage.getString(), "refid", null, 1, 1, ComponentResourceFactoryRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentResourceFactoryRef_Component(), this.getSadComponentInstantiation(), null, "component", null, 0, 1, ComponentResourceFactoryRef.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(externalPortsEClass, ExternalPorts.class, "ExternalPorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalPorts_Port(), this.getPort(), null, "port", null, 1, -1, ExternalPorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalPropertiesEClass, ExternalProperties.class, "ExternalProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalProperties_Properties(), this.getExternalProperty(), null, "properties", null, 0, -1, ExternalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalPropertyEClass, ExternalProperty.class, "ExternalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalProperty_CompRefID(), theEcorePackage.getEString(), "compRefID", null, 1, 1, ExternalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalProperty_PropID(), theEcorePackage.getEString(), "propID", null, 1, 1, ExternalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalProperty_ExternalPropID(), theEcorePackage.getEString(), "externalPropID", null, 0, 1, ExternalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findComponentEClass, FindComponent.class, "FindComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFindComponent_ComponentResourceFactoryRef(), this.getComponentResourceFactoryRef(), null, "componentResourceFactoryRef", null, 0, 1, FindComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFindComponent_NamingService(), thePartitioningPackage.getNamingService(), null, "namingService", null, 0, 1, FindComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostCollocationEClass, HostCollocation.class, "HostCollocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostCollocation_ComponentPlacement(), this.getSadComponentPlacement(), null, "componentPlacement", null, 1, -1, HostCollocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostCollocation_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, HostCollocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHostCollocation_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, HostCollocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_UsesIdentifier(), theXMLTypePackage.getString(), "usesIdentifier", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_ProvidesIndentifier(), theXMLTypePackage.getString(), "providesIndentifier", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_SupportedIdentifier(), theXMLTypePackage.getString(), "supportedIdentifier", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_ComponentInstantiationRef(), this.getSadComponentInstantiationRef(), null, "componentInstantiationRef", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_ExternalName(), theEcorePackage.getEString(), "externalName", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sadPartitioningEClass, SadPartitioning.class, "SadPartitioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSadPartitioning_HostCollocation(), this.getHostCollocation(), null, "hostCollocation", null, 0, -1, SadPartitioning.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sadComponentPlacementEClass, SadComponentPlacement.class, "SadComponentPlacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceFactoryPropertiesEClass, ResourceFactoryProperties.class, "ResourceFactoryProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceFactoryProperties_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ResourceFactoryProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFactoryProperties_SimpleRef(), thePrfPackage.getSimpleRef(), null, "simpleRef", null, 0, -1, ResourceFactoryProperties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFactoryProperties_SimpleSequenceRef(), thePrfPackage.getSimpleSequenceRef(), null, "simpleSequenceRef", null, 0, -1, ResourceFactoryProperties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFactoryProperties_StructRef(), thePrfPackage.getStructRef(), null, "structRef", null, 0, -1, ResourceFactoryProperties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFactoryProperties_StructSequenceRef(), thePrfPackage.getStructSequenceRef(), null, "structSequenceRef", null, 0, -1, ResourceFactoryProperties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFactoryProperties_FactoryRef(), this.getComponentResourceFactoryRef(), this.getComponentResourceFactoryRef_ResourceFactoryProperties(), "factoryRef", null, 1, 1, ResourceFactoryProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sadDocumentRootEClass, SadDocumentRoot.class, "SadDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSadDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSadDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSadDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSadDocumentRoot_Softwareassembly(), this.getSoftwareAssembly(), null, "softwareassembly", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(softwareAssemblyEClass, SoftwareAssembly.class, "SoftwareAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareAssembly_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareAssembly_ComponentFiles(), thePartitioningPackage.getComponentFiles(), null, "componentFiles", null, 1, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareAssembly_Partitioning(), this.getSadPartitioning(), null, "partitioning", null, 1, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareAssembly_AssemblyController(), this.getAssemblyController(), null, "assemblyController", null, 1, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareAssembly_Connections(), this.getSadConnections(), null, "connections", null, 0, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareAssembly_ExternalPorts(), this.getExternalPorts(), null, "externalPorts", null, 0, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareAssembly_ExternalProperties(), this.getExternalProperties(), null, "externalProperties", null, 0, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareAssembly_Id(), thePrfPackage.getDceUUID(), "id", null, 1, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareAssembly_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareAssembly_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, SoftwareAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(softwareAssemblyEClass, this.getSadComponentInstantiation(), "getComponentInstantiation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instantiationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(softwareAssemblyEClass, this.getSadComponentInstantiation(), "getComponentInstantiationsInStartOrder", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(softwareAssemblyEClass, this.getSadComponentInstantiation(), "getAllComponentInstantiations", 0, -1, IS_UNIQUE, IS_ORDERED);

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
		addAnnotation
		  (assemblyControllerEClass, 
		   source, 
		   new String[] {
			 "name", "assemblycontroller",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getAssemblyController_ComponentInstantiationRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentinstantiationref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sadComponentInstantiationEClass, 
		   source, 
		   new String[] {
			 "name", "componentinstantiation",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getSadComponentInstantiation_FindComponent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "findcomponent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSadComponentInstantiation_StartOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startorder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sadComponentInstantiationRefEClass, 
		   source, 
		   new String[] {
			 "name", "componentinstantiationref",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (sadUsesPortEClass, 
		   source, 
		   new String[] {
			 "name", "usesport",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (sadProvidesPortEClass, 
		   source, 
		   new String[] {
			 "name", "providesport",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (sadConnectInterfaceEClass, 
		   source, 
		   new String[] {
			 "name", "connectinterface",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (sadConnectionsEClass, 
		   source, 
		   new String[] {
			 "name", "connections",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (componentResourceFactoryRefEClass, 
		   source, 
		   new String[] {
			 "name", "componentresourcefactoryref",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getComponentResourceFactoryRef_ResourceFactoryProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resourcefactoryproperties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getComponentResourceFactoryRef_Refid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refid"
		   });		
		addAnnotation
		  (externalPortsEClass, 
		   source, 
		   new String[] {
			 "name", "externalports",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getExternalPorts_Port(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (externalPropertiesEClass, 
		   source, 
		   new String[] {
			 "name", "externalproperties",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getExternalProperties_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (externalPropertyEClass, 
		   source, 
		   new String[] {
			 "name", "externalproperty",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getExternalProperty_CompRefID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "comprefid"
		   });		
		addAnnotation
		  (getExternalProperty_PropID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "propid"
		   });		
		addAnnotation
		  (getExternalProperty_ExternalPropID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalpropid"
		   });		
		addAnnotation
		  (findComponentEClass, 
		   source, 
		   new String[] {
			 "name", "findcomponent",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getFindComponent_ComponentResourceFactoryRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentresourcefactoryref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFindComponent_NamingService(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "namingservice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hostCollocationEClass, 
		   source, 
		   new String[] {
			 "name", "hostcollocation",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getHostCollocation_ComponentPlacement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentplacement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHostCollocation_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getHostCollocation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "name", "port",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });			
		addAnnotation
		  (getPort_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPort_UsesIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usesidentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPort_ProvidesIndentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "providesidentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPort_SupportedIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "supportedidentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPort_ComponentInstantiationRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentinstantiationref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPort_ExternalName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalname"
		   });		
		addAnnotation
		  (sadPartitioningEClass, 
		   source, 
		   new String[] {
			 "name", "partitioning",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getSadPartitioning_HostCollocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hostcollocation",
			 "group", "#parts:0"
		   });		
		addAnnotation
		  (sadComponentPlacementEClass, 
		   source, 
		   new String[] {
			 "name", "componentplacement",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (resourceFactoryPropertiesEClass, 
		   source, 
		   new String[] {
			 "name", "resourcefactoryproperties",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getResourceFactoryProperties_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getResourceFactoryProperties_SimpleRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleref",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getResourceFactoryProperties_SimpleSequenceRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simplesequenceref",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getResourceFactoryProperties_StructRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "structref",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getResourceFactoryProperties_StructSequenceRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "structsequenceref",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (sadDocumentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSadDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSadDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getSadDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getSadDocumentRoot_Softwareassembly(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "softwareassembly",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (softwareAssemblyEClass, 
		   source, 
		   new String[] {
			 "name", "softwareassembly",
			 "kind", "elementOnly",
			 "qualified", "false"
		   });		
		addAnnotation
		  (getSoftwareAssembly_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_ComponentFiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "componentfiles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_Partitioning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "partitioning",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_AssemblyController(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assemblycontroller",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_Connections(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connections",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_ExternalPorts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalports",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_ExternalProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalproperties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareAssembly_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSoftwareAssembly_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSoftwareAssembly_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";																															
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "constraints", "NonEmptyPort"
		   });																															
	}

} //SadPackageImpl

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
package mil.jpeojtrs.sca.scd.impl;

import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.scd.AbstractPort;
import mil.jpeojtrs.sca.scd.ComponentFeatures;
import mil.jpeojtrs.sca.scd.ComponentRepId;
import mil.jpeojtrs.sca.scd.ComponentType;
import mil.jpeojtrs.sca.scd.InheritsInterface;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.Interfaces;
import mil.jpeojtrs.sca.scd.LocalFile;
import mil.jpeojtrs.sca.scd.PortType;
import mil.jpeojtrs.sca.scd.PortTypeContainer;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.PropertyFile;
import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.ScdDocumentRoot;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.SupportsInterface;
import mil.jpeojtrs.sca.scd.Uses;
import mil.jpeojtrs.sca.scd.util.ScdValidator;
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
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ScdPackageImpl extends EPackageImpl implements ScdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentFeaturesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRepIdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritsInterfaceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacesEClass = null;
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
	private EClass portsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeContainerEClass = null;
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
	private EClass providesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scdDocumentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareComponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportsInterfaceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portTypeObjectEDataType = null;

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
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScdPackageImpl() {
		super(eNS_URI, ScdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScdPackage initGen() {
		if (isInited) return (ScdPackage)EPackage.Registry.INSTANCE.getEPackage(ScdPackage.eNS_URI);

		// Obtain or create and register package
		ScdPackageImpl theScdPackage = (ScdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PrfPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScdPackage.createPackageContents();

		// Initialize created meta-data
		theScdPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theScdPackage, 
			 new EValidator.Descriptor()
			 {
				 @Override
				public EValidator getEValidator()
				 {
					 return ScdValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theScdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScdPackage.eNS_URI, theScdPackage);
		return theScdPackage;
	}

	public static ScdPackage init() {
		final ScdPackage retVal = ScdPackageImpl.initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			AdvancedEObjectValidator validator = new AdvancedEObjectValidator(ScdValidator.INSTANCE);
			@Override
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
	@Override
	public EClass getComponentFeatures() {
		return componentFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentFeatures_SupportsInterface() {
		return (EReference)componentFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentFeatures_Ports() {
		return (EReference)componentFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRepId() {
		return componentRepIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRepId_Repid() {
		return (EAttribute)componentRepIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRepId_Interface() {
		return (EReference)componentRepIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInheritsInterface() {
		return inheritsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInheritsInterface_Repid() {
		return (EAttribute)inheritsInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInheritsInterface_Interface() {
		return (EReference)inheritsInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_InheritsInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_Name() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_Repid() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaces() {
		return interfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaces_Interface() {
		return (EReference)interfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalFile() {
		return localFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalFile_Name() {
		return (EAttribute)localFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPorts() {
		return portsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPorts_Group() {
		return (EAttribute)portsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPorts_Provides() {
		return (EReference)portsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPorts_Uses() {
		return (EReference)portsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortTypeContainer() {
		return portTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortTypeContainer_Type() {
		return (EAttribute)portTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyFile() {
		return propertyFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyFile_LocalFile() {
		return (EReference)propertyFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyFile_Type() {
		return (EAttribute)propertyFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyFile_Properties() {
		return (EReference)propertyFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvides() {
		return providesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvides_ProvidesName() {
		return (EAttribute)providesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractPort() {
		return abstractPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractPort_PortType() {
		return (EReference)abstractPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractPort_Name() {
		return (EAttribute)abstractPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractPort_RepID() {
		return (EAttribute)abstractPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractPort_Interface() {
		return (EReference)abstractPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScdDocumentRoot() {
		return scdDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScdDocumentRoot_Mixed() {
		return (EAttribute)scdDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScdDocumentRoot_XMLNSPrefixMap() {
		return (EReference)scdDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScdDocumentRoot_XSISchemaLocation() {
		return (EReference)scdDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScdDocumentRoot_Softwarecomponent() {
		return (EReference)scdDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareComponent() {
		return softwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_CorbaVersion() {
		return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_ComponentRepID() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_ComponentType() {
		return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_ComponentFeatures() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_Interfaces() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_PropertyFile() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_RepId() {
		return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportsInterface() {
		return supportsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportsInterface_RepId() {
		return (EAttribute)supportsInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportsInterface_SupportsName() {
		return (EAttribute)supportsInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportsInterface_Id() {
		return (EAttribute)supportsInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportsInterface_Interface() {
		return (EReference)supportsInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUses() {
		return usesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUses_UsesName() {
		return (EAttribute)usesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentType() {
		return componentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPortTypeObject() {
		return portTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScdFactory getScdFactory() {
		return (ScdFactory)getEFactoryInstance();
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
		componentFeaturesEClass = createEClass(COMPONENT_FEATURES);
		createEReference(componentFeaturesEClass, COMPONENT_FEATURES__SUPPORTS_INTERFACE);
		createEReference(componentFeaturesEClass, COMPONENT_FEATURES__PORTS);

		componentRepIdEClass = createEClass(COMPONENT_REP_ID);
		createEAttribute(componentRepIdEClass, COMPONENT_REP_ID__REPID);
		createEReference(componentRepIdEClass, COMPONENT_REP_ID__INTERFACE);

		inheritsInterfaceEClass = createEClass(INHERITS_INTERFACE);
		createEAttribute(inheritsInterfaceEClass, INHERITS_INTERFACE__REPID);
		createEReference(inheritsInterfaceEClass, INHERITS_INTERFACE__INTERFACE);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__INHERITS_INTERFACES);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEAttribute(interfaceEClass, INTERFACE__REPID);

		interfacesEClass = createEClass(INTERFACES);
		createEReference(interfacesEClass, INTERFACES__INTERFACE);

		localFileEClass = createEClass(LOCAL_FILE);
		createEAttribute(localFileEClass, LOCAL_FILE__NAME);

		portsEClass = createEClass(PORTS);
		createEAttribute(portsEClass, PORTS__GROUP);
		createEReference(portsEClass, PORTS__PROVIDES);
		createEReference(portsEClass, PORTS__USES);

		portTypeContainerEClass = createEClass(PORT_TYPE_CONTAINER);
		createEAttribute(portTypeContainerEClass, PORT_TYPE_CONTAINER__TYPE);

		propertyFileEClass = createEClass(PROPERTY_FILE);
		createEReference(propertyFileEClass, PROPERTY_FILE__LOCAL_FILE);
		createEAttribute(propertyFileEClass, PROPERTY_FILE__TYPE);
		createEReference(propertyFileEClass, PROPERTY_FILE__PROPERTIES);

		providesEClass = createEClass(PROVIDES);
		createEAttribute(providesEClass, PROVIDES__PROVIDES_NAME);

		abstractPortEClass = createEClass(ABSTRACT_PORT);
		createEReference(abstractPortEClass, ABSTRACT_PORT__PORT_TYPE);
		createEAttribute(abstractPortEClass, ABSTRACT_PORT__NAME);
		createEAttribute(abstractPortEClass, ABSTRACT_PORT__REP_ID);
		createEReference(abstractPortEClass, ABSTRACT_PORT__INTERFACE);

		scdDocumentRootEClass = createEClass(SCD_DOCUMENT_ROOT);
		createEAttribute(scdDocumentRootEClass, SCD_DOCUMENT_ROOT__MIXED);
		createEReference(scdDocumentRootEClass, SCD_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(scdDocumentRootEClass, SCD_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(scdDocumentRootEClass, SCD_DOCUMENT_ROOT__SOFTWARECOMPONENT);

		softwareComponentEClass = createEClass(SOFTWARE_COMPONENT);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__CORBA_VERSION);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__COMPONENT_REP_ID);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__COMPONENT_TYPE);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__COMPONENT_FEATURES);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__INTERFACES);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__PROPERTY_FILE);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__REP_ID);

		supportsInterfaceEClass = createEClass(SUPPORTS_INTERFACE);
		createEAttribute(supportsInterfaceEClass, SUPPORTS_INTERFACE__REP_ID);
		createEAttribute(supportsInterfaceEClass, SUPPORTS_INTERFACE__SUPPORTS_NAME);
		createEAttribute(supportsInterfaceEClass, SUPPORTS_INTERFACE__ID);
		createEReference(supportsInterfaceEClass, SUPPORTS_INTERFACE__INTERFACE);

		usesEClass = createEClass(USES);
		createEAttribute(usesEClass, USES__USES_NAME);

		// Create enums
		portTypeEEnum = createEEnum(PORT_TYPE);
		componentTypeEEnum = createEEnum(COMPONENT_TYPE);

		// Create data types
		portTypeObjectEDataType = createEDataType(PORT_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		PrfPackage thePrfPackage = (PrfPackage)EPackage.Registry.INSTANCE.getEPackage(PrfPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		providesEClass.getESuperTypes().add(this.getAbstractPort());
		usesEClass.getESuperTypes().add(this.getAbstractPort());

		// Initialize classes and features; add operations and parameters
		initEClass(componentFeaturesEClass, ComponentFeatures.class, "ComponentFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentFeatures_SupportsInterface(), this.getSupportsInterface(), null, "supportsInterface", null, 0, -1, ComponentFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentFeatures_Ports(), this.getPorts(), null, "ports", null, 1, 1, ComponentFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRepIdEClass, ComponentRepId.class, "ComponentRepId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRepId_Repid(), theXMLTypePackage.getString(), "repid", null, 1, 1, ComponentRepId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRepId_Interface(), this.getInterface(), null, "interface", null, 0, 1, ComponentRepId.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inheritsInterfaceEClass, InheritsInterface.class, "InheritsInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritsInterface_Repid(), theXMLTypePackage.getString(), "repid", null, 1, 1, InheritsInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritsInterface_Interface(), this.getInterface(), null, "interface", null, 0, 1, InheritsInterface.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_InheritsInterfaces(), this.getInheritsInterface(), null, "inheritsInterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Repid(), theXMLTypePackage.getString(), "repid", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(interfaceEClass, theEcorePackage.getEBoolean(), "isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterface(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfacesEClass, Interfaces.class, "Interfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaces_Interface(), this.getInterface(), null, "interface", null, 1, -1, Interfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localFileEClass, LocalFile.class, "LocalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalFile_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, LocalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portsEClass, Ports.class, "Ports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorts_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPorts_Provides(), this.getProvides(), null, "provides", null, 0, -1, Ports.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPorts_Uses(), this.getUses(), null, "uses", null, 0, -1, Ports.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portTypeContainerEClass, PortTypeContainer.class, "PortTypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortTypeContainer_Type(), this.getPortType(), "type", "control", 1, 1, PortTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyFileEClass, PropertyFile.class, "PropertyFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyFile_LocalFile(), this.getLocalFile(), null, "localFile", null, 1, 1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyFile_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyFile_Properties(), thePrfPackage.getProperties(), null, "properties", null, 0, 1, PropertyFile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(providesEClass, Provides.class, "Provides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvides_ProvidesName(), theXMLTypePackage.getString(), "providesName", null, 1, 1, Provides.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractPortEClass, AbstractPort.class, "AbstractPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPort_PortType(), this.getPortTypeContainer(), null, "portType", null, 0, -1, AbstractPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPort_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AbstractPort.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPort_RepID(), theXMLTypePackage.getString(), "repID", null, 1, 1, AbstractPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPort_Interface(), this.getInterface(), null, "interface", null, 0, 1, AbstractPort.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(abstractPortEClass, theEcorePackage.getEBoolean(), "isBiDirectional", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(abstractPortEClass, this.getAbstractPort(), "getSibling", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scdDocumentRootEClass, ScdDocumentRoot.class, "ScdDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScdDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScdDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScdDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScdDocumentRoot_Softwarecomponent(), this.getSoftwareComponent(), null, "softwarecomponent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(softwareComponentEClass, SoftwareComponent.class, "SoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareComponent_CorbaVersion(), theXMLTypePackage.getString(), "corbaVersion", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_ComponentRepID(), this.getComponentRepId(), null, "componentRepID", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareComponent_ComponentType(), theXMLTypePackage.getString(), "componentType", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_ComponentFeatures(), this.getComponentFeatures(), null, "componentFeatures", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_Interfaces(), this.getInterfaces(), null, "interfaces", null, 1, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_PropertyFile(), this.getPropertyFile(), null, "propertyFile", null, 0, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareComponent_RepId(), theEcorePackage.getEString(), "repId", null, 0, 1, SoftwareComponent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(supportsInterfaceEClass, SupportsInterface.class, "SupportsInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportsInterface_RepId(), theXMLTypePackage.getString(), "repId", null, 1, 1, SupportsInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportsInterface_SupportsName(), theXMLTypePackage.getString(), "supportsName", null, 1, 1, SupportsInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportsInterface_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SupportsInterface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSupportsInterface_Interface(), this.getInterface(), null, "interface", null, 0, 1, SupportsInterface.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(usesEClass, Uses.class, "Uses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUses_UsesName(), theXMLTypePackage.getString(), "usesName", null, 1, 1, Uses.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.DATA);
		addEEnumLiteral(portTypeEEnum, PortType.RESPONSES);
		addEEnumLiteral(portTypeEEnum, PortType.CONTROL);
		addEEnumLiteral(portTypeEEnum, PortType.TEST);

		initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType");
		addEEnumLiteral(componentTypeEEnum, ComponentType.RESOURCE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.DEVICE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.RESOURCE_FACTORY);
		addEEnumLiteral(componentTypeEEnum, ComponentType.DOMAIN_MANAGER);
		addEEnumLiteral(componentTypeEEnum, ComponentType.LOG);
		addEEnumLiteral(componentTypeEEnum, ComponentType.FILE_SYSTEM);
		addEEnumLiteral(componentTypeEEnum, ComponentType.FILE_MANAGER);
		addEEnumLiteral(componentTypeEEnum, ComponentType.DEVICE_MANAGER);
		addEEnumLiteral(componentTypeEEnum, ComponentType.NAMING_SERVICE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.EVENT_SERVICE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.SERVICE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.OTHER);

		// Initialize data types
		initEDataType(portTypeObjectEDataType, PortType.class, "PortTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (componentFeaturesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "componentFeatures",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getComponentFeatures_SupportsInterface(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "supportsinterface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getComponentFeatures_Ports(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "ports",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (componentRepIdEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "componentRepId",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getComponentRepId_Repid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "repid"
		   });		
		addAnnotation
		  (inheritsInterfaceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "inheritsInterface",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getInheritsInterface_Repid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "repid"
		   });			
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "interface",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getInterface_InheritsInterfaces(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "inheritsinterface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInterface_Name(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "name"
		   });			
		addAnnotation
		  (getInterface_Repid(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "repid"
		   });			
		addAnnotation
		  (interfacesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "interfaces",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInterfaces_Interface(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "interface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (localFileEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "localFile",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLocalFile_Name(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (portsEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "ports",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPorts_Group(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPorts_Provides(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "provides",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPorts_Uses(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "uses",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (portTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "type_._type"
		   });			
		addAnnotation
		  (portTypeContainerEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "portType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPortTypeContainer_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (portTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });		
		addAnnotation
		  (propertyFileEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "propertyFile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPropertyFile_LocalFile(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "localfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyFile_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (providesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "provides",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProvides_ProvidesName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "providesname"
		   });		
		addAnnotation
		  (getAbstractPort_PortType(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "porttype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractPort_RepID(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "repid"
		   });			
		addAnnotation
		  (scdDocumentRootEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getScdDocumentRoot_Mixed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getScdDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getScdDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getScdDocumentRoot_Softwarecomponent(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "softwarecomponent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (softwareComponentEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "softwareComponent",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSoftwareComponent_CorbaVersion(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "corbaversion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareComponent_ComponentRepID(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "componentrepid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareComponent_ComponentType(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "componenttype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareComponent_ComponentFeatures(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "componentfeatures",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareComponent_Interfaces(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "interfaces",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoftwareComponent_PropertyFile(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "propertyfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (supportsInterfaceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "supportsInterface",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSupportsInterface_RepId(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "repid"
		   });			
		addAnnotation
		  (getSupportsInterface_SupportsName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "supportsname"
		   });		
		addAnnotation
		  (usesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "uses",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUses_UsesName(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "usesname"
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
		  (portTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "constraints", "isValueConsistent"
		   });																													
	}

} // ScdPackageImpl

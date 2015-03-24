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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ScdFactoryImpl extends EFactoryImpl implements ScdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScdFactory init() {
		try {
			ScdFactory theScdFactory = (ScdFactory) EPackage.Registry.INSTANCE.getEFactory(ScdPackage.eNS_URI);
			if (theScdFactory != null) {
				return theScdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScdFactoryImpl() {
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
		case ScdPackage.COMPONENT_FEATURES:
			return createComponentFeatures();
		case ScdPackage.COMPONENT_REP_ID:
			return createComponentRepId();
		case ScdPackage.INHERITS_INTERFACE:
			return createInheritsInterface();
		case ScdPackage.INTERFACE:
			return createInterface();
		case ScdPackage.INTERFACES:
			return createInterfaces();
		case ScdPackage.LOCAL_FILE:
			return createLocalFile();
		case ScdPackage.PORTS:
			return createPorts();
		case ScdPackage.PORT_TYPE_CONTAINER:
			return createPortTypeContainer();
		case ScdPackage.PROPERTY_FILE:
			return createPropertyFile();
		case ScdPackage.PROVIDES:
			return createProvides();
		case ScdPackage.SCD_DOCUMENT_ROOT:
			return createScdDocumentRoot();
		case ScdPackage.SOFTWARE_COMPONENT:
			return createSoftwareComponent();
		case ScdPackage.SUPPORTS_INTERFACE:
			return createSupportsInterface();
		case ScdPackage.USES:
			return createUses();
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
		case ScdPackage.PORT_TYPE:
			return createPortTypeFromString(eDataType, initialValue);
		case ScdPackage.COMPONENT_TYPE:
			return createComponentTypeFromString(eDataType, initialValue);
		case ScdPackage.PORT_TYPE_OBJECT:
			return createPortTypeObjectFromString(eDataType, initialValue);
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
		case ScdPackage.PORT_TYPE:
			return convertPortTypeToString(eDataType, instanceValue);
		case ScdPackage.COMPONENT_TYPE:
			return convertComponentTypeToString(eDataType, instanceValue);
		case ScdPackage.PORT_TYPE_OBJECT:
			return convertPortTypeObjectToString(eDataType, instanceValue);
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
	public ComponentFeatures createComponentFeatures() {
		ComponentFeaturesImpl componentFeatures = new ComponentFeaturesImpl();
		return componentFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentRepId createComponentRepId() {
		ComponentRepIdImpl componentRepId = new ComponentRepIdImpl();
		return componentRepId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InheritsInterface createInheritsInterface() {
		InheritsInterfaceImpl inheritsInterface = new InheritsInterfaceImpl();
		return inheritsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interfaces createInterfaces() {
		InterfacesImpl interfaces = new InterfacesImpl();
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalFile createLocalFile() {
		LocalFileImpl localFile = new LocalFileImpl();
		return localFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ports createPorts() {
		PortsImpl ports = new PortsImpl();
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortTypeContainer createPortTypeContainer() {
		PortTypeContainerImpl portTypeContainer = new PortTypeContainerImpl();
		return portTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyFile createPropertyFile() {
		PropertyFileImpl propertyFile = new PropertyFileImpl();
		return propertyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provides createProvides() {
		ProvidesImpl provides = new ProvidesImpl();
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScdDocumentRoot createScdDocumentRoot() {
		ScdDocumentRootImpl scdDocumentRoot = new ScdDocumentRootImpl();
		return scdDocumentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareComponent createSoftwareComponent() {
		SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportsInterface createSupportsInterface() {
		SupportsInterfaceImpl supportsInterface = new SupportsInterfaceImpl();
		return supportsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uses createUses() {
		UsesImpl uses = new UsesImpl();
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue) {
		ComponentType result = ComponentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPortTypeFromString(ScdPackage.Literals.PORT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortTypeToString(ScdPackage.Literals.PORT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScdPackage getScdPackage() {
		return (ScdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScdPackage getPackage() {
		return ScdPackage.eINSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PortTypeContainer createPortTypeContainer(final PortType type) {
		// END GENERATED CODE
		final PortTypeContainer container = createPortTypeContainer();
		container.setType(type);
		return container;
		// BEGIN GENERATED CODE
	}

} // ScdFactoryImpl

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
package mil.jpeojtrs.sca.partitioning.util;

import java.util.Map;

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.ComponentFiles;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub;
import mil.jpeojtrs.sca.partitioning.ConnectInterface;
import mil.jpeojtrs.sca.partitioning.ConnectionTarget;
import mil.jpeojtrs.sca.partitioning.Connections;
import mil.jpeojtrs.sca.partitioning.DevComponentFile;
import mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef;
import mil.jpeojtrs.sca.partitioning.DomComponentFile;
import mil.jpeojtrs.sca.partitioning.DomainFinder;
import mil.jpeojtrs.sca.partitioning.DomainFinderType;
import mil.jpeojtrs.sca.partitioning.FindBy;
import mil.jpeojtrs.sca.partitioning.FindByStub;
import mil.jpeojtrs.sca.partitioning.FindByStubContainer;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.partitioning.Partitioning;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.ProvidesPort;
import mil.jpeojtrs.sca.partitioning.ProvidesPortStub;
import mil.jpeojtrs.sca.partitioning.ScaPartitioningActivator;
import mil.jpeojtrs.sca.partitioning.UsesPort;
import mil.jpeojtrs.sca.partitioning.UsesPortStub;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage
 * @generated
 */
public class PartitioningValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PartitioningValidator INSTANCE = new PartitioningValidator();
	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mil.jpeojtrs.sca.partitioning";
	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;
	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitioningValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PartitioningPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PartitioningPackage.COMPONENT_FILE:
				return validateComponentFile((ComponentFile)value, diagnostics, context);
			case PartitioningPackage.DOM_COMPONENT_FILE:
				return validateDomComponentFile((DomComponentFile)value, diagnostics, context);
			case PartitioningPackage.DEV_COMPONENT_FILE:
				return validateDevComponentFile((DevComponentFile)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_FILE_REF:
				return validateComponentFileRef((ComponentFileRef)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_FILES:
				return validateComponentFiles((ComponentFiles)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_INSTANTIATION:
				return validateComponentInstantiation((ComponentInstantiation)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_INSTANTIATION_REF:
				return validateComponentInstantiationRef((ComponentInstantiationRef<?>)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_PLACEMENT:
				return validateComponentPlacement((ComponentPlacement<?>)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_PROPERTIES:
				return validateComponentProperties((ComponentProperties)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE:
				return validateComponentSupportedInterface((ComponentSupportedInterface)value, diagnostics, context);
			case PartitioningPackage.COMPONENT_SUPPORTED_INTERFACE_STUB:
				return validateComponentSupportedInterfaceStub((ComponentSupportedInterfaceStub)value, diagnostics, context);
			case PartitioningPackage.CONNECT_INTERFACE:
				return validateConnectInterface((ConnectInterface<?, ?, ?>)value, diagnostics, context);
			case PartitioningPackage.CONNECTIONS:
				return validateConnections((Connections<?>)value, diagnostics, context);
			case PartitioningPackage.CONNECTION_TARGET:
				return validateConnectionTarget((ConnectionTarget)value, diagnostics, context);
			case PartitioningPackage.DEVICE_THAT_LOADED_THIS_COMPONENT_REF:
				return validateDeviceThatLoadedThisComponentRef((DeviceThatLoadedThisComponentRef)value, diagnostics, context);
			case PartitioningPackage.DEVICE_USED_BY_THIS_COMPONENT_REF:
				return validateDeviceUsedByThisComponentRef((DeviceUsedByThisComponentRef)value, diagnostics, context);
			case PartitioningPackage.DOMAIN_FINDER:
				return validateDomainFinder((DomainFinder)value, diagnostics, context);
			case PartitioningPackage.FIND_BY:
				return validateFindBy((FindBy)value, diagnostics, context);
			case PartitioningPackage.FIND_BY_STUB:
				return validateFindByStub((FindByStub)value, diagnostics, context);
			case PartitioningPackage.FIND_BY_STUB_CONTAINER:
				return validateFindByStubContainer((FindByStubContainer)value, diagnostics, context);
			case PartitioningPackage.LOCAL_FILE:
				return validateLocalFile((LocalFile)value, diagnostics, context);
			case PartitioningPackage.NAMING_SERVICE:
				return validateNamingService((NamingService)value, diagnostics, context);
			case PartitioningPackage.PARTITIONING:
				return validatePartitioning((Partitioning<?>)value, diagnostics, context);
			case PartitioningPackage.PROVIDES_PORT:
				return validateProvidesPort((ProvidesPort<?>)value, diagnostics, context);
			case PartitioningPackage.PROVIDES_PORT_STUB:
				return validateProvidesPortStub((ProvidesPortStub)value, diagnostics, context);
			case PartitioningPackage.USES_PORT:
				return validateUsesPort((UsesPort<?>)value, diagnostics, context);
			case PartitioningPackage.USES_PORT_STUB:
				return validateUsesPortStub((UsesPortStub)value, diagnostics, context);
			case PartitioningPackage.DOMAIN_FINDER_TYPE:
				return validateDomainFinderType((DomainFinderType)value, diagnostics, context);
			case PartitioningPackage.DOMAIN_FINDER_TYPE_OBJECT:
				return validateDomainFinderTypeObject((DomainFinderType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentFile(ComponentFile componentFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomComponentFile(DomComponentFile domComponentFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domComponentFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevComponentFile(DevComponentFile devComponentFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(devComponentFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentFileRef(ComponentFileRef componentFileRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentFileRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentFiles(ComponentFiles componentFiles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentFiles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstantiation(ComponentInstantiation componentInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstantiation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstantiationRef(ComponentInstantiationRef<?> componentInstantiationRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstantiationRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentPlacement(ComponentPlacement<?> componentPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentProperties(ComponentProperties componentProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSupportedInterface(ComponentSupportedInterface componentSupportedInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSupportedInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSupportedInterfaceStub(ComponentSupportedInterfaceStub componentSupportedInterfaceStub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSupportedInterfaceStub, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectInterface(ConnectInterface<?, ?, ?> connectInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectInterface_ValidSourceReference(connectInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectInterface_ValidTargetReference(connectInterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidSourceReference constraint of '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectInterface_ValidSourceReference(ConnectInterface<?, ?, ?> connectInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (connectInterface.getUsesPort() != null && connectInterface.getUsesPort().getComponentInstantiationRef() != null && connectInterface.getSource() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidSourceReference", getObjectLabel(connectInterface, context) },
						 new Object[] { connectInterface },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidTargetReference constraint of '<em>Connect Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectInterface_ValidTargetReference(ConnectInterface<?, ?, ?> connectInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (connectInterface.getProvidesPort() != null && connectInterface.getProvidesPort().getComponentInstantiationRef() != null && connectInterface.getTarget() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidTargetReference", getObjectLabel(connectInterface, context) },
						 new Object[] { connectInterface },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnections(Connections<?> connections, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connections, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionTarget(ConnectionTarget connectionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef deviceThatLoadedThisComponentRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceThatLoadedThisComponentRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef deviceUsedByThisComponentRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUsedByThisComponentRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainFinder(DomainFinder domainFinder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainFinder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindBy(FindBy findBy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findBy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindByStub(FindByStub findByStub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(findByStub, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(findByStub, diagnostics, context);
		if (result || diagnostics != null) result &= validateFindByStub_ValidFindByStub(findByStub, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidFindByStub constraint of '<em>Find By Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFindByStub_ValidFindByStub(FindByStub findByStub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if ((findByStub.getDomainFinder() == null && findByStub.getNamingService() == null) || (findByStub.getDomainFinder() != null && findByStub.getNamingService() != null)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ValidFindByStub", getObjectLabel(findByStub, context) },
						 new Object[] { findByStub },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindByStubContainer(FindByStubContainer findByStubContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findByStubContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFile(LocalFile localFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingService(NamingService namingService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartitioning(Partitioning<?> partitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partitioning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidesPort(ProvidesPort<?> providesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(providesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidesPortStub(ProvidesPortStub providesPortStub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(providesPortStub, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsesPort(UsesPort<?> usesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsesPortStub(UsesPortStub usesPortStub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usesPortStub, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainFinderType(DomainFinderType domainFinderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainFinderTypeObject(DomainFinderType domainFinderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScaPartitioningActivator.INSTANCE;
	}

} //PartitioningValidator

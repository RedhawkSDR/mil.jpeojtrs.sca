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
package mil.jpeojtrs.sca.dcd.util;

import java.util.Map;

import mil.jpeojtrs.sca.dcd.*;

import mil.jpeojtrs.sca.partitioning.util.PartitioningValidator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.dcd.DcdPackage
 * @generated
 * @since 3.2
 */
public class DcdValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DcdValidator INSTANCE = new DcdValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mil.jpeojtrs.sca.dcd";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Children' of 'Domain Manager'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOMAIN_MANAGER__HAS_CHILDREN = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitioningValidator partitioningValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdValidator() {
		super();
		partitioningValidator = PartitioningValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return DcdPackage.eINSTANCE;
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
		case DcdPackage.DCD_COMPONENT_PLACEMENT:
			return validateDcdComponentPlacement((DcdComponentPlacement) value, diagnostics, context);
		case DcdPackage.DCD_COMPONENT_INSTANTIATION:
			return validateDcdComponentInstantiation((DcdComponentInstantiation) value, diagnostics, context);
		case DcdPackage.DCD_PARTITIONING:
			return validateDcdPartitioning((DcdPartitioning) value, diagnostics, context);
		case DcdPackage.DCD_COMPONENT_INSTANTIATION_REF:
			return validateDcdComponentInstantiationRef((DcdComponentInstantiationRef) value, diagnostics, context);
		case DcdPackage.DCD_CONNECT_INTERFACE:
			return validateDcdConnectInterface((DcdConnectInterface) value, diagnostics, context);
		case DcdPackage.DCD_USES_PORT:
			return validateDcdUsesPort((DcdUsesPort) value, diagnostics, context);
		case DcdPackage.DCD_PROVIDES_PORT:
			return validateDcdProvidesPort((DcdProvidesPort) value, diagnostics, context);
		case DcdPackage.DCD_CONNECTIONS:
			return validateDcdConnections((DcdConnections) value, diagnostics, context);
		case DcdPackage.COMPOSITE_PART_OF_DEVICE:
			return validateCompositePartOfDevice((CompositePartOfDevice) value, diagnostics, context);
		case DcdPackage.DCD_DOCUMENT_ROOT:
			return validateDcdDocumentRoot((DcdDocumentRoot) value, diagnostics, context);
		case DcdPackage.DEPLOY_ON_DEVICE:
			return validateDeployOnDevice((DeployOnDevice) value, diagnostics, context);
		case DcdPackage.DEVICE_CONFIGURATION:
			return validateDeviceConfiguration((DeviceConfiguration) value, diagnostics, context);
		case DcdPackage.DEVICE_MANAGER_SOFT_PKG:
			return validateDeviceManagerSoftPkg((DeviceManagerSoftPkg) value, diagnostics, context);
		case DcdPackage.DEVICE_PKG_FILE:
			return validateDevicePkgFile((DevicePkgFile) value, diagnostics, context);
		case DcdPackage.DOMAIN_MANAGER:
			return validateDomainManager((DomainManager) value, diagnostics, context);
		case DcdPackage.FILE_SYSTEM_NAME:
			return validateFileSystemName((FileSystemName) value, diagnostics, context);
		case DcdPackage.FILE_SYSTEM_NAMES:
			return validateFileSystemNames((FileSystemNames) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdComponentPlacement(DcdComponentPlacement dcdComponentPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdComponentPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdComponentInstantiation(DcdComponentInstantiation dcdComponentInstantiation, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdComponentInstantiation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdPartitioning(DcdPartitioning dcdPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdPartitioning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdComponentInstantiationRef(DcdComponentInstantiationRef dcdComponentInstantiationRef, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdComponentInstantiationRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdConnectInterface(DcdConnectInterface dcdConnectInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dcdConnectInterface, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= partitioningValidator.validateConnectInterface_ValidSourceReference(dcdConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= partitioningValidator.validateConnectInterface_ValidTargetReference(dcdConnectInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdUsesPort(DcdUsesPort dcdUsesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdUsesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdProvidesPort(DcdProvidesPort dcdProvidesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdProvidesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdConnections(DcdConnections dcdConnections, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dcdConnections, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositePartOfDevice(CompositePartOfDevice compositePartOfDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositePartOfDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDcdDocumentRoot(DcdDocumentRoot dcdDocumentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		System.out.println("validateDcdDocumentRoot");
		return validate_EveryDefaultConstraint(dcdDocumentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployOnDevice(DeployOnDevice deployOnDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deployOnDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceConfiguration(DeviceConfiguration deviceConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceManagerSoftPkg(DeviceManagerSoftPkg deviceManagerSoftPkg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceManagerSoftPkg, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevicePkgFile(DevicePkgFile devicePkgFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(devicePkgFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainManager(DomainManager domainManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainManager, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(domainManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(domainManager, diagnostics, context);
		
		boolean hasChildren = validateDomainManagerHasChildren(domainManager, diagnostics, context);
		
		return result && hasChildren;
	}
	
	

	private boolean validateDomainManagerHasChildren(DomainManager domainManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (domainManager.getNamingService() == null && domainManager.getStringifiedObjectRef() == null) {
			diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, -1, "_UI_InvalidDomainManagerChildren_diagnostic",
				new Object[] { domainManager }, new Object[] { domainManager }, context));
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSystemName(FileSystemName fileSystemName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSystemName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSystemNames(FileSystemNames fileSystemNames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSystemNames, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DcdPluginActivator.INSTANCE;
	}

} //DcdValidator

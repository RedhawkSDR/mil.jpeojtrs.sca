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
package mil.jpeojtrs.sca.sad.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import mil.jpeojtrs.sca.partitioning.util.PartitioningValidator;
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
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.sad.SadPartitioning;
import mil.jpeojtrs.sca.sad.SadPluginActivator;
import mil.jpeojtrs.sca.sad.SadProvidesPort;
import mil.jpeojtrs.sca.sad.SadUsesPort;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.UsesDeviceDependencies;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.SadPackage
 * @generated
 */
public class SadValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SadValidator INSTANCE = new SadValidator();
	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mil.jpeojtrs.sca.sad";
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
	public SadValidator() {
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
		return SadPackage.eINSTANCE;
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
		case SadPackage.ASSEMBLY_CONTROLLER:
			return validateAssemblyController((AssemblyController) value, diagnostics, context);
		case SadPackage.SAD_COMPONENT_INSTANTIATION:
			return validateSadComponentInstantiation((SadComponentInstantiation) value, diagnostics, context);
		case SadPackage.SAD_COMPONENT_INSTANTIATION_REF:
			return validateSadComponentInstantiationRef((SadComponentInstantiationRef) value, diagnostics, context);
		case SadPackage.SAD_USES_PORT:
			return validateSadUsesPort((SadUsesPort) value, diagnostics, context);
		case SadPackage.SAD_PROVIDES_PORT:
			return validateSadProvidesPort((SadProvidesPort) value, diagnostics, context);
		case SadPackage.SAD_CONNECT_INTERFACE:
			return validateSadConnectInterface((SadConnectInterface) value, diagnostics, context);
		case SadPackage.SAD_CONNECTIONS:
			return validateSadConnections((SadConnections) value, diagnostics, context);
		case SadPackage.COMPONENT_RESOURCE_FACTORY_REF:
			return validateComponentResourceFactoryRef((ComponentResourceFactoryRef) value, diagnostics, context);
		case SadPackage.EXTERNAL_PORTS:
			return validateExternalPorts((ExternalPorts) value, diagnostics, context);
		case SadPackage.EXTERNAL_PROPERTIES:
			return validateExternalProperties((ExternalProperties) value, diagnostics, context);
		case SadPackage.EXTERNAL_PROPERTY:
			return validateExternalProperty((ExternalProperty) value, diagnostics, context);
		case SadPackage.FIND_COMPONENT:
			return validateFindComponent((FindComponent) value, diagnostics, context);
		case SadPackage.HOST_COLLOCATION:
			return validateHostCollocation((HostCollocation) value, diagnostics, context);
		case SadPackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case SadPackage.SAD_PARTITIONING:
			return validateSadPartitioning((SadPartitioning) value, diagnostics, context);
		case SadPackage.SAD_COMPONENT_PLACEMENT:
			return validateSadComponentPlacement((SadComponentPlacement) value, diagnostics, context);
		case SadPackage.RESOURCE_FACTORY_PROPERTIES:
			return validateResourceFactoryProperties((ResourceFactoryProperties) value, diagnostics, context);
		case SadPackage.SAD_DOCUMENT_ROOT:
			return validateSadDocumentRoot((SadDocumentRoot) value, diagnostics, context);
		case SadPackage.SOFTWARE_ASSEMBLY:
			return validateSoftwareAssembly((SoftwareAssembly) value, diagnostics, context);
		case SadPackage.USES_DEVICE_DEPENDENCIES:
			return validateUsesDeviceDependencies((UsesDeviceDependencies) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyController(AssemblyController assemblyController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assemblyController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadComponentInstantiation(SadComponentInstantiation sadComponentInstantiation, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadComponentInstantiation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadComponentInstantiationRef(SadComponentInstantiationRef sadComponentInstantiationRef, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadComponentInstantiationRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadUsesPort(SadUsesPort sadUsesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadUsesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadProvidesPort(SadProvidesPort sadProvidesPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadProvidesPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadConnectInterface(SadConnectInterface sadConnectInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sadConnectInterface, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= partitioningValidator.validateConnectInterface_ValidSourceReference(sadConnectInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= partitioningValidator.validateConnectInterface_ValidTargetReference(sadConnectInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadConnections(SadConnections sadConnections, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadConnections, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentResourceFactoryRef(ComponentResourceFactoryRef componentResourceFactoryRef, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentResourceFactoryRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateExternalPorts(ExternalPorts externalPorts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		Map<String, Port> externalPortMap = new HashMap<String, Port>();
		boolean result = true;

		for (Port port : externalPorts.getPort()) {
			// Find external port name
			String externalName = port.getExternalName();
			if (externalName == null) {
				externalName = port.getProvidesIdentifier();
			}
			if (externalName == null) {
				externalName = port.getUsesIdentifier();
			}

			// Check for duplicate names. If found, add an EMF.ERROR diagnostic
			if (externalPortMap.containsKey(externalName)) {
				result = false;

				Port duplicatePort = externalPortMap.get(externalName);
				Object[] messageSubstitutions = new Object[] { port.getComponentInstantiationRef().getRefid(),
					duplicatePort.getComponentInstantiationRef().getRefid(), externalName };
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, -1, "_UI_DuplicateExternalPortName_diagnostic", messageSubstitutions,
						new Object[] { port, duplicatePort }, context));
				} else {
					break;
				}
			} else {
				externalPortMap.put(externalName, port);
			}
		}

		if (result || diagnostics != null) {
			result &= validate_EveryDefaultConstraint(externalPorts, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalProperties(ExternalProperties externalProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateExternalProperty(ExternalProperty externalProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		boolean result = validate_EveryDefaultConstraint(externalProperty, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validateExternalPropertyRefId(externalProperty, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	private boolean validateExternalPropertyRefId(ExternalProperty externalProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		String compRefId = externalProperty.getCompRefID();

		SoftwareAssembly sad = ScaEcoreUtils.getEContainerOfType(externalProperty, SoftwareAssembly.class);
		for (SadComponentInstantiation comp : sad.getAllComponentInstantiations()) {
			if (compRefId.equals(comp.getId())) {
				return true;
			}
		}

		diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, -1, "_UI_UnkownCompRefId_diagnostic",
			new Object[] { externalProperty.getExternalPropID() }, new Object[] { externalProperty }, context));
		return false;
	}

	// BEGIN GENERATED CODE

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFindComponent(FindComponent findComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(findComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHostCollocation(HostCollocation hostCollocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hostCollocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePort_NonEmptyPort(port, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NonEmptyPort constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePort_NonEmptyPort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		if (port.getComponentInstantiationRef() == null && port.getProvidesIdentifier() == null && port.getSupportedIdentifier() == null
			&& port.getUsesIdentifier() == null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
					new Object[] { "NonEmptyPort", getObjectLabel(port, context) }, new Object[] { port }, context));
			}
			return false;
		}
		return true;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadPartitioning(SadPartitioning sadPartitioning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadPartitioning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadComponentPlacement(SadComponentPlacement sadComponentPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadComponentPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceFactoryProperties(ResourceFactoryProperties resourceFactoryProperties, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceFactoryProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSadDocumentRoot(SadDocumentRoot sadDocumentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sadDocumentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareAssembly(SoftwareAssembly softwareAssembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareAssembly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsesDeviceDependencies(UsesDeviceDependencies usesDeviceDependencies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usesDeviceDependencies, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SadPluginActivator.INSTANCE;
	}

} // SadValidator

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
package mil.jpeojtrs.sca.prf.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.omg.CORBA.Any;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.ActionType;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.Enumeration;
import mil.jpeojtrs.sca.prf.Enumerations;
import mil.jpeojtrs.sca.prf.InputValue;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfDocumentRoot;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyContainer;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.prf.PropertyRefGroup;
import mil.jpeojtrs.sca.prf.PropertyRefSet;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Range;
import mil.jpeojtrs.sca.prf.ResultValue;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.prf.StructValue;
import mil.jpeojtrs.sca.prf.Test;
import mil.jpeojtrs.sca.prf.Values;
import mil.jpeojtrs.sca.util.math.ComplexBoolean;
import mil.jpeojtrs.sca.util.math.ComplexByte;
import mil.jpeojtrs.sca.util.math.ComplexDouble;
import mil.jpeojtrs.sca.util.math.ComplexFloat;
import mil.jpeojtrs.sca.util.math.ComplexLong;
import mil.jpeojtrs.sca.util.math.ComplexLongLong;
import mil.jpeojtrs.sca.util.math.ComplexOctet;
import mil.jpeojtrs.sca.util.math.ComplexShort;
import mil.jpeojtrs.sca.util.math.ComplexUByte;
import mil.jpeojtrs.sca.util.math.ComplexULong;
import mil.jpeojtrs.sca.util.math.ComplexULongLong;
import mil.jpeojtrs.sca.util.math.ComplexUShort;
import mil.jpeojtrs.sca.util.time.UTCTime;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.prf.PrfPackage
 * @generated
 */
public class PrfValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PrfValidator INSTANCE = new PrfValidator();
	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mil.jpeojtrs.sca.prf";
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

	// END GENERATED CODE

	/**
	 * Provides constants for a code (usually matches the IDE ticket number) and the UI string (contained in
	 * plugin.properties).
	 */
	private enum Codes {
		INCOMATIBLE_PROP_REF(301304, "_UI_IncompatiblePropertyRef_diagnostic"), //$NON-NLS-1$
		KIND_IS_IGNORED(1344, "_UI_RedundantKind_diagnostic"), //$NON-NLS-1$
		MESSAGE_NOT_A_STRUCT(1675, "_UI_UnsupportMessageKindType_diagnostic"), //$NON-NLS-1$
		OPTIONAL_NOT_IN_STRUCT(1215, "_UI_InvalidOptionalAttribute_diagnostic"),  //$NON-NLS-1$
		PARTIAL_CONFIG_STRUCT(1304, "_UI_PartiallyConfiguredStruct_diagnostic"), //$NON-NLS-1$
		PARTIAL_CONFIG_STRUCT_SEQ(101304, "_UI_PartiallyConfiguredStruct_Contained_diagnostic"), //$NON-NLS-1$
		PARTIAL_CONFIG_STRUCT_VALUE(201304, "_UI_PartiallyConfiguredStructValue_diagnostic"); //$NON-NLS-1$

		private int code;
		private String messageKey;

		private Codes(int code, String messageKey) {
			this.code = code;
			this.messageKey = messageKey;
		}
	}

	// BEGIN GENERATED CODE

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrfValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PrfPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("deprecation")
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case PrfPackage.ABSTRACT_PROPERTY:
			return validateAbstractProperty((AbstractProperty) value, diagnostics, context);
		case PrfPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case PrfPackage.CONFIGURATION_KIND:
			return validateConfigurationKind((ConfigurationKind) value, diagnostics, context);
		case PrfPackage.ENUMERATION:
			return validateEnumeration((Enumeration) value, diagnostics, context);
		case PrfPackage.ENUMERATIONS:
			return validateEnumerations((Enumerations) value, diagnostics, context);
		case PrfPackage.INPUT_VALUE:
			return validateInputValue((InputValue) value, diagnostics, context);
		case PrfPackage.KIND:
			return validateKind((Kind) value, diagnostics, context);
		case PrfPackage.PRF_DOCUMENT_ROOT:
			return validatePrfDocumentRoot((PrfDocumentRoot) value, diagnostics, context);
		case PrfPackage.PROPERTIES:
			return validateProperties((Properties) value, diagnostics, context);
		case PrfPackage.RANGE:
			return validateRange((Range) value, diagnostics, context);
		case PrfPackage.RESULT_VALUE:
			return validateResultValue((ResultValue) value, diagnostics, context);
		case PrfPackage.SIMPLE:
			return validateSimple((Simple) value, diagnostics, context);
		case PrfPackage.SIMPLE_SEQUENCE:
			return validateSimpleSequence((SimpleSequence) value, diagnostics, context);
		case PrfPackage.STRUCT:
			return validateStruct((Struct) value, diagnostics, context);
		case PrfPackage.STRUCT_SEQUENCE:
			return validateStructSequence((StructSequence) value, diagnostics, context);
		case PrfPackage.STRUCT_VALUE:
			return validateStructValue((StructValue) value, diagnostics, context);
		case PrfPackage.TEST:
			return validateTest((Test) value, diagnostics, context);
		case PrfPackage.VALUES:
			return validateValues((Values) value, diagnostics, context);
		case PrfPackage.PROPERTY_CONTAINER:
			return validatePropertyContainer((PropertyContainer) value, diagnostics, context);
		case PrfPackage.ABSTRACT_PROPERTY_REF:
			return validateAbstractPropertyRef((AbstractPropertyRef< ? >) value, diagnostics, context);
		case PrfPackage.PROPERTY_REF_CONTAINER:
			return validatePropertyRefContainer((PropertyRefContainer) value, diagnostics, context);
		case PrfPackage.PROPERTY_REF_GROUP:
			return validatePropertyRefGroup((PropertyRefGroup) value, diagnostics, context);
		case PrfPackage.PROPERTY_REF_SET:
			return validatePropertyRefSet((PropertyRefSet) value, diagnostics, context);
		case PrfPackage.SIMPLE_REF:
			return validateSimpleRef((SimpleRef) value, diagnostics, context);
		case PrfPackage.SIMPLE_SEQUENCE_REF:
			return validateSimpleSequenceRef((SimpleSequenceRef) value, diagnostics, context);
		case PrfPackage.STRUCT_REF:
			return validateStructRef((StructRef) value, diagnostics, context);
		case PrfPackage.STRUCT_SEQUENCE_REF:
			return validateStructSequenceRef((StructSequenceRef) value, diagnostics, context);
		case PrfPackage.ACCESS_TYPE:
			return validateAccessType((AccessType) value, diagnostics, context);
		case PrfPackage.ACTION_TYPE:
			return validateActionType((ActionType) value, diagnostics, context);
		case PrfPackage.PROPERTY_CONFIGURATION_TYPE:
			return validatePropertyConfigurationType((PropertyConfigurationType) value, diagnostics, context);
		case PrfPackage.PROPERTY_VALUE_TYPE:
			return validatePropertyValueType((PropertyValueType) value, diagnostics, context);
		case PrfPackage.STRUCT_PROPERTY_CONFIGURATION_TYPE:
			return validateStructPropertyConfigurationType((StructPropertyConfigurationType) value, diagnostics, context);
		case PrfPackage.ACCESS_TYPE_OBJECT:
			return validateAccessTypeObject((AccessType) value, diagnostics, context);
		case PrfPackage.ACTION_TYPE_OBJECT:
			return validateActionTypeObject((ActionType) value, diagnostics, context);
		case PrfPackage.CHARACTER_OBJECT:
			return validateCharacterObject((Character) value, diagnostics, context);
		case PrfPackage.DCE_UUID:
			return validateDceUUID((String) value, diagnostics, context);
		case PrfPackage.PROPERTY_CONFIGURATION_TYPE_OBJECT:
			return validatePropertyConfigurationTypeObject((PropertyConfigurationType) value, diagnostics, context);
		case PrfPackage.PROPERTY_VALUE_TYPE_OBJECT:
			return validatePropertyValueTypeObject((PropertyValueType) value, diagnostics, context);
		case PrfPackage.STRUCT_PROPERTY_CONFIGURATION_TYPE_OBJECT:
			return validateStructPropertyConfigurationTypeObject((StructPropertyConfigurationType) value, diagnostics, context);
		case PrfPackage.UNIT:
			return validateUnit((String) value, diagnostics, context);
		case PrfPackage.ANY:
			return validateAny((Any) value, diagnostics, context);
		case PrfPackage.COMPLEX_BOOLEAN:
			return validateComplexBoolean((ComplexBoolean) value, diagnostics, context);
		case PrfPackage.COMPLEX_BYTE:
			return validateComplexByte((ComplexByte) value, diagnostics, context);
		case PrfPackage.COMPLEX_DOUBLE:
			return validateComplexDouble((ComplexDouble) value, diagnostics, context);
		case PrfPackage.COMPLEX_FLOAT:
			return validateComplexFloat((ComplexFloat) value, diagnostics, context);
		case PrfPackage.COMPLEX_LONG:
			return validateComplexLong((ComplexLong) value, diagnostics, context);
		case PrfPackage.COMPLEX_LONG_LONG:
			return validateComplexLongLong((ComplexLongLong) value, diagnostics, context);
		case PrfPackage.COMPLEX_OCTET:
			return validateComplexOctet((ComplexOctet) value, diagnostics, context);
		case PrfPackage.COMPLEX_SHORT:
			return validateComplexShort((ComplexShort) value, diagnostics, context);
		case PrfPackage.COMPLEX_UBYTE:
			return validateComplexUByte((ComplexUByte) value, diagnostics, context);
		case PrfPackage.COMPLEX_ULONG:
			return validateComplexULong((ComplexULong) value, diagnostics, context);
		case PrfPackage.COMPLEX_ULONG_LONG:
			return validateComplexULongLong((ComplexULongLong) value, diagnostics, context);
		case PrfPackage.COMPLEX_USHORT:
			return validateComplexUShort((ComplexUShort) value, diagnostics, context);
		case PrfPackage.UTC_TIME:
			return validateUTCTime((UTCTime) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractProperty(AbstractProperty abstractProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationKind(ConfigurationKind configurationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerations(Enumerations enumerations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputValue(InputValue inputValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrfDocumentRoot(PrfDocumentRoot prfDocumentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prfDocumentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperties(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(properties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultValue(ResultValue resultValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSimple(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		// This block is just warnings, and therefore only applies if diagnostics were requested
		if (diagnostics != null) {
			if (simple.eContainer() instanceof Properties) {
				if (simple.isOptional()) {
					Codes code = Codes.OPTIONAL_NOT_IN_STRUCT;
					diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { getObjectLabel(simple, context), }, new Object[] { simple }, context));
				}
			} else if (simple.getKind() != null && !simple.getKind().isEmpty()) {
				Codes code = Codes.KIND_IS_IGNORED;
				diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
					new Object[] { getObjectLabel(simple, context), }, new Object[] { simple }, context));
			}

			for (Kind kind : simple.getKind()) {
				if (PropertyConfigurationType.MESSAGE.getLiteral().equals(kind.getType().getLiteral())) {
					Codes code = Codes.MESSAGE_NOT_A_STRUCT;
					diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { getObjectLabel(simple, context), }, new Object[] { simple }, context));
				}
			}
		}

		return validate_EveryDefaultConstraint(simple, diagnostics, context);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSimpleSequence(SimpleSequence simpleSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		// This block is just warnings, and therefore only applies if diagnostics were requested
		if (diagnostics != null) {
			if (simpleSequence.eContainer() instanceof Properties) {
				if (simpleSequence.isOptional()) {
					Codes code = Codes.OPTIONAL_NOT_IN_STRUCT;
					diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { getObjectLabel(simpleSequence, context), }, new Object[] { simpleSequence }, context));
				}
			} else if (simpleSequence.getKind() != null && !simpleSequence.getKind().isEmpty()) {
				Codes code = Codes.KIND_IS_IGNORED;
				diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
					new Object[] { getObjectLabel(simpleSequence, context), }, new Object[] { simpleSequence }, context));
			}

			for (Kind kind : simpleSequence.getKind()) {
				if (PropertyConfigurationType.MESSAGE.getLiteral().equals(kind.getType().getLiteral())) {
					Codes code = Codes.MESSAGE_NOT_A_STRUCT;
					diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { getObjectLabel(simpleSequence, context), }, new Object[] { simpleSequence }, context));
				}
			}
		}

		return validate_EveryDefaultConstraint(simpleSequence, diagnostics, context);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * Added extra validation to ensure structs cannot have partially configured properties
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStruct(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		// This block is just warnings, and therefore only applies if diagnostics were requested
		if (diagnostics != null) {
			if (struct.eContainer() instanceof StructSequence) {
				if (struct.getConfigurationKind() != null && !struct.getConfigurationKind().isEmpty()) {
					Codes code = Codes.KIND_IS_IGNORED;
					diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { getObjectLabel(struct, context), }, new Object[] { struct }, context));
				}
			}
		}

		boolean result = validate_EveryDefaultConstraint(struct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validateStructConfiguration(struct, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	/**
	 * Custom validation method.<br/>
	 * The framework does not allow partial configuration of {@link Simple} properties in structures unless they are
	 * marked as optional elements. Severity depends on kindtype value.
	 * @since 6.1
	 */
	public boolean validateStructConfiguration(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValidStruct = true;

		// Validation results in a WARNING in a StructSequence and an ERROR in a Struct
		int severity = Diagnostic.WARNING;
		if (struct.isKind(PropertyConfigurationType.PROPERTY) && !(struct.eContainer() instanceof StructSequence)) {
			severity = Diagnostic.ERROR;
		}

		// Build validation message
		List<String> data = new ArrayList<String>();
		data.add(struct.getId());
		Codes code = Codes.PARTIAL_CONFIG_STRUCT;
		if (struct.eContainer() instanceof StructSequence) {
			data.add(((StructSequence) struct.eContainer()).getId());
			code = Codes.PARTIAL_CONFIG_STRUCT_SEQ;
		}

		// Check the first field to see if a default is set. This is the baseline for future comparisons.
		boolean baselineConfigState = getDefaultState(struct);

		// Check to see if only some simple properties have defaults
		for (Simple simple : struct.getSimple()) {
			if (simple.isOptional()) {
				continue;
			}

			// Check is simple has a default value
			boolean simpleConfigState = (simple.getValue() != null);

			// Compare result to the baseline.
			if (baselineConfigState != simpleConfigState) {
				isValidStruct = false;
				diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey, data.toArray(new Object[0]), new Object[] { struct }, context));

				break;
			}
		}

		return isValidStruct;
	}

	/**
	 * @return True if non-optional properties MUST have a default value, or False if they must NOT have a default
	 * value.
	 */
	private boolean getDefaultState(Struct struct) {
		if (!struct.getSimple().isEmpty()) {
			for (Simple simple : struct.getSimple()) {
				// Ignore optional elements
				if (!simple.isOptional()) {
					return simple.getValue() != null;
				}
			}
		} else if (!struct.getSimpleSequence().isEmpty()) {
			for (SimpleSequence simpleSeq : struct.getSimpleSequence()) {
				// Ignore optional elements
				if (!simpleSeq.isOptional()) {
					return simpleSeq.getValues() != null;
				}
			}
		}

		return false;
	}

	// BEGIN GENERATED CODE

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStructSequence(StructSequence structSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		// This block is just warnings, and therefore only applies if diagnostics were requested
		if (diagnostics != null) {
			for (ConfigurationKind kind : structSequence.getConfigurationKind()) {
				if (PropertyConfigurationType.MESSAGE.getLiteral().equals(kind.getType().getLiteral())) {
					Codes code = Codes.MESSAGE_NOT_A_STRUCT;
					diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { getObjectLabel(structSequence, context), }, new Object[] { structSequence }, context));
				}
			}
		}

		return validate_EveryDefaultConstraint(structSequence, diagnostics, context);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * Check for partially configured StructValues
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStructValue(StructValue structValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		boolean result = validate_EveryDefaultConstraint(structValue, diagnostics, context);
		if (!result && diagnostics == null) {
			return result;
		}

		// We can't do any validation if we can't find a parent/corresponding struct & struct sequence
		Struct struct = structValue.getStruct();
		if (struct == null) {
			return true;
		}
		StructSequence structSequence = (StructSequence) struct.eContainer();
		if (structSequence == null) {
			return true;
		}

		// A partially configured structvalue is only an error with the new 'property' kind
		String structValueId = structSequence.getId() + "[" + structValue.getIndex() + "]";
		int severity = Diagnostic.WARNING;
		if (structSequence.isKind(PropertyConfigurationType.PROPERTY)) {
			severity = Diagnostic.ERROR;
		}

		// We only report the first missing simple that makes the struct partially configured
		for (Simple simple : struct.getSimple()) {
			AbstractPropertyRef< ? > ref = structValue.getRef(simple.getId());

			if (ref == null) {
				if (diagnostics != null) {
					Codes code = Codes.PARTIAL_CONFIG_STRUCT_VALUE;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey, new Object[] { structValueId },
						new Object[] { structValue }, context));
				}
				return false;
			}

			if (!(ref instanceof SimpleRef)) {
				if (diagnostics != null) {
					Codes code = Codes.INCOMATIBLE_PROP_REF;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { ref.getRefID(), structValueId, simple.getId(), struct.getId() }, new Object[] { structValue }, context));
				}
				return false;
			}

			if (((SimpleRef) ref).getValue() == null) {
				if (diagnostics != null) {
					Codes code = Codes.PARTIAL_CONFIG_STRUCT_VALUE;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey, new Object[] { structValueId },
						new Object[] { structValue }, context));
				}
				return false;
			}
		}

		// We only report the first missing simple sequence that makes the struct partially configured
		for (SimpleSequence simpleSequence : struct.getSimpleSequence()) {
			AbstractPropertyRef< ? > ref = structValue.getRef(simpleSequence.getId());

			if (ref == null) {
				if (diagnostics != null) {
					Codes code = Codes.PARTIAL_CONFIG_STRUCT_VALUE;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey, new Object[] { structValueId },
						new Object[] { structValue }, context));
				}
				return false;
			}

			if (!(ref instanceof SimpleSequenceRef)) {
				if (diagnostics != null) {
					Codes code = Codes.INCOMATIBLE_PROP_REF;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey,
						new Object[] { ref.getRefID(), structValueId, simpleSequence.getId(), struct.getId() }, new Object[] { structValue }, context));
				}
				return false;
			}

			if (((SimpleSequenceRef) ref).getValues() == null) {
				if (diagnostics != null) {
					Codes code = Codes.PARTIAL_CONFIG_STRUCT_VALUE;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, code.code, code.messageKey, new Object[] { structValueId },
						new Object[] { structValue }, context));
				}
				return false;
			}
		}

		return true;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(test, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValues(Values values, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(values, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyContainer(PropertyContainer propertyContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPropertyRef(AbstractPropertyRef< ? > abstractPropertyRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractPropertyRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRefContainer(PropertyRefContainer propertyRefContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRefContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRefGroup(PropertyRefGroup propertyRefGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRefGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRefSet(PropertyRefSet propertyRefSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRefSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSimpleRef(SimpleRef simpleRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		boolean result = validate_ValidPropertyRefId(simpleRef, diagnostics, context, Simple.class);
		if (result || diagnostics != null) {
			result &= validate_EveryDefaultConstraint(simpleRef, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSimpleSequenceRef(SimpleSequenceRef simpleSequenceRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		boolean result = validate_ValidPropertyRefId(simpleSequenceRef, diagnostics, context, SimpleSequence.class);
		if (result || diagnostics != null) {
			result &= validate_EveryDefaultConstraint(simpleSequenceRef, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStructRef(StructRef structRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		boolean result = validate_ValidPropertyRefId(structRef, diagnostics, context, Struct.class);
		if (result || diagnostics != null) {
			result &= validate_EveryDefaultConstraint(structRef, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStructSequenceRef(StructSequenceRef structSequenceRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		boolean result = validate_ValidPropertyRefId(structSequenceRef, diagnostics, context, StructSequence.class);
		if (result || diagnostics != null) {
			result &= validate_EveryDefaultConstraint(structSequenceRef, diagnostics, context);
		}
		return result;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyConfigurationType(PropertyConfigurationType propertyConfigurationType, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValueType(PropertyValueType propertyValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructPropertyConfigurationType(StructPropertyConfigurationType structPropertyConfigurationType, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionTypeObject(ActionType actionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterObject(Character characterObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDceUUID(String dceUUID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDceUUID_Pattern(dceUUID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDceUUID_Pattern
	 */
	public static final PatternMatcher[][] DCE_UUID__PATTERN__VALUES = new PatternMatcher[][] { new PatternMatcher[] {
		XMLTypeUtil.createPatternMatcher("DCE:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}(:\\d+(.\\d+)?)?") } };

	/**
	 * Validates the Pattern constraint of '<em>Dce UUID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDceUUID_Pattern(String dceUUID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PrfPackage.Literals.DCE_UUID, dceUUID, DCE_UUID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyConfigurationTypeObject(PropertyConfigurationType propertyConfigurationTypeObject, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValueTypeObject(PropertyValueType propertyValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructPropertyConfigurationTypeObject(StructPropertyConfigurationType structPropertyConfigurationTypeObject,
		DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(String unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAny(Any any, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexBoolean(ComplexBoolean complexBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("deprecation")
	public boolean validateComplexByte(ComplexByte complexByte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexDouble(ComplexDouble complexDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexFloat(ComplexFloat complexFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexLong(ComplexLong complexLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexLongLong(ComplexLongLong complexLongLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 7.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexOctet(ComplexOctet complexOctet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexShort(ComplexShort complexShort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexUByte(ComplexUByte complexUByte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexULong(ComplexULong complexULong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexULongLong(ComplexULongLong complexULongLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexUShort(ComplexUShort complexUShort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 7.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUTCTime(UTCTime utcTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// END GENERATED CODE
		double tfsec = utcTime.getFractionalSeconds();
		if (tfsec < 0.0 || tfsec >= 1.0) {
			if (diagnostics != null) {
				diagnostics.add(
					createDiagnostic(IStatus.ERROR, DIAGNOSTIC_SOURCE, -1, "_UI_InvalidFractionalSeconds_diagnostic", null, new Object[] { utcTime }, context));
			}
			return false;
		} else {
			return true;
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// END GENERATED CODE
		return PrfPlugin.INSTANCE;
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	/**
	 * Determines if the property reference actually references a property (refid in SAD/DCD should match id in PRF)
	 * @param propRef
	 * @param diagnostics
	 * @param context
	 * @param propType
	 * @return
	 */
	private boolean validate_ValidPropertyRefId(AbstractPropertyRef< ? > propRef, DiagnosticChain diagnostics, Map<Object, Object> context,
		Class< ? > propType) {
		// If we can find a corresponding property, everything is fine
		if (propRef.getProperty() != null) {
			if (!propType.isInstance(propRef.getProperty())) {
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(IStatus.ERROR, DIAGNOSTIC_SOURCE, -1, "_UI_InvalidPropertyType_diagnostic",
						new Object[] { propRef.getRefID() }, new Object[] { propRef }, context));
				}
				return false;
			}

			return true;
		}

		// We only want to validate things that belong to a "componentProperties" element (refs can come from uses
		// devices, etc). If it's not from a "componentProperties", say its okay.
		boolean isComponentProperties = false;
		for (EObject container = propRef.eContainer(); container != null; container = container.eContainer()) {
			EStructuralFeature containerFeature = container.eContainingFeature();
			if (containerFeature != null && "componentProperties".equals(containerFeature.getName())) {
				isComponentProperties = true;
				break;
			}
		}
		if (!isComponentProperties) {
			return true;
		}

		if (diagnostics != null) {
			diagnostics.add(createDiagnostic(IStatus.ERROR, DIAGNOSTIC_SOURCE, -1, "_UI_InvalidPropertyRefId_diagnostic",
				new Object[] { propRef.getRefID() }, new Object[] { propRef }, context));
		}
		return false;
	}

	// BEGIN GENERATED CODE

} // PrfValidator

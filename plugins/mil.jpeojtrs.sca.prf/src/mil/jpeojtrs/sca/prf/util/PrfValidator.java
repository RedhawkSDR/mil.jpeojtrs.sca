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

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
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
import mil.jpeojtrs.sca.util.math.ComplexShort;
import mil.jpeojtrs.sca.util.math.ComplexUByte;
import mil.jpeojtrs.sca.util.math.ComplexULong;
import mil.jpeojtrs.sca.util.math.ComplexULongLong;
import mil.jpeojtrs.sca.util.math.ComplexUShort;

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
	 * @generated
	 */
	public boolean validateSimple(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleSequence(SimpleSequence simpleSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Added extra validation to ensure structs cannot have partially configured properties
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStruct(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Custom validation for Struct properties
		boolean hasValidStructs = validateStructConfiguration(struct, diagnostics, context);

		// Generated validation for Struct properties
		boolean hasValidDefaultConstraints = validate_EveryDefaultConstraint(struct, diagnostics, context);

		return hasValidDefaultConstraints && hasValidStructs;
	}

	/**
	 * Custom validation method.
	 * The framework does not allow partial configuration of structures unless it's an optional element.
	 * Severity depends on kindtype value
	 * @since 6.1
	 */
	public boolean validateStructConfiguration(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		final int severity = struct.isKind(PropertyConfigurationType.PROPERTY) ? Diagnostic.ERROR : Diagnostic.WARNING;

		boolean isValidStruct = true;

		// Check the first field to see if a default is set. This is the baseline for future comparisons.
		boolean baselineConfigState = getDefaultState(struct);

		// Check to see if only some properties have defaults
		boolean isPartialConfig = false;
		for (Simple simple : struct.getSimple()) {
			if (simple.getOptional() != null && simple.getOptional()) {
				continue;
			}

			// Check is simple has a default value
			boolean simpleConfigState = (simple.getValue() != null);

			// Compare result to the baseline.
			if (baselineConfigState != simpleConfigState) {
				isPartialConfig = true;
				isValidStruct = false;
				diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, -1, "_UI_PartiallyConfiguredStruct_diagnostic",
					new Object[] { getObjectLabel(struct, context), }, new Object[] { struct }, context));

				break;
			}
		}
		if (!isPartialConfig) { // Don't check simpSeq's if we already caught partial config
			for (SimpleSequence simpleSeq : struct.getSimpleSequence()) {
				if (simpleSeq.getOptional() != null && simpleSeq.getOptional()) {
					continue;
				}

				// Check is simple has a default value
				boolean simpleSeqConfigState = (simpleSeq.getValues() != null);

				// Compare result to the baseline.
				if (baselineConfigState != simpleSeqConfigState) {
					isValidStruct = false;
					diagnostics.add(createDiagnostic(severity, DIAGNOSTIC_SOURCE, -1, "_UI_PartiallyConfiguredStruct_diagnostic",
						new Object[] { getObjectLabel(struct, context), }, new Object[] { struct }, context));
				}
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
				if (simple.getOptional() == null || !simple.getOptional()) {
					return simple.getValue() != null;
				}
			}
		} else if (!struct.getSimpleSequence().isEmpty()) {
			for (SimpleSequence simpleSeq : struct.getSimpleSequence()) {
				// Ignore optional elements
				if (simpleSeq.getOptional() == null || !simpleSeq.getOptional()) {
					return simpleSeq.getValues() != null;
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructSequence(StructSequence structSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructValue(StructValue structValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structValue, diagnostics, context);
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
	 * @generated
	 */
	public boolean validateSimpleRef(SimpleRef simpleRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleSequenceRef(SimpleSequenceRef simpleSequenceRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleSequenceRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructRef(StructRef structRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructSequenceRef(StructSequenceRef structSequenceRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structSequenceRef, diagnostics, context);
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
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PrfPlugin.INSTANCE;
	}

	/**
	 * Validates the isValueConsistent constraint of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProperties_isValueConsistent(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

} // PrfValidator

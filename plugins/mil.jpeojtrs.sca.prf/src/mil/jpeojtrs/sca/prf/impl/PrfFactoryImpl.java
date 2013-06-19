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
package mil.jpeojtrs.sca.prf.impl;

import mil.jpeojtrs.sca.util.math.ComplexBoolean;
import mil.jpeojtrs.sca.util.math.ComplexByte;
import mil.jpeojtrs.sca.util.math.ComplexDouble;
import mil.jpeojtrs.sca.util.math.ComplexFloat;
import mil.jpeojtrs.sca.util.math.ComplexLong;
import mil.jpeojtrs.sca.util.math.ComplexLongLong;
import mil.jpeojtrs.sca.util.math.ComplexNumber;
import mil.jpeojtrs.sca.util.math.ComplexShort;
import mil.jpeojtrs.sca.util.math.ComplexUByte;
import mil.jpeojtrs.sca.util.math.ComplexULong;
import mil.jpeojtrs.sca.util.math.ComplexULongLong;
import mil.jpeojtrs.sca.util.math.ComplexUShort;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.ActionType;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.Enumeration;
import mil.jpeojtrs.sca.prf.Enumerations;
import mil.jpeojtrs.sca.prf.InputValue;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfDocumentRoot;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class PrfFactoryImpl extends EFactoryImpl implements PrfFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static PrfFactory init() {
        try {
            PrfFactory thePrfFactory = (PrfFactory)EPackage.Registry.INSTANCE.getEFactory("http://sca.jpeojtrs.mil/prf"); 
            if (thePrfFactory != null) {
                return thePrfFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PrfFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrfFactoryImpl() {
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
            case PrfPackage.ACTION: return createAction();
            case PrfPackage.CONFIGURATION_KIND: return createConfigurationKind();
            case PrfPackage.ENUMERATION: return createEnumeration();
            case PrfPackage.ENUMERATIONS: return createEnumerations();
            case PrfPackage.INPUT_VALUE: return createInputValue();
            case PrfPackage.KIND: return createKind();
            case PrfPackage.PRF_DOCUMENT_ROOT: return createPrfDocumentRoot();
            case PrfPackage.PROPERTIES: return createProperties();
            case PrfPackage.RANGE: return createRange();
            case PrfPackage.RESULT_VALUE: return createResultValue();
            case PrfPackage.SIMPLE: return createSimple();
            case PrfPackage.SIMPLE_SEQUENCE: return createSimpleSequence();
            case PrfPackage.STRUCT: return createStruct();
            case PrfPackage.STRUCT_SEQUENCE: return createStructSequence();
            case PrfPackage.STRUCT_VALUE: return createStructValue();
            case PrfPackage.TEST: return createTest();
            case PrfPackage.VALUES: return createValues();
            case PrfPackage.SIMPLE_REF: return createSimpleRef();
            case PrfPackage.SIMPLE_SEQUENCE_REF: return createSimpleSequenceRef();
            case PrfPackage.STRUCT_REF: return createStructRef();
            case PrfPackage.STRUCT_SEQUENCE_REF: return createStructSequenceRef();
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
            case PrfPackage.ACCESS_TYPE:
                return createAccessTypeFromString(eDataType, initialValue);
            case PrfPackage.ACTION_TYPE:
                return createActionTypeFromString(eDataType, initialValue);
            case PrfPackage.PROPERTY_CONFIGURATION_TYPE:
                return createPropertyConfigurationTypeFromString(eDataType, initialValue);
            case PrfPackage.PROPERTY_VALUE_TYPE:
                return createPropertyValueTypeFromString(eDataType, initialValue);
            case PrfPackage.STRUCT_PROPERTY_CONFIGURATION_TYPE:
                return createStructPropertyConfigurationTypeFromString(eDataType, initialValue);
            case PrfPackage.ACCESS_TYPE_OBJECT:
                return createAccessTypeObjectFromString(eDataType, initialValue);
            case PrfPackage.ACTION_TYPE_OBJECT:
                return createActionTypeObjectFromString(eDataType, initialValue);
            case PrfPackage.CHARACTER_OBJECT:
                return createCharacterObjectFromString(eDataType, initialValue);
            case PrfPackage.DCE_UUID:
                return createDceUUIDFromString(eDataType, initialValue);
            case PrfPackage.PROPERTY_CONFIGURATION_TYPE_OBJECT:
                return createPropertyConfigurationTypeObjectFromString(eDataType, initialValue);
            case PrfPackage.PROPERTY_VALUE_TYPE_OBJECT:
                return createPropertyValueTypeObjectFromString(eDataType, initialValue);
            case PrfPackage.STRUCT_PROPERTY_CONFIGURATION_TYPE_OBJECT:
                return createStructPropertyConfigurationTypeObjectFromString(eDataType, initialValue);
            case PrfPackage.UNIT:
                return createUnitFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_BOOLEAN:
                return createComplexBooleanFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_BYTE:
                return createComplexByteFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_DOUBLE:
                return createComplexDoubleFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_FLOAT:
                return createComplexFloatFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_LONG:
                return createComplexLongFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_LONG_LONG:
                return createComplexLongLongFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_SHORT:
                return createComplexShortFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_UBYTE:
                return createComplexUByteFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_ULONG:
                return createComplexULongFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_ULONG_LONG:
                return createComplexULongLongFromString(eDataType, initialValue);
            case PrfPackage.COMPLEX_USHORT:
                return createComplexUShortFromString(eDataType, initialValue);
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
            case PrfPackage.ACCESS_TYPE:
                return convertAccessTypeToString(eDataType, instanceValue);
            case PrfPackage.ACTION_TYPE:
                return convertActionTypeToString(eDataType, instanceValue);
            case PrfPackage.PROPERTY_CONFIGURATION_TYPE:
                return convertPropertyConfigurationTypeToString(eDataType, instanceValue);
            case PrfPackage.PROPERTY_VALUE_TYPE:
                return convertPropertyValueTypeToString(eDataType, instanceValue);
            case PrfPackage.STRUCT_PROPERTY_CONFIGURATION_TYPE:
                return convertStructPropertyConfigurationTypeToString(eDataType, instanceValue);
            case PrfPackage.ACCESS_TYPE_OBJECT:
                return convertAccessTypeObjectToString(eDataType, instanceValue);
            case PrfPackage.ACTION_TYPE_OBJECT:
                return convertActionTypeObjectToString(eDataType, instanceValue);
            case PrfPackage.CHARACTER_OBJECT:
                return convertCharacterObjectToString(eDataType, instanceValue);
            case PrfPackage.DCE_UUID:
                return convertDceUUIDToString(eDataType, instanceValue);
            case PrfPackage.PROPERTY_CONFIGURATION_TYPE_OBJECT:
                return convertPropertyConfigurationTypeObjectToString(eDataType, instanceValue);
            case PrfPackage.PROPERTY_VALUE_TYPE_OBJECT:
                return convertPropertyValueTypeObjectToString(eDataType, instanceValue);
            case PrfPackage.STRUCT_PROPERTY_CONFIGURATION_TYPE_OBJECT:
                return convertStructPropertyConfigurationTypeObjectToString(eDataType, instanceValue);
            case PrfPackage.UNIT:
                return convertUnitToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_BOOLEAN:
                return convertComplexBooleanToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_BYTE:
                return convertComplexByteToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_DOUBLE:
                return convertComplexDoubleToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_FLOAT:
                return convertComplexFloatToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_LONG:
                return convertComplexLongToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_LONG_LONG:
                return convertComplexLongLongToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_SHORT:
                return convertComplexShortToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_UBYTE:
                return convertComplexUByteToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_ULONG:
                return convertComplexULongToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_ULONG_LONG:
                return convertComplexULongLongToString(eDataType, instanceValue);
            case PrfPackage.COMPLEX_USHORT:
                return convertComplexUShortToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Action createAction() {
        ActionImpl action = new ActionImpl();
        return action;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConfigurationKind createConfigurationKind() {
        ConfigurationKindImpl configurationKind = new ConfigurationKindImpl();
        return configurationKind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Enumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Enumerations createEnumerations() {
        EnumerationsImpl enumerations = new EnumerationsImpl();
        return enumerations;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InputValue createInputValue() {
        InputValueImpl inputValue = new InputValueImpl();
        return inputValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Kind createKind() {
        KindImpl kind = new KindImpl();
        return kind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrfDocumentRoot createPrfDocumentRoot() {
        PrfDocumentRootImpl prfDocumentRoot = new PrfDocumentRootImpl();
        return prfDocumentRoot;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Properties createProperties() {
        PropertiesImpl properties = new PropertiesImpl();
        return properties;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Range createRange() {
        RangeImpl range = new RangeImpl();
        return range;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResultValue createResultValue() {
        ResultValueImpl resultValue = new ResultValueImpl();
        return resultValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Simple createSimple() {
        SimpleImpl simple = new SimpleImpl();
        return simple;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SimpleSequence createSimpleSequence() {
        SimpleSequenceImpl simpleSequence = new SimpleSequenceImpl();
        return simpleSequence;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Struct createStruct() {
        StructImpl struct = new StructImpl();
        return struct;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StructSequence createStructSequence() {
        StructSequenceImpl structSequence = new StructSequenceImpl();
        return structSequence;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StructValue createStructValue() {
        StructValueImpl structValue = new StructValueImpl();
        return structValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Test createTest() {
        TestImpl test = new TestImpl();
        return test;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Values createValues() {
        ValuesImpl values = new ValuesImpl();
        return values;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SimpleRef createSimpleRef() {
        SimpleRefImpl simpleRef = new SimpleRefImpl();
        return simpleRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SimpleSequenceRef createSimpleSequenceRef() {
        SimpleSequenceRefImpl simpleSequenceRef = new SimpleSequenceRefImpl();
        return simpleSequenceRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StructRef createStructRef() {
        StructRefImpl structRef = new StructRefImpl();
        return structRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StructSequenceRef createStructSequenceRef() {
        StructSequenceRefImpl structSequenceRef = new StructSequenceRefImpl();
        return structSequenceRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
        AccessType result = AccessType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
        ActionType result = ActionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyConfigurationType createPropertyConfigurationTypeFromString(EDataType eDataType, String initialValue) {
        PropertyConfigurationType result = PropertyConfigurationType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPropertyConfigurationTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyValueType createPropertyValueTypeFromString(EDataType eDataType, String initialValue) {
        PropertyValueType result = PropertyValueType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPropertyValueTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StructPropertyConfigurationType createStructPropertyConfigurationTypeFromString(EDataType eDataType, String initialValue) {
        StructPropertyConfigurationType result = StructPropertyConfigurationType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertStructPropertyConfigurationTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createAccessTypeFromString(PrfPackage.Literals.ACCESS_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAccessTypeToString(PrfPackage.Literals.ACCESS_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createActionTypeFromString(PrfPackage.Literals.ACTION_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertActionTypeToString(PrfPackage.Literals.ACTION_TYPE, instanceValue);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Character createCharacterObjectFromString(EDataType eDataType, String initialValue) {
		return (initialValue == null) ? null : Character.valueOf(initialValue.charAt(0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCharacterObjectToString(EDataType eDataType, Object instanceValue) {
		return (instanceValue == null) ? "" : instanceValue.toString();
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String createDceUUIDFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertDceUUIDToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyConfigurationType createPropertyConfigurationTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createPropertyConfigurationTypeFromString(PrfPackage.Literals.PROPERTY_CONFIGURATION_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPropertyConfigurationTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPropertyConfigurationTypeToString(PrfPackage.Literals.PROPERTY_CONFIGURATION_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyValueType createPropertyValueTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createPropertyValueTypeFromString(PrfPackage.Literals.PROPERTY_VALUE_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertPropertyValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertPropertyValueTypeToString(PrfPackage.Literals.PROPERTY_VALUE_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StructPropertyConfigurationType createStructPropertyConfigurationTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createStructPropertyConfigurationTypeFromString(PrfPackage.Literals.STRUCT_PROPERTY_CONFIGURATION_TYPE, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertStructPropertyConfigurationTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertStructPropertyConfigurationTypeToString(PrfPackage.Literals.STRUCT_PROPERTY_CONFIGURATION_TYPE, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String createUnitFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertUnitToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

	/**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexBoolean createComplexBooleanFromString(EDataType eDataType, String initialValue) {
    	return ComplexBoolean.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexBooleanToString(EDataType eDataType, Object instanceValue) {
    	return ((ComplexNumber) instanceValue).toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexByte createComplexByteFromString(EDataType eDataType, String initialValue) {
        return ComplexByte.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexByteToString(EDataType eDataType, Object instanceValue) {
        return ((ComplexByte) instanceValue).toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexDouble createComplexDoubleFromString(EDataType eDataType, String initialValue) {
        return ComplexDouble.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexDoubleToString(EDataType eDataType, Object instanceValue) {
        return ((ComplexDouble) instanceValue).toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexFloat createComplexFloatFromString(EDataType eDataType, String initialValue) {
        return ComplexFloat.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexFloatToString(EDataType eDataType, Object instanceValue) {
        return ((ComplexFloat) instanceValue).toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexLong createComplexLongFromString(EDataType eDataType, String initialValue) {
        return ComplexLong.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexLongToString(EDataType eDataType, Object instanceValue) {
        return ((ComplexLong) instanceValue).toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexLongLong createComplexLongLongFromString(EDataType eDataType, String initialValue) {
        return ComplexLongLong.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexLongLongToString(EDataType eDataType, Object instanceValue) {
        return instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexShort createComplexShortFromString(EDataType eDataType, String initialValue) {
        return ComplexShort.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexShortToString(EDataType eDataType, Object instanceValue) {
        return instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexUByte createComplexUByteFromString(EDataType eDataType, String initialValue) {
        return ComplexUByte.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexUByteToString(EDataType eDataType, Object instanceValue) {
        return instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexULong createComplexULongFromString(EDataType eDataType, String initialValue) {
        return ComplexULong.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexULongToString(EDataType eDataType, Object instanceValue) {
        return instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexULongLong createComplexULongLongFromString(EDataType eDataType, String initialValue) {
        return ComplexULongLong.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexULongLongToString(EDataType eDataType, Object instanceValue) {
        return instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ComplexUShort createComplexUShortFromString(EDataType eDataType, String initialValue) {
        return ComplexUShort.valueOf(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * @since 2.3
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertComplexUShortToString(EDataType eDataType, Object instanceValue) {
        return instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PrfPackage getPrfPackage() {
        return (PrfPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static PrfPackage getPackage() {
        return PrfPackage.eINSTANCE;
    }

} // PrfFactoryImpl

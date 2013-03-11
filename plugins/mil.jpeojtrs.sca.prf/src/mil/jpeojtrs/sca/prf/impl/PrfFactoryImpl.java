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
package mil.jpeojtrs.sca.prf.impl;

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

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
package mil.jpeojtrs.sca.prf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * The Properties Descriptor file details component and device attribute
 * settings. For purposes of the SCA, Property Descriptor files will contain
 * simple, simplesequence, test, struct or structsequence elements. These
 * elements will be used to describe attributes of a component that will be used
 * for dependency checking. These elements will also be used for SCA component
 * values used by a CF Resource component?s configure(), query(), and runTest()
 * operations..
 * 
 * <!-- end-model-doc -->
 * 
 * @see mil.jpeojtrs.sca.prf.PrfFactory
 * @model kind="package"
 * @generated
 */
public interface PrfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prf";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sca.jpeojtrs.mil/prf";
	String FILE_EXTENSION = ".prf.xml";
	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	String eNS_PREFIX = "";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "mil.jpeojtrs.sca.prf.content-type";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrfPackage eINSTANCE = mil.jpeojtrs.sca.prf.impl.PrfPackageImpl.init();
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAbstractProperty()
	 * @generated
	 */
	int ABSTRACT_PROPERTY = 0;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__ID = 1;
	/**
	 * The feature id for the '<em><b>Local Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__LOCAL_MODE = 2;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__NAME = 3;
	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__MODE = 4;
	/**
	 * The number of structural features of the '<em>Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_FEATURE_COUNT = 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.ActionImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = 0;
	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.ConfigurationKindImpl <em>Configuration Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.ConfigurationKindImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getConfigurationKind()
	 * @generated
	 */
	int CONFIGURATION_KIND = 2;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_KIND__TYPE = 0;
	/**
	 * The number of structural features of the '<em>Configuration Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_KIND_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.EnumerationImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 3;
	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LABEL = 0;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUE = 1;
	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.EnumerationsImpl <em>Enumerations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.EnumerationsImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getEnumerations()
	 * @generated
	 */
	int ENUMERATIONS = 4;
	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONS__ENUMERATION = 0;
	/**
	 * The number of structural features of the '<em>Enumerations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONS_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.InputValueImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 5;
	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__SIMPLE = 0;
	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.KindImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 6;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TYPE = 0;
	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.PrfDocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.PrfDocumentRootImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPrfDocumentRoot()
	 * @generated
	 */
	int PRF_DOCUMENT_ROOT = 7;
	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRF_DOCUMENT_ROOT__MIXED = 0;
	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRF_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;
	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRF_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRF_DOCUMENT_ROOT__PROPERTIES = 3;
	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRF_DOCUMENT_ROOT_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.PropertyContainer <em>Property Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyContainer
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyContainer()
	 * @generated
	 */
	int PROPERTY_CONTAINER = 18;
	/**
	 * The number of structural features of the '<em>Property Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTAINER_FEATURE_COUNT = 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.PropertiesImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 8;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__DESCRIPTION = PROPERTY_CONTAINER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTIES = PROPERTY_CONTAINER_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SIMPLE = PROPERTY_CONTAINER_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Simple Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SIMPLE_SEQUENCE = PROPERTY_CONTAINER_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__TEST = PROPERTY_CONTAINER_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__STRUCT = PROPERTY_CONTAINER_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Struct Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__STRUCT_SEQUENCE = PROPERTY_CONTAINER_FEATURE_COUNT + 6;
	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = PROPERTY_CONTAINER_FEATURE_COUNT + 7;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.RangeImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 9;
	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = 0;
	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = 1;
	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.ResultValueImpl <em>Result Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.ResultValueImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getResultValue()
	 * @generated
	 */
	int RESULT_VALUE = 10;
	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE__SIMPLE = 0;
	/**
	 * The number of structural features of the '<em>Result Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_VALUE_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.SimpleImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 11;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ID = ABSTRACT_PROPERTY__ID;
	/**
	 * The feature id for the '<em><b>Local Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__LOCAL_MODE = ABSTRACT_PROPERTY__LOCAL_MODE;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = ABSTRACT_PROPERTY__NAME;
	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MODE = ABSTRACT_PROPERTY__MODE;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__UNITS = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__RANGE = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ENUMERATIONS = ABSTRACT_PROPERTY_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__ACTION = ABSTRACT_PROPERTY_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TYPE = ABSTRACT_PROPERTY_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__COMPLEX = ABSTRACT_PROPERTY_FEATURE_COUNT + 7;
	/**
	 * The feature id for the '<em><b>Commandline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__COMMANDLINE = ABSTRACT_PROPERTY_FEATURE_COUNT + 8;
	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__OPTIONAL = ABSTRACT_PROPERTY_FEATURE_COUNT + 9;
	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 10;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl <em>Simple Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimpleSequence()
	 * @generated
	 */
	int SIMPLE_SEQUENCE = 12;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__ID = ABSTRACT_PROPERTY__ID;
	/**
	 * The feature id for the '<em><b>Local Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__LOCAL_MODE = ABSTRACT_PROPERTY__LOCAL_MODE;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__NAME = ABSTRACT_PROPERTY__NAME;
	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__MODE = ABSTRACT_PROPERTY__MODE;
	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__VALUES = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__UNITS = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__RANGE = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__ACTION = ABSTRACT_PROPERTY_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__TYPE = ABSTRACT_PROPERTY_FEATURE_COUNT + 5;
	/**
	 * The feature id for the '<em><b>Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__COMPLEX = ABSTRACT_PROPERTY_FEATURE_COUNT + 6;
	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE__OPTIONAL = ABSTRACT_PROPERTY_FEATURE_COUNT + 7;
	/**
	 * The number of structural features of the '<em>Simple Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 8;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.StructImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 13;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ID = ABSTRACT_PROPERTY__ID;
	/**
	 * The feature id for the '<em><b>Local Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__LOCAL_MODE = ABSTRACT_PROPERTY__LOCAL_MODE;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = ABSTRACT_PROPERTY__NAME;
	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MODE = ABSTRACT_PROPERTY__MODE;
	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__FIELDS = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__SIMPLE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__SIMPLE_SEQUENCE = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Configuration Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__CONFIGURATION_KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 3;
	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.StructSequenceImpl <em>Struct Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.StructSequenceImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructSequence()
	 * @generated
	 */
	int STRUCT_SEQUENCE = 14;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__ID = ABSTRACT_PROPERTY__ID;
	/**
	 * The feature id for the '<em><b>Local Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__LOCAL_MODE = ABSTRACT_PROPERTY__LOCAL_MODE;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__NAME = ABSTRACT_PROPERTY__NAME;
	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__MODE = ABSTRACT_PROPERTY__MODE;
	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__STRUCT = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Struct Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__STRUCT_VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Configuration Kind</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE__CONFIGURATION_KIND = ABSTRACT_PROPERTY_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Struct Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer <em>Property Ref Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyRefContainer()
	 * @generated
	 */
	int PROPERTY_REF_CONTAINER = 20;
	/**
	 * The number of structural features of the '<em>Property Ref Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_CONTAINER_FEATURE_COUNT = 0;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl <em>Struct Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.StructValueImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructValue()
	 * @generated
	 */
	int STRUCT_VALUE = 15;
	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__REFS = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__SIMPLE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__SIMPLE_SEQUENCE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__STRUCT = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE__INDEX = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Struct Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE_FEATURE_COUNT = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.TestImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 16;
	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DESCRIPTION = 0;
	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__INPUT_VALUE = 1;
	/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__RESULT_VALUE = 2;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ID = 3;
	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 4;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.ValuesImpl <em>Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.ValuesImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getValues()
	 * @generated
	 */
	int VALUES = 17;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES__VALUE = 0;
	/**
	 * The number of structural features of the '<em>Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_FEATURE_COUNT = 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyRefImpl <em>Abstract Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.AbstractPropertyRefImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAbstractPropertyRef()
	 * @generated
	 */
	int ABSTRACT_PROPERTY_REF = 19;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_REF__REF_ID = 0;
	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_REF__PROPERTY = 1;
	/**
	 * The number of structural features of the '<em>Abstract Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_REF_FEATURE_COUNT = 2;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl <em>Property Ref Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyRefGroup()
	 * @generated
	 */
	int PROPERTY_REF_GROUP = 21;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_GROUP__PROPERTIES = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_GROUP__SIMPLE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_GROUP__STRUCT_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Struct Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Property Ref Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_GROUP_FEATURE_COUNT = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl <em>Property Ref Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyRefSet()
	 * @generated
	 */
	int PROPERTY_REF_SET = 22;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_SET__PROPERTIES = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_SET__SIMPLE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_SET__STRUCT_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Struct Sequence Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_SET__STRUCT_SEQUENCE_REF = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 4;
	/**
	 * The number of structural features of the '<em>Property Ref Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_SET_FEATURE_COUNT = PROPERTY_REF_CONTAINER_FEATURE_COUNT + 5;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleRefImpl <em>Simple Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.SimpleRefImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimpleRef()
	 * @generated
	 */
	int SIMPLE_REF = 23;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REF__REF_ID = ABSTRACT_PROPERTY_REF__REF_ID;
	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REF__PROPERTY = ABSTRACT_PROPERTY_REF__PROPERTY;
	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REF__VALUE = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Simple Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REF_FEATURE_COUNT = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceRefImpl <em>Simple Sequence Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.SimpleSequenceRefImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimpleSequenceRef()
	 * @generated
	 */
	int SIMPLE_SEQUENCE_REF = 24;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE_REF__REF_ID = ABSTRACT_PROPERTY_REF__REF_ID;
	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE_REF__PROPERTY = ABSTRACT_PROPERTY_REF__PROPERTY;
	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE_REF__VALUES = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Simple Sequence Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SEQUENCE_REF_FEATURE_COUNT = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.StructRefImpl <em>Struct Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.StructRefImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructRef()
	 * @generated
	 */
	int STRUCT_REF = 25;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_REF__REF_ID = ABSTRACT_PROPERTY_REF__REF_ID;
	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_REF__PROPERTY = ABSTRACT_PROPERTY_REF__PROPERTY;
	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_REF__REFS = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Simple Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_REF__SIMPLE_REF = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_REF__SIMPLE_SEQUENCE_REF = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 2;
	/**
	 * The number of structural features of the '<em>Struct Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_REF_FEATURE_COUNT = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 3;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.impl.StructSequenceRefImpl <em>Struct Sequence Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.impl.StructSequenceRefImpl
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructSequenceRef()
	 * @generated
	 */
	int STRUCT_SEQUENCE_REF = 26;
	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE_REF__REF_ID = ABSTRACT_PROPERTY_REF__REF_ID;
	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE_REF__PROPERTY = ABSTRACT_PROPERTY_REF__PROPERTY;
	/**
	 * The feature id for the '<em><b>Struct Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE_REF__STRUCT_VALUE = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Struct Sequence Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_SEQUENCE_REF_FEATURE_COUNT = ABSTRACT_PROPERTY_REF_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 27;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.ActionType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 28;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.PropertyConfigurationType <em>Property Configuration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyConfigurationType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyConfigurationType()
	 * @generated
	 */
	int PROPERTY_CONFIGURATION_TYPE = 29;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.PropertyValueType <em>Property Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyValueType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyValueType()
	 * @generated
	 */
	int PROPERTY_VALUE_TYPE = 30;
	/**
	 * The meta object id for the '{@link mil.jpeojtrs.sca.prf.StructPropertyConfigurationType <em>Struct Property Configuration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructPropertyConfigurationType()
	 * @generated
	 */
	int STRUCT_PROPERTY_CONFIGURATION_TYPE = 31;
	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 32;
	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.ActionType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 33;
	/**
	 * The meta object id for the '<em>Character Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getCharacterObject()
	 * @generated
	 */
	int CHARACTER_OBJECT = 34;
	/**
	 * The meta object id for the '<em>Dce UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getDceUUID()
	 * @generated
	 */
	int DCE_UUID = 35;
	/**
	 * The meta object id for the '<em>Property Configuration Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyConfigurationType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyConfigurationTypeObject()
	 * @generated
	 */
	int PROPERTY_CONFIGURATION_TYPE_OBJECT = 36;
	/**
	 * The meta object id for the '<em>Property Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyValueType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyValueTypeObject()
	 * @generated
	 */
	int PROPERTY_VALUE_TYPE_OBJECT = 37;
	/**
	 * The meta object id for the '<em>Struct Property Configuration Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructPropertyConfigurationTypeObject()
	 * @generated
	 */
	int STRUCT_PROPERTY_CONFIGURATION_TYPE_OBJECT = 38;
	/**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 39;
	/**
	 * The meta object id for the '<em>Any</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.CORBA.Any
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 40;

	/**
	 * The meta object id for the '<em>Complex Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexBoolean
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexBoolean()
	 * @generated
	 */
	int COMPLEX_BOOLEAN = 41;
	/**
	 * The meta object id for the '<em>Complex Byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexByte
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexByte()
	 * @generated
	 */
	int COMPLEX_BYTE = 42;
	/**
	 * The meta object id for the '<em>Complex Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexDouble
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexDouble()
	 * @generated
	 */
	int COMPLEX_DOUBLE = 43;
	/**
	 * The meta object id for the '<em>Complex Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexFloat
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexFloat()
	 * @generated
	 */
	int COMPLEX_FLOAT = 44;
	/**
	 * The meta object id for the '<em>Complex Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexLong
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexLong()
	 * @generated
	 */
	int COMPLEX_LONG = 45;
	/**
	 * The meta object id for the '<em>Complex Long Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexLongLong
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexLongLong()
	 * @generated
	 */
	int COMPLEX_LONG_LONG = 46;
	/**
	 * The meta object id for the '<em>Complex Octet</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 6.2
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexOctet
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexOctet()
	 * @generated
	 */
	int COMPLEX_OCTET = 47;
	/**
	 * The meta object id for the '<em>Complex Short</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexShort
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexShort()
	 * @generated
	 */
	int COMPLEX_SHORT = 48;
	/**
	 * The meta object id for the '<em>Complex UByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexUByte
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexUByte()
	 * @generated
	 */
	int COMPLEX_UBYTE = 49;
	/**
	 * The meta object id for the '<em>Complex ULong</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexULong
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexULong()
	 * @generated
	 */
	int COMPLEX_ULONG = 50;
	/**
	 * The meta object id for the '<em>Complex ULong Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexULongLong
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexULongLong()
	 * @generated
	 */
	int COMPLEX_ULONG_LONG = 51;
	/**
	 * The meta object id for the '<em>Complex UShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.math.ComplexUShort
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexUShort()
	 * @generated
	 */
	int COMPLEX_USHORT = 52;

	/**
	 * The meta object id for the '<em>UTC Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * @since 6.2
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.util.time.UTCTime
	 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getUTCTime()
	 * @generated
	 */
	int UTC_TIME = 53;

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Property</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty
	 * @generated
	 */
	EClass getAbstractProperty();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#getDescription()
	 * @see #getAbstractProperty()
	 * @generated
	 */
	EAttribute getAbstractProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#getId()
	 * @see #getAbstractProperty()
	 * @generated
	 */
	EAttribute getAbstractProperty_Id();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getLocalMode <em>Local Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Mode</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#getLocalMode()
	 * @see #getAbstractProperty()
	 * @generated
	 */
	EAttribute getAbstractProperty_LocalMode();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#getName()
	 * @see #getAbstractProperty()
	 * @generated
	 */
	EAttribute getAbstractProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#getMode()
	 * @see #getAbstractProperty()
	 * @generated
	 */
	EAttribute getAbstractProperty_Mode();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see mil.jpeojtrs.sca.prf.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.ConfigurationKind <em>Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Kind</em>'.
	 * @see mil.jpeojtrs.sca.prf.ConfigurationKind
	 * @generated
	 */
	EClass getConfigurationKind();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.ConfigurationKind#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.ConfigurationKind#getType()
	 * @see #getConfigurationKind()
	 * @generated
	 */
	EAttribute getConfigurationKind_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see mil.jpeojtrs.sca.prf.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Enumeration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see mil.jpeojtrs.sca.prf.Enumeration#getLabel()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Label();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Enumeration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.Enumeration#getValue()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Value();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Enumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerations</em>'.
	 * @see mil.jpeojtrs.sca.prf.Enumerations
	 * @generated
	 */
	EClass getEnumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Enumerations#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see mil.jpeojtrs.sca.prf.Enumerations#getEnumeration()
	 * @see #getEnumerations()
	 * @generated
	 */
	EReference getEnumerations_Enumeration();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.InputValue#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see mil.jpeojtrs.sca.prf.InputValue#getSimple()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Simple();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see mil.jpeojtrs.sca.prf.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Kind#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.Kind#getType()
	 * @see #getKind()
	 * @generated
	 */
	EAttribute getKind_Type();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.PrfDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see mil.jpeojtrs.sca.prf.PrfDocumentRoot
	 * @generated
	 */
	EClass getPrfDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.PrfDocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see mil.jpeojtrs.sca.prf.PrfDocumentRoot#getMixed()
	 * @see #getPrfDocumentRoot()
	 * @generated
	 */
	EAttribute getPrfDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.prf.PrfDocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see mil.jpeojtrs.sca.prf.PrfDocumentRoot#getXMLNSPrefixMap()
	 * @see #getPrfDocumentRoot()
	 * @generated
	 */
	EReference getPrfDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link mil.jpeojtrs.sca.prf.PrfDocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see mil.jpeojtrs.sca.prf.PrfDocumentRoot#getXSISchemaLocation()
	 * @see #getPrfDocumentRoot()
	 * @generated
	 */
	EReference getPrfDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.PrfDocumentRoot#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.prf.PrfDocumentRoot#getProperties()
	 * @see #getPrfDocumentRoot()
	 * @generated
	 */
	EReference getPrfDocumentRoot_Properties();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Properties#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getDescription()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Description();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.Properties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getProperties()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Properties#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getSimple()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Simple();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Properties#getSimpleSequence <em>Simple Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getSimpleSequence()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_SimpleSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Properties#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getTest()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Test();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Properties#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getStruct()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Properties#getStructSequence <em>Struct Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Sequence</em>'.
	 * @see mil.jpeojtrs.sca.prf.Properties#getStructSequence()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_StructSequence();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see mil.jpeojtrs.sca.prf.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Range#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see mil.jpeojtrs.sca.prf.Range#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Range#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see mil.jpeojtrs.sca.prf.Range#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.ResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.ResultValue
	 * @generated
	 */
	EClass getResultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.ResultValue#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see mil.jpeojtrs.sca.prf.ResultValue#getSimple()
	 * @see #getResultValue()
	 * @generated
	 */
	EReference getResultValue_Simple();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Simple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getValue()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Value();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Simple#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getUnits()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Units();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.Simple#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getRange()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Range();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.Simple#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumerations</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getEnumerations()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Simple#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kind</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getKind()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.Simple#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getAction()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Action();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Simple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getType()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Type();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Simple#getComplex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getComplex()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Complex();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Simple#getCommandline <em>Commandline</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commandline</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getCommandline()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Commandline();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Simple#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see mil.jpeojtrs.sca.prf.Simple#getOptional()
	 * @see #getSimple()
	 * @generated
	 */
	EAttribute getSimple_Optional();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.SimpleSequence <em>Simple Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sequence</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence
	 * @generated
	 */
	EClass getSimpleSequence();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getValues()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EReference getSimpleSequence_Values();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getUnits()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EAttribute getSimpleSequence_Units();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getRange()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EReference getSimpleSequence_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kind</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getKind()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EReference getSimpleSequence_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getAction()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EReference getSimpleSequence_Action();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getType()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EAttribute getSimpleSequence_Type();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getComplex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getComplex()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EAttribute getSimpleSequence_Complex();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.SimpleSequence#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#getOptional()
	 * @see #getSimpleSequence()
	 * @generated
	 */
	EAttribute getSimpleSequence_Optional();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see mil.jpeojtrs.sca.prf.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.Struct#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fields</em>'.
	 * @see mil.jpeojtrs.sca.prf.Struct#getFields()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Struct#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple</em>'.
	 * @see mil.jpeojtrs.sca.prf.Struct#getSimple()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Simple();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Struct#getSimpleSequence <em>Simple Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence</em>'.
	 * @see mil.jpeojtrs.sca.prf.Struct#getSimpleSequence()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_SimpleSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.Struct#getConfigurationKind <em>Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Kind</em>'.
	 * @see mil.jpeojtrs.sca.prf.Struct#getConfigurationKind()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_ConfigurationKind();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.StructSequence <em>Struct Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Sequence</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructSequence
	 * @generated
	 */
	EClass getStructSequence();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.StructSequence#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructSequence#getStruct()
	 * @see #getStructSequence()
	 * @generated
	 */
	EReference getStructSequence_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructSequence#getStructValue <em>Struct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructSequence#getStructValue()
	 * @see #getStructSequence()
	 * @generated
	 */
	EReference getStructSequence_StructValue();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructSequence#getConfigurationKind <em>Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Kind</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructSequence#getConfigurationKind()
	 * @see #getStructSequence()
	 * @generated
	 */
	EReference getStructSequence_ConfigurationKind();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.StructValue <em>Struct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructValue
	 * @generated
	 */
	EClass getStructValue();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.StructValue#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Refs</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructValue#getRefs()
	 * @see #getStructValue()
	 * @generated
	 */
	EAttribute getStructValue_Refs();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructValue#getSimpleRef()
	 * @see #getStructValue()
	 * @generated
	 */
	EReference getStructValue_SimpleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructValue#getSimpleSequenceRef()
	 * @see #getStructValue()
	 * @generated
	 */
	EReference getStructValue_SimpleSequenceRef();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.prf.StructValue#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructValue#getStruct()
	 * @see #getStructValue()
	 * @generated
	 */
	EReference getStructValue_Struct();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.StructValue#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructValue#getIndex()
	 * @see #getStructValue()
	 * @generated
	 */
	EAttribute getStructValue_Index();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see mil.jpeojtrs.sca.prf.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Test#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mil.jpeojtrs.sca.prf.Test#getDescription()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Description();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.Test#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.Test#getInputValue()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_InputValue();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.Test#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.Test#getResultValue()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_ResultValue();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.Test#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mil.jpeojtrs.sca.prf.Test#getId()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Id();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values</em>'.
	 * @see mil.jpeojtrs.sca.prf.Values
	 * @generated
	 */
	EClass getValues();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.Values#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.Values#getValue()
	 * @see #getValues()
	 * @generated
	 */
	EAttribute getValues_Value();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.PropertyContainer <em>Property Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Container</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyContainer
	 * @generated
	 */
	EClass getPropertyContainer();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef <em>Abstract Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Property Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractPropertyRef
	 * @generated
	 */
	EClass getAbstractPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractPropertyRef#getRefID()
	 * @see #getAbstractPropertyRef()
	 * @generated
	 */
	EAttribute getAbstractPropertyRef_RefID();

	/**
	 * Returns the meta object for the reference '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty()
	 * @see #getAbstractPropertyRef()
	 * @generated
	 */
	EReference getAbstractPropertyRef_Property();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer <em>Property Ref Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref Container</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer
	 * @generated
	 */
	EClass getPropertyRefContainer();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup <em>Property Ref Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref Group</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup
	 * @generated
	 */
	EClass getPropertyRefGroup();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup#getProperties()
	 * @see #getPropertyRefGroup()
	 * @generated
	 */
	EAttribute getPropertyRefGroup_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup#getSimpleRef()
	 * @see #getPropertyRefGroup()
	 * @generated
	 */
	EReference getPropertyRefGroup_SimpleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getSimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup#getSimpleSequenceRef()
	 * @see #getPropertyRefGroup()
	 * @generated
	 */
	EReference getPropertyRefGroup_SimpleSequenceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup#getStructRef()
	 * @see #getPropertyRefGroup()
	 * @generated
	 */
	EReference getPropertyRefGroup_StructRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getStructSequenceRef <em>Struct Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefGroup#getStructSequenceRef()
	 * @see #getPropertyRefGroup()
	 * @generated
	 */
	EReference getPropertyRefGroup_StructSequenceRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.PropertyRefSet <em>Property Ref Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref Set</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet
	 * @generated
	 */
	EClass getPropertyRefSet();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet#getProperties()
	 * @see #getPropertyRefSet()
	 * @generated
	 */
	EAttribute getPropertyRefSet_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleRef()
	 * @see #getPropertyRefSet()
	 * @generated
	 */
	EReference getPropertyRefSet_SimpleRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet#getSimpleSequenceRef()
	 * @see #getPropertyRefSet()
	 * @generated
	 */
	EReference getPropertyRefSet_SimpleSequenceRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet#getStructRef()
	 * @see #getPropertyRefSet()
	 * @generated
	 */
	EReference getPropertyRefSet_StructRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.PropertyRefSet#getStructSequenceRef <em>Struct Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyRefSet#getStructSequenceRef()
	 * @see #getPropertyRefSet()
	 * @generated
	 */
	EReference getPropertyRefSet_StructSequenceRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.SimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleRef
	 * @generated
	 */
	EClass getSimpleRef();

	/**
	 * Returns the meta object for the attribute '{@link mil.jpeojtrs.sca.prf.SimpleRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleRef#getValue()
	 * @see #getSimpleRef()
	 * @generated
	 */
	EAttribute getSimpleRef_Value();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.SimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequenceRef
	 * @generated
	 */
	EClass getSimpleSequenceRef();

	/**
	 * Returns the meta object for the containment reference '{@link mil.jpeojtrs.sca.prf.SimpleSequenceRef#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values</em>'.
	 * @see mil.jpeojtrs.sca.prf.SimpleSequenceRef#getValues()
	 * @see #getSimpleSequenceRef()
	 * @generated
	 */
	EReference getSimpleSequenceRef_Values();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.StructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructRef
	 * @generated
	 */
	EClass getStructRef();

	/**
	 * Returns the meta object for the attribute list '{@link mil.jpeojtrs.sca.prf.StructRef#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Refs</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructRef#getRefs()
	 * @see #getStructRef()
	 * @generated
	 */
	EAttribute getStructRef_Refs();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructRef#getSimpleRef <em>Simple Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructRef#getSimpleRef()
	 * @see #getStructRef()
	 * @generated
	 */
	EReference getStructRef_SimpleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructRef#getSimpleSequenceRef <em>Simple Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructRef#getSimpleSequenceRef()
	 * @see #getStructRef()
	 * @generated
	 */
	EReference getStructRef_SimpleSequenceRef();

	/**
	 * Returns the meta object for class '{@link mil.jpeojtrs.sca.prf.StructSequenceRef <em>Struct Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Sequence Ref</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructSequenceRef
	 * @generated
	 */
	EClass getStructSequenceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link mil.jpeojtrs.sca.prf.StructSequenceRef#getStructValue <em>Struct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Value</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructSequenceRef#getStructValue()
	 * @see #getStructSequenceRef()
	 * @generated
	 */
	EReference getStructSequenceRef_StructValue();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.prf.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.prf.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.prf.PropertyConfigurationType <em>Property Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Configuration Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyConfigurationType
	 * @generated
	 */
	EEnum getPropertyConfigurationType();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.prf.PropertyValueType <em>Property Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Value Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyValueType
	 * @generated
	 */
	EEnum getPropertyValueType();

	/**
	 * Returns the meta object for enum '{@link mil.jpeojtrs.sca.prf.StructPropertyConfigurationType <em>Struct Property Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Struct Property Configuration Type</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
	 * @generated
	 */
	EEnum getStructPropertyConfigurationType();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.prf.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see mil.jpeojtrs.sca.prf.AccessType
	 * @model instanceClass="mil.jpeojtrs.sca.prf.AccessType"
	 *        extendedMetaData="name='AccessType:Object' baseType='AccessType'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.prf.ActionType <em>Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Type Object</em>'.
	 * @see mil.jpeojtrs.sca.prf.ActionType
	 * @model instanceClass="mil.jpeojtrs.sca.prf.ActionType"
	 *        extendedMetaData="name='ActionType:Object' baseType='ActionType'"
	 * @generated
	 */
	EDataType getActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>Character Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character Object</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        extendedMetaData="name='CharacterObject'"
	 * @generated
	 */
	EDataType getCharacterObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dce UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dce UUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DceUUID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='DCE:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}(:\\d+(.\\d+)?)?'"
	 * @generated
	 */
	EDataType getDceUUID();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.prf.PropertyConfigurationType <em>Property Configuration Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Configuration Type Object</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyConfigurationType
	 * @model instanceClass="mil.jpeojtrs.sca.prf.PropertyConfigurationType"
	 *        extendedMetaData="name='PropertyConfigurationType:Object' baseType='PropertyConfigurationType'"
	 * @generated
	 */
	EDataType getPropertyConfigurationTypeObject();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.prf.PropertyValueType <em>Property Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Value Type Object</em>'.
	 * @see mil.jpeojtrs.sca.prf.PropertyValueType
	 * @model instanceClass="mil.jpeojtrs.sca.prf.PropertyValueType"
	 *        extendedMetaData="name='PropertyValueType:Object' baseType='PropertyValueType'"
	 * @generated
	 */
	EDataType getPropertyValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.prf.StructPropertyConfigurationType <em>Struct Property Configuration Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Struct Property Configuration Type Object</em>'.
	 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
	 * @model instanceClass="mil.jpeojtrs.sca.prf.StructPropertyConfigurationType"
	 *        extendedMetaData="name='StructPropertyConfigurationType:Object' baseType='StructPropertyConfigurationType'"
	 * @generated
	 */
	EDataType getStructPropertyConfigurationTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Unit' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getUnit();

	/**
	 * Returns the meta object for data type '{@link org.omg.CORBA.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Any</em>'.
	 * @see org.omg.CORBA.Any
	 * @model instanceClass="org.omg.CORBA.Any" serializeable="false"
	 * @generated
	 */
	EDataType getAny();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexBoolean <em>Complex Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Boolean</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexBoolean
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexBoolean"
	 * @generated
	 */
	EDataType getComplexBoolean();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexByte <em>Complex Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Byte</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexByte
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexByte"
	 * @generated
	 */
	EDataType getComplexByte();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexDouble <em>Complex Double</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Double</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexDouble
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexDouble"
	 * @generated
	 */
	EDataType getComplexDouble();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexFloat <em>Complex Float</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Float</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexFloat
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexFloat"
	 * @generated
	 */
	EDataType getComplexFloat();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexLong <em>Complex Long</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Long</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexLong
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexLong"
	 * @generated
	 */
	EDataType getComplexLong();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexLongLong <em>Complex Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Long Long</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexLongLong
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexLongLong"
	 * @generated
	 */
	EDataType getComplexLongLong();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexOctet <em>Complex Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 6.2
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Octet</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexOctet
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexOctet"
	 * @generated
	 */
	EDataType getComplexOctet();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexShort <em>Complex Short</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Short</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexShort
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexShort"
	 * @generated
	 */
	EDataType getComplexShort();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexUByte <em>Complex UByte</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex UByte</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexUByte
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexUByte"
	 * @generated
	 */
	EDataType getComplexUByte();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexULong <em>Complex ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex ULong</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexULong
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexULong"
	 * @generated
	 */
	EDataType getComplexULong();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexULongLong <em>Complex ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex ULong Long</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexULongLong
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexULongLong"
	 * @generated
	 */
	EDataType getComplexULongLong();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.math.ComplexUShort <em>Complex UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex UShort</em>'.
	 * @see mil.jpeojtrs.sca.util.math.ComplexUShort
	 * @model instanceClass="mil.jpeojtrs.sca.util.math.ComplexUShort"
	 * @generated
	 */
	EDataType getComplexUShort();

	/**
	 * Returns the meta object for data type '{@link mil.jpeojtrs.sca.util.time.UTCTime <em>UTC Time</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 6.2
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UTC Time</em>'.
	 * @see mil.jpeojtrs.sca.util.time.UTCTime
	 * @model instanceClass="mil.jpeojtrs.sca.util.time.UTCTime"
	 * @generated
	 */
	EDataType getUTCTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrfFactory getPrfFactory();

	/**
	 * The feature id for the '<em><b>Struct Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @deprecated Switch to using {@link #STRUCT_SEQUENCE__STRUCT_VALUE}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	@Deprecated
	int STRUCT_SEQUENCE__STRUCTVALUE = STRUCT_SEQUENCE__STRUCT_VALUE;

	/**
	 * The feature id for the '<em><b>Configuration Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * @deprecated Switch to using {@link #STRUCT_SEQUENCE__CONFIGURATION_KIND}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @ordered
	 */
	@Deprecated
	int STRUCT_SEQUENCE__CONFIGURATIONKIND = STRUCT_SEQUENCE__CONFIGURATION_KIND;

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.AbstractPropertyImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAbstractProperty()
		 * @generated
		 */
		EClass ABSTRACT_PROPERTY = eINSTANCE.getAbstractProperty();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY__DESCRIPTION = eINSTANCE.getAbstractProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY__ID = eINSTANCE.getAbstractProperty_Id();

		/**
		 * The meta object literal for the '<em><b>Local Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY__LOCAL_MODE = eINSTANCE.getAbstractProperty_LocalMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY__NAME = eINSTANCE.getAbstractProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY__MODE = eINSTANCE.getAbstractProperty_Mode();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.ActionImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.ConfigurationKindImpl <em>Configuration Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.ConfigurationKindImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getConfigurationKind()
		 * @generated
		 */
		EClass CONFIGURATION_KIND = eINSTANCE.getConfigurationKind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_KIND__TYPE = eINSTANCE.getConfigurationKind_Type();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.EnumerationImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__LABEL = eINSTANCE.getEnumeration_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__VALUE = eINSTANCE.getEnumeration_Value();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.EnumerationsImpl <em>Enumerations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.EnumerationsImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getEnumerations()
		 * @generated
		 */
		EClass ENUMERATIONS = eINSTANCE.getEnumerations();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATIONS__ENUMERATION = eINSTANCE.getEnumerations_Enumeration();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.InputValueImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__SIMPLE = eINSTANCE.getInputValue_Simple();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.KindImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIND__TYPE = eINSTANCE.getKind_Type();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.PrfDocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.PrfDocumentRootImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPrfDocumentRoot()
		 * @generated
		 */
		EClass PRF_DOCUMENT_ROOT = eINSTANCE.getPrfDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRF_DOCUMENT_ROOT__MIXED = eINSTANCE.getPrfDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRF_DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getPrfDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRF_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getPrfDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRF_DOCUMENT_ROOT__PROPERTIES = eINSTANCE.getPrfDocumentRoot_Properties();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.PropertiesImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__DESCRIPTION = eINSTANCE.getProperties_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__SIMPLE = eINSTANCE.getProperties_Simple();

		/**
		 * The meta object literal for the '<em><b>Simple Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__SIMPLE_SEQUENCE = eINSTANCE.getProperties_SimpleSequence();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__TEST = eINSTANCE.getProperties_Test();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__STRUCT = eINSTANCE.getProperties_Struct();

		/**
		 * The meta object literal for the '<em><b>Struct Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__STRUCT_SEQUENCE = eINSTANCE.getProperties_StructSequence();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.RangeImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.ResultValueImpl <em>Result Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.ResultValueImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getResultValue()
		 * @generated
		 */
		EClass RESULT_VALUE = eINSTANCE.getResultValue();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_VALUE__SIMPLE = eINSTANCE.getResultValue_Simple();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.SimpleImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__VALUE = eINSTANCE.getSimple_Value();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__UNITS = eINSTANCE.getSimple_Units();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__RANGE = eINSTANCE.getSimple_Range();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__ENUMERATIONS = eINSTANCE.getSimple_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__KIND = eINSTANCE.getSimple_Kind();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__ACTION = eINSTANCE.getSimple_Action();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__TYPE = eINSTANCE.getSimple_Type();

		/**
		 * The meta object literal for the '<em><b>Complex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__COMPLEX = eINSTANCE.getSimple_Complex();

		/**
		 * The meta object literal for the '<em><b>Commandline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__COMMANDLINE = eINSTANCE.getSimple_Commandline();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE__OPTIONAL = eINSTANCE.getSimple_Optional();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl <em>Simple Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.SimpleSequenceImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimpleSequence()
		 * @generated
		 */
		EClass SIMPLE_SEQUENCE = eINSTANCE.getSimpleSequence();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SEQUENCE__VALUES = eINSTANCE.getSimpleSequence_Values();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SEQUENCE__UNITS = eINSTANCE.getSimpleSequence_Units();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SEQUENCE__RANGE = eINSTANCE.getSimpleSequence_Range();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SEQUENCE__KIND = eINSTANCE.getSimpleSequence_Kind();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SEQUENCE__ACTION = eINSTANCE.getSimpleSequence_Action();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SEQUENCE__TYPE = eINSTANCE.getSimpleSequence_Type();

		/**
		 * The meta object literal for the '<em><b>Complex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SEQUENCE__COMPLEX = eINSTANCE.getSimpleSequence_Complex();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SEQUENCE__OPTIONAL = eINSTANCE.getSimpleSequence_Optional();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.StructImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__FIELDS = eINSTANCE.getStruct_Fields();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__SIMPLE = eINSTANCE.getStruct_Simple();

		/**
		 * The meta object literal for the '<em><b>Simple Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__SIMPLE_SEQUENCE = eINSTANCE.getStruct_SimpleSequence();

		/**
		 * The meta object literal for the '<em><b>Configuration Kind</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__CONFIGURATION_KIND = eINSTANCE.getStruct_ConfigurationKind();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.StructSequenceImpl <em>Struct Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.StructSequenceImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructSequence()
		 * @generated
		 */
		EClass STRUCT_SEQUENCE = eINSTANCE.getStructSequence();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_SEQUENCE__STRUCT = eINSTANCE.getStructSequence_Struct();

		/**
		 * The meta object literal for the '<em><b>Struct Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_SEQUENCE__STRUCT_VALUE = eINSTANCE.getStructSequence_StructValue();

		/**
		 * The meta object literal for the '<em><b>Configuration Kind</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_SEQUENCE__CONFIGURATION_KIND = eINSTANCE.getStructSequence_ConfigurationKind();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.StructValueImpl <em>Struct Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.StructValueImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructValue()
		 * @generated
		 */
		EClass STRUCT_VALUE = eINSTANCE.getStructValue();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_VALUE__REFS = eINSTANCE.getStructValue_Refs();

		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_VALUE__SIMPLE_REF = eINSTANCE.getStructValue_SimpleRef();

		/**
		 * The meta object literal for the '<em><b>Simple Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_VALUE__SIMPLE_SEQUENCE_REF = eINSTANCE.getStructValue_SimpleSequenceRef();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_VALUE__STRUCT = eINSTANCE.getStructValue_Struct();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_VALUE__INDEX = eINSTANCE.getStructValue_Index();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.TestImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__DESCRIPTION = eINSTANCE.getTest_Description();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__INPUT_VALUE = eINSTANCE.getTest_InputValue();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__RESULT_VALUE = eINSTANCE.getTest_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ID = eINSTANCE.getTest_Id();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.ValuesImpl <em>Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.ValuesImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getValues()
		 * @generated
		 */
		EClass VALUES = eINSTANCE.getValues();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES__VALUE = eINSTANCE.getValues_Value();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.PropertyContainer <em>Property Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.PropertyContainer
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyContainer()
		 * @generated
		 */
		EClass PROPERTY_CONTAINER = eINSTANCE.getPropertyContainer();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.AbstractPropertyRefImpl <em>Abstract Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.AbstractPropertyRefImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAbstractPropertyRef()
		 * @generated
		 */
		EClass ABSTRACT_PROPERTY_REF = eINSTANCE.getAbstractPropertyRef();

		/**
		 * The meta object literal for the '<em><b>Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROPERTY_REF__REF_ID = eINSTANCE.getAbstractPropertyRef_RefID();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROPERTY_REF__PROPERTY = eINSTANCE.getAbstractPropertyRef_Property();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer <em>Property Ref Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyRefContainer()
		 * @generated
		 */
		EClass PROPERTY_REF_CONTAINER = eINSTANCE.getPropertyRefContainer();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl <em>Property Ref Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.PropertyRefGroupImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyRefGroup()
		 * @generated
		 */
		EClass PROPERTY_REF_GROUP = eINSTANCE.getPropertyRefGroup();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REF_GROUP__PROPERTIES = eINSTANCE.getPropertyRefGroup_Properties();

		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_GROUP__SIMPLE_REF = eINSTANCE.getPropertyRefGroup_SimpleRef();

		/**
		 * The meta object literal for the '<em><b>Simple Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF = eINSTANCE.getPropertyRefGroup_SimpleSequenceRef();

		/**
		 * The meta object literal for the '<em><b>Struct Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_GROUP__STRUCT_REF = eINSTANCE.getPropertyRefGroup_StructRef();

		/**
		 * The meta object literal for the '<em><b>Struct Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF = eINSTANCE.getPropertyRefGroup_StructSequenceRef();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl <em>Property Ref Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.PropertyRefSetImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyRefSet()
		 * @generated
		 */
		EClass PROPERTY_REF_SET = eINSTANCE.getPropertyRefSet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REF_SET__PROPERTIES = eINSTANCE.getPropertyRefSet_Properties();

		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_SET__SIMPLE_REF = eINSTANCE.getPropertyRefSet_SimpleRef();

		/**
		 * The meta object literal for the '<em><b>Simple Sequence Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF = eINSTANCE.getPropertyRefSet_SimpleSequenceRef();

		/**
		 * The meta object literal for the '<em><b>Struct Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_SET__STRUCT_REF = eINSTANCE.getPropertyRefSet_StructRef();

		/**
		 * The meta object literal for the '<em><b>Struct Sequence Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_REF_SET__STRUCT_SEQUENCE_REF = eINSTANCE.getPropertyRefSet_StructSequenceRef();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleRefImpl <em>Simple Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.SimpleRefImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimpleRef()
		 * @generated
		 */
		EClass SIMPLE_REF = eINSTANCE.getSimpleRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_REF__VALUE = eINSTANCE.getSimpleRef_Value();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.SimpleSequenceRefImpl <em>Simple Sequence Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.SimpleSequenceRefImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getSimpleSequenceRef()
		 * @generated
		 */
		EClass SIMPLE_SEQUENCE_REF = eINSTANCE.getSimpleSequenceRef();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SEQUENCE_REF__VALUES = eINSTANCE.getSimpleSequenceRef_Values();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.StructRefImpl <em>Struct Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.StructRefImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructRef()
		 * @generated
		 */
		EClass STRUCT_REF = eINSTANCE.getStructRef();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT_REF__REFS = eINSTANCE.getStructRef_Refs();

		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_REF__SIMPLE_REF = eINSTANCE.getStructRef_SimpleRef();

		/**
		 * The meta object literal for the '<em><b>Simple Sequence Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 5.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_REF__SIMPLE_SEQUENCE_REF = eINSTANCE.getStructRef_SimpleSequenceRef();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.impl.StructSequenceRefImpl <em>Struct Sequence Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.impl.StructSequenceRefImpl
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructSequenceRef()
		 * @generated
		 */
		EClass STRUCT_SEQUENCE_REF = eINSTANCE.getStructSequenceRef();

		/**
		 * The meta object literal for the '<em><b>Struct Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_SEQUENCE_REF__STRUCT_VALUE = eINSTANCE.getStructSequenceRef_StructValue();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.AccessType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.ActionType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.PropertyConfigurationType <em>Property Configuration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.PropertyConfigurationType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyConfigurationType()
		 * @generated
		 */
		EEnum PROPERTY_CONFIGURATION_TYPE = eINSTANCE.getPropertyConfigurationType();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.PropertyValueType <em>Property Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.PropertyValueType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyValueType()
		 * @generated
		 */
		EEnum PROPERTY_VALUE_TYPE = eINSTANCE.getPropertyValueType();

		/**
		 * The meta object literal for the '{@link mil.jpeojtrs.sca.prf.StructPropertyConfigurationType <em>Struct Property Configuration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructPropertyConfigurationType()
		 * @generated
		 */
		EEnum STRUCT_PROPERTY_CONFIGURATION_TYPE = eINSTANCE.getStructPropertyConfigurationType();

		/**
		 * The meta object literal for the '<em>Access Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.AccessType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAccessTypeObject()
		 * @generated
		 */
		EDataType ACCESS_TYPE_OBJECT = eINSTANCE.getAccessTypeObject();

		/**
		 * The meta object literal for the '<em>Action Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.ActionType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getActionTypeObject()
		 * @generated
		 */
		EDataType ACTION_TYPE_OBJECT = eINSTANCE.getActionTypeObject();

		/**
		 * The meta object literal for the '<em>Character Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Character
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getCharacterObject()
		 * @generated
		 */
		EDataType CHARACTER_OBJECT = eINSTANCE.getCharacterObject();

		/**
		 * The meta object literal for the '<em>Dce UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getDceUUID()
		 * @generated
		 */
		EDataType DCE_UUID = eINSTANCE.getDceUUID();

		/**
		 * The meta object literal for the '<em>Property Configuration Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.PropertyConfigurationType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyConfigurationTypeObject()
		 * @generated
		 */
		EDataType PROPERTY_CONFIGURATION_TYPE_OBJECT = eINSTANCE.getPropertyConfigurationTypeObject();

		/**
		 * The meta object literal for the '<em>Property Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.PropertyValueType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getPropertyValueTypeObject()
		 * @generated
		 */
		EDataType PROPERTY_VALUE_TYPE_OBJECT = eINSTANCE.getPropertyValueTypeObject();

		/**
		 * The meta object literal for the '<em>Struct Property Configuration Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.prf.StructPropertyConfigurationType
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getStructPropertyConfigurationTypeObject()
		 * @generated
		 */
		EDataType STRUCT_PROPERTY_CONFIGURATION_TYPE_OBJECT = eINSTANCE.getStructPropertyConfigurationTypeObject();

		/**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getUnit()
		 * @generated
		 */
		EDataType UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em>Any</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.CORBA.Any
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getAny()
		 * @generated
		 */
		EDataType ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '<em>Complex Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexBoolean
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexBoolean()
		 * @generated
		 */
		EDataType COMPLEX_BOOLEAN = eINSTANCE.getComplexBoolean();

		/**
		 * The meta object literal for the '<em>Complex Byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexByte
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexByte()
		 * @generated
		 */
		EDataType COMPLEX_BYTE = eINSTANCE.getComplexByte();

		/**
		 * The meta object literal for the '<em>Complex Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexDouble
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexDouble()
		 * @generated
		 */
		EDataType COMPLEX_DOUBLE = eINSTANCE.getComplexDouble();

		/**
		 * The meta object literal for the '<em>Complex Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexFloat
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexFloat()
		 * @generated
		 */
		EDataType COMPLEX_FLOAT = eINSTANCE.getComplexFloat();

		/**
		 * The meta object literal for the '<em>Complex Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexLong
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexLong()
		 * @generated
		 */
		EDataType COMPLEX_LONG = eINSTANCE.getComplexLong();

		/**
		 * The meta object literal for the '<em>Complex Long Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexLongLong
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexLongLong()
		 * @generated
		 */
		EDataType COMPLEX_LONG_LONG = eINSTANCE.getComplexLongLong();

		/**
		 * The meta object literal for the '<em>Complex Octet</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 6.2
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexOctet
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexOctet()
		 * @generated
		 */
		EDataType COMPLEX_OCTET = eINSTANCE.getComplexOctet();

		/**
		 * The meta object literal for the '<em>Complex Short</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexShort
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexShort()
		 * @generated
		 */
		EDataType COMPLEX_SHORT = eINSTANCE.getComplexShort();

		/**
		 * The meta object literal for the '<em>Complex UByte</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexUByte
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexUByte()
		 * @generated
		 */
		EDataType COMPLEX_UBYTE = eINSTANCE.getComplexUByte();

		/**
		 * The meta object literal for the '<em>Complex ULong</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexULong
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexULong()
		 * @generated
		 */
		EDataType COMPLEX_ULONG = eINSTANCE.getComplexULong();

		/**
		 * The meta object literal for the '<em>Complex ULong Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexULongLong
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexULongLong()
		 * @generated
		 */
		EDataType COMPLEX_ULONG_LONG = eINSTANCE.getComplexULongLong();

		/**
		 * The meta object literal for the '<em>Complex UShort</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 3.0
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.math.ComplexUShort
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getComplexUShort()
		 * @generated
		 */
		EDataType COMPLEX_USHORT = eINSTANCE.getComplexUShort();

		/**
		 * The meta object literal for the '<em>UTC Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * @since 6.2
		 * <!-- end-user-doc -->
		 * @see mil.jpeojtrs.sca.util.time.UTCTime
		 * @see mil.jpeojtrs.sca.prf.impl.PrfPackageImpl#getUTCTime()
		 * @generated
		 */
		EDataType UTC_TIME = eINSTANCE.getUTCTime();

		/**
		 * <!-- begin-user-doc -->
		 * @deprecated Switch to using {@link #STRUCT_SEQUENCE__STRUCT_VALUE}
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		@Deprecated
		EReference STRUCT_SEQUENCE__STRUCTVALUE = STRUCT_SEQUENCE__STRUCT_VALUE;

		/**
		 * The meta object literal for the '<em><b>Configuration Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @deprecated Switch to using {@link #STRUCT_SEQUENCE__CONFIGURATION_KIND}
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		@Deprecated
		EReference STRUCT_SEQUENCE__CONFIGURATIONKIND = STRUCT_SEQUENCE__CONFIGURATION_KIND;

		/**
		 * The meta object literal for the '<em><b>Simple Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @deprecated Switch to using {@link #STRUCT_VALUE__SIMPLE_REF}
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		@Deprecated
		EReference STRUCT_VALUE__SIMPLEREF = STRUCT_VALUE__SIMPLE_REF;

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * @deprecated Switch to using {@link #TEST__INPUT_VALUE}
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		@Deprecated
		EReference TEST__INPUTVALUE = TEST__INPUT_VALUE;

	}

} // PrfPackage

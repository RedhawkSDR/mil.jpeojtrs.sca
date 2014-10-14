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
import mil.jpeojtrs.sca.prf.PrfFactory;
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
import mil.jpeojtrs.sca.prf.util.PrfValidator;
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
import mil.jpeojtrs.sca.validator.AdvancedEObjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrfPackageImpl extends EPackageImpl implements PrfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationKindEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prfDocumentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSequenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structSequenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structValueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyContainerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefContainerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefGroupEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefSetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSequenceRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structSequenceRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyConfigurationTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyValueTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structPropertyConfigurationTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dceUUIDEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyConfigurationTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyValueTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType structPropertyConfigurationTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexBooleanEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexByteEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexDoubleEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexFloatEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexLongEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexLongLongEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexShortEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexUByteEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexULongEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexULongLongEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType complexUShortEDataType = null;

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
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrfPackageImpl() {
		super(eNS_URI, PrfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrfPackage initGen() {
		if (isInited) return (PrfPackage)EPackage.Registry.INSTANCE.getEPackage(PrfPackage.eNS_URI);

		// Obtain or create and register package
		PrfPackageImpl thePrfPackage = (PrfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrfPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePrfPackage.createPackageContents();

		// Initialize created meta-data
		thePrfPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePrfPackage, 
			 new EValidator.Descriptor()
			 {
				 @Override
				public EValidator getEValidator()
				 {
					 return PrfValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePrfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrfPackage.eNS_URI, thePrfPackage);
		return thePrfPackage;
	}

	public static PrfPackage init() {
		final PrfPackage retVal = PrfPackageImpl.initGen();

		// Register package validator
		EValidator.Registry.INSTANCE.put(retVal, new EValidator.Descriptor() {
			AdvancedEObjectValidator validator = new AdvancedEObjectValidator(PrfValidator.INSTANCE);
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
	public EClass getAbstractProperty() {
		return abstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractProperty_Description() {
		return (EAttribute)abstractPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractProperty_Id() {
		return (EAttribute)abstractPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractProperty_LocalMode() {
		return (EAttribute)abstractPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractProperty_Name() {
		return (EAttribute)abstractPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractProperty_Mode() {
		return (EAttribute)abstractPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Type() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationKind() {
		return configurationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationKind_Type() {
		return (EAttribute)configurationKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_Label() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_Value() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerations() {
		return enumerationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerations_Enumeration() {
		return (EReference)enumerationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputValue_Simple() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKind() {
		return kindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKind_Type() {
		return (EAttribute)kindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrfDocumentRoot() {
		return prfDocumentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrfDocumentRoot_Mixed() {
		return (EAttribute)prfDocumentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrfDocumentRoot_XMLNSPrefixMap() {
		return (EReference)prfDocumentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrfDocumentRoot_XSISchemaLocation() {
		return (EReference)prfDocumentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrfDocumentRoot_Properties() {
		return (EReference)prfDocumentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperties_Description() {
		return (EAttribute)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperties_Properties() {
		return (EAttribute)propertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperties_Simple() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperties_SimpleSequence() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperties_Test() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperties_Struct() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperties_StructSequence() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_Max() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRange_Min() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultValue() {
		return resultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultValue_Simple() {
		return (EReference)resultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_Value() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_Units() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_Range() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_Enumerations() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_Kind() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimple_Action() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_Type() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimple_Complex() {
		return (EAttribute)simpleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleSequence() {
		return simpleSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleSequence_Values() {
		return (EReference)simpleSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleSequence_Units() {
		return (EAttribute)simpleSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleSequence_Range() {
		return (EReference)simpleSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleSequence_Kind() {
		return (EReference)simpleSequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleSequence_Action() {
		return (EReference)simpleSequenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleSequence_Type() {
		return (EAttribute)simpleSequenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleSequence_Complex() {
		return (EAttribute)simpleSequenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStruct_Simple() {
		return (EReference)structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStruct_ConfigurationKind() {
		return (EReference)structEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructSequence() {
		return structSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructSequence_Struct() {
		return (EReference)structSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructSequence_StructValue() {
		return (EReference)structSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructSequence_ConfigurationKind() {
		return (EReference)structSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructValue() {
		return structValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructValue_SimpleRef() {
		return (EReference)structValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructValue_Struct() {
		return (EReference)structValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStructValue_Index() {
		return (EAttribute)structValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTest_Description() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTest_InputValue() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTest_ResultValue() {
		return (EReference)testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTest_Id() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValues() {
		return valuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValues_Value() {
		return (EAttribute)valuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyContainer() {
		return propertyContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractPropertyRef() {
		return abstractPropertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractPropertyRef_RefID() {
		return (EAttribute)abstractPropertyRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractPropertyRef_Property() {
		return (EReference)abstractPropertyRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyRefContainer() {
		return propertyRefContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyRefGroup() {
		return propertyRefGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyRefGroup_Properties() {
		return (EAttribute)propertyRefGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefGroup_SimpleRef() {
		return (EReference)propertyRefGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefGroup_SimpleSequenceRef() {
		return (EReference)propertyRefGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefGroup_StructRef() {
		return (EReference)propertyRefGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefGroup_StructSequenceRef() {
		return (EReference)propertyRefGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyRefSet() {
		return propertyRefSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyRefSet_Properties() {
		return (EAttribute)propertyRefSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefSet_SimpleRef() {
		return (EReference)propertyRefSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefSet_SimpleSequenceRef() {
		return (EReference)propertyRefSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefSet_StructRef() {
		return (EReference)propertyRefSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyRefSet_StructSequenceRef() {
		return (EReference)propertyRefSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleRef() {
		return simpleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleRef_Value() {
		return (EAttribute)simpleRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleSequenceRef() {
		return simpleSequenceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleSequenceRef_Values() {
		return (EReference)simpleSequenceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructRef() {
		return structRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructRef_SimpleRef() {
		return (EReference)structRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructSequenceRef() {
		return structSequenceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructSequenceRef_StructValue() {
		return (EReference)structSequenceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyConfigurationType() {
		return propertyConfigurationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyValueType() {
		return propertyValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStructPropertyConfigurationType() {
		return structPropertyConfigurationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAccessTypeObject() {
		return accessTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getActionTypeObject() {
		return actionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCharacterObject() {
		return characterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDceUUID() {
		return dceUUIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPropertyConfigurationTypeObject() {
		return propertyConfigurationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPropertyValueTypeObject() {
		return propertyValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStructPropertyConfigurationTypeObject() {
		return structPropertyConfigurationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnit() {
		return unitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAny() {
		return anyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexBoolean() {
		return complexBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexByte() {
		return complexByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexDouble() {
		return complexDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexFloat() {
		return complexFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexLong() {
		return complexLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexLongLong() {
		return complexLongLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexShort() {
		return complexShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexUByte() {
		return complexUByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexULong() {
		return complexULongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexULongLong() {
		return complexULongLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComplexUShort() {
		return complexUShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrfFactory getPrfFactory() {
		return (PrfFactory)getEFactoryInstance();
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
		abstractPropertyEClass = createEClass(ABSTRACT_PROPERTY);
		createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__DESCRIPTION);
		createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__ID);
		createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__LOCAL_MODE);
		createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__NAME);
		createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__MODE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__TYPE);

		configurationKindEClass = createEClass(CONFIGURATION_KIND);
		createEAttribute(configurationKindEClass, CONFIGURATION_KIND__TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEAttribute(enumerationEClass, ENUMERATION__LABEL);
		createEAttribute(enumerationEClass, ENUMERATION__VALUE);

		enumerationsEClass = createEClass(ENUMERATIONS);
		createEReference(enumerationsEClass, ENUMERATIONS__ENUMERATION);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__SIMPLE);

		kindEClass = createEClass(KIND);
		createEAttribute(kindEClass, KIND__TYPE);

		prfDocumentRootEClass = createEClass(PRF_DOCUMENT_ROOT);
		createEAttribute(prfDocumentRootEClass, PRF_DOCUMENT_ROOT__MIXED);
		createEReference(prfDocumentRootEClass, PRF_DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(prfDocumentRootEClass, PRF_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(prfDocumentRootEClass, PRF_DOCUMENT_ROOT__PROPERTIES);

		propertiesEClass = createEClass(PROPERTIES);
		createEAttribute(propertiesEClass, PROPERTIES__DESCRIPTION);
		createEAttribute(propertiesEClass, PROPERTIES__PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__SIMPLE);
		createEReference(propertiesEClass, PROPERTIES__SIMPLE_SEQUENCE);
		createEReference(propertiesEClass, PROPERTIES__TEST);
		createEReference(propertiesEClass, PROPERTIES__STRUCT);
		createEReference(propertiesEClass, PROPERTIES__STRUCT_SEQUENCE);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__MAX);
		createEAttribute(rangeEClass, RANGE__MIN);

		resultValueEClass = createEClass(RESULT_VALUE);
		createEReference(resultValueEClass, RESULT_VALUE__SIMPLE);

		simpleEClass = createEClass(SIMPLE);
		createEAttribute(simpleEClass, SIMPLE__VALUE);
		createEAttribute(simpleEClass, SIMPLE__UNITS);
		createEReference(simpleEClass, SIMPLE__RANGE);
		createEReference(simpleEClass, SIMPLE__ENUMERATIONS);
		createEReference(simpleEClass, SIMPLE__KIND);
		createEReference(simpleEClass, SIMPLE__ACTION);
		createEAttribute(simpleEClass, SIMPLE__TYPE);
		createEAttribute(simpleEClass, SIMPLE__COMPLEX);

		simpleSequenceEClass = createEClass(SIMPLE_SEQUENCE);
		createEReference(simpleSequenceEClass, SIMPLE_SEQUENCE__VALUES);
		createEAttribute(simpleSequenceEClass, SIMPLE_SEQUENCE__UNITS);
		createEReference(simpleSequenceEClass, SIMPLE_SEQUENCE__RANGE);
		createEReference(simpleSequenceEClass, SIMPLE_SEQUENCE__KIND);
		createEReference(simpleSequenceEClass, SIMPLE_SEQUENCE__ACTION);
		createEAttribute(simpleSequenceEClass, SIMPLE_SEQUENCE__TYPE);
		createEAttribute(simpleSequenceEClass, SIMPLE_SEQUENCE__COMPLEX);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__SIMPLE);
		createEReference(structEClass, STRUCT__CONFIGURATION_KIND);

		structSequenceEClass = createEClass(STRUCT_SEQUENCE);
		createEReference(structSequenceEClass, STRUCT_SEQUENCE__STRUCT);
		createEReference(structSequenceEClass, STRUCT_SEQUENCE__STRUCT_VALUE);
		createEReference(structSequenceEClass, STRUCT_SEQUENCE__CONFIGURATION_KIND);

		structValueEClass = createEClass(STRUCT_VALUE);
		createEReference(structValueEClass, STRUCT_VALUE__SIMPLE_REF);
		createEReference(structValueEClass, STRUCT_VALUE__STRUCT);
		createEAttribute(structValueEClass, STRUCT_VALUE__INDEX);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__DESCRIPTION);
		createEReference(testEClass, TEST__INPUT_VALUE);
		createEReference(testEClass, TEST__RESULT_VALUE);
		createEAttribute(testEClass, TEST__ID);

		valuesEClass = createEClass(VALUES);
		createEAttribute(valuesEClass, VALUES__VALUE);

		propertyContainerEClass = createEClass(PROPERTY_CONTAINER);

		abstractPropertyRefEClass = createEClass(ABSTRACT_PROPERTY_REF);
		createEAttribute(abstractPropertyRefEClass, ABSTRACT_PROPERTY_REF__REF_ID);
		createEReference(abstractPropertyRefEClass, ABSTRACT_PROPERTY_REF__PROPERTY);

		propertyRefContainerEClass = createEClass(PROPERTY_REF_CONTAINER);

		propertyRefGroupEClass = createEClass(PROPERTY_REF_GROUP);
		createEAttribute(propertyRefGroupEClass, PROPERTY_REF_GROUP__PROPERTIES);
		createEReference(propertyRefGroupEClass, PROPERTY_REF_GROUP__SIMPLE_REF);
		createEReference(propertyRefGroupEClass, PROPERTY_REF_GROUP__SIMPLE_SEQUENCE_REF);
		createEReference(propertyRefGroupEClass, PROPERTY_REF_GROUP__STRUCT_REF);
		createEReference(propertyRefGroupEClass, PROPERTY_REF_GROUP__STRUCT_SEQUENCE_REF);

		propertyRefSetEClass = createEClass(PROPERTY_REF_SET);
		createEAttribute(propertyRefSetEClass, PROPERTY_REF_SET__PROPERTIES);
		createEReference(propertyRefSetEClass, PROPERTY_REF_SET__SIMPLE_REF);
		createEReference(propertyRefSetEClass, PROPERTY_REF_SET__SIMPLE_SEQUENCE_REF);
		createEReference(propertyRefSetEClass, PROPERTY_REF_SET__STRUCT_REF);
		createEReference(propertyRefSetEClass, PROPERTY_REF_SET__STRUCT_SEQUENCE_REF);

		simpleRefEClass = createEClass(SIMPLE_REF);
		createEAttribute(simpleRefEClass, SIMPLE_REF__VALUE);

		simpleSequenceRefEClass = createEClass(SIMPLE_SEQUENCE_REF);
		createEReference(simpleSequenceRefEClass, SIMPLE_SEQUENCE_REF__VALUES);

		structRefEClass = createEClass(STRUCT_REF);
		createEReference(structRefEClass, STRUCT_REF__SIMPLE_REF);

		structSequenceRefEClass = createEClass(STRUCT_SEQUENCE_REF);
		createEReference(structSequenceRefEClass, STRUCT_SEQUENCE_REF__STRUCT_VALUE);

		// Create enums
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		propertyConfigurationTypeEEnum = createEEnum(PROPERTY_CONFIGURATION_TYPE);
		propertyValueTypeEEnum = createEEnum(PROPERTY_VALUE_TYPE);
		structPropertyConfigurationTypeEEnum = createEEnum(STRUCT_PROPERTY_CONFIGURATION_TYPE);

		// Create data types
		accessTypeObjectEDataType = createEDataType(ACCESS_TYPE_OBJECT);
		actionTypeObjectEDataType = createEDataType(ACTION_TYPE_OBJECT);
		characterObjectEDataType = createEDataType(CHARACTER_OBJECT);
		dceUUIDEDataType = createEDataType(DCE_UUID);
		propertyConfigurationTypeObjectEDataType = createEDataType(PROPERTY_CONFIGURATION_TYPE_OBJECT);
		propertyValueTypeObjectEDataType = createEDataType(PROPERTY_VALUE_TYPE_OBJECT);
		structPropertyConfigurationTypeObjectEDataType = createEDataType(STRUCT_PROPERTY_CONFIGURATION_TYPE_OBJECT);
		unitEDataType = createEDataType(UNIT);
		anyEDataType = createEDataType(ANY);
		complexBooleanEDataType = createEDataType(COMPLEX_BOOLEAN);
		complexByteEDataType = createEDataType(COMPLEX_BYTE);
		complexDoubleEDataType = createEDataType(COMPLEX_DOUBLE);
		complexFloatEDataType = createEDataType(COMPLEX_FLOAT);
		complexLongEDataType = createEDataType(COMPLEX_LONG);
		complexLongLongEDataType = createEDataType(COMPLEX_LONG_LONG);
		complexShortEDataType = createEDataType(COMPLEX_SHORT);
		complexUByteEDataType = createEDataType(COMPLEX_UBYTE);
		complexULongEDataType = createEDataType(COMPLEX_ULONG);
		complexULongLongEDataType = createEDataType(COMPLEX_ULONG_LONG);
		complexUShortEDataType = createEDataType(COMPLEX_USHORT);
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

		// Create type parameters
		ETypeParameter abstractPropertyRefEClass_P = addETypeParameter(abstractPropertyRefEClass, "P");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getAbstractProperty());
		abstractPropertyRefEClass_P.getEBounds().add(g1);

		// Add supertypes to classes
		propertiesEClass.getESuperTypes().add(this.getPropertyContainer());
		simpleEClass.getESuperTypes().add(this.getAbstractProperty());
		simpleSequenceEClass.getESuperTypes().add(this.getAbstractProperty());
		structEClass.getESuperTypes().add(this.getAbstractProperty());
		structEClass.getESuperTypes().add(this.getPropertyContainer());
		structSequenceEClass.getESuperTypes().add(this.getAbstractProperty());
		structSequenceEClass.getESuperTypes().add(this.getPropertyContainer());
		structValueEClass.getESuperTypes().add(this.getPropertyRefContainer());
		propertyRefGroupEClass.getESuperTypes().add(this.getPropertyRefContainer());
		propertyRefSetEClass.getESuperTypes().add(this.getPropertyRefContainer());
		g1 = createEGenericType(this.getAbstractPropertyRef());
		EGenericType g2 = createEGenericType(this.getSimple());
		g1.getETypeArguments().add(g2);
		simpleRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractPropertyRef());
		g2 = createEGenericType(this.getSimpleSequence());
		g1.getETypeArguments().add(g2);
		simpleSequenceRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractPropertyRef());
		g2 = createEGenericType(this.getStruct());
		g1.getETypeArguments().add(g2);
		structRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPropertyRefContainer());
		structRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractPropertyRef());
		g2 = createEGenericType(this.getStructSequence());
		g1.getETypeArguments().add(g2);
		structSequenceRefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPropertyRefContainer());
		structSequenceRefEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(abstractPropertyEClass, AbstractProperty.class, "AbstractProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractProperty_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractProperty_Id(), theXMLTypePackage.getToken(), "id", null, 1, 1, AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractProperty_LocalMode(), this.getAccessType(), "localMode", "readwrite", 0, 1, AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractProperty_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractProperty_Mode(), this.getAccessType(), "mode", null, 0, 1, AbstractProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(abstractPropertyEClass, this.getAny(), "toAny", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Type(), this.getActionType(), "type", "external", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationKindEClass, ConfigurationKind.class, "ConfigurationKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationKind_Type(), this.getStructPropertyConfigurationType(), "type", "configure", 0, 1, ConfigurationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeration_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumeration_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationsEClass, Enumerations.class, "Enumerations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerations_Enumeration(), this.getEnumeration(), null, "enumeration", null, 1, -1, Enumerations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_Simple(), this.getSimple(), null, "simple", null, 1, -1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindEClass, Kind.class, "Kind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKind_Type(), this.getPropertyConfigurationType(), "type", "configure", 0, 1, Kind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prfDocumentRootEClass, PrfDocumentRoot.class, "PrfDocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrfDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrfDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrfDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrfDocumentRoot_Properties(), this.getProperties(), null, "properties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperties_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperties_Properties(), ecorePackage.getEFeatureMapEntry(), "properties", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_Simple(), this.getSimple(), null, "simple", null, 0, -1, Properties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_SimpleSequence(), this.getSimpleSequence(), null, "simpleSequence", null, 0, -1, Properties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_Test(), this.getTest(), null, "test", null, 0, -1, Properties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_Struct(), this.getStruct(), null, "struct", null, 0, -1, Properties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProperties_StructSequence(), this.getStructSequence(), null, "structSequence", null, 0, -1, Properties.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Max(), theEcorePackage.getEString(), "max", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Min(), theEcorePackage.getEString(), "min", null, 1, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultValueEClass, ResultValue.class, "ResultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultValue_Simple(), this.getSimple(), null, "simple", null, 1, -1, ResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_Units(), this.getUnit(), "units", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Range(), this.getRange(), null, "range", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Enumerations(), this.getEnumerations(), null, "enumerations", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Kind(), this.getKind(), null, "kind", null, 0, -1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple_Action(), this.getAction(), null, "action", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_Type(), this.getPropertyValueType(), "type", null, 1, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimple_Complex(), theEcorePackage.getEBooleanObject(), "complex", null, 0, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(simpleEClass, theEcorePackage.getEBoolean(), "isComplex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleSequenceEClass, SimpleSequence.class, "SimpleSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSequence_Values(), this.getValues(), null, "values", null, 0, 1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleSequence_Units(), this.getUnit(), "units", null, 0, 1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSequence_Range(), this.getRange(), null, "range", null, 0, 1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSequence_Kind(), this.getKind(), null, "kind", null, 0, -1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleSequence_Action(), this.getAction(), null, "action", null, 0, 1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleSequence_Type(), this.getPropertyValueType(), "type", null, 1, 1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleSequence_Complex(), theEcorePackage.getEBooleanObject(), "complex", null, 0, 1, SimpleSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(simpleSequenceEClass, theEcorePackage.getEBoolean(), "isComplex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Simple(), this.getSimple(), null, "simple", null, 1, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStruct_ConfigurationKind(), this.getConfigurationKind(), null, "configurationKind", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structSequenceEClass, StructSequence.class, "StructSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructSequence_Struct(), this.getStruct(), null, "struct", null, 1, 1, StructSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructSequence_StructValue(), this.getStructValue(), null, "structValue", null, 0, -1, StructSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructSequence_ConfigurationKind(), this.getConfigurationKind(), null, "configurationKind", null, 0, -1, StructSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structValueEClass, StructValue.class, "StructValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructValue_SimpleRef(), this.getSimpleRef(), null, "simpleRef", null, 1, -1, StructValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructValue_Struct(), this.getStruct(), null, "struct", null, 0, 1, StructValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructValue_Index(), theEcorePackage.getEInt(), "index", null, 0, 1, StructValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(structValueEClass, this.getAny(), "toAny", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(structValueEClass, this.getSimpleRef(), "getRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_InputValue(), this.getInputValue(), null, "inputValue", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_ResultValue(), this.getResultValue(), null, "resultValue", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuesEClass, Values.class, "Values", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValues_Value(), theXMLTypePackage.getString(), "value", null, 1, -1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyContainerEClass, PropertyContainer.class, "PropertyContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(propertyContainerEClass, this.getAbstractProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "repID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractPropertyRefEClass, AbstractPropertyRef.class, "AbstractPropertyRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPropertyRef_RefID(), ecorePackage.getEString(), "refID", null, 1, 1, AbstractPropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(abstractPropertyRefEClass_P);
		initEReference(getAbstractPropertyRef_Property(), g1, null, "property", null, 0, 1, AbstractPropertyRef.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(abstractPropertyRefEClass, this.getAny(), "toAny", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyRefContainerEClass, PropertyRefContainer.class, "PropertyRefContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(propertyRefContainerEClass, this.getPropertyContainer(), "getPropertyContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyRefGroupEClass, PropertyRefGroup.class, "PropertyRefGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyRefGroup_Properties(), ecorePackage.getEFeatureMapEntry(), "properties", null, 0, -1, PropertyRefGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefGroup_SimpleRef(), this.getSimpleRef(), null, "simpleRef", null, 0, -1, PropertyRefGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefGroup_SimpleSequenceRef(), this.getSimpleSequenceRef(), null, "simpleSequenceRef", null, 0, -1, PropertyRefGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefGroup_StructRef(), this.getStructRef(), null, "structRef", null, 0, -1, PropertyRefGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefGroup_StructSequenceRef(), this.getStructSequenceRef(), null, "structSequenceRef", null, 0, -1, PropertyRefGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyRefSetEClass, PropertyRefSet.class, "PropertyRefSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyRefSet_Properties(), ecorePackage.getEFeatureMapEntry(), "properties", null, 0, 1, PropertyRefSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefSet_SimpleRef(), this.getSimpleRef(), null, "simpleRef", null, 0, 1, PropertyRefSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefSet_SimpleSequenceRef(), this.getSimpleSequenceRef(), null, "simpleSequenceRef", null, 0, 1, PropertyRefSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefSet_StructRef(), this.getStructRef(), null, "structRef", null, 0, 1, PropertyRefSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyRefSet_StructSequenceRef(), this.getStructSequenceRef(), null, "structSequenceRef", null, 0, 1, PropertyRefSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(simpleRefEClass, SimpleRef.class, "SimpleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleRef_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, SimpleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSequenceRefEClass, SimpleSequenceRef.class, "SimpleSequenceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleSequenceRef_Values(), this.getValues(), null, "values", null, 1, 1, SimpleSequenceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structRefEClass, StructRef.class, "StructRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructRef_SimpleRef(), this.getSimpleRef(), null, "simpleRef", null, 1, -1, StructRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structSequenceRefEClass, StructSequenceRef.class, "StructSequenceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructSequenceRef_StructValue(), this.getStructValue(), null, "structValue", null, 1, -1, StructSequenceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.WRITEONLY);
		addEEnumLiteral(accessTypeEEnum, AccessType.READONLY);
		addEEnumLiteral(accessTypeEEnum, AccessType.READWRITE);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.GE);
		addEEnumLiteral(actionTypeEEnum, ActionType.GT);
		addEEnumLiteral(actionTypeEEnum, ActionType.EXTERNAL);
		addEEnumLiteral(actionTypeEEnum, ActionType.LE);
		addEEnumLiteral(actionTypeEEnum, ActionType.LT);
		addEEnumLiteral(actionTypeEEnum, ActionType.NE);
		addEEnumLiteral(actionTypeEEnum, ActionType.EQ);

		initEEnum(propertyConfigurationTypeEEnum, PropertyConfigurationType.class, "PropertyConfigurationType");
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.CONFIGURE);
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.EXECPARAM);
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.ALLOCATION);
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.FACTORYPARAM);
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.TEST);
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.EVENT);
		addEEnumLiteral(propertyConfigurationTypeEEnum, PropertyConfigurationType.MESSAGE);

		initEEnum(propertyValueTypeEEnum, PropertyValueType.class, "PropertyValueType");
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.STRING);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.BOOLEAN);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.ULONG);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.OBJREF);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.SHORT);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.FLOAT);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.OCTET);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.CHAR);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.USHORT);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.DOUBLE);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.LONG);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.LONGLONG);
		addEEnumLiteral(propertyValueTypeEEnum, PropertyValueType.ULONGLONG);

		initEEnum(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.class, "StructPropertyConfigurationType");
		addEEnumLiteral(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.CONFIGURE);
		addEEnumLiteral(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.ALLOCATION);
		addEEnumLiteral(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.FACTORYPARAM);
		addEEnumLiteral(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.TEST);
		addEEnumLiteral(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.EVENT);
		addEEnumLiteral(structPropertyConfigurationTypeEEnum, StructPropertyConfigurationType.MESSAGE);

		// Initialize data types
		initEDataType(accessTypeObjectEDataType, AccessType.class, "AccessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(actionTypeObjectEDataType, ActionType.class, "ActionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(characterObjectEDataType, Character.class, "CharacterObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dceUUIDEDataType, String.class, "DceUUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyConfigurationTypeObjectEDataType, PropertyConfigurationType.class, "PropertyConfigurationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyValueTypeObjectEDataType, PropertyValueType.class, "PropertyValueTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(structPropertyConfigurationTypeObjectEDataType, StructPropertyConfigurationType.class, "StructPropertyConfigurationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, String.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anyEDataType, Any.class, "Any", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexBooleanEDataType, ComplexBoolean.class, "ComplexBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexByteEDataType, ComplexByte.class, "ComplexByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexDoubleEDataType, ComplexDouble.class, "ComplexDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexFloatEDataType, ComplexFloat.class, "ComplexFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexLongEDataType, ComplexLong.class, "ComplexLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexLongLongEDataType, ComplexLongLong.class, "ComplexLongLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexShortEDataType, ComplexShort.class, "ComplexShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexUByteEDataType, ComplexUByte.class, "ComplexUByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexULongEDataType, ComplexULong.class, "ComplexULong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexULongLongEDataType, ComplexULongLong.class, "ComplexULongLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(complexUShortEDataType, ComplexUShort.class, "ComplexUShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (abstractPropertyEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "abstractproperty",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAbstractProperty_Description(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "description"
		   });	
		addAnnotation
		  (getAbstractProperty_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (getAbstractProperty_LocalMode(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "mode"
		   });	
		addAnnotation
		  (getAbstractProperty_Name(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (accessTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "AccessType"
		   });	
		addAnnotation
		  (accessTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "AccessType:Object",
			 "baseType", "AccessType"
		   });	
		addAnnotation
		  (actionEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "action",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAction_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (actionTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "ActionType"
		   });	
		addAnnotation
		  (actionTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "ActionType:Object",
			 "baseType", "ActionType"
		   });	
		addAnnotation
		  (characterObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "CharacterObject"
		   });	
		addAnnotation
		  (configurationKindEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "configurationkind",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getConfigurationKind_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "kindtype"
		   });	
		addAnnotation
		  (dceUUIDEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "DceUUID",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "DCE:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}(:\\d+(.\\d+)?)?"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "enumeration",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEnumeration_Label(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "label"
		   });	
		addAnnotation
		  (getEnumeration_Value(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (enumerationsEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "enumerations",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnumerations_Enumeration(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "enumeration"
		   });	
		addAnnotation
		  (inputValueEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "inputvalue",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInputValue_Simple(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simple"
		   });	
		addAnnotation
		  (kindEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "kind",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getKind_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "kindtype"
		   });	
		addAnnotation
		  (prfDocumentRootEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getPrfDocumentRoot_Mixed(), 
		   source, 
		   new String[] 
		   {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getPrfDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getPrfDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getPrfDocumentRoot_Properties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "properties",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProperties_Description(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "description"
		   });	
		addAnnotation
		  (getProperties_Properties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "properties:1"
		   });	
		addAnnotation
		  (getProperties_Simple(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simple",
			 "group", "#properties:1"
		   });	
		addAnnotation
		  (getProperties_SimpleSequence(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simplesequence",
			 "group", "#properties:1"
		   });	
		addAnnotation
		  (getProperties_Test(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "test",
			 "group", "#properties:1"
		   });	
		addAnnotation
		  (getProperties_Struct(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "struct",
			 "group", "#properties:1"
		   });	
		addAnnotation
		  (getProperties_StructSequence(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structsequence",
			 "group", "#properties:1"
		   });	
		addAnnotation
		  (propertyConfigurationTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "PropertyConfigurationType"
		   });	
		addAnnotation
		  (propertyConfigurationTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "PropertyConfigurationType:Object",
			 "baseType", "PropertyConfigurationType"
		   });	
		addAnnotation
		  (propertyValueTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "PropertyValueType"
		   });	
		addAnnotation
		  (propertyValueTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "PropertyValueType:Object",
			 "baseType", "PropertyValueType"
		   });	
		addAnnotation
		  (rangeEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "range",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRange_Max(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "max"
		   });	
		addAnnotation
		  (getRange_Min(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "min"
		   });	
		addAnnotation
		  (resultValueEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "resultvalue",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResultValue_Simple(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simple"
		   });	
		addAnnotation
		  (simpleEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "simple",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSimple_Value(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "value"
		   });	
		addAnnotation
		  (getSimple_Units(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "units"
		   });	
		addAnnotation
		  (getSimple_Range(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "range"
		   });	
		addAnnotation
		  (getSimple_Enumerations(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "enumerations"
		   });	
		addAnnotation
		  (getSimple_Kind(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "kind"
		   });	
		addAnnotation
		  (getSimple_Action(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "action"
		   });	
		addAnnotation
		  (getSimple_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (simpleSequenceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "simplesequence",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSimpleSequence_Values(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "values"
		   });	
		addAnnotation
		  (getSimpleSequence_Units(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "units"
		   });	
		addAnnotation
		  (getSimpleSequence_Range(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "range"
		   });	
		addAnnotation
		  (getSimpleSequence_Kind(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "kind"
		   });	
		addAnnotation
		  (getSimpleSequence_Action(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "action"
		   });	
		addAnnotation
		  (getSimpleSequence_Type(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (getSimpleSequence_Complex(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "complex"
		   });		
		addAnnotation
		  (structEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "struct",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStruct_Simple(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simple"
		   });	
		addAnnotation
		  (getStruct_ConfigurationKind(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "configurationkind"
		   });	
		addAnnotation
		  (structPropertyConfigurationTypeEEnum, 
		   source, 
		   new String[] 
		   {
			 "name", "StructPropertyConfigurationType"
		   });	
		addAnnotation
		  (structPropertyConfigurationTypeObjectEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "StructPropertyConfigurationType:Object",
			 "baseType", "StructPropertyConfigurationType"
		   });	
		addAnnotation
		  (structSequenceEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "structsequence",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStructSequence_Struct(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "struct"
		   });	
		addAnnotation
		  (getStructSequence_StructValue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structvalue"
		   });	
		addAnnotation
		  (getStructSequence_ConfigurationKind(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "configurationkind"
		   });	
		addAnnotation
		  (structValueEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "structvalue",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStructValue_SimpleRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simpleref"
		   });	
		addAnnotation
		  (testEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "test",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTest_Description(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "description"
		   });	
		addAnnotation
		  (getTest_InputValue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "inputvalue"
		   });	
		addAnnotation
		  (getTest_ResultValue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "resultvalue"
		   });	
		addAnnotation
		  (getTest_Id(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (unitEDataType, 
		   source, 
		   new String[] 
		   {
			 "name", "Unit",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (valuesEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "values",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getValues_Value(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "value"
		   });	
		addAnnotation
		  (abstractPropertyRefEClass, 
		   source, 
		   new String[] 
		   {
			 "kind", "elementOnly",
			 "name", "propertyref",
			 "qualified", "false"
		   });	
		addAnnotation
		  (getAbstractPropertyRef_RefID(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "refid"
		   });	
		addAnnotation
		  (propertyRefGroupEClass, 
		   source, 
		   new String[] 
		   {
			 "kind", "elementOnly",
			 "name", "propertyrefgroup",
			 "qualified", "false"
		   });	
		addAnnotation
		  (getPropertyRefGroup_Properties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "properties:0"
		   });	
		addAnnotation
		  (getPropertyRefGroup_SimpleRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simpleref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (getPropertyRefGroup_SimpleSequenceRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simplesequenceref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (getPropertyRefGroup_StructRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (getPropertyRefGroup_StructSequenceRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structsequenceref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (propertyRefSetEClass, 
		   source, 
		   new String[] 
		   {
			 "kind", "elementOnly",
			 "name", "propertyrefset",
			 "qualified", "false"
		   });	
		addAnnotation
		  (getPropertyRefSet_Properties(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group",
			 "name", "properties:0"
		   });	
		addAnnotation
		  (getPropertyRefSet_SimpleRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simpleref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (getPropertyRefSet_SimpleSequenceRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simplesequenceref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (getPropertyRefSet_StructRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (getPropertyRefSet_StructSequenceRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structsequenceref",
			 "group", "#properties:0"
		   });	
		addAnnotation
		  (simpleRefEClass, 
		   source, 
		   new String[] 
		   {
			 "name", "simpleref",
			 "kind", "empty",
			 "qualified", "false"
		   });	
		addAnnotation
		  (getSimpleRef_Value(), 
		   source, 
		   new String[] 
		   {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (simpleSequenceRefEClass, 
		   source, 
		   new String[] 
		   {
			 "kind", "elementOnly",
			 "name", "simplesequenceref",
			 "qualified", "false"
		   });	
		addAnnotation
		  (structRefEClass, 
		   source, 
		   new String[] 
		   {
			 "kind", "elementOnly",
			 "name", "structref",
			 "qualified", "false"
		   });	
		addAnnotation
		  (getStructRef_SimpleRef(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "simpleref"
		   });	
		addAnnotation
		  (structSequenceRefEClass, 
		   source, 
		   new String[] 
		   {
			 "kind", "elementOnly",
			 "name", "structsequenceref",
			 "qualified", "false"
		   });	
		addAnnotation
		  (getStructSequenceRef_StructValue(), 
		   source, 
		   new String[] 
		   {
			 "kind", "element",
			 "name", "structvalue"
		   });
	}

} //PrfPackageImpl

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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * @noimplement This interface is not intended to be implemented by clients.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The simple element (see Figure D-12) provides for the definition of a property which includes a
 * unique id, type, name and mode attributes of the property that will be used in the CF Resource
 * configure() and query() operations, for indication of component capabilities, or in the CF
 * TestableObject runTest operation. The simple element is specifically designed to support idvalue
 * pair definitions. A simple property id attribute corresponds to the id of the id-value pair.
 * The value and range of a simple property correspond to the value of the id-value pair. If no
 * value is given, then the property cannot be used for input test values for testing and/or as an
 * initial configuration or execute parameter of a component. The optional enumerations element
 * allows for the definition of a label-to-value for a particular property. The mode attribute defines
 * whether the properties element is "readonly", "writeonly" or "readwrite". The id attribute is an
 * identifier for the simple property element. The id attribute for a simple property that is an
 * allocation type is a DCE UUID value, as specified in section D.2.1. The id attribute for all other
 * simple property elements can be any valid XML ID type. The mode attribute is only meaningful
 * when the type of the kind element is "configure".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getValue <em>Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getUnits <em>Units</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getRange <em>Range</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getKind <em>Kind</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getAction <em>Action</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getComplex <em>Complex</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Simple#getOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple()
 * @model extendedMetaData="name='simple' kind='elementOnly'"
 * @generated
 */
public interface Simple extends AbstractProperty {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Units()
	 * @model dataType="mil.jpeojtrs.sca.prf.Unit"
	 *        extendedMetaData="kind='element' name='units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range'"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference.
	 * @see #setEnumerations(Enumerations)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Enumerations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumerations'"
	 * @generated
	 */
	Enumerations getEnumerations();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getEnumerations <em>Enumerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerations</em>' containment reference.
	 * @see #getEnumerations()
	 * @generated
	 */
	void setEnumerations(Enumerations value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Kind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kind'"
	 * @generated
	 */
	EList<Kind> getKind();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action'"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mil.jpeojtrs.sca.prf.PropertyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.PropertyValueType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(PropertyValueType)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	PropertyValueType getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mil.jpeojtrs.sca.prf.PropertyValueType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyValueType value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(PropertyValueType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(PropertyValueType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Complex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * True if the value should be treated as a complex number.  False or null otherwise.
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex</em>' attribute.
	 * @see #setComplex(Boolean)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Complex()
	 * @model
	 * @generated
	 */
	Boolean getComplex();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getComplex <em>Complex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex</em>' attribute.
	 * @see #getComplex()
	 * @generated
	 */
	void setComplex(Boolean value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(Boolean)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getSimple_Optional()
	 * @model
	 * @generated
	 */
	Boolean getOptional();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Simple#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isComplex();

	/**
	 * <!-- begin-user-doc -->
	 * @since 5.0
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOptional();

} // Simple

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The properties element (see Figure D-11) is used to describe property attributes that will be used
 * in the configure( ) and query( ) operations for SCA CF Resource components and for definition
 * of attributes used for dependency checking. The properties element can also used in the CF
 * TestableObject runTest() operation to configure tests and provide test results.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getSimple <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getSimpleSequence <em>Simple Sequence</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getTest <em>Test</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getStruct <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getStructSequence <em>Struct Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties()
 * @model extendedMetaData="name='properties' kind='elementOnly'"
 * @generated
 */
public interface Properties extends PropertyContainer {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description element is used to provide a description of the properties element that is being
	 * defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.prf.Properties#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_Properties()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='properties:1'"
	 * @generated
	 */
	FeatureMap getProperties();
	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_Simple()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simple' group='#properties:1'"
	 * @generated
	 */
	EList<Simple> getSimple();
	/**
	 * Returns the value of the '<em><b>Simple Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Sequence</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_SimpleSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplesequence' group='#properties:1'"
	 * @generated
	 */
	EList<SimpleSequence> getSimpleSequence();
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_Test()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='test' group='#properties:1'"
	 * @generated
	 */
	EList<Test> getTest();
	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Struct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_Struct()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='struct' group='#properties:1'"
	 * @generated
	 */
	EList<Struct> getStruct();
	/**
	 * Returns the value of the '<em><b>Struct Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Sequence</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getProperties_StructSequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structsequence' group='#properties:1'"
	 * @generated
	 */
	EList<StructSequence> getStructSequence();
	public static final String EOBJECT_PATH = "/";
	public static class Util {
		// END GENERATED CODE
		private Util() {
			
		}
		public static Properties getProperties(Resource resource) {
			if (resource == null) {
				return null;
			}
			EObject obj = resource.getEObject(EOBJECT_PATH);
			if (obj instanceof Properties) {
				return (Properties) obj;
			} else if (obj instanceof PrfDocumentRoot) {
				return ((PrfDocumentRoot) obj).getProperties();
			} else {
				throw new IllegalArgumentException(resource + " is not a valid prf resource.");
			}
		}
		// BEGIN GENERATED CODE
	}

} // Properties

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
package mil.jpeojtrs.sca.partitioning;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The componentinstantiation element (see Figure D-35) is intended to describe a particular
 * instantiation of a component relative to a componentplacement element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getComponentProperties <em>Component Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getProvides <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUses <em>Uses</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getInterfaceStub <em>Interface Stub</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getPlacement <em>Placement</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getImplID <em>Impl ID</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation()
 * @model
 * @generated
 */
public interface ComponentInstantiation extends EObject {

	/**
	 * Returns the value of the '<em><b>Usage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The componentinstantiation contains
	 * a usagename element that is intended for an applicable name for the component.
	 * 
	 * For a component service type (e.g,, Log), the
	 * usagename element needs to be unique for each service type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Name</em>' attribute.
	 * @see #setUsageName(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_UsageName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='usagename'"
	 * @generated
	 */
	String getUsageName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUsageName <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Name</em>' attribute.
	 * @see #getUsageName()
	 * @generated
	 */
	void setUsageName(String value);

	/**
	 * Returns the value of the '<em><b>Component Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional componentproperties element (see Figure D-36) is a list of property values that are used in
	 * configuring the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Properties</em>' containment reference.
	 * @see #setComponentProperties(ComponentProperties)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_ComponentProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentproperties'"
	 * @generated
	 */
	ComponentProperties getComponentProperties();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getComponentProperties <em>Component Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Properties</em>' containment reference.
	 * @see #getComponentProperties()
	 * @generated
	 */
	void setComponentProperties(ComponentProperties value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_Provides()
	 * @model containment="true" transient="true" changeable="false" derived="true"
	 *        extendedMetaData="kind='element' name='provides'"
	 * @generated
	 */
	EList<ProvidesPortStub> getProvides();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.partitioning.UsesPortStub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_Uses()
	 * @model containment="true" transient="true" changeable="false" derived="true"
	 *        extendedMetaData="kind='element' name='uses'"
	 * @generated
	 */
	EList<UsesPortStub> getUses();

	/**
	 * Returns the value of the '<em><b>Interface Stub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Stub</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Stub</em>' containment reference.
	 * @see #setInterfaceStub(ComponentSupportedInterfaceStub)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_InterfaceStub()
	 * @model containment="true" transient="true"
	 *        extendedMetaData="kind='element' name='interfaceports'"
	 * @generated
	 */
	ComponentSupportedInterfaceStub getInterfaceStub();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getInterfaceStub <em>Interface Stub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Stub</em>' containment reference.
	 * @see #getInterfaceStub()
	 * @generated
	 */
	void setInterfaceStub(ComponentSupportedInterfaceStub value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The componentinstantiation‘s id attribute is a DCE UUID that uniquely identifier the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' container reference.
	 * @see #setPlacement(ComponentPlacement)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_Placement()
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement#getComponentInstantiation
	 * @model opposite="componentInstantiation"
	 * @generated
	 */
	ComponentPlacement< ? > getPlacement();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getPlacement <em>Placement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' container reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(ComponentPlacement< ? > value);

	/**
	 * Returns the value of the '<em><b>Impl ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl ID</em>' attribute.
	 * @see #setImplID(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentInstantiation_ImplID()
	 * @model transient="true"
	 * @generated
	 */
	String getImplID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getImplID <em>Impl ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.1
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl ID</em>' attribute.
	 * @see #getImplID()
	 * @generated
	 */
	void setImplID(String value);

} // ComponentInstantiation

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

import mil.jpeojtrs.sca.scd.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Supported Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByApplication <em>Device Used By Application</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getFindBy <em>Find By</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface()
 * @model extendedMetaData="kind='elementOnly' name='componentsupportedinterface' qualified='false'"
 * @generated
 */
public interface ComponentSupportedInterface extends EObject {

	/**
	 * Returns the value of the '<em><b>Supported Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Identifier</em>' attribute.
	 * @see #setSupportedIdentifier(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_SupportedIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='supportedidentifier'"
	 * @generated
	 */
	String getSupportedIdentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getSupportedIdentifier <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Identifier</em>' attribute.
	 * @see #getSupportedIdentifier()
	 * @generated
	 */
	void setSupportedIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Component Instantiation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instantiation Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instantiation Ref</em>' containment reference.
	 * @see #setComponentInstantiationRef(ComponentInstantiationRef)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_ComponentInstantiationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentinstantiationref'"
	 * @generated
	 */
	ComponentInstantiationRef< ? > getComponentInstantiationRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getComponentInstantiationRef <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instantiation Ref</em>' containment reference.
	 * @see #getComponentInstantiationRef()
	 * @generated
	 */
	void setComponentInstantiationRef(ComponentInstantiationRef< ? > value);

	/**
	 * Returns the value of the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device That Loaded This Component Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device That Loaded This Component Ref</em>' containment reference.
	 * @see #setDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_DeviceThatLoadedThisComponentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devicethatloadedthiscomponentref'"
	 * @generated
	 */
	DeviceThatLoadedThisComponentRef getDeviceThatLoadedThisComponentRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device That Loaded This Component Ref</em>' containment reference.
	 * @see #getDeviceThatLoadedThisComponentRef()
	 * @generated
	 */
	void setDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef value);

	/**
	 * Returns the value of the '<em><b>Device Used By This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Used By This Component Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Used By This Component Ref</em>' containment reference.
	 * @see #setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_DeviceUsedByThisComponentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceusedbythiscomponentref'"
	 * @generated
	 */
	DeviceUsedByThisComponentRef getDeviceUsedByThisComponentRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Used By This Component Ref</em>' containment reference.
	 * @see #getDeviceUsedByThisComponentRef()
	 * @generated
	 */
	void setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef value);

	/**
	 * Returns the value of the '<em><b>Device Used By Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Used By Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Used By Application</em>' containment reference.
	 * @see #setDeviceUsedByApplication(DeviceUsedByApplication)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_DeviceUsedByApplication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceusedbyapplication'"
	 * @generated
	 */
	DeviceUsedByApplication getDeviceUsedByApplication();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getDeviceUsedByApplication <em>Device Used By Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Used By Application</em>' containment reference.
	 * @see #getDeviceUsedByApplication()
	 * @generated
	 */
	void setDeviceUsedByApplication(DeviceUsedByApplication value);

	/**
	 * Returns the value of the '<em><b>Find By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find By</em>' containment reference.
	 * @see #setFindBy(FindBy)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_FindBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='findby'"
	 * @generated
	 */
	FindBy getFindBy();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getFindBy <em>Find By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find By</em>' containment reference.
	 * @see #getFindBy()
	 * @generated
	 */
	void setFindBy(FindBy value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getComponentSupportedInterface_Interface()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='interface'"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // ComponentSupportedInterface

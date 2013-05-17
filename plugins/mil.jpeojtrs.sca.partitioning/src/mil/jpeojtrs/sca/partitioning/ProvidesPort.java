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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getProvidesIdentifier <em>Provides Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getFindBy <em>Find By</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPort()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='providesport' qualified='false'"
 * @generated
 */
public interface ProvidesPort<P extends ComponentInstantiationRef<?>> extends EObject {

	/**
	 * Returns the value of the '<em><b>Provides Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Identifier</em>' attribute.
	 * @see #setProvidesIdentifier(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPort_ProvidesIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='providesidentifier'"
	 * @generated
	 */
	String getProvidesIdentifier();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getProvidesIdentifier <em>Provides Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Identifier</em>' attribute.
	 * @see #getProvidesIdentifier()
	 * @generated
	 */
	void setProvidesIdentifier(String value);

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPort_ComponentInstantiationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentinstantiationref'"
	 * @generated
	 */
	P getComponentInstantiationRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getComponentInstantiationRef <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instantiation Ref</em>' containment reference.
	 * @see #getComponentInstantiationRef()
	 * @generated
	 */
	void setComponentInstantiationRef(P value);

	/**
	 * Returns the value of the '<em><b>Device That Loaded This Component Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device That Loaded This Component Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device That Loaded This Component Ref</em>' containment reference.
	 * @see #setDeviceThatLoadedThisComponentRef(DeviceThatLoadedThisComponentRef)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPort_DeviceThatLoadedThisComponentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='devicethatloadedthiscomponentref'"
	 * @generated
	 */
	DeviceThatLoadedThisComponentRef getDeviceThatLoadedThisComponentRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceThatLoadedThisComponentRef <em>Device That Loaded This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Used By This Component Ref</em>' containment reference.
	 * @see #setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPort_DeviceUsedByThisComponentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceusedbythiscomponentref'"
	 * @generated
	 */
	DeviceUsedByThisComponentRef getDeviceUsedByThisComponentRef();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getDeviceUsedByThisComponentRef <em>Device Used By This Component Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Used By This Component Ref</em>' containment reference.
	 * @see #getDeviceUsedByThisComponentRef()
	 * @generated
	 */
	void setDeviceUsedByThisComponentRef(DeviceUsedByThisComponentRef value);

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getProvidesPort_FindBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='findby'"
	 * @generated
	 */
	FindBy getFindBy();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ProvidesPort#getFindBy <em>Find By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find By</em>' containment reference.
	 * @see #getFindBy()
	 * @generated
	 */
	void setFindBy(FindBy value);

} // ProvidesPort

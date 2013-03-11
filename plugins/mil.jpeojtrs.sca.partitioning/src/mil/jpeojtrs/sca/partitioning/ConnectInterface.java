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
package mil.jpeojtrs.sca.partitioning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getUsesPort <em>Uses Port</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getProvidesPort <em>Provides Port</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getComponentSupportedInterface <em>Component Supported Interface</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getFindBy <em>Find By</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource <em>Source</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidSourceReference ValidTargetReference'"
 *        extendedMetaData="kind='elementOnly' name='connectinterface' qualified='false'"
 * @generated
 */
public interface ConnectInterface<CIR extends ComponentInstantiationRef<?>, UP extends UsesPort<CIR>, PP extends ProvidesPort<CIR>> extends EObject {

	/**
	 * Returns the value of the '<em><b>Uses Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Port</em>' containment reference.
	 * @see #setUsesPort(UsesPort)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_UsesPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesport'"
	 * @generated
	 */
	UP getUsesPort();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getUsesPort <em>Uses Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Port</em>' containment reference.
	 * @see #getUsesPort()
	 * @generated
	 */
	void setUsesPort(UP value);

	/**
	 * Returns the value of the '<em><b>Provides Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Port</em>' containment reference.
	 * @see #setProvidesPort(ProvidesPort)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_ProvidesPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providesport'"
	 * @generated
	 */
	PP getProvidesPort();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getProvidesPort <em>Provides Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Port</em>' containment reference.
	 * @see #getProvidesPort()
	 * @generated
	 */
	void setProvidesPort(PP value);

	/**
	 * Returns the value of the '<em><b>Component Supported Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Supported Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Supported Interface</em>' containment reference.
	 * @see #setComponentSupportedInterface(ComponentSupportedInterface)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_ComponentSupportedInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentsupportedinterface'"
	 * @generated
	 */
	ComponentSupportedInterface getComponentSupportedInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getComponentSupportedInterface <em>Component Supported Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Supported Interface</em>' containment reference.
	 * @see #getComponentSupportedInterface()
	 * @generated
	 */
	void setComponentSupportedInterface(ComponentSupportedInterface value);

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
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_FindBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='findby'"
	 * @generated
	 */
	FindBy getFindBy();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getFindBy <em>Find By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find By</em>' containment reference.
	 * @see #getFindBy()
	 * @generated
	 */
	void setFindBy(FindBy value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UsesPortStub)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_Source()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	UsesPortStub getSource();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UsesPortStub value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConnectionTarget)
	 * @see mil.jpeojtrs.sca.partitioning.PartitioningPackage#getConnectInterface_Target()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	ConnectionTarget getTarget();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConnectionTarget value);

} // ConnectInterface

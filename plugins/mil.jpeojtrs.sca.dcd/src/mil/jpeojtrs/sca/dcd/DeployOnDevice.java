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
package mil.jpeojtrs.sca.dcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy On Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The deployondevice element is used to reference a componentinstantiation element on which this
 * componentinstantiation is deployed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent <em>Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeployOnDevice()
 * @model extendedMetaData="name='deployondevice' kind='empty'"
 * @generated
 */
public interface DeployOnDevice extends EObject {

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(DcdComponentInstantiation)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeployOnDevice_Component()
	 * @model transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	DcdComponentInstantiation getComponent();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(DcdComponentInstantiation value);

	/**
	 * Returns the value of the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref ID</em>' attribute.
	 * @see #setRefID(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeployOnDevice_RefID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='refid'"
	 * @generated
	 */
	String getRefID();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getRefID <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref ID</em>' attribute.
	 * @see #getRefID()
	 * @generated
	 */
	void setRefID(String value);

} // DeployOnDevice

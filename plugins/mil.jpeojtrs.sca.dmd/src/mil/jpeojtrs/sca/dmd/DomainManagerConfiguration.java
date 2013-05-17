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
package mil.jpeojtrs.sca.dmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Manager Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DOMAINMANAGER CONFIGURATION DESCRIPTOR.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDomainManagerSoftPkg <em>Domain Manager Soft Pkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getServices <em>Services</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getDomainManagerConfiguration()
 * @model extendedMetaData="name='domainmanagerconfiguration' kind='elementOnly'"
 * @generated
 */
public interface DomainManagerConfiguration extends EObject {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional description element of the DMD may be used to provide information about the
	 * configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getDomainManagerConfiguration_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);
	/**
	 * Returns the value of the '<em><b>Domain Manager Soft Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domainmanagersoftpkg element refers to the SPD for the CF DomainManager. The SPD
	 * file is referenced by a localfile element. This SPD can be used to describe the CF
	 * DomainManager implementation and to specify the usesports for the services (Log(s), etc...)
	 * used by the CF DomainManager. See section D.2.1.1.1 for description of the localfile element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Manager Soft Pkg</em>' containment reference.
	 * @see #setDomainManagerSoftPkg(DomainManagerSoftPkg)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getDomainManagerConfiguration_DomainManagerSoftPkg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='domainmanagersoftpkg' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainManagerSoftPkg getDomainManagerSoftPkg();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getDomainManagerSoftPkg <em>Domain Manager Soft Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Manager Soft Pkg</em>' containment reference.
	 * @see #getDomainManagerSoftPkg()
	 * @generated
	 */
	void setDomainManagerSoftPkg(DomainManagerSoftPkg value);
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The services element in the DMD is used by the CF DomainManager to determine which service
	 * (Log, etc.) instances to use; it makes use of the service element (see Figure D-39). See section
	 * D.6.5.1.1.3 for a description of the findby element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Services)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getDomainManagerConfiguration_Services()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	Services getServices();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The
	 * domainmanagerconfiguration element id attribute is a DCE UUID that uniquely identifies the
	 * DomainManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getDomainManagerConfiguration_Id()
	 * @model id="true" dataType="mil.jpeojtrs.sca.prf.DceUUID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.dmd.DmdPackage#getDomainManagerConfiguration_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dmd.DomainManagerConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	String EOBJECT_PATH = "/";
	public static class Util {
		// END GENERATED CODE
		private Util() {
			
		}
		public static DomainManagerConfiguration getDomainManagerConfiguration(Resource resource) {
			if (resource == null) {
				return null;
			}
			EObject obj = resource.getEObject(DomainManagerConfiguration.EOBJECT_PATH);
			if (obj instanceof DmdDocumentRoot) {
				return ((DmdDocumentRoot) obj).getDomainmanagerconfiguration();
			} else if (obj instanceof DomainManagerConfiguration) {
				return (DomainManagerConfiguration) obj;
			} else {
				throw new IllegalArgumentException(resource + " is not a valid dmd resource.");
			}
		}
		// BEGIN GENERATED CODE
	}

} // DomainManagerConfiguration

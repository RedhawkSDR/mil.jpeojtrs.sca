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
package mil.jpeojtrs.sca.scd;

import mil.jpeojtrs.sca.util.ScaFileSystemConstants;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getCorbaVersion <em>Corba Version</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentRepID <em>Component Rep ID</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentFeatures <em>Component Features</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId <em>Rep Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent()
 * @model extendedMetaData="name='softwareComponent' kind='elementOnly'"
 * @generated
 */
public interface SoftwareComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Corba Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corba Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corba Version</em>' attribute.
	 * @see #setCorbaVersion(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_CorbaVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='corbaversion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCorbaVersion();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getCorbaVersion <em>Corba Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corba Version</em>' attribute.
	 * @see #getCorbaVersion()
	 * @generated
	 */
	void setCorbaVersion(String value);
	/**
	 * Returns the value of the '<em><b>Component Rep ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Rep ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Rep ID</em>' containment reference.
	 * @see #setComponentRepID(ComponentRepId)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_ComponentRepID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentrepid' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentRepId getComponentRepID();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentRepID <em>Component Rep ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Rep ID</em>' containment reference.
	 * @see #getComponentRepID()
	 * @generated
	 */
	void setComponentRepID(ComponentRepId value);
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see #setComponentType(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_ComponentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='componenttype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComponentType();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(String value);
	/**
	 * Returns the value of the '<em><b>Component Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Features</em>' containment reference.
	 * @see #setComponentFeatures(ComponentFeatures)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_ComponentFeatures()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentfeatures' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentFeatures getComponentFeatures();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getComponentFeatures <em>Component Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Features</em>' containment reference.
	 * @see #getComponentFeatures()
	 * @generated
	 */
	void setComponentFeatures(ComponentFeatures value);
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(Interfaces)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_Interfaces()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	Interfaces getInterfaces();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(Interfaces value);
	/**
	 * Returns the value of the '<em><b>Property File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property File</em>' containment reference.
	 * @see #setPropertyFile(PropertyFile)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_PropertyFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyfile' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyFile getPropertyFile();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getPropertyFile <em>Property File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property File</em>' containment reference.
	 * @see #getPropertyFile()
	 * @generated
	 */
	void setPropertyFile(PropertyFile value);
	/**
	 * Returns the value of the '<em><b>Rep Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rep Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rep Id</em>' attribute.
	 * @see #setRepId(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getSoftwareComponent_RepId()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getRepId();
	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId <em>Rep Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Id</em>' attribute.
	 * @see #getRepId()
	 * @generated
	 */
	void setRepId(String value);
	public static final String EOBJECT_PATH = "/";
	public static class Util {

		// END GENERATED CODE
		private Util() {
			
		}
		public static SoftwareComponent getSoftwareComponent(Resource resource) {
			if (resource == null) {
				return null;
			}
			EObject obj = resource.getEObject(EOBJECT_PATH);
			if (obj instanceof ScdDocumentRoot) {
				return ((ScdDocumentRoot) obj).getSoftwarecomponent();
			} else if (obj instanceof SoftwareComponent) {
				return (SoftwareComponent) obj;
			} else {
				throw new IllegalArgumentException(resource + " is not a valid scd resource.");
			}
		}
		
		public static String getFileSystem(SoftwareComponent scd) {
			switch(getWellKnownComponentType(scd)) {
			case DEVICE:
			case SERVICE:
			case DEVICE_MANAGER:
			case EVENT_SERVICE:
			case NAMING_SERVICE:
				return ScaFileSystemConstants.SCHEME_TARGET_SDR_DEV;
			case DOMAIN_MANAGER:
			case RESOURCE:
			default:
				return ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM;
			}
		}
		
		/**
		 * Parses the component type of the SCD into an enumerated well known type. Will never return null.
		 * @param scd the component to get the type for
		 * @return the enumerated type or ComponentType.OTHER
		 */
		public static ComponentType getWellKnownComponentType(SoftwareComponent scd) {
			if (scd == null) {
				return ComponentType.OTHER;
			}
			String componentType = scd.getComponentType();
			if (componentType == null) {
				return ComponentType.OTHER;
			}
			try {
				ComponentType retVal = ComponentType.get(componentType);
				if (retVal != null) {
					return retVal;
				}
			} catch (IllegalArgumentException e) {
				// PASS
			}
			if (componentType.toUpperCase().contains(ComponentType.DEVICE.getLiteral().toUpperCase())) {
				return ComponentType.DEVICE;
			}
			return ComponentType.OTHER;
		}
		// BEGIN GENERATED CODE
	}

} // SoftwareComponent

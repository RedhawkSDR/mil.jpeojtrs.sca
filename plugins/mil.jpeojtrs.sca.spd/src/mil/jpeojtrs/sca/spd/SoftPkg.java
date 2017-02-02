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
package mil.jpeojtrs.sca.spd;

import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.SupportsInterface;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;
import mil.jpeojtrs.sca.util.ScaFileSystemConstants;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getTitle <em>Title</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getAuthor <em>Author</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getPropertyFile <em>Property File</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getUsesDevice <em>Uses Device</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getType <em>Type</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg()
 * @model extendedMetaData="name='softPkg' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isValueConsistent'"
 * @generated
 */
public interface SoftPkg extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Author> getAuthor();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_PropertyFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyfile' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyFile getPropertyFile();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getPropertyFile <em>Property File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property File</em>' containment reference.
	 * @see #getPropertyFile()
	 * @generated
	 */
	void setPropertyFile(PropertyFile value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference.
	 * @see #setDescriptor(Descriptor)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Descriptor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	Descriptor getDescriptor();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getDescriptor <em>Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' containment reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(Descriptor value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.Implementation}.
	 * It is bidirectional and its opposite is '{@link mil.jpeojtrs.sca.spd.Implementation#getSoftPkg <em>Soft Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Implementation()
	 * @see mil.jpeojtrs.sca.spd.Implementation#getSoftPkg
	 * @model opposite="softPkg" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Implementation> getImplementation();

	/**
	 * Returns the value of the '<em><b>Uses Device</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.spd.UsesDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Device</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_UsesDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesdevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UsesDevice> getUsesDevice();

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
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Id()
	 * @model id="true" dataType="mil.jpeojtrs.sca.prf.DceUUID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getId <em>Id</em>}' attribute.
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
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"sca_compliant"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Type()
	 * @model default="sca_compliant" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mil.jpeojtrs.sca.spd.SpdPackage#getSoftPkg_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Implementation getImplementation(String implID);

	public static final String EOBJECT_PATH = "/";

	public static final class Util {
		// END GENERATED CODE
		private static final EStructuralFeature[] SUPPORT_PATH = new EStructuralFeature[] { SpdPackage.Literals.SOFT_PKG__DESCRIPTOR,
			SpdPackage.Literals.DESCRIPTOR__COMPONENT, ScdPackage.Literals.SOFTWARE_COMPONENT__COMPONENT_FEATURES,
			ScdPackage.Literals.COMPONENT_FEATURES__SUPPORTS_INTERFACE };

		private Util() {

		}

		public static String getFileSystem(SoftPkg spd) {
			if (spd != null) {
				Descriptor desc = spd.getDescriptor();
				if (desc != null) {
					return SoftwareComponent.Util.getFileSystem(desc.getComponent());
				}
			}
			return ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM;
		}

		/**
		 * @since 4.1
		 */
		public static final String COMPONENT_HOST_URI = "/var/redhawk/sdr/dom/mgr/rh/ComponentHost/ComponentHost.spd.xml";

		/**
		 * @since 4.1
		 */
		public static boolean isComponentHost(URI spdURI) {
			if (COMPONENT_HOST_URI.equals(spdURI.toFileString())) {
				return true;
			}
			return false;
		}

		/**
		 * @since 4.1
		 */
		public static boolean isContainedComponent(Implementation impl) {
			CodeFileType type = ScaEcoreUtils.getFeature(impl, SpdPackage.Literals.IMPLEMENTATION__CODE, SpdPackage.Literals.CODE__TYPE);

			if (CodeFileType.SHARED_LIBRARY.equals(type)) {
				return true;
			}
			return false;
		}

		public static boolean isAggregateDevice(SoftPkg spd) {
			if (spd != null) {
				EList<SupportsInterface> interfaces = ScaEcoreUtils.getFeature(spd, SUPPORT_PATH);
				if (interfaces == null) {
					return false;
				}
				for (SupportsInterface i : interfaces) {
					if (i.getRepId() != null && i.getRepId().matches("IDL:CF/AggregateDevice:.*")) {
						return true;
					}
				}
			}
			return false;
		}

		public static boolean supportsPorts(SoftPkg spd) {
			if (spd != null) {
				EList<SupportsInterface> interfaces = ScaEcoreUtils.getFeature(spd, SUPPORT_PATH);
				if (interfaces == null) {
					return false;
				}

				for (SupportsInterface i : interfaces) {
					if (i.getRepId() != null && i.getRepId().matches("IDL:CF/PortSupplier:.*")) {
						return true;
					}
				}
				return false;
			}
			return false;
		}

		public static SoftPkg getSoftPkg(Resource resource) {
			if (resource == null) {
				return null;
			}
			EObject obj = resource.getEObject(EOBJECT_PATH);
			if (obj instanceof SpdDocumentRoot) {
				return ((SpdDocumentRoot) obj).getSoftpkg();
			} else if (obj instanceof SoftPkg) {
				return (SoftPkg) obj;
			} else {
				return null;
			}
		}
		// BEGIN GENERATED CODE
	}

} // SoftPkg

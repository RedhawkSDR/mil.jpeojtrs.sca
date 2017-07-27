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
package mil.jpeojtrs.sca.sad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mil.jpeojtrs.sca.partitioning.ComponentFiles;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentFiles <em>Component Files</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getAssemblyController <em>Assembly Controller</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getConnections <em>Connections</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalPorts <em>External Ports</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalProperties <em>External Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getVersion <em>Version</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getUsesDeviceDependencies <em>Uses Device Dependencies</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly()
 * @model extendedMetaData="name='softwareassembly' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface SoftwareAssembly extends EObject {

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Component Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Files</em>' containment reference.
	 * @see #setComponentFiles(ComponentFiles)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_ComponentFiles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentFiles getComponentFiles();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentFiles <em>Component Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Files</em>' containment reference.
	 * @see #getComponentFiles()
	 * @generated
	 */
	void setComponentFiles(ComponentFiles value);

	/**
	 * Returns the value of the '<em><b>Partitioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitioning</em>' containment reference.
	 * @see #setPartitioning(SadPartitioning)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_Partitioning()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='partitioning' namespace='##targetNamespace'"
	 * @generated
	 */
	SadPartitioning getPartitioning();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getPartitioning <em>Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitioning</em>' containment reference.
	 * @see #getPartitioning()
	 * @generated
	 */
	void setPartitioning(SadPartitioning value);

	/**
	 * Returns the value of the '<em><b>Assembly Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Controller</em>' containment reference.
	 * @see #setAssemblyController(AssemblyController)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_AssemblyController()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assemblycontroller' namespace='##targetNamespace'"
	 * @generated
	 */
	AssemblyController getAssemblyController();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getAssemblyController <em>Assembly Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Controller</em>' containment reference.
	 * @see #getAssemblyController()
	 * @generated
	 */
	void setAssemblyController(AssemblyController value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference.
	 * @see #setConnections(SadConnections)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_Connections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connections' namespace='##targetNamespace'"
	 * @generated
	 */
	SadConnections getConnections();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' containment reference.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(SadConnections value);

	/**
	 * Returns the value of the '<em><b>External Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ports</em>' containment reference.
	 * @see #setExternalPorts(ExternalPorts)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_ExternalPorts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalports' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalPorts getExternalPorts();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalPorts <em>External Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ports</em>' containment reference.
	 * @see #getExternalPorts()
	 * @generated
	 */
	void setExternalPorts(ExternalPorts value);

	/**
	 * Returns the value of the '<em><b>External Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Properties</em>' containment reference.
	 * @see #setExternalProperties(ExternalProperties)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_ExternalProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalproperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalProperties getExternalProperties();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getExternalProperties <em>External Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Properties</em>' containment reference.
	 * @see #getExternalProperties()
	 * @generated
	 */
	void setExternalProperties(ExternalProperties value);

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_Id()
	 * @model id="true" dataType="mil.jpeojtrs.sca.prf.DceUUID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getId <em>Id</em>}' attribute.
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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Uses Device Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Device Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Device Dependencies</em>' containment reference.
	 * @see #setUsesDeviceDependencies(UsesDeviceDependencies)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSoftwareAssembly_UsesDeviceDependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesdevicedependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	UsesDeviceDependencies getUsesDeviceDependencies();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getUsesDeviceDependencies <em>Uses Device Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Device Dependencies</em>' containment reference.
	 * @see #getUsesDeviceDependencies()
	 * @generated
	 */
	void setUsesDeviceDependencies(UsesDeviceDependencies value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SadComponentInstantiation getComponentInstantiation(String instantiationId);

	/**
	 * <!-- begin-user-doc -->
	 * Gets all components in their start order. The assembly controller is always listed first, and components
	 * without a start order are listed at the end.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SadComponentInstantiation> getComponentInstantiationsInStartOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SadComponentInstantiation> getAllComponentInstantiations();

	String EOBJECT_PATH = "/";

	public static class Util {
		// END GENERATED CODE
		private Util() {

		}

		public static SoftwareAssembly getSoftwareAssembly(Resource resource) {
			if (resource == null) {
				return null;
			}
			EObject obj = resource.getEObject(EOBJECT_PATH);
			if (obj == null) {
				return null;
			}
			if (obj instanceof SadDocumentRoot) {
				return ((SadDocumentRoot) obj).getSoftwareassembly();
			} else if (obj instanceof SoftwareAssembly) {
				return (SoftwareAssembly) obj;
			} else {
				throw new IllegalArgumentException(resource + " is not a valid sad resource.");
			}
		}

		/**
		 * Gets the component instantiation for the assembly controller
		 * @param sa
		 * @return The assembly controler's component instantiation, or null if not found
		 */
		public static SadComponentInstantiation getAssemblyControllerInstantiation(SoftwareAssembly sa) {
			return ScaEcoreUtils.getFeature(sa, SadPackage.Literals.SOFTWARE_ASSEMBLY__ASSEMBLY_CONTROLLER,
				SadPackage.Literals.ASSEMBLY_CONTROLLER__COMPONENT_INSTANTIATION_REF, PartitioningPackage.Literals.COMPONENT_INSTANTIATION_REF__INSTANTIATION);
		}

		public static int getLastStartOrder(SoftwareAssembly sa) {
			int lastStartOrder = 0;
			for (final SadComponentInstantiation ci : sa.getAllComponentInstantiations()) {
				if ((ci.getStartOrder() != null) && (ci.getStartOrder().intValue() > lastStartOrder)) {
					lastStartOrder = ci.getStartOrder().intValue();
				}
			}
			return lastStartOrder;
		}

		/**
		 * Determine if the given component instantiation is the assembly controller
		 * @param ci
		 * @return
		 */
		public static boolean isAssemblyController(SadComponentInstantiation ci) {
			final SoftwareAssembly sa = getSoftwareAssembly(ci.eResource());
			if (sa == null) {
				return false;
			}
			final SadComponentInstantiation asmCi = getAssemblyControllerInstantiation(sa);
			return asmCi != null && asmCi.equals(ci);
		}

		public static String createComponentUsageName(SoftwareAssembly sa, String componentId) {
			return componentId;
		}

		public static String createComponentIdentifier(SoftwareAssembly sa, String componentName) {
			String baseName = componentName;
			int baseNameIndex = baseName.lastIndexOf('.');
			if (baseNameIndex != -1) {
				baseName = baseName.substring(baseNameIndex + 1);
			}

			// Make up a unique new name here.
			final StringBuilder compId = new StringBuilder();
			final Pattern p = Pattern.compile(baseName + "_([0-9]+)");
			final List<Integer> usedIndexes = new ArrayList<Integer>();

			compId.append(baseName);

			if (sa.getPartitioning() != null) {
				for (final SadComponentInstantiation impl : sa.getAllComponentInstantiations()) {
					final String name = impl.getId();
					if (name != null) {
						final Matcher m = p.matcher(name);
						if (m.matches()) {
							final int idx = Integer.parseInt(m.group(1));
							usedIndexes.add(idx);
						}
					}
				}
			}

			Collections.sort(usedIndexes);
			int index = 1;
			for (final Integer value : usedIndexes) {
				if (value != index) {
					break;
				} else {
					index++;
				}
			}

			return compId.append("_").append(index).toString();
		}
		// BEGIN GENERATED CODE
	}

} // SoftwareAssembly

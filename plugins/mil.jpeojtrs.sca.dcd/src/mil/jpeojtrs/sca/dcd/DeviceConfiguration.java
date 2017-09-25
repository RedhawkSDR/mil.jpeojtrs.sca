/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.dcd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mil.jpeojtrs.sca.partitioning.ComponentFiles;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DCD is based on the SAD (e.g., componentfiles, partitioning, etc.) DTD. The intent of the DCD is to provide the means of describing the components that are initially started on the CF DeviceManager node, how to obtain the CF DomainManager object reference, connections of services to components (CF Devices, CF DeviceManager), and the characteristics (file system names, etc.) for a CF DeviceManager. 
 * 
 * The componentfiles and partitioning elements are optional; if not provided,
 * that means no components are started up on the node, except for a CF DeviceManager.
 * 
 * If the partitioning element is specified then a componentfiles element has to be specified also.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDeviceManagerSoftPkg <em>Device Manager Soft Pkg</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getComponentFiles <em>Component Files</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getConnections <em>Connections</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDomainManager <em>Domain Manager</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getFileSystemNames <em>File System Names</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration()
 * @model extendedMetaData="name='deviceconfiguration' kind='elementOnly'"
 * @generated
 */
public interface DeviceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional description element, of the deviceconfiguration element, may be used to provide
	 * information about the device configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Device Manager Soft Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The devicemanagersoftpkg element refers to the SPD for the CF DeviceManager that
	 * corresponds to this DCD. The SPD file is referenced by a localfile element. The referenced file
	 * can be used to describe the CF DeviceManager implementation and to specify the usesports for
	 * the services (Log(s), etc.) used by the CF DeviceManager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Manager Soft Pkg</em>' containment reference.
	 * @see #setDeviceManagerSoftPkg(DeviceManagerSoftPkg)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_DeviceManagerSoftPkg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='devicemanagersoftpkg'"
	 * @generated
	 */
	DeviceManagerSoftPkg getDeviceManagerSoftPkg();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDeviceManagerSoftPkg <em>Device Manager Soft Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Manager Soft Pkg</em>' containment reference.
	 * @see #getDeviceManagerSoftPkg()
	 * @generated
	 */
	void setDeviceManagerSoftPkg(DeviceManagerSoftPkg value);

	/**
	 * Returns the value of the '<em><b>Component Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional componentfiles element is used to reference deployment information for
	 * components that are started up on the device. The componentfile element references a Software
	 * Package Descriptor (SPD). The SPD, for example, can be used to describe logical Devices, a CF
	 * DeviceManager, a CF DomainManager, a Naming Service, and CF FileSystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Files</em>' containment reference.
	 * @see #setComponentFiles(ComponentFiles)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_ComponentFiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentfiles'"
	 * @generated
	 */
	ComponentFiles getComponentFiles();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getComponentFiles <em>Component Files</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional partitioning element consists of a set of componentplacement elements. A
	 * component instantiation is captured inside a componentplacement element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partitioning</em>' containment reference.
	 * @see #setPartitioning(DcdPartitioning)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_Partitioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partitioning'"
	 * @generated
	 */
	DcdPartitioning getPartitioning();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getPartitioning <em>Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitioning</em>' containment reference.
	 * @see #getPartitioning()
	 * @generated
	 */
	void setPartitioning(DcdPartitioning value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference.
	 * @see #setConnections(DcdConnections)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_Connections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connections'"
	 * @generated
	 */
	DcdConnections getConnections();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getConnections <em>Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' containment reference.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(DcdConnections value);

	/**
	 * Returns the value of the '<em><b>Domain Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Manager</em>' containment reference.
	 * @see #setDomainManager(DomainManager)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_DomainManager()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='domainmanager'"
	 * @generated
	 */
	DomainManager getDomainManager();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getDomainManager <em>Domain Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Manager</em>' containment reference.
	 * @see #getDomainManager()
	 * @generated
	 */
	void setDomainManager(DomainManager value);

	/**
	 * Returns the value of the '<em><b>File System Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File System Names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File System Names</em>' containment reference.
	 * @see #setFileSystemNames(FileSystemNames)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_FileSystemNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filesystemnames'"
	 * @generated
	 */
	FileSystemNames getFileSystemNames();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getFileSystemNames <em>File System Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File System Names</em>' containment reference.
	 * @see #getFileSystemNames()
	 * @generated
	 */
	void setFileSystemNames(FileSystemNames value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deviceconfiguration element’s id attribute is a unique identifier within the domain for the
	 * device configuration. This id attribute is a UUID value as specified in section D.2.1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_Id()
	 * @model id="true" dataType="mil.jpeojtrs.sca.prf.DceUUID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getId <em>Id</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name attribute is the user-friendly name for the CF DeviceManager’s label attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.dcd.DcdPackage#getDeviceConfiguration_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.dcd.DeviceConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DcdComponentInstantiation getComponentInstantiation(String instantiationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DcdComponentInstantiation> getComponentInstantiationsInStartOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<DcdComponentInstantiation> getAllComponentInstantiations();

	public static final String EOBJECT_PATH = "/";

	public static class Util {
		// END GENERATED CODE
		private Util() {

		}

		public static DeviceConfiguration getDeviceConfiguration(Resource resource) {
			EObject obj = resource.getEObject(DeviceConfiguration.EOBJECT_PATH);
			if (obj instanceof DcdDocumentRoot) {
				return ((DcdDocumentRoot) obj).getDeviceconfiguration();
			} else if (obj instanceof DeviceConfiguration) {
				return (DeviceConfiguration) obj;
			} else {
				return null;
			}
		}

		public static String createDeviceUsageName(DeviceConfiguration dcd, String deviceName) {
			String baseName = deviceName;
			if (baseName.contains(".")) {
				int baseNameIndex = baseName.lastIndexOf(".");
				baseName = baseName.substring(baseNameIndex + 1);
			}

			// Make up a unique new name here.
			final StringBuilder usageName = new StringBuilder();
			final Pattern p = Pattern.compile(baseName + "_([0-9]+)");
			final List<Integer> usedIndexes = new ArrayList<Integer>();

			usageName.append(baseName);

			if (dcd.getPartitioning() != null) {
				for (final DcdComponentPlacement impl : dcd.getPartitioning().getComponentPlacement()) {
					if (impl.getComponentInstantiation().isEmpty()) {
						continue;
					}

					final String name = impl.getComponentInstantiation().get(0).getUsageName();
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

			return usageName.append("_").append(index).toString();
		}

		public static String createDeviceIdentifier(DeviceConfiguration dcd, String usageName) {
			return dcd.getName() + ":" + usageName;
		}
		// BEGIN GENERATED CODE
	}

} // DeviceConfiguration

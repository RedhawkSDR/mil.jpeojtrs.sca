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
package mil.jpeojtrs.sca.sad.util;

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPackage;
import mil.jpeojtrs.sca.util.DTDSaveImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see mil.jpeojtrs.sca.sad.util.SadResourceFactoryImpl
 * @generated
 */
public class SadResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public SadResourceImpl(URI uri) {
		super(uri);
	}

	/**
	 * The DTD system identifier.
	 */
	public static final String DOC_TYPE_SYSTEM = "softwareassembly.dtd";

	/**
	 * The DTD formal public identifier (FPI).
	 * @since 3.0
	 */
	public static final String DOC_TYPE_PUBLIC = "-//JTRS//DTD SCA V2.2.2 SAD//EN";

	protected static class SadXMLHelper extends XMLHelperImpl {
		public SadXMLHelper() {
			super();
		}

		public SadXMLHelper(XMLResource resource) {
			super(resource);
		}

		@Override
		public EObject createObject(EFactory eFactory, EClassifier type) {
			if (type == PartitioningPackage.eINSTANCE.getComponentFile()) {
				type = PartitioningPackage.eINSTANCE.getDomComponentFile();
			} else if (type == PartitioningPackage.eINSTANCE.getComponentInstantiation()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadComponentInstantiation();
			} else if (type == PartitioningPackage.eINSTANCE.getPartitioning()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadPartitioning();
			} else if (type == PartitioningPackage.eINSTANCE.getComponentPlacement()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadComponentPlacement();
			} else if (type == PartitioningPackage.eINSTANCE.getConnectInterface()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadConnectInterface();
			} else if (type == PartitioningPackage.eINSTANCE.getUsesPort()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadUsesPort();
			} else if (type == PartitioningPackage.eINSTANCE.getProvidesPort()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadProvidesPort();
			} else if (type == PartitioningPackage.eINSTANCE.getConnections()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadConnections();
			} else if (type == PartitioningPackage.eINSTANCE.getComponentInstantiationRef()) {
				eFactory = SadFactory.eINSTANCE;
				type = SadPackage.eINSTANCE.getSadComponentInstantiationRef();
			}
			return super.createObject(eFactory, type);
		}

		@Override
		protected String getPrefix(EPackage ePackage, boolean mustHavePrefix) {
			return "";
		}
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new SadXMLHelper(this);
	}

	@Override
	protected XMLSave createXMLSave() {
		return new DTDSaveImpl(createXMLHelper());
	}

} //SadResourceImpl

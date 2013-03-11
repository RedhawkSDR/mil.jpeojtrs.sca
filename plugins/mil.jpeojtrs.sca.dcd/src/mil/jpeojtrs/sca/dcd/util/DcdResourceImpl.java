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
package mil.jpeojtrs.sca.dcd.util;

import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DcdPackage;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
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
 * @see mil.jpeojtrs.sca.dcd.util.DcdResourceFactoryImpl
 * @generated
 */
public class DcdResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public DcdResourceImpl(URI uri) {
		super(uri);
	}

	public static final String DOC_TYPE_SYSTEM = "deviceconfiguration.dtd";
	
	protected static class DcdXMLHelper extends XMLHelperImpl {

		public DcdXMLHelper() {
	        super();
        }

		public DcdXMLHelper(XMLResource resource) {
	        super(resource);
        }
		
		@Override
		public EObject createObject(EFactory eFactory, EClassifier type) {
			if (type == PartitioningPackage.eINSTANCE.getComponentFile()) {
				type = PartitioningPackage.eINSTANCE.getDevComponentFile();
			} else if ( type == PartitioningPackage.eINSTANCE.getComponentInstantiation()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdComponentInstantiation();
			} else if (type == PartitioningPackage.eINSTANCE.getPartitioning()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdPartitioning();
			} else if (type == PartitioningPackage.eINSTANCE.getComponentPlacement()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdComponentPlacement();
			} else if (type == PartitioningPackage.eINSTANCE.getConnectInterface()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdConnectInterface();
			} else if (type == PartitioningPackage.eINSTANCE.getUsesPort()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdUsesPort();
			} else if (type == PartitioningPackage.eINSTANCE.getProvidesPort()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdProvidesPort();
			} else if (type == PartitioningPackage.eINSTANCE.getComponentInstantiationRef()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdComponentInstantiationRef();
			} else if (type == PartitioningPackage.eINSTANCE.getConnections()) {
				eFactory = DcdFactory.eINSTANCE;
				type = DcdPackage.eINSTANCE.getDcdConnections();
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
		return new DcdXMLHelper(this);
	}
	
	@Override
	protected XMLSave createXMLSave() {
		return new DTDSaveImpl(createXMLHelper());
	}

} //DcdResourceImpl

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
package mil.jpeojtrs.sca.util;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;

public class DTDSaveImpl extends XMLSaveImpl {

	public DTDSaveImpl(final Map< ? , ? > options, final XMLHelper helper, final String encoding, final String xmlVersion) {
		super(options, helper, encoding, xmlVersion);
	}

	public DTDSaveImpl(final Map< ? , ? > options, final XMLHelper helper, final String encoding) {
		super(options, helper, encoding);
	}

	public DTDSaveImpl(final XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void saveTypeAttribute(final EClass eClass) {
		// Do Nothing, this forces the XML to NOT have type information, since we are using DTD's
	}

	@Override
	protected void saveTypeAttribute(final EDataType eDataType) {
		// Do Nothing, this forces the XML to NOT have type information, since we are using DTD's
	}

}

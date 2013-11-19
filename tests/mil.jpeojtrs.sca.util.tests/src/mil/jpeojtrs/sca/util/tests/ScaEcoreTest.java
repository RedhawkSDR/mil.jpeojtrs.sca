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
package mil.jpeojtrs.sca.util.tests;

import org.junit.Assert;
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Test;

/**
 * 
 */
public class ScaEcoreTest {

	/**
	 * Test method for {@link mil.jpeojtrs.sca.util.UnsignedUtils#toSigned(short[])}.
	 */
	@Test
	public void testGetNull() {
		final EStructuralFeature path = SpdPackage.Literals.SOFT_PKG__AUTHOR;
		Assert.assertNull(ScaEcoreUtils.getFeature(null, path));

		Assert.assertNull(ScaEcoreUtils.getFeature(null, (EStructuralFeature) null));
		Assert.assertNull(ScaEcoreUtils.getFeature(null, (EStructuralFeature[]) null));
	}

	@Test
	public void testGet() {
		Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		Code code = SpdFactory.eINSTANCE.createCode();
		LocalFile file = SpdFactory.eINSTANCE.createLocalFile();
		impl.setCode(code);
		code.setLocalFile(file);

		final EStructuralFeature[] path = new EStructuralFeature[] {
		        SpdPackage.Literals.IMPLEMENTATION__CODE, SpdPackage.Literals.CODE__LOCAL_FILE
		};
		Assert.assertEquals(file, ScaEcoreUtils.getFeature(impl, path));
	}

	@Test(expected = ClassCastException.class)
	public void testBadPathGet() {
		Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		impl.setCompiler(SpdFactory.eINSTANCE.createCompiler());
		Code code = SpdFactory.eINSTANCE.createCode();
		LocalFile file = SpdFactory.eINSTANCE.createLocalFile();
		impl.setCode(code);
		code.setLocalFile(file);

		final EStructuralFeature[] path = new EStructuralFeature[] {
		        SpdPackage.Literals.IMPLEMENTATION__COMPILER, SpdPackage.Literals.CODE__LOCAL_FILE
		};
		ScaEcoreUtils.getFeature(impl, path);
	}
	
	@Test(expected = org.eclipse.core.runtime.AssertionFailedException.class)
	public void testGetEContainerOfType_Nulls() {
		ScaEcoreUtils.getEContainerOfType(null, null);
	}
	
	@Test
	public void testGetEContainerOfType_NullObj() {
		Assert.assertNull(ScaEcoreUtils.getEContainerOfType(null, String.class));
	}
	
	@Test
	public void testGetEContainerOfType() {
		Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		impl.setCompiler(SpdFactory.eINSTANCE.createCompiler());
		Code code = SpdFactory.eINSTANCE.createCode();
		LocalFile file = SpdFactory.eINSTANCE.createLocalFile();
		impl.setCode(code);
		code.setLocalFile(file);
		
		Assert.assertEquals(impl, ScaEcoreUtils.getEContainerOfType(file, Implementation.class));
	}
	
	@Test
	public void testGetEContainerOfType_NullReturn() {
		Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		impl.setCompiler(SpdFactory.eINSTANCE.createCompiler());
		Code code = SpdFactory.eINSTANCE.createCode();
		LocalFile file = SpdFactory.eINSTANCE.createLocalFile();
		impl.setCode(code);
		code.setLocalFile(file);
		
		Assert.assertNull(ScaEcoreUtils.getEContainerOfType(file, String.class));
	}
}

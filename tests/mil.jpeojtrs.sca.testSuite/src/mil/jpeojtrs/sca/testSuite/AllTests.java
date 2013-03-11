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
package mil.jpeojtrs.sca.testSuite;

import mil.jpeojtrs.sca.dcd.tests.DcdAllTests;
import mil.jpeojtrs.sca.dmd.tests.DmdAllTests;
import mil.jpeojtrs.sca.partitioning.tests.PartitioningAllTests;
import mil.jpeojtrs.sca.prf.tests.PrfAllTests;
import mil.jpeojtrs.sca.profile.tests.ProfileAllTests;
import mil.jpeojtrs.sca.sad.tests.SadAllTests;
import mil.jpeojtrs.sca.scd.tests.ScdAllTests;
import mil.jpeojtrs.sca.spd.tests.SpdTestSuite;
import mil.jpeojtrs.sca.util.tests.ScaUtilTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DcdAllTests.class,
		DmdAllTests.class,
		PartitioningAllTests.class, 
		PrfAllTests.class, 
		ProfileAllTests.class,
		SadAllTests.class, 
		ScdAllTests.class, 
		SpdTestSuite.class,
		ScaUtilTestSuite.class })
public class AllTests {

}

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
package mil.jpeojtrs.sca.validator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.model.ConstraintStatus;

public class EnhancedConstraintStatus extends ConstraintStatus implements
IEnhancedConstraintStatus {

	private final EStructuralFeature resultStructuralFeature;

	public EnhancedConstraintStatus(final ConstraintStatus status,
			final EStructuralFeature resultStructuralFeature) {
		super(status.getConstraint(), status.getTarget(), status.getMessage(),
				status.getResultLocus());
		this.resultStructuralFeature = resultStructuralFeature;
	}

	public EStructuralFeature getResultStructuralFeature() {
		return this.resultStructuralFeature;
	}

}

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
package mil.jpeojtrs.sca.prf.util;

import CF.DataType;
import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Values;

/**
 * @since 3.0
 */
public final class PropertiesUtil {

	private PropertiesUtil() {
	}

	/**
	 * Determines if calling {@link CF.PropertyEmitter#initializeProperties(DataType[])} is allowed for this property.
	 * @since 6.0
	 */
	public static boolean canInitialize(AbstractProperty property) {
		if ((property == null) || !property.isKind(PropertyConfigurationType.PROPERTY) || property.isKind(PropertyConfigurationType.EXECPARAM)) {
			return false;
		}
		if ((property instanceof Simple) && ((Simple) property).isCommandLine()) {
			return false;
		}
		return true;
	}

	/**
	 * Determines if calling {@link CF.PropertySet#configure(DataType[])} is allowed for this property.
	 * @param property
	 * @return
	 */
	public static boolean canConfigure(final AbstractProperty property) {
		return (property != null) && (property.getMode() != AccessType.READONLY)
			&& property.isKind(PropertyConfigurationType.PROPERTY, PropertyConfigurationType.CONFIGURE);
	}

	public static boolean canOverride(final AbstractProperty property) {
		// Per D.6.1.3.3 configure, factoryparam, and/or execparam
		// with mode "readwrite" or "writeonly" can be overridden
		return (property != null) && (property.getMode() != AccessType.READONLY) && property.isKind(PropertyConfigurationType.PROPERTY,
			PropertyConfigurationType.CONFIGURE, PropertyConfigurationType.EXECPARAM, PropertyConfigurationType.FACTORYPARAM);
	}

	public static String getDefaultValue(PropertyValueType type) {
		switch (type) {
		case STRING:
			return "";
		case BOOLEAN:
			return "false";
		case ULONG:
			return "0";
		case OBJREF:
			return "";
		case SHORT:
			return "0";
		case FLOAT:
			return "0.0";
		case OCTET:
			return "0";
		case CHAR:
			return "";
		case USHORT:
			return "0";
		case DOUBLE:
			return "0.0";
		case LONG:
			return "0";
		case LONGLONG:
			return "0";
		case ULONGLONG:
			return "0";
		default:
			break;
		}
		return "";
	}

	/**
	 * Get the default value for a property type should the {@link Simple} not already have a value
	 * 
	 * @param simple The {@link Simple} instance that we shall find an appropriate value for
	 * @return a new default value for the {@link Simple} should it not have a value already
	 * 
	 * @since 4.0
	 */
	public static String getDefaultValue(final Simple simple) {
		if (simple.getValue() != null) {
			return simple.getValue();
		} else {
			return getDefaultValue(simple.getType());
		}
	}

	/**
	 * Get the default value for a property type should the {@link Simple} not already have a value
	 * 
	 * @param simple The {@link Simple} instance that we shall find an appropriate value for
	 * @return a new default value for the {@link Simple} should it not have a value already
	 * 
	 * @since 5.0
	 */
	public static Values getDefaultValues(final SimpleSequence simples) {
		if (simples.getValues() != null) {
			return simples.getValues();
		} else {
			return PrfFactory.eINSTANCE.createValues();
		}
	}
}

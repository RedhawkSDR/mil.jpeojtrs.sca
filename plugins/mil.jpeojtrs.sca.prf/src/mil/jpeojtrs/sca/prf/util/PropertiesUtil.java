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

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyRefContainer;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructSequenceRef;
import mil.jpeojtrs.sca.prf.StructValue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @since 3.0
 * 
 */
public final class PropertiesUtil {
	private PropertiesUtil() {

	}
	
	/**
	 * Evaluates the {@link AbstractProperty} to determine if it can be edited.
	 * 
	 * @param property the {@link AbstractProperty} to evaluate
	 * @return <code> true </code> if the property is editable; <code> false </code> otherwise
	 * @since 4.0
	 * @deprecated Use {@link #canOverride(AbstractProperty)} instead.
	 */
	@Deprecated
	public static boolean canEdit(final AbstractProperty property) {
		return canOverride(property);
	}
	
	public static boolean canConfigure(final AbstractProperty property) {
		if (property == null) {
			return false;
		}
		if (property.getMode() != AccessType.READONLY) {
			return property.isKind(PropertyConfigurationType.CONFIGURE);
		}
		return false;
	}

	public static boolean canOverride(final AbstractProperty property) {
		if (property == null) {
			return false;
		}
		// Per D.6.1.3.3 configure, factoryparam, and/or execparam
		// with mode "readwrite" or "writeonly" can be overridden
		if (property.getMode() != AccessType.READONLY) {
			return property.isKind(PropertyConfigurationType.CONFIGURE, PropertyConfigurationType.EXECPARAM, PropertyConfigurationType.FACTORYPARAM);
		}
		return false;
	}
	
	public static SimpleRef createRef(Simple simple) {
		SimpleRef ref = PrfFactory.eINSTANCE.createSimpleRef();
		ref.setRefID(simple.getId());
		ref.setValue(simple.getValue());
		return ref;
	}
	
	public static SimpleSequenceRef createRef(SimpleSequence property) {
		SimpleSequenceRef ref = PrfFactory.eINSTANCE.createSimpleSequenceRef();
		ref.setRefID(property.getId());
		ref.setValues(EcoreUtil.copy(property.getValues()));
		return ref;
	}
	
	public static StructRef createRef(Struct property) {
		StructRef ref = PrfFactory.eINSTANCE.createStructRef();
		ref.setRefID(property.getId());
		for (Simple s : property.getSimple()) {
			ref.getSimpleRef().add(createRef(s));
		}
		return ref;
	}
	
	public static StructValue createStructValue(StructSequence property) {
		StructValue retVal = PrfFactory.eINSTANCE.createStructValue();
		for (Simple s : property.getStruct().getSimple()) {
			SimpleRef ref = createRef(s);
			if (ref.getValue() == null) {
				ref.setValue(getDefaultValue(s));
			}
			retVal.getSimpleRef().add(ref);
		}
		return retVal;
	}
	
	public static StructSequenceRef createRef(StructSequence structSequence) {
		StructSequenceRef ref = PrfFactory.eINSTANCE.createStructSequenceRef();
		ref.setRefID(structSequence.getId());
		for (StructValue value : structSequence.getStructValue()) {
			ref.getStructValue().add(EcoreUtil.copy(value));
		}
		return ref;
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
	 * @since 4.0
	 */
	public static AbstractPropertyRef< ? > getPropertyRef(final SimpleRef property, final PropertyRefContainer props) {
		if (property == null) {
			return null;
		}
		return getPropertyRef(property.getRefID(), props);
	}

	/**
	 * @since 4.0
	 */
	public static AbstractPropertyRef< ? > getPropertyRef(final String propertyID, final PropertyRefContainer props) {
		if (props == null || propertyID == null) {
			return null;
		}
		for (final EObject obj : props.eContents()) {
			if (obj instanceof AbstractPropertyRef< ? >) {
				final AbstractPropertyRef< ? > ref = (AbstractPropertyRef< ? >) obj;
				if (propertyID.equals(ref.getRefID())) {
					return ref;
				}
			}
		}
		return null;
	}
	
	public static AbstractPropertyRef< ? > getPropertyRef(final Simple property, final PropertyRefContainer props) {
		if (property.eContainer() instanceof Struct) {
			Struct struct = (Struct) property.eContainer();
			StructRef structRef = (StructRef) getPropertyRef(struct, props);
			return getPropertyRef(property, structRef);
		} else {
			return getPropertyRef((AbstractProperty) property, (PropertyRefContainer) props); 
		}
	}
	
	public static AbstractPropertyRef< ? > getPropertyRef(final Simple property, final StructRef props) {
		return getPropertyRef((AbstractProperty) property, (PropertyRefContainer) props);
	}

	/**
	 * @since 4.0
	 */
	public static AbstractPropertyRef< ? > getPropertyRef(final AbstractProperty property, final PropertyRefContainer props) {
		if (property == null) {
			return null;
		}
		return getPropertyRef(property.getId(), props);
	}
}

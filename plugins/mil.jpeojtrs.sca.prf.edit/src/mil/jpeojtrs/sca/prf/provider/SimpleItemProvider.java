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
package mil.jpeojtrs.sca.prf.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.Enumeration;
import mil.jpeojtrs.sca.prf.Enumerations;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.Simple;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.prf.Simple} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleItemProvider extends AbstractPropertyItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuePropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addComplexPropertyDescriptor(object);
			addCommandlinePropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	private class ValueItemPropertyDescriptor extends ItemPropertyDescriptorDecorator {

		public ValueItemPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		@Override
		public IItemLabelProvider getLabelProvider(final Object thisObject) {
			final Simple property = (Simple) thisObject;
			final IItemLabelProvider lp = super.getLabelProvider(thisObject);
			return new IItemLabelProvider() {

				@Override
				public String getText(Object object) {
					return getValueText(property, (String) object);
				}

				@Override
				public Object getImage(Object object) {
					return lp.getImage(property);
				}
			};
		}

		@Override
		public Collection< ? > getChoiceOfValues(Object thisObject) {
			Simple property = (Simple) thisObject;
			Enumerations enums = property.getEnumerations();
			if (enums != null) {
				List<Object> result = new ArrayList<Object>();
				for (Enumeration e : enums.getEnumeration()) {
					result.add(e.getValue());
				}
				return result;
			}
			return super.getChoiceOfValues(thisObject);
		}
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Simple_value_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Simple_value_feature", "_UI_Simple_type"),
			PrfPackage.Literals.SIMPLE__VALUE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValuePropertyDescriptor(Object object) {
		// END GENERATED CODE
		final ItemPropertyDescriptor defaultDescriptor = createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(), getString("_UI_Simple_value_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Simple_value_feature", "_UI_Simple_type"), PrfPackage.Literals.SIMPLE__VALUE, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null);

		this.itemPropertyDescriptors.add(new ValueItemPropertyDescriptor(object, defaultDescriptor));
		// BEGIN GENERATED CODE
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Simple_units_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Simple_units_feature", "_UI_Simple_type"),
			PrfPackage.Literals.SIMPLE__UNITS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Simple_type_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Simple_type_feature", "_UI_Simple_type"),
			PrfPackage.Literals.SIMPLE__TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Complex feature.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Simple_complex_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Simple_complex_feature", "_UI_Simple_type"),
			PrfPackage.Literals.SIMPLE__COMPLEX, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Commandline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Simple_commandline_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Simple_commandline_feature", "_UI_Simple_type"),
			PrfPackage.Literals.SIMPLE__COMMANDLINE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Simple_optional_feature"), getString("_UI_PropertyDescriptor_description", "_UI_Simple_optional_feature", "_UI_Simple_type"),
			PrfPackage.Literals.SIMPLE__OPTIONAL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Simple.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Simple"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// END GENERATED CODE
		String label = ((Simple) object).getName();
		String id = ((Simple) object).getId();
		if (label != null && label.length() != 0) {
			return label;
		} else if (id != null && id.length() != 0) {
			return id;
		} else {
			return getString("_UI_Simple_type");
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Simple.class)) {
		case PrfPackage.SIMPLE__VALUE:
		case PrfPackage.SIMPLE__UNITS:
		case PrfPackage.SIMPLE__RANGE:
		case PrfPackage.SIMPLE__ENUMERATIONS:
		case PrfPackage.SIMPLE__KIND:
		case PrfPackage.SIMPLE__ACTION:
		case PrfPackage.SIMPLE__TYPE:
		case PrfPackage.SIMPLE__COMPLEX:
		case PrfPackage.SIMPLE__COMMANDLINE:
		case PrfPackage.SIMPLE__OPTIONAL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	@Override
	protected String getValueText(AbstractProperty object) {
		Simple simple = (Simple) object;
		return getValueText(simple, simple.getValue());
	}

	public static String getValueText(Simple property, String value) {
		String retVal = null;
		if (value == null || value.toString().length() == 0) {
			return "";
		}

		if (property.getEnumerations() != null) {
			for (Enumeration e : property.getEnumerations().getEnumeration()) {
				if (e.getValue().equals(value.toString())) {
					retVal = e.getLabel();
					break;
				}
			}
		}

		if (retVal == null) {
			retVal = value.toString();
		}

		final String units = property.getUnits();
		if (units != null) {
			return retVal + " " + units;
		} else {
			return retVal;
		}
	}

}

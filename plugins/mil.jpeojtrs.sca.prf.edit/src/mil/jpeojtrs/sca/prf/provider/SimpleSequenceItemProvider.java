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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Values;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.prf.SimpleSequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSequenceItemProvider extends AbstractPropertyItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSequenceItemProvider(AdapterFactory adapterFactory) {
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

			addValuesPropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addComplexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	private class ValuesDecorator extends ItemPropertyDescriptorDecorator {
		public ValuesDecorator(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		@Override
		public IItemLabelProvider getLabelProvider(final Object thisObject) {
			final SimpleSequence property = (SimpleSequence) thisObject;

			final IItemLabelProvider lp = super.getLabelProvider(thisObject);
			return new IItemLabelProvider() {

				@SuppressWarnings("unchecked")
				public String getText(Object object) {
					List<String> value = null;
					if (object instanceof Values) {
						value = ((Values) object).getValue();
					} else if (object != null && object.getClass().isArray()) {
						value = Arrays.asList((String[]) object);
					} else if (object instanceof List< ? >) {
						value = (List<String>) object;
					}
					return getValueText(property, value);
				}

				public Object getImage(Object object) {
					return lp.getImage(object);
				}
			};
		}

	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuesPropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleSequence_values_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequence_values_feature", "_UI_SimpleSequence_type"),
				 PrfPackage.Literals.SIMPLE_SEQUENCE__VALUES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		// END GENERATED CODE
		final ItemPropertyDescriptor defaultDescriptor = createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
		        getString("_UI_SimpleSequence_values_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequence_values_feature", "_UI_SimpleSequence_type"),
		        PrfPackage.Literals.SIMPLE_SEQUENCE__VALUES, false, false, false, null, null, null);

		this.itemPropertyDescriptors.add(new ValuesDecorator(object, defaultDescriptor));
		// BEGIN GENERATED CODE
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleSequence_units_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequence_units_feature", "_UI_SimpleSequence_type"),
				 PrfPackage.Literals.SIMPLE_SEQUENCE__UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleSequence_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequence_type_feature", "_UI_SimpleSequence_type"),
				 PrfPackage.Literals.SIMPLE_SEQUENCE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complex feature.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComplexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleSequence_complex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequence_complex_feature", "_UI_SimpleSequence_type"),
				 PrfPackage.Literals.SIMPLE_SEQUENCE__COMPLEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimpleSequence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleSequence"));
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
		String label = ((SimpleSequence) object).getName();
		String id = ((SimpleSequence) object).getId();
		if (label != null && label.length() != 0) {
			return label;
		} else if (id != null && id.length() != 0) {
			return id;
		} else {
			return getString("_UI_SimpleSequence_type");
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

		switch (notification.getFeatureID(SimpleSequence.class)) {
			case PrfPackage.SIMPLE_SEQUENCE__VALUES:
			case PrfPackage.SIMPLE_SEQUENCE__UNITS:
			case PrfPackage.SIMPLE_SEQUENCE__RANGE:
			case PrfPackage.SIMPLE_SEQUENCE__KIND:
			case PrfPackage.SIMPLE_SEQUENCE__ACTION:
			case PrfPackage.SIMPLE_SEQUENCE__TYPE:
			case PrfPackage.SIMPLE_SEQUENCE__COMPLEX:
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
	    SimpleSequence seq = (SimpleSequence) object;
	    return getValueText(seq, seq.getValues() == null ? null : seq.getValues().getValue());
	}
	
	public static String getValueText(SimpleSequence property, List<String> value) {
		String retVal = null;
		if (value == null || value.isEmpty()) {
			retVal = Collections.emptyList().toString();
		} else {
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

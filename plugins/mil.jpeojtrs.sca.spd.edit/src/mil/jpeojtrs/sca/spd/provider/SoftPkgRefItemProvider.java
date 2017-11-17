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
package mil.jpeojtrs.sca.spd.provider;

import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.spd.ImplRef;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.SoftPkgRef;
import mil.jpeojtrs.sca.spd.SpdPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.spd.SoftPkgRef} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SoftPkgRefItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkgRefItemProvider(AdapterFactory adapterFactory) {
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

			addLocalFilePropertyDescriptor(object);
			addImplRefPropertyDescriptor(object);
			addImplementationPropertyDescriptor(object);
			addSoftPkgPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Local File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftPkgRef_localFile_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftPkgRef_localFile_feature", "_UI_SoftPkgRef_type"),
			SpdPackage.Literals.SOFT_PKG_REF__LOCAL_FILE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Impl Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftPkgRef_implRef_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftPkgRef_implRef_feature", "_UI_SoftPkgRef_type"),
			SpdPackage.Literals.SOFT_PKG_REF__IMPL_REF, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftPkgRef_implementation_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftPkgRef_implementation_feature", "_UI_SoftPkgRef_type"),
			SpdPackage.Literals.SOFT_PKG_REF__IMPLEMENTATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Soft Pkg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftPkgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_SoftPkgRef_softPkg_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SoftPkgRef_softPkg_feature", "_UI_SoftPkgRef_type"),
			SpdPackage.Literals.SOFT_PKG_REF__SOFT_PKG, true, false, true, null, null, null));
	}

	/**
	 * This returns SoftPkgRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftPkgRef"));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getColumnText(final Object object, final int columnIndex) {
		if (columnIndex == 0) {
			return getText(object);
		}
		return super.getColumnText(object, columnIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getColumnImage(final Object object, final int columnIndex) {
		if (columnIndex == 0) {
			return getImage(object);
		}
		return super.getColumnImage(object, columnIndex);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getText(final Object object) {
		// END GENERATED CODE
		final SoftPkgRef ref = (SoftPkgRef) object;
		final ImplRef impl = ref.getImplRef();
		final LocalFile file = ref.getLocalFile();

		if (file != null) {
			if (impl != null) {
				return getString("_UI_SoftPkgRef_type") + ": " + file.getName() + "(" + impl.getRefid() + ")";
			} else {
				return getString("_UI_SoftPkgRef_type") + ": " + file.getName();
			}
		} else {
			return getString("_UI_SoftPkgRef_type");
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

		switch (notification.getFeatureID(SoftPkgRef.class)) {
		case SpdPackage.SOFT_PKG_REF__LOCAL_FILE:
		case SpdPackage.SOFT_PKG_REF__IMPL_REF:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpdEditPlugin.INSTANCE;
	}

}

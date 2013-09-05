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
package mil.jpeojtrs.sca.prf.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructValue;
import mil.jpeojtrs.sca.prf.util.PropertiesUtil;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.CORBA.Any;
import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.ORB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructSequenceImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructSequenceImpl#getStructValue <em>Struct Value</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.impl.StructSequenceImpl#getConfigurationKind <em>Configuration Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructSequenceImpl extends AbstractPropertyImpl implements StructSequence {
	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected Struct struct;
	/**
	 * The cached value of the '{@link #getStructValue() <em>Struct Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StructValue> structValue;
	/**
	 * The cached value of the '{@link #getConfigurationKind() <em>Configuration Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKind()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationKind> configurationKind;
	private Adapter simpleListener = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			if (notification.getNotifier() instanceof Simple) {
				switch(notification.getFeatureID(Simple.class)) {
				case PrfPackage.SIMPLE__ID:
					updateSimpleRefID(notification);
					break;
				default:
					break;
				}
			} else if (notification.getNotifier() instanceof Struct) {
				switch(notification.getFeatureID(Struct.class)) {
				case PrfPackage.STRUCT__SIMPLE:
					updateSimpleRefs(notification);
					break;
				default:
					break;
			}
		}
		}
		protected void addAdapter(org.eclipse.emf.common.notify.Notifier notifier) {
			if (notifier instanceof StructSequence || notifier instanceof Struct || notifier instanceof Simple) {
				super.addAdapter(notifier);
			}
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected StructSequenceImpl() {
		super();
		eAdapters().add(this.simpleListener);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrfPackage.Literals.STRUCT_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Struct newStruct, NotificationChain msgs) {
		Struct oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrfPackage.STRUCT_SEQUENCE__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		if (newStruct != struct)
		{
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrfPackage.STRUCT_SEQUENCE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrfPackage.STRUCT_SEQUENCE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrfPackage.STRUCT_SEQUENCE__STRUCT, newStruct, newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructValue> getStructValue() {
		if (structValue == null)
		{
			structValue = new EObjectContainmentEList<StructValue>(StructValue.class, this, PrfPackage.STRUCT_SEQUENCE__STRUCT_VALUE);
		}
		return structValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationKind> getConfigurationKind() {
		if (configurationKind == null)
		{
			configurationKind = new EObjectContainmentEList.Unsettable<ConfigurationKind>(ConfigurationKind.class, this, PrfPackage.STRUCT_SEQUENCE__CONFIGURATION_KIND);
		}
		return configurationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfigurationKind() {
		if (configurationKind != null) ((InternalEList.Unsettable<?>)configurationKind).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfigurationKind() {
		return configurationKind != null && ((InternalEList.Unsettable<?>)configurationKind).isSet();
	}

	protected void updateSimpleRefID(Notification notification) {
		for (StructValue structValue : getStructValue()) {
			for (SimpleRef ref : structValue.getSimpleRef()) {
				if (ref.getRefID() != null) {
					if (ref.getRefID().equals(notification.getOldStringValue())) {
						ref.setRefID(notification.getNewStringValue());
						break;
					}
				} else if (ref.getRefID() == null && notification.getOldStringValue() == null) {
					ref.setRefID(notification.getNewStringValue());
					break;
				}
			}
		}
	}
	
	protected void updateSimpleRefs(Notification notification) {
		Simple simple = (Simple) notification.getNewValue();
		if (simple != null) { //Add Simple Refs associated with new value
			for (StructValue structValue : getStructValue()) {
	        	SimpleRef ref = PrfFactory.eINSTANCE.createSimpleRef();
	        	ref.setRefID(simple.getId());
	        	ref.setValue(PropertiesUtil.getDefaultValue(simple));
	        	SimpleRef oldRef = null;
	        	for (SimpleRef sr: structValue.getSimpleRef()) {
	        		if (sr.getRefID().equals(simple.getId())) {
	        			oldRef = sr;
	        			break;
	        		}
	        	}
	        	if (oldRef != null) {
	        		structValue.getSimpleRef().remove(oldRef);
	        	}
	        	int index = this.getStruct().getSimple().indexOf(simple);
	        	structValue.getSimpleRef().add(index, ref);
	        }
		} else { //Remove SimpleRefs associated with the oldValue
			simple = (Simple)notification.getOldValue();
			if (simple != null) {
				for (StructValue structValue : getStructValue()) {
					Collection<SimpleRef> removeRefs = null;
					for (SimpleRef ref : structValue.getSimpleRef()) {
						if (ref.getRefID() != null && simple.getId() != null) {
							if (ref.getRefID().equals(simple.getId())) {
								removeRefs = Collections.singletonList(ref);
								break;
							}
						} else if (ref.getRefID() == null && simple.getId() == null) {
							removeRefs = Collections.singletonList(ref);
							break;
						}
					}
					if (removeRefs != null) {
						structValue.getSimpleRef().removeAll(removeRefs);
					}
				}
			}
			
		}
        
    }
	
	@Override
	public boolean isKind(PropertyConfigurationType ... type) {
		// END GENERATED CODE
		if (type == null) {
			return false;
		}
		if (eContainer() instanceof AbstractProperty) {
			return ((AbstractProperty) eContainer()).isKind(type);
		}

		Set<StructPropertyConfigurationType> types = new HashSet<StructPropertyConfigurationType>(type.length);
		for (PropertyConfigurationType t : type) {
			types.add(StructPropertyConfigurationType.getStructPropertyConfigurationType(t));
		}
		for (ConfigurationKind k : getConfigurationKind()) {
			if (types.contains(k.getType())) {
				return true;
			}
		}
		if (getConfigurationKind().isEmpty() && types.contains(StructPropertyConfigurationType.CONFIGURE)) {
			return true;
		}
		return false;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AbstractProperty getProperty(String repID) {
		// END GENERATED CODE
		return getStruct().getProperty(repID);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PrfPackage.STRUCT_SEQUENCE__STRUCT:
				return basicSetStruct(null, msgs);
			case PrfPackage.STRUCT_SEQUENCE__STRUCT_VALUE:
				return ((InternalEList<?>)getStructValue()).basicRemove(otherEnd, msgs);
			case PrfPackage.STRUCT_SEQUENCE__CONFIGURATION_KIND:
				return ((InternalEList<?>)getConfigurationKind()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case PrfPackage.STRUCT_SEQUENCE__STRUCT:
				return getStruct();
			case PrfPackage.STRUCT_SEQUENCE__STRUCT_VALUE:
				return getStructValue();
			case PrfPackage.STRUCT_SEQUENCE__CONFIGURATION_KIND:
				return getConfigurationKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PrfPackage.STRUCT_SEQUENCE__STRUCT:
				setStruct((Struct)newValue);
				return;
			case PrfPackage.STRUCT_SEQUENCE__STRUCT_VALUE:
				getStructValue().clear();
				getStructValue().addAll((Collection<? extends StructValue>)newValue);
				return;
			case PrfPackage.STRUCT_SEQUENCE__CONFIGURATION_KIND:
				getConfigurationKind().clear();
				getConfigurationKind().addAll((Collection<? extends ConfigurationKind>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case PrfPackage.STRUCT_SEQUENCE__STRUCT:
				setStruct((Struct)null);
				return;
			case PrfPackage.STRUCT_SEQUENCE__STRUCT_VALUE:
				getStructValue().clear();
				return;
			case PrfPackage.STRUCT_SEQUENCE__CONFIGURATION_KIND:
				unsetConfigurationKind();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case PrfPackage.STRUCT_SEQUENCE__STRUCT:
				return struct != null;
			case PrfPackage.STRUCT_SEQUENCE__STRUCT_VALUE:
				return structValue != null && !structValue.isEmpty();
			case PrfPackage.STRUCT_SEQUENCE__CONFIGURATION_KIND:
				return isSetConfigurationKind();
		}
		return super.eIsSet(featureID);
	}

	public EList<StructValue> getStructvalue() {
	    return getStructValue();
    }

	@Override
    public Any toAny() {
		Any retVal = ORB.init().create_any();
		List<Any> structVals = new ArrayList<Any>();
		for (StructValue structProp : getStructValue()) {
			structVals.add(structProp.toAny());
		}
		AnySeqHelper.insert(retVal, structVals.toArray(new Any[structVals.size()]));
		return retVal;
    }

} //StructSequenceImpl

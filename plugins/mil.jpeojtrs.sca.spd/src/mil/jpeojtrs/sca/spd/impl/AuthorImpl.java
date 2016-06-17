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
package mil.jpeojtrs.sca.spd.impl;

import java.util.Collection;

import mil.jpeojtrs.sca.spd.Author;
import mil.jpeojtrs.sca.spd.SpdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.AuthorImpl#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.AuthorImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.impl.AuthorImpl#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorImpl extends EObjectImpl implements Author {

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;
	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;
	/**
	 * The default value of the '{@link #getWebpage() <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBPAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWebpage() <em>Webpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebpage()
	 * @generated
	 * @ordered
	 */
	protected String webpage = WEBPAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeEList<String>(String.class, this, SpdPackage.AUTHOR__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.AUTHOR__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebpage() {
		return webpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebpage(String newWebpage) {
		String oldWebpage = webpage;
		webpage = newWebpage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdPackage.AUTHOR__WEBPAGE, oldWebpage, webpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdPackage.AUTHOR__NAME:
			return getName();
		case SpdPackage.AUTHOR__COMPANY:
			return getCompany();
		case SpdPackage.AUTHOR__WEBPAGE:
			return getWebpage();
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
		switch (featureID) {
		case SpdPackage.AUTHOR__NAME:
			getName().clear();
			getName().addAll((Collection< ? extends String>) newValue);
			return;
		case SpdPackage.AUTHOR__COMPANY:
			setCompany((String) newValue);
			return;
		case SpdPackage.AUTHOR__WEBPAGE:
			setWebpage((String) newValue);
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
		switch (featureID) {
		case SpdPackage.AUTHOR__NAME:
			getName().clear();
			return;
		case SpdPackage.AUTHOR__COMPANY:
			setCompany(COMPANY_EDEFAULT);
			return;
		case SpdPackage.AUTHOR__WEBPAGE:
			setWebpage(WEBPAGE_EDEFAULT);
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
		switch (featureID) {
		case SpdPackage.AUTHOR__NAME:
			return name != null && !name.isEmpty();
		case SpdPackage.AUTHOR__COMPANY:
			return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
		case SpdPackage.AUTHOR__WEBPAGE:
			return WEBPAGE_EDEFAULT == null ? webpage != null : !WEBPAGE_EDEFAULT.equals(webpage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", company: ");
		result.append(company);
		result.append(", webpage: ");
		result.append(webpage);
		result.append(')');
		return result.toString();
	}

} //AuthorImpl

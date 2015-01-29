/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.MultString;
import com.euclideanspace.xgener.gen.Procedure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ProcedureImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ProcedureImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ProcedureImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends MinimalEObjectImpl.Container implements Procedure
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected EList<MultString> prefix;

  /**
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected EList<MultString> suffix;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<String> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GenPackage.Literals.PROCEDURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PROCEDURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultString> getPrefix()
  {
    if (prefix == null)
    {
      prefix = new EObjectContainmentEList<MultString>(MultString.class, this, GenPackage.PROCEDURE__PREFIX);
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultString> getSuffix()
  {
    if (suffix == null)
    {
      suffix = new EObjectContainmentEList<MultString>(MultString.class, this, GenPackage.PROCEDURE__SUFFIX);
    }
    return suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypes()
  {
    if (types == null)
    {
      types = new EDataTypeEList<String>(String.class, this, GenPackage.PROCEDURE__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GenPackage.PROCEDURE__PREFIX:
        return ((InternalEList<?>)getPrefix()).basicRemove(otherEnd, msgs);
      case GenPackage.PROCEDURE__SUFFIX:
        return ((InternalEList<?>)getSuffix()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GenPackage.PROCEDURE__NAME:
        return getName();
      case GenPackage.PROCEDURE__PREFIX:
        return getPrefix();
      case GenPackage.PROCEDURE__SUFFIX:
        return getSuffix();
      case GenPackage.PROCEDURE__TYPES:
        return getTypes();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GenPackage.PROCEDURE__NAME:
        setName((String)newValue);
        return;
      case GenPackage.PROCEDURE__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends MultString>)newValue);
        return;
      case GenPackage.PROCEDURE__SUFFIX:
        getSuffix().clear();
        getSuffix().addAll((Collection<? extends MultString>)newValue);
        return;
      case GenPackage.PROCEDURE__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GenPackage.PROCEDURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GenPackage.PROCEDURE__PREFIX:
        getPrefix().clear();
        return;
      case GenPackage.PROCEDURE__SUFFIX:
        getSuffix().clear();
        return;
      case GenPackage.PROCEDURE__TYPES:
        getTypes().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GenPackage.PROCEDURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GenPackage.PROCEDURE__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case GenPackage.PROCEDURE__SUFFIX:
        return suffix != null && !suffix.isEmpty();
      case GenPackage.PROCEDURE__TYPES:
        return types != null && !types.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", types: ");
    result.append(types);
    result.append(')');
    return result.toString();
  }

} //ProcedureImpl

/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.ClassType;
import com.euclideanspace.xgener.gen.GenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl#getNoclass <em>Noclass</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl#getBlocking <em>Blocking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassTypeImpl extends MinimalEObjectImpl.Container implements ClassType
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
   * The cached value of the '{@link #getNoclass() <em>Noclass</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoclass()
   * @generated
   * @ordered
   */
  protected EList<String> noclass;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected EList<String> prefix;

  /**
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected EList<String> suffix;

  /**
   * The cached value of the '{@link #getBlocking() <em>Blocking</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocking()
   * @generated
   * @ordered
   */
  protected EList<String> blocking;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassTypeImpl()
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
    return GenPackage.Literals.CLASS_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.CLASS_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNoclass()
  {
    if (noclass == null)
    {
      noclass = new EDataTypeEList<String>(String.class, this, GenPackage.CLASS_TYPE__NOCLASS);
    }
    return noclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPrefix()
  {
    if (prefix == null)
    {
      prefix = new EDataTypeEList<String>(String.class, this, GenPackage.CLASS_TYPE__PREFIX);
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSuffix()
  {
    if (suffix == null)
    {
      suffix = new EDataTypeEList<String>(String.class, this, GenPackage.CLASS_TYPE__SUFFIX);
    }
    return suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBlocking()
  {
    if (blocking == null)
    {
      blocking = new EDataTypeEList<String>(String.class, this, GenPackage.CLASS_TYPE__BLOCKING);
    }
    return blocking;
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
      case GenPackage.CLASS_TYPE__NAME:
        return getName();
      case GenPackage.CLASS_TYPE__NOCLASS:
        return getNoclass();
      case GenPackage.CLASS_TYPE__PREFIX:
        return getPrefix();
      case GenPackage.CLASS_TYPE__SUFFIX:
        return getSuffix();
      case GenPackage.CLASS_TYPE__BLOCKING:
        return getBlocking();
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
      case GenPackage.CLASS_TYPE__NAME:
        setName((String)newValue);
        return;
      case GenPackage.CLASS_TYPE__NOCLASS:
        getNoclass().clear();
        getNoclass().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.CLASS_TYPE__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.CLASS_TYPE__SUFFIX:
        getSuffix().clear();
        getSuffix().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.CLASS_TYPE__BLOCKING:
        getBlocking().clear();
        getBlocking().addAll((Collection<? extends String>)newValue);
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
      case GenPackage.CLASS_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GenPackage.CLASS_TYPE__NOCLASS:
        getNoclass().clear();
        return;
      case GenPackage.CLASS_TYPE__PREFIX:
        getPrefix().clear();
        return;
      case GenPackage.CLASS_TYPE__SUFFIX:
        getSuffix().clear();
        return;
      case GenPackage.CLASS_TYPE__BLOCKING:
        getBlocking().clear();
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
      case GenPackage.CLASS_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GenPackage.CLASS_TYPE__NOCLASS:
        return noclass != null && !noclass.isEmpty();
      case GenPackage.CLASS_TYPE__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case GenPackage.CLASS_TYPE__SUFFIX:
        return suffix != null && !suffix.isEmpty();
      case GenPackage.CLASS_TYPE__BLOCKING:
        return blocking != null && !blocking.isEmpty();
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
    result.append(", noclass: ");
    result.append(noclass);
    result.append(", prefix: ");
    result.append(prefix);
    result.append(", suffix: ");
    result.append(suffix);
    result.append(", blocking: ");
    result.append(blocking);
    result.append(')');
    return result.toString();
  }

} //ClassTypeImpl

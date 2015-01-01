/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.LiteralInner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Inner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.LiteralInnerImpl#getPrimarytyp <em>Primarytyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.LiteralInnerImpl#getConstruct <em>Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralInnerImpl extends MinimalEObjectImpl.Container implements LiteralInner
{
  /**
   * The default value of the '{@link #getPrimarytyp() <em>Primarytyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimarytyp()
   * @generated
   * @ordered
   */
  protected static final String PRIMARYTYP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimarytyp() <em>Primarytyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimarytyp()
   * @generated
   * @ordered
   */
  protected String primarytyp = PRIMARYTYP_EDEFAULT;

  /**
   * The default value of the '{@link #getConstruct() <em>Construct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstruct()
   * @generated
   * @ordered
   */
  protected static final String CONSTRUCT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstruct() <em>Construct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstruct()
   * @generated
   * @ordered
   */
  protected String construct = CONSTRUCT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralInnerImpl()
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
    return GenPackage.Literals.LITERAL_INNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimarytyp()
  {
    return primarytyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimarytyp(String newPrimarytyp)
  {
    String oldPrimarytyp = primarytyp;
    primarytyp = newPrimarytyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.LITERAL_INNER__PRIMARYTYP, oldPrimarytyp, primarytyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstruct()
  {
    return construct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstruct(String newConstruct)
  {
    String oldConstruct = construct;
    construct = newConstruct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.LITERAL_INNER__CONSTRUCT, oldConstruct, construct));
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
      case GenPackage.LITERAL_INNER__PRIMARYTYP:
        return getPrimarytyp();
      case GenPackage.LITERAL_INNER__CONSTRUCT:
        return getConstruct();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GenPackage.LITERAL_INNER__PRIMARYTYP:
        setPrimarytyp((String)newValue);
        return;
      case GenPackage.LITERAL_INNER__CONSTRUCT:
        setConstruct((String)newValue);
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
      case GenPackage.LITERAL_INNER__PRIMARYTYP:
        setPrimarytyp(PRIMARYTYP_EDEFAULT);
        return;
      case GenPackage.LITERAL_INNER__CONSTRUCT:
        setConstruct(CONSTRUCT_EDEFAULT);
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
      case GenPackage.LITERAL_INNER__PRIMARYTYP:
        return PRIMARYTYP_EDEFAULT == null ? primarytyp != null : !PRIMARYTYP_EDEFAULT.equals(primarytyp);
      case GenPackage.LITERAL_INNER__CONSTRUCT:
        return CONSTRUCT_EDEFAULT == null ? construct != null : !CONSTRUCT_EDEFAULT.equals(construct);
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
    result.append(" (primarytyp: ");
    result.append(primarytyp);
    result.append(", construct: ");
    result.append(construct);
    result.append(')');
    return result.toString();
  }

} //LiteralInnerImpl

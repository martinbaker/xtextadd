/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.ComboString;
import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.MultString;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mult String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.MultStringImpl#getMs <em>Ms</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.MultStringImpl#getCs <em>Cs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultStringImpl extends MinimalEObjectImpl.Container implements MultString
{
  /**
   * The default value of the '{@link #getMs() <em>Ms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMs()
   * @generated
   * @ordered
   */
  protected static final String MS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMs() <em>Ms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMs()
   * @generated
   * @ordered
   */
  protected String ms = MS_EDEFAULT;

  /**
   * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCs()
   * @generated
   * @ordered
   */
  protected EList<ComboString> cs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultStringImpl()
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
    return GenPackage.Literals.MULT_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMs()
  {
    return ms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMs(String newMs)
  {
    String oldMs = ms;
    ms = newMs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.MULT_STRING__MS, oldMs, ms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComboString> getCs()
  {
    if (cs == null)
    {
      cs = new EObjectContainmentEList<ComboString>(ComboString.class, this, GenPackage.MULT_STRING__CS);
    }
    return cs;
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
      case GenPackage.MULT_STRING__CS:
        return ((InternalEList<?>)getCs()).basicRemove(otherEnd, msgs);
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
      case GenPackage.MULT_STRING__MS:
        return getMs();
      case GenPackage.MULT_STRING__CS:
        return getCs();
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
      case GenPackage.MULT_STRING__MS:
        setMs((String)newValue);
        return;
      case GenPackage.MULT_STRING__CS:
        getCs().clear();
        getCs().addAll((Collection<? extends ComboString>)newValue);
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
      case GenPackage.MULT_STRING__MS:
        setMs(MS_EDEFAULT);
        return;
      case GenPackage.MULT_STRING__CS:
        getCs().clear();
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
      case GenPackage.MULT_STRING__MS:
        return MS_EDEFAULT == null ? ms != null : !MS_EDEFAULT.equals(ms);
      case GenPackage.MULT_STRING__CS:
        return cs != null && !cs.isEmpty();
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
    result.append(" (ms: ");
    result.append(ms);
    result.append(')');
    return result.toString();
  }

} //MultStringImpl

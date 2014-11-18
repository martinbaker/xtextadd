/**
 */
package com.euclideanspace.macro.demo.impl;

import com.euclideanspace.macro.demo.DemoPackage;
import com.euclideanspace.macro.demo.MacroDef;
import com.euclideanspace.macro.demo.Recurse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.macro.demo.impl.MacroDefImpl#getMn <em>Mn</em>}</li>
 *   <li>{@link com.euclideanspace.macro.demo.impl.MacroDefImpl#getM <em>M</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacroDefImpl extends MinimalEObjectImpl.Container implements MacroDef
{
  /**
   * The default value of the '{@link #getMn() <em>Mn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMn()
   * @generated
   * @ordered
   */
  protected static final String MN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMn() <em>Mn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMn()
   * @generated
   * @ordered
   */
  protected String mn = MN_EDEFAULT;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected Recurse m;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroDefImpl()
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
    return DemoPackage.Literals.MACRO_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMn()
  {
    return mn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMn(String newMn)
  {
    String oldMn = mn;
    mn = newMn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.MACRO_DEF__MN, oldMn, mn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recurse getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetM(Recurse newM, NotificationChain msgs)
  {
    Recurse oldM = m;
    m = newM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.MACRO_DEF__M, oldM, newM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(Recurse newM)
  {
    if (newM != m)
    {
      NotificationChain msgs = null;
      if (m != null)
        msgs = ((InternalEObject)m).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.MACRO_DEF__M, null, msgs);
      if (newM != null)
        msgs = ((InternalEObject)newM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.MACRO_DEF__M, null, msgs);
      msgs = basicSetM(newM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.MACRO_DEF__M, newM, newM));
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
      case DemoPackage.MACRO_DEF__M:
        return basicSetM(null, msgs);
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
      case DemoPackage.MACRO_DEF__MN:
        return getMn();
      case DemoPackage.MACRO_DEF__M:
        return getM();
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
      case DemoPackage.MACRO_DEF__MN:
        setMn((String)newValue);
        return;
      case DemoPackage.MACRO_DEF__M:
        setM((Recurse)newValue);
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
      case DemoPackage.MACRO_DEF__MN:
        setMn(MN_EDEFAULT);
        return;
      case DemoPackage.MACRO_DEF__M:
        setM((Recurse)null);
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
      case DemoPackage.MACRO_DEF__MN:
        return MN_EDEFAULT == null ? mn != null : !MN_EDEFAULT.equals(mn);
      case DemoPackage.MACRO_DEF__M:
        return m != null;
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
    result.append(" (mn: ");
    result.append(mn);
    result.append(')');
    return result.toString();
  }

} //MacroDefImpl

/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XCasePart;
import com.euclideanspace.pbase.demo.XExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCase Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XCasePartImpl#getTypeGuard <em>Type Guard</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XCasePartImpl#getCase <em>Case</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XCasePartImpl#getThen <em>Then</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XCasePartImpl#isFallThrough <em>Fall Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XCasePartImpl extends MinimalEObjectImpl.Container implements XCasePart
{
  /**
   * The default value of the '{@link #getTypeGuard() <em>Type Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeGuard()
   * @generated
   * @ordered
   */
  protected static final String TYPE_GUARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeGuard() <em>Type Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeGuard()
   * @generated
   * @ordered
   */
  protected String typeGuard = TYPE_GUARD_EDEFAULT;

  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected XExpression case_;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected XExpression then;

  /**
   * The default value of the '{@link #isFallThrough() <em>Fall Through</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFallThrough()
   * @generated
   * @ordered
   */
  protected static final boolean FALL_THROUGH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFallThrough() <em>Fall Through</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFallThrough()
   * @generated
   * @ordered
   */
  protected boolean fallThrough = FALL_THROUGH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XCasePartImpl()
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
    return DemoPackage.Literals.XCASE_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeGuard()
  {
    return typeGuard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeGuard(String newTypeGuard)
  {
    String oldTypeGuard = typeGuard;
    typeGuard = newTypeGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCASE_PART__TYPE_GUARD, oldTypeGuard, typeGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCase(XExpression newCase, NotificationChain msgs)
  {
    XExpression oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XCASE_PART__CASE, oldCase, newCase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(XExpression newCase)
  {
    if (newCase != case_)
    {
      NotificationChain msgs = null;
      if (case_ != null)
        msgs = ((InternalEObject)case_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCASE_PART__CASE, null, msgs);
      if (newCase != null)
        msgs = ((InternalEObject)newCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCASE_PART__CASE, null, msgs);
      msgs = basicSetCase(newCase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCASE_PART__CASE, newCase, newCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(XExpression newThen, NotificationChain msgs)
  {
    XExpression oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XCASE_PART__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(XExpression newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCASE_PART__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCASE_PART__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCASE_PART__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFallThrough()
  {
    return fallThrough;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFallThrough(boolean newFallThrough)
  {
    boolean oldFallThrough = fallThrough;
    fallThrough = newFallThrough;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCASE_PART__FALL_THROUGH, oldFallThrough, fallThrough));
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
      case DemoPackage.XCASE_PART__CASE:
        return basicSetCase(null, msgs);
      case DemoPackage.XCASE_PART__THEN:
        return basicSetThen(null, msgs);
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
      case DemoPackage.XCASE_PART__TYPE_GUARD:
        return getTypeGuard();
      case DemoPackage.XCASE_PART__CASE:
        return getCase();
      case DemoPackage.XCASE_PART__THEN:
        return getThen();
      case DemoPackage.XCASE_PART__FALL_THROUGH:
        return isFallThrough();
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
      case DemoPackage.XCASE_PART__TYPE_GUARD:
        setTypeGuard((String)newValue);
        return;
      case DemoPackage.XCASE_PART__CASE:
        setCase((XExpression)newValue);
        return;
      case DemoPackage.XCASE_PART__THEN:
        setThen((XExpression)newValue);
        return;
      case DemoPackage.XCASE_PART__FALL_THROUGH:
        setFallThrough((Boolean)newValue);
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
      case DemoPackage.XCASE_PART__TYPE_GUARD:
        setTypeGuard(TYPE_GUARD_EDEFAULT);
        return;
      case DemoPackage.XCASE_PART__CASE:
        setCase((XExpression)null);
        return;
      case DemoPackage.XCASE_PART__THEN:
        setThen((XExpression)null);
        return;
      case DemoPackage.XCASE_PART__FALL_THROUGH:
        setFallThrough(FALL_THROUGH_EDEFAULT);
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
      case DemoPackage.XCASE_PART__TYPE_GUARD:
        return TYPE_GUARD_EDEFAULT == null ? typeGuard != null : !TYPE_GUARD_EDEFAULT.equals(typeGuard);
      case DemoPackage.XCASE_PART__CASE:
        return case_ != null;
      case DemoPackage.XCASE_PART__THEN:
        return then != null;
      case DemoPackage.XCASE_PART__FALL_THROUGH:
        return fallThrough != FALL_THROUGH_EDEFAULT;
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
    result.append(" (typeGuard: ");
    result.append(typeGuard);
    result.append(", fallThrough: ");
    result.append(fallThrough);
    result.append(')');
    return result.toString();
  }

} //XCasePartImpl

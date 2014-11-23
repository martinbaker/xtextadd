/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XAssignment;
import com.euclideanspace.pbase.demo.XExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XAssignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XAssignmentImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XAssignmentImpl#getAssignable <em>Assignable</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XAssignmentImpl#isExplicitStatic <em>Explicit Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XAssignmentImpl extends XExpressionImpl implements XAssignment
{
  /**
   * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected String feature = FEATURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected XExpression value;

  /**
   * The cached value of the '{@link #getAssignable() <em>Assignable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignable()
   * @generated
   * @ordered
   */
  protected XExpression assignable;

  /**
   * The default value of the '{@link #isExplicitStatic() <em>Explicit Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitStatic()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLICIT_STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplicitStatic() <em>Explicit Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitStatic()
   * @generated
   * @ordered
   */
  protected boolean explicitStatic = EXPLICIT_STATIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XAssignmentImpl()
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
    return DemoPackage.Literals.XASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(String newFeature)
  {
    String oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XASSIGNMENT__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(XExpression newValue, NotificationChain msgs)
  {
    XExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XASSIGNMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(XExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XASSIGNMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XASSIGNMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XASSIGNMENT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getAssignable()
  {
    return assignable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignable(XExpression newAssignable, NotificationChain msgs)
  {
    XExpression oldAssignable = assignable;
    assignable = newAssignable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XASSIGNMENT__ASSIGNABLE, oldAssignable, newAssignable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignable(XExpression newAssignable)
  {
    if (newAssignable != assignable)
    {
      NotificationChain msgs = null;
      if (assignable != null)
        msgs = ((InternalEObject)assignable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XASSIGNMENT__ASSIGNABLE, null, msgs);
      if (newAssignable != null)
        msgs = ((InternalEObject)newAssignable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XASSIGNMENT__ASSIGNABLE, null, msgs);
      msgs = basicSetAssignable(newAssignable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XASSIGNMENT__ASSIGNABLE, newAssignable, newAssignable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplicitStatic()
  {
    return explicitStatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitStatic(boolean newExplicitStatic)
  {
    boolean oldExplicitStatic = explicitStatic;
    explicitStatic = newExplicitStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XASSIGNMENT__EXPLICIT_STATIC, oldExplicitStatic, explicitStatic));
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
      case DemoPackage.XASSIGNMENT__VALUE:
        return basicSetValue(null, msgs);
      case DemoPackage.XASSIGNMENT__ASSIGNABLE:
        return basicSetAssignable(null, msgs);
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
      case DemoPackage.XASSIGNMENT__FEATURE:
        return getFeature();
      case DemoPackage.XASSIGNMENT__VALUE:
        return getValue();
      case DemoPackage.XASSIGNMENT__ASSIGNABLE:
        return getAssignable();
      case DemoPackage.XASSIGNMENT__EXPLICIT_STATIC:
        return isExplicitStatic();
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
      case DemoPackage.XASSIGNMENT__FEATURE:
        setFeature((String)newValue);
        return;
      case DemoPackage.XASSIGNMENT__VALUE:
        setValue((XExpression)newValue);
        return;
      case DemoPackage.XASSIGNMENT__ASSIGNABLE:
        setAssignable((XExpression)newValue);
        return;
      case DemoPackage.XASSIGNMENT__EXPLICIT_STATIC:
        setExplicitStatic((Boolean)newValue);
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
      case DemoPackage.XASSIGNMENT__FEATURE:
        setFeature(FEATURE_EDEFAULT);
        return;
      case DemoPackage.XASSIGNMENT__VALUE:
        setValue((XExpression)null);
        return;
      case DemoPackage.XASSIGNMENT__ASSIGNABLE:
        setAssignable((XExpression)null);
        return;
      case DemoPackage.XASSIGNMENT__EXPLICIT_STATIC:
        setExplicitStatic(EXPLICIT_STATIC_EDEFAULT);
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
      case DemoPackage.XASSIGNMENT__FEATURE:
        return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
      case DemoPackage.XASSIGNMENT__VALUE:
        return value != null;
      case DemoPackage.XASSIGNMENT__ASSIGNABLE:
        return assignable != null;
      case DemoPackage.XASSIGNMENT__EXPLICIT_STATIC:
        return explicitStatic != EXPLICIT_STATIC_EDEFAULT;
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
    result.append(" (feature: ");
    result.append(feature);
    result.append(", explicitStatic: ");
    result.append(explicitStatic);
    result.append(')');
    return result.toString();
  }

} //XAssignmentImpl

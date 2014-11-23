/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XExpression;
import com.euclideanspace.pbase.demo.XForLoopExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XFor Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XForLoopExpressionImpl extends XExpressionImpl implements XForLoopExpression
{
  /**
   * The default value of the '{@link #getDeclaredParam() <em>Declared Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParam()
   * @generated
   * @ordered
   */
  protected static final String DECLARED_PARAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeclaredParam() <em>Declared Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParam()
   * @generated
   * @ordered
   */
  protected String declaredParam = DECLARED_PARAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForExpression()
   * @generated
   * @ordered
   */
  protected XExpression forExpression;

  /**
   * The cached value of the '{@link #getEachExpression() <em>Each Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEachExpression()
   * @generated
   * @ordered
   */
  protected XExpression eachExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XForLoopExpressionImpl()
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
    return DemoPackage.Literals.XFOR_LOOP_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclaredParam()
  {
    return declaredParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredParam(String newDeclaredParam)
  {
    String oldDeclaredParam = declaredParam;
    declaredParam = newDeclaredParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM, oldDeclaredParam, declaredParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getForExpression()
  {
    return forExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForExpression(XExpression newForExpression, NotificationChain msgs)
  {
    XExpression oldForExpression = forExpression;
    forExpression = newForExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION, oldForExpression, newForExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForExpression(XExpression newForExpression)
  {
    if (newForExpression != forExpression)
    {
      NotificationChain msgs = null;
      if (forExpression != null)
        msgs = ((InternalEObject)forExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION, null, msgs);
      if (newForExpression != null)
        msgs = ((InternalEObject)newForExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION, null, msgs);
      msgs = basicSetForExpression(newForExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION, newForExpression, newForExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getEachExpression()
  {
    return eachExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEachExpression(XExpression newEachExpression, NotificationChain msgs)
  {
    XExpression oldEachExpression = eachExpression;
    eachExpression = newEachExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION, oldEachExpression, newEachExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEachExpression(XExpression newEachExpression)
  {
    if (newEachExpression != eachExpression)
    {
      NotificationChain msgs = null;
      if (eachExpression != null)
        msgs = ((InternalEObject)eachExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION, null, msgs);
      if (newEachExpression != null)
        msgs = ((InternalEObject)newEachExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION, null, msgs);
      msgs = basicSetEachExpression(newEachExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION, newEachExpression, newEachExpression));
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
      case DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        return basicSetForExpression(null, msgs);
      case DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION:
        return basicSetEachExpression(null, msgs);
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
      case DemoPackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM:
        return getDeclaredParam();
      case DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        return getForExpression();
      case DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION:
        return getEachExpression();
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
      case DemoPackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM:
        setDeclaredParam((String)newValue);
        return;
      case DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        setForExpression((XExpression)newValue);
        return;
      case DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION:
        setEachExpression((XExpression)newValue);
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
      case DemoPackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM:
        setDeclaredParam(DECLARED_PARAM_EDEFAULT);
        return;
      case DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        setForExpression((XExpression)null);
        return;
      case DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION:
        setEachExpression((XExpression)null);
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
      case DemoPackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM:
        return DECLARED_PARAM_EDEFAULT == null ? declaredParam != null : !DECLARED_PARAM_EDEFAULT.equals(declaredParam);
      case DemoPackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION:
        return forExpression != null;
      case DemoPackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION:
        return eachExpression != null;
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
    result.append(" (declaredParam: ");
    result.append(declaredParam);
    result.append(')');
    return result.toString();
  }

} //XForLoopExpressionImpl

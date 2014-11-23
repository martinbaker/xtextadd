/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XCatchClause;
import com.euclideanspace.pbase.demo.XExpression;
import com.euclideanspace.pbase.demo.XTryCatchFinallyExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XTry Catch Finally Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl#getFinallyExpression <em>Finally Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XTryCatchFinallyExpressionImpl extends XExpressionImpl implements XTryCatchFinallyExpression
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchClauses()
   * @generated
   * @ordered
   */
  protected EList<XCatchClause> catchClauses;

  /**
   * The cached value of the '{@link #getFinallyExpression() <em>Finally Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinallyExpression()
   * @generated
   * @ordered
   */
  protected XExpression finallyExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XTryCatchFinallyExpressionImpl()
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
    return DemoPackage.Literals.XTRY_CATCH_FINALLY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XCatchClause> getCatchClauses()
  {
    if (catchClauses == null)
    {
      catchClauses = new EObjectContainmentEList<XCatchClause>(XCatchClause.class, this, DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES);
    }
    return catchClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getFinallyExpression()
  {
    return finallyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinallyExpression(XExpression newFinallyExpression, NotificationChain msgs)
  {
    XExpression oldFinallyExpression = finallyExpression;
    finallyExpression = newFinallyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, oldFinallyExpression, newFinallyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinallyExpression(XExpression newFinallyExpression)
  {
    if (newFinallyExpression != finallyExpression)
    {
      NotificationChain msgs = null;
      if (finallyExpression != null)
        msgs = ((InternalEObject)finallyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, null, msgs);
      if (newFinallyExpression != null)
        msgs = ((InternalEObject)newFinallyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, null, msgs);
      msgs = basicSetFinallyExpression(newFinallyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION, newFinallyExpression, newFinallyExpression));
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
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
        return ((InternalEList<?>)getCatchClauses()).basicRemove(otherEnd, msgs);
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
        return basicSetFinallyExpression(null, msgs);
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
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
        return getExpression();
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
        return getCatchClauses();
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
        return getFinallyExpression();
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
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
        setExpression((XExpression)newValue);
        return;
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
        getCatchClauses().clear();
        getCatchClauses().addAll((Collection<? extends XCatchClause>)newValue);
        return;
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
        setFinallyExpression((XExpression)newValue);
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
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
        setExpression((XExpression)null);
        return;
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
        getCatchClauses().clear();
        return;
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
        setFinallyExpression((XExpression)null);
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
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION:
        return expression != null;
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES:
        return catchClauses != null && !catchClauses.isEmpty();
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION:
        return finallyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //XTryCatchFinallyExpressionImpl

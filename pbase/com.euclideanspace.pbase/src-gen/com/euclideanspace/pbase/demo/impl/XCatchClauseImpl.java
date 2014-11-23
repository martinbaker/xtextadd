/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XCatchClause;
import com.euclideanspace.pbase.demo.XExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCatch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XCatchClauseImpl#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XCatchClauseImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XCatchClauseImpl extends MinimalEObjectImpl.Container implements XCatchClause
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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XCatchClauseImpl()
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
    return DemoPackage.Literals.XCATCH_CLAUSE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCATCH_CLAUSE__DECLARED_PARAM, oldDeclaredParam, declaredParam));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XCATCH_CLAUSE__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCATCH_CLAUSE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCATCH_CLAUSE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCATCH_CLAUSE__EXPRESSION, newExpression, newExpression));
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
      case DemoPackage.XCATCH_CLAUSE__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case DemoPackage.XCATCH_CLAUSE__DECLARED_PARAM:
        return getDeclaredParam();
      case DemoPackage.XCATCH_CLAUSE__EXPRESSION:
        return getExpression();
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
      case DemoPackage.XCATCH_CLAUSE__DECLARED_PARAM:
        setDeclaredParam((String)newValue);
        return;
      case DemoPackage.XCATCH_CLAUSE__EXPRESSION:
        setExpression((XExpression)newValue);
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
      case DemoPackage.XCATCH_CLAUSE__DECLARED_PARAM:
        setDeclaredParam(DECLARED_PARAM_EDEFAULT);
        return;
      case DemoPackage.XCATCH_CLAUSE__EXPRESSION:
        setExpression((XExpression)null);
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
      case DemoPackage.XCATCH_CLAUSE__DECLARED_PARAM:
        return DECLARED_PARAM_EDEFAULT == null ? declaredParam != null : !DECLARED_PARAM_EDEFAULT.equals(declaredParam);
      case DemoPackage.XCATCH_CLAUSE__EXPRESSION:
        return expression != null;
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

} //XCatchClauseImpl

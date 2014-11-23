/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XClosure;
import com.euclideanspace.pbase.demo.XExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XClosure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XClosureImpl#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XClosureImpl#isExplicitSyntax <em>Explicit Syntax</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XClosureImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XClosureImpl extends XExpressionImpl implements XClosure
{
  /**
   * The cached value of the '{@link #getDeclaredFormalParameters() <em>Declared Formal Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredFormalParameters()
   * @generated
   * @ordered
   */
  protected EList<String> declaredFormalParameters;

  /**
   * The default value of the '{@link #isExplicitSyntax() <em>Explicit Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitSyntax()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLICIT_SYNTAX_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplicitSyntax() <em>Explicit Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitSyntax()
   * @generated
   * @ordered
   */
  protected boolean explicitSyntax = EXPLICIT_SYNTAX_EDEFAULT;

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
  protected XClosureImpl()
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
    return DemoPackage.Literals.XCLOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDeclaredFormalParameters()
  {
    if (declaredFormalParameters == null)
    {
      declaredFormalParameters = new EDataTypeEList<String>(String.class, this, DemoPackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS);
    }
    return declaredFormalParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplicitSyntax()
  {
    return explicitSyntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitSyntax(boolean newExplicitSyntax)
  {
    boolean oldExplicitSyntax = explicitSyntax;
    explicitSyntax = newExplicitSyntax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCLOSURE__EXPLICIT_SYNTAX, oldExplicitSyntax, explicitSyntax));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XCLOSURE__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCLOSURE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XCLOSURE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCLOSURE__EXPRESSION, newExpression, newExpression));
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
      case DemoPackage.XCLOSURE__EXPRESSION:
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
      case DemoPackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
        return getDeclaredFormalParameters();
      case DemoPackage.XCLOSURE__EXPLICIT_SYNTAX:
        return isExplicitSyntax();
      case DemoPackage.XCLOSURE__EXPRESSION:
        return getExpression();
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
      case DemoPackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
        getDeclaredFormalParameters().clear();
        getDeclaredFormalParameters().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.XCLOSURE__EXPLICIT_SYNTAX:
        setExplicitSyntax((Boolean)newValue);
        return;
      case DemoPackage.XCLOSURE__EXPRESSION:
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
      case DemoPackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
        getDeclaredFormalParameters().clear();
        return;
      case DemoPackage.XCLOSURE__EXPLICIT_SYNTAX:
        setExplicitSyntax(EXPLICIT_SYNTAX_EDEFAULT);
        return;
      case DemoPackage.XCLOSURE__EXPRESSION:
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
      case DemoPackage.XCLOSURE__DECLARED_FORMAL_PARAMETERS:
        return declaredFormalParameters != null && !declaredFormalParameters.isEmpty();
      case DemoPackage.XCLOSURE__EXPLICIT_SYNTAX:
        return explicitSyntax != EXPLICIT_SYNTAX_EDEFAULT;
      case DemoPackage.XCLOSURE__EXPRESSION:
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
    result.append(" (declaredFormalParameters: ");
    result.append(declaredFormalParameters);
    result.append(", explicitSyntax: ");
    result.append(explicitSyntax);
    result.append(')');
    return result.toString();
  }

} //XClosureImpl

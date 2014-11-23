/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XConstructorCall;
import com.euclideanspace.pbase.demo.XExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XConstructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XConstructorCallImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XConstructorCallImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XConstructorCallImpl#isExplicitConstructorCall <em>Explicit Constructor Call</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XConstructorCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XConstructorCallImpl extends XExpressionImpl implements XConstructorCall
{
  /**
   * The default value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected static final String CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected String constructor = CONSTRUCTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeArguments()
   * @generated
   * @ordered
   */
  protected EList<String> typeArguments;

  /**
   * The default value of the '{@link #isExplicitConstructorCall() <em>Explicit Constructor Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitConstructorCall()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplicitConstructorCall() <em>Explicit Constructor Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitConstructorCall()
   * @generated
   * @ordered
   */
  protected boolean explicitConstructorCall = EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<XExpression> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XConstructorCallImpl()
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
    return DemoPackage.Literals.XCONSTRUCTOR_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstructor()
  {
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructor(String newConstructor)
  {
    String oldConstructor = constructor;
    constructor = newConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCONSTRUCTOR_CALL__CONSTRUCTOR, oldConstructor, constructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypeArguments()
  {
    if (typeArguments == null)
    {
      typeArguments = new EDataTypeEList<String>(String.class, this, DemoPackage.XCONSTRUCTOR_CALL__TYPE_ARGUMENTS);
    }
    return typeArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplicitConstructorCall()
  {
    return explicitConstructorCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitConstructorCall(boolean newExplicitConstructorCall)
  {
    boolean oldExplicitConstructorCall = explicitConstructorCall;
    explicitConstructorCall = newExplicitConstructorCall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL, oldExplicitConstructorCall, explicitConstructorCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<XExpression>(XExpression.class, this, DemoPackage.XCONSTRUCTOR_CALL__ARGUMENTS);
    }
    return arguments;
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
      case DemoPackage.XCONSTRUCTOR_CALL__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case DemoPackage.XCONSTRUCTOR_CALL__CONSTRUCTOR:
        return getConstructor();
      case DemoPackage.XCONSTRUCTOR_CALL__TYPE_ARGUMENTS:
        return getTypeArguments();
      case DemoPackage.XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
        return isExplicitConstructorCall();
      case DemoPackage.XCONSTRUCTOR_CALL__ARGUMENTS:
        return getArguments();
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
      case DemoPackage.XCONSTRUCTOR_CALL__CONSTRUCTOR:
        setConstructor((String)newValue);
        return;
      case DemoPackage.XCONSTRUCTOR_CALL__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        getTypeArguments().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
        setExplicitConstructorCall((Boolean)newValue);
        return;
      case DemoPackage.XCONSTRUCTOR_CALL__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends XExpression>)newValue);
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
      case DemoPackage.XCONSTRUCTOR_CALL__CONSTRUCTOR:
        setConstructor(CONSTRUCTOR_EDEFAULT);
        return;
      case DemoPackage.XCONSTRUCTOR_CALL__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        return;
      case DemoPackage.XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
        setExplicitConstructorCall(EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT);
        return;
      case DemoPackage.XCONSTRUCTOR_CALL__ARGUMENTS:
        getArguments().clear();
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
      case DemoPackage.XCONSTRUCTOR_CALL__CONSTRUCTOR:
        return CONSTRUCTOR_EDEFAULT == null ? constructor != null : !CONSTRUCTOR_EDEFAULT.equals(constructor);
      case DemoPackage.XCONSTRUCTOR_CALL__TYPE_ARGUMENTS:
        return typeArguments != null && !typeArguments.isEmpty();
      case DemoPackage.XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
        return explicitConstructorCall != EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT;
      case DemoPackage.XCONSTRUCTOR_CALL__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
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
    result.append(" (constructor: ");
    result.append(constructor);
    result.append(", typeArguments: ");
    result.append(typeArguments);
    result.append(", explicitConstructorCall: ");
    result.append(explicitConstructorCall);
    result.append(')');
    return result.toString();
  }

} //XConstructorCallImpl

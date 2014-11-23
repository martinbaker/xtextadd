/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XExpression;
import com.euclideanspace.pbase.demo.XMemberFeatureCall;

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
 * An implementation of the model object '<em><b>XMember Feature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#getMemberCallTarget <em>Member Call Target</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#isNullSafe <em>Null Safe</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#isExplicitStatic <em>Explicit Static</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMemberFeatureCallImpl extends XExpressionImpl implements XMemberFeatureCall
{
  /**
   * The cached value of the '{@link #getMemberCallTarget() <em>Member Call Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberCallTarget()
   * @generated
   * @ordered
   */
  protected XExpression memberCallTarget;

  /**
   * The default value of the '{@link #isNullSafe() <em>Null Safe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullSafe()
   * @generated
   * @ordered
   */
  protected static final boolean NULL_SAFE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullSafe() <em>Null Safe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullSafe()
   * @generated
   * @ordered
   */
  protected boolean nullSafe = NULL_SAFE_EDEFAULT;

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
   * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeArguments()
   * @generated
   * @ordered
   */
  protected EList<String> typeArguments;

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
   * The default value of the '{@link #isExplicitOperationCall() <em>Explicit Operation Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitOperationCall()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLICIT_OPERATION_CALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplicitOperationCall() <em>Explicit Operation Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitOperationCall()
   * @generated
   * @ordered
   */
  protected boolean explicitOperationCall = EXPLICIT_OPERATION_CALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getMemberCallArguments() <em>Member Call Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberCallArguments()
   * @generated
   * @ordered
   */
  protected EList<XExpression> memberCallArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMemberFeatureCallImpl()
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
    return DemoPackage.Literals.XMEMBER_FEATURE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getMemberCallTarget()
  {
    return memberCallTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMemberCallTarget(XExpression newMemberCallTarget, NotificationChain msgs)
  {
    XExpression oldMemberCallTarget = memberCallTarget;
    memberCallTarget = newMemberCallTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, oldMemberCallTarget, newMemberCallTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemberCallTarget(XExpression newMemberCallTarget)
  {
    if (newMemberCallTarget != memberCallTarget)
    {
      NotificationChain msgs = null;
      if (memberCallTarget != null)
        msgs = ((InternalEObject)memberCallTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, null, msgs);
      if (newMemberCallTarget != null)
        msgs = ((InternalEObject)newMemberCallTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, null, msgs);
      msgs = basicSetMemberCallTarget(newMemberCallTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, newMemberCallTarget, newMemberCallTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullSafe()
  {
    return nullSafe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullSafe(boolean newNullSafe)
  {
    boolean oldNullSafe = nullSafe;
    nullSafe = newNullSafe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XMEMBER_FEATURE_CALL__NULL_SAFE, oldNullSafe, nullSafe));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC, oldExplicitStatic, explicitStatic));
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
      typeArguments = new EDataTypeEList<String>(String.class, this, DemoPackage.XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS);
    }
    return typeArguments;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XMEMBER_FEATURE_CALL__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplicitOperationCall()
  {
    return explicitOperationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitOperationCall(boolean newExplicitOperationCall)
  {
    boolean oldExplicitOperationCall = explicitOperationCall;
    explicitOperationCall = newExplicitOperationCall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL, oldExplicitOperationCall, explicitOperationCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getMemberCallArguments()
  {
    if (memberCallArguments == null)
    {
      memberCallArguments = new EObjectContainmentEList<XExpression>(XExpression.class, this, DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS);
    }
    return memberCallArguments;
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
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
        return basicSetMemberCallTarget(null, msgs);
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
        return ((InternalEList<?>)getMemberCallArguments()).basicRemove(otherEnd, msgs);
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
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
        return getMemberCallTarget();
      case DemoPackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
        return isNullSafe();
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
        return isExplicitStatic();
      case DemoPackage.XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS:
        return getTypeArguments();
      case DemoPackage.XMEMBER_FEATURE_CALL__FEATURE:
        return getFeature();
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
        return isExplicitOperationCall();
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
        return getMemberCallArguments();
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
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
        setMemberCallTarget((XExpression)newValue);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
        setNullSafe((Boolean)newValue);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
        setExplicitStatic((Boolean)newValue);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        getTypeArguments().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__FEATURE:
        setFeature((String)newValue);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
        setExplicitOperationCall((Boolean)newValue);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
        getMemberCallArguments().clear();
        getMemberCallArguments().addAll((Collection<? extends XExpression>)newValue);
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
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
        setMemberCallTarget((XExpression)null);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
        setNullSafe(NULL_SAFE_EDEFAULT);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
        setExplicitStatic(EXPLICIT_STATIC_EDEFAULT);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__FEATURE:
        setFeature(FEATURE_EDEFAULT);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
        setExplicitOperationCall(EXPLICIT_OPERATION_CALL_EDEFAULT);
        return;
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
        getMemberCallArguments().clear();
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
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
        return memberCallTarget != null;
      case DemoPackage.XMEMBER_FEATURE_CALL__NULL_SAFE:
        return nullSafe != NULL_SAFE_EDEFAULT;
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_STATIC:
        return explicitStatic != EXPLICIT_STATIC_EDEFAULT;
      case DemoPackage.XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS:
        return typeArguments != null && !typeArguments.isEmpty();
      case DemoPackage.XMEMBER_FEATURE_CALL__FEATURE:
        return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
      case DemoPackage.XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL:
        return explicitOperationCall != EXPLICIT_OPERATION_CALL_EDEFAULT;
      case DemoPackage.XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
        return memberCallArguments != null && !memberCallArguments.isEmpty();
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
    result.append(" (nullSafe: ");
    result.append(nullSafe);
    result.append(", explicitStatic: ");
    result.append(explicitStatic);
    result.append(", typeArguments: ");
    result.append(typeArguments);
    result.append(", feature: ");
    result.append(feature);
    result.append(", explicitOperationCall: ");
    result.append(explicitOperationCall);
    result.append(')');
    return result.toString();
  }

} //XMemberFeatureCallImpl

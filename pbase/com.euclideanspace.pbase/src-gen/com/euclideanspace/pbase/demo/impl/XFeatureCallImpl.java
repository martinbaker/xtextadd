/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.XExpression;
import com.euclideanspace.pbase.demo.XFeatureCall;

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
 * An implementation of the model object '<em><b>XFeature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XFeatureCallImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XFeatureCallImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XFeatureCallImpl#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.XFeatureCallImpl#getFeatureCallArguments <em>Feature Call Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XFeatureCallImpl extends XExpressionImpl implements XFeatureCall
{
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
   * The cached value of the '{@link #getFeatureCallArguments() <em>Feature Call Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureCallArguments()
   * @generated
   * @ordered
   */
  protected EList<XExpression> featureCallArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XFeatureCallImpl()
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
    return DemoPackage.Literals.XFEATURE_CALL;
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
      typeArguments = new EDataTypeEList<String>(String.class, this, DemoPackage.XFEATURE_CALL__TYPE_ARGUMENTS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XFEATURE_CALL__FEATURE, oldFeature, feature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL, oldExplicitOperationCall, explicitOperationCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getFeatureCallArguments()
  {
    if (featureCallArguments == null)
    {
      featureCallArguments = new EObjectContainmentEList<XExpression>(XExpression.class, this, DemoPackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS);
    }
    return featureCallArguments;
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
      case DemoPackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
        return ((InternalEList<?>)getFeatureCallArguments()).basicRemove(otherEnd, msgs);
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
      case DemoPackage.XFEATURE_CALL__TYPE_ARGUMENTS:
        return getTypeArguments();
      case DemoPackage.XFEATURE_CALL__FEATURE:
        return getFeature();
      case DemoPackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
        return isExplicitOperationCall();
      case DemoPackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
        return getFeatureCallArguments();
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
      case DemoPackage.XFEATURE_CALL__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        getTypeArguments().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.XFEATURE_CALL__FEATURE:
        setFeature((String)newValue);
        return;
      case DemoPackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
        setExplicitOperationCall((Boolean)newValue);
        return;
      case DemoPackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
        getFeatureCallArguments().clear();
        getFeatureCallArguments().addAll((Collection<? extends XExpression>)newValue);
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
      case DemoPackage.XFEATURE_CALL__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        return;
      case DemoPackage.XFEATURE_CALL__FEATURE:
        setFeature(FEATURE_EDEFAULT);
        return;
      case DemoPackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
        setExplicitOperationCall(EXPLICIT_OPERATION_CALL_EDEFAULT);
        return;
      case DemoPackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
        getFeatureCallArguments().clear();
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
      case DemoPackage.XFEATURE_CALL__TYPE_ARGUMENTS:
        return typeArguments != null && !typeArguments.isEmpty();
      case DemoPackage.XFEATURE_CALL__FEATURE:
        return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
      case DemoPackage.XFEATURE_CALL__EXPLICIT_OPERATION_CALL:
        return explicitOperationCall != EXPLICIT_OPERATION_CALL_EDEFAULT;
      case DemoPackage.XFEATURE_CALL__FEATURE_CALL_ARGUMENTS:
        return featureCallArguments != null && !featureCallArguments.isEmpty();
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
    result.append(" (typeArguments: ");
    result.append(typeArguments);
    result.append(", feature: ");
    result.append(feature);
    result.append(", explicitOperationCall: ");
    result.append(explicitOperationCall);
    result.append(')');
    return result.toString();
  }

} //XFeatureCallImpl

/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.EuclidParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidParameterImpl#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidParameterImpl extends MinimalEObjectImpl.Container implements EuclidParameter
{
  /**
   * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected String parameterType = PARAMETER_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isVarArg() <em>Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArg()
   * @generated
   * @ordered
   */
  protected static final boolean VAR_ARG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVarArg() <em>Var Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArg()
   * @generated
   * @ordered
   */
  protected boolean varArg = VAR_ARG_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidParameterImpl()
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
    return DemoPackage.Literals.EUCLID_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameterType()
  {
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterType(String newParameterType)
  {
    String oldParameterType = parameterType;
    parameterType = newParameterType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVarArg()
  {
    return varArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarArg(boolean newVarArg)
  {
    boolean oldVarArg = varArg;
    varArg = newVarArg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_PARAMETER__VAR_ARG, oldVarArg, varArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_PARAMETER__NAME, oldName, name));
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
      case DemoPackage.EUCLID_PARAMETER__PARAMETER_TYPE:
        return getParameterType();
      case DemoPackage.EUCLID_PARAMETER__VAR_ARG:
        return isVarArg();
      case DemoPackage.EUCLID_PARAMETER__NAME:
        return getName();
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
      case DemoPackage.EUCLID_PARAMETER__PARAMETER_TYPE:
        setParameterType((String)newValue);
        return;
      case DemoPackage.EUCLID_PARAMETER__VAR_ARG:
        setVarArg((Boolean)newValue);
        return;
      case DemoPackage.EUCLID_PARAMETER__NAME:
        setName((String)newValue);
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
      case DemoPackage.EUCLID_PARAMETER__PARAMETER_TYPE:
        setParameterType(PARAMETER_TYPE_EDEFAULT);
        return;
      case DemoPackage.EUCLID_PARAMETER__VAR_ARG:
        setVarArg(VAR_ARG_EDEFAULT);
        return;
      case DemoPackage.EUCLID_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
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
      case DemoPackage.EUCLID_PARAMETER__PARAMETER_TYPE:
        return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null : !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
      case DemoPackage.EUCLID_PARAMETER__VAR_ARG:
        return varArg != VAR_ARG_EDEFAULT;
      case DemoPackage.EUCLID_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (parameterType: ");
    result.append(parameterType);
    result.append(", varArg: ");
    result.append(varArg);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EuclidParameterImpl

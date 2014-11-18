/**
 */
package com.euclideanspace.whitespaceblock.demo.impl;

import com.euclideanspace.whitespaceblock.demo.DemoPackage;
import com.euclideanspace.whitespaceblock.demo.Recurse;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.whitespaceblock.demo.impl.RecurseImpl#getN <em>N</em>}</li>
 *   <li>{@link com.euclideanspace.whitespaceblock.demo.impl.RecurseImpl#getR <em>R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecurseImpl extends MinimalEObjectImpl.Container implements Recurse
{
  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected EList<String> n;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected EList<Recurse> r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecurseImpl()
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
    return DemoPackage.Literals.RECURSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getN()
  {
    if (n == null)
    {
      n = new EDataTypeEList<String>(String.class, this, DemoPackage.RECURSE__N);
    }
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Recurse> getR()
  {
    if (r == null)
    {
      r = new EObjectContainmentEList<Recurse>(Recurse.class, this, DemoPackage.RECURSE__R);
    }
    return r;
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
      case DemoPackage.RECURSE__R:
        return ((InternalEList<?>)getR()).basicRemove(otherEnd, msgs);
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
      case DemoPackage.RECURSE__N:
        return getN();
      case DemoPackage.RECURSE__R:
        return getR();
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
      case DemoPackage.RECURSE__N:
        getN().clear();
        getN().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.RECURSE__R:
        getR().clear();
        getR().addAll((Collection<? extends Recurse>)newValue);
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
      case DemoPackage.RECURSE__N:
        getN().clear();
        return;
      case DemoPackage.RECURSE__R:
        getR().clear();
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
      case DemoPackage.RECURSE__N:
        return n != null && !n.isEmpty();
      case DemoPackage.RECURSE__R:
        return r != null && !r.isEmpty();
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
    result.append(" (n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //RecurseImpl

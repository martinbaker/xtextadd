/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.ClassType;
import com.euclideanspace.xgener.gen.Expression;
import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.Model;
import com.euclideanspace.xgener.gen.Procedure;
import com.euclideanspace.xgener.gen.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ModelImpl#getClas <em>Clas</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ModelImpl#getProc <em>Proc</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ModelImpl#getStatem <em>Statem</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ModelImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getClas() <em>Clas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClas()
   * @generated
   * @ordered
   */
  protected EList<ClassType> clas;

  /**
   * The cached value of the '{@link #getProc() <em>Proc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProc()
   * @generated
   * @ordered
   */
  protected EList<Procedure> proc;

  /**
   * The cached value of the '{@link #getStatem() <em>Statem</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatem()
   * @generated
   * @ordered
   */
  protected EList<Statement> statem;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<Expression> exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return GenPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassType> getClas()
  {
    if (clas == null)
    {
      clas = new EObjectContainmentEList<ClassType>(ClassType.class, this, GenPackage.MODEL__CLAS);
    }
    return clas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Procedure> getProc()
  {
    if (proc == null)
    {
      proc = new EObjectContainmentEList<Procedure>(Procedure.class, this, GenPackage.MODEL__PROC);
    }
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatem()
  {
    if (statem == null)
    {
      statem = new EObjectContainmentEList<Statement>(Statement.class, this, GenPackage.MODEL__STATEM);
    }
    return statem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExp()
  {
    if (exp == null)
    {
      exp = new EObjectContainmentEList<Expression>(Expression.class, this, GenPackage.MODEL__EXP);
    }
    return exp;
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
      case GenPackage.MODEL__CLAS:
        return ((InternalEList<?>)getClas()).basicRemove(otherEnd, msgs);
      case GenPackage.MODEL__PROC:
        return ((InternalEList<?>)getProc()).basicRemove(otherEnd, msgs);
      case GenPackage.MODEL__STATEM:
        return ((InternalEList<?>)getStatem()).basicRemove(otherEnd, msgs);
      case GenPackage.MODEL__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
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
      case GenPackage.MODEL__CLAS:
        return getClas();
      case GenPackage.MODEL__PROC:
        return getProc();
      case GenPackage.MODEL__STATEM:
        return getStatem();
      case GenPackage.MODEL__EXP:
        return getExp();
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
      case GenPackage.MODEL__CLAS:
        getClas().clear();
        getClas().addAll((Collection<? extends ClassType>)newValue);
        return;
      case GenPackage.MODEL__PROC:
        getProc().clear();
        getProc().addAll((Collection<? extends Procedure>)newValue);
        return;
      case GenPackage.MODEL__STATEM:
        getStatem().clear();
        getStatem().addAll((Collection<? extends Statement>)newValue);
        return;
      case GenPackage.MODEL__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends Expression>)newValue);
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
      case GenPackage.MODEL__CLAS:
        getClas().clear();
        return;
      case GenPackage.MODEL__PROC:
        getProc().clear();
        return;
      case GenPackage.MODEL__STATEM:
        getStatem().clear();
        return;
      case GenPackage.MODEL__EXP:
        getExp().clear();
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
      case GenPackage.MODEL__CLAS:
        return clas != null && !clas.isEmpty();
      case GenPackage.MODEL__PROC:
        return proc != null && !proc.isEmpty();
      case GenPackage.MODEL__STATEM:
        return statem != null && !statem.isEmpty();
      case GenPackage.MODEL__EXP:
        return exp != null && !exp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl

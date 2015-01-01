/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.ClassType;
import com.euclideanspace.xgener.gen.Expression;
import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.Literal;
import com.euclideanspace.xgener.gen.Model;
import com.euclideanspace.xgener.gen.Primary;
import com.euclideanspace.xgener.gen.Procedure;

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
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ModelImpl#getPrim <em>Prim</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ModelImpl#getLit <em>Lit</em>}</li>
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
   * The cached value of the '{@link #getPrim() <em>Prim</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrim()
   * @generated
   * @ordered
   */
  protected EList<Primary> prim;

  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected EList<Literal> lit;

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
  public EList<Primary> getPrim()
  {
    if (prim == null)
    {
      prim = new EObjectContainmentEList<Primary>(Primary.class, this, GenPackage.MODEL__PRIM);
    }
    return prim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getLit()
  {
    if (lit == null)
    {
      lit = new EObjectContainmentEList<Literal>(Literal.class, this, GenPackage.MODEL__LIT);
    }
    return lit;
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
      case GenPackage.MODEL__PRIM:
        return ((InternalEList<?>)getPrim()).basicRemove(otherEnd, msgs);
      case GenPackage.MODEL__LIT:
        return ((InternalEList<?>)getLit()).basicRemove(otherEnd, msgs);
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
      case GenPackage.MODEL__PRIM:
        return getPrim();
      case GenPackage.MODEL__LIT:
        return getLit();
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
      case GenPackage.MODEL__PRIM:
        getPrim().clear();
        getPrim().addAll((Collection<? extends Primary>)newValue);
        return;
      case GenPackage.MODEL__LIT:
        getLit().clear();
        getLit().addAll((Collection<? extends Literal>)newValue);
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
      case GenPackage.MODEL__PRIM:
        getPrim().clear();
        return;
      case GenPackage.MODEL__LIT:
        getLit().clear();
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
      case GenPackage.MODEL__PRIM:
        return prim != null && !prim.isEmpty();
      case GenPackage.MODEL__LIT:
        return lit != null && !lit.isEmpty();
      case GenPackage.MODEL__EXP:
        return exp != null && !exp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl

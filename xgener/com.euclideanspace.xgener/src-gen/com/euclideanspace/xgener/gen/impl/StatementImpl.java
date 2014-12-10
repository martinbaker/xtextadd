/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.Statement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getRep <em>Rep</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getWhile <em>While</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getDo <em>Do</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getFor <em>For</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getEx <em>Ex</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.StatementImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
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
   * The default value of the '{@link #getRep() <em>Rep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRep()
   * @generated
   * @ordered
   */
  protected static final String REP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRep() <em>Rep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRep()
   * @generated
   * @ordered
   */
  protected String rep = REP_EDEFAULT;

  /**
   * The default value of the '{@link #getUntil() <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected static final String UNTIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUntil() <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected String until = UNTIL_EDEFAULT;

  /**
   * The default value of the '{@link #getWhile() <em>While</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile()
   * @generated
   * @ordered
   */
  protected static final String WHILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhile() <em>While</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile()
   * @generated
   * @ordered
   */
  protected String while_ = WHILE_EDEFAULT;

  /**
   * The default value of the '{@link #getDo() <em>Do</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected static final String DO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDo() <em>Do</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected String do_ = DO_EDEFAULT;

  /**
   * The default value of the '{@link #getFor() <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected static final String FOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected String for_ = FOR_EDEFAULT;

  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The default value of the '{@link #getEx() <em>Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected static final String EX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected String ex = EX_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return GenPackage.Literals.STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRep()
  {
    return rep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRep(String newRep)
  {
    String oldRep = rep;
    rep = newRep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__REP, oldRep, rep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUntil()
  {
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUntil(String newUntil)
  {
    String oldUntil = until;
    until = newUntil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__UNTIL, oldUntil, until));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhile()
  {
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile(String newWhile)
  {
    String oldWhile = while_;
    while_ = newWhile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__WHILE, oldWhile, while_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDo()
  {
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDo(String newDo)
  {
    String oldDo = do_;
    do_ = newDo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__DO, oldDo, do_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(String newFor)
  {
    String oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__FOR, oldFor, for_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(String newEx)
  {
    String oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__EX, oldEx, ex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.STATEMENT__VAL, oldVal, val));
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
      case GenPackage.STATEMENT__NAME:
        return getName();
      case GenPackage.STATEMENT__REP:
        return getRep();
      case GenPackage.STATEMENT__UNTIL:
        return getUntil();
      case GenPackage.STATEMENT__WHILE:
        return getWhile();
      case GenPackage.STATEMENT__DO:
        return getDo();
      case GenPackage.STATEMENT__FOR:
        return getFor();
      case GenPackage.STATEMENT__VAR:
        return getVar();
      case GenPackage.STATEMENT__EX:
        return getEx();
      case GenPackage.STATEMENT__VAL:
        return getVal();
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
      case GenPackage.STATEMENT__NAME:
        setName((String)newValue);
        return;
      case GenPackage.STATEMENT__REP:
        setRep((String)newValue);
        return;
      case GenPackage.STATEMENT__UNTIL:
        setUntil((String)newValue);
        return;
      case GenPackage.STATEMENT__WHILE:
        setWhile((String)newValue);
        return;
      case GenPackage.STATEMENT__DO:
        setDo((String)newValue);
        return;
      case GenPackage.STATEMENT__FOR:
        setFor((String)newValue);
        return;
      case GenPackage.STATEMENT__VAR:
        setVar((String)newValue);
        return;
      case GenPackage.STATEMENT__EX:
        setEx((String)newValue);
        return;
      case GenPackage.STATEMENT__VAL:
        setVal((String)newValue);
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
      case GenPackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GenPackage.STATEMENT__REP:
        setRep(REP_EDEFAULT);
        return;
      case GenPackage.STATEMENT__UNTIL:
        setUntil(UNTIL_EDEFAULT);
        return;
      case GenPackage.STATEMENT__WHILE:
        setWhile(WHILE_EDEFAULT);
        return;
      case GenPackage.STATEMENT__DO:
        setDo(DO_EDEFAULT);
        return;
      case GenPackage.STATEMENT__FOR:
        setFor(FOR_EDEFAULT);
        return;
      case GenPackage.STATEMENT__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case GenPackage.STATEMENT__EX:
        setEx(EX_EDEFAULT);
        return;
      case GenPackage.STATEMENT__VAL:
        setVal(VAL_EDEFAULT);
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
      case GenPackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GenPackage.STATEMENT__REP:
        return REP_EDEFAULT == null ? rep != null : !REP_EDEFAULT.equals(rep);
      case GenPackage.STATEMENT__UNTIL:
        return UNTIL_EDEFAULT == null ? until != null : !UNTIL_EDEFAULT.equals(until);
      case GenPackage.STATEMENT__WHILE:
        return WHILE_EDEFAULT == null ? while_ != null : !WHILE_EDEFAULT.equals(while_);
      case GenPackage.STATEMENT__DO:
        return DO_EDEFAULT == null ? do_ != null : !DO_EDEFAULT.equals(do_);
      case GenPackage.STATEMENT__FOR:
        return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
      case GenPackage.STATEMENT__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case GenPackage.STATEMENT__EX:
        return EX_EDEFAULT == null ? ex != null : !EX_EDEFAULT.equals(ex);
      case GenPackage.STATEMENT__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", rep: ");
    result.append(rep);
    result.append(", until: ");
    result.append(until);
    result.append(", while: ");
    result.append(while_);
    result.append(", do: ");
    result.append(do_);
    result.append(", for: ");
    result.append(for_);
    result.append(", var: ");
    result.append(var);
    result.append(", ex: ");
    result.append(ex);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //StatementImpl

/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.Expression;
import com.euclideanspace.xgener.gen.GenPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getPar1 <em>Par1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getInfixleft <em>Infixleft</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getBracket <em>Bracket</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getBraces <em>Braces</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl#getParenthasis <em>Parenthasis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
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
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected EList<String> prefix;

  /**
   * The cached value of the '{@link #getPar1() <em>Par1</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar1()
   * @generated
   * @ordered
   */
  protected EList<String> par1;

  /**
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected EList<String> suffix;

  /**
   * The cached value of the '{@link #getInfix() <em>Infix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfix()
   * @generated
   * @ordered
   */
  protected EList<String> infix;

  /**
   * The cached value of the '{@link #getPar2() <em>Par2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected EList<String> par2;

  /**
   * The cached value of the '{@link #getInfixleft() <em>Infixleft</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfixleft()
   * @generated
   * @ordered
   */
  protected EList<String> infixleft;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected EList<String> literal;

  /**
   * The cached value of the '{@link #getBracket() <em>Bracket</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBracket()
   * @generated
   * @ordered
   */
  protected EList<String> bracket;

  /**
   * The cached value of the '{@link #getBraces() <em>Braces</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBraces()
   * @generated
   * @ordered
   */
  protected EList<String> braces;

  /**
   * The cached value of the '{@link #getParenthasis() <em>Parenthasis</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthasis()
   * @generated
   * @ordered
   */
  protected EList<String> parenthasis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return GenPackage.Literals.EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPrefix()
  {
    if (prefix == null)
    {
      prefix = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__PREFIX);
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPar1()
  {
    if (par1 == null)
    {
      par1 = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__PAR1);
    }
    return par1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSuffix()
  {
    if (suffix == null)
    {
      suffix = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__SUFFIX);
    }
    return suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInfix()
  {
    if (infix == null)
    {
      infix = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__INFIX);
    }
    return infix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPar2()
  {
    if (par2 == null)
    {
      par2 = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__PAR2);
    }
    return par2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInfixleft()
  {
    if (infixleft == null)
    {
      infixleft = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__INFIXLEFT);
    }
    return infixleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLiteral()
  {
    if (literal == null)
    {
      literal = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__LITERAL);
    }
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBracket()
  {
    if (bracket == null)
    {
      bracket = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__BRACKET);
    }
    return bracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBraces()
  {
    if (braces == null)
    {
      braces = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__BRACES);
    }
    return braces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParenthasis()
  {
    if (parenthasis == null)
    {
      parenthasis = new EDataTypeEList<String>(String.class, this, GenPackage.EXPRESSION__PARENTHASIS);
    }
    return parenthasis;
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
      case GenPackage.EXPRESSION__NAME:
        return getName();
      case GenPackage.EXPRESSION__PREFIX:
        return getPrefix();
      case GenPackage.EXPRESSION__PAR1:
        return getPar1();
      case GenPackage.EXPRESSION__SUFFIX:
        return getSuffix();
      case GenPackage.EXPRESSION__INFIX:
        return getInfix();
      case GenPackage.EXPRESSION__PAR2:
        return getPar2();
      case GenPackage.EXPRESSION__INFIXLEFT:
        return getInfixleft();
      case GenPackage.EXPRESSION__LITERAL:
        return getLiteral();
      case GenPackage.EXPRESSION__BRACKET:
        return getBracket();
      case GenPackage.EXPRESSION__BRACES:
        return getBraces();
      case GenPackage.EXPRESSION__PARENTHASIS:
        return getParenthasis();
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
      case GenPackage.EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case GenPackage.EXPRESSION__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__PAR1:
        getPar1().clear();
        getPar1().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__SUFFIX:
        getSuffix().clear();
        getSuffix().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__INFIX:
        getInfix().clear();
        getInfix().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__PAR2:
        getPar2().clear();
        getPar2().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__INFIXLEFT:
        getInfixleft().clear();
        getInfixleft().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__LITERAL:
        getLiteral().clear();
        getLiteral().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__BRACKET:
        getBracket().clear();
        getBracket().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__BRACES:
        getBraces().clear();
        getBraces().addAll((Collection<? extends String>)newValue);
        return;
      case GenPackage.EXPRESSION__PARENTHASIS:
        getParenthasis().clear();
        getParenthasis().addAll((Collection<? extends String>)newValue);
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
      case GenPackage.EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GenPackage.EXPRESSION__PREFIX:
        getPrefix().clear();
        return;
      case GenPackage.EXPRESSION__PAR1:
        getPar1().clear();
        return;
      case GenPackage.EXPRESSION__SUFFIX:
        getSuffix().clear();
        return;
      case GenPackage.EXPRESSION__INFIX:
        getInfix().clear();
        return;
      case GenPackage.EXPRESSION__PAR2:
        getPar2().clear();
        return;
      case GenPackage.EXPRESSION__INFIXLEFT:
        getInfixleft().clear();
        return;
      case GenPackage.EXPRESSION__LITERAL:
        getLiteral().clear();
        return;
      case GenPackage.EXPRESSION__BRACKET:
        getBracket().clear();
        return;
      case GenPackage.EXPRESSION__BRACES:
        getBraces().clear();
        return;
      case GenPackage.EXPRESSION__PARENTHASIS:
        getParenthasis().clear();
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
      case GenPackage.EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GenPackage.EXPRESSION__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case GenPackage.EXPRESSION__PAR1:
        return par1 != null && !par1.isEmpty();
      case GenPackage.EXPRESSION__SUFFIX:
        return suffix != null && !suffix.isEmpty();
      case GenPackage.EXPRESSION__INFIX:
        return infix != null && !infix.isEmpty();
      case GenPackage.EXPRESSION__PAR2:
        return par2 != null && !par2.isEmpty();
      case GenPackage.EXPRESSION__INFIXLEFT:
        return infixleft != null && !infixleft.isEmpty();
      case GenPackage.EXPRESSION__LITERAL:
        return literal != null && !literal.isEmpty();
      case GenPackage.EXPRESSION__BRACKET:
        return bracket != null && !bracket.isEmpty();
      case GenPackage.EXPRESSION__BRACES:
        return braces != null && !braces.isEmpty();
      case GenPackage.EXPRESSION__PARENTHASIS:
        return parenthasis != null && !parenthasis.isEmpty();
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
    result.append(", prefix: ");
    result.append(prefix);
    result.append(", par1: ");
    result.append(par1);
    result.append(", suffix: ");
    result.append(suffix);
    result.append(", infix: ");
    result.append(infix);
    result.append(", par2: ");
    result.append(par2);
    result.append(", infixleft: ");
    result.append(infixleft);
    result.append(", literal: ");
    result.append(literal);
    result.append(", bracket: ");
    result.append(bracket);
    result.append(", braces: ");
    result.append(braces);
    result.append(", parenthasis: ");
    result.append(parenthasis);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl

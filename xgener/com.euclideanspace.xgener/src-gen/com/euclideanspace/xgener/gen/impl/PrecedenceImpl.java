/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.MultString;
import com.euclideanspace.xgener.gen.Precedence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getRuletyp <em>Ruletyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getFeature1 <em>Feature1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getPar1 <em>Par1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getFeature2 <em>Feature2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getInfixleft <em>Infixleft</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getBracket <em>Bracket</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getBraces <em>Braces</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl#getParenthesis <em>Parenthesis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceImpl extends MinimalEObjectImpl.Container implements Precedence
{
  /**
   * The default value of the '{@link #getRuletyp() <em>Ruletyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuletyp()
   * @generated
   * @ordered
   */
  protected static final String RULETYP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRuletyp() <em>Ruletyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuletyp()
   * @generated
   * @ordered
   */
  protected String ruletyp = RULETYP_EDEFAULT;

  /**
   * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected static final String RULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected String rule = RULE_EDEFAULT;

  /**
   * The default value of the '{@link #getFeature1() <em>Feature1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature1()
   * @generated
   * @ordered
   */
  protected static final String FEATURE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeature1() <em>Feature1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature1()
   * @generated
   * @ordered
   */
  protected String feature1 = FEATURE1_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected MultString prefix;

  /**
   * The default value of the '{@link #getPar1() <em>Par1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar1()
   * @generated
   * @ordered
   */
  protected static final String PAR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPar1() <em>Par1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar1()
   * @generated
   * @ordered
   */
  protected String par1 = PAR1_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected MultString suffix;

  /**
   * The cached value of the '{@link #getInfix() <em>Infix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfix()
   * @generated
   * @ordered
   */
  protected MultString infix;

  /**
   * The default value of the '{@link #getFeature2() <em>Feature2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature2()
   * @generated
   * @ordered
   */
  protected static final String FEATURE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeature2() <em>Feature2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature2()
   * @generated
   * @ordered
   */
  protected String feature2 = FEATURE2_EDEFAULT;

  /**
   * The default value of the '{@link #getPar2() <em>Par2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected static final String PAR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPar2() <em>Par2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar2()
   * @generated
   * @ordered
   */
  protected String par2 = PAR2_EDEFAULT;

  /**
   * The cached value of the '{@link #getInfixleft() <em>Infixleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfixleft()
   * @generated
   * @ordered
   */
  protected MultString infixleft;

  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The default value of the '{@link #getBracket() <em>Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBracket()
   * @generated
   * @ordered
   */
  protected static final String BRACKET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBracket() <em>Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBracket()
   * @generated
   * @ordered
   */
  protected String bracket = BRACKET_EDEFAULT;

  /**
   * The default value of the '{@link #getBraces() <em>Braces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBraces()
   * @generated
   * @ordered
   */
  protected static final String BRACES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBraces() <em>Braces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBraces()
   * @generated
   * @ordered
   */
  protected String braces = BRACES_EDEFAULT;

  /**
   * The default value of the '{@link #getParenthesis() <em>Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthesis()
   * @generated
   * @ordered
   */
  protected static final String PARENTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParenthesis() <em>Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthesis()
   * @generated
   * @ordered
   */
  protected String parenthesis = PARENTHESIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrecedenceImpl()
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
    return GenPackage.Literals.PRECEDENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRuletyp()
  {
    return ruletyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuletyp(String newRuletyp)
  {
    String oldRuletyp = ruletyp;
    ruletyp = newRuletyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__RULETYP, oldRuletyp, ruletyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(String newRule)
  {
    String oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__RULE, oldRule, rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeature1()
  {
    return feature1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature1(String newFeature1)
  {
    String oldFeature1 = feature1;
    feature1 = newFeature1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__FEATURE1, oldFeature1, feature1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultString getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(MultString newPrefix, NotificationChain msgs)
  {
    MultString oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__PREFIX, oldPrefix, newPrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(MultString newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__PREFIX, newPrefix, newPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPar1()
  {
    return par1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar1(String newPar1)
  {
    String oldPar1 = par1;
    par1 = newPar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__PAR1, oldPar1, par1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultString getSuffix()
  {
    return suffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuffix(MultString newSuffix, NotificationChain msgs)
  {
    MultString oldSuffix = suffix;
    suffix = newSuffix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__SUFFIX, oldSuffix, newSuffix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuffix(MultString newSuffix)
  {
    if (newSuffix != suffix)
    {
      NotificationChain msgs = null;
      if (suffix != null)
        msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__SUFFIX, null, msgs);
      if (newSuffix != null)
        msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__SUFFIX, null, msgs);
      msgs = basicSetSuffix(newSuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__SUFFIX, newSuffix, newSuffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultString getInfix()
  {
    return infix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfix(MultString newInfix, NotificationChain msgs)
  {
    MultString oldInfix = infix;
    infix = newInfix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__INFIX, oldInfix, newInfix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfix(MultString newInfix)
  {
    if (newInfix != infix)
    {
      NotificationChain msgs = null;
      if (infix != null)
        msgs = ((InternalEObject)infix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__INFIX, null, msgs);
      if (newInfix != null)
        msgs = ((InternalEObject)newInfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__INFIX, null, msgs);
      msgs = basicSetInfix(newInfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__INFIX, newInfix, newInfix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeature2()
  {
    return feature2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature2(String newFeature2)
  {
    String oldFeature2 = feature2;
    feature2 = newFeature2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__FEATURE2, oldFeature2, feature2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPar2()
  {
    return par2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar2(String newPar2)
  {
    String oldPar2 = par2;
    par2 = newPar2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__PAR2, oldPar2, par2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultString getInfixleft()
  {
    return infixleft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfixleft(MultString newInfixleft, NotificationChain msgs)
  {
    MultString oldInfixleft = infixleft;
    infixleft = newInfixleft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__INFIXLEFT, oldInfixleft, newInfixleft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfixleft(MultString newInfixleft)
  {
    if (newInfixleft != infixleft)
    {
      NotificationChain msgs = null;
      if (infixleft != null)
        msgs = ((InternalEObject)infixleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__INFIXLEFT, null, msgs);
      if (newInfixleft != null)
        msgs = ((InternalEObject)newInfixleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRECEDENCE__INFIXLEFT, null, msgs);
      msgs = basicSetInfixleft(newInfixleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__INFIXLEFT, newInfixleft, newInfixleft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBracket()
  {
    return bracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBracket(String newBracket)
  {
    String oldBracket = bracket;
    bracket = newBracket;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__BRACKET, oldBracket, bracket));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBraces()
  {
    return braces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBraces(String newBraces)
  {
    String oldBraces = braces;
    braces = newBraces;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__BRACES, oldBraces, braces));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParenthesis()
  {
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParenthesis(String newParenthesis)
  {
    String oldParenthesis = parenthesis;
    parenthesis = newParenthesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRECEDENCE__PARENTHESIS, oldParenthesis, parenthesis));
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
      case GenPackage.PRECEDENCE__PREFIX:
        return basicSetPrefix(null, msgs);
      case GenPackage.PRECEDENCE__SUFFIX:
        return basicSetSuffix(null, msgs);
      case GenPackage.PRECEDENCE__INFIX:
        return basicSetInfix(null, msgs);
      case GenPackage.PRECEDENCE__INFIXLEFT:
        return basicSetInfixleft(null, msgs);
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
      case GenPackage.PRECEDENCE__RULETYP:
        return getRuletyp();
      case GenPackage.PRECEDENCE__RULE:
        return getRule();
      case GenPackage.PRECEDENCE__FEATURE1:
        return getFeature1();
      case GenPackage.PRECEDENCE__PREFIX:
        return getPrefix();
      case GenPackage.PRECEDENCE__PAR1:
        return getPar1();
      case GenPackage.PRECEDENCE__SUFFIX:
        return getSuffix();
      case GenPackage.PRECEDENCE__INFIX:
        return getInfix();
      case GenPackage.PRECEDENCE__FEATURE2:
        return getFeature2();
      case GenPackage.PRECEDENCE__PAR2:
        return getPar2();
      case GenPackage.PRECEDENCE__INFIXLEFT:
        return getInfixleft();
      case GenPackage.PRECEDENCE__LITERAL:
        return getLiteral();
      case GenPackage.PRECEDENCE__BRACKET:
        return getBracket();
      case GenPackage.PRECEDENCE__BRACES:
        return getBraces();
      case GenPackage.PRECEDENCE__PARENTHESIS:
        return getParenthesis();
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
      case GenPackage.PRECEDENCE__RULETYP:
        setRuletyp((String)newValue);
        return;
      case GenPackage.PRECEDENCE__RULE:
        setRule((String)newValue);
        return;
      case GenPackage.PRECEDENCE__FEATURE1:
        setFeature1((String)newValue);
        return;
      case GenPackage.PRECEDENCE__PREFIX:
        setPrefix((MultString)newValue);
        return;
      case GenPackage.PRECEDENCE__PAR1:
        setPar1((String)newValue);
        return;
      case GenPackage.PRECEDENCE__SUFFIX:
        setSuffix((MultString)newValue);
        return;
      case GenPackage.PRECEDENCE__INFIX:
        setInfix((MultString)newValue);
        return;
      case GenPackage.PRECEDENCE__FEATURE2:
        setFeature2((String)newValue);
        return;
      case GenPackage.PRECEDENCE__PAR2:
        setPar2((String)newValue);
        return;
      case GenPackage.PRECEDENCE__INFIXLEFT:
        setInfixleft((MultString)newValue);
        return;
      case GenPackage.PRECEDENCE__LITERAL:
        setLiteral((String)newValue);
        return;
      case GenPackage.PRECEDENCE__BRACKET:
        setBracket((String)newValue);
        return;
      case GenPackage.PRECEDENCE__BRACES:
        setBraces((String)newValue);
        return;
      case GenPackage.PRECEDENCE__PARENTHESIS:
        setParenthesis((String)newValue);
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
      case GenPackage.PRECEDENCE__RULETYP:
        setRuletyp(RULETYP_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__RULE:
        setRule(RULE_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__FEATURE1:
        setFeature1(FEATURE1_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__PREFIX:
        setPrefix((MultString)null);
        return;
      case GenPackage.PRECEDENCE__PAR1:
        setPar1(PAR1_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__SUFFIX:
        setSuffix((MultString)null);
        return;
      case GenPackage.PRECEDENCE__INFIX:
        setInfix((MultString)null);
        return;
      case GenPackage.PRECEDENCE__FEATURE2:
        setFeature2(FEATURE2_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__PAR2:
        setPar2(PAR2_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__INFIXLEFT:
        setInfixleft((MultString)null);
        return;
      case GenPackage.PRECEDENCE__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__BRACKET:
        setBracket(BRACKET_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__BRACES:
        setBraces(BRACES_EDEFAULT);
        return;
      case GenPackage.PRECEDENCE__PARENTHESIS:
        setParenthesis(PARENTHESIS_EDEFAULT);
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
      case GenPackage.PRECEDENCE__RULETYP:
        return RULETYP_EDEFAULT == null ? ruletyp != null : !RULETYP_EDEFAULT.equals(ruletyp);
      case GenPackage.PRECEDENCE__RULE:
        return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
      case GenPackage.PRECEDENCE__FEATURE1:
        return FEATURE1_EDEFAULT == null ? feature1 != null : !FEATURE1_EDEFAULT.equals(feature1);
      case GenPackage.PRECEDENCE__PREFIX:
        return prefix != null;
      case GenPackage.PRECEDENCE__PAR1:
        return PAR1_EDEFAULT == null ? par1 != null : !PAR1_EDEFAULT.equals(par1);
      case GenPackage.PRECEDENCE__SUFFIX:
        return suffix != null;
      case GenPackage.PRECEDENCE__INFIX:
        return infix != null;
      case GenPackage.PRECEDENCE__FEATURE2:
        return FEATURE2_EDEFAULT == null ? feature2 != null : !FEATURE2_EDEFAULT.equals(feature2);
      case GenPackage.PRECEDENCE__PAR2:
        return PAR2_EDEFAULT == null ? par2 != null : !PAR2_EDEFAULT.equals(par2);
      case GenPackage.PRECEDENCE__INFIXLEFT:
        return infixleft != null;
      case GenPackage.PRECEDENCE__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case GenPackage.PRECEDENCE__BRACKET:
        return BRACKET_EDEFAULT == null ? bracket != null : !BRACKET_EDEFAULT.equals(bracket);
      case GenPackage.PRECEDENCE__BRACES:
        return BRACES_EDEFAULT == null ? braces != null : !BRACES_EDEFAULT.equals(braces);
      case GenPackage.PRECEDENCE__PARENTHESIS:
        return PARENTHESIS_EDEFAULT == null ? parenthesis != null : !PARENTHESIS_EDEFAULT.equals(parenthesis);
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
    result.append(" (ruletyp: ");
    result.append(ruletyp);
    result.append(", rule: ");
    result.append(rule);
    result.append(", feature1: ");
    result.append(feature1);
    result.append(", par1: ");
    result.append(par1);
    result.append(", feature2: ");
    result.append(feature2);
    result.append(", par2: ");
    result.append(par2);
    result.append(", literal: ");
    result.append(literal);
    result.append(", bracket: ");
    result.append(bracket);
    result.append(", braces: ");
    result.append(braces);
    result.append(", parenthesis: ");
    result.append(parenthesis);
    result.append(')');
    return result.toString();
  }

} //PrecedenceImpl

/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.InnerPrecedence;
import com.euclideanspace.xgener.gen.MultString;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getRuletyp <em>Ruletyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getFeature1 <em>Feature1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getFeature2 <em>Feature2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getInfixleft <em>Infixleft</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getBracket <em>Bracket</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getBraces <em>Braces</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getParenthesis <em>Parenthesis</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InnerPrecedenceImpl extends MinimalEObjectImpl.Container implements InnerPrecedence
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
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected MultString prefix;

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
   * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffix()
   * @generated
   * @ordered
   */
  protected MultString suffix;

  /**
   * The default value of the '{@link #getMod() <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected static final String MOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected String mod = MOD_EDEFAULT;

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
   * The cached value of the '{@link #getInfixleft() <em>Infixleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfixleft()
   * @generated
   * @ordered
   */
  protected MultString infixleft;

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
   * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected static final String ANGLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngle()
   * @generated
   * @ordered
   */
  protected String angle = ANGLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InnerPrecedenceImpl()
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
    return GenPackage.Literals.INNER_PRECEDENCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__RULETYP, oldRuletyp, ruletyp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__PREFIX, oldPrefix, newPrefix);
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
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__PREFIX, newPrefix, newPrefix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__FEATURE1, oldFeature1, feature1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__PAR2, oldPar2, par2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__SUFFIX, oldSuffix, newSuffix);
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
        msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__SUFFIX, null, msgs);
      if (newSuffix != null)
        msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__SUFFIX, null, msgs);
      msgs = basicSetSuffix(newSuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__SUFFIX, newSuffix, newSuffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(String newMod)
  {
    String oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__MOD, oldMod, mod));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__RULE, oldRule, rule));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__INFIX, oldInfix, newInfix);
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
        msgs = ((InternalEObject)infix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__INFIX, null, msgs);
      if (newInfix != null)
        msgs = ((InternalEObject)newInfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__INFIX, null, msgs);
      msgs = basicSetInfix(newInfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__INFIX, newInfix, newInfix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__FEATURE2, oldFeature2, feature2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__INFIXLEFT, oldInfixleft, newInfixleft);
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
        msgs = ((InternalEObject)infixleft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__INFIXLEFT, null, msgs);
      if (newInfixleft != null)
        msgs = ((InternalEObject)newInfixleft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.INNER_PRECEDENCE__INFIXLEFT, null, msgs);
      msgs = basicSetInfixleft(newInfixleft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__INFIXLEFT, newInfixleft, newInfixleft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__BRACKET, oldBracket, bracket));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__BRACES, oldBraces, braces));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__PARENTHESIS, oldParenthesis, parenthesis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAngle()
  {
    return angle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAngle(String newAngle)
  {
    String oldAngle = angle;
    angle = newAngle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.INNER_PRECEDENCE__ANGLE, oldAngle, angle));
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
      case GenPackage.INNER_PRECEDENCE__PREFIX:
        return basicSetPrefix(null, msgs);
      case GenPackage.INNER_PRECEDENCE__SUFFIX:
        return basicSetSuffix(null, msgs);
      case GenPackage.INNER_PRECEDENCE__INFIX:
        return basicSetInfix(null, msgs);
      case GenPackage.INNER_PRECEDENCE__INFIXLEFT:
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
      case GenPackage.INNER_PRECEDENCE__RULETYP:
        return getRuletyp();
      case GenPackage.INNER_PRECEDENCE__PREFIX:
        return getPrefix();
      case GenPackage.INNER_PRECEDENCE__FEATURE1:
        return getFeature1();
      case GenPackage.INNER_PRECEDENCE__PAR2:
        return getPar2();
      case GenPackage.INNER_PRECEDENCE__SUFFIX:
        return getSuffix();
      case GenPackage.INNER_PRECEDENCE__MOD:
        return getMod();
      case GenPackage.INNER_PRECEDENCE__RULE:
        return getRule();
      case GenPackage.INNER_PRECEDENCE__INFIX:
        return getInfix();
      case GenPackage.INNER_PRECEDENCE__FEATURE2:
        return getFeature2();
      case GenPackage.INNER_PRECEDENCE__INFIXLEFT:
        return getInfixleft();
      case GenPackage.INNER_PRECEDENCE__BRACKET:
        return getBracket();
      case GenPackage.INNER_PRECEDENCE__BRACES:
        return getBraces();
      case GenPackage.INNER_PRECEDENCE__PARENTHESIS:
        return getParenthesis();
      case GenPackage.INNER_PRECEDENCE__ANGLE:
        return getAngle();
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
      case GenPackage.INNER_PRECEDENCE__RULETYP:
        setRuletyp((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__PREFIX:
        setPrefix((MultString)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__FEATURE1:
        setFeature1((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__PAR2:
        setPar2((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__SUFFIX:
        setSuffix((MultString)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__MOD:
        setMod((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__RULE:
        setRule((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__INFIX:
        setInfix((MultString)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__FEATURE2:
        setFeature2((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__INFIXLEFT:
        setInfixleft((MultString)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__BRACKET:
        setBracket((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__BRACES:
        setBraces((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__PARENTHESIS:
        setParenthesis((String)newValue);
        return;
      case GenPackage.INNER_PRECEDENCE__ANGLE:
        setAngle((String)newValue);
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
      case GenPackage.INNER_PRECEDENCE__RULETYP:
        setRuletyp(RULETYP_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__PREFIX:
        setPrefix((MultString)null);
        return;
      case GenPackage.INNER_PRECEDENCE__FEATURE1:
        setFeature1(FEATURE1_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__PAR2:
        setPar2(PAR2_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__SUFFIX:
        setSuffix((MultString)null);
        return;
      case GenPackage.INNER_PRECEDENCE__MOD:
        setMod(MOD_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__RULE:
        setRule(RULE_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__INFIX:
        setInfix((MultString)null);
        return;
      case GenPackage.INNER_PRECEDENCE__FEATURE2:
        setFeature2(FEATURE2_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__INFIXLEFT:
        setInfixleft((MultString)null);
        return;
      case GenPackage.INNER_PRECEDENCE__BRACKET:
        setBracket(BRACKET_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__BRACES:
        setBraces(BRACES_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__PARENTHESIS:
        setParenthesis(PARENTHESIS_EDEFAULT);
        return;
      case GenPackage.INNER_PRECEDENCE__ANGLE:
        setAngle(ANGLE_EDEFAULT);
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
      case GenPackage.INNER_PRECEDENCE__RULETYP:
        return RULETYP_EDEFAULT == null ? ruletyp != null : !RULETYP_EDEFAULT.equals(ruletyp);
      case GenPackage.INNER_PRECEDENCE__PREFIX:
        return prefix != null;
      case GenPackage.INNER_PRECEDENCE__FEATURE1:
        return FEATURE1_EDEFAULT == null ? feature1 != null : !FEATURE1_EDEFAULT.equals(feature1);
      case GenPackage.INNER_PRECEDENCE__PAR2:
        return PAR2_EDEFAULT == null ? par2 != null : !PAR2_EDEFAULT.equals(par2);
      case GenPackage.INNER_PRECEDENCE__SUFFIX:
        return suffix != null;
      case GenPackage.INNER_PRECEDENCE__MOD:
        return MOD_EDEFAULT == null ? mod != null : !MOD_EDEFAULT.equals(mod);
      case GenPackage.INNER_PRECEDENCE__RULE:
        return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
      case GenPackage.INNER_PRECEDENCE__INFIX:
        return infix != null;
      case GenPackage.INNER_PRECEDENCE__FEATURE2:
        return FEATURE2_EDEFAULT == null ? feature2 != null : !FEATURE2_EDEFAULT.equals(feature2);
      case GenPackage.INNER_PRECEDENCE__INFIXLEFT:
        return infixleft != null;
      case GenPackage.INNER_PRECEDENCE__BRACKET:
        return BRACKET_EDEFAULT == null ? bracket != null : !BRACKET_EDEFAULT.equals(bracket);
      case GenPackage.INNER_PRECEDENCE__BRACES:
        return BRACES_EDEFAULT == null ? braces != null : !BRACES_EDEFAULT.equals(braces);
      case GenPackage.INNER_PRECEDENCE__PARENTHESIS:
        return PARENTHESIS_EDEFAULT == null ? parenthesis != null : !PARENTHESIS_EDEFAULT.equals(parenthesis);
      case GenPackage.INNER_PRECEDENCE__ANGLE:
        return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
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
    result.append(", feature1: ");
    result.append(feature1);
    result.append(", par2: ");
    result.append(par2);
    result.append(", mod: ");
    result.append(mod);
    result.append(", rule: ");
    result.append(rule);
    result.append(", feature2: ");
    result.append(feature2);
    result.append(", bracket: ");
    result.append(bracket);
    result.append(", braces: ");
    result.append(braces);
    result.append(", parenthesis: ");
    result.append(parenthesis);
    result.append(", angle: ");
    result.append(angle);
    result.append(')');
    return result.toString();
  }

} //InnerPrecedenceImpl

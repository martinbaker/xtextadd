/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.MultString;
import com.euclideanspace.xgener.gen.SubPrecedence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getRuletyp <em>Ruletyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getCustomrule <em>Customrule</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getFeature1 <em>Feature1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getPar1 <em>Par1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getFeature2 <em>Feature2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getBracket <em>Bracket</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getBraces <em>Braces</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getParenthesis <em>Parenthesis</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubPrecedenceImpl extends MinimalEObjectImpl.Container implements SubPrecedence
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
   * The default value of the '{@link #getCustomrule() <em>Customrule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomrule()
   * @generated
   * @ordered
   */
  protected static final String CUSTOMRULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomrule() <em>Customrule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomrule()
   * @generated
   * @ordered
   */
  protected String customrule = CUSTOMRULE_EDEFAULT;

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
  protected SubPrecedenceImpl()
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
    return GenPackage.Literals.SUB_PRECEDENCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__RULETYP, oldRuletyp, ruletyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCustomrule()
  {
    return customrule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomrule(String newCustomrule)
  {
    String oldCustomrule = customrule;
    customrule = newCustomrule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__CUSTOMRULE, oldCustomrule, customrule));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__PREFIX, oldPrefix, newPrefix);
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
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.SUB_PRECEDENCE__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.SUB_PRECEDENCE__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__PREFIX, newPrefix, newPrefix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__FEATURE1, oldFeature1, feature1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__PAR2, oldPar2, par2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__SUFFIX, oldSuffix, newSuffix);
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
        msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.SUB_PRECEDENCE__SUFFIX, null, msgs);
      if (newSuffix != null)
        msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.SUB_PRECEDENCE__SUFFIX, null, msgs);
      msgs = basicSetSuffix(newSuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__SUFFIX, newSuffix, newSuffix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__PAR1, oldPar1, par1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__INFIX, oldInfix, newInfix);
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
        msgs = ((InternalEObject)infix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.SUB_PRECEDENCE__INFIX, null, msgs);
      if (newInfix != null)
        msgs = ((InternalEObject)newInfix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.SUB_PRECEDENCE__INFIX, null, msgs);
      msgs = basicSetInfix(newInfix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__INFIX, newInfix, newInfix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__FEATURE2, oldFeature2, feature2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__RULE, oldRule, rule));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__BRACKET, oldBracket, bracket));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__BRACES, oldBraces, braces));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__PARENTHESIS, oldParenthesis, parenthesis));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.SUB_PRECEDENCE__ANGLE, oldAngle, angle));
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
      case GenPackage.SUB_PRECEDENCE__PREFIX:
        return basicSetPrefix(null, msgs);
      case GenPackage.SUB_PRECEDENCE__SUFFIX:
        return basicSetSuffix(null, msgs);
      case GenPackage.SUB_PRECEDENCE__INFIX:
        return basicSetInfix(null, msgs);
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
      case GenPackage.SUB_PRECEDENCE__RULETYP:
        return getRuletyp();
      case GenPackage.SUB_PRECEDENCE__CUSTOMRULE:
        return getCustomrule();
      case GenPackage.SUB_PRECEDENCE__PREFIX:
        return getPrefix();
      case GenPackage.SUB_PRECEDENCE__FEATURE1:
        return getFeature1();
      case GenPackage.SUB_PRECEDENCE__PAR2:
        return getPar2();
      case GenPackage.SUB_PRECEDENCE__SUFFIX:
        return getSuffix();
      case GenPackage.SUB_PRECEDENCE__PAR1:
        return getPar1();
      case GenPackage.SUB_PRECEDENCE__INFIX:
        return getInfix();
      case GenPackage.SUB_PRECEDENCE__FEATURE2:
        return getFeature2();
      case GenPackage.SUB_PRECEDENCE__RULE:
        return getRule();
      case GenPackage.SUB_PRECEDENCE__BRACKET:
        return getBracket();
      case GenPackage.SUB_PRECEDENCE__BRACES:
        return getBraces();
      case GenPackage.SUB_PRECEDENCE__PARENTHESIS:
        return getParenthesis();
      case GenPackage.SUB_PRECEDENCE__ANGLE:
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
      case GenPackage.SUB_PRECEDENCE__RULETYP:
        setRuletyp((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__CUSTOMRULE:
        setCustomrule((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__PREFIX:
        setPrefix((MultString)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__FEATURE1:
        setFeature1((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__PAR2:
        setPar2((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__SUFFIX:
        setSuffix((MultString)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__PAR1:
        setPar1((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__INFIX:
        setInfix((MultString)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__FEATURE2:
        setFeature2((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__RULE:
        setRule((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__BRACKET:
        setBracket((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__BRACES:
        setBraces((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__PARENTHESIS:
        setParenthesis((String)newValue);
        return;
      case GenPackage.SUB_PRECEDENCE__ANGLE:
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
      case GenPackage.SUB_PRECEDENCE__RULETYP:
        setRuletyp(RULETYP_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__CUSTOMRULE:
        setCustomrule(CUSTOMRULE_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__PREFIX:
        setPrefix((MultString)null);
        return;
      case GenPackage.SUB_PRECEDENCE__FEATURE1:
        setFeature1(FEATURE1_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__PAR2:
        setPar2(PAR2_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__SUFFIX:
        setSuffix((MultString)null);
        return;
      case GenPackage.SUB_PRECEDENCE__PAR1:
        setPar1(PAR1_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__INFIX:
        setInfix((MultString)null);
        return;
      case GenPackage.SUB_PRECEDENCE__FEATURE2:
        setFeature2(FEATURE2_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__RULE:
        setRule(RULE_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__BRACKET:
        setBracket(BRACKET_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__BRACES:
        setBraces(BRACES_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__PARENTHESIS:
        setParenthesis(PARENTHESIS_EDEFAULT);
        return;
      case GenPackage.SUB_PRECEDENCE__ANGLE:
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
      case GenPackage.SUB_PRECEDENCE__RULETYP:
        return RULETYP_EDEFAULT == null ? ruletyp != null : !RULETYP_EDEFAULT.equals(ruletyp);
      case GenPackage.SUB_PRECEDENCE__CUSTOMRULE:
        return CUSTOMRULE_EDEFAULT == null ? customrule != null : !CUSTOMRULE_EDEFAULT.equals(customrule);
      case GenPackage.SUB_PRECEDENCE__PREFIX:
        return prefix != null;
      case GenPackage.SUB_PRECEDENCE__FEATURE1:
        return FEATURE1_EDEFAULT == null ? feature1 != null : !FEATURE1_EDEFAULT.equals(feature1);
      case GenPackage.SUB_PRECEDENCE__PAR2:
        return PAR2_EDEFAULT == null ? par2 != null : !PAR2_EDEFAULT.equals(par2);
      case GenPackage.SUB_PRECEDENCE__SUFFIX:
        return suffix != null;
      case GenPackage.SUB_PRECEDENCE__PAR1:
        return PAR1_EDEFAULT == null ? par1 != null : !PAR1_EDEFAULT.equals(par1);
      case GenPackage.SUB_PRECEDENCE__INFIX:
        return infix != null;
      case GenPackage.SUB_PRECEDENCE__FEATURE2:
        return FEATURE2_EDEFAULT == null ? feature2 != null : !FEATURE2_EDEFAULT.equals(feature2);
      case GenPackage.SUB_PRECEDENCE__RULE:
        return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
      case GenPackage.SUB_PRECEDENCE__BRACKET:
        return BRACKET_EDEFAULT == null ? bracket != null : !BRACKET_EDEFAULT.equals(bracket);
      case GenPackage.SUB_PRECEDENCE__BRACES:
        return BRACES_EDEFAULT == null ? braces != null : !BRACES_EDEFAULT.equals(braces);
      case GenPackage.SUB_PRECEDENCE__PARENTHESIS:
        return PARENTHESIS_EDEFAULT == null ? parenthesis != null : !PARENTHESIS_EDEFAULT.equals(parenthesis);
      case GenPackage.SUB_PRECEDENCE__ANGLE:
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
    result.append(", customrule: ");
    result.append(customrule);
    result.append(", feature1: ");
    result.append(feature1);
    result.append(", par2: ");
    result.append(par2);
    result.append(", par1: ");
    result.append(par1);
    result.append(", feature2: ");
    result.append(feature2);
    result.append(", rule: ");
    result.append(rule);
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

} //SubPrecedenceImpl

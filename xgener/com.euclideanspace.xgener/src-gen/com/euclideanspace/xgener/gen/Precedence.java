/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getRuletyp <em>Ruletyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getRule <em>Rule</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getFeature1 <em>Feature1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getPar1 <em>Par1</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getInfix <em>Infix</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getFeature2 <em>Feature2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getPar2 <em>Par2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getInfixleft <em>Infixleft</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getBracket <em>Bracket</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getBraces <em>Braces</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.Precedence#getParenthesis <em>Parenthesis</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence()
 * @model
 * @generated
 */
public interface Precedence extends EObject
{
  /**
   * Returns the value of the '<em><b>Ruletyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ruletyp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ruletyp</em>' attribute.
   * @see #setRuletyp(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Ruletyp()
   * @model
   * @generated
   */
  String getRuletyp();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getRuletyp <em>Ruletyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ruletyp</em>' attribute.
   * @see #getRuletyp()
   * @generated
   */
  void setRuletyp(String value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute.
   * @see #setRule(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Rule()
   * @model
   * @generated
   */
  String getRule();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getRule <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' attribute.
   * @see #getRule()
   * @generated
   */
  void setRule(String value);

  /**
   * Returns the value of the '<em><b>Feature1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature1</em>' attribute.
   * @see #setFeature1(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Feature1()
   * @model
   * @generated
   */
  String getFeature1();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getFeature1 <em>Feature1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature1</em>' attribute.
   * @see #getFeature1()
   * @generated
   */
  void setFeature1(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(MultString)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Prefix()
   * @model containment="true"
   * @generated
   */
  MultString getPrefix();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(MultString value);

  /**
   * Returns the value of the '<em><b>Par1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par1</em>' attribute.
   * @see #setPar1(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Par1()
   * @model
   * @generated
   */
  String getPar1();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getPar1 <em>Par1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par1</em>' attribute.
   * @see #getPar1()
   * @generated
   */
  void setPar1(String value);

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' containment reference.
   * @see #setSuffix(MultString)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Suffix()
   * @model containment="true"
   * @generated
   */
  MultString getSuffix();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getSuffix <em>Suffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suffix</em>' containment reference.
   * @see #getSuffix()
   * @generated
   */
  void setSuffix(MultString value);

  /**
   * Returns the value of the '<em><b>Infix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infix</em>' containment reference.
   * @see #setInfix(MultString)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Infix()
   * @model containment="true"
   * @generated
   */
  MultString getInfix();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getInfix <em>Infix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infix</em>' containment reference.
   * @see #getInfix()
   * @generated
   */
  void setInfix(MultString value);

  /**
   * Returns the value of the '<em><b>Feature2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature2</em>' attribute.
   * @see #setFeature2(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Feature2()
   * @model
   * @generated
   */
  String getFeature2();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getFeature2 <em>Feature2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature2</em>' attribute.
   * @see #getFeature2()
   * @generated
   */
  void setFeature2(String value);

  /**
   * Returns the value of the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par2</em>' attribute.
   * @see #setPar2(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Par2()
   * @model
   * @generated
   */
  String getPar2();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getPar2 <em>Par2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par2</em>' attribute.
   * @see #getPar2()
   * @generated
   */
  void setPar2(String value);

  /**
   * Returns the value of the '<em><b>Infixleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infixleft</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infixleft</em>' containment reference.
   * @see #setInfixleft(MultString)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Infixleft()
   * @model containment="true"
   * @generated
   */
  MultString getInfixleft();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getInfixleft <em>Infixleft</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infixleft</em>' containment reference.
   * @see #getInfixleft()
   * @generated
   */
  void setInfixleft(MultString value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

  /**
   * Returns the value of the '<em><b>Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bracket</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bracket</em>' attribute.
   * @see #setBracket(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Bracket()
   * @model
   * @generated
   */
  String getBracket();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getBracket <em>Bracket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bracket</em>' attribute.
   * @see #getBracket()
   * @generated
   */
  void setBracket(String value);

  /**
   * Returns the value of the '<em><b>Braces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Braces</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Braces</em>' attribute.
   * @see #setBraces(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Braces()
   * @model
   * @generated
   */
  String getBraces();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getBraces <em>Braces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Braces</em>' attribute.
   * @see #getBraces()
   * @generated
   */
  void setBraces(String value);

  /**
   * Returns the value of the '<em><b>Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parenthesis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthesis</em>' attribute.
   * @see #setParenthesis(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrecedence_Parenthesis()
   * @model
   * @generated
   */
  String getParenthesis();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.Precedence#getParenthesis <em>Parenthesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parenthesis</em>' attribute.
   * @see #getParenthesis()
   * @generated
   */
  void setParenthesis(String value);

} // Precedence

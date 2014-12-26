/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.euclideanspace.xgener.gen.GenFactory
 * @model kind="package"
 * @generated
 */
public interface GenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/xgener/Gen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenPackage eINSTANCE = com.euclideanspace.xgener.gen.impl.GenPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ModelImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Clas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLAS = 0;

  /**
   * The feature id for the '<em><b>Proc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROC = 1;

  /**
   * The feature id for the '<em><b>Statem</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEM = 2;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXP = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl <em>Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ClassTypeImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getClassType()
   * @generated
   */
  int CLASS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Noclass</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__NOCLASS = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__SUFFIX = 3;

  /**
   * The feature id for the '<em><b>Blocking</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__BLOCKING = 4;

  /**
   * The number of structural features of the '<em>Class Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ProcedureImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__SUFFIX = 2;

  /**
   * The feature id for the '<em><b>Types</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__TYPES = 3;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.StatementImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Rep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__REP = 1;

  /**
   * The feature id for the '<em><b>Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__UNTIL = 2;

  /**
   * The feature id for the '<em><b>While</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILE = 3;

  /**
   * The feature id for the '<em><b>Do</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DO = 4;

  /**
   * The feature id for the '<em><b>For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOR = 5;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VAR = 6;

  /**
   * The feature id for the '<em><b>Ex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EX = 7;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VAL = 8;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ExpressionImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Prec</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PREC = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl <em>Precedence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.PrecedenceImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrecedence()
   * @generated
   */
  int PRECEDENCE = 5;

  /**
   * The feature id for the '<em><b>Ruletyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__RULETYP = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__RULE = 1;

  /**
   * The feature id for the '<em><b>Feature1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__FEATURE1 = 2;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PREFIX = 3;

  /**
   * The feature id for the '<em><b>Par1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PAR1 = 4;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__SUFFIX = 5;

  /**
   * The feature id for the '<em><b>Infix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__INFIX = 6;

  /**
   * The feature id for the '<em><b>Feature2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__FEATURE2 = 7;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PAR2 = 8;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__INNER = 9;

  /**
   * The feature id for the '<em><b>Infixleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__INFIXLEFT = 10;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__LITERAL = 11;

  /**
   * The feature id for the '<em><b>Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__BRACKET = 12;

  /**
   * The feature id for the '<em><b>Braces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__BRACES = 13;

  /**
   * The feature id for the '<em><b>Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PARENTHESIS = 14;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__ANGLE = 15;

  /**
   * The number of structural features of the '<em>Precedence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl <em>Inner Precedence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getInnerPrecedence()
   * @generated
   */
  int INNER_PRECEDENCE = 6;

  /**
   * The feature id for the '<em><b>Ruletyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__RULETYP = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Feature1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__FEATURE1 = 2;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__PAR2 = 3;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__SUFFIX = 4;

  /**
   * The feature id for the '<em><b>Mod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__MOD = 5;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__RULE = 6;

  /**
   * The feature id for the '<em><b>Infix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__INFIX = 7;

  /**
   * The feature id for the '<em><b>Feature2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__FEATURE2 = 8;

  /**
   * The feature id for the '<em><b>Infixleft</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__INFIXLEFT = 9;

  /**
   * The feature id for the '<em><b>Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__BRACKET = 10;

  /**
   * The feature id for the '<em><b>Braces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__BRACES = 11;

  /**
   * The feature id for the '<em><b>Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__PARENTHESIS = 12;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__ANGLE = 13;

  /**
   * The number of structural features of the '<em>Inner Precedence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.MultIDImpl <em>Mult ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.MultIDImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getMultID()
   * @generated
   */
  int MULT_ID = 7;

  /**
   * The feature id for the '<em><b>Mi</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_ID__MI = 0;

  /**
   * The number of structural features of the '<em>Mult ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.MultStringImpl <em>Mult String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.MultStringImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getMultString()
   * @generated
   */
  int MULT_STRING = 8;

  /**
   * The feature id for the '<em><b>Ms</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING__MS = 0;

  /**
   * The number of structural features of the '<em>Mult String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.xgener.gen.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getClas <em>Clas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clas</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getClas()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Clas();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getProc <em>Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proc</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getProc()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Proc();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getStatem <em>Statem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statem</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getStatem()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statem();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getExp()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Exp();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.ClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Type</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType
   * @generated
   */
  EClass getClassType();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.ClassType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getName()
   * @see #getClassType()
   * @generated
   */
  EAttribute getClassType_Name();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.ClassType#getNoclass <em>Noclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Noclass</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getNoclass()
   * @see #getClassType()
   * @generated
   */
  EAttribute getClassType_Noclass();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.ClassType#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getPrefix()
   * @see #getClassType()
   * @generated
   */
  EReference getClassType_Prefix();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.ClassType#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getSuffix()
   * @see #getClassType()
   * @generated
   */
  EReference getClassType_Suffix();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.ClassType#getBlocking <em>Blocking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Blocking</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getBlocking()
   * @see #getClassType()
   * @generated
   */
  EAttribute getClassType_Blocking();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Procedure#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure#getPrefix()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Prefix();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Procedure#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure#getSuffix()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Suffix();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.Procedure#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Types</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure#getTypes()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Types();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see com.euclideanspace.xgener.gen.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getRep <em>Rep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rep</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getRep()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Rep();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getUntil <em>Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Until</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getUntil()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Until();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>While</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getWhile()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_While();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getDo <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Do</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getDo()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Do();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getFor <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>For</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getFor()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_For();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getVar()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Var();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ex</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getEx()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Ex();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Statement#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see com.euclideanspace.xgener.gen.Statement#getVal()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Val();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.euclideanspace.xgener.gen.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.Expression#getName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Expression#getPrec <em>Prec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prec</em>'.
   * @see com.euclideanspace.xgener.gen.Expression#getPrec()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Prec();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Precedence <em>Precedence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precedence</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence
   * @generated
   */
  EClass getPrecedence();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getRuletyp <em>Ruletyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ruletyp</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getRuletyp()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Ruletyp();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getRule()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getFeature1 <em>Feature1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature1</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getFeature1()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Feature1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.Precedence#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getPrefix()
   * @see #getPrecedence()
   * @generated
   */
  EReference getPrecedence_Prefix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getPar1 <em>Par1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par1</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getPar1()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Par1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.Precedence#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getSuffix()
   * @see #getPrecedence()
   * @generated
   */
  EReference getPrecedence_Suffix();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.Precedence#getInfix <em>Infix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infix</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getInfix()
   * @see #getPrecedence()
   * @generated
   */
  EReference getPrecedence_Infix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getFeature2 <em>Feature2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature2</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getFeature2()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Feature2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getPar2 <em>Par2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par2</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getPar2()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Par2();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Precedence#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getInner()
   * @see #getPrecedence()
   * @generated
   */
  EReference getPrecedence_Inner();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.Precedence#getInfixleft <em>Infixleft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infixleft</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getInfixleft()
   * @see #getPrecedence()
   * @generated
   */
  EReference getPrecedence_Infixleft();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getLiteral()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Literal();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getBracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bracket</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getBracket()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Bracket();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getBraces <em>Braces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Braces</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getBraces()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Braces();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getParenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parenthesis</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getParenthesis()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Parenthesis();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getAngle()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Angle();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.InnerPrecedence <em>Inner Precedence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Precedence</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence
   * @generated
   */
  EClass getInnerPrecedence();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getRuletyp <em>Ruletyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ruletyp</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getRuletyp()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Ruletyp();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getPrefix()
   * @see #getInnerPrecedence()
   * @generated
   */
  EReference getInnerPrecedence_Prefix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getFeature1 <em>Feature1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature1</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getFeature1()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Feature1();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getPar2 <em>Par2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par2</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getPar2()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Par2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getSuffix()
   * @see #getInnerPrecedence()
   * @generated
   */
  EReference getInnerPrecedence_Suffix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mod</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getMod()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Mod();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getRule()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Rule();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getInfix <em>Infix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infix</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getInfix()
   * @see #getInnerPrecedence()
   * @generated
   */
  EReference getInnerPrecedence_Infix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getFeature2 <em>Feature2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature2</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getFeature2()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Feature2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getInfixleft <em>Infixleft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infixleft</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getInfixleft()
   * @see #getInnerPrecedence()
   * @generated
   */
  EReference getInnerPrecedence_Infixleft();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getBracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bracket</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getBracket()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Bracket();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getBraces <em>Braces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Braces</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getBraces()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Braces();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getParenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parenthesis</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getParenthesis()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Parenthesis();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getAngle()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Angle();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.MultID <em>Mult ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult ID</em>'.
   * @see com.euclideanspace.xgener.gen.MultID
   * @generated
   */
  EClass getMultID();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.MultID#getMi <em>Mi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mi</em>'.
   * @see com.euclideanspace.xgener.gen.MultID#getMi()
   * @see #getMultID()
   * @generated
   */
  EAttribute getMultID_Mi();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.MultString <em>Mult String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult String</em>'.
   * @see com.euclideanspace.xgener.gen.MultString
   * @generated
   */
  EClass getMultString();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.MultString#getMs <em>Ms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ms</em>'.
   * @see com.euclideanspace.xgener.gen.MultString#getMs()
   * @see #getMultString()
   * @generated
   */
  EAttribute getMultString_Ms();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GenFactory getGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.ModelImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Clas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CLAS = eINSTANCE.getModel_Clas();

    /**
     * The meta object literal for the '<em><b>Proc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROC = eINSTANCE.getModel_Proc();

    /**
     * The meta object literal for the '<em><b>Statem</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEM = eINSTANCE.getModel_Statem();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXP = eINSTANCE.getModel_Exp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl <em>Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.ClassTypeImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getClassType()
     * @generated
     */
    EClass CLASS_TYPE = eINSTANCE.getClassType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_TYPE__NAME = eINSTANCE.getClassType_Name();

    /**
     * The meta object literal for the '<em><b>Noclass</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_TYPE__NOCLASS = eINSTANCE.getClassType_Noclass();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_TYPE__PREFIX = eINSTANCE.getClassType_Prefix();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_TYPE__SUFFIX = eINSTANCE.getClassType_Suffix();

    /**
     * The meta object literal for the '<em><b>Blocking</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_TYPE__BLOCKING = eINSTANCE.getClassType_Blocking();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.ProcedureImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__PREFIX = eINSTANCE.getProcedure_Prefix();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__SUFFIX = eINSTANCE.getProcedure_Suffix();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__TYPES = eINSTANCE.getProcedure_Types();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.StatementImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '<em><b>Rep</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__REP = eINSTANCE.getStatement_Rep();

    /**
     * The meta object literal for the '<em><b>Until</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__UNTIL = eINSTANCE.getStatement_Until();

    /**
     * The meta object literal for the '<em><b>While</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__WHILE = eINSTANCE.getStatement_While();

    /**
     * The meta object literal for the '<em><b>Do</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__DO = eINSTANCE.getStatement_Do();

    /**
     * The meta object literal for the '<em><b>For</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__FOR = eINSTANCE.getStatement_For();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__VAR = eINSTANCE.getStatement_Var();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__EX = eINSTANCE.getStatement_Ex();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__VAL = eINSTANCE.getStatement_Val();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.ExpressionImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

    /**
     * The meta object literal for the '<em><b>Prec</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PREC = eINSTANCE.getExpression_Prec();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.PrecedenceImpl <em>Precedence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.PrecedenceImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrecedence()
     * @generated
     */
    EClass PRECEDENCE = eINSTANCE.getPrecedence();

    /**
     * The meta object literal for the '<em><b>Ruletyp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__RULETYP = eINSTANCE.getPrecedence_Ruletyp();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__RULE = eINSTANCE.getPrecedence_Rule();

    /**
     * The meta object literal for the '<em><b>Feature1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__FEATURE1 = eINSTANCE.getPrecedence_Feature1();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECEDENCE__PREFIX = eINSTANCE.getPrecedence_Prefix();

    /**
     * The meta object literal for the '<em><b>Par1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__PAR1 = eINSTANCE.getPrecedence_Par1();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECEDENCE__SUFFIX = eINSTANCE.getPrecedence_Suffix();

    /**
     * The meta object literal for the '<em><b>Infix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECEDENCE__INFIX = eINSTANCE.getPrecedence_Infix();

    /**
     * The meta object literal for the '<em><b>Feature2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__FEATURE2 = eINSTANCE.getPrecedence_Feature2();

    /**
     * The meta object literal for the '<em><b>Par2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__PAR2 = eINSTANCE.getPrecedence_Par2();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECEDENCE__INNER = eINSTANCE.getPrecedence_Inner();

    /**
     * The meta object literal for the '<em><b>Infixleft</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECEDENCE__INFIXLEFT = eINSTANCE.getPrecedence_Infixleft();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__LITERAL = eINSTANCE.getPrecedence_Literal();

    /**
     * The meta object literal for the '<em><b>Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__BRACKET = eINSTANCE.getPrecedence_Bracket();

    /**
     * The meta object literal for the '<em><b>Braces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__BRACES = eINSTANCE.getPrecedence_Braces();

    /**
     * The meta object literal for the '<em><b>Parenthesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__PARENTHESIS = eINSTANCE.getPrecedence_Parenthesis();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__ANGLE = eINSTANCE.getPrecedence_Angle();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl <em>Inner Precedence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getInnerPrecedence()
     * @generated
     */
    EClass INNER_PRECEDENCE = eINSTANCE.getInnerPrecedence();

    /**
     * The meta object literal for the '<em><b>Ruletyp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__RULETYP = eINSTANCE.getInnerPrecedence_Ruletyp();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_PRECEDENCE__PREFIX = eINSTANCE.getInnerPrecedence_Prefix();

    /**
     * The meta object literal for the '<em><b>Feature1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__FEATURE1 = eINSTANCE.getInnerPrecedence_Feature1();

    /**
     * The meta object literal for the '<em><b>Par2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__PAR2 = eINSTANCE.getInnerPrecedence_Par2();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_PRECEDENCE__SUFFIX = eINSTANCE.getInnerPrecedence_Suffix();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__MOD = eINSTANCE.getInnerPrecedence_Mod();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__RULE = eINSTANCE.getInnerPrecedence_Rule();

    /**
     * The meta object literal for the '<em><b>Infix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_PRECEDENCE__INFIX = eINSTANCE.getInnerPrecedence_Infix();

    /**
     * The meta object literal for the '<em><b>Feature2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__FEATURE2 = eINSTANCE.getInnerPrecedence_Feature2();

    /**
     * The meta object literal for the '<em><b>Infixleft</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INNER_PRECEDENCE__INFIXLEFT = eINSTANCE.getInnerPrecedence_Infixleft();

    /**
     * The meta object literal for the '<em><b>Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__BRACKET = eINSTANCE.getInnerPrecedence_Bracket();

    /**
     * The meta object literal for the '<em><b>Braces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__BRACES = eINSTANCE.getInnerPrecedence_Braces();

    /**
     * The meta object literal for the '<em><b>Parenthesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__PARENTHESIS = eINSTANCE.getInnerPrecedence_Parenthesis();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__ANGLE = eINSTANCE.getInnerPrecedence_Angle();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.MultIDImpl <em>Mult ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.MultIDImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getMultID()
     * @generated
     */
    EClass MULT_ID = eINSTANCE.getMultID();

    /**
     * The meta object literal for the '<em><b>Mi</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_ID__MI = eINSTANCE.getMultID_Mi();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.MultStringImpl <em>Mult String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.MultStringImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getMultString()
     * @generated
     */
    EClass MULT_STRING = eINSTANCE.getMultString();

    /**
     * The meta object literal for the '<em><b>Ms</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_STRING__MS = eINSTANCE.getMultString_Ms();

  }

} //GenPackage

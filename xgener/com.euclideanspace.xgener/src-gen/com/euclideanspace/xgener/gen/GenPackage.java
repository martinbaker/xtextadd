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
   * The feature id for the '<em><b>Prefix</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute list.
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
   * The feature id for the '<em><b>Prefix</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute list.
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
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.PrecidenceImpl <em>Precidence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.PrecidenceImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrecidence()
   * @generated
   */
  int PRECIDENCE = 5;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__RULE = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Par1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__PAR1 = 2;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__SUFFIX = 3;

  /**
   * The feature id for the '<em><b>Infix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__INFIX = 4;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__PAR2 = 5;

  /**
   * The feature id for the '<em><b>Infixleft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__INFIXLEFT = 6;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__LITERAL = 7;

  /**
   * The feature id for the '<em><b>Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__BRACKET = 8;

  /**
   * The feature id for the '<em><b>Braces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__BRACES = 9;

  /**
   * The feature id for the '<em><b>Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE__PARENTHESIS = 10;

  /**
   * The number of structural features of the '<em>Precidence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECIDENCE_FEATURE_COUNT = 11;


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
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.ClassType#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getPrefix()
   * @see #getClassType()
   * @generated
   */
  EAttribute getClassType_Prefix();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.ClassType#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.ClassType#getSuffix()
   * @see #getClassType()
   * @generated
   */
  EAttribute getClassType_Suffix();

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
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.Procedure#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure#getPrefix()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Prefix();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.Procedure#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.Procedure#getSuffix()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Suffix();

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
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Precidence <em>Precidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precidence</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence
   * @generated
   */
  EClass getPrecidence();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getRule()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getPrefix()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Prefix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getPar1 <em>Par1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par1</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getPar1()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Par1();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getSuffix()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Suffix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getInfix <em>Infix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infix</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getInfix()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Infix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getPar2 <em>Par2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par2</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getPar2()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Par2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getInfixleft <em>Infixleft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infixleft</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getInfixleft()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Infixleft();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getLiteral()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Literal();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getBracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bracket</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getBracket()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Bracket();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getBraces <em>Braces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Braces</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getBraces()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Braces();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precidence#getParenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parenthesis</em>'.
   * @see com.euclideanspace.xgener.gen.Precidence#getParenthesis()
   * @see #getPrecidence()
   * @generated
   */
  EAttribute getPrecidence_Parenthesis();

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
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_TYPE__PREFIX = eINSTANCE.getClassType_Prefix();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_TYPE__SUFFIX = eINSTANCE.getClassType_Suffix();

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
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__PREFIX = eINSTANCE.getProcedure_Prefix();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__SUFFIX = eINSTANCE.getProcedure_Suffix();

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
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.PrecidenceImpl <em>Precidence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.PrecidenceImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrecidence()
     * @generated
     */
    EClass PRECIDENCE = eINSTANCE.getPrecidence();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__RULE = eINSTANCE.getPrecidence_Rule();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__PREFIX = eINSTANCE.getPrecidence_Prefix();

    /**
     * The meta object literal for the '<em><b>Par1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__PAR1 = eINSTANCE.getPrecidence_Par1();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__SUFFIX = eINSTANCE.getPrecidence_Suffix();

    /**
     * The meta object literal for the '<em><b>Infix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__INFIX = eINSTANCE.getPrecidence_Infix();

    /**
     * The meta object literal for the '<em><b>Par2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__PAR2 = eINSTANCE.getPrecidence_Par2();

    /**
     * The meta object literal for the '<em><b>Infixleft</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__INFIXLEFT = eINSTANCE.getPrecidence_Infixleft();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__LITERAL = eINSTANCE.getPrecidence_Literal();

    /**
     * The meta object literal for the '<em><b>Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__BRACKET = eINSTANCE.getPrecidence_Bracket();

    /**
     * The meta object literal for the '<em><b>Braces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__BRACES = eINSTANCE.getPrecidence_Braces();

    /**
     * The meta object literal for the '<em><b>Parenthesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECIDENCE__PARENTHESIS = eINSTANCE.getPrecidence_Parenthesis();

  }

} //GenPackage

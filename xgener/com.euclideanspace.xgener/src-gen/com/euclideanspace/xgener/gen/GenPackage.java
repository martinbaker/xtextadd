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
   * The feature id for the '<em><b>Proj</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROJ = 0;

  /**
   * The feature id for the '<em><b>Clas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLAS = 1;

  /**
   * The feature id for the '<em><b>Proc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROC = 2;

  /**
   * The feature id for the '<em><b>Prim</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PRIM = 3;

  /**
   * The feature id for the '<em><b>Lit</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LIT = 4;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXP = 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ProjectImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Proj</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROJ = 1;

  /**
   * The feature id for the '<em><b>Nam</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAM = 2;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ClassTypeImpl <em>Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ClassTypeImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getClassType()
   * @generated
   */
  int CLASS_TYPE = 2;

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
  int PROCEDURE = 3;

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
   * The feature id for the '<em><b>Customrule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__CUSTOMRULE = 3;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PREFIX = 4;

  /**
   * The feature id for the '<em><b>Par1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PAR1 = 5;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__SUFFIX = 6;

  /**
   * The feature id for the '<em><b>Infix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__INFIX = 7;

  /**
   * The feature id for the '<em><b>Feature2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__FEATURE2 = 8;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PAR2 = 9;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__INNER = 10;

  /**
   * The feature id for the '<em><b>Prec</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDENCE__PREC = 11;

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
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl <em>Sub Precedence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getSubPrecedence()
   * @generated
   */
  int SUB_PRECEDENCE = 6;

  /**
   * The feature id for the '<em><b>Ruletyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__RULETYP = 0;

  /**
   * The feature id for the '<em><b>Customrule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__CUSTOMRULE = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Feature1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__FEATURE1 = 3;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__PAR2 = 4;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__SUFFIX = 5;

  /**
   * The feature id for the '<em><b>Par1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__PAR1 = 6;

  /**
   * The feature id for the '<em><b>Infix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__INFIX = 7;

  /**
   * The feature id for the '<em><b>Feature2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__FEATURE2 = 8;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__RULE = 9;

  /**
   * The feature id for the '<em><b>Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__BRACKET = 10;

  /**
   * The feature id for the '<em><b>Braces</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__BRACES = 11;

  /**
   * The feature id for the '<em><b>Parenthesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__PARENTHESIS = 12;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE__ANGLE = 13;

  /**
   * The number of structural features of the '<em>Sub Precedence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_PRECEDENCE_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl <em>Inner Precedence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.InnerPrecedenceImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getInnerPrecedence()
   * @generated
   */
  int INNER_PRECEDENCE = 7;

  /**
   * The feature id for the '<em><b>Ruletyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__RULETYP = 0;

  /**
   * The feature id for the '<em><b>Customrule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__CUSTOMRULE = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Feature1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__FEATURE1 = 3;

  /**
   * The feature id for the '<em><b>Par2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__PAR2 = 4;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__SUFFIX = 5;

  /**
   * The feature id for the '<em><b>Mod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__MOD = 6;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__RULE = 7;

  /**
   * The feature id for the '<em><b>Infix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__INFIX = 8;

  /**
   * The feature id for the '<em><b>Feature2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_PRECEDENCE__FEATURE2 = 9;

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
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.QualifiedNameImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 8;

  /**
   * The feature id for the '<em><b>Qn</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__QN = 0;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.MultStringImpl <em>Mult String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.MultStringImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getMultString()
   * @generated
   */
  int MULT_STRING = 9;

  /**
   * The feature id for the '<em><b>Ms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING__MS = 0;

  /**
   * The feature id for the '<em><b>Opt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING__OPT = 1;

  /**
   * The feature id for the '<em><b>Mi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING__MI = 2;

  /**
   * The feature id for the '<em><b>Synpred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING__SYNPRED = 3;

  /**
   * The feature id for the '<em><b>Cs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING__CS = 4;

  /**
   * The number of structural features of the '<em>Mult String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_STRING_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.ComboStringImpl <em>Combo String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.ComboStringImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getComboString()
   * @generated
   */
  int COMBO_STRING = 10;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_STRING__INNER = 0;

  /**
   * The number of structural features of the '<em>Combo String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.PrimaryImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__NAME = 0;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__INNER = 1;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl <em>Primary Inner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrimaryInner()
   * @generated
   */
  int PRIMARY_INNER = 12;

  /**
   * The feature id for the '<em><b>Primarytyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_INNER__PRIMARYTYP = 0;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_INNER__CONSTRUCT = 1;

  /**
   * The feature id for the '<em><b>Construct2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_INNER__CONSTRUCT2 = 2;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_INNER__FEATURE = 3;

  /**
   * The number of structural features of the '<em>Primary Inner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_INNER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.LiteralImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__INNER = 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.xgener.gen.impl.LiteralInnerImpl <em>Literal Inner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.xgener.gen.impl.LiteralInnerImpl
   * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getLiteralInner()
   * @generated
   */
  int LITERAL_INNER = 14;

  /**
   * The feature id for the '<em><b>Primarytyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INNER__PRIMARYTYP = 0;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INNER__CONSTRUCT = 1;

  /**
   * The number of structural features of the '<em>Literal Inner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INNER_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getProj <em>Proj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proj</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getProj()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Proj();

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
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getPrim <em>Prim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prim</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getPrim()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Prim();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Model#getLit <em>Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lit</em>'.
   * @see com.euclideanspace.xgener.gen.Model#getLit()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Lit();

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
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see com.euclideanspace.xgener.gen.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Project#getProj <em>Proj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Proj</em>'.
   * @see com.euclideanspace.xgener.gen.Project#getProj()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Proj();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Project#getNam <em>Nam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nam</em>'.
   * @see com.euclideanspace.xgener.gen.Project#getNam()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Nam();

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
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Precedence#getCustomrule <em>Customrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customrule</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getCustomrule()
   * @see #getPrecedence()
   * @generated
   */
  EAttribute getPrecedence_Customrule();

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
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Precedence#getPrec <em>Prec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prec</em>'.
   * @see com.euclideanspace.xgener.gen.Precedence#getPrec()
   * @see #getPrecedence()
   * @generated
   */
  EReference getPrecedence_Prec();

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
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.SubPrecedence <em>Sub Precedence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Precedence</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence
   * @generated
   */
  EClass getSubPrecedence();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getRuletyp <em>Ruletyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ruletyp</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getRuletyp()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Ruletyp();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getCustomrule <em>Customrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customrule</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getCustomrule()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Customrule();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.SubPrecedence#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getPrefix()
   * @see #getSubPrecedence()
   * @generated
   */
  EReference getSubPrecedence_Prefix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getFeature1 <em>Feature1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature1</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getFeature1()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Feature1();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getPar2 <em>Par2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par2</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getPar2()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Par2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.SubPrecedence#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suffix</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getSuffix()
   * @see #getSubPrecedence()
   * @generated
   */
  EReference getSubPrecedence_Suffix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getPar1 <em>Par1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par1</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getPar1()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Par1();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.SubPrecedence#getInfix <em>Infix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infix</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getInfix()
   * @see #getSubPrecedence()
   * @generated
   */
  EReference getSubPrecedence_Infix();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getFeature2 <em>Feature2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature2</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getFeature2()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Feature2();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getRule()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getBracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bracket</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getBracket()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Bracket();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getBraces <em>Braces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Braces</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getBraces()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Braces();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getParenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parenthesis</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getParenthesis()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Parenthesis();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.SubPrecedence#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see com.euclideanspace.xgener.gen.SubPrecedence#getAngle()
   * @see #getSubPrecedence()
   * @generated
   */
  EAttribute getSubPrecedence_Angle();

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
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.InnerPrecedence#getCustomrule <em>Customrule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customrule</em>'.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence#getCustomrule()
   * @see #getInnerPrecedence()
   * @generated
   */
  EAttribute getInnerPrecedence_Customrule();

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
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see com.euclideanspace.xgener.gen.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.xgener.gen.QualifiedName#getQn <em>Qn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Qn</em>'.
   * @see com.euclideanspace.xgener.gen.QualifiedName#getQn()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Qn();

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
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.MultString#getMs <em>Ms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ms</em>'.
   * @see com.euclideanspace.xgener.gen.MultString#getMs()
   * @see #getMultString()
   * @generated
   */
  EAttribute getMultString_Ms();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.MultString#isOpt <em>Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opt</em>'.
   * @see com.euclideanspace.xgener.gen.MultString#isOpt()
   * @see #getMultString()
   * @generated
   */
  EAttribute getMultString_Opt();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.MultString#getMi <em>Mi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mi</em>'.
   * @see com.euclideanspace.xgener.gen.MultString#getMi()
   * @see #getMultString()
   * @generated
   */
  EAttribute getMultString_Mi();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.MultString#getSynpred <em>Synpred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synpred</em>'.
   * @see com.euclideanspace.xgener.gen.MultString#getSynpred()
   * @see #getMultString()
   * @generated
   */
  EAttribute getMultString_Synpred();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.MultString#getCs <em>Cs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cs</em>'.
   * @see com.euclideanspace.xgener.gen.MultString#getCs()
   * @see #getMultString()
   * @generated
   */
  EReference getMultString_Cs();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.ComboString <em>Combo String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combo String</em>'.
   * @see com.euclideanspace.xgener.gen.ComboString
   * @generated
   */
  EClass getComboString();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.ComboString#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner</em>'.
   * @see com.euclideanspace.xgener.gen.ComboString#getInner()
   * @see #getComboString()
   * @generated
   */
  EReference getComboString_Inner();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see com.euclideanspace.xgener.gen.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Primary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.Primary#getName()
   * @see #getPrimary()
   * @generated
   */
  EAttribute getPrimary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Primary#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner</em>'.
   * @see com.euclideanspace.xgener.gen.Primary#getInner()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Inner();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.PrimaryInner <em>Primary Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Inner</em>'.
   * @see com.euclideanspace.xgener.gen.PrimaryInner
   * @generated
   */
  EClass getPrimaryInner();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.PrimaryInner#getPrimarytyp <em>Primarytyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primarytyp</em>'.
   * @see com.euclideanspace.xgener.gen.PrimaryInner#getPrimarytyp()
   * @see #getPrimaryInner()
   * @generated
   */
  EAttribute getPrimaryInner_Primarytyp();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.PrimaryInner#getConstruct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Construct</em>'.
   * @see com.euclideanspace.xgener.gen.PrimaryInner#getConstruct()
   * @see #getPrimaryInner()
   * @generated
   */
  EAttribute getPrimaryInner_Construct();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.PrimaryInner#getConstruct2 <em>Construct2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Construct2</em>'.
   * @see com.euclideanspace.xgener.gen.PrimaryInner#getConstruct2()
   * @see #getPrimaryInner()
   * @generated
   */
  EAttribute getPrimaryInner_Construct2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.xgener.gen.PrimaryInner#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see com.euclideanspace.xgener.gen.PrimaryInner#getFeature()
   * @see #getPrimaryInner()
   * @generated
   */
  EReference getPrimaryInner_Feature();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see com.euclideanspace.xgener.gen.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.Literal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.xgener.gen.Literal#getName()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.xgener.gen.Literal#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner</em>'.
   * @see com.euclideanspace.xgener.gen.Literal#getInner()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Inner();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.xgener.gen.LiteralInner <em>Literal Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Inner</em>'.
   * @see com.euclideanspace.xgener.gen.LiteralInner
   * @generated
   */
  EClass getLiteralInner();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.LiteralInner#getPrimarytyp <em>Primarytyp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primarytyp</em>'.
   * @see com.euclideanspace.xgener.gen.LiteralInner#getPrimarytyp()
   * @see #getLiteralInner()
   * @generated
   */
  EAttribute getLiteralInner_Primarytyp();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.xgener.gen.LiteralInner#getConstruct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Construct</em>'.
   * @see com.euclideanspace.xgener.gen.LiteralInner#getConstruct()
   * @see #getLiteralInner()
   * @generated
   */
  EAttribute getLiteralInner_Construct();

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
     * The meta object literal for the '<em><b>Proj</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROJ = eINSTANCE.getModel_Proj();

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
     * The meta object literal for the '<em><b>Prim</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PRIM = eINSTANCE.getModel_Prim();

    /**
     * The meta object literal for the '<em><b>Lit</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LIT = eINSTANCE.getModel_Lit();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXP = eINSTANCE.getModel_Exp();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.ProjectImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Proj</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PROJ = eINSTANCE.getProject_Proj();

    /**
     * The meta object literal for the '<em><b>Nam</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__NAM = eINSTANCE.getProject_Nam();

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
     * The meta object literal for the '<em><b>Customrule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECEDENCE__CUSTOMRULE = eINSTANCE.getPrecedence_Customrule();

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
     * The meta object literal for the '<em><b>Prec</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRECEDENCE__PREC = eINSTANCE.getPrecedence_Prec();

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
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl <em>Sub Precedence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.SubPrecedenceImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getSubPrecedence()
     * @generated
     */
    EClass SUB_PRECEDENCE = eINSTANCE.getSubPrecedence();

    /**
     * The meta object literal for the '<em><b>Ruletyp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__RULETYP = eINSTANCE.getSubPrecedence_Ruletyp();

    /**
     * The meta object literal for the '<em><b>Customrule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__CUSTOMRULE = eINSTANCE.getSubPrecedence_Customrule();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_PRECEDENCE__PREFIX = eINSTANCE.getSubPrecedence_Prefix();

    /**
     * The meta object literal for the '<em><b>Feature1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__FEATURE1 = eINSTANCE.getSubPrecedence_Feature1();

    /**
     * The meta object literal for the '<em><b>Par2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__PAR2 = eINSTANCE.getSubPrecedence_Par2();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_PRECEDENCE__SUFFIX = eINSTANCE.getSubPrecedence_Suffix();

    /**
     * The meta object literal for the '<em><b>Par1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__PAR1 = eINSTANCE.getSubPrecedence_Par1();

    /**
     * The meta object literal for the '<em><b>Infix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_PRECEDENCE__INFIX = eINSTANCE.getSubPrecedence_Infix();

    /**
     * The meta object literal for the '<em><b>Feature2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__FEATURE2 = eINSTANCE.getSubPrecedence_Feature2();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__RULE = eINSTANCE.getSubPrecedence_Rule();

    /**
     * The meta object literal for the '<em><b>Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__BRACKET = eINSTANCE.getSubPrecedence_Bracket();

    /**
     * The meta object literal for the '<em><b>Braces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__BRACES = eINSTANCE.getSubPrecedence_Braces();

    /**
     * The meta object literal for the '<em><b>Parenthesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__PARENTHESIS = eINSTANCE.getSubPrecedence_Parenthesis();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_PRECEDENCE__ANGLE = eINSTANCE.getSubPrecedence_Angle();

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
     * The meta object literal for the '<em><b>Customrule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_PRECEDENCE__CUSTOMRULE = eINSTANCE.getInnerPrecedence_Customrule();

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
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.QualifiedNameImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getQualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

    /**
     * The meta object literal for the '<em><b>Qn</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__QN = eINSTANCE.getQualifiedName_Qn();

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
     * The meta object literal for the '<em><b>Ms</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_STRING__MS = eINSTANCE.getMultString_Ms();

    /**
     * The meta object literal for the '<em><b>Opt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_STRING__OPT = eINSTANCE.getMultString_Opt();

    /**
     * The meta object literal for the '<em><b>Mi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_STRING__MI = eINSTANCE.getMultString_Mi();

    /**
     * The meta object literal for the '<em><b>Synpred</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULT_STRING__SYNPRED = eINSTANCE.getMultString_Synpred();

    /**
     * The meta object literal for the '<em><b>Cs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULT_STRING__CS = eINSTANCE.getMultString_Cs();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.ComboStringImpl <em>Combo String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.ComboStringImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getComboString()
     * @generated
     */
    EClass COMBO_STRING = eINSTANCE.getComboString();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMBO_STRING__INNER = eINSTANCE.getComboString_Inner();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.PrimaryImpl <em>Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.PrimaryImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrimary()
     * @generated
     */
    EClass PRIMARY = eINSTANCE.getPrimary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY__NAME = eINSTANCE.getPrimary_Name();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__INNER = eINSTANCE.getPrimary_Inner();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl <em>Primary Inner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getPrimaryInner()
     * @generated
     */
    EClass PRIMARY_INNER = eINSTANCE.getPrimaryInner();

    /**
     * The meta object literal for the '<em><b>Primarytyp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_INNER__PRIMARYTYP = eINSTANCE.getPrimaryInner_Primarytyp();

    /**
     * The meta object literal for the '<em><b>Construct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_INNER__CONSTRUCT = eINSTANCE.getPrimaryInner_Construct();

    /**
     * The meta object literal for the '<em><b>Construct2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_INNER__CONSTRUCT2 = eINSTANCE.getPrimaryInner_Construct2();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_INNER__FEATURE = eINSTANCE.getPrimaryInner_Feature();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.LiteralImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__INNER = eINSTANCE.getLiteral_Inner();

    /**
     * The meta object literal for the '{@link com.euclideanspace.xgener.gen.impl.LiteralInnerImpl <em>Literal Inner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.xgener.gen.impl.LiteralInnerImpl
     * @see com.euclideanspace.xgener.gen.impl.GenPackageImpl#getLiteralInner()
     * @generated
     */
    EClass LITERAL_INNER = eINSTANCE.getLiteralInner();

    /**
     * The meta object literal for the '<em><b>Primarytyp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_INNER__PRIMARYTYP = eINSTANCE.getLiteralInner_Primarytyp();

    /**
     * The meta object literal for the '<em><b>Construct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_INNER__CONSTRUCT = eINSTANCE.getLiteralInner_Construct();

  }

} //GenPackage

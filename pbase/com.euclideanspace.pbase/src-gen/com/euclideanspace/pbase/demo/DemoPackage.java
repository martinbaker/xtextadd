/**
 */
package com.euclideanspace.pbase.demo;

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
 * @see com.euclideanspace.pbase.demo.DemoFactory
 * @model kind="package"
 * @generated
 */
public interface DemoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "demo";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/pbase/Tutorial";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "demo";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DemoPackage eINSTANCE = com.euclideanspace.pbase.demo.impl.DemoPackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.ModelImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>M</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__M = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl <em>Euclid Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.EuclidMemberImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getEuclidMember()
   * @generated
   */
  int EUCLID_MEMBER = 1;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__EXTENSION = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__FINAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__NAME1 = 3;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__STATIC = 4;

  /**
   * The feature id for the '<em><b>Name2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__NAME2 = 5;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__INITIAL_VALUE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__NAME = 7;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__TYPE_PARAMETERS = 8;

  /**
   * The feature id for the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__EXTENDS = 9;

  /**
   * The feature id for the '<em><b>Implements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__IMPLEMENTS = 10;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__MEMBERS = 11;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__OVERRIDE = 12;

  /**
   * The feature id for the '<em><b>Dispatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__DISPATCH = 13;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__RETURN_TYPE = 14;

  /**
   * The feature id for the '<em><b>Name3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__NAME3 = 15;

  /**
   * The feature id for the '<em><b>Name4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__NAME4 = 16;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__PARAMETERS = 17;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__EXCEPTIONS = 18;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER__EXPRESSION = 19;

  /**
   * The number of structural features of the '<em>Euclid Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_MEMBER_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.EuclidParameterImpl <em>Euclid Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.EuclidParameterImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getEuclidParameter()
   * @generated
   */
  int EUCLID_PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__PARAMETER_TYPE = 0;

  /**
   * The feature id for the '<em><b>Var Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__VAR_ARG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Euclid Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUCLID_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XExpressionImpl <em>XExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXExpression()
   * @generated
   */
  int XEXPRESSION = 3;

  /**
   * The number of structural features of the '<em>XExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XCollectionLiteralImpl <em>XCollection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XCollectionLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCollectionLiteral()
   * @generated
   */
  int XCOLLECTION_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCOLLECTION_LITERAL__ELEMENTS = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XCollection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCOLLECTION_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XSetLiteralImpl <em>XSet Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XSetLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXSetLiteral()
   * @generated
   */
  int XSET_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSET_LITERAL__ELEMENTS = XCOLLECTION_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>XSet Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSET_LITERAL_FEATURE_COUNT = XCOLLECTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XListLiteralImpl <em>XList Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XListLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXListLiteral()
   * @generated
   */
  int XLIST_LITERAL = 6;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XLIST_LITERAL__ELEMENTS = XCOLLECTION_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>XList Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XLIST_LITERAL_FEATURE_COUNT = XCOLLECTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XCasePartImpl <em>XCase Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XCasePartImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCasePart()
   * @generated
   */
  int XCASE_PART = 7;

  /**
   * The feature id for the '<em><b>Type Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART__TYPE_GUARD = 0;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART__CASE = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART__THEN = 2;

  /**
   * The feature id for the '<em><b>Fall Through</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART__FALL_THROUGH = 3;

  /**
   * The number of structural features of the '<em>XCase Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XCatchClauseImpl <em>XCatch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XCatchClauseImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCatchClause()
   * @generated
   */
  int XCATCH_CLAUSE = 8;

  /**
   * The feature id for the '<em><b>Declared Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCATCH_CLAUSE__DECLARED_PARAM = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCATCH_CLAUSE__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>XCatch Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCATCH_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XAssignmentImpl <em>XAssignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XAssignmentImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXAssignment()
   * @generated
   */
  int XASSIGNMENT = 9;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSIGNMENT__FEATURE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSIGNMENT__VALUE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assignable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSIGNMENT__ASSIGNABLE = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Explicit Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSIGNMENT__EXPLICIT_STATIC = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XAssignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSIGNMENT_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XBinaryOperationImpl <em>XBinary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XBinaryOperationImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBinaryOperation()
   * @generated
   */
  int XBINARY_OPERATION = 10;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__LEFT_OPERAND = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__FEATURE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__RIGHT_OPERAND = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XBinary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XInstanceOfExpressionImpl <em>XInstance Of Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XInstanceOfExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXInstanceOfExpression()
   * @generated
   */
  int XINSTANCE_OF_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XINSTANCE_OF_EXPRESSION__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XINSTANCE_OF_EXPRESSION__TYPE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XInstance Of Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XINSTANCE_OF_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XUnaryOperationImpl <em>XUnary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XUnaryOperationImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXUnaryOperation()
   * @generated
   */
  int XUNARY_OPERATION = 12;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNARY_OPERATION__FEATURE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNARY_OPERATION__OPERAND = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XUnary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNARY_OPERATION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XCastedExpressionImpl <em>XCasted Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XCastedExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCastedExpression()
   * @generated
   */
  int XCASTED_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASTED_EXPRESSION__TARGET = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASTED_EXPRESSION__TYPE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XCasted Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASTED_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XPostfixOperationImpl <em>XPostfix Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XPostfixOperationImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXPostfixOperation()
   * @generated
   */
  int XPOSTFIX_OPERATION = 14;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPOSTFIX_OPERATION__OPERAND = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPOSTFIX_OPERATION__FEATURE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XPostfix Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPOSTFIX_OPERATION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl <em>XMember Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXMemberFeatureCall()
   * @generated
   */
  int XMEMBER_FEATURE_CALL = 15;

  /**
   * The feature id for the '<em><b>Member Call Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Null Safe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__NULL_SAFE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Explicit Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__EXPLICIT_STATIC = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__FEATURE = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL = XEXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Member Call Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>XMember Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMEMBER_FEATURE_CALL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XClosureImpl <em>XClosure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XClosureImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXClosure()
   * @generated
   */
  int XCLOSURE = 16;

  /**
   * The feature id for the '<em><b>Declared Formal Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCLOSURE__DECLARED_FORMAL_PARAMETERS = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Explicit Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCLOSURE__EXPLICIT_SYNTAX = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCLOSURE__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XClosure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCLOSURE_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XBlockExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBlockExpression()
   * @generated
   */
  int XBLOCK_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBLOCK_EXPRESSION__EXPRESSIONS = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XBlock Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBLOCK_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XIfExpressionImpl <em>XIf Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XIfExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXIfExpression()
   * @generated
   */
  int XIF_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__IF = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__THEN = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__ELSE = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XIf Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XSwitchExpressionImpl <em>XSwitch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XSwitchExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXSwitchExpression()
   * @generated
   */
  int XSWITCH_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Declared Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__DECLARED_PARAM = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__SWITCH = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__CASES = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__DEFAULT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XSwitch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl <em>XFor Loop Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXForLoopExpression()
   * @generated
   */
  int XFOR_LOOP_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Declared Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_LOOP_EXPRESSION__DECLARED_PARAM = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_LOOP_EXPRESSION__FOR_EXPRESSION = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_LOOP_EXPRESSION__EACH_EXPRESSION = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XFor Loop Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_LOOP_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XBasicForLoopExpressionImpl <em>XBasic For Loop Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XBasicForLoopExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBasicForLoopExpression()
   * @generated
   */
  int XBASIC_FOR_LOOP_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Init Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Update Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XBasic For Loop Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBASIC_FOR_LOOP_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XWhileExpressionImpl <em>XWhile Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XWhileExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXWhileExpression()
   * @generated
   */
  int XWHILE_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XWHILE_EXPRESSION__PREDICATE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XWHILE_EXPRESSION__BODY = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XWhile Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XWHILE_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XDoWhileExpressionImpl <em>XDo While Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XDoWhileExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXDoWhileExpression()
   * @generated
   */
  int XDO_WHILE_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDO_WHILE_EXPRESSION__BODY = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDO_WHILE_EXPRESSION__PREDICATE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XDo While Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDO_WHILE_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XVariableDeclarationImpl <em>XVariable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XVariableDeclarationImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXVariableDeclaration()
   * @generated
   */
  int XVARIABLE_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__WRITEABLE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__TYPE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__NAME = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__RIGHT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XVariable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XFeatureCallImpl <em>XFeature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XFeatureCallImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXFeatureCall()
   * @generated
   */
  int XFEATURE_CALL = 25;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFEATURE_CALL__TYPE_ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFEATURE_CALL__FEATURE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFEATURE_CALL__EXPLICIT_OPERATION_CALL = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Feature Call Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFEATURE_CALL__FEATURE_CALL_ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XFeature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFEATURE_CALL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XConstructorCallImpl <em>XConstructor Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XConstructorCallImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXConstructorCall()
   * @generated
   */
  int XCONSTRUCTOR_CALL = 26;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__CONSTRUCTOR = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__TYPE_ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Explicit Constructor Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XConstructor Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XBooleanLiteralImpl <em>XBoolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XBooleanLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBooleanLiteral()
   * @generated
   */
  int XBOOLEAN_LITERAL = 27;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOLEAN_LITERAL__IS_TRUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XBoolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOLEAN_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XNullLiteralImpl <em>XNull Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XNullLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXNullLiteral()
   * @generated
   */
  int XNULL_LITERAL = 28;

  /**
   * The number of structural features of the '<em>XNull Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNULL_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XNumberLiteralImpl <em>XNumber Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XNumberLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXNumberLiteral()
   * @generated
   */
  int XNUMBER_LITERAL = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL__VALUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XNumber Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XStringLiteralImpl <em>XString Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XStringLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXStringLiteral()
   * @generated
   */
  int XSTRING_LITERAL = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRING_LITERAL__VALUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XString Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRING_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XTypeLiteralImpl <em>XType Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XTypeLiteralImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXTypeLiteral()
   * @generated
   */
  int XTYPE_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTYPE_LITERAL__TYPE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTYPE_LITERAL__ARRAY_DIMENSIONS = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XType Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTYPE_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XThrowExpressionImpl <em>XThrow Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XThrowExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXThrowExpression()
   * @generated
   */
  int XTHROW_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTHROW_EXPRESSION__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XThrow Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTHROW_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XReturnExpressionImpl <em>XReturn Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XReturnExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXReturnExpression()
   * @generated
   */
  int XRETURN_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XRETURN_EXPRESSION__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XReturn Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XRETURN_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl <em>XTry Catch Finally Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXTryCatchFinallyExpression()
   * @generated
   */
  int XTRY_CATCH_FINALLY_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Catch Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Finally Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XTry Catch Finally Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTRY_CATCH_FINALLY_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.euclideanspace.pbase.demo.impl.XSynchronizedExpressionImpl <em>XSynchronized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.pbase.demo.impl.XSynchronizedExpressionImpl
   * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXSynchronizedExpression()
   * @generated
   */
  int XSYNCHRONIZED_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSYNCHRONIZED_EXPRESSION__PARAM = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSYNCHRONIZED_EXPRESSION__EXPRESSION = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XSynchronized Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSYNCHRONIZED_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.pbase.demo.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.Model#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>M</em>'.
   * @see com.euclideanspace.pbase.demo.Model#getM()
   * @see #getModel()
   * @generated
   */
  EReference getModel_M();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.EuclidMember <em>Euclid Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Member</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember
   * @generated
   */
  EClass getEuclidMember();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#isExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#isExtension()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Extension();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#isFinal()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Final();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getType()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Type();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getName1 <em>Name1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name1</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getName1()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Name1();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#isStatic()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Static();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getName2 <em>Name2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name2</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getName2()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Name2();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.EuclidMember#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getInitialValue()
   * @see #getEuclidMember()
   * @generated
   */
  EReference getEuclidMember_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getName()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Name();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.EuclidMember#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Parameters</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getTypeParameters()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_TypeParameters();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extends</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getExtends()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Extends();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.EuclidMember#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Implements</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getImplements()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.EuclidMember#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getMembers()
   * @see #getEuclidMember()
   * @generated
   */
  EReference getEuclidMember_Members();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#isOverride()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Override();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#isDispatch <em>Dispatch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dispatch</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#isDispatch()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Dispatch();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getReturnType()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getName3 <em>Name3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name3</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getName3()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Name3();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidMember#getName4 <em>Name4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name4</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getName4()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Name4();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.EuclidMember#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getParameters()
   * @see #getEuclidMember()
   * @generated
   */
  EReference getEuclidMember_Parameters();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.EuclidMember#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exceptions</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getExceptions()
   * @see #getEuclidMember()
   * @generated
   */
  EAttribute getEuclidMember_Exceptions();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.EuclidMember#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidMember#getExpression()
   * @see #getEuclidMember()
   * @generated
   */
  EReference getEuclidMember_Expression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.EuclidParameter <em>Euclid Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Euclid Parameter</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidParameter
   * @generated
   */
  EClass getEuclidParameter();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidParameter#getParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Type</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidParameter#getParameterType()
   * @see #getEuclidParameter()
   * @generated
   */
  EAttribute getEuclidParameter_ParameterType();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidParameter#isVarArg <em>Var Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Arg</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidParameter#isVarArg()
   * @see #getEuclidParameter()
   * @generated
   */
  EAttribute getEuclidParameter_VarArg();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.EuclidParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.pbase.demo.EuclidParameter#getName()
   * @see #getEuclidParameter()
   * @generated
   */
  EAttribute getEuclidParameter_Name();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression</em>'.
   * @see com.euclideanspace.pbase.demo.XExpression
   * @generated
   */
  EClass getXExpression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XCollectionLiteral <em>XCollection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XCollection Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XCollectionLiteral
   * @generated
   */
  EClass getXCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XCollectionLiteral#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.euclideanspace.pbase.demo.XCollectionLiteral#getElements()
   * @see #getXCollectionLiteral()
   * @generated
   */
  EReference getXCollectionLiteral_Elements();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XSetLiteral <em>XSet Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSet Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XSetLiteral
   * @generated
   */
  EClass getXSetLiteral();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XListLiteral <em>XList Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XList Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XListLiteral
   * @generated
   */
  EClass getXListLiteral();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XCasePart <em>XCase Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XCase Part</em>'.
   * @see com.euclideanspace.pbase.demo.XCasePart
   * @generated
   */
  EClass getXCasePart();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XCasePart#getTypeGuard <em>Type Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Guard</em>'.
   * @see com.euclideanspace.pbase.demo.XCasePart#getTypeGuard()
   * @see #getXCasePart()
   * @generated
   */
  EAttribute getXCasePart_TypeGuard();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XCasePart#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case</em>'.
   * @see com.euclideanspace.pbase.demo.XCasePart#getCase()
   * @see #getXCasePart()
   * @generated
   */
  EReference getXCasePart_Case();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XCasePart#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.euclideanspace.pbase.demo.XCasePart#getThen()
   * @see #getXCasePart()
   * @generated
   */
  EReference getXCasePart_Then();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XCasePart#isFallThrough <em>Fall Through</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fall Through</em>'.
   * @see com.euclideanspace.pbase.demo.XCasePart#isFallThrough()
   * @see #getXCasePart()
   * @generated
   */
  EAttribute getXCasePart_FallThrough();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XCatchClause <em>XCatch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XCatch Clause</em>'.
   * @see com.euclideanspace.pbase.demo.XCatchClause
   * @generated
   */
  EClass getXCatchClause();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XCatchClause#getDeclaredParam <em>Declared Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Param</em>'.
   * @see com.euclideanspace.pbase.demo.XCatchClause#getDeclaredParam()
   * @see #getXCatchClause()
   * @generated
   */
  EAttribute getXCatchClause_DeclaredParam();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XCatchClause#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XCatchClause#getExpression()
   * @see #getXCatchClause()
   * @generated
   */
  EReference getXCatchClause_Expression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XAssignment <em>XAssignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XAssignment</em>'.
   * @see com.euclideanspace.pbase.demo.XAssignment
   * @generated
   */
  EClass getXAssignment();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XAssignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.euclideanspace.pbase.demo.XAssignment#getFeature()
   * @see #getXAssignment()
   * @generated
   */
  EAttribute getXAssignment_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.euclideanspace.pbase.demo.XAssignment#getValue()
   * @see #getXAssignment()
   * @generated
   */
  EReference getXAssignment_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XAssignment#getAssignable <em>Assignable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignable</em>'.
   * @see com.euclideanspace.pbase.demo.XAssignment#getAssignable()
   * @see #getXAssignment()
   * @generated
   */
  EReference getXAssignment_Assignable();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XAssignment#isExplicitStatic <em>Explicit Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Static</em>'.
   * @see com.euclideanspace.pbase.demo.XAssignment#isExplicitStatic()
   * @see #getXAssignment()
   * @generated
   */
  EAttribute getXAssignment_ExplicitStatic();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XBinaryOperation <em>XBinary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBinary Operation</em>'.
   * @see com.euclideanspace.pbase.demo.XBinaryOperation
   * @generated
   */
  EClass getXBinaryOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see com.euclideanspace.pbase.demo.XBinaryOperation#getLeftOperand()
   * @see #getXBinaryOperation()
   * @generated
   */
  EReference getXBinaryOperation_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XBinaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.euclideanspace.pbase.demo.XBinaryOperation#getFeature()
   * @see #getXBinaryOperation()
   * @generated
   */
  EAttribute getXBinaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XBinaryOperation#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see com.euclideanspace.pbase.demo.XBinaryOperation#getRightOperand()
   * @see #getXBinaryOperation()
   * @generated
   */
  EReference getXBinaryOperation_RightOperand();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XInstanceOfExpression <em>XInstance Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XInstance Of Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XInstanceOfExpression
   * @generated
   */
  EClass getXInstanceOfExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XInstanceOfExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XInstanceOfExpression#getExpression()
   * @see #getXInstanceOfExpression()
   * @generated
   */
  EReference getXInstanceOfExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XInstanceOfExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.euclideanspace.pbase.demo.XInstanceOfExpression#getType()
   * @see #getXInstanceOfExpression()
   * @generated
   */
  EAttribute getXInstanceOfExpression_Type();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XUnaryOperation <em>XUnary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XUnary Operation</em>'.
   * @see com.euclideanspace.pbase.demo.XUnaryOperation
   * @generated
   */
  EClass getXUnaryOperation();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XUnaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.euclideanspace.pbase.demo.XUnaryOperation#getFeature()
   * @see #getXUnaryOperation()
   * @generated
   */
  EAttribute getXUnaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XUnaryOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.euclideanspace.pbase.demo.XUnaryOperation#getOperand()
   * @see #getXUnaryOperation()
   * @generated
   */
  EReference getXUnaryOperation_Operand();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XCastedExpression <em>XCasted Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XCasted Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XCastedExpression
   * @generated
   */
  EClass getXCastedExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XCastedExpression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.euclideanspace.pbase.demo.XCastedExpression#getTarget()
   * @see #getXCastedExpression()
   * @generated
   */
  EReference getXCastedExpression_Target();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XCastedExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.euclideanspace.pbase.demo.XCastedExpression#getType()
   * @see #getXCastedExpression()
   * @generated
   */
  EAttribute getXCastedExpression_Type();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XPostfixOperation <em>XPostfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XPostfix Operation</em>'.
   * @see com.euclideanspace.pbase.demo.XPostfixOperation
   * @generated
   */
  EClass getXPostfixOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XPostfixOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.euclideanspace.pbase.demo.XPostfixOperation#getOperand()
   * @see #getXPostfixOperation()
   * @generated
   */
  EReference getXPostfixOperation_Operand();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XPostfixOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.euclideanspace.pbase.demo.XPostfixOperation#getFeature()
   * @see #getXPostfixOperation()
   * @generated
   */
  EAttribute getXPostfixOperation_Feature();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall <em>XMember Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XMember Feature Call</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall
   * @generated
   */
  EClass getXMemberFeatureCall();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallTarget <em>Member Call Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member Call Target</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallTarget()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EReference getXMemberFeatureCall_MemberCallTarget();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isNullSafe <em>Null Safe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null Safe</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#isNullSafe()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EAttribute getXMemberFeatureCall_NullSafe();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitStatic <em>Explicit Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Static</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitStatic()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EAttribute getXMemberFeatureCall_ExplicitStatic();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getTypeArguments <em>Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Arguments</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#getTypeArguments()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EAttribute getXMemberFeatureCall_TypeArguments();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#getFeature()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EAttribute getXMemberFeatureCall_Feature();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#isExplicitOperationCall()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EAttribute getXMemberFeatureCall_ExplicitOperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallArguments <em>Member Call Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Member Call Arguments</em>'.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall#getMemberCallArguments()
   * @see #getXMemberFeatureCall()
   * @generated
   */
  EReference getXMemberFeatureCall_MemberCallArguments();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XClosure <em>XClosure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XClosure</em>'.
   * @see com.euclideanspace.pbase.demo.XClosure
   * @generated
   */
  EClass getXClosure();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.XClosure#getDeclaredFormalParameters <em>Declared Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Declared Formal Parameters</em>'.
   * @see com.euclideanspace.pbase.demo.XClosure#getDeclaredFormalParameters()
   * @see #getXClosure()
   * @generated
   */
  EAttribute getXClosure_DeclaredFormalParameters();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XClosure#isExplicitSyntax <em>Explicit Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Syntax</em>'.
   * @see com.euclideanspace.pbase.demo.XClosure#isExplicitSyntax()
   * @see #getXClosure()
   * @generated
   */
  EAttribute getXClosure_ExplicitSyntax();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XClosure#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XClosure#getExpression()
   * @see #getXClosure()
   * @generated
   */
  EReference getXClosure_Expression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBlock Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XBlockExpression
   * @generated
   */
  EClass getXBlockExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XBlockExpression#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see com.euclideanspace.pbase.demo.XBlockExpression#getExpressions()
   * @see #getXBlockExpression()
   * @generated
   */
  EReference getXBlockExpression_Expressions();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XIf Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XIfExpression
   * @generated
   */
  EClass getXIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XIfExpression#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see com.euclideanspace.pbase.demo.XIfExpression#getIf()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_If();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XIfExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.euclideanspace.pbase.demo.XIfExpression#getThen()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XIfExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see com.euclideanspace.pbase.demo.XIfExpression#getElse()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_Else();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XSwitchExpression <em>XSwitch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSwitch Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XSwitchExpression
   * @generated
   */
  EClass getXSwitchExpression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getDeclaredParam <em>Declared Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Param</em>'.
   * @see com.euclideanspace.pbase.demo.XSwitchExpression#getDeclaredParam()
   * @see #getXSwitchExpression()
   * @generated
   */
  EAttribute getXSwitchExpression_DeclaredParam();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see com.euclideanspace.pbase.demo.XSwitchExpression#getSwitch()
   * @see #getXSwitchExpression()
   * @generated
   */
  EReference getXSwitchExpression_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.euclideanspace.pbase.demo.XSwitchExpression#getCases()
   * @see #getXSwitchExpression()
   * @generated
   */
  EReference getXSwitchExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XSwitchExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.euclideanspace.pbase.demo.XSwitchExpression#getDefault()
   * @see #getXSwitchExpression()
   * @generated
   */
  EReference getXSwitchExpression_Default();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XForLoopExpression <em>XFor Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XFor Loop Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XForLoopExpression
   * @generated
   */
  EClass getXForLoopExpression();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XForLoopExpression#getDeclaredParam <em>Declared Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Param</em>'.
   * @see com.euclideanspace.pbase.demo.XForLoopExpression#getDeclaredParam()
   * @see #getXForLoopExpression()
   * @generated
   */
  EAttribute getXForLoopExpression_DeclaredParam();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XForLoopExpression#getForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XForLoopExpression#getForExpression()
   * @see #getXForLoopExpression()
   * @generated
   */
  EReference getXForLoopExpression_ForExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XForLoopExpression#getEachExpression <em>Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Each Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XForLoopExpression#getEachExpression()
   * @see #getXForLoopExpression()
   * @generated
   */
  EReference getXForLoopExpression_EachExpression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression <em>XBasic For Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBasic For Loop Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XBasicForLoopExpression
   * @generated
   */
  EClass getXBasicForLoopExpression();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getInitExpressions <em>Init Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Expressions</em>'.
   * @see com.euclideanspace.pbase.demo.XBasicForLoopExpression#getInitExpressions()
   * @see #getXBasicForLoopExpression()
   * @generated
   */
  EReference getXBasicForLoopExpression_InitExpressions();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XBasicForLoopExpression#getExpression()
   * @see #getXBasicForLoopExpression()
   * @generated
   */
  EReference getXBasicForLoopExpression_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getUpdateExpressions <em>Update Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update Expressions</em>'.
   * @see com.euclideanspace.pbase.demo.XBasicForLoopExpression#getUpdateExpressions()
   * @see #getXBasicForLoopExpression()
   * @generated
   */
  EReference getXBasicForLoopExpression_UpdateExpressions();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression#getEachExpression <em>Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Each Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XBasicForLoopExpression#getEachExpression()
   * @see #getXBasicForLoopExpression()
   * @generated
   */
  EReference getXBasicForLoopExpression_EachExpression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XWhileExpression <em>XWhile Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XWhile Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XWhileExpression
   * @generated
   */
  EClass getXWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XWhileExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.euclideanspace.pbase.demo.XWhileExpression#getPredicate()
   * @see #getXWhileExpression()
   * @generated
   */
  EReference getXWhileExpression_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XWhileExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see com.euclideanspace.pbase.demo.XWhileExpression#getBody()
   * @see #getXWhileExpression()
   * @generated
   */
  EReference getXWhileExpression_Body();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XDoWhileExpression <em>XDo While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDo While Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XDoWhileExpression
   * @generated
   */
  EClass getXDoWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XDoWhileExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see com.euclideanspace.pbase.demo.XDoWhileExpression#getBody()
   * @see #getXDoWhileExpression()
   * @generated
   */
  EReference getXDoWhileExpression_Body();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XDoWhileExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see com.euclideanspace.pbase.demo.XDoWhileExpression#getPredicate()
   * @see #getXDoWhileExpression()
   * @generated
   */
  EReference getXDoWhileExpression_Predicate();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XVariableDeclaration <em>XVariable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XVariable Declaration</em>'.
   * @see com.euclideanspace.pbase.demo.XVariableDeclaration
   * @generated
   */
  EClass getXVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#isWriteable <em>Writeable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Writeable</em>'.
   * @see com.euclideanspace.pbase.demo.XVariableDeclaration#isWriteable()
   * @see #getXVariableDeclaration()
   * @generated
   */
  EAttribute getXVariableDeclaration_Writeable();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.euclideanspace.pbase.demo.XVariableDeclaration#getType()
   * @see #getXVariableDeclaration()
   * @generated
   */
  EAttribute getXVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.euclideanspace.pbase.demo.XVariableDeclaration#getName()
   * @see #getXVariableDeclaration()
   * @generated
   */
  EAttribute getXVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XVariableDeclaration#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.euclideanspace.pbase.demo.XVariableDeclaration#getRight()
   * @see #getXVariableDeclaration()
   * @generated
   */
  EReference getXVariableDeclaration_Right();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XFeatureCall <em>XFeature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XFeature Call</em>'.
   * @see com.euclideanspace.pbase.demo.XFeatureCall
   * @generated
   */
  EClass getXFeatureCall();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.XFeatureCall#getTypeArguments <em>Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Arguments</em>'.
   * @see com.euclideanspace.pbase.demo.XFeatureCall#getTypeArguments()
   * @see #getXFeatureCall()
   * @generated
   */
  EAttribute getXFeatureCall_TypeArguments();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XFeatureCall#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.euclideanspace.pbase.demo.XFeatureCall#getFeature()
   * @see #getXFeatureCall()
   * @generated
   */
  EAttribute getXFeatureCall_Feature();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XFeatureCall#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
   * @see com.euclideanspace.pbase.demo.XFeatureCall#isExplicitOperationCall()
   * @see #getXFeatureCall()
   * @generated
   */
  EAttribute getXFeatureCall_ExplicitOperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XFeatureCall#getFeatureCallArguments <em>Feature Call Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature Call Arguments</em>'.
   * @see com.euclideanspace.pbase.demo.XFeatureCall#getFeatureCallArguments()
   * @see #getXFeatureCall()
   * @generated
   */
  EReference getXFeatureCall_FeatureCallArguments();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XConstructorCall <em>XConstructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XConstructor Call</em>'.
   * @see com.euclideanspace.pbase.demo.XConstructorCall
   * @generated
   */
  EClass getXConstructorCall();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XConstructorCall#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see com.euclideanspace.pbase.demo.XConstructorCall#getConstructor()
   * @see #getXConstructorCall()
   * @generated
   */
  EAttribute getXConstructorCall_Constructor();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.XConstructorCall#getTypeArguments <em>Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Arguments</em>'.
   * @see com.euclideanspace.pbase.demo.XConstructorCall#getTypeArguments()
   * @see #getXConstructorCall()
   * @generated
   */
  EAttribute getXConstructorCall_TypeArguments();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explicit Constructor Call</em>'.
   * @see com.euclideanspace.pbase.demo.XConstructorCall#isExplicitConstructorCall()
   * @see #getXConstructorCall()
   * @generated
   */
  EAttribute getXConstructorCall_ExplicitConstructorCall();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XConstructorCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.euclideanspace.pbase.demo.XConstructorCall#getArguments()
   * @see #getXConstructorCall()
   * @generated
   */
  EReference getXConstructorCall_Arguments();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XBooleanLiteral <em>XBoolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBoolean Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XBooleanLiteral
   * @generated
   */
  EClass getXBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XBooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see com.euclideanspace.pbase.demo.XBooleanLiteral#isIsTrue()
   * @see #getXBooleanLiteral()
   * @generated
   */
  EAttribute getXBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XNullLiteral <em>XNull Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNull Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XNullLiteral
   * @generated
   */
  EClass getXNullLiteral();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XNumberLiteral <em>XNumber Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNumber Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XNumberLiteral
   * @generated
   */
  EClass getXNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XNumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.euclideanspace.pbase.demo.XNumberLiteral#getValue()
   * @see #getXNumberLiteral()
   * @generated
   */
  EAttribute getXNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XString Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XStringLiteral
   * @generated
   */
  EClass getXStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.euclideanspace.pbase.demo.XStringLiteral#getValue()
   * @see #getXStringLiteral()
   * @generated
   */
  EAttribute getXStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XTypeLiteral <em>XType Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XType Literal</em>'.
   * @see com.euclideanspace.pbase.demo.XTypeLiteral
   * @generated
   */
  EClass getXTypeLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.pbase.demo.XTypeLiteral#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.euclideanspace.pbase.demo.XTypeLiteral#getType()
   * @see #getXTypeLiteral()
   * @generated
   */
  EAttribute getXTypeLiteral_Type();

  /**
   * Returns the meta object for the attribute list '{@link com.euclideanspace.pbase.demo.XTypeLiteral#getArrayDimensions <em>Array Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Array Dimensions</em>'.
   * @see com.euclideanspace.pbase.demo.XTypeLiteral#getArrayDimensions()
   * @see #getXTypeLiteral()
   * @generated
   */
  EAttribute getXTypeLiteral_ArrayDimensions();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XThrowExpression <em>XThrow Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XThrow Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XThrowExpression
   * @generated
   */
  EClass getXThrowExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XThrowExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XThrowExpression#getExpression()
   * @see #getXThrowExpression()
   * @generated
   */
  EReference getXThrowExpression_Expression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XReturnExpression <em>XReturn Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XReturn Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XReturnExpression
   * @generated
   */
  EClass getXReturnExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XReturnExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XReturnExpression#getExpression()
   * @see #getXReturnExpression()
   * @generated
   */
  EReference getXReturnExpression_Expression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XTryCatchFinallyExpression <em>XTry Catch Finally Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XTry Catch Finally Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XTryCatchFinallyExpression
   * @generated
   */
  EClass getXTryCatchFinallyExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XTryCatchFinallyExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XTryCatchFinallyExpression#getExpression()
   * @see #getXTryCatchFinallyExpression()
   * @generated
   */
  EReference getXTryCatchFinallyExpression_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.pbase.demo.XTryCatchFinallyExpression#getCatchClauses <em>Catch Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catch Clauses</em>'.
   * @see com.euclideanspace.pbase.demo.XTryCatchFinallyExpression#getCatchClauses()
   * @see #getXTryCatchFinallyExpression()
   * @generated
   */
  EReference getXTryCatchFinallyExpression_CatchClauses();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XTryCatchFinallyExpression#getFinallyExpression <em>Finally Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XTryCatchFinallyExpression#getFinallyExpression()
   * @see #getXTryCatchFinallyExpression()
   * @generated
   */
  EReference getXTryCatchFinallyExpression_FinallyExpression();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.pbase.demo.XSynchronizedExpression <em>XSynchronized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSynchronized Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XSynchronizedExpression
   * @generated
   */
  EClass getXSynchronizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XSynchronizedExpression#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see com.euclideanspace.pbase.demo.XSynchronizedExpression#getParam()
   * @see #getXSynchronizedExpression()
   * @generated
   */
  EReference getXSynchronizedExpression_Param();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.pbase.demo.XSynchronizedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see com.euclideanspace.pbase.demo.XSynchronizedExpression#getExpression()
   * @see #getXSynchronizedExpression()
   * @generated
   */
  EReference getXSynchronizedExpression_Expression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DemoFactory getDemoFactory();

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
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.ModelImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>M</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__M = eINSTANCE.getModel_M();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl <em>Euclid Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.EuclidMemberImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getEuclidMember()
     * @generated
     */
    EClass EUCLID_MEMBER = eINSTANCE.getEuclidMember();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__EXTENSION = eINSTANCE.getEuclidMember_Extension();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__FINAL = eINSTANCE.getEuclidMember_Final();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__TYPE = eINSTANCE.getEuclidMember_Type();

    /**
     * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__NAME1 = eINSTANCE.getEuclidMember_Name1();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__STATIC = eINSTANCE.getEuclidMember_Static();

    /**
     * The meta object literal for the '<em><b>Name2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__NAME2 = eINSTANCE.getEuclidMember_Name2();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_MEMBER__INITIAL_VALUE = eINSTANCE.getEuclidMember_InitialValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__NAME = eINSTANCE.getEuclidMember_Name();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__TYPE_PARAMETERS = eINSTANCE.getEuclidMember_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__EXTENDS = eINSTANCE.getEuclidMember_Extends();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__IMPLEMENTS = eINSTANCE.getEuclidMember_Implements();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_MEMBER__MEMBERS = eINSTANCE.getEuclidMember_Members();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__OVERRIDE = eINSTANCE.getEuclidMember_Override();

    /**
     * The meta object literal for the '<em><b>Dispatch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__DISPATCH = eINSTANCE.getEuclidMember_Dispatch();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__RETURN_TYPE = eINSTANCE.getEuclidMember_ReturnType();

    /**
     * The meta object literal for the '<em><b>Name3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__NAME3 = eINSTANCE.getEuclidMember_Name3();

    /**
     * The meta object literal for the '<em><b>Name4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__NAME4 = eINSTANCE.getEuclidMember_Name4();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_MEMBER__PARAMETERS = eINSTANCE.getEuclidMember_Parameters();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_MEMBER__EXCEPTIONS = eINSTANCE.getEuclidMember_Exceptions();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUCLID_MEMBER__EXPRESSION = eINSTANCE.getEuclidMember_Expression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.EuclidParameterImpl <em>Euclid Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.EuclidParameterImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getEuclidParameter()
     * @generated
     */
    EClass EUCLID_PARAMETER = eINSTANCE.getEuclidParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_PARAMETER__PARAMETER_TYPE = eINSTANCE.getEuclidParameter_ParameterType();

    /**
     * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_PARAMETER__VAR_ARG = eINSTANCE.getEuclidParameter_VarArg();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUCLID_PARAMETER__NAME = eINSTANCE.getEuclidParameter_Name();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XExpressionImpl <em>XExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXExpression()
     * @generated
     */
    EClass XEXPRESSION = eINSTANCE.getXExpression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XCollectionLiteralImpl <em>XCollection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XCollectionLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCollectionLiteral()
     * @generated
     */
    EClass XCOLLECTION_LITERAL = eINSTANCE.getXCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCOLLECTION_LITERAL__ELEMENTS = eINSTANCE.getXCollectionLiteral_Elements();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XSetLiteralImpl <em>XSet Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XSetLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXSetLiteral()
     * @generated
     */
    EClass XSET_LITERAL = eINSTANCE.getXSetLiteral();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XListLiteralImpl <em>XList Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XListLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXListLiteral()
     * @generated
     */
    EClass XLIST_LITERAL = eINSTANCE.getXListLiteral();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XCasePartImpl <em>XCase Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XCasePartImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCasePart()
     * @generated
     */
    EClass XCASE_PART = eINSTANCE.getXCasePart();

    /**
     * The meta object literal for the '<em><b>Type Guard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCASE_PART__TYPE_GUARD = eINSTANCE.getXCasePart_TypeGuard();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCASE_PART__CASE = eINSTANCE.getXCasePart_Case();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCASE_PART__THEN = eINSTANCE.getXCasePart_Then();

    /**
     * The meta object literal for the '<em><b>Fall Through</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCASE_PART__FALL_THROUGH = eINSTANCE.getXCasePart_FallThrough();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XCatchClauseImpl <em>XCatch Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XCatchClauseImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCatchClause()
     * @generated
     */
    EClass XCATCH_CLAUSE = eINSTANCE.getXCatchClause();

    /**
     * The meta object literal for the '<em><b>Declared Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCATCH_CLAUSE__DECLARED_PARAM = eINSTANCE.getXCatchClause_DeclaredParam();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCATCH_CLAUSE__EXPRESSION = eINSTANCE.getXCatchClause_Expression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XAssignmentImpl <em>XAssignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XAssignmentImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXAssignment()
     * @generated
     */
    EClass XASSIGNMENT = eINSTANCE.getXAssignment();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XASSIGNMENT__FEATURE = eINSTANCE.getXAssignment_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XASSIGNMENT__VALUE = eINSTANCE.getXAssignment_Value();

    /**
     * The meta object literal for the '<em><b>Assignable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XASSIGNMENT__ASSIGNABLE = eINSTANCE.getXAssignment_Assignable();

    /**
     * The meta object literal for the '<em><b>Explicit Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XASSIGNMENT__EXPLICIT_STATIC = eINSTANCE.getXAssignment_ExplicitStatic();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XBinaryOperationImpl <em>XBinary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XBinaryOperationImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBinaryOperation()
     * @generated
     */
    EClass XBINARY_OPERATION = eINSTANCE.getXBinaryOperation();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getXBinaryOperation_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBINARY_OPERATION__FEATURE = eINSTANCE.getXBinaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getXBinaryOperation_RightOperand();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XInstanceOfExpressionImpl <em>XInstance Of Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XInstanceOfExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXInstanceOfExpression()
     * @generated
     */
    EClass XINSTANCE_OF_EXPRESSION = eINSTANCE.getXInstanceOfExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XINSTANCE_OF_EXPRESSION__EXPRESSION = eINSTANCE.getXInstanceOfExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XINSTANCE_OF_EXPRESSION__TYPE = eINSTANCE.getXInstanceOfExpression_Type();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XUnaryOperationImpl <em>XUnary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XUnaryOperationImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXUnaryOperation()
     * @generated
     */
    EClass XUNARY_OPERATION = eINSTANCE.getXUnaryOperation();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XUNARY_OPERATION__FEATURE = eINSTANCE.getXUnaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XUNARY_OPERATION__OPERAND = eINSTANCE.getXUnaryOperation_Operand();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XCastedExpressionImpl <em>XCasted Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XCastedExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXCastedExpression()
     * @generated
     */
    EClass XCASTED_EXPRESSION = eINSTANCE.getXCastedExpression();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCASTED_EXPRESSION__TARGET = eINSTANCE.getXCastedExpression_Target();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCASTED_EXPRESSION__TYPE = eINSTANCE.getXCastedExpression_Type();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XPostfixOperationImpl <em>XPostfix Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XPostfixOperationImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXPostfixOperation()
     * @generated
     */
    EClass XPOSTFIX_OPERATION = eINSTANCE.getXPostfixOperation();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPOSTFIX_OPERATION__OPERAND = eINSTANCE.getXPostfixOperation_Operand();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPOSTFIX_OPERATION__FEATURE = eINSTANCE.getXPostfixOperation_Feature();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl <em>XMember Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XMemberFeatureCallImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXMemberFeatureCall()
     * @generated
     */
    EClass XMEMBER_FEATURE_CALL = eINSTANCE.getXMemberFeatureCall();

    /**
     * The meta object literal for the '<em><b>Member Call Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET = eINSTANCE.getXMemberFeatureCall_MemberCallTarget();

    /**
     * The meta object literal for the '<em><b>Null Safe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XMEMBER_FEATURE_CALL__NULL_SAFE = eINSTANCE.getXMemberFeatureCall_NullSafe();

    /**
     * The meta object literal for the '<em><b>Explicit Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XMEMBER_FEATURE_CALL__EXPLICIT_STATIC = eINSTANCE.getXMemberFeatureCall_ExplicitStatic();

    /**
     * The meta object literal for the '<em><b>Type Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS = eINSTANCE.getXMemberFeatureCall_TypeArguments();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XMEMBER_FEATURE_CALL__FEATURE = eINSTANCE.getXMemberFeatureCall_Feature();

    /**
     * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL = eINSTANCE.getXMemberFeatureCall_ExplicitOperationCall();

    /**
     * The meta object literal for the '<em><b>Member Call Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS = eINSTANCE.getXMemberFeatureCall_MemberCallArguments();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XClosureImpl <em>XClosure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XClosureImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXClosure()
     * @generated
     */
    EClass XCLOSURE = eINSTANCE.getXClosure();

    /**
     * The meta object literal for the '<em><b>Declared Formal Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCLOSURE__DECLARED_FORMAL_PARAMETERS = eINSTANCE.getXClosure_DeclaredFormalParameters();

    /**
     * The meta object literal for the '<em><b>Explicit Syntax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCLOSURE__EXPLICIT_SYNTAX = eINSTANCE.getXClosure_ExplicitSyntax();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCLOSURE__EXPRESSION = eINSTANCE.getXClosure_Expression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XBlockExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBlockExpression()
     * @generated
     */
    EClass XBLOCK_EXPRESSION = eINSTANCE.getXBlockExpression();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBLOCK_EXPRESSION__EXPRESSIONS = eINSTANCE.getXBlockExpression_Expressions();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XIfExpressionImpl <em>XIf Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XIfExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXIfExpression()
     * @generated
     */
    EClass XIF_EXPRESSION = eINSTANCE.getXIfExpression();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__IF = eINSTANCE.getXIfExpression_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__THEN = eINSTANCE.getXIfExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__ELSE = eINSTANCE.getXIfExpression_Else();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XSwitchExpressionImpl <em>XSwitch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XSwitchExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXSwitchExpression()
     * @generated
     */
    EClass XSWITCH_EXPRESSION = eINSTANCE.getXSwitchExpression();

    /**
     * The meta object literal for the '<em><b>Declared Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSWITCH_EXPRESSION__DECLARED_PARAM = eINSTANCE.getXSwitchExpression_DeclaredParam();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSWITCH_EXPRESSION__SWITCH = eINSTANCE.getXSwitchExpression_Switch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSWITCH_EXPRESSION__CASES = eINSTANCE.getXSwitchExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSWITCH_EXPRESSION__DEFAULT = eINSTANCE.getXSwitchExpression_Default();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl <em>XFor Loop Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XForLoopExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXForLoopExpression()
     * @generated
     */
    EClass XFOR_LOOP_EXPRESSION = eINSTANCE.getXForLoopExpression();

    /**
     * The meta object literal for the '<em><b>Declared Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XFOR_LOOP_EXPRESSION__DECLARED_PARAM = eINSTANCE.getXForLoopExpression_DeclaredParam();

    /**
     * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_LOOP_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getXForLoopExpression_ForExpression();

    /**
     * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_LOOP_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getXForLoopExpression_EachExpression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XBasicForLoopExpressionImpl <em>XBasic For Loop Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XBasicForLoopExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBasicForLoopExpression()
     * @generated
     */
    EClass XBASIC_FOR_LOOP_EXPRESSION = eINSTANCE.getXBasicForLoopExpression();

    /**
     * The meta object literal for the '<em><b>Init Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS = eINSTANCE.getXBasicForLoopExpression_InitExpressions();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION = eINSTANCE.getXBasicForLoopExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Update Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS = eINSTANCE.getXBasicForLoopExpression_UpdateExpressions();

    /**
     * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getXBasicForLoopExpression_EachExpression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XWhileExpressionImpl <em>XWhile Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XWhileExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXWhileExpression()
     * @generated
     */
    EClass XWHILE_EXPRESSION = eINSTANCE.getXWhileExpression();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XWHILE_EXPRESSION__PREDICATE = eINSTANCE.getXWhileExpression_Predicate();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XWHILE_EXPRESSION__BODY = eINSTANCE.getXWhileExpression_Body();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XDoWhileExpressionImpl <em>XDo While Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XDoWhileExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXDoWhileExpression()
     * @generated
     */
    EClass XDO_WHILE_EXPRESSION = eINSTANCE.getXDoWhileExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDO_WHILE_EXPRESSION__BODY = eINSTANCE.getXDoWhileExpression_Body();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDO_WHILE_EXPRESSION__PREDICATE = eINSTANCE.getXDoWhileExpression_Predicate();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XVariableDeclarationImpl <em>XVariable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XVariableDeclarationImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXVariableDeclaration()
     * @generated
     */
    EClass XVARIABLE_DECLARATION = eINSTANCE.getXVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Writeable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XVARIABLE_DECLARATION__WRITEABLE = eINSTANCE.getXVariableDeclaration_Writeable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XVARIABLE_DECLARATION__TYPE = eINSTANCE.getXVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XVARIABLE_DECLARATION__NAME = eINSTANCE.getXVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XVARIABLE_DECLARATION__RIGHT = eINSTANCE.getXVariableDeclaration_Right();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XFeatureCallImpl <em>XFeature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XFeatureCallImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXFeatureCall()
     * @generated
     */
    EClass XFEATURE_CALL = eINSTANCE.getXFeatureCall();

    /**
     * The meta object literal for the '<em><b>Type Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XFEATURE_CALL__TYPE_ARGUMENTS = eINSTANCE.getXFeatureCall_TypeArguments();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XFEATURE_CALL__FEATURE = eINSTANCE.getXFeatureCall_Feature();

    /**
     * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XFEATURE_CALL__EXPLICIT_OPERATION_CALL = eINSTANCE.getXFeatureCall_ExplicitOperationCall();

    /**
     * The meta object literal for the '<em><b>Feature Call Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFEATURE_CALL__FEATURE_CALL_ARGUMENTS = eINSTANCE.getXFeatureCall_FeatureCallArguments();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XConstructorCallImpl <em>XConstructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XConstructorCallImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXConstructorCall()
     * @generated
     */
    EClass XCONSTRUCTOR_CALL = eINSTANCE.getXConstructorCall();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCONSTRUCTOR_CALL__CONSTRUCTOR = eINSTANCE.getXConstructorCall_Constructor();

    /**
     * The meta object literal for the '<em><b>Type Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCONSTRUCTOR_CALL__TYPE_ARGUMENTS = eINSTANCE.getXConstructorCall_TypeArguments();

    /**
     * The meta object literal for the '<em><b>Explicit Constructor Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getXConstructorCall_ExplicitConstructorCall();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCONSTRUCTOR_CALL__ARGUMENTS = eINSTANCE.getXConstructorCall_Arguments();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XBooleanLiteralImpl <em>XBoolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XBooleanLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXBooleanLiteral()
     * @generated
     */
    EClass XBOOLEAN_LITERAL = eINSTANCE.getXBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getXBooleanLiteral_IsTrue();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XNullLiteralImpl <em>XNull Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XNullLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXNullLiteral()
     * @generated
     */
    EClass XNULL_LITERAL = eINSTANCE.getXNullLiteral();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XNumberLiteralImpl <em>XNumber Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XNumberLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXNumberLiteral()
     * @generated
     */
    EClass XNUMBER_LITERAL = eINSTANCE.getXNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XNUMBER_LITERAL__VALUE = eINSTANCE.getXNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XStringLiteralImpl <em>XString Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XStringLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXStringLiteral()
     * @generated
     */
    EClass XSTRING_LITERAL = eINSTANCE.getXStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSTRING_LITERAL__VALUE = eINSTANCE.getXStringLiteral_Value();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XTypeLiteralImpl <em>XType Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XTypeLiteralImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXTypeLiteral()
     * @generated
     */
    EClass XTYPE_LITERAL = eINSTANCE.getXTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XTYPE_LITERAL__TYPE = eINSTANCE.getXTypeLiteral_Type();

    /**
     * The meta object literal for the '<em><b>Array Dimensions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XTYPE_LITERAL__ARRAY_DIMENSIONS = eINSTANCE.getXTypeLiteral_ArrayDimensions();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XThrowExpressionImpl <em>XThrow Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XThrowExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXThrowExpression()
     * @generated
     */
    EClass XTHROW_EXPRESSION = eINSTANCE.getXThrowExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTHROW_EXPRESSION__EXPRESSION = eINSTANCE.getXThrowExpression_Expression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XReturnExpressionImpl <em>XReturn Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XReturnExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXReturnExpression()
     * @generated
     */
    EClass XRETURN_EXPRESSION = eINSTANCE.getXReturnExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XRETURN_EXPRESSION__EXPRESSION = eINSTANCE.getXReturnExpression_Expression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl <em>XTry Catch Finally Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XTryCatchFinallyExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXTryCatchFinallyExpression()
     * @generated
     */
    EClass XTRY_CATCH_FINALLY_EXPRESSION = eINSTANCE.getXTryCatchFinallyExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION = eINSTANCE.getXTryCatchFinallyExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Catch Clauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES = eINSTANCE.getXTryCatchFinallyExpression_CatchClauses();

    /**
     * The meta object literal for the '<em><b>Finally Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION = eINSTANCE.getXTryCatchFinallyExpression_FinallyExpression();

    /**
     * The meta object literal for the '{@link com.euclideanspace.pbase.demo.impl.XSynchronizedExpressionImpl <em>XSynchronized Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.pbase.demo.impl.XSynchronizedExpressionImpl
     * @see com.euclideanspace.pbase.demo.impl.DemoPackageImpl#getXSynchronizedExpression()
     * @generated
     */
    EClass XSYNCHRONIZED_EXPRESSION = eINSTANCE.getXSynchronizedExpression();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSYNCHRONIZED_EXPRESSION__PARAM = eINSTANCE.getXSynchronizedExpression_Param();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSYNCHRONIZED_EXPRESSION__EXPRESSION = eINSTANCE.getXSynchronizedExpression_Expression();

  }

} //DemoPackage

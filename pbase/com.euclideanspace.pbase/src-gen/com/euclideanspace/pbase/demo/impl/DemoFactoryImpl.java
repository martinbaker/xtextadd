/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoFactoryImpl extends EFactoryImpl implements DemoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DemoFactory init()
  {
    try
    {
      DemoFactory theDemoFactory = (DemoFactory)EPackage.Registry.INSTANCE.getEFactory(DemoPackage.eNS_URI);
      if (theDemoFactory != null)
      {
        return theDemoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DemoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DemoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DemoPackage.MODEL: return createModel();
      case DemoPackage.EUCLID_MEMBER: return createEuclidMember();
      case DemoPackage.EUCLID_PARAMETER: return createEuclidParameter();
      case DemoPackage.XEXPRESSION: return createXExpression();
      case DemoPackage.XCOLLECTION_LITERAL: return createXCollectionLiteral();
      case DemoPackage.XSET_LITERAL: return createXSetLiteral();
      case DemoPackage.XLIST_LITERAL: return createXListLiteral();
      case DemoPackage.XCASE_PART: return createXCasePart();
      case DemoPackage.XCATCH_CLAUSE: return createXCatchClause();
      case DemoPackage.XASSIGNMENT: return createXAssignment();
      case DemoPackage.XBINARY_OPERATION: return createXBinaryOperation();
      case DemoPackage.XINSTANCE_OF_EXPRESSION: return createXInstanceOfExpression();
      case DemoPackage.XUNARY_OPERATION: return createXUnaryOperation();
      case DemoPackage.XCASTED_EXPRESSION: return createXCastedExpression();
      case DemoPackage.XPOSTFIX_OPERATION: return createXPostfixOperation();
      case DemoPackage.XMEMBER_FEATURE_CALL: return createXMemberFeatureCall();
      case DemoPackage.XCLOSURE: return createXClosure();
      case DemoPackage.XBLOCK_EXPRESSION: return createXBlockExpression();
      case DemoPackage.XIF_EXPRESSION: return createXIfExpression();
      case DemoPackage.XSWITCH_EXPRESSION: return createXSwitchExpression();
      case DemoPackage.XFOR_LOOP_EXPRESSION: return createXForLoopExpression();
      case DemoPackage.XBASIC_FOR_LOOP_EXPRESSION: return createXBasicForLoopExpression();
      case DemoPackage.XWHILE_EXPRESSION: return createXWhileExpression();
      case DemoPackage.XDO_WHILE_EXPRESSION: return createXDoWhileExpression();
      case DemoPackage.XVARIABLE_DECLARATION: return createXVariableDeclaration();
      case DemoPackage.XFEATURE_CALL: return createXFeatureCall();
      case DemoPackage.XCONSTRUCTOR_CALL: return createXConstructorCall();
      case DemoPackage.XBOOLEAN_LITERAL: return createXBooleanLiteral();
      case DemoPackage.XNULL_LITERAL: return createXNullLiteral();
      case DemoPackage.XNUMBER_LITERAL: return createXNumberLiteral();
      case DemoPackage.XSTRING_LITERAL: return createXStringLiteral();
      case DemoPackage.XTYPE_LITERAL: return createXTypeLiteral();
      case DemoPackage.XTHROW_EXPRESSION: return createXThrowExpression();
      case DemoPackage.XRETURN_EXPRESSION: return createXReturnExpression();
      case DemoPackage.XTRY_CATCH_FINALLY_EXPRESSION: return createXTryCatchFinallyExpression();
      case DemoPackage.XSYNCHRONIZED_EXPRESSION: return createXSynchronizedExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidMember createEuclidMember()
  {
    EuclidMemberImpl euclidMember = new EuclidMemberImpl();
    return euclidMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EuclidParameter createEuclidParameter()
  {
    EuclidParameterImpl euclidParameter = new EuclidParameterImpl();
    return euclidParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression createXExpression()
  {
    XExpressionImpl xExpression = new XExpressionImpl();
    return xExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCollectionLiteral createXCollectionLiteral()
  {
    XCollectionLiteralImpl xCollectionLiteral = new XCollectionLiteralImpl();
    return xCollectionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSetLiteral createXSetLiteral()
  {
    XSetLiteralImpl xSetLiteral = new XSetLiteralImpl();
    return xSetLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XListLiteral createXListLiteral()
  {
    XListLiteralImpl xListLiteral = new XListLiteralImpl();
    return xListLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCasePart createXCasePart()
  {
    XCasePartImpl xCasePart = new XCasePartImpl();
    return xCasePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCatchClause createXCatchClause()
  {
    XCatchClauseImpl xCatchClause = new XCatchClauseImpl();
    return xCatchClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XAssignment createXAssignment()
  {
    XAssignmentImpl xAssignment = new XAssignmentImpl();
    return xAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBinaryOperation createXBinaryOperation()
  {
    XBinaryOperationImpl xBinaryOperation = new XBinaryOperationImpl();
    return xBinaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XInstanceOfExpression createXInstanceOfExpression()
  {
    XInstanceOfExpressionImpl xInstanceOfExpression = new XInstanceOfExpressionImpl();
    return xInstanceOfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XUnaryOperation createXUnaryOperation()
  {
    XUnaryOperationImpl xUnaryOperation = new XUnaryOperationImpl();
    return xUnaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCastedExpression createXCastedExpression()
  {
    XCastedExpressionImpl xCastedExpression = new XCastedExpressionImpl();
    return xCastedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPostfixOperation createXPostfixOperation()
  {
    XPostfixOperationImpl xPostfixOperation = new XPostfixOperationImpl();
    return xPostfixOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMemberFeatureCall createXMemberFeatureCall()
  {
    XMemberFeatureCallImpl xMemberFeatureCall = new XMemberFeatureCallImpl();
    return xMemberFeatureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClosure createXClosure()
  {
    XClosureImpl xClosure = new XClosureImpl();
    return xClosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlockExpression createXBlockExpression()
  {
    XBlockExpressionImpl xBlockExpression = new XBlockExpressionImpl();
    return xBlockExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XIfExpression createXIfExpression()
  {
    XIfExpressionImpl xIfExpression = new XIfExpressionImpl();
    return xIfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSwitchExpression createXSwitchExpression()
  {
    XSwitchExpressionImpl xSwitchExpression = new XSwitchExpressionImpl();
    return xSwitchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XForLoopExpression createXForLoopExpression()
  {
    XForLoopExpressionImpl xForLoopExpression = new XForLoopExpressionImpl();
    return xForLoopExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBasicForLoopExpression createXBasicForLoopExpression()
  {
    XBasicForLoopExpressionImpl xBasicForLoopExpression = new XBasicForLoopExpressionImpl();
    return xBasicForLoopExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XWhileExpression createXWhileExpression()
  {
    XWhileExpressionImpl xWhileExpression = new XWhileExpressionImpl();
    return xWhileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDoWhileExpression createXDoWhileExpression()
  {
    XDoWhileExpressionImpl xDoWhileExpression = new XDoWhileExpressionImpl();
    return xDoWhileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XVariableDeclaration createXVariableDeclaration()
  {
    XVariableDeclarationImpl xVariableDeclaration = new XVariableDeclarationImpl();
    return xVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XFeatureCall createXFeatureCall()
  {
    XFeatureCallImpl xFeatureCall = new XFeatureCallImpl();
    return xFeatureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XConstructorCall createXConstructorCall()
  {
    XConstructorCallImpl xConstructorCall = new XConstructorCallImpl();
    return xConstructorCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBooleanLiteral createXBooleanLiteral()
  {
    XBooleanLiteralImpl xBooleanLiteral = new XBooleanLiteralImpl();
    return xBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNullLiteral createXNullLiteral()
  {
    XNullLiteralImpl xNullLiteral = new XNullLiteralImpl();
    return xNullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XNumberLiteral createXNumberLiteral()
  {
    XNumberLiteralImpl xNumberLiteral = new XNumberLiteralImpl();
    return xNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XStringLiteral createXStringLiteral()
  {
    XStringLiteralImpl xStringLiteral = new XStringLiteralImpl();
    return xStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XTypeLiteral createXTypeLiteral()
  {
    XTypeLiteralImpl xTypeLiteral = new XTypeLiteralImpl();
    return xTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XThrowExpression createXThrowExpression()
  {
    XThrowExpressionImpl xThrowExpression = new XThrowExpressionImpl();
    return xThrowExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XReturnExpression createXReturnExpression()
  {
    XReturnExpressionImpl xReturnExpression = new XReturnExpressionImpl();
    return xReturnExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XTryCatchFinallyExpression createXTryCatchFinallyExpression()
  {
    XTryCatchFinallyExpressionImpl xTryCatchFinallyExpression = new XTryCatchFinallyExpressionImpl();
    return xTryCatchFinallyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSynchronizedExpression createXSynchronizedExpression()
  {
    XSynchronizedExpressionImpl xSynchronizedExpression = new XSynchronizedExpressionImpl();
    return xSynchronizedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DemoPackage getDemoPackage()
  {
    return (DemoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DemoPackage getPackage()
  {
    return DemoPackage.eINSTANCE;
  }

} //DemoFactoryImpl

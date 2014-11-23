/**
 */
package com.euclideanspace.pbase.demo.util;

import com.euclideanspace.pbase.demo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.pbase.demo.DemoPackage
 * @generated
 */
public class DemoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DemoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DemoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DemoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DemoSwitch<Adapter> modelSwitch =
    new DemoSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseEuclidMember(EuclidMember object)
      {
        return createEuclidMemberAdapter();
      }
      @Override
      public Adapter caseEuclidParameter(EuclidParameter object)
      {
        return createEuclidParameterAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXCollectionLiteral(XCollectionLiteral object)
      {
        return createXCollectionLiteralAdapter();
      }
      @Override
      public Adapter caseXSetLiteral(XSetLiteral object)
      {
        return createXSetLiteralAdapter();
      }
      @Override
      public Adapter caseXListLiteral(XListLiteral object)
      {
        return createXListLiteralAdapter();
      }
      @Override
      public Adapter caseXCasePart(XCasePart object)
      {
        return createXCasePartAdapter();
      }
      @Override
      public Adapter caseXCatchClause(XCatchClause object)
      {
        return createXCatchClauseAdapter();
      }
      @Override
      public Adapter caseXAssignment(XAssignment object)
      {
        return createXAssignmentAdapter();
      }
      @Override
      public Adapter caseXBinaryOperation(XBinaryOperation object)
      {
        return createXBinaryOperationAdapter();
      }
      @Override
      public Adapter caseXInstanceOfExpression(XInstanceOfExpression object)
      {
        return createXInstanceOfExpressionAdapter();
      }
      @Override
      public Adapter caseXUnaryOperation(XUnaryOperation object)
      {
        return createXUnaryOperationAdapter();
      }
      @Override
      public Adapter caseXCastedExpression(XCastedExpression object)
      {
        return createXCastedExpressionAdapter();
      }
      @Override
      public Adapter caseXPostfixOperation(XPostfixOperation object)
      {
        return createXPostfixOperationAdapter();
      }
      @Override
      public Adapter caseXMemberFeatureCall(XMemberFeatureCall object)
      {
        return createXMemberFeatureCallAdapter();
      }
      @Override
      public Adapter caseXClosure(XClosure object)
      {
        return createXClosureAdapter();
      }
      @Override
      public Adapter caseXBlockExpression(XBlockExpression object)
      {
        return createXBlockExpressionAdapter();
      }
      @Override
      public Adapter caseXIfExpression(XIfExpression object)
      {
        return createXIfExpressionAdapter();
      }
      @Override
      public Adapter caseXSwitchExpression(XSwitchExpression object)
      {
        return createXSwitchExpressionAdapter();
      }
      @Override
      public Adapter caseXForLoopExpression(XForLoopExpression object)
      {
        return createXForLoopExpressionAdapter();
      }
      @Override
      public Adapter caseXBasicForLoopExpression(XBasicForLoopExpression object)
      {
        return createXBasicForLoopExpressionAdapter();
      }
      @Override
      public Adapter caseXWhileExpression(XWhileExpression object)
      {
        return createXWhileExpressionAdapter();
      }
      @Override
      public Adapter caseXDoWhileExpression(XDoWhileExpression object)
      {
        return createXDoWhileExpressionAdapter();
      }
      @Override
      public Adapter caseXVariableDeclaration(XVariableDeclaration object)
      {
        return createXVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseXFeatureCall(XFeatureCall object)
      {
        return createXFeatureCallAdapter();
      }
      @Override
      public Adapter caseXConstructorCall(XConstructorCall object)
      {
        return createXConstructorCallAdapter();
      }
      @Override
      public Adapter caseXBooleanLiteral(XBooleanLiteral object)
      {
        return createXBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseXNullLiteral(XNullLiteral object)
      {
        return createXNullLiteralAdapter();
      }
      @Override
      public Adapter caseXNumberLiteral(XNumberLiteral object)
      {
        return createXNumberLiteralAdapter();
      }
      @Override
      public Adapter caseXStringLiteral(XStringLiteral object)
      {
        return createXStringLiteralAdapter();
      }
      @Override
      public Adapter caseXTypeLiteral(XTypeLiteral object)
      {
        return createXTypeLiteralAdapter();
      }
      @Override
      public Adapter caseXThrowExpression(XThrowExpression object)
      {
        return createXThrowExpressionAdapter();
      }
      @Override
      public Adapter caseXReturnExpression(XReturnExpression object)
      {
        return createXReturnExpressionAdapter();
      }
      @Override
      public Adapter caseXTryCatchFinallyExpression(XTryCatchFinallyExpression object)
      {
        return createXTryCatchFinallyExpressionAdapter();
      }
      @Override
      public Adapter caseXSynchronizedExpression(XSynchronizedExpression object)
      {
        return createXSynchronizedExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.EuclidMember <em>Euclid Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.EuclidMember
   * @generated
   */
  public Adapter createEuclidMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.EuclidParameter <em>Euclid Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.EuclidParameter
   * @generated
   */
  public Adapter createEuclidParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XCollectionLiteral <em>XCollection Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XCollectionLiteral
   * @generated
   */
  public Adapter createXCollectionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XSetLiteral <em>XSet Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XSetLiteral
   * @generated
   */
  public Adapter createXSetLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XListLiteral <em>XList Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XListLiteral
   * @generated
   */
  public Adapter createXListLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XCasePart <em>XCase Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XCasePart
   * @generated
   */
  public Adapter createXCasePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XCatchClause <em>XCatch Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XCatchClause
   * @generated
   */
  public Adapter createXCatchClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XAssignment <em>XAssignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XAssignment
   * @generated
   */
  public Adapter createXAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XBinaryOperation <em>XBinary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XBinaryOperation
   * @generated
   */
  public Adapter createXBinaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XInstanceOfExpression <em>XInstance Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XInstanceOfExpression
   * @generated
   */
  public Adapter createXInstanceOfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XUnaryOperation <em>XUnary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XUnaryOperation
   * @generated
   */
  public Adapter createXUnaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XCastedExpression <em>XCasted Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XCastedExpression
   * @generated
   */
  public Adapter createXCastedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XPostfixOperation <em>XPostfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XPostfixOperation
   * @generated
   */
  public Adapter createXPostfixOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XMemberFeatureCall <em>XMember Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XMemberFeatureCall
   * @generated
   */
  public Adapter createXMemberFeatureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XClosure <em>XClosure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XClosure
   * @generated
   */
  public Adapter createXClosureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XBlockExpression
   * @generated
   */
  public Adapter createXBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XIfExpression
   * @generated
   */
  public Adapter createXIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XSwitchExpression <em>XSwitch Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XSwitchExpression
   * @generated
   */
  public Adapter createXSwitchExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XForLoopExpression <em>XFor Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XForLoopExpression
   * @generated
   */
  public Adapter createXForLoopExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XBasicForLoopExpression <em>XBasic For Loop Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XBasicForLoopExpression
   * @generated
   */
  public Adapter createXBasicForLoopExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XWhileExpression <em>XWhile Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XWhileExpression
   * @generated
   */
  public Adapter createXWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XDoWhileExpression <em>XDo While Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XDoWhileExpression
   * @generated
   */
  public Adapter createXDoWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XVariableDeclaration <em>XVariable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XVariableDeclaration
   * @generated
   */
  public Adapter createXVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XFeatureCall <em>XFeature Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XFeatureCall
   * @generated
   */
  public Adapter createXFeatureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XConstructorCall <em>XConstructor Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XConstructorCall
   * @generated
   */
  public Adapter createXConstructorCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XBooleanLiteral <em>XBoolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XBooleanLiteral
   * @generated
   */
  public Adapter createXBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XNullLiteral <em>XNull Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XNullLiteral
   * @generated
   */
  public Adapter createXNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XNumberLiteral <em>XNumber Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XNumberLiteral
   * @generated
   */
  public Adapter createXNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XStringLiteral
   * @generated
   */
  public Adapter createXStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XTypeLiteral <em>XType Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XTypeLiteral
   * @generated
   */
  public Adapter createXTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XThrowExpression <em>XThrow Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XThrowExpression
   * @generated
   */
  public Adapter createXThrowExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XReturnExpression <em>XReturn Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XReturnExpression
   * @generated
   */
  public Adapter createXReturnExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XTryCatchFinallyExpression <em>XTry Catch Finally Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XTryCatchFinallyExpression
   * @generated
   */
  public Adapter createXTryCatchFinallyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.pbase.demo.XSynchronizedExpression <em>XSynchronized Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.pbase.demo.XSynchronizedExpression
   * @generated
   */
  public Adapter createXSynchronizedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DemoAdapterFactory

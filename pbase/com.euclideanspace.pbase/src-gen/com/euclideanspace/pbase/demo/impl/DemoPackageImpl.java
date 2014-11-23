/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoFactory;
import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.EuclidMember;
import com.euclideanspace.pbase.demo.EuclidParameter;
import com.euclideanspace.pbase.demo.Model;
import com.euclideanspace.pbase.demo.XAssignment;
import com.euclideanspace.pbase.demo.XBasicForLoopExpression;
import com.euclideanspace.pbase.demo.XBinaryOperation;
import com.euclideanspace.pbase.demo.XBlockExpression;
import com.euclideanspace.pbase.demo.XBooleanLiteral;
import com.euclideanspace.pbase.demo.XCasePart;
import com.euclideanspace.pbase.demo.XCastedExpression;
import com.euclideanspace.pbase.demo.XCatchClause;
import com.euclideanspace.pbase.demo.XClosure;
import com.euclideanspace.pbase.demo.XCollectionLiteral;
import com.euclideanspace.pbase.demo.XConstructorCall;
import com.euclideanspace.pbase.demo.XDoWhileExpression;
import com.euclideanspace.pbase.demo.XExpression;
import com.euclideanspace.pbase.demo.XFeatureCall;
import com.euclideanspace.pbase.demo.XForLoopExpression;
import com.euclideanspace.pbase.demo.XIfExpression;
import com.euclideanspace.pbase.demo.XInstanceOfExpression;
import com.euclideanspace.pbase.demo.XListLiteral;
import com.euclideanspace.pbase.demo.XMemberFeatureCall;
import com.euclideanspace.pbase.demo.XNullLiteral;
import com.euclideanspace.pbase.demo.XNumberLiteral;
import com.euclideanspace.pbase.demo.XPostfixOperation;
import com.euclideanspace.pbase.demo.XReturnExpression;
import com.euclideanspace.pbase.demo.XSetLiteral;
import com.euclideanspace.pbase.demo.XStringLiteral;
import com.euclideanspace.pbase.demo.XSwitchExpression;
import com.euclideanspace.pbase.demo.XSynchronizedExpression;
import com.euclideanspace.pbase.demo.XThrowExpression;
import com.euclideanspace.pbase.demo.XTryCatchFinallyExpression;
import com.euclideanspace.pbase.demo.XTypeLiteral;
import com.euclideanspace.pbase.demo.XUnaryOperation;
import com.euclideanspace.pbase.demo.XVariableDeclaration;
import com.euclideanspace.pbase.demo.XWhileExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoPackageImpl extends EPackageImpl implements DemoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass euclidParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xCollectionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSetLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xListLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xCasePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xCatchClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBinaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xInstanceOfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xUnaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xCastedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xPostfixOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xMemberFeatureCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xClosureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBlockExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xIfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSwitchExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xForLoopExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBasicForLoopExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xWhileExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDoWhileExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xFeatureCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xConstructorCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBooleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xNullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xNumberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xStringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xThrowExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xReturnExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xTryCatchFinallyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSynchronizedExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.euclideanspace.pbase.demo.DemoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DemoPackageImpl()
  {
    super(eNS_URI, DemoFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DemoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DemoPackage init()
  {
    if (isInited) return (DemoPackage)EPackage.Registry.INSTANCE.getEPackage(DemoPackage.eNS_URI);

    // Obtain or create and register package
    DemoPackageImpl theDemoPackage = (DemoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemoPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDemoPackage.createPackageContents();

    // Initialize created meta-data
    theDemoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDemoPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DemoPackage.eNS_URI, theDemoPackage);
    return theDemoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_M()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidMember()
  {
    return euclidMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Extension()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Final()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Type()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Name1()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Static()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Name2()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidMember_InitialValue()
  {
    return (EReference)euclidMemberEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Name()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_TypeParameters()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Extends()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Implements()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidMember_Members()
  {
    return (EReference)euclidMemberEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Override()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Dispatch()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_ReturnType()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Name3()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Name4()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidMember_Parameters()
  {
    return (EReference)euclidMemberEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidMember_Exceptions()
  {
    return (EAttribute)euclidMemberEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEuclidMember_Expression()
  {
    return (EReference)euclidMemberEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEuclidParameter()
  {
    return euclidParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidParameter_ParameterType()
  {
    return (EAttribute)euclidParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidParameter_VarArg()
  {
    return (EAttribute)euclidParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEuclidParameter_Name()
  {
    return (EAttribute)euclidParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression()
  {
    return xExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXCollectionLiteral()
  {
    return xCollectionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCollectionLiteral_Elements()
  {
    return (EReference)xCollectionLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSetLiteral()
  {
    return xSetLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXListLiteral()
  {
    return xListLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXCasePart()
  {
    return xCasePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXCasePart_TypeGuard()
  {
    return (EAttribute)xCasePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCasePart_Case()
  {
    return (EReference)xCasePartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCasePart_Then()
  {
    return (EReference)xCasePartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXCasePart_FallThrough()
  {
    return (EAttribute)xCasePartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXCatchClause()
  {
    return xCatchClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXCatchClause_DeclaredParam()
  {
    return (EAttribute)xCatchClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCatchClause_Expression()
  {
    return (EReference)xCatchClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXAssignment()
  {
    return xAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXAssignment_Feature()
  {
    return (EAttribute)xAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXAssignment_Value()
  {
    return (EReference)xAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXAssignment_Assignable()
  {
    return (EReference)xAssignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXAssignment_ExplicitStatic()
  {
    return (EAttribute)xAssignmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBinaryOperation()
  {
    return xBinaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBinaryOperation_LeftOperand()
  {
    return (EReference)xBinaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXBinaryOperation_Feature()
  {
    return (EAttribute)xBinaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBinaryOperation_RightOperand()
  {
    return (EReference)xBinaryOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXInstanceOfExpression()
  {
    return xInstanceOfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXInstanceOfExpression_Expression()
  {
    return (EReference)xInstanceOfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXInstanceOfExpression_Type()
  {
    return (EAttribute)xInstanceOfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXUnaryOperation()
  {
    return xUnaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXUnaryOperation_Feature()
  {
    return (EAttribute)xUnaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXUnaryOperation_Operand()
  {
    return (EReference)xUnaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXCastedExpression()
  {
    return xCastedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCastedExpression_Target()
  {
    return (EReference)xCastedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXCastedExpression_Type()
  {
    return (EAttribute)xCastedExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXPostfixOperation()
  {
    return xPostfixOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXPostfixOperation_Operand()
  {
    return (EReference)xPostfixOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXPostfixOperation_Feature()
  {
    return (EAttribute)xPostfixOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMemberFeatureCall()
  {
    return xMemberFeatureCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMemberFeatureCall_MemberCallTarget()
  {
    return (EReference)xMemberFeatureCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMemberFeatureCall_NullSafe()
  {
    return (EAttribute)xMemberFeatureCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMemberFeatureCall_ExplicitStatic()
  {
    return (EAttribute)xMemberFeatureCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMemberFeatureCall_TypeArguments()
  {
    return (EAttribute)xMemberFeatureCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMemberFeatureCall_Feature()
  {
    return (EAttribute)xMemberFeatureCallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXMemberFeatureCall_ExplicitOperationCall()
  {
    return (EAttribute)xMemberFeatureCallEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMemberFeatureCall_MemberCallArguments()
  {
    return (EReference)xMemberFeatureCallEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXClosure()
  {
    return xClosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXClosure_DeclaredFormalParameters()
  {
    return (EAttribute)xClosureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXClosure_ExplicitSyntax()
  {
    return (EAttribute)xClosureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXClosure_Expression()
  {
    return (EReference)xClosureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBlockExpression()
  {
    return xBlockExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBlockExpression_Expressions()
  {
    return (EReference)xBlockExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXIfExpression()
  {
    return xIfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_If()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Then()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Else()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSwitchExpression()
  {
    return xSwitchExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXSwitchExpression_DeclaredParam()
  {
    return (EAttribute)xSwitchExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSwitchExpression_Switch()
  {
    return (EReference)xSwitchExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSwitchExpression_Cases()
  {
    return (EReference)xSwitchExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSwitchExpression_Default()
  {
    return (EReference)xSwitchExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXForLoopExpression()
  {
    return xForLoopExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXForLoopExpression_DeclaredParam()
  {
    return (EAttribute)xForLoopExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForLoopExpression_ForExpression()
  {
    return (EReference)xForLoopExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForLoopExpression_EachExpression()
  {
    return (EReference)xForLoopExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBasicForLoopExpression()
  {
    return xBasicForLoopExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBasicForLoopExpression_InitExpressions()
  {
    return (EReference)xBasicForLoopExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBasicForLoopExpression_Expression()
  {
    return (EReference)xBasicForLoopExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBasicForLoopExpression_UpdateExpressions()
  {
    return (EReference)xBasicForLoopExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBasicForLoopExpression_EachExpression()
  {
    return (EReference)xBasicForLoopExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXWhileExpression()
  {
    return xWhileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXWhileExpression_Predicate()
  {
    return (EReference)xWhileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXWhileExpression_Body()
  {
    return (EReference)xWhileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDoWhileExpression()
  {
    return xDoWhileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDoWhileExpression_Body()
  {
    return (EReference)xDoWhileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDoWhileExpression_Predicate()
  {
    return (EReference)xDoWhileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXVariableDeclaration()
  {
    return xVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXVariableDeclaration_Writeable()
  {
    return (EAttribute)xVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXVariableDeclaration_Type()
  {
    return (EAttribute)xVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXVariableDeclaration_Name()
  {
    return (EAttribute)xVariableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXVariableDeclaration_Right()
  {
    return (EReference)xVariableDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXFeatureCall()
  {
    return xFeatureCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXFeatureCall_TypeArguments()
  {
    return (EAttribute)xFeatureCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXFeatureCall_Feature()
  {
    return (EAttribute)xFeatureCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXFeatureCall_ExplicitOperationCall()
  {
    return (EAttribute)xFeatureCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXFeatureCall_FeatureCallArguments()
  {
    return (EReference)xFeatureCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXConstructorCall()
  {
    return xConstructorCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXConstructorCall_Constructor()
  {
    return (EAttribute)xConstructorCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXConstructorCall_TypeArguments()
  {
    return (EAttribute)xConstructorCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXConstructorCall_ExplicitConstructorCall()
  {
    return (EAttribute)xConstructorCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXConstructorCall_Arguments()
  {
    return (EReference)xConstructorCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBooleanLiteral()
  {
    return xBooleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXBooleanLiteral_IsTrue()
  {
    return (EAttribute)xBooleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXNullLiteral()
  {
    return xNullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXNumberLiteral()
  {
    return xNumberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXNumberLiteral_Value()
  {
    return (EAttribute)xNumberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXStringLiteral()
  {
    return xStringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXStringLiteral_Value()
  {
    return (EAttribute)xStringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXTypeLiteral()
  {
    return xTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXTypeLiteral_Type()
  {
    return (EAttribute)xTypeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXTypeLiteral_ArrayDimensions()
  {
    return (EAttribute)xTypeLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXThrowExpression()
  {
    return xThrowExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXThrowExpression_Expression()
  {
    return (EReference)xThrowExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXReturnExpression()
  {
    return xReturnExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXReturnExpression_Expression()
  {
    return (EReference)xReturnExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXTryCatchFinallyExpression()
  {
    return xTryCatchFinallyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXTryCatchFinallyExpression_Expression()
  {
    return (EReference)xTryCatchFinallyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXTryCatchFinallyExpression_CatchClauses()
  {
    return (EReference)xTryCatchFinallyExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXTryCatchFinallyExpression_FinallyExpression()
  {
    return (EReference)xTryCatchFinallyExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSynchronizedExpression()
  {
    return xSynchronizedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSynchronizedExpression_Param()
  {
    return (EReference)xSynchronizedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSynchronizedExpression_Expression()
  {
    return (EReference)xSynchronizedExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DemoFactory getDemoFactory()
  {
    return (DemoFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__M);

    euclidMemberEClass = createEClass(EUCLID_MEMBER);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__EXTENSION);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__FINAL);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__TYPE);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__NAME1);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__STATIC);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__NAME2);
    createEReference(euclidMemberEClass, EUCLID_MEMBER__INITIAL_VALUE);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__NAME);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__TYPE_PARAMETERS);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__EXTENDS);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__IMPLEMENTS);
    createEReference(euclidMemberEClass, EUCLID_MEMBER__MEMBERS);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__OVERRIDE);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__DISPATCH);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__RETURN_TYPE);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__NAME3);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__NAME4);
    createEReference(euclidMemberEClass, EUCLID_MEMBER__PARAMETERS);
    createEAttribute(euclidMemberEClass, EUCLID_MEMBER__EXCEPTIONS);
    createEReference(euclidMemberEClass, EUCLID_MEMBER__EXPRESSION);

    euclidParameterEClass = createEClass(EUCLID_PARAMETER);
    createEAttribute(euclidParameterEClass, EUCLID_PARAMETER__PARAMETER_TYPE);
    createEAttribute(euclidParameterEClass, EUCLID_PARAMETER__VAR_ARG);
    createEAttribute(euclidParameterEClass, EUCLID_PARAMETER__NAME);

    xExpressionEClass = createEClass(XEXPRESSION);

    xCollectionLiteralEClass = createEClass(XCOLLECTION_LITERAL);
    createEReference(xCollectionLiteralEClass, XCOLLECTION_LITERAL__ELEMENTS);

    xSetLiteralEClass = createEClass(XSET_LITERAL);

    xListLiteralEClass = createEClass(XLIST_LITERAL);

    xCasePartEClass = createEClass(XCASE_PART);
    createEAttribute(xCasePartEClass, XCASE_PART__TYPE_GUARD);
    createEReference(xCasePartEClass, XCASE_PART__CASE);
    createEReference(xCasePartEClass, XCASE_PART__THEN);
    createEAttribute(xCasePartEClass, XCASE_PART__FALL_THROUGH);

    xCatchClauseEClass = createEClass(XCATCH_CLAUSE);
    createEAttribute(xCatchClauseEClass, XCATCH_CLAUSE__DECLARED_PARAM);
    createEReference(xCatchClauseEClass, XCATCH_CLAUSE__EXPRESSION);

    xAssignmentEClass = createEClass(XASSIGNMENT);
    createEAttribute(xAssignmentEClass, XASSIGNMENT__FEATURE);
    createEReference(xAssignmentEClass, XASSIGNMENT__VALUE);
    createEReference(xAssignmentEClass, XASSIGNMENT__ASSIGNABLE);
    createEAttribute(xAssignmentEClass, XASSIGNMENT__EXPLICIT_STATIC);

    xBinaryOperationEClass = createEClass(XBINARY_OPERATION);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__LEFT_OPERAND);
    createEAttribute(xBinaryOperationEClass, XBINARY_OPERATION__FEATURE);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__RIGHT_OPERAND);

    xInstanceOfExpressionEClass = createEClass(XINSTANCE_OF_EXPRESSION);
    createEReference(xInstanceOfExpressionEClass, XINSTANCE_OF_EXPRESSION__EXPRESSION);
    createEAttribute(xInstanceOfExpressionEClass, XINSTANCE_OF_EXPRESSION__TYPE);

    xUnaryOperationEClass = createEClass(XUNARY_OPERATION);
    createEAttribute(xUnaryOperationEClass, XUNARY_OPERATION__FEATURE);
    createEReference(xUnaryOperationEClass, XUNARY_OPERATION__OPERAND);

    xCastedExpressionEClass = createEClass(XCASTED_EXPRESSION);
    createEReference(xCastedExpressionEClass, XCASTED_EXPRESSION__TARGET);
    createEAttribute(xCastedExpressionEClass, XCASTED_EXPRESSION__TYPE);

    xPostfixOperationEClass = createEClass(XPOSTFIX_OPERATION);
    createEReference(xPostfixOperationEClass, XPOSTFIX_OPERATION__OPERAND);
    createEAttribute(xPostfixOperationEClass, XPOSTFIX_OPERATION__FEATURE);

    xMemberFeatureCallEClass = createEClass(XMEMBER_FEATURE_CALL);
    createEReference(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET);
    createEAttribute(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__NULL_SAFE);
    createEAttribute(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__EXPLICIT_STATIC);
    createEAttribute(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__TYPE_ARGUMENTS);
    createEAttribute(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__FEATURE);
    createEAttribute(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__EXPLICIT_OPERATION_CALL);
    createEReference(xMemberFeatureCallEClass, XMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS);

    xClosureEClass = createEClass(XCLOSURE);
    createEAttribute(xClosureEClass, XCLOSURE__DECLARED_FORMAL_PARAMETERS);
    createEAttribute(xClosureEClass, XCLOSURE__EXPLICIT_SYNTAX);
    createEReference(xClosureEClass, XCLOSURE__EXPRESSION);

    xBlockExpressionEClass = createEClass(XBLOCK_EXPRESSION);
    createEReference(xBlockExpressionEClass, XBLOCK_EXPRESSION__EXPRESSIONS);

    xIfExpressionEClass = createEClass(XIF_EXPRESSION);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__IF);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__THEN);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__ELSE);

    xSwitchExpressionEClass = createEClass(XSWITCH_EXPRESSION);
    createEAttribute(xSwitchExpressionEClass, XSWITCH_EXPRESSION__DECLARED_PARAM);
    createEReference(xSwitchExpressionEClass, XSWITCH_EXPRESSION__SWITCH);
    createEReference(xSwitchExpressionEClass, XSWITCH_EXPRESSION__CASES);
    createEReference(xSwitchExpressionEClass, XSWITCH_EXPRESSION__DEFAULT);

    xForLoopExpressionEClass = createEClass(XFOR_LOOP_EXPRESSION);
    createEAttribute(xForLoopExpressionEClass, XFOR_LOOP_EXPRESSION__DECLARED_PARAM);
    createEReference(xForLoopExpressionEClass, XFOR_LOOP_EXPRESSION__FOR_EXPRESSION);
    createEReference(xForLoopExpressionEClass, XFOR_LOOP_EXPRESSION__EACH_EXPRESSION);

    xBasicForLoopExpressionEClass = createEClass(XBASIC_FOR_LOOP_EXPRESSION);
    createEReference(xBasicForLoopExpressionEClass, XBASIC_FOR_LOOP_EXPRESSION__INIT_EXPRESSIONS);
    createEReference(xBasicForLoopExpressionEClass, XBASIC_FOR_LOOP_EXPRESSION__EXPRESSION);
    createEReference(xBasicForLoopExpressionEClass, XBASIC_FOR_LOOP_EXPRESSION__UPDATE_EXPRESSIONS);
    createEReference(xBasicForLoopExpressionEClass, XBASIC_FOR_LOOP_EXPRESSION__EACH_EXPRESSION);

    xWhileExpressionEClass = createEClass(XWHILE_EXPRESSION);
    createEReference(xWhileExpressionEClass, XWHILE_EXPRESSION__PREDICATE);
    createEReference(xWhileExpressionEClass, XWHILE_EXPRESSION__BODY);

    xDoWhileExpressionEClass = createEClass(XDO_WHILE_EXPRESSION);
    createEReference(xDoWhileExpressionEClass, XDO_WHILE_EXPRESSION__BODY);
    createEReference(xDoWhileExpressionEClass, XDO_WHILE_EXPRESSION__PREDICATE);

    xVariableDeclarationEClass = createEClass(XVARIABLE_DECLARATION);
    createEAttribute(xVariableDeclarationEClass, XVARIABLE_DECLARATION__WRITEABLE);
    createEAttribute(xVariableDeclarationEClass, XVARIABLE_DECLARATION__TYPE);
    createEAttribute(xVariableDeclarationEClass, XVARIABLE_DECLARATION__NAME);
    createEReference(xVariableDeclarationEClass, XVARIABLE_DECLARATION__RIGHT);

    xFeatureCallEClass = createEClass(XFEATURE_CALL);
    createEAttribute(xFeatureCallEClass, XFEATURE_CALL__TYPE_ARGUMENTS);
    createEAttribute(xFeatureCallEClass, XFEATURE_CALL__FEATURE);
    createEAttribute(xFeatureCallEClass, XFEATURE_CALL__EXPLICIT_OPERATION_CALL);
    createEReference(xFeatureCallEClass, XFEATURE_CALL__FEATURE_CALL_ARGUMENTS);

    xConstructorCallEClass = createEClass(XCONSTRUCTOR_CALL);
    createEAttribute(xConstructorCallEClass, XCONSTRUCTOR_CALL__CONSTRUCTOR);
    createEAttribute(xConstructorCallEClass, XCONSTRUCTOR_CALL__TYPE_ARGUMENTS);
    createEAttribute(xConstructorCallEClass, XCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL);
    createEReference(xConstructorCallEClass, XCONSTRUCTOR_CALL__ARGUMENTS);

    xBooleanLiteralEClass = createEClass(XBOOLEAN_LITERAL);
    createEAttribute(xBooleanLiteralEClass, XBOOLEAN_LITERAL__IS_TRUE);

    xNullLiteralEClass = createEClass(XNULL_LITERAL);

    xNumberLiteralEClass = createEClass(XNUMBER_LITERAL);
    createEAttribute(xNumberLiteralEClass, XNUMBER_LITERAL__VALUE);

    xStringLiteralEClass = createEClass(XSTRING_LITERAL);
    createEAttribute(xStringLiteralEClass, XSTRING_LITERAL__VALUE);

    xTypeLiteralEClass = createEClass(XTYPE_LITERAL);
    createEAttribute(xTypeLiteralEClass, XTYPE_LITERAL__TYPE);
    createEAttribute(xTypeLiteralEClass, XTYPE_LITERAL__ARRAY_DIMENSIONS);

    xThrowExpressionEClass = createEClass(XTHROW_EXPRESSION);
    createEReference(xThrowExpressionEClass, XTHROW_EXPRESSION__EXPRESSION);

    xReturnExpressionEClass = createEClass(XRETURN_EXPRESSION);
    createEReference(xReturnExpressionEClass, XRETURN_EXPRESSION__EXPRESSION);

    xTryCatchFinallyExpressionEClass = createEClass(XTRY_CATCH_FINALLY_EXPRESSION);
    createEReference(xTryCatchFinallyExpressionEClass, XTRY_CATCH_FINALLY_EXPRESSION__EXPRESSION);
    createEReference(xTryCatchFinallyExpressionEClass, XTRY_CATCH_FINALLY_EXPRESSION__CATCH_CLAUSES);
    createEReference(xTryCatchFinallyExpressionEClass, XTRY_CATCH_FINALLY_EXPRESSION__FINALLY_EXPRESSION);

    xSynchronizedExpressionEClass = createEClass(XSYNCHRONIZED_EXPRESSION);
    createEReference(xSynchronizedExpressionEClass, XSYNCHRONIZED_EXPRESSION__PARAM);
    createEReference(xSynchronizedExpressionEClass, XSYNCHRONIZED_EXPRESSION__EXPRESSION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    xCollectionLiteralEClass.getESuperTypes().add(this.getXExpression());
    xSetLiteralEClass.getESuperTypes().add(this.getXCollectionLiteral());
    xListLiteralEClass.getESuperTypes().add(this.getXCollectionLiteral());
    xAssignmentEClass.getESuperTypes().add(this.getXExpression());
    xBinaryOperationEClass.getESuperTypes().add(this.getXExpression());
    xInstanceOfExpressionEClass.getESuperTypes().add(this.getXExpression());
    xUnaryOperationEClass.getESuperTypes().add(this.getXExpression());
    xCastedExpressionEClass.getESuperTypes().add(this.getXExpression());
    xPostfixOperationEClass.getESuperTypes().add(this.getXExpression());
    xMemberFeatureCallEClass.getESuperTypes().add(this.getXExpression());
    xClosureEClass.getESuperTypes().add(this.getXExpression());
    xBlockExpressionEClass.getESuperTypes().add(this.getXExpression());
    xIfExpressionEClass.getESuperTypes().add(this.getXExpression());
    xSwitchExpressionEClass.getESuperTypes().add(this.getXExpression());
    xForLoopExpressionEClass.getESuperTypes().add(this.getXExpression());
    xBasicForLoopExpressionEClass.getESuperTypes().add(this.getXExpression());
    xWhileExpressionEClass.getESuperTypes().add(this.getXExpression());
    xDoWhileExpressionEClass.getESuperTypes().add(this.getXExpression());
    xVariableDeclarationEClass.getESuperTypes().add(this.getXExpression());
    xFeatureCallEClass.getESuperTypes().add(this.getXExpression());
    xConstructorCallEClass.getESuperTypes().add(this.getXExpression());
    xBooleanLiteralEClass.getESuperTypes().add(this.getXExpression());
    xNullLiteralEClass.getESuperTypes().add(this.getXExpression());
    xNumberLiteralEClass.getESuperTypes().add(this.getXExpression());
    xStringLiteralEClass.getESuperTypes().add(this.getXExpression());
    xTypeLiteralEClass.getESuperTypes().add(this.getXExpression());
    xThrowExpressionEClass.getESuperTypes().add(this.getXExpression());
    xReturnExpressionEClass.getESuperTypes().add(this.getXExpression());
    xTryCatchFinallyExpressionEClass.getESuperTypes().add(this.getXExpression());
    xSynchronizedExpressionEClass.getESuperTypes().add(this.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_M(), this.getEuclidMember(), null, "m", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidMemberEClass, EuclidMember.class, "EuclidMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidMember_Extension(), ecorePackage.getEBoolean(), "extension", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Type(), ecorePackage.getEString(), "type", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Name1(), ecorePackage.getEString(), "name1", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Name2(), ecorePackage.getEString(), "name2", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidMember_InitialValue(), this.getXExpression(), null, "initialValue", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_TypeParameters(), ecorePackage.getEString(), "typeParameters", null, 0, -1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Implements(), ecorePackage.getEString(), "implements", null, 0, -1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidMember_Members(), this.getEuclidMember(), null, "members", null, 0, -1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Dispatch(), ecorePackage.getEBoolean(), "dispatch", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Name3(), ecorePackage.getEString(), "name3", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Name4(), ecorePackage.getEString(), "name4", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidMember_Parameters(), this.getEuclidParameter(), null, "parameters", null, 0, -1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidMember_Exceptions(), ecorePackage.getEString(), "exceptions", null, 0, -1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEuclidMember_Expression(), this.getXExpression(), null, "expression", null, 0, 1, EuclidMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(euclidParameterEClass, EuclidParameter.class, "EuclidParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEuclidParameter_ParameterType(), ecorePackage.getEString(), "parameterType", null, 0, 1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidParameter_VarArg(), ecorePackage.getEBoolean(), "varArg", null, 0, 1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEuclidParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, EuclidParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpressionEClass, XExpression.class, "XExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xCollectionLiteralEClass, XCollectionLiteral.class, "XCollectionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXCollectionLiteral_Elements(), this.getXExpression(), null, "elements", null, 0, -1, XCollectionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSetLiteralEClass, XSetLiteral.class, "XSetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xListLiteralEClass, XListLiteral.class, "XListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xCasePartEClass, XCasePart.class, "XCasePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXCasePart_TypeGuard(), ecorePackage.getEString(), "typeGuard", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXCasePart_Case(), this.getXExpression(), null, "case", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXCasePart_Then(), this.getXExpression(), null, "then", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXCasePart_FallThrough(), ecorePackage.getEBoolean(), "fallThrough", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xCatchClauseEClass, XCatchClause.class, "XCatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXCatchClause_DeclaredParam(), ecorePackage.getEString(), "declaredParam", null, 0, 1, XCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXCatchClause_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XCatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xAssignmentEClass, XAssignment.class, "XAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXAssignment_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXAssignment_Value(), this.getXExpression(), null, "value", null, 0, 1, XAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXAssignment_Assignable(), this.getXExpression(), null, "assignable", null, 0, 1, XAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXAssignment_ExplicitStatic(), ecorePackage.getEBoolean(), "explicitStatic", null, 0, 1, XAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBinaryOperationEClass, XBinaryOperation.class, "XBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBinaryOperation_LeftOperand(), this.getXExpression(), null, "leftOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBinaryOperation_RightOperand(), this.getXExpression(), null, "rightOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xInstanceOfExpressionEClass, XInstanceOfExpression.class, "XInstanceOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXInstanceOfExpression_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXInstanceOfExpression_Type(), ecorePackage.getEString(), "type", null, 0, 1, XInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xUnaryOperationEClass, XUnaryOperation.class, "XUnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXUnaryOperation_Operand(), this.getXExpression(), null, "operand", null, 0, 1, XUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xCastedExpressionEClass, XCastedExpression.class, "XCastedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXCastedExpression_Target(), this.getXExpression(), null, "target", null, 0, 1, XCastedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXCastedExpression_Type(), ecorePackage.getEString(), "type", null, 0, 1, XCastedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xPostfixOperationEClass, XPostfixOperation.class, "XPostfixOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXPostfixOperation_Operand(), this.getXExpression(), null, "operand", null, 0, 1, XPostfixOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXPostfixOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XPostfixOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xMemberFeatureCallEClass, XMemberFeatureCall.class, "XMemberFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMemberFeatureCall_MemberCallTarget(), this.getXExpression(), null, "memberCallTarget", null, 0, 1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMemberFeatureCall_NullSafe(), ecorePackage.getEBoolean(), "nullSafe", null, 0, 1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMemberFeatureCall_ExplicitStatic(), ecorePackage.getEBoolean(), "explicitStatic", null, 0, 1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMemberFeatureCall_TypeArguments(), ecorePackage.getEString(), "typeArguments", null, 0, -1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMemberFeatureCall_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXMemberFeatureCall_ExplicitOperationCall(), ecorePackage.getEBoolean(), "explicitOperationCall", null, 0, 1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMemberFeatureCall_MemberCallArguments(), this.getXExpression(), null, "memberCallArguments", null, 0, -1, XMemberFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xClosureEClass, XClosure.class, "XClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXClosure_DeclaredFormalParameters(), ecorePackage.getEString(), "declaredFormalParameters", null, 0, -1, XClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXClosure_ExplicitSyntax(), ecorePackage.getEBoolean(), "explicitSyntax", null, 0, 1, XClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXClosure_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBlockExpressionEClass, XBlockExpression.class, "XBlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBlockExpression_Expressions(), this.getXExpression(), null, "expressions", null, 0, -1, XBlockExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIfExpressionEClass, XIfExpression.class, "XIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIfExpression_If(), this.getXExpression(), null, "if", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Then(), this.getXExpression(), null, "then", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Else(), this.getXExpression(), null, "else", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSwitchExpressionEClass, XSwitchExpression.class, "XSwitchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXSwitchExpression_DeclaredParam(), ecorePackage.getEString(), "declaredParam", null, 0, 1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXSwitchExpression_Switch(), this.getXExpression(), null, "switch", null, 0, 1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXSwitchExpression_Cases(), this.getXCasePart(), null, "cases", null, 0, -1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXSwitchExpression_Default(), this.getXExpression(), null, "default", null, 0, 1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xForLoopExpressionEClass, XForLoopExpression.class, "XForLoopExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXForLoopExpression_DeclaredParam(), ecorePackage.getEString(), "declaredParam", null, 0, 1, XForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForLoopExpression_ForExpression(), this.getXExpression(), null, "forExpression", null, 0, 1, XForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForLoopExpression_EachExpression(), this.getXExpression(), null, "eachExpression", null, 0, 1, XForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBasicForLoopExpressionEClass, XBasicForLoopExpression.class, "XBasicForLoopExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBasicForLoopExpression_InitExpressions(), this.getXExpression(), null, "initExpressions", null, 0, -1, XBasicForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBasicForLoopExpression_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XBasicForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBasicForLoopExpression_UpdateExpressions(), this.getXExpression(), null, "updateExpressions", null, 0, -1, XBasicForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBasicForLoopExpression_EachExpression(), this.getXExpression(), null, "eachExpression", null, 0, 1, XBasicForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xWhileExpressionEClass, XWhileExpression.class, "XWhileExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXWhileExpression_Predicate(), this.getXExpression(), null, "predicate", null, 0, 1, XWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXWhileExpression_Body(), this.getXExpression(), null, "body", null, 0, 1, XWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xDoWhileExpressionEClass, XDoWhileExpression.class, "XDoWhileExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXDoWhileExpression_Body(), this.getXExpression(), null, "body", null, 0, 1, XDoWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDoWhileExpression_Predicate(), this.getXExpression(), null, "predicate", null, 0, 1, XDoWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xVariableDeclarationEClass, XVariableDeclaration.class, "XVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXVariableDeclaration_Writeable(), ecorePackage.getEBoolean(), "writeable", null, 0, 1, XVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXVariableDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, XVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, XVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXVariableDeclaration_Right(), this.getXExpression(), null, "right", null, 0, 1, XVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xFeatureCallEClass, XFeatureCall.class, "XFeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXFeatureCall_TypeArguments(), ecorePackage.getEString(), "typeArguments", null, 0, -1, XFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXFeatureCall_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXFeatureCall_ExplicitOperationCall(), ecorePackage.getEBoolean(), "explicitOperationCall", null, 0, 1, XFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXFeatureCall_FeatureCallArguments(), this.getXExpression(), null, "featureCallArguments", null, 0, -1, XFeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xConstructorCallEClass, XConstructorCall.class, "XConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXConstructorCall_Constructor(), ecorePackage.getEString(), "constructor", null, 0, 1, XConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXConstructorCall_TypeArguments(), ecorePackage.getEString(), "typeArguments", null, 0, -1, XConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXConstructorCall_ExplicitConstructorCall(), ecorePackage.getEBoolean(), "explicitConstructorCall", null, 0, 1, XConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXConstructorCall_Arguments(), this.getXExpression(), null, "arguments", null, 0, -1, XConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBooleanLiteralEClass, XBooleanLiteral.class, "XBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXBooleanLiteral_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 0, 1, XBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xNullLiteralEClass, XNullLiteral.class, "XNullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xNumberLiteralEClass, XNumberLiteral.class, "XNumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXNumberLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, XNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xStringLiteralEClass, XStringLiteral.class, "XStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, XStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xTypeLiteralEClass, XTypeLiteral.class, "XTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXTypeLiteral_Type(), ecorePackage.getEString(), "type", null, 0, 1, XTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXTypeLiteral_ArrayDimensions(), ecorePackage.getEString(), "arrayDimensions", null, 0, -1, XTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xThrowExpressionEClass, XThrowExpression.class, "XThrowExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXThrowExpression_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XThrowExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xReturnExpressionEClass, XReturnExpression.class, "XReturnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXReturnExpression_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XReturnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xTryCatchFinallyExpressionEClass, XTryCatchFinallyExpression.class, "XTryCatchFinallyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXTryCatchFinallyExpression_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XTryCatchFinallyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXTryCatchFinallyExpression_CatchClauses(), this.getXCatchClause(), null, "catchClauses", null, 0, -1, XTryCatchFinallyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXTryCatchFinallyExpression_FinallyExpression(), this.getXExpression(), null, "finallyExpression", null, 0, 1, XTryCatchFinallyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSynchronizedExpressionEClass, XSynchronizedExpression.class, "XSynchronizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXSynchronizedExpression_Param(), this.getXExpression(), null, "param", null, 0, 1, XSynchronizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXSynchronizedExpression_Expression(), this.getXExpression(), null, "expression", null, 0, 1, XSynchronizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DemoPackageImpl

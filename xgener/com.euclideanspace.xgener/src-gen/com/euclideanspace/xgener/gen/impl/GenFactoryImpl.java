/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.*;

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
public class GenFactoryImpl extends EFactoryImpl implements GenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenFactory init()
  {
    try
    {
      GenFactory theGenFactory = (GenFactory)EPackage.Registry.INSTANCE.getEFactory(GenPackage.eNS_URI);
      if (theGenFactory != null)
      {
        return theGenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenFactoryImpl()
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
      case GenPackage.MODEL: return createModel();
      case GenPackage.CLASS_TYPE: return createClassType();
      case GenPackage.PROCEDURE: return createProcedure();
      case GenPackage.EXPRESSION: return createExpression();
      case GenPackage.PRECEDENCE: return createPrecedence();
      case GenPackage.INNER_PRECEDENCE: return createInnerPrecedence();
      case GenPackage.MULT_ID: return createMultID();
      case GenPackage.MULT_STRING: return createMultString();
      case GenPackage.PRIMARY: return createPrimary();
      case GenPackage.PRIMARY_INNER: return createPrimaryInner();
      case GenPackage.LITERAL: return createLiteral();
      case GenPackage.LITERAL_INNER: return createLiteralInner();
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
  public ClassType createClassType()
  {
    ClassTypeImpl classType = new ClassTypeImpl();
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precedence createPrecedence()
  {
    PrecedenceImpl precedence = new PrecedenceImpl();
    return precedence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerPrecedence createInnerPrecedence()
  {
    InnerPrecedenceImpl innerPrecedence = new InnerPrecedenceImpl();
    return innerPrecedence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultID createMultID()
  {
    MultIDImpl multID = new MultIDImpl();
    return multID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultString createMultString()
  {
    MultStringImpl multString = new MultStringImpl();
    return multString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryInner createPrimaryInner()
  {
    PrimaryInnerImpl primaryInner = new PrimaryInnerImpl();
    return primaryInner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralInner createLiteralInner()
  {
    LiteralInnerImpl literalInner = new LiteralInnerImpl();
    return literalInner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenPackage getGenPackage()
  {
    return (GenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GenPackage getPackage()
  {
    return GenPackage.eINSTANCE;
  }

} //GenFactoryImpl

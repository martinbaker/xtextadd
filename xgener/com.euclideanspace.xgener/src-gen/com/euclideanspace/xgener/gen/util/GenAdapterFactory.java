/**
 */
package com.euclideanspace.xgener.gen.util;

import com.euclideanspace.xgener.gen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.euclideanspace.xgener.gen.GenPackage
 * @generated
 */
public class GenAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GenPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GenPackage.eINSTANCE;
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
  protected GenSwitch<Adapter> modelSwitch =
    new GenSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseClassType(ClassType object)
      {
        return createClassTypeAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter casePrecedence(Precedence object)
      {
        return createPrecedenceAdapter();
      }
      @Override
      public Adapter caseSubPrecedence(SubPrecedence object)
      {
        return createSubPrecedenceAdapter();
      }
      @Override
      public Adapter caseInnerPrecedence(InnerPrecedence object)
      {
        return createInnerPrecedenceAdapter();
      }
      @Override
      public Adapter caseMultString(MultString object)
      {
        return createMultStringAdapter();
      }
      @Override
      public Adapter caseComboString(ComboString object)
      {
        return createComboStringAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter casePrimaryInner(PrimaryInner object)
      {
        return createPrimaryInnerAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseLiteralInner(LiteralInner object)
      {
        return createLiteralInnerAdapter();
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
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.ClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.ClassType
   * @generated
   */
  public Adapter createClassTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Precedence <em>Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Precedence
   * @generated
   */
  public Adapter createPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.SubPrecedence <em>Sub Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.SubPrecedence
   * @generated
   */
  public Adapter createSubPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.InnerPrecedence <em>Inner Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.InnerPrecedence
   * @generated
   */
  public Adapter createInnerPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.MultString <em>Mult String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.MultString
   * @generated
   */
  public Adapter createMultStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.ComboString <em>Combo String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.ComboString
   * @generated
   */
  public Adapter createComboStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.PrimaryInner <em>Primary Inner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.PrimaryInner
   * @generated
   */
  public Adapter createPrimaryInnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.euclideanspace.xgener.gen.LiteralInner <em>Literal Inner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.euclideanspace.xgener.gen.LiteralInner
   * @generated
   */
  public Adapter createLiteralInnerAdapter()
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

} //GenAdapterFactory

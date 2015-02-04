/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.ClassType;
import com.euclideanspace.xgener.gen.ComboString;
import com.euclideanspace.xgener.gen.Expression;
import com.euclideanspace.xgener.gen.GenFactory;
import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.InnerPrecedence;
import com.euclideanspace.xgener.gen.Literal;
import com.euclideanspace.xgener.gen.LiteralInner;
import com.euclideanspace.xgener.gen.Model;
import com.euclideanspace.xgener.gen.MultString;
import com.euclideanspace.xgener.gen.Precedence;
import com.euclideanspace.xgener.gen.Primary;
import com.euclideanspace.xgener.gen.PrimaryInner;
import com.euclideanspace.xgener.gen.Procedure;
import com.euclideanspace.xgener.gen.Project;
import com.euclideanspace.xgener.gen.SubPrecedence;

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
public class GenPackageImpl extends EPackageImpl implements GenPackage
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
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass precedenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subPrecedenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass innerPrecedenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comboStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryInnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalInnerEClass = null;

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
   * @see com.euclideanspace.xgener.gen.GenPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GenPackageImpl()
  {
    super(eNS_URI, GenFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GenPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GenPackage init()
  {
    if (isInited) return (GenPackage)EPackage.Registry.INSTANCE.getEPackage(GenPackage.eNS_URI);

    // Obtain or create and register package
    GenPackageImpl theGenPackage = (GenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGenPackage.createPackageContents();

    // Initialize created meta-data
    theGenPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGenPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GenPackage.eNS_URI, theGenPackage);
    return theGenPackage;
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
  public EReference getModel_Proj()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Clas()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Proc()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Prim()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Lit()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Exp()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Name()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Proj()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Nam()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassType()
  {
    return classTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassType_Name()
  {
    return (EAttribute)classTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassType_Noclass()
  {
    return (EAttribute)classTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassType_Prefix()
  {
    return (EReference)classTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassType_Suffix()
  {
    return (EReference)classTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassType_Blocking()
  {
    return (EAttribute)classTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Name()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Prefix()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_Suffix()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Types()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Name()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Prec()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrecedence()
  {
    return precedenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Ruletyp()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Rule()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Feature1()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Customrule()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecedence_Prefix()
  {
    return (EReference)precedenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Par1()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecedence_Suffix()
  {
    return (EReference)precedenceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecedence_Infix()
  {
    return (EReference)precedenceEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Feature2()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Par2()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecedence_Inner()
  {
    return (EReference)precedenceEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecedence_Prec()
  {
    return (EReference)precedenceEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Bracket()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Braces()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Parenthesis()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrecedence_Angle()
  {
    return (EAttribute)precedenceEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubPrecedence()
  {
    return subPrecedenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Ruletyp()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Customrule()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubPrecedence_Prefix()
  {
    return (EReference)subPrecedenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Feature1()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Par2()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubPrecedence_Suffix()
  {
    return (EReference)subPrecedenceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Par1()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubPrecedence_Infix()
  {
    return (EReference)subPrecedenceEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Feature2()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Rule()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Bracket()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Braces()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Parenthesis()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubPrecedence_Angle()
  {
    return (EAttribute)subPrecedenceEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInnerPrecedence()
  {
    return innerPrecedenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Ruletyp()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Customrule()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInnerPrecedence_Prefix()
  {
    return (EReference)innerPrecedenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Feature1()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Par2()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInnerPrecedence_Suffix()
  {
    return (EReference)innerPrecedenceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Mod()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Rule()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInnerPrecedence_Infix()
  {
    return (EReference)innerPrecedenceEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Feature2()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Bracket()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Braces()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Parenthesis()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInnerPrecedence_Angle()
  {
    return (EAttribute)innerPrecedenceEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultString()
  {
    return multStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultString_Ms()
  {
    return (EAttribute)multStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultString_Opt()
  {
    return (EAttribute)multStringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultString_Mi()
  {
    return (EAttribute)multStringEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultString_Synpred()
  {
    return (EAttribute)multStringEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultString_Cs()
  {
    return (EReference)multStringEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComboString()
  {
    return comboStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComboString_Inner()
  {
    return (EReference)comboStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimary()
  {
    return primaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimary_Name()
  {
    return (EAttribute)primaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimary_Inner()
  {
    return (EReference)primaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryInner()
  {
    return primaryInnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryInner_Primarytyp()
  {
    return (EAttribute)primaryInnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryInner_Construct()
  {
    return (EAttribute)primaryInnerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryInner_Construct2()
  {
    return (EAttribute)primaryInnerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryInner_Feature()
  {
    return (EReference)primaryInnerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Name()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Inner()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralInner()
  {
    return literalInnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralInner_Primarytyp()
  {
    return (EAttribute)literalInnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralInner_Construct()
  {
    return (EAttribute)literalInnerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenFactory getGenFactory()
  {
    return (GenFactory)getEFactoryInstance();
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
    createEReference(modelEClass, MODEL__PROJ);
    createEReference(modelEClass, MODEL__CLAS);
    createEReference(modelEClass, MODEL__PROC);
    createEReference(modelEClass, MODEL__PRIM);
    createEReference(modelEClass, MODEL__LIT);
    createEReference(modelEClass, MODEL__EXP);

    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__NAME);
    createEAttribute(projectEClass, PROJECT__PROJ);
    createEAttribute(projectEClass, PROJECT__NAM);

    classTypeEClass = createEClass(CLASS_TYPE);
    createEAttribute(classTypeEClass, CLASS_TYPE__NAME);
    createEAttribute(classTypeEClass, CLASS_TYPE__NOCLASS);
    createEReference(classTypeEClass, CLASS_TYPE__PREFIX);
    createEReference(classTypeEClass, CLASS_TYPE__SUFFIX);
    createEAttribute(classTypeEClass, CLASS_TYPE__BLOCKING);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__NAME);
    createEReference(procedureEClass, PROCEDURE__PREFIX);
    createEReference(procedureEClass, PROCEDURE__SUFFIX);
    createEAttribute(procedureEClass, PROCEDURE__TYPES);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__NAME);
    createEReference(expressionEClass, EXPRESSION__PREC);

    precedenceEClass = createEClass(PRECEDENCE);
    createEAttribute(precedenceEClass, PRECEDENCE__RULETYP);
    createEAttribute(precedenceEClass, PRECEDENCE__RULE);
    createEAttribute(precedenceEClass, PRECEDENCE__FEATURE1);
    createEAttribute(precedenceEClass, PRECEDENCE__CUSTOMRULE);
    createEReference(precedenceEClass, PRECEDENCE__PREFIX);
    createEAttribute(precedenceEClass, PRECEDENCE__PAR1);
    createEReference(precedenceEClass, PRECEDENCE__SUFFIX);
    createEReference(precedenceEClass, PRECEDENCE__INFIX);
    createEAttribute(precedenceEClass, PRECEDENCE__FEATURE2);
    createEAttribute(precedenceEClass, PRECEDENCE__PAR2);
    createEReference(precedenceEClass, PRECEDENCE__INNER);
    createEReference(precedenceEClass, PRECEDENCE__PREC);
    createEAttribute(precedenceEClass, PRECEDENCE__BRACKET);
    createEAttribute(precedenceEClass, PRECEDENCE__BRACES);
    createEAttribute(precedenceEClass, PRECEDENCE__PARENTHESIS);
    createEAttribute(precedenceEClass, PRECEDENCE__ANGLE);

    subPrecedenceEClass = createEClass(SUB_PRECEDENCE);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__RULETYP);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__CUSTOMRULE);
    createEReference(subPrecedenceEClass, SUB_PRECEDENCE__PREFIX);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__FEATURE1);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__PAR2);
    createEReference(subPrecedenceEClass, SUB_PRECEDENCE__SUFFIX);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__PAR1);
    createEReference(subPrecedenceEClass, SUB_PRECEDENCE__INFIX);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__FEATURE2);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__RULE);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__BRACKET);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__BRACES);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__PARENTHESIS);
    createEAttribute(subPrecedenceEClass, SUB_PRECEDENCE__ANGLE);

    innerPrecedenceEClass = createEClass(INNER_PRECEDENCE);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__RULETYP);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__CUSTOMRULE);
    createEReference(innerPrecedenceEClass, INNER_PRECEDENCE__PREFIX);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__FEATURE1);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__PAR2);
    createEReference(innerPrecedenceEClass, INNER_PRECEDENCE__SUFFIX);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__MOD);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__RULE);
    createEReference(innerPrecedenceEClass, INNER_PRECEDENCE__INFIX);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__FEATURE2);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__BRACKET);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__BRACES);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__PARENTHESIS);
    createEAttribute(innerPrecedenceEClass, INNER_PRECEDENCE__ANGLE);

    multStringEClass = createEClass(MULT_STRING);
    createEAttribute(multStringEClass, MULT_STRING__MS);
    createEAttribute(multStringEClass, MULT_STRING__OPT);
    createEAttribute(multStringEClass, MULT_STRING__MI);
    createEAttribute(multStringEClass, MULT_STRING__SYNPRED);
    createEReference(multStringEClass, MULT_STRING__CS);

    comboStringEClass = createEClass(COMBO_STRING);
    createEReference(comboStringEClass, COMBO_STRING__INNER);

    primaryEClass = createEClass(PRIMARY);
    createEAttribute(primaryEClass, PRIMARY__NAME);
    createEReference(primaryEClass, PRIMARY__INNER);

    primaryInnerEClass = createEClass(PRIMARY_INNER);
    createEAttribute(primaryInnerEClass, PRIMARY_INNER__PRIMARYTYP);
    createEAttribute(primaryInnerEClass, PRIMARY_INNER__CONSTRUCT);
    createEAttribute(primaryInnerEClass, PRIMARY_INNER__CONSTRUCT2);
    createEReference(primaryInnerEClass, PRIMARY_INNER__FEATURE);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__NAME);
    createEReference(literalEClass, LITERAL__INNER);

    literalInnerEClass = createEClass(LITERAL_INNER);
    createEAttribute(literalInnerEClass, LITERAL_INNER__PRIMARYTYP);
    createEAttribute(literalInnerEClass, LITERAL_INNER__CONSTRUCT);
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

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Proj(), this.getProject(), null, "proj", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Clas(), this.getClassType(), null, "clas", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Proc(), this.getProcedure(), null, "proc", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Prim(), this.getPrimary(), null, "prim", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Lit(), this.getLiteral(), null, "lit", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Exp(), this.getExpression(), null, "exp", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_Proj(), ecorePackage.getEString(), "proj", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_Nam(), ecorePackage.getEString(), "nam", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassType_Noclass(), ecorePackage.getEString(), "noclass", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassType_Prefix(), this.getMultString(), null, "prefix", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassType_Suffix(), this.getMultString(), null, "suffix", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassType_Blocking(), ecorePackage.getEString(), "blocking", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Prefix(), this.getMultString(), null, "prefix", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_Suffix(), this.getMultString(), null, "suffix", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcedure_Types(), ecorePackage.getEString(), "types", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Prec(), this.getPrecedence(), null, "prec", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(precedenceEClass, Precedence.class, "Precedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrecedence_Ruletyp(), ecorePackage.getEString(), "ruletyp", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Feature1(), ecorePackage.getEString(), "feature1", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Customrule(), ecorePackage.getEString(), "customrule", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrecedence_Prefix(), this.getMultString(), null, "prefix", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Par1(), ecorePackage.getEString(), "par1", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrecedence_Suffix(), this.getMultString(), null, "suffix", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrecedence_Infix(), this.getMultString(), null, "infix", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Feature2(), ecorePackage.getEString(), "feature2", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Par2(), ecorePackage.getEString(), "par2", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrecedence_Inner(), this.getInnerPrecedence(), null, "inner", null, 0, -1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrecedence_Prec(), this.getSubPrecedence(), null, "prec", null, 0, -1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Bracket(), ecorePackage.getEString(), "bracket", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Braces(), ecorePackage.getEString(), "braces", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Parenthesis(), ecorePackage.getEString(), "parenthesis", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrecedence_Angle(), ecorePackage.getEString(), "angle", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subPrecedenceEClass, SubPrecedence.class, "SubPrecedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubPrecedence_Ruletyp(), ecorePackage.getEString(), "ruletyp", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Customrule(), ecorePackage.getEString(), "customrule", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubPrecedence_Prefix(), this.getMultString(), null, "prefix", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Feature1(), ecorePackage.getEString(), "feature1", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Par2(), ecorePackage.getEString(), "par2", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubPrecedence_Suffix(), this.getMultString(), null, "suffix", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Par1(), ecorePackage.getEString(), "par1", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubPrecedence_Infix(), this.getMultString(), null, "infix", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Feature2(), ecorePackage.getEString(), "feature2", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Bracket(), ecorePackage.getEString(), "bracket", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Braces(), ecorePackage.getEString(), "braces", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Parenthesis(), ecorePackage.getEString(), "parenthesis", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubPrecedence_Angle(), ecorePackage.getEString(), "angle", null, 0, 1, SubPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(innerPrecedenceEClass, InnerPrecedence.class, "InnerPrecedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInnerPrecedence_Ruletyp(), ecorePackage.getEString(), "ruletyp", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Customrule(), ecorePackage.getEString(), "customrule", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInnerPrecedence_Prefix(), this.getMultString(), null, "prefix", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Feature1(), ecorePackage.getEString(), "feature1", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Par2(), ecorePackage.getEString(), "par2", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInnerPrecedence_Suffix(), this.getMultString(), null, "suffix", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Mod(), ecorePackage.getEString(), "mod", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInnerPrecedence_Infix(), this.getMultString(), null, "infix", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Feature2(), ecorePackage.getEString(), "feature2", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Bracket(), ecorePackage.getEString(), "bracket", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Braces(), ecorePackage.getEString(), "braces", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Parenthesis(), ecorePackage.getEString(), "parenthesis", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInnerPrecedence_Angle(), ecorePackage.getEString(), "angle", null, 0, 1, InnerPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multStringEClass, MultString.class, "MultString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultString_Ms(), ecorePackage.getEString(), "ms", null, 0, 1, MultString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultString_Opt(), ecorePackage.getEBoolean(), "opt", null, 0, 1, MultString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultString_Mi(), ecorePackage.getEString(), "mi", null, 0, 1, MultString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultString_Synpred(), ecorePackage.getEString(), "synpred", null, 0, 1, MultString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultString_Cs(), this.getComboString(), null, "cs", null, 0, -1, MultString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comboStringEClass, ComboString.class, "ComboString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComboString_Inner(), this.getMultString(), null, "inner", null, 0, -1, ComboString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryEClass, Primary.class, "Primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Primary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimary_Inner(), this.getPrimaryInner(), null, "inner", null, 0, -1, Primary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryInnerEClass, PrimaryInner.class, "PrimaryInner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimaryInner_Primarytyp(), ecorePackage.getEString(), "primarytyp", null, 0, 1, PrimaryInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryInner_Construct(), ecorePackage.getEString(), "construct", null, 0, 1, PrimaryInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimaryInner_Construct2(), ecorePackage.getEString(), "construct2", null, 0, 1, PrimaryInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryInner_Feature(), this.getMultString(), null, "feature", null, 0, 1, PrimaryInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLiteral_Inner(), this.getLiteralInner(), null, "inner", null, 0, -1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalInnerEClass, LiteralInner.class, "LiteralInner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralInner_Primarytyp(), ecorePackage.getEString(), "primarytyp", null, 0, 1, LiteralInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralInner_Construct(), ecorePackage.getEString(), "construct", null, 0, 1, LiteralInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GenPackageImpl

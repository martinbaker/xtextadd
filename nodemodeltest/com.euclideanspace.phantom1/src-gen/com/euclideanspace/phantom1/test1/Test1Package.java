/**
 */
package com.euclideanspace.phantom1.test1;

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
 * @see com.euclideanspace.phantom1.test1.Test1Factory
 * @model kind="package"
 * @generated
 */
public interface Test1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "test1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.euclideanspace.com/phantom1/Test1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "test1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Test1Package eINSTANCE = com.euclideanspace.phantom1.test1.impl.Test1PackageImpl.init();

  /**
   * The meta object id for the '{@link com.euclideanspace.phantom1.test1.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.phantom1.test1.impl.ModelImpl
   * @see com.euclideanspace.phantom1.test1.impl.Test1PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.euclideanspace.phantom1.test1.impl.RecurseImpl <em>Recurse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.euclideanspace.phantom1.test1.impl.RecurseImpl
   * @see com.euclideanspace.phantom1.test1.impl.Test1PackageImpl#getRecurse()
   * @generated
   */
  int RECURSE = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSE__N = 0;

  /**
   * The feature id for the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSE__R = 1;

  /**
   * The number of structural features of the '<em>Recurse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECURSE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.euclideanspace.phantom1.test1.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.euclideanspace.phantom1.test1.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.euclideanspace.phantom1.test1.Model#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see com.euclideanspace.phantom1.test1.Model#getContents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Contents();

  /**
   * Returns the meta object for class '{@link com.euclideanspace.phantom1.test1.Recurse <em>Recurse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recurse</em>'.
   * @see com.euclideanspace.phantom1.test1.Recurse
   * @generated
   */
  EClass getRecurse();

  /**
   * Returns the meta object for the attribute '{@link com.euclideanspace.phantom1.test1.Recurse#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see com.euclideanspace.phantom1.test1.Recurse#getN()
   * @see #getRecurse()
   * @generated
   */
  EAttribute getRecurse_N();

  /**
   * Returns the meta object for the containment reference '{@link com.euclideanspace.phantom1.test1.Recurse#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R</em>'.
   * @see com.euclideanspace.phantom1.test1.Recurse#getR()
   * @see #getRecurse()
   * @generated
   */
  EReference getRecurse_R();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Test1Factory getTest1Factory();

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
     * The meta object literal for the '{@link com.euclideanspace.phantom1.test1.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.phantom1.test1.impl.ModelImpl
     * @see com.euclideanspace.phantom1.test1.impl.Test1PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTENTS = eINSTANCE.getModel_Contents();

    /**
     * The meta object literal for the '{@link com.euclideanspace.phantom1.test1.impl.RecurseImpl <em>Recurse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.euclideanspace.phantom1.test1.impl.RecurseImpl
     * @see com.euclideanspace.phantom1.test1.impl.Test1PackageImpl#getRecurse()
     * @generated
     */
    EClass RECURSE = eINSTANCE.getRecurse();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECURSE__N = eINSTANCE.getRecurse_N();

    /**
     * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECURSE__R = eINSTANCE.getRecurse_R();

  }

} //Test1Package

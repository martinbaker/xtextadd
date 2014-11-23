/**
 */
package com.euclideanspace.pbase.demo.impl;

import com.euclideanspace.pbase.demo.DemoPackage;
import com.euclideanspace.pbase.demo.EuclidMember;
import com.euclideanspace.pbase.demo.EuclidParameter;
import com.euclideanspace.pbase.demo.XExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Euclid Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#isExtension <em>Extension</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#isOverride <em>Override</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#isDispatch <em>Dispatch</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getName3 <em>Name3</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getName4 <em>Name4</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link com.euclideanspace.pbase.demo.impl.EuclidMemberImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EuclidMemberImpl extends MinimalEObjectImpl.Container implements EuclidMember
{
  /**
   * The default value of the '{@link #isExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtension()
   * @generated
   * @ordered
   */
  protected static final boolean EXTENSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtension() <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtension()
   * @generated
   * @ordered
   */
  protected boolean extension = EXTENSION_EDEFAULT;

  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName1() <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName1()
   * @generated
   * @ordered
   */
  protected static final String NAME1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName1() <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName1()
   * @generated
   * @ordered
   */
  protected String name1 = NAME1_EDEFAULT;

  /**
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * The default value of the '{@link #getName2() <em>Name2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName2()
   * @generated
   * @ordered
   */
  protected static final String NAME2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName2() <em>Name2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName2()
   * @generated
   * @ordered
   */
  protected String name2 = NAME2_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected XExpression initialValue;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<String> typeParameters;

  /**
   * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected static final String EXTENDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected String extends_ = EXTENDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<String> implements_;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<EuclidMember> members;

  /**
   * The default value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected static final boolean OVERRIDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverride()
   * @generated
   * @ordered
   */
  protected boolean override = OVERRIDE_EDEFAULT;

  /**
   * The default value of the '{@link #isDispatch() <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDispatch()
   * @generated
   * @ordered
   */
  protected static final boolean DISPATCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDispatch() <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDispatch()
   * @generated
   * @ordered
   */
  protected boolean dispatch = DISPATCH_EDEFAULT;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName3() <em>Name3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName3()
   * @generated
   * @ordered
   */
  protected static final String NAME3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName3() <em>Name3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName3()
   * @generated
   * @ordered
   */
  protected String name3 = NAME3_EDEFAULT;

  /**
   * The default value of the '{@link #getName4() <em>Name4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName4()
   * @generated
   * @ordered
   */
  protected static final String NAME4_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName4() <em>Name4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName4()
   * @generated
   * @ordered
   */
  protected String name4 = NAME4_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EuclidParameter> parameters;

  /**
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected EList<String> exceptions;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EuclidMemberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DemoPackage.Literals.EUCLID_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(boolean newExtension)
  {
    boolean oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__EXTENSION, oldExtension, extension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName1()
  {
    return name1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName1(String newName1)
  {
    String oldName1 = name1;
    name1 = newName1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__NAME1, oldName1, name1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName2()
  {
    return name2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName2(String newName2)
  {
    String oldName2 = name2;
    name2 = newName2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__NAME2, oldName2, name2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialValue(XExpression newInitialValue, NotificationChain msgs)
  {
    XExpression oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__INITIAL_VALUE, oldInitialValue, newInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialValue(XExpression newInitialValue)
  {
    if (newInitialValue != initialValue)
    {
      NotificationChain msgs = null;
      if (initialValue != null)
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.EUCLID_MEMBER__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.EUCLID_MEMBER__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__INITIAL_VALUE, newInitialValue, newInitialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EDataTypeEList<String>(String.class, this, DemoPackage.EUCLID_MEMBER__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(String newExtends)
  {
    String oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EDataTypeEList<String>(String.class, this, DemoPackage.EUCLID_MEMBER__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EuclidMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<EuclidMember>(EuclidMember.class, this, DemoPackage.EUCLID_MEMBER__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverride()
  {
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverride(boolean newOverride)
  {
    boolean oldOverride = override;
    override = newOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__OVERRIDE, oldOverride, override));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDispatch()
  {
    return dispatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDispatch(boolean newDispatch)
  {
    boolean oldDispatch = dispatch;
    dispatch = newDispatch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__DISPATCH, oldDispatch, dispatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName3()
  {
    return name3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName3(String newName3)
  {
    String oldName3 = name3;
    name3 = newName3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__NAME3, oldName3, name3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName4()
  {
    return name4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName4(String newName4)
  {
    String oldName4 = name4;
    name4 = newName4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__NAME4, oldName4, name4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EuclidParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EuclidParameter>(EuclidParameter.class, this, DemoPackage.EUCLID_MEMBER__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExceptions()
  {
    if (exceptions == null)
    {
      exceptions = new EDataTypeEList<String>(String.class, this, DemoPackage.EUCLID_MEMBER__EXCEPTIONS);
    }
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoPackage.EUCLID_MEMBER__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoPackage.EUCLID_MEMBER__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoPackage.EUCLID_MEMBER__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DemoPackage.EUCLID_MEMBER__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
      case DemoPackage.EUCLID_MEMBER__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case DemoPackage.EUCLID_MEMBER__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case DemoPackage.EUCLID_MEMBER__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DemoPackage.EUCLID_MEMBER__EXTENSION:
        return isExtension();
      case DemoPackage.EUCLID_MEMBER__FINAL:
        return isFinal();
      case DemoPackage.EUCLID_MEMBER__TYPE:
        return getType();
      case DemoPackage.EUCLID_MEMBER__NAME1:
        return getName1();
      case DemoPackage.EUCLID_MEMBER__STATIC:
        return isStatic();
      case DemoPackage.EUCLID_MEMBER__NAME2:
        return getName2();
      case DemoPackage.EUCLID_MEMBER__INITIAL_VALUE:
        return getInitialValue();
      case DemoPackage.EUCLID_MEMBER__NAME:
        return getName();
      case DemoPackage.EUCLID_MEMBER__TYPE_PARAMETERS:
        return getTypeParameters();
      case DemoPackage.EUCLID_MEMBER__EXTENDS:
        return getExtends();
      case DemoPackage.EUCLID_MEMBER__IMPLEMENTS:
        return getImplements();
      case DemoPackage.EUCLID_MEMBER__MEMBERS:
        return getMembers();
      case DemoPackage.EUCLID_MEMBER__OVERRIDE:
        return isOverride();
      case DemoPackage.EUCLID_MEMBER__DISPATCH:
        return isDispatch();
      case DemoPackage.EUCLID_MEMBER__RETURN_TYPE:
        return getReturnType();
      case DemoPackage.EUCLID_MEMBER__NAME3:
        return getName3();
      case DemoPackage.EUCLID_MEMBER__NAME4:
        return getName4();
      case DemoPackage.EUCLID_MEMBER__PARAMETERS:
        return getParameters();
      case DemoPackage.EUCLID_MEMBER__EXCEPTIONS:
        return getExceptions();
      case DemoPackage.EUCLID_MEMBER__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DemoPackage.EUCLID_MEMBER__EXTENSION:
        setExtension((Boolean)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__FINAL:
        setFinal((Boolean)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__TYPE:
        setType((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME1:
        setName1((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__STATIC:
        setStatic((Boolean)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME2:
        setName2((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__INITIAL_VALUE:
        setInitialValue((XExpression)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME:
        setName((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__EXTENDS:
        setExtends((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends EuclidMember>)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__OVERRIDE:
        setOverride((Boolean)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__DISPATCH:
        setDispatch((Boolean)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__RETURN_TYPE:
        setReturnType((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME3:
        setName3((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME4:
        setName4((String)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EuclidParameter>)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__EXCEPTIONS:
        getExceptions().clear();
        getExceptions().addAll((Collection<? extends String>)newValue);
        return;
      case DemoPackage.EUCLID_MEMBER__EXPRESSION:
        setExpression((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DemoPackage.EUCLID_MEMBER__EXTENSION:
        setExtension(EXTENSION_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME1:
        setName1(NAME1_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME2:
        setName2(NAME2_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__INITIAL_VALUE:
        setInitialValue((XExpression)null);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case DemoPackage.EUCLID_MEMBER__EXTENDS:
        setExtends(EXTENDS_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__IMPLEMENTS:
        getImplements().clear();
        return;
      case DemoPackage.EUCLID_MEMBER__MEMBERS:
        getMembers().clear();
        return;
      case DemoPackage.EUCLID_MEMBER__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__DISPATCH:
        setDispatch(DISPATCH_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME3:
        setName3(NAME3_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__NAME4:
        setName4(NAME4_EDEFAULT);
        return;
      case DemoPackage.EUCLID_MEMBER__PARAMETERS:
        getParameters().clear();
        return;
      case DemoPackage.EUCLID_MEMBER__EXCEPTIONS:
        getExceptions().clear();
        return;
      case DemoPackage.EUCLID_MEMBER__EXPRESSION:
        setExpression((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DemoPackage.EUCLID_MEMBER__EXTENSION:
        return extension != EXTENSION_EDEFAULT;
      case DemoPackage.EUCLID_MEMBER__FINAL:
        return final_ != FINAL_EDEFAULT;
      case DemoPackage.EUCLID_MEMBER__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DemoPackage.EUCLID_MEMBER__NAME1:
        return NAME1_EDEFAULT == null ? name1 != null : !NAME1_EDEFAULT.equals(name1);
      case DemoPackage.EUCLID_MEMBER__STATIC:
        return static_ != STATIC_EDEFAULT;
      case DemoPackage.EUCLID_MEMBER__NAME2:
        return NAME2_EDEFAULT == null ? name2 != null : !NAME2_EDEFAULT.equals(name2);
      case DemoPackage.EUCLID_MEMBER__INITIAL_VALUE:
        return initialValue != null;
      case DemoPackage.EUCLID_MEMBER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DemoPackage.EUCLID_MEMBER__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case DemoPackage.EUCLID_MEMBER__EXTENDS:
        return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
      case DemoPackage.EUCLID_MEMBER__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case DemoPackage.EUCLID_MEMBER__MEMBERS:
        return members != null && !members.isEmpty();
      case DemoPackage.EUCLID_MEMBER__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case DemoPackage.EUCLID_MEMBER__DISPATCH:
        return dispatch != DISPATCH_EDEFAULT;
      case DemoPackage.EUCLID_MEMBER__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case DemoPackage.EUCLID_MEMBER__NAME3:
        return NAME3_EDEFAULT == null ? name3 != null : !NAME3_EDEFAULT.equals(name3);
      case DemoPackage.EUCLID_MEMBER__NAME4:
        return NAME4_EDEFAULT == null ? name4 != null : !NAME4_EDEFAULT.equals(name4);
      case DemoPackage.EUCLID_MEMBER__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case DemoPackage.EUCLID_MEMBER__EXCEPTIONS:
        return exceptions != null && !exceptions.isEmpty();
      case DemoPackage.EUCLID_MEMBER__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (extension: ");
    result.append(extension);
    result.append(", final: ");
    result.append(final_);
    result.append(", type: ");
    result.append(type);
    result.append(", name1: ");
    result.append(name1);
    result.append(", static: ");
    result.append(static_);
    result.append(", name2: ");
    result.append(name2);
    result.append(", name: ");
    result.append(name);
    result.append(", typeParameters: ");
    result.append(typeParameters);
    result.append(", extends: ");
    result.append(extends_);
    result.append(", implements: ");
    result.append(implements_);
    result.append(", override: ");
    result.append(override);
    result.append(", dispatch: ");
    result.append(dispatch);
    result.append(", returnType: ");
    result.append(returnType);
    result.append(", name3: ");
    result.append(name3);
    result.append(", name4: ");
    result.append(name4);
    result.append(", exceptions: ");
    result.append(exceptions);
    result.append(')');
    return result.toString();
  }

} //EuclidMemberImpl

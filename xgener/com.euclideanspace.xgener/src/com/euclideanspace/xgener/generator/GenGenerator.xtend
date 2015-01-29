/*
 * generated by Xtext
 */
package com.euclideanspace.xgener.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.euclideanspace.xgener.gen.Model
import com.euclideanspace.xgener.gen.Expression
import org.eclipse.emf.ecore.EObject
import com.euclideanspace.xgener.gen.Precedence
import com.euclideanspace.xgener.gen.Primary
import com.euclideanspace.xgener.gen.Literal
import com.euclideanspace.xgener.gen.ComboString

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GenGenerator implements IGenerator {
	
//	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
//	}

/*     var CharSequence addInfix=null;
    
    def void readAddInfix(com.euclideanspace.xgener.gen.Precedence p){
    	addInfix = '''    «IF p.par1 != null»«IF p.feature1 != null»«p.feature1»=«ENDIF»«p.par1»«
     ENDIF» (=>({«getCallingRule(p.rule)»=current} feature=«
     IF p.infix != null»«compile(p.infix)»«ENDIF»)
    «IF p.par2 != null»«IF p.feature2 != null»«p.feature2»«ELSE»rightOperand«ENDIF»=«p.par2»«ENDIF»)|'''
    }

    def CharSequence getAddInfix(){
    	var CharSequence addHold=addInfix;
    	addInfix=null;
    	return addHold;
    }*/
    
    var String callingRule =null;
    
    def void setCallingRule(String s,String feature) {
    	callingRule =s+".leftOperand";
    	if (feature!=null) callingRule=s+"."+feature;
    }

    /**
     * remove commented out rule if we want to rotate.
     */
    def String getCallingRule(String s) {
    	val String oldRule=callingRule;
    	//callingRule=s
    	return oldRule;
    }
    
    /**
     * 
     */
    def String getCallingRule() {
    	val String oldRule=callingRule;
    	//callingRule=s
    	return oldRule;
    }
    
    /**
     * used for InnerPrecidence if we need to 
     */
    var CharSequence helpOpRule=null;
    
    /**
     * gets the name of the container
     */
    def String getParentExpression(EObject child) {
      var String s="gen_error";
      if (child.eContainer() instanceof Expression) {
        val Expression e= child.eContainer() as Expression;
        s=e.name;
      } else if (child.eContainer() instanceof Primary) {
        val Primary f= child.eContainer() as Primary;
        s=f.name;
      } else if (child.eContainer() instanceof Literal) {
        val Literal g= child.eContainer() as Literal;
        s=g.name;
      }
      return s;
    }

    /**
     * gets the name of the containers container
     */
    def String getGrandParentExpression(EObject child) {
      var Precedence p=null;
      var Expression e=null;
      var String s="error";
      if (child.eContainer() instanceof Precedence) {
        p= child.eContainer() as Precedence;
      }
      if (p.eContainer() instanceof Expression) {
        e= p.eContainer() as Expression;
        s=e.name;
      }
      return s;
    }

/*     def notNull(String v){
    	val boolean b = !("null".equals(v))
    	System.out.println(v+" notnull:"+b)
    	return b
    }*/

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(resource.className+".xtext", compile(resource.contents.head as Model))
	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	def CharSequence compile(com.euclideanspace.xgener.gen.Model model) '''
        «IF model != null»	    
          «IF model.eContainer != null»
package «model.eResource.className»;
          «ENDIF»
grammar com.euclideanspace.xgener.Tutorial
generate demo "http://www.euclideanspace.com/xgener/Tutorial"

import "http://www.eclipse.org/emf/2002/Ecore" as ecore

Model hidden(SL_COMMENT,WS):
  m+=Member*
;

«FOR x:model.clas»«IF x.name != null»«compile(x)»«ENDIF»
«ENDFOR»
«FOR x:model.proc»«IF x.name != null»«compile(x)»«ENDIF»
«ENDFOR»
«FOR x:model.exp»«IF x.name != null»«compile(x)»«ENDIF»
«ENDFOR»
«FOR x:model.prim»«IF x.name != null»«compile(x)»«ENDIF»
«ENDFOR»
«FOR x:model.lit»«IF x.name != null»«compile(x)»«ENDIF»
«ENDFOR»

ArrayBrackets hidden(SL_COMMENT,WS):'[' ID ']';

QualifiedName hidden(SL_COMMENT,WS):
  ValidID (=>'.' ValidID)*;

Number hidden(SL_COMMENT,WS):
  HEX | (INT | DECIMAL) ('.' (INT | DECIMAL))?;

ValidID hidden(SL_COMMENT,WS): ID;

terminal STRING :
  '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
  "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'";

/**
* Dummy rule, for "better" downwards compatibility, since GrammarAccess generates non-static inner classes,
* which makes downstream grammars break on classloading, when a rule is removed.
*/
StaticQualifier hidden(SL_COMMENT,WS):
  (ValidID '::')+
;

terminal ID : '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
terminal HEX:
('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F'|'_')+
('#' (('b'|'B')('i'|'I') | ('l'|'L')))?;
terminal INT returns ecore::EInt:
'0'..'9' ('0'..'9'|'_')*;
terminal DECIMAL:
INT
(('e'|'E') ('+'|'-')? INT)?
(('b'|'B')('i'|'I'|'d'|'D') | ('l'|'L'|'d'|'D'|'f'|'F'))?;
terminal ML_COMMENT : '/*' -> '*/';
terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
terminal WS : (' '|'\t'|'\r'|'\n')+;
terminal ANY_OTHER: .;
        «ENDIF»
'''

    /* Class */
    def CharSequence compile(com.euclideanspace.xgener.gen.ClassType c) '''
// start of rules for ClassType=«c.name»
// end of rules for ClassType=«c.name»
'''
 
    /* Procedure */
    def CharSequence compile(com.euclideanspace.xgener.gen.Procedure p) '''
// start of rules for Procedure=«p.name»
/*
* This is an inner element inside a class, interface or enum, such as:
* 'val' or 'var' returns GenerField
* 'def' method returns GenerFunction
* inner class returns GenerInnerClass
*/
Member returns GenerMember hidden(SL_COMMENT,WS):
  //{GenerMember} annotations+=XAnnotation*
  (
    //{GenerField.annotationInfo = current}
    //visibility=Visibility?
    (
      (extension?='extension' (final?='val' | 'var')? type=ID name1=ValidID?
        | static?='static'? (type=ID | (final?='val' | 'var')) name2=ValidID)
      ('=' initialValue=XExpression)? ';'?
        //| {GenerInnerClass.annotationInfo = current}
        'class' name=ValidID ('<' typeParameters+=ID (',' typeParameters+=ID)* '>')?
        ("extends" extends=ID)?
        ('implements' implements+=ID (',' ID)*)?
          '{' (members+=Member)* '}'
    ) | (
      //| {GenerFunction.annotationInfo = current}
      ('def' | override?='override') /*visibility=Visibility?*/ static?='static'? (dispatch?='dispatch'?)
      ('<' typeParameters+=ID (',' typeParameters+=ID)* '>')?
      ( /* =>(returnType=ID createExtensionInfo=CreateExtensionInfo name=ValidID '(')
        |*/ =>(returnType=ID name3=ValidID '(')
        //| =>(createExtensionInfo=CreateExtensionInfo name=ValidID '(')
        | name4=ValidID '('
      )
      (parameters+=Parameter (',' parameters+=Parameter)*)? ')'
      ('throws' exceptions+=ID (',' exceptions+=ID)*)?
      (expression=XBlockExpression)?
    ) | (
      /*| {GenerConstructor.annotationInfo = current}
        visibility=Visibility?*/ 'new'
      ('<' typeParameters+=ID (',' typeParameters+=ID)* '>')?
        '(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')'
      ('throws' exceptions+=ID (',' exceptions+=ID)*)?
      expression=XBlockExpression
    )
  ) ;

Parameter returns GenerParameter:
  //annotations+=XAnnotation*
  parameterType=ID varArg?='...'? name=ValidID;

// end of rules for Procedure=«p.name»
''' 
/* Expression */
def CharSequence compile(com.euclideanspace.xgener.gen.Expression e) '''
// start of rules for Expression=«e.name»
XAssignment returns XExpression hidden(SL_COMMENT,WS):
  {XAssignment} feature=ID '=' value=XAssignment |
  XOrExpression (
  =>({XBinaryOperation.leftOperand=current} feature=OpMultiAssign) rightOperand=XAssignment
  )?;

OpMultiAssign hidden(SL_COMMENT,WS):
  '+=' | '-=' | '*=' | '/=' | '%=' |
  '<' '<' '=' |
  '>' '>'? '>=';

«FOR x:e.prec SEPARATOR '\n'»
  «IF x.rule != null»
    «compile(x)»
  «ENDIF»
«ENDFOR»
// start of rules for Expression=«e.name»
'''

/* Primary */
def CharSequence compile(com.euclideanspace.xgener.gen.Primary p) '''
// start of rules for Primary=«p.name»

«p.name» hidden(SL_COMMENT,WS) :
XAssignment;

XPrimaryExpression returns «p.name» hidden(SL_COMMENT,WS):
  «FOR x:p.inner SEPARATOR ' |'»
    «IF x.construct != null»«x.construct»«ENDIF»
  «ENDFOR»;

XExpressionOrVarDeclaration returns «p.name» hidden(SL_COMMENT,WS):
  XVariableDeclaration | «p.name»;

XVariableDeclaration returns «p.name» hidden(SL_COMMENT,WS):
  {XVariableDeclaration}
  (writeable?='var'|'val') (=>(type=ID name=ValidID) | name=ValidID) ('=' right=«p.name»)?;

  «FOR x:p.inner SEPARATOR '\n'»
  «IF x.construct != null»
  «compile(x)»
  «ENDIF»
  «ENDFOR»
  
// end of rules for Primary=«p.name»
'''
    
/* Inner Primary */
def CharSequence compile(com.euclideanspace.xgener.gen.PrimaryInner pi) '''
«IF pi.primarytyp=='CONSTRUCTOR'»
/* 'new' keyword followed by specification of object to be constructed.
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XConstructorCall}
  'new' constructor=ID
  (=>'<' typeArguments+=ID (',' typeArguments+=ID)* '>')?
  (=>explicitConstructorCall?='('
  (
  arguments+=XShortClosure
  | arguments+=XExpression (',' arguments+=XExpression)*
  )?
  ')')?
  arguments+=XClosure?;
«ENDIF»
«IF pi.primarytyp=='BLOCK'»
/* code inside braces: '{ ... }'
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XBlockExpression}
  '{'
  (expressions+=XExpressionOrVarDeclaration ';'?)*
  '}';
«ENDIF»
«IF pi.primarytyp=='SWITCH'»
/* switch to different cases depending on value of integer or string 
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XSwitchExpression}
  'switch' (=>('(' declaredParam=ID ':') switch=«getParentExpression(pi)» ')'
  | =>(declaredParam=ID ':')? switch=«getParentExpression(pi)») '{'
  (cases+=XCasePart)*
  ('default' ':' default=«getParentExpression(pi)» )?
'}';

/* Case Part
*/
«pi.construct2» hidden(SL_COMMENT,WS):
  {XCasePart}
  typeGuard=ID? ('case' case=XExpression)?
  (':' then=«getParentExpression(pi)» | fallThrough?=',') ;
«ENDIF»
«IF pi.primarytyp=='SYNCHRONIZED'»
/* support for multithreading
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  =>({XSynchronizedExpression}
  'synchronized' '(') param=XExpression ')' expression=«getParentExpression(pi)»;
«ENDIF»
«IF pi.primarytyp=='FEATURECALL'»
/* call a function
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {«pi.construct»}
  ('<' typeArguments+=ID (',' typeArguments+=ID)* '>')?
  feature=«IF pi.feature != null»«compile(pi.feature)»«ENDIF»
  (=>explicitOperationCall?='('
  (
  featureCallArguments+=XShortClosure
  | featureCallArguments+=«getParentExpression(pi)» (',' featureCallArguments+=XExpression)*
  )?
  ')')?
  featureCallArguments+=XClosure?;
«ENDIF»
«IF pi.primarytyp=='LITERALEXPRESSION'»
/* «pi.construct» defined by Literal section
*/
«ENDIF»
«IF pi.primarytyp=='IFEXPRESSION'»
/* If ... then ... else ... or if(...)... else... construct
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {«pi.construct»}
  'if' '(' if=«getParentExpression(pi)» ')'
  then=XExpression
  (=>'else' else=«getParentExpression(pi)»)?;
«ENDIF»
«IF pi.primarytyp=='FOREXPRESSION'»
/* modern form of 'for' expression using iterators
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  =>({«pi.construct»}
  'for' '(' declaredParam=ID ':') forExpression=«getParentExpression(pi)» ')'
  eachExpression=«getParentExpression(pi)»;
«ENDIF»
«IF pi.primarytyp=='BASICFORLOOPEXPRESSION'»
/* original 'for' expression in java 
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XBasicForLoopExpression}
  'for' '('(initExpressions+=XExpressionOrVarDeclaration
    (',' initExpressions+=XExpressionOrVarDeclaration)*)? ';'
  expression=XExpression? ';'
  (updateExpressions+=XExpression (',' updateExpressions+=XExpression)*)? ')'
  eachExpression=XExpression;
«ENDIF»
«IF pi.primarytyp=='WHILEEXPRESSION'»
/* while (...) ...  construct
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XWhileExpression}
  'while' '(' predicate=«getParentExpression(pi)» ')'
  body=XExpression
;
«ENDIF»
«IF pi.primarytyp=='DOWHILEEXPRESSION'»
/* do ... while(...)
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XDoWhileExpression}
  'do'
  body=XExpression
  'while' '(' predicate=«getParentExpression(pi)» ')';
«ENDIF»
«IF pi.primarytyp=='THROWEXPRESSION'»
/* throw an error
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XThrowExpression} 'throw' expression=XExpression;
«ENDIF»
«IF pi.primarytyp=='RETURNEXPRESSION'»
/* return from procedure
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XReturnExpression} 'return' (->expression=XExpression)?;
«ENDIF»
«IF pi.primarytyp=='TRYCATCHFINALYEXPRESSION'»
/* try ... catch ... finally ... construct
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {«pi.construct»}
  'try'
  expression=«getParentExpression(pi)»
  (
  catchClauses+=XCatchClause+
  (=>'finally' finallyExpression=XExpression)?
  | 'finally' finallyExpression=«getParentExpression(pi)»
);

XCatchClause hidden(SL_COMMENT,WS):
  =>'catch' '(' declaredParam=ID ')' expression=XExpression;
«ENDIF»
«IF pi.primarytyp=='PARENTHESIZEDEXPRESSION'»
/* code inside parenthesis: '( ... )'
*/
«pi.construct» returns «pi.construct» hidden(SL_COMMENT,WS):
  '(' «pi.construct» ')';
«ENDIF»'''

/* Literal */
def CharSequence compile(com.euclideanspace.xgener.gen.Literal p) '''
// start of rules for literal=«p.name»
XLiteral returns XExpression hidden(SL_COMMENT,WS):
«FOR x:p.inner SEPARATOR ' |'»
  «IF x.construct != null»«x.construct»«ENDIF»
«ENDFOR»;

«FOR x:p.inner SEPARATOR '\n'»
  «IF x.construct != null»
  «compile(x)»
  «ENDIF»
«ENDFOR»
// end of rules for literal=«p.name»
'''

/* Inner Literal */
def CharSequence compile(com.euclideanspace.xgener.gen.LiteralInner pi) '''
«IF pi.primarytyp=='COLLECTIONLITERAL'»
/* a set or list
*/
XCollectionLiteral hidden(SL_COMMENT,WS):
  XSetLiteral | XListLiteral
;

XSetLiteral hidden(SL_COMMENT,WS):
  {XSetLiteral} '#' '{' (elements+=XExpression (',' elements+=XExpression )*)? '}'
;

XListLiteral hidden(SL_COMMENT,WS):
  {XListLiteral} '#' '[' (elements+=XExpression (',' elements+=XExpression )*)? ']'
;
«ENDIF»
«IF pi.primarytyp=='CLOSURE'»
/* as defined in xtend language
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  =>({«pi.construct»}
  '[')
  =>((declaredFormalParameters+=ID (',' declaredFormalParameters+=ID)*)? explicitSyntax?='|')?
  expression=XExpressionInClosure
  ']';

XExpressionInClosure returns «getParentExpression(pi)» hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	(expressions+=XExpressionOrVarDeclaration ';'?)*
;

XShortClosure returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
	=>({«pi.construct»} (declaredFormalParameters+=ID
       (',' declaredFormalParameters+=ID)*)? explicitSyntax?='|') expression=«getParentExpression(pi)»;
«ENDIF»
«IF pi.primarytyp=='BOOLEANLITERAL'»
/* true or false
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XBooleanLiteral} ('false' | isTrue?='true');
«ENDIF»
«IF pi.primarytyp=='NUMBERLITERAL'»
/* a positive integer or floating point (using decimal point but not exponential form) 
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XNumberLiteral} value=Number;
«ENDIF»
«IF pi.primarytyp=='NULLLITERAL'»
/* the word 'null'
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XNullLiteral} 'null';
«ENDIF»
«IF pi.primarytyp=='STRINGLITERAL'»
/* string inside double quotes "..." 
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XStringLiteral} value=STRING;
«ENDIF»
«IF pi.primarytyp=='TYPELITERAL'»
/* 'typeof' keyword followed by ID in parenthesis. 
*/
«pi.construct» returns «getParentExpression(pi)» hidden(SL_COMMENT,WS):
  {XTypeLiteral} 'typeof' '(' type=ID (arrayDimensions+=ArrayBrackets)* ')'
;
«ENDIF»'''

/* Precedence, processes one of the following rules:
 * ruletyp rule
 * ------- ----
 * 'caller' ID ('.' feature1=ID)?)
 * 'prefix' ID prefix=MultString par1=ID
 * 'suffix' ID par1=ID suffix=MultString
 * 'infix' ID par1=ID infix=MultString par2=ID
 * 'infixleft' ID par1=ID infixleft=MultString par2=ID
 * 'literal' ID literal=('int'|'string'|'bool'|'float')
 * 'bracket' ID bracket=ID
 * 'braces' ID braces=ID
 * 'parenthesis' ID parenthesis=ID
 */
def CharSequence compile(com.euclideanspace.xgener.gen.Precedence p) '''
    «IF p.ruletyp=='PREFIX'»
      /* Operator comes before single operand (such as -3). 
      */
      «p.rule» returns «getParentExpression(p)» hidden(SL_COMMENT,WS):
      {«p.rule»} feature=«
      IF p.prefix != null»«compile(p.prefix)»«ENDIF» operand=«
      IF p.rule != null»«p.rule»«ENDIF»
      | => «IF p.par1 != null»«p.par1»«ENDIF»;
  «ELSEIF p.ruletyp=='SUFFIX'»
    /* Operator comes after single operand (such as x++)
    */
    «p.rule» returns «getParentExpression(p)» hidden(SL_COMMENT,WS):
    «IF p.par1 != null»«p.par1»«ENDIF» =>({«getCallingRule(p.rule)»=current} feature=«
     IF p.suffix != null»«compile(p.suffix)»«ENDIF»)?;
  «ELSEIF p.ruletyp=='INFIX'»
    /* Binary functions typically have the operation symbol
    * (such as '+' or '*') between the two operands 
    */
    «p.rule» returns «getParentExpression(p)» hidden(SL_COMMENT,WS):
    «IF p.par1 != null»«IF p.feature1 != null»«p.feature1»=«ENDIF»«p.par1»«
     ENDIF» (=>({«getCallingRule(p.rule)»=current} feature=«
     IF p.infix != null»«IF opRuleRequired(p.infix)»op«p.rule»«ELSE»«compile(p.infix)»«ENDIF»«ENDIF»)
    «IF p.par2 != null»«IF p.feature2 != null»«p.feature2»«ELSE»rightOperand«ENDIF»=«p.par2»«ENDIF»)*;
    «IF opRuleRequired(p.infix)»
    
    op«p.rule» hidden(SL_COMMENT,WS):
    «compile(p.infix)»;
    «ENDIF»
    «ELSEIF p.ruletyp=='INFIXLEFT'»
    /* A binary function which associates to the left
    */
    «p.rule» returns «getParentExpression(p)» hidden(SL_COMMENT,WS):
    «IF p.par1 != null»«IF p.feature1 != null»«p.feature1»=«ENDIF»«p.par1»«
     ENDIF» (=>({«getCallingRule(p.rule)»=current} feature=«
     IF p.infix != null»«IF opRuleRequired(p.infix)»op«p.rule»«ELSE»«compile(p.infix)»«ENDIF»«ENDIF»)
    «IF p.par2 != null»«IF p.feature2 != null»«p.rule»«ELSE»rightOperand«ENDIF»=«p.par2»«ENDIF»)?;
    «IF opRuleRequired(p.infix)»

    op«p.rule» hidden(SL_COMMENT,WS):
    «compile(p.infix)»;
    «ENDIF»
  «ELSEIF p.ruletyp=='OUTER'»
    /* Allows multiple entries with the same precedence. 
    */
    «p.rule» returns «getParentExpression(p)» hidden(SL_COMMENT,WS):
    «IF p.par1 != null»«IF p.feature1 != null»«p.feature1»=«ENDIF»«p.par1»«ENDIF»
    «FOR x:p.inner BEFORE '(' SEPARATOR '|' AFTER ')'»«compile(x)»«ENDFOR»*;«getRule()»
  «ELSEIF p.ruletyp=='CALLER'»
    «IF p.rule != null»«setCallingRule(p.rule,p.feature1)»«ENDIF»
  «ELSEIF p.ruletyp=='ANGLE'»
    /* an entry inside angle brackets '< ... >'
    */
    ('<'«IF p.angle != null»«p.angle»+=ID (',' «p.angle»+=ID)* «ENDIF»'>');
  «ELSEIF p.ruletyp=='BRACKET'»
    /* an entry inside brackets '[ ... ]' 
    */
    ('['«IF p.bracket != null»«p.angle»+=ID (',' «p.bracket»+=ID)* «ENDIF»']');
  «ELSEIF p.ruletyp=='BRACES'»
    /* an entry inside curly brackets '{ ... }'
    */
    ('{'«IF p.braces != null»«p.angle»+=ID (',' «p.braces»+=ID)* «ENDIF»'}');
  «ELSEIF p.ruletyp=='PARENTHESIS'»
    /* an entry inside parenthesis '( ... )'
    */
    ('('«IF p.parenthesis != null»«p.angle»+=ID (',' «p.parenthesis»+=ID)* «ENDIF»')');
  «ELSEIF p.ruletyp=='MEMBERFEATURE'»
    /* object name: identities seperated by '.', '?.' or '::' 
    */
    «p.rule» returns «getParentExpression(p)» hidden(SL_COMMENT,WS):
    «IF p.par1 != null»«IF p.feature1 != null»«p.feature1»=«ENDIF»«p.par1»«ENDIF»
    ( =>({XAssignment.assignable=current} ('.'|explicitStatic?="::") feature=ID '=') value=XAssignment
      |=>({XMemberFeatureCall.memberCallTarget=current} ("."|nullSafe?="?."|explicitStatic?="::"))
      ('<' typeArguments+=ID (',' typeArguments+=ID)* '>')?
      feature=ID (
        =>explicitOperationCall?='('
        (
          memberCallArguments+=XShortClosure
          | memberCallArguments+=«getParentExpression(p)» (',' memberCallArguments+=«getParentExpression(p)»)*
        )?
      ')')?
      memberCallArguments+=XClosure?
    )*;
  «ENDIF»
'''

def void storeRule(String rule,com.euclideanspace.xgener.gen.MultString infix){
	helpOpRule='''
	
	op«rule» hidden(SL_COMMENT,WS):
    «compile(infix)»;
	'''
}

def String getRule(){
	var String result="";
	if (helpOpRule!=null){
		result=helpOpRule.toString;
	}
	helpOpRule=null;
	return result; 
}

def CharSequence compile(com.euclideanspace.xgener.gen.InnerPrecedence p) '''
  «IF p.ruletyp=='INNERPREFIX'»
      =>({Lastrule.leftOperand=current} feature=«
      IF p.prefix != null»«compile(p.prefix)»«ENDIF»)
      «IF p.par2 != null»«p.par2»«ENDIF»
  «ELSEIF p.ruletyp=='INNERSUFFIX'»
      =>({Lastrule.leftOperand=current} feature=«
      IF p.suffix != null»«compile(p.suffix)»«ENDIF»)
      rightOperand=«IF p.par2 != null»«p.par2»«ENDIF»
  «ELSEIF p.ruletyp=='INNERINFIX'»
     «IF p.mod != null»«setCallingRule(p.rule,p.feature1)»«ENDIF»
     =>({«getCallingRule()»=current} feature=«
     IF p.infix != null»«IF opRuleRequired(p.infix)»op«p.rule»«ELSE»«compile(p.infix)»«ENDIF»«ENDIF»)
    «IF p.par2 != null»«IF p.feature2 != null»«p.feature2»«ELSE»rightOperand«ENDIF»=«p.par2»«ENDIF»
    «IF opRuleRequired(p.infix)»«storeRule(p.rule,p.infix)»«ENDIF»
  «ELSEIF p.ruletyp=='INNERANGLE'»
    ('<'«IF p.angle != null»«p.angle»+=ID (',' «p.angle»+=ID)* «ENDIF»'>')
  «ELSEIF p.ruletyp=='INNERBRACKET'»
    ('['«IF p.bracket != null»«p.angle»+=ID (',' «p.bracket»+=ID)* «ENDIF»']')
  «ELSEIF p.ruletyp=='INNERBRACES'»
    ('{'«IF p.braces != null»«p.angle»+=ID (',' «p.braces»+=ID)* «ENDIF»'}')
  «ELSEIF p.ruletyp=='INNERPARENTHESIS'»
    ('('«IF p.parenthesis != null»«p.angle»+=ID (',' «p.parenthesis»+=ID)* «ENDIF»')')
  «ENDIF»
'''

/** If we are putting multiple operators in an expression rule and they are complicated then
 * we need to move the operators out into a separate rule.
 * This function tests if that is required.
 */
def boolean opRuleRequired(com.euclideanspace.xgener.gen.MultString m){
	if (m.ms != null) return false;
	if (m.synpred != null) return true;
	for (ComboString x:m.cs) {
		if (x.inner != null){
			if (x.inner.length > 1) return true;
			for (com.euclideanspace.xgener.gen.MultString y:x.inner) {
				if (y.ms == null) return true;
			}
		}
	}
	return false;
}

/**
 * MultString
 */
def CharSequence compile(com.euclideanspace.xgener.gen.MultString m) '''«
  IF m.ms != null»'«m.ms»'«
  ELSEIF m.mi != null»«m.mi»«
  ELSE
    »«IF m.synpred!=null»=>«ENDIF»«FOR x:m.cs BEFORE '(' SEPARATOR '|' AFTER ')'»«compile(x)»«ENDFOR»«
  ENDIF»'''
  
/**
 * ComboString
 */
def CharSequence compile(com.euclideanspace.xgener.gen.ComboString c) '''«
  IF c.inner == null»'empty'«
  ELSE
    »«FOR x:c.inner  SEPARATOR ' '»«compile(x)»«ENDFOR»«
  ENDIF»'''

/**
 * multi ID
def CharSequence compile(com.euclideanspace.xgener.gen.MultID m) '''«
  IF m.mi == null»«
  ELSEIF m.mi.length==1»«m.mi.get(0)»«
  ELSE
    »«FOR x:m.mi BEFORE '(' SEPARATOR '|' AFTER ')'»«x»«ENDFOR»«
  ENDIF»
'''*/
}


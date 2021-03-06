package com.euclideanspace.xgener.serializer;

import com.euclideanspace.xgener.gen.ClassType;
import com.euclideanspace.xgener.gen.ComboString;
import com.euclideanspace.xgener.gen.Expression;
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
import com.euclideanspace.xgener.gen.QualifiedName;
import com.euclideanspace.xgener.gen.SubPrecedence;
import com.euclideanspace.xgener.services.GenGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class GenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GenGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GenPackage.CLASS_TYPE:
				if(context == grammarAccess.getClassTypeRule()) {
					sequence_ClassType(context, (ClassType) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.COMBO_STRING:
				if(context == grammarAccess.getComboStringRule()) {
					sequence_ComboString(context, (ComboString) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.INNER_PRECEDENCE:
				if(context == grammarAccess.getInnerPrecedenceRule()) {
					sequence_InnerPrecedence(context, (InnerPrecedence) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.LITERAL_INNER:
				if(context == grammarAccess.getLiteralInnerRule()) {
					sequence_LiteralInner(context, (LiteralInner) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.MULT_STRING:
				if(context == grammarAccess.getMultStringRule()) {
					sequence_MultString(context, (MultString) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PRECEDENCE:
				if(context == grammarAccess.getPrecedenceRule()) {
					sequence_Precedence(context, (Precedence) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PRIMARY:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Primary) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PRIMARY_INNER:
				if(context == grammarAccess.getPrimaryInnerRule()) {
					sequence_PrimaryInner(context, (PrimaryInner) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PROJECT:
				if(context == grammarAccess.getProjectRule()) {
					sequence_Project(context, (Project) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.QUALIFIED_NAME:
				if(context == grammarAccess.getQualifiedNameRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.SUB_PRECEDENCE:
				if(context == grammarAccess.getSubPrecedenceRule()) {
					sequence_SubPrecedence(context, (SubPrecedence) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID (noclass+='NOCLASS' | prefix+=MultString | suffix+=MultString | blocking+='BRACES' | blocking+='INDENT')*)
	 */
	protected void sequence_ClassType(EObject context, ClassType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inner+=MultString*)
	 */
	protected void sequence_ComboString(EObject context, ComboString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID prec+=Precedence*)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (ruletyp='INNERRULE' customrule=STRING) | 
	 *         (ruletyp='INNERPREFIX' prefix=MultString feature1=ID? par2=ID) | 
	 *         (ruletyp='INNERSUFFIX' suffix=MultString) | 
	 *         (ruletyp='INNERINFIX' (mod='CALLER' rule=ID feature1=ID?)? infix=MultString feature2=ID? par2=ID) | 
	 *         (ruletyp='INNERINFIXRIGHT' (mod='CALLER' rule=ID feature1=ID?)? infix=MultString feature2=ID? par2=ID) | 
	 *         (ruletyp='INNERBRACKET' rule=ID bracket=ID) | 
	 *         (ruletyp='INNERBRACES' rule=ID braces=ID) | 
	 *         (ruletyp='INNERPARENTHESIS' rule=ID parenthesis=ID) | 
	 *         (ruletyp='INNERANGLE' rule=ID angle=ID)
	 *     )
	 */
	protected void sequence_InnerPrecedence(EObject context, InnerPrecedence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (primarytyp='COLLECTIONLITERAL' construct=ID) | 
	 *         (primarytyp='CLOSURE' construct=ID) | 
	 *         (primarytyp='BOOLEANLITERAL' construct=ID) | 
	 *         (primarytyp='NUMBERLITERAL' construct=ID) | 
	 *         (primarytyp='NULLLITERAL' construct=ID) | 
	 *         (primarytyp='STRINGLITERAL' construct=ID) | 
	 *         (primarytyp='TYPELITERAL' construct=ID)
	 *     )
	 */
	protected void sequence_LiteralInner(EObject context, LiteralInner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID inner+=LiteralInner*)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         proj+=Project | 
	 *         clas+=ClassType | 
	 *         proc+=Procedure | 
	 *         prim+=Primary | 
	 *         lit+=Literal | 
	 *         exp+=Expression
	 *     )*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ms=STRING opt?='?'?) | mi=ID | (synpred='=>'? cs+=ComboString cs+=ComboString*))
	 */
	protected void sequence_MultString(EObject context, MultString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (ruletyp='CALLER' rule=ID feature1=ID?) | 
	 *         (ruletyp='RULE' rule=ID customrule=STRING) | 
	 *         (ruletyp='PREFIX' rule=ID prefix=MultString feature1=ID? par1=ID) | 
	 *         (ruletyp='SUFFIX' rule=ID feature1=ID? par1=ID suffix=MultString) | 
	 *         (
	 *             ruletyp='INFIX' 
	 *             rule=ID 
	 *             feature1=ID? 
	 *             par1=ID 
	 *             infix=MultString 
	 *             feature2=ID? 
	 *             par2=ID
	 *         ) | 
	 *         (
	 *             ruletyp='INFIXRIGHT' 
	 *             rule=ID 
	 *             feature1=ID? 
	 *             par1=ID 
	 *             infix=MultString 
	 *             feature2=ID? 
	 *             par2=ID
	 *         ) | 
	 *         (ruletyp='OUTER' rule=ID feature1=ID? par1=ID inner+=InnerPrecedence+) | 
	 *         (ruletyp='COMPOUND' rule=ID prec+=SubPrecedence+) | 
	 *         (ruletyp='BRACKET' rule=ID bracket=ID) | 
	 *         (ruletyp='BRACES' rule=ID braces=ID) | 
	 *         (ruletyp='PARENTHESIS' rule=ID parenthesis=ID) | 
	 *         (ruletyp='ANGLE' rule=ID angle=ID) | 
	 *         (
	 *             ruletyp='MEMBERFEATURE' 
	 *             rule=ID 
	 *             feature1=ID? 
	 *             par1=ID 
	 *             infix=MultString 
	 *             feature2=ID? 
	 *             par2=ID
	 *         )
	 *     )
	 */
	protected void sequence_Precedence(EObject context, Precedence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (primarytyp='CONSTRUCTOR' construct=ID) | 
	 *         (primarytyp='BLOCK' construct=ID) | 
	 *         (primarytyp='SWITCH' construct=ID construct2=ID) | 
	 *         (primarytyp='SYNCHRONIZED' construct=ID) | 
	 *         (primarytyp='FEATURECALL' construct=ID feature=MultString) | 
	 *         (primarytyp='IFEXPRESSION' construct=ID) | 
	 *         (primarytyp='FOREXPRESSION' construct=ID) | 
	 *         (primarytyp='BASICFORLOOPEXPRESSION' construct=ID) | 
	 *         (primarytyp='WHILEEXPRESSION' construct=ID) | 
	 *         (primarytyp='DOWHILEEXPRESSION' construct=ID) | 
	 *         (primarytyp='THROWEXPRESSION' construct=ID) | 
	 *         (primarytyp='RETURNEXPRESSION' construct=ID) | 
	 *         (primarytyp='TRYCATCHFINALYEXPRESSION' construct=ID) | 
	 *         (primarytyp='PARENTHESIZEDEXPRESSION' construct=ID) | 
	 *         (primarytyp='LITERALEXPRESSION' construct=ID)
	 *     )
	 */
	protected void sequence_PrimaryInner(EObject context, PrimaryInner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID inner+=PrimaryInner*)
	 */
	protected void sequence_Primary(EObject context, Primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             (expression+=ID blockexp+=ID) | 
	 *             annot+=ID | 
	 *             prefix+=MultString | 
	 *             suffix+=MultString | 
	 *             types+='COLONSEPERATED' | 
	 *             types+='SPACESEPERATED' | 
	 *             types+='INHEADER' | 
	 *             types+='INFERRED' | 
	 *             types+='UNTYPED'
	 *         )*
	 *     )
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (proj+=QualifiedName | nam+=QualifiedName)*)
	 */
	protected void sequence_Project(EObject context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qn+=ID qn+=ID*)
	 */
	protected void sequence_QualifiedName(EObject context, QualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (ruletyp='SUBRULE' customrule=STRING) | 
	 *         (ruletyp='SUBPREFIX' prefix=MultString feature1=ID? par2=ID) | 
	 *         (ruletyp='SUBSUFFIX' suffix=MultString) | 
	 *         (
	 *             ruletyp='SUBINFIX' 
	 *             feature1=ID? 
	 *             par1=ID 
	 *             infix=MultString 
	 *             feature2=ID? 
	 *             par2=ID
	 *         ) | 
	 *         (
	 *             ruletyp='SUBINFIXRIGHT' 
	 *             feature1=ID? 
	 *             par1=ID 
	 *             infix=MultString 
	 *             feature2=ID? 
	 *             par2=ID
	 *         ) | 
	 *         (ruletyp='SUBBRACKET' rule=ID bracket=ID) | 
	 *         (ruletyp='SUBBRACES' rule=ID braces=ID) | 
	 *         (ruletyp='SUBPARENTHESIS' rule=ID parenthesis=ID) | 
	 *         (ruletyp='SUBANGLE' rule=ID angle=ID)
	 *     )
	 */
	protected void sequence_SubPrecedence(EObject context, SubPrecedence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

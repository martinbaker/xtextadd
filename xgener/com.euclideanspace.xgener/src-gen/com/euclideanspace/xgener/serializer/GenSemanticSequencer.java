package com.euclideanspace.xgener.serializer;

import com.euclideanspace.xgener.gen.ClassType;
import com.euclideanspace.xgener.gen.Expression;
import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.Model;
import com.euclideanspace.xgener.gen.MultID;
import com.euclideanspace.xgener.gen.MultString;
import com.euclideanspace.xgener.gen.Precidence;
import com.euclideanspace.xgener.gen.Procedure;
import com.euclideanspace.xgener.gen.Statement;
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
			case GenPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.MULT_ID:
				if(context == grammarAccess.getMultIDRule()) {
					sequence_MultID(context, (MultID) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.MULT_STRING:
				if(context == grammarAccess.getMultStringRule()) {
					sequence_MultString(context, (MultString) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PRECIDENCE:
				if(context == grammarAccess.getPrecidenceRule()) {
					sequence_Precidence(context, (Precidence) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case GenPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID (noclass+='noclass' | prefix+=MultID | suffix+=MultID | blocking+='braces' | blocking+='indent')*)
	 */
	protected void sequence_ClassType(EObject context, ClassType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID prec+=Precidence*)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (clas+=ClassType | proc+=Procedure | statem+=Statement | exp+=Expression)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mi+=ID | mi+=ID*)
	 */
	protected void sequence_MultID(EObject context, MultID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ms+=STRING | ms+=STRING*)
	 */
	protected void sequence_MultString(EObject context, MultString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (rule=ID prefix=MultString par1=ID) | 
	 *         (rule=ID par1=ID suffix=MultString) | 
	 *         (rule=ID par1=ID infix=MultString par2=ID) | 
	 *         (rule=ID par1=ID infixleft=MultString par2=ID) | 
	 *         (rule=ID (literal='int' | literal='string' | literal='bool' | literal='float')) | 
	 *         (rule=ID bracket=ID) | 
	 *         (rule=ID braces=ID) | 
	 *         (rule=ID parenthesis=ID)
	 *     )
	 */
	protected void sequence_Precidence(EObject context, Precidence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             prefix+=MultID | 
	 *             suffix+=MultID | 
	 *             types+='colonSeperated' | 
	 *             types+='spaceSeperated' | 
	 *             types+='inHeader' | 
	 *             types+='inferred' | 
	 *             types+='untyped'
	 *         )*
	 *     )
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ((rep=ID until=ID) | (while=ID do=ID) | for=ID | (var=ID ex=ID?) | (val=ID ex=ID)))
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

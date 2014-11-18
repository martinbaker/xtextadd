package com.euclideanspace.whitespaceblock.serializer;

import com.euclideanspace.whitespaceblock.demo.DemoPackage;
import com.euclideanspace.whitespaceblock.demo.Model;
import com.euclideanspace.whitespaceblock.demo.Recurse;
import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;
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
public class DemoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DemoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DemoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DemoPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DemoPackage.RECURSE:
				if(context == grammarAccess.getRecurseRule()) {
					sequence_Recurse(context, (Recurse) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     contents+=Recurse
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (n+=ID | r+=Recurse)+
	 */
	protected void sequence_Recurse(EObject context, Recurse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

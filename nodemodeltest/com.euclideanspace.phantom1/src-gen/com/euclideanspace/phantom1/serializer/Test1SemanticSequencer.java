package com.euclideanspace.phantom1.serializer;

import com.euclideanspace.phantom1.services.Test1GrammarAccess;
import com.euclideanspace.phantom1.test1.Model;
import com.euclideanspace.phantom1.test1.Recurse;
import com.euclideanspace.phantom1.test1.Test1Package;
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
public class Test1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Test1GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Test1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Test1Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case Test1Package.RECURSE:
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
	 *     contents+=Recurse*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (n=ID | r=Recurse)
	 */
	protected void sequence_Recurse(EObject context, Recurse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

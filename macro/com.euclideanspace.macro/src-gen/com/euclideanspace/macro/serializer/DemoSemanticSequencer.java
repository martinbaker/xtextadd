package com.euclideanspace.macro.serializer;

import com.euclideanspace.macro.demo.DemoPackage;
import com.euclideanspace.macro.demo.MacroDef;
import com.euclideanspace.macro.demo.Model;
import com.euclideanspace.macro.demo.Recurse;
import com.euclideanspace.macro.services.DemoGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DemoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DemoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DemoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DemoPackage.MACRO_DEF:
				if(context == grammarAccess.getMacroDefRule()) {
					sequence_MacroDef(context, (MacroDef) semanticObject); 
					return; 
				}
				else break;
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
	 *     (mn=ID m=Recurse)
	 */
	protected void sequence_MacroDef(EObject context, MacroDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DemoPackage.Literals.MACRO_DEF__MN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DemoPackage.Literals.MACRO_DEF__MN));
			if(transientValues.isValueTransient(semanticObject, DemoPackage.Literals.MACRO_DEF__M) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DemoPackage.Literals.MACRO_DEF__M));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMacroDefAccess().getMnIDTerminalRuleCall_1_0(), semanticObject.getMn());
		feeder.accept(grammarAccess.getMacroDefAccess().getMRecurseParserRuleCall_2_0(), semanticObject.getM());
		feeder.finish();
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
	 *     (md+=MacroDef | r+=Recurse | n+=ID)+
	 */
	protected void sequence_Recurse(EObject context, Recurse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

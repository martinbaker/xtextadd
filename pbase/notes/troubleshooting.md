<p>If you are working with the projects on <a href="https://github.com/martinbaker/xtextadd">this site</a> and you are having problems then I will try to add notes here to help. </p>
<h2>Troubleshooting for Implementing a Python-like Syntax</h2>
<p>If you get one of the following errors, click on the link for more information:</p>
<ul>
  <li><a href="#XtextReconcilerJob">An internal error occurred during: &quot;XtextReconcilerJob&quot;</a></li>
  <li><a href="#ParsingInReconcilerFailed">Parsing in reconciler failed</a> </li>
  <li><a href="#IllegalArgumentException">java.lang.IllegalArgumentException: length -1 is &lt; 0 in TextRegion</a></li>
</ul>
<h3><a name="XtextReconcilerJob" id="XtextReconcilerJob"></a>XtextReconcilerJob</h3>
<p>This error happens if the PhantomToken is not zero length. </p>
<p>Error when editing the DSL source code, although the editor continues to work.</p>
<table border="1">
  <tr>
    <td><pre>!MESSAGE An internal error occurred during: "XtextReconcilerJob".
!STACK 0
java.lang.StringIndexOutOfBoundsException: String index out of range: 140
	at java.lang.String.substring(String.java:1950)
	at org.eclipse.xtext.nodemodel.impl.AbstractNode.getText(AbstractNode.java:148)
	at org.eclipse.xtext.parser.impl.PartialParsingHelper.insertChangeIntoReplaceRegion(PartialParsingHelper.java:229)
	at org.eclipse.xtext.parser.impl.PartialParsingHelper.reparse(PartialParsingHelper.java:98)
	at org.eclipse.xtext.parser.antlr.AbstractAntlrParser.doReparse(AbstractAntlrParser.java:136)
	at org.eclipse.xtext.parser.AbstractParser.reparse(AbstractParser.java:48)
	at org.eclipse.xtext.resource.XtextResource.update(XtextResource.java:228)
	at org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy.doReconcile(XtextDocumentReconcileStrategy.java:143)
	at org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy.reconcile(XtextDocumentReconcileStrategy.java:65)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler.doRun(XtextReconciler.java:413)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler.access$3(XtextReconciler.java:393)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler$1.process(XtextReconciler.java:334)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler$1.process(XtextReconciler.java:1)
	at org.eclipse.xtext.util.concurrent.IUnitOfWork$Void.exec(IUnitOfWork.java:36)
	at org.eclipse.xtext.ui.editor.model.XtextDocument$XtextDocumentLocker.modify(XtextDocument.java:418)
	at org.eclipse.xtext.ui.editor.model.XtextDocument.internalModify(XtextDocument.java:131)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler.run(XtextReconciler.java:331)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)
</pre></td>
  </tr>
</table>
<p>For more information about Eclipse reconcilers see<a href="https://wiki.eclipse.org/FAQ_How_do_I_use_a_model_reconciler%3F"> this page</a>. </p>
<h4>Cause</h4>
<p>This is because the method:</p>
<p>insertChangeIntoReplaceRegion(ICompositeNode rootNode, ReplaceRegion region)</p>
<p>in class:</p>
<p>org.eclipse.xtext.parser.impl.PartialParsingHelper</p>
<p>Sometimes gets called with the wrong parameters ('rootNode' may be set to a CompositeNode inside the root node).</p>
<h4>Fix</h4>
<p>Make sure PhantomToken is zero length. Otherwise changing the insertChangeIntoReplaceRegion method as follows fixes the problem:</p>
<p>I created a class called 'TutorialPartialParsingHelper.java' as follows:</p>
<pre>import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.impl.PartialParsingHelper;
import org.eclipse.xtext.util.ReplaceRegion;

public class TutorialPartialParsingHelper extends PartialParsingHelper {
	
/**
 * @author Martin Baker - fix for reconciler error.
 * This is being called with the parameter 'rootNode' not set to root node
 * I have therefore added getRootNode() call.
 * 
 * More information about this bug here:
 * https://github.com/martinbaker/xtextadd/blob/master/pbase/notes/troubleshooting.md
 */
@Override
public String insertChangeIntoReplaceRegion(ICompositeNode rootNode, ReplaceRegion region) {
  ICompositeNode reallyrootNode = rootNode.getRootNode();
  final StringBuilder builder = new StringBuilder(reallyrootNode.getText());
  region.shiftBy(0-reallyrootNode.getTotalOffset()).applyTo(builder);
  return builder.toString();
}

}</pre>
<p>I then added the following to TutorialRuntimeModule.java:</p>
<pre>public Class&lt;? extends org.eclipse.xtext.parser.antlr.IPartialParsingHelper&gt; bindIPartialParserHelper() {
    return TutorialPartialParsingHelper.class;
}</pre>
<h3><a name="ParsingInReconcilerFailed" id="ParsingInReconcilerFailed"></a>Parsing in reconciler failed</h3>
<p>This message sometimes happens at the same time as the &quot;XtextReconcilerJob&quot; error above. As with the error above the editor continues to work, but we need to get rid of the error.  I have reported this bug to Xtext <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=455908">here</a>. </p>
<table border="1">
  <tr>
    <td><pre>0    [Worker-1] ERROR org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy  - Parsing in reconciler failed.
java.lang.StringIndexOutOfBoundsException: String index out of range: 140
	at java.lang.String.substring(String.java:1950)
	at org.eclipse.xtext.nodemodel.impl.AbstractNode.getText(AbstractNode.java:148)
	at org.eclipse.xtext.parser.impl.PartialParsingHelper.insertChangeIntoReplaceRegion(PartialParsingHelper.java:229)
	at org.eclipse.xtext.parser.impl.PartialParsingHelper.reparse(PartialParsingHelper.java:98)
	at org.eclipse.xtext.parser.antlr.AbstractAntlrParser.doReparse(AbstractAntlrParser.java:136)
	at org.eclipse.xtext.parser.AbstractParser.reparse(AbstractParser.java:48)
	at org.eclipse.xtext.resource.XtextResource.update(XtextResource.java:228)
	at org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy.doReconcile(XtextDocumentReconcileStrategy.java:143)
	at org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy.reconcile(XtextDocumentReconcileStrategy.java:65)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler.doRun(XtextReconciler.java:413)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler.access$3(XtextReconciler.java:393)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler$1.process(XtextReconciler.java:334)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler$1.process(XtextReconciler.java:1)
	at org.eclipse.xtext.util.concurrent.IUnitOfWork$Void.exec(IUnitOfWork.java:36)
	at org.eclipse.xtext.ui.editor.model.XtextDocument$XtextDocumentLocker.modify(XtextDocument.java:418)
	at org.eclipse.xtext.ui.editor.model.XtextDocument.internalModify(XtextDocument.java:131)
	at org.eclipse.xtext.ui.editor.reconciler.XtextReconciler.run(XtextReconciler.java:331)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:54)
</pre></td>
  </tr>
</table>
<p>See <a href="https://github.com/martinbaker/xtextadd/issues/1">https://github.com/martinbaker/xtextadd/issues/1</a></p>
<h3><a name="IllegalArgumentException" id="IllegalArgumentException"></a>IllegalArgumentException: length -1 is &lt; 0 in TextRegion</h3>
<p>This error no longer happens in my code. I got the error in earlier versions of the code with bugs which caused the references back from the 'node model' to the 'text stream to have overlapping text regions. So if you get this error make sure the 'node model' is being set correctly. </p>
<table border="1">
  <tr>
    <td><pre>java.lang.IllegalArgumentException: length -1 is < 0
	at org.eclipse.xtext.util.TextRegion.<init>(TextRegion.java:20)
	at org.eclipse.xtext.util.TextRegionWithLineInformation.<init>(TextRegionWithLineInformation.java:20)
	at org.eclipse.xtext.nodemodel.impl.AbstractNode.getTextRegionWithLineInformation(AbstractNode.java:100)
	at org.eclipse.xtext.nodemodel.impl.AbstractNode.getTextRegionWithLineInformation(AbstractNode.java:80)
	at org.eclipse.xtext.resource.DefaultLocationInFileProvider.createRegion(DefaultLocationInFileProvider.java:249)
	at org.eclipse.xtext.resource.DefaultLocationInFileProvider.createRegion(DefaultLocationInFileProvider.java:263)
	at org.eclipse.xtext.resource.DefaultLocationInFileProvider.doGetTextRegion(DefaultLocationInFileProvider.java:86)
	at org.eclipse.xtext.resource.DefaultLocationInFileProvider.getTextRegion(DefaultLocationInFileProvider.java:54)
	at org.eclipse.xtext.resource.DefaultLocationInFileProvider.getFullTextRegion(DefaultLocationInFileProvider.java:50)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider.computeObjectFolding(DefaultFoldingRegionProvider.java:133)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider.computeObjectFolding(DefaultFoldingRegionProvider.java:118)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider.doGetFoldingRegions(DefaultFoldingRegionProvider.java:98)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider$1.exec(DefaultFoldingRegionProvider.java:80)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider$1.exec(DefaultFoldingRegionProvider.java:1)
	at org.eclipse.xtext.util.concurrent.CancelableUnitOfWork.exec(CancelableUnitOfWork.java:25)
	at org.eclipse.xtext.ui.editor.model.XtextDocument$XtextDocumentLocker.internalReadOnly(XtextDocument.java:494)
	at org.eclipse.xtext.ui.editor.model.XtextDocument$XtextDocumentLocker.readOnly(XtextDocument.java:465)
	at org.eclipse.xtext.ui.editor.model.XtextDocument.readOnly(XtextDocument.java:105)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider.getFoldingRegions(DefaultFoldingRegionProvider.java:72)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider.calculateProjectionAnnotationModel(DefaultFoldingStructureProvider.java:116)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider.initialize(DefaultFoldingStructureProvider.java:59)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider.handleProjectionEnabled(DefaultFoldingStructureProvider.java:100)
	at org.eclipse.xtext.ui.editor.folding.DefaultFoldingStructureProvider$ProjectionChangeListener.projectionEnabled(DefaultFoldingStructureProvider.java:191)
	at org.eclipse.jface.text.source.projection.ProjectionViewer.fireProjectionEnabled(ProjectionViewer.java:488)
	at org.eclipse.jface.text.source.projection.ProjectionViewer.enableProjection(ProjectionViewer.java:536)
	at org.eclipse.jface.text.source.projection.ProjectionViewer.doOperation(ProjectionViewer.java:1408)
	at org.eclipse.xtext.ui.editor.XtextEditor.installFoldingSupport(XtextEditor.java:510)
	at org.eclipse.xtext.ui.editor.XtextEditor.createPartControl(XtextEditor.java:490)
	at org.eclipse.ui.internal.e4.compatibility.CompatibilityPart.createPartControl(CompatibilityPart.java:141)
	at org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor.createPartControl(CompatibilityEditor.java:99)
	at org.eclipse.ui.internal.e4.compatibility.CompatibilityPart.create(CompatibilityPart.java:327)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.eclipse.e4.core.internal.di.MethodRequestor.execute(MethodRequestor.java:55)
	at org.eclipse.e4.core.internal.di.InjectorImpl.processAnnotated(InjectorImpl.java:888)
	at org.eclipse.e4.core.internal.di.InjectorImpl.processAnnotated(InjectorImpl.java:869)
	at org.eclipse.e4.core.internal.di.InjectorImpl.inject(InjectorImpl.java:120)
	at org.eclipse.e4.core.internal.di.InjectorImpl.internalMake(InjectorImpl.java:337)
	at org.eclipse.e4.core.internal.di.InjectorImpl.make(InjectorImpl.java:258)
	at org.eclipse.e4.core.contexts.ContextInjectionFactory.make(ContextInjectionFactory.java:162)
	at org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory.createFromBundle(ReflectionContributionFactory.java:104)
	at org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory.doCreate(ReflectionContributionFactory.java:73)
	at org.eclipse.e4.ui.internal.workbench.ReflectionContributionFactory.create(ReflectionContributionFactory.java:55)
	at org.eclipse.e4.ui.workbench.renderers.swt.ContributedPartRenderer.createWidget(ContributedPartRenderer.java:127)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createWidget(PartRenderingEngine.java:983)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:662)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.StackRenderer.showTab(StackRenderer.java:1250)
	at org.eclipse.e4.ui.workbench.renderers.swt.LazyStackRenderer.postProcess(LazyStackRenderer.java:100)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:678)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$6.run(PartRenderingEngine.java:547)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:531)
	at org.eclipse.e4.ui.workbench.renderers.swt.ElementReferenceRenderer.createWidget(ElementReferenceRenderer.java:69)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createWidget(PartRenderingEngine.java:983)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:662)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.SashRenderer.processContents(SashRenderer.java:185)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.SashRenderer.processContents(SashRenderer.java:185)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.SashRenderer.processContents(SashRenderer.java:185)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.SashRenderer.processContents(SashRenderer.java:185)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.PerspectiveRenderer.processContents(PerspectiveRenderer.java:49)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.PerspectiveStackRenderer.showTab(PerspectiveStackRenderer.java:103)
	at org.eclipse.e4.ui.workbench.renderers.swt.LazyStackRenderer.postProcess(LazyStackRenderer.java:100)
	at org.eclipse.e4.ui.workbench.renderers.swt.PerspectiveStackRenderer.postProcess(PerspectiveStackRenderer.java:77)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:678)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.SashRenderer.processContents(SashRenderer.java:185)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.workbench.renderers.swt.SWTPartRenderer.processContents(SWTPartRenderer.java:68)
	at org.eclipse.e4.ui.workbench.renderers.swt.WBWRenderer.processContents(WBWRenderer.java:664)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:674)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.safeCreateGui(PartRenderingEngine.java:766)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.access$2(PartRenderingEngine.java:737)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$7.run(PartRenderingEngine.java:731)
	at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.createGui(PartRenderingEngine.java:715)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine$9.run(PartRenderingEngine.java:1078)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:332)
	at org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine.run(PartRenderingEngine.java:1032)
	at org.eclipse.e4.ui.internal.workbench.E4Workbench.createAndRunUI(E4Workbench.java:148)
	at org.eclipse.ui.internal.Workbench$5.run(Workbench.java:636)
	at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:332)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:579)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:150)
	at org.eclipse.ui.internal.ide.application.IDEApplication.start(IDEApplication.java:135)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:134)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:380)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:235)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:648)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:603)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1465)
	at org.eclipse.equinox.launcher.Main.main(Main.java:1438)</pre></td>
  </tr>
</table>
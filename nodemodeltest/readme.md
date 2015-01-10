<p>In order to check some issues I am discussing with Sebastian Zarnekow <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=451838">on bugzilla here</a>, I have setup this test program.</p>
<p>The aim is to find what happens to the node model when phantom tokens are used.</p>
<p>In order to keep things simple I used a very simple grammar (see here). This grammar allows an ID to be nested in curly brackets.</p>
<p>I also  set it to create semicolon tokens as a PhantomToken after every closing brace (see code here).</p>
<p>In order to see what is going I added some code  to run after 'compressAndReturnParent' gets called on the root node. This code does the following:</p>
<ul>
  <li>Uses InvariantChecker on the root node.</li>
  <li>Outputs a textual representation of the node model.  </li>
</ul>
<p>I then started the runtime in a new Eclipse instance and entered the following source into a file: </p>
<table border="1">
  <tr>
    <td><pre>{{{a}}}</pre></td>
  </tr>
</table>
<p>The results of this was:</p>
<p>InvariantChecker produced the following error:</p>
<table border="1">
  <tr>
    <td><pre>org.eclipse.xtext.nodemodel.impl.InvariantChecker$InconsistentNodeModelException: node with unexpected offset</pre></td>
  </tr>
</table>
<p>The textual representation of the node model was:</p>
<table border="1">
  <tr>
    <td><pre>TestNodeModelBuilder.compressAndReturnParent
[rootnode 0 txt={{{a}}} gram= [ParserRuleImpl=-6 ele-name=Model] lin=1 len=7 off=0:7 tot-off=0:7]
[CompositeNodeWithSemanticElement dir txt={{{a}}} gram=[RuleCallImpl=-6 cardinality=null ele-name=Recurse] lin=1 len=7 off=0:7 tot-off=0:7]
    [LeafNode  txt={ gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_OCURLY] lin=1 len=1 off=0:1 tot-off=0:1]
    [CompositeNodeWithSemanticElement dir txt={{a}} gram=[RuleCallImpl=-6 cardinality=null ele-name=Recurse] lin=1 len=5 off=1:6 tot-off=1:6]
        [LeafNode  txt={ gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_OCURLY] lin=1 len=1 off=1:2 tot-off=1:2]
        [CompositeNodeWithSemanticElement dir txt={a} gram=[RuleCallImpl=-6 cardinality=null ele-name=Recurse] lin=1 len=3 off=2:5 tot-off=2:5]
            [LeafNode  txt={ gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_OCURLY] lin=1 len=1 off=2:3 tot-off=2:3]
            [CompositeNodeWithSemanticElement dir txt=a gram=[RuleCallImpl=-6 cardinality=null ele-name=Recurse] lin=1 len=1 off=3:4 tot-off=3:4]
                [LeafNode  txt=a gram=[RuleCallImpl=-6 cardinality=null ele-name=ID] lin=1 len=1 off=3:4 tot-off=3:4]
            [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_CCURLY] lin=1 len=1 off=4:5 tot-off=4:5]
            [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=? ele-name=KW_SEMICOLON] lin=1 len=1 off=4:5 tot-off=4:5]
        [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_CCURLY] lin=1 len=1 off=5:6 tot-off=5:6]
        [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=? ele-name=KW_SEMICOLON] lin=1 len=1 off=5:6 tot-off=5:6]
    [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_CCURLY] lin=1 len=1 off=6:7 tot-off=6:7]
    [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=? ele-name=KW_SEMICOLON] lin=1 len=1 off=6:7 tot-off=6:7]</pre></td>
  </tr>
</table>
<p>So I conclude the following. </p>
<ul>
  <li>length of string is stop-start (not stop-start+1)</li>
  <li>PhantomTokens (in above case KW_SEMICOLON) have had their start offset decremented so that it appears to have length 1 and overlaps with previous token. </li>
</ul>
<p>Is there a reliable way to create a PhantomToken of length 0 in node model which is not going to cause any trouble? </p>
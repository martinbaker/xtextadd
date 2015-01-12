<p>In order to check some issues I am discussing with Sebastian Zarnekow <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=451838">on bugzilla here</a>, I have setup this test program.</p>
<p>The aim is to find what happens to the node model when phantom tokens are used.</p>
<p>In order to keep things simple I used a very simple grammar (<a href="https://github.com/martinbaker/xtextadd/blob/master/nodemodeltest/com.euclideanspace.phantom1/src/com/euclideanspace/phantom1/Test1.xtext">see here</a>). This grammar allows an ID to be nested in curly brackets.</p>
<p>I also  set it to create semicolon tokens as a PhantomToken after every closing brace (<a href="https://github.com/martinbaker/xtextadd/blob/master/nodemodeltest/com.euclideanspace.phantom1/src/com/euclideanspace/phantom1/Test1TokenSource.java">see code here</a>).</p>
<p>In order to see what is going I added some code  to run after '<a href="https://github.com/martinbaker/xtextadd/blob/master/nodemodeltest/com.euclideanspace.phantom1/src/com/euclideanspace/phantom1/Test1NodeModelBuilder.java">compressAndReturnParent</a>' gets called on the root node. This code does the following:</p>
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
<p>In the above case the PhantomToken sets the start and stop index to the same value, this results in a PhantomToken of length 1. In order to correct this I changed PhantomToken to set the start value to be one more than the start value, this works and now passes InvariantChecker:</p>

<p>It now gives the correct lengths: </p>
<table border="1">
  <tr>
    <td><pre>InvariantChecker no error
TestNodeModelBuilder.compressAndReturnParent
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
            [LeafNode  txt= gram=[RuleCallImpl=-4 cardinality=? ele-name=KW_SEMICOLON] lin=1 len=0 off=5:5 tot-off=5:5]
        [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_CCURLY] lin=1 len=1 off=5:6 tot-off=5:6]
        [LeafNode  txt= gram=[RuleCallImpl=-4 cardinality=? ele-name=KW_SEMICOLON] lin=1 len=0 off=6:6 tot-off=6:6]
    [LeafNode  txt=} gram=[RuleCallImpl=-4 cardinality=null ele-name=KW_CCURLY] lin=1 len=1 off=6:7 tot-off=6:7]
    [LeafNode  txt= gram=[RuleCallImpl=-4 cardinality=? ele-name=KW_SEMICOLON] lin=1 len=0 off=7:7 tot-off=7:7]</pre></td>
  </tr>
</table>
<p>It does not seem right having the stop less that the start. I've tried doing this in the past and I remember seeing a 'stop&lt;start' error but I can't remember the details of what caused it. </p>
<p>Is there a reliable way to create a PhantomToken of length 0 in node model which is not going to cause any trouble? </p>
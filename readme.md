<p>These pages contain some proposed additions to <a href="https://github.com/eclipse/xtext">Xtext</a>.</p>
<p>Xtext is a very powerful way to create a project IDE from a grammar but I would like some additional capabilities. I will put some small demonstrator projects here in the hope of persuading the Xtext team to include these capabilities in Xtext.</p>
<p>These small stand-alone projects, that I would like to see built-in to Xtext, are:</p>
<ul>
  <li><a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">Whitespaceblock</a> - Adds the ability to define blocks in your DSL using whitespace (indentation). </li>
  <li><a href="https://github.com/martinbaker/xtextadd/tree/master/pbase">Pbase</a> - A tutorial for <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">Whitespaceblock</a></li>
  <li><a href="https://github.com/martinbaker/xtextadd/tree/master/macro">Macro</a> - Adds the ability to have macros in your DSL. </li>
  <li><a href="https://github.com/martinbaker/xtextadd/tree/master/xgener">Xgener</a> - A customisable generator for Xtext projects. </li>
</ul>
<h3>Python-like syntax</h3>
<p>I have drafted out code to support DSLs that need to have a Python-like syntax. </p>
<p>To see how this works I suggest looking at this code:</p>
<ul>
  <li>An alternative Python-like version of common.Terminals <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/common2/PythonTerminals.xtext">here</a></li>
  <li> When the user uses this in the grammar then it is proposed that <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">this token source</a> is used.</li>
</ul>
<p>The effect of this is when the sourcecode contains whitespace like this:</p>
<table>
  <tr>
    <td>a</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>b</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>c</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>d</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<p>Then 'phantom tokens' will be automatically added which will be used by the parser to mark blocks. This is much easier than trying to use the grammar to parse whitespace. So the above input will look to the parser like:</p>
<table>
  <tr>
    <td>a</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>BEGIN b</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>BEGIN c</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>END d</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>END</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<p>More details:</p>
<ul>
  <li>The code is <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">here</a>. </li>
  <li>I have put an enhancement request for this on <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=451838">Eclipse bug tracking system</a>. </li>
  <li>I have put a tutorial for converting your DSL to Python-like syntax <a href="https://github.com/martinbaker/xtextadd/tree/master/pbase">on this page</a>. </li>
</ul>
<h3>Macro</h3>
<p>I would like better support to help DSLs that contain macros.</p>
<p>Note: I had a look at <a href="https://github.com/eclipse/xtext/tree/master/plugins/org.eclipse.xtend.lib.macro">xtend implementation of macros</a> and it looks very complicated, I am looking for something very simple which can be customised for different DSLs.</p>
<p>I have drafted an implementation <a href="https://github.com/martinbaker/xtextadd/tree/master/macro">here</a>, which partly works, but there are some issues which I think need some changes to Xtext. </p>
<p>This code runs between the lexer and the parser, this is similar to the <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=451838">support for Python-like syntax request</a>, so I think it is worth at least considering this at the same time.</p>
<p>Because of this the implementation of macros is very simple:</p>
<ul>
  <li>It works on the token stream and not the character stream. This means that the macro must contain whole tokens and not partial tokens. So we can't have a macro to substitute the contents of strings, for example. </li>
  <li>These macros don't have a scope and will be applied at any point in the source after they are defined. </li>
  <li>These macros don't have parameters, it is just a simple substitution.</li>
</ul>
<p>So it works like this: </p>
<p>The first line is supposed to show a macro definition, this defines a macro 'x' which has the value 'a b c' </p>
<table border="1">
  <tr>
    <td><pre>macro x a b c endmacro
d x
e x</pre></td>
  </tr>
</table>
<p>The code in this project then substitutes every occurrence of 'x' by its value 'a b c' </p>
<table border="1">
  <tr>
    <td><pre>d a b c
e a b c</pre></td>
  </tr>
</table>
<p>Although this is very simple, it is good enough for my application and it may be a good starting point for other people also. </p>
<p>However this is a bit more complicated than the <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=451838">support for Python-like syntax request</a> and this causes some problems. It is more complicated because:</p>
<ul>
  <li>In the Python case only simple PhantomTokens (begin block and end block) are added into the text stream, these don't need to carry any extra textual information. In the macro case we need to add phantom tokens with textual information. I think this need changes to Xtext to implement. </li>
  <li>We also need to remove tokens  from the token stream. I'm not sure of the best way to do this: make them hidden or leave them out altogether? (need to do some tests).</li>
</ul>
<p>More details:</p>
<ul>
  <li>The code is <a href="https://github.com/martinbaker/xtextadd/tree/master/macro">here</a>. </li>
  <li>I have put an enhancement request for this on<a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=452232"> Eclipse bug tracking system</a>.</li>
</ul>
<h3>Preprocessor</h3>
<p>The above projects may need to be used in combination and they may need to be customised to change the syntax slightly to suit the specific DSL. So it would be better if they were part of a more general preprocessor designed to run after the lexer and before the  parser. This is for situations where we don't want to write the lexer or parser completely by hand, we still want to use the grammar, but we want more customisation than is currently possible.</p>
<p>Ideally this would have a two-way mapping between the text stream used in the editor and the indexes used in the nodeModel.  </p>
<h3>Technical Background</h3>
<p>Here are some technical notes which might help in understanding the code. </p>
<p>The output of the Xtext parser is two separate tree structures:</p>
<ul>
  <li>EMF model (semantic model) - used for validation and eventually code generation - I think this is the equivalent to the AST.</li>
  <li>Node Model - This is read by the Eclipse JFace text editor component to display and enter the text. Leaves in this tree are tokens which point to a chunk of text stream which must be contiguous and non-overlapping with other tokens.</li>
</ul>
<p>Each token can refer to two separate text values:</p>
<ul>
  <li>A start and end index into the text stream. This value will be used for the NodeModel. </li>
  <li>An explicit text value.   This will be used for the EMF model.</li>
</ul>
<p>So each token can have two values. So if we take the macro example, the index for the macro will point to the macro name and the text value will contain the expansion of the macro. </p>
<h4>PhantomToken</h4>
<p>There is not an explicit mechanism for tokens which need to be used in the parser and will affect the EMF, but do not exist anywhere in the editor, such as the inserted curly brackets in the Python-like example above.</p>
<p>However we can cheat by making the start and stop indexes the same, this means that the token has little effect on the  NodeModel. It is still important that the index values are contiguous with the tokens before and after it.</p>
<p>The best way to understand the indexes into the text stream is to think of the indexes as representing the spaces between the characters, not the characters, like this:  </p>
<table>
  <tr>
    <td>Index:</td>
    <td>0</td>
    <td>&nbsp;</td>
    <td>1</td>
    <td>&nbsp;</td>
    <td>2</td>
    <td>&nbsp;</td>
    <td>3</td>
    <td>&nbsp;</td>
    <td>4</td>
    <td>&nbsp;</td>
    <td>5</td>
    <td>&nbsp;</td>
    <td>6</td>
    <td>&nbsp;</td>
    <td>7</td>
  </tr>
  <tr>
    <td>text stream:</td>
    <td>&nbsp;</td>
    <td>{</td>
    <td>&nbsp;</td>
    <td>{</td>
    <td>&nbsp;</td>
    <td>{</td>
    <td>&nbsp;</td>
    <td>a</td>
    <td>&nbsp;</td>
    <td>}</td>
    <td>&nbsp;</td>
    <td>}</td>
    <td>&nbsp;</td>
    <td>}</td>
    <td>&nbsp;</td>
  </tr>
</table>
<p>So the first character has index 0:1</p>
<p>The second 1:2 and so on.</p>
<p>This makes it easier to work out the indexes for composite nodes as well as leaf nodes. So, for example, the composite node holding the outer brackets is 0:7. The inner brackets are 2:5.  </p>
<h4>Known Problems</h4>
<p>I sometimes get the <a href="https://github.com/martinbaker/xtextadd/blob/master/pbase/notes/troubleshooting.md#XtextReconcilerJob">this error</a> (<em>An internal error occurred during: &quot;XtextReconcilerJob&quot;</em>) when editing the DSL source code. Although the editor continues to work, getting random error messages is confusing for the user, so  this needs to be sorted out. I have reported this bug to Xtext <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=455908">here</a> where I have also incuded a workaround. </p>
<h3>Xgener</h3>
<p>More information abour Xgener on <a href="https://github.com/martinbaker/xtextadd/tree/master/xgener">this page</a>. </p>
<p>I often find that the DSLs (Domain Specific Languages) that I write have similar constructs, so I end up writing similar grammar rules and other code elements. It would be good to use Xbase but that is often not flexible enough to do what I want.</p>
<p>I need something inbetween, more flexible than Xbase, but easier than writing a full xtext grammar from scratch. That is why I have started to write Xgener.</p>
<p>Xgener is intended for languages that are fairly conventional in that they still have concepts like:</p>
<ul>
  <li>class</li>
  <li>procedure/method</li>
  <li>statement</li>
  <li>expression</li>
</ul>
<p>However,      it will allow certain modifications to these concepts to give the flexibility in the DSLs I need.</p>
<p>More information abour Xgener on <a href="https://github.com/martinbaker/xtextadd/tree/master/xgener">this page</a>. </p>
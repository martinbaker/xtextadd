<p>This contains some proposed additions to <a href="https://github.com/eclipse/xtext">Xtext</a>.</p>
<p>Xtext is a very powerful way to create a project IDE from a grammar but I would like some additional capabilities. I will put some small demonstrator projects here in the hope of persuading the Xtext team to include these capabilities into Xtext. </p>
<p>These pages are looking at the possibilities for customising between the lexer and the parser. Examples or the need for this include:</p>
<ul>
  <li>When we are adapting an existing grammar to use with xtext (for example in one of my projects I need virtual semicolons inserted after some closing braces).</li>
  <li> When we need to<a href="https://github.com/martinbaker/xtextadd/tree/master/macro"> implement macros in our DSL </a>.</li>
  <li> When indents <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">(whitespace) is used to indicate blocks</a> in our DSL.</li>
</ul>
<p>We could write a lexer completely by hand but usually we want the lexer to be derived from the grammar but in a more customised way than currently allowed by Xtext.</p>
<h3>Python-like syntax</h3>
<p>If we were going to implement this purely in the grammar definition this would be very difficult to implement. We would have to implement rules to count the number of spaces which would be horrible. However Xtext allows us to customise 'TokenSource', this means that the grammar can be written in a very similar way to the way that we would implement a java-like synatx.</p>
<p>I have drafted out code to do this in this project. It contains:</p>
<ul>
  <li>An alternative common.Terminals <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/common2/PythonTerminals.xtext">here</a></li>
  <li>  When the user uses this in the grammar then it is proposed that <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">this token source</a> is used.</li>
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
<p>Then 'phantom tokens' will be automatically added which will be used by the parser instead of trying to make whitespace significant in the grammar. So the above input will look to the parser like:</p>
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
<p>For a tutorial <a href="https://github.com/martinbaker/xtextadd/tree/master/pbase">goto page here</a>. </p>
<h3>Implementation</h3>
<p>This code contains an <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/common2/PythonTerminals.xtext">alternative to common.Terminals</a> to be used when a python-like grammar is required.

When the user includes this in the grammar then it is proposed that, when MWE2 is run it will insert <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">this TokenSource</a>  (A customised TokenSource called <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">PythonesqueTokenSource</a> which extends <a href="https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext/src/org/eclipse/xtext/parser/antlr/AbstractSplittingTokenSource.java">AbstractSplittingTokenSource</a>) to implement the whitespace functionality. In order for Xtext to know about this the parser has to be customised. </p>
<p> As far as I can see this is fully working code, but the following remains to be done:</p>
<ul>
  <li>Compile common2.PythonTerminals as a sub-project in the same way as common.Terminals is implemented.</li>
  <li>Modify mwe2 script so that when PythonTerminals is used then PythonesqueTokenSource will be inserted automatically.</li>
</ul>
<p>I am hoping that the Xtext team will build this in the same way as common.Terminals is used for java-like syntax and when this is detected then automatically use <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">PythonesqueTokenSource</a>. </p>
<p>It would be better if there was a way for DSL writers to configure this functionality without extending the parser and so on.</p>
<p>It would be really good, from my point of view, if the Xtext team could make these changes to integrate this into Xtext.</p>
<h3>Further Enhancements - Preprocessor</h3>
<p>It would be very nice if there was a more general solution for this type of situation where we need to modify the output of the lexer before passing on to the parser. The need for this seems to happen very frequently, especially when trying to implement an old pre-existing language and also for the cases shown here (<a href="https://github.com/martinbaker/xtextadd/tree/master/macro">macros</a> and <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">whitespace block delineation</a>). </p>
<p>The proposal above works by implementing <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">PythonesqueTokenSource</a> by extending <a href="https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext/src/org/eclipse/xtext/parser/antlr/AbstractSplittingTokenSource.java">AbstractSplittingTokenSource</a> but it would be even better if there were a more general preprocessor between the lexer and the parser. </p>
<p>What I would really like, in order to do these things, is a preprocessor between the lexer and the parser. Which would allow: </p>
<ul>
  <li>Supports <a href="https://github.com/martinbaker/xtextadd/tree/master/macro">macros</a>, <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">whitespace delimited blocks</a>. and any other DSL specific customisations, separately or combined together in any way </li>
  <li>multi-pass</li>
  <li>lookahead</li>
  <li>This would be separately injectable 'preprocessor' between the lexer and parser which could be injected and customised without the need to modify the lexer or parser. </li>
</ul>
<h3>Known Problems</h3>
<p>I sometimes get the <a href="https://github.com/martinbaker/xtextadd/blob/master/pbase/notes/troubleshooting.md#XtextReconcilerJob">this error</a> (<em>An internal error occurred during: &quot;XtextReconcilerJob&quot;</em>) when editing the DSL source code. Although the editor continues to work, getting random error messages is confusing for the user, so this needs to be sorted out. I have reported this bug to Xtext <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=455908">here</a> this includes a workaround.</p>
<h3>Other Projects</h3>
<p>I have some other projects related to this, see <a href="https://github.com/martinbaker/xtextadd">this page</a>.</p>
<p>For a tutorial about writing a DSL with Python-like syntax <a href="https://github.com/martinbaker/xtextadd/tree/master/pbase">goto page here</a>. </p>
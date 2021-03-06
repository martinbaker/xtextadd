<h3>Xgener</h3>
<p>I often find that the DSLs (Domain Specific Languages) that I write have similar constructs, so I end up writing similar grammar rules and other code elements. It would be good to use Xbase but that is often not flexible enough to do what I want.</p>
<p>I need something inbetween, more flexible than Xbase, but easier than writing a full xtext grammar from scratch. That is why I am working on Xgener.</p>
<p>Xgener is intended for languages that are fairly conventional in that they still have concepts like:</p>
<ul>
  <li>class</li>
  <li>procedure/method</li>
  <li>expression</li>
  <li>primary</li>
  <li>literal</li>
</ul>
<p>However,      it will allow certain modifications to these concepts to give the flexibility that I need in a DSL.</p>
<p>XGener is intended to be a front-end for Xtext. It is itself a DSL which allows the configuration options to be specified, it is then run to produce the Xtext grammar file and other resources that are needed for Xtext. It would be good if Xtext could be changed to optionally run Xgener from the 'new xtext project' wizard.</p>
<p>The structure of  the DSL is that its elements are intended to correspond to nodes in the EMF (Eclipse Modeling Framework). So when we want to construct a DSL using Xgener, we first start by thinking about the structure of the model we want to generate before even thinking about what the language looks like.</p>
<p>Each element (node in EMF)  is one of these basic types: 'class', 'procedure', 'statement' or 'expression'. We can have many of each type. Each of these can be customised as follows: (don't forget, we are not aiming to be able to generate any possible language here, only those design patterns that constantly re-occur).</p>
<h3>XBase-like Grammar Example </h3>
<p>As  an example of what Xgener might do, lets see how it would generate a grammar similar to Xbase. </p>
<p>In Eclipse, in a xgener project, I created a file called 'test.xgener' with the following contents: </p>
<table border="1">
  <tr>
    <td><pre>PROJECT generBase
  PROJECTNAME com.euclideanspace.xgenerdemo
  NAME com.euclideanspace.xgenerdemo.Demo 

CLASS Cl
  NOCLASS

PROCEDURE Proc
  GENERMEMBER XExpression XBlockExpression
  GENERPARAM XAnnotation
  TYPES COLONSEPERATED

EXPRESSION XExpression
  CALLER XBinaryOperation
  COMPOUND XAssignment (
    SUBRULE "{XAssignment} feature=ID '=' value=XAssignment"
    SUBINFIXRIGHT XOrExpression ("+=" | "-=" | "*=" | "/=" | "%=" | "<" "<" "=" |">" ">"? ">=") XOrExpression    
  )
  INFIX XOrExpression XAndExpression "||" XAndExpression
  INFIX XAndExpression XEqualityExpression "&&" XEqualityExpression
  INFIX XEqualityExpression XRelationalExpression ("==" | "!=" | "===" | "!==") XRelationalExpression
  CALLER XInstanceOfExpression.expression
  OUTER XRelationalExpression XOtherOperatorExpression
    INNERINFIX 'instanceof' type=ID
    INNERINFIX CALLER XBinaryOperation (">=" | "<" "=" | ">" | "<") XOtherOperatorExpression
  INFIX XOtherOperatorExpression XAdditiveExpression ("->" | "..<" | ">" ".." | ".." | "=>" | ">" (=>(">" ">") | ">") | "<" (=>("<" "<") | "<" | "=>") |"<>"| "?:") XAdditiveExpression
  INFIX XAdditiveExpression XMultiplicativeExpression ("+" | "-") XMultiplicativeExpression
  INFIX XMultiplicativeExpression XUnaryOperation ("*" | "**" | "/" | "%") XUnaryOperation
  PREFIX XUnaryOperation ("!" | "-" | "+") XCastedExpression
  INFIX XCastedExpression XPostfixOperation "as" type=ID
  SUFFIX XPostfixOperation XMemberFeatureCall ("++" | "--")
  MEMBERFEATURE XMemberFeatureCall XPrimaryExpression ("super" | "..<" | ">" ".." | ".." | "=>" | ">" "<" | "<>" | "?:") XAdditiveExpression

PRIMARY XExpression
  CONSTRUCTOR XConstructorCall
  BLOCK XBlockExpression
  SWITCH XSwitchExpression XCasePart
  SYNCHRONIZED XSynchronizedExpression
  FEATURECALL XFeatureCall ("super" | ValidID | "extends" | "static" | "import" | "extension")
  IFEXPRESSION XIfExpression
  FOREXPRESSION XForLoopExpression
  BASICFORLOOPEXPRESSION XBasicForLoopExpression
  WHILEEXPRESSION XWhileExpression
  DOWHILEEXPRESSION XDoWhileExpression
  THROWEXPRESSION XThrowExpression
  RETURNEXPRESSION XReturnExpression
  TRYCATCHFINALYEXPRESSION XTryCatchFinallyExpression
  PARENTHESIZEDEXPRESSION XParenthesizedExpression
  LITERALEXPRESSION XLiteral
  
LITERAL XExpression   
  COLLECTIONLITERAL XCollectionLiteral
  CLOSURE XClosure
  BOOLEANLITERAL XBooleanLiteral
  NUMBERLITERAL XNumberLiteral
  NULLLITERAL XNullLiteral
  STRINGLITERAL XStringLiteral
  TYPELITERAL XTypeLiteral</pre></td>
  </tr>
</table>
<h3>Using Xgener</h3>
<p>When Xgener is run with a source file such as the above, it produces two files </p>
<ul>
  <li>an '.xtext'  grammar file which can be used to start your target DSL project.</li>
  <li>a LabelProvider file. </li>
</ul>
<p>Once you have these files then create a new xtext project using the eclipse new xtext project wizard, in my case I entered the following into the wizard: </p>
<ul>
  <li> project name: com.euclideanspace.xgenerdemo</li>
  <li>name: com.euclideanspace.xgenerdemo.Demo</li>
  <li>extension: demo</li>
</ul>
<p>After running the wizard I replaced the contents of the '.xtext'  grammar file here: </p>
<p>/home/martin/workspaceXtextAdd/com.euclideanspace.xgenerdemo/src/com/euclideanspace/xgenerdemo/Demo.xtext</p>
<p>with the '.xtext'  grammar file generated by Xgener above. Then the mwe2 file can be run to generate the project, accept the Antlr code as usual and to project should be created.</p>
<p>We can then substitute the  LabelProvider into this file (in my case): </p>
<p>/home/martin/workspaceXtextAdd/com.euclideanspace.xgenerdemo.ui/src/com/euclideanspace/xgenerdemo/ui/labeling/DemoLabelProvider.xtend</p>
<p>Hopefully you should then have a working language which you can customise as required. </p>
<h3>Pros and Cons of  Xgener verses Xbase </h3>
<p>The advantage of this over Xbase is to allow more customisation by adding or removing parts by just adding or removing lines in the above file. Especially modifying what is allowed in an expression which is more difficult to do in Xbase. For instance, we could even have two types of expression in our language, say - a normal expression and a type-expression. Of course, a more powerful way is to write the grammar directly but writing, and debugging, a grammar from scratch is very messy and time consuming.</p>
<p>So far, this software only generates the grammar and Xbase provides much more than that. I would also like Xgener to do things like type inference, compiling and interpreter. One of the ways I would like to do this would be to use XSemantics (If I can understand how it works). I have started to think about this on the <a href="http://www.euclideanspace.com/software/development/eclipse/xtext/infrastructure/xsemantics/index.htm">page here</a>. </p>
<h2>Reference</h2>
<p>Here is some reference information about the format of the input (source file) to Xgener.</p>
<p>This source file needs to contain a number of sections formatted as described below.  The keywords are uppercase in Xgener to try to avoid clashes with the target language. </p>
<h4>PROJECT</h4>
<p>This holds information that applies to the whole project, for example path information: </p>
<ul>
  <li> PROJECTNAME for example: com.euclideanspace.xgenerdemo</li>
  <li> NAME for example: com.euclideanspace.xgenerdemo.Demo</li>
</ul>
<p>The above two fields would normally be the same as the 'project name' and 'name' entries that you will use to create the project in the 'new xtext project' wizard. They are used to create the path values in the 'import' and 'generate' lines for example. </p>
<h4>EXPRESSION</h4>
<p>The expression section contains a list of entries in (low to high) precedence order. So in the example above XMultiplicativeExpression is below XAdditiveExpression because multiplication has a higher precedence (binds more tightly) than addition.</p>
<p>Entries may be of the following types:</p>
<ul>
  <li>INFIX Binary functions typically have the operation symbol (such as '+' or '*') between the two operands </li>
  <li>INFIXRIGHT Same as INFIX but associates on right. This is used, for example, with assignment operator, that is: a=b=2 is a=(b=2) instead of (a=b)=2</li>
  <li>PREFIX Operator comes before single operand (such as -3). </li>
  <li>SUFFIX Operator comes after single operand  (such as x++)</li>
  <li>CALLER Sets what EObject is returned if match is found, Applies to all following entries until it is changed. </li>
  <li>OUTER Allows multiple entries with the same precedence. </li>
  <li>BRACKET an entry inside brackets '[ ... ]' </li>
  <li>BRACES an entry inside curly brackets '{ ... }' </li>
  <li>PARENTHESIS an entry inside parenthesis '( ... )' </li>
  <li>ANGLE an entry inside angle brackets '&lt; ... &gt;' </li>
  <li>MEMBERFEATURE object name: identities separated by '.', '?.' or '::' </li>
</ul>
<h4>PRIMARY</h4>
<p>The entries in this section can be in any order. Each entry represents a type of statement in the language. Note our language need not make a distinction between a 'statement' and an 'expression' if they both return the same type. </p>
<p>Entries may be of the following types: </p>
<ul>
  <li>CONSTRUCTOR 'new' keyword followed by specification of object to be constructed. </li>
  <li>BLOCK code inside braces: '{ ... }'</li>
  <li>SWITCH switch to different cases depending on value of integer or string </li>
  <li>SYNCHRONIZED support for multithreading </li>
  <li>FEATURECALL call a function </li>
  <li>IFEXPRESSION If ... then ... else ... or if(...)... else... construct </li>
  <li>FOREXPRESSION modern form of 'for' expression using itererators </li>
  <li>BASICFORLOOPEXPRESSION original 'for' expression in java </li>
  <li>WHILEEXPRESSION while (...) ...  construct</li>
  <li>DOWHILEEXPRESSION do ... while(...)</li>
  <li>THROWEXPRESSION throw an error </li>
  <li>RETURNEXPRESSION return from procedure </li>
  <li>TRYCATCHFINALYEXPRESSION try ... catch ... finally ... construct </li>
  <li>PARENTHESIZEDEXPRESSION code inside parenthesis: '( ... )'</li>
  <li>LITERALEXPRESSION defined by Literal section, see below. </li>
</ul>
<h4>LITERAL</h4>
<p>The entries here represent literal values in our DSL such as numbers or strings. </p>
<p>Entries may be of the following types: </p>
<ul>
  <li>COLLECTIONLITERAL a set or list </li>
  <li>CLOSURE as defined in xtend language </li>
  <li>BOOLEANLITERAL true or false </li>
  <li>NUMBERLITERAL a positive integer or floating point (using decimal point but not exponential form) </li>
  <li>NULLLITERAL the word 'null' </li>
  <li>STRINGLITERAL string inside double quotes &quot;...&quot; </li>
  <li>TYPELITERAL 'typeof' keyword followed by ID in parenthesis. </li>
</ul>
<h4>PROCEDURE</h4>
<p>The procedure (method) section defines the syntax of procedure/method/function definitions in your DSL. </p>
<h4>CLASS</h4>
<p>This holds (optional) top level entities in your language such as a class. This does not constrain your language to be object oriented, this is up to you. </p>
<h2>Other Projects</h2>
<p>I have some other projects related to this, see <a href="https://github.com/martinbaker/xtextadd">this page</a>. </p>
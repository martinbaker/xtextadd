<h3>Under Construction</h3>
<p class="style1">I am still working on this code, so it not working yet.</p>
<h3>Xgener</h3>
<p>I often find that the DSLs (Domain Specific Languages) that I write have similar constructs, so I end up writing similar grammar rules and other code elements. It would be good to use Xbase but that is often not flexible enough to do what I want.</p>
<p>I need something inbetween, more flexible than Xbase, but easier than writing a full xtext grammar from scratch. That is why I have started to write Xgener.</p>
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
<p>The structure of  the DSL is that its elements are intended to correspond to nodes in the EMF (Eclipse Moddeling Framework). So when we want to construct a DSL using Xgener, we first start by thinking about the structure of the model we want to generate before even thinking about what the language looks like.</p>
<p>Each element (node in EMF)  is one of these basic types: 'class', 'procedure', 'statement' or 'expression'. We can have many of each type. Each of these can be customised as follows: (dont forget, we are not aiming to be able to generate any possibl language here, only those design patterns that constantly re-occur).</p>
<h3>XBase-like Grammar Example </h3>
<p>As  an example of what Xgener might do, lets see how it would generate a grammar similar to Xbase. </p>
<p>In Eclipse, in a xgener project, I created a file called 'test.xgener' with the following contents: </p>
<table border="1">
  <tr>
    <td><pre>CLASS Cl
  NOCLASS


PROCEDURE Proc
  TYPES COLONSEPERATED


PRIMARY XExpression
  CONSTRUCTOR XConstructorCall
  BLOCK XBlockExpression
  SWITCH XSwitchExpression
  CASEPART XCasePart
  SYNCHRONIZED XSynchronizedExpression
  FEATURECALL XFeatureCall
  //LITERAL XLiteral
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
  TYPELITERAL XTypeLiteral


EXPRESSION XExpression
  CALLER XBinaryOperation
  INFIX XOrExpression XAndExpression "||" XAndExpression
  INFIX XAndExpression XEqualityExpression "&&" XEqualityExpression
  INFIX XEqualityExpression XRelationalExpression ["==" "!=" "===" "!=="] XRelationalExpression
  CALLER XInstanceOfExpression.expression
  OUTER XRelationalExpression XOtherOperatorExpression
    INNERINFIX 'instanceof' type=ID
    INNERINFIX CALLER XBinaryOperation [">=" "<" "=" ">" "<"] XOtherOperatorExpression
  INFIX XOtherOperatorExpression XAdditiveExpression ["->" "..<" ">" ".." ".." "=>" ">" "<" "<>" "?:"] XAdditiveExpression
  INFIX XAdditiveExpression XMultiplicativeExpression ["+" "-"] XMultiplicativeExpression
  INFIX XMultiplicativeExpression XUnaryOperation ["*" "**" "/" "%"] XUnaryOperation
  PREFIX XUnaryOperation ["!" "-" "+"] XCastedExpression
  INFIX XCastedExpression XPostfixOperation "as" type=ID
  SUFFIX XPostfixOperation XMemberFeatureCall ["++" "--"]
  MEMBERFEATURE XMemberFeatureCall XPrimaryExpression ["super" "..<" ">" ".." ".." "=>" ">" "<" "<>" "?:"] XAdditiveExpression
</pre></td>
  </tr>
</table>
<p>This will then generate a '.xtext'  grammar file which can be used to start your target DSL project. </p>
<h3>Other Projects</h3>
<p>I have some other projects related to this, see <a href="https://github.com/martinbaker/xtextadd">this page</a>. </p>
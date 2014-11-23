<h2>Tutorial for Implementing a Python-like Syntax using Xtext </h2>
<p>Here we have a tutorial, with code, for the whitespaceblock project which is <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">on github here</a>. </p>
<h3>Why Python-like Syntax </h3>
<p>In this tutorial we discuss how to use Xtext to implement a syntax similar to that used by the Python language, in particular, how to implement a syntax that depends on whitespace.</p>
<p>When writing DSLs using Xtext we may tend to base the syntax of our DSL on the Java language. If we are writing our DSL from scratch this may possibly be the best thing to do, there are many advantages to the java syntax.  However this is Xtext and we can change the syntax however we want, you may decide that for your DSL, a more Python-like syntax is better. Reasons for this may be:</p>
<ul>
  <li>You may be basing your DSL on an existing DSL which already uses whitespace.</li>
  <li>You may prefer the cleaner look of not having curly brackets.</li>
  <li>The end users may not want to type in curly brackets.   </li>
</ul>
<table width="600">
  <tr>
    <td>In a java-like language we have blocks of code for things like a method declaration or a 'while' construct. We delineate these blocks using curly brackets as shown on the right: </td>
    <td><table border="1">
      <tr>
        <td><pre>public void Fibonacci(int n){
    int a=0;
    int b = 1;
    while (a &lt; n) {
      println(a);
      a=b;
      b = a+b;
    }
    println();
}</pre></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>A first step in making this syntax more Python-like  would be to remove the curly brackets. We still know where the blocks becin and end because each block has its own level of indentation. </td>
    <td><table border="1">
        <tr>
          <td><pre>public void Fibonacci(int n)
    int a=0;
    int b = 1;
    while (a &lt; n)
      println(a);
      a=b;
      b = a+b;
    println();
</pre></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td><p>A next step would be to modify the rules that use these blocks to look more Python-like so,<br />
      instead of: public void Fibonacci(int n)<br />
      we have: def fibonacci(int n):</p>
      <p>and,<br />
      instead of: while (a &lt; n)<br />
we have: while a &lt; n:</p></td>
    <td><table border="1">
        <tr>
          <td><pre>def fibonacci(int n):
    int a=0;
    int b = 1;
    while a &lt; n:
      println(a);
      a=b;
      b = a+b;
    println();
  </pre></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td>Finally we could go to a full Python syntax: </td>
    <td><table border="1">
      <tr>
        <td><pre>def fibonacci(n):
     a, b = 0, 1
     while a &lt; n:
         print(a, end=' ')
         a, b = b, a+b
     print()</pre></td>
      </tr>
    </table></td>
  </tr>
</table>
<h3>Implementing The Code</h3>
<p>Here we will not go as far as implementing a full Python syntax but we will use whitespace to dilenate blocks and we will use Python like contructs. </p>
<p>If we were going to implement this purely in the grammar definition this would be very difficult to implement. We would have to implement rules to count the number of spaces which would be horrible. However Xtext allows us to customise 'TokenSource', this means that the grammar can be written in a very similar way to the way that we would implemnt a java-like synatx.</p>
<p>To illustrate this we will start with the XBase grammar (<a href="https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext.xbase/src/org/eclipse/xtext/xbase/Xbase.xtext">which you can get from here</a>).  </p>
<p>So start by creating a new Xtext project (in Eclipse goto File-&gt;New-&gt;Xtext -&gt;Xtext project).</p>
<p>Go through the wizard and set the project up as usual. </p>
<p>Then replace the default grammar with the <a href="https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext.xbase/src/org/eclipse/xtext/xbase/Xbase.xtext">XBase grammar</a>. We then need to customise this grammar as follows: </p>
<table>
  <tr>
    <td>Change references to xbase into references to pbase. </td>
    <td bgcolor="#FFFF00"><p>org.eclipse.xtext.xbase.Xbase</p>
    <p>changed to</p>
    <p>com.euclideanspace.pbase.Tutorial </p></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td bgcolor="#FFFF00">&nbsp;</td>
  </tr>
</table>
<p><a href="https://github.com/martinbaker/xtextadd/blob/master/pbase/com.euclideanspace.pbase/steps/step1/Tutorial.xtext">Here is a pointer</a> to the grammar so far. </p>
<p>But this just implements the grammar for Xbase, to have a fully working Xbase requires a lot of extra code. To explain all about that in this tutorial would take a lot of time and that is not really what this tutorial is about. All I want to do here is explain how to implement a Python-like syntax. So I am going to cheat and take out some of the implementation stuff, this tutorial wont produce a fully working program but it will show how to produce Python-like syntax. The grammar uses jvm types and without exter </p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">before</th>
    <th bgcolor="#FFFF00">after</th>
  </tr>
  <tr>
    <td>import &quot;http://www.eclipse.org/xtext/common/JavaVMTypes&quot; as types</td>
    <td>removed</td>
  </tr>
  <tr>
    <td>types::JvmIdentifiableElement</td>
    <td>ID</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<h2>Modifing the Syntax</h2>
<p>&nbsp;</p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>grammar org.eclipse.xtext.common.Terminals</pre></td>
    <td><pre>grammar org.eclipse.xtext.common2.PythonTerminals</pre></td>
  </tr>
</table>
<p>&nbsp;</p>
<h3>Blocks</h3>
<p>&nbsp;</p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	<span class="style1">'{'</span>
		(expressions+=XExpressionOrVarDeclaration ';'?)*
	<span class="style1">'}'</span>;</pre></td>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	<span class="style1">BEGIN</span>
		(expressions+=XExpressionOrVarDeclaration ';'?)*
	<span class="style1">END</span>;</pre></td>
  </tr>
</table>
<p></p>
<h3>Terminating Statements</h3>
<p>&nbsp;</p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	'{'
		(expressions+=XExpressionOrVarDeclaration <span class="style1">';'</span>?)*
	'}';</pre></td>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	BEGIN
		(expressions+=XExpressionOrVarDeclaration 
		<span class="style1">('\r'|'\n')</span>?)*
	END;</pre></td>
  </tr>
</table>
<p></p>
<h3>Line Continuation</h3>
<p>&nbsp;</p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre></pre></td>
    <td>&nbsp;</td>
  </tr>
</table>
<p></p>
<h3>Comments</h3>
<p>&nbsp;</p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>// single line comment</pre></td>
    <td><pre># single line comment</pre></td>
  </tr>
</table>
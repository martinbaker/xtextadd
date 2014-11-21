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


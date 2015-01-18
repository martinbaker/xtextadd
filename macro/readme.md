<p>This contains some proposed additions to <a href="https://github.com/eclipse/xtext">Xtext</a>.</p>
<p>Xtext is a very powerful way to create a project IDE from a grammar but I would like some additional capabilities. I will put some small demonstrator projects here in the hope of persuading the Xtext team to include these capabilities in Xtext.</p>
<p>On this site a have added some small stand-alone projects with capabilities that I would like to see built-in to Xtext. </p>
<h3>Macro</h3>
<p>I would like better support to help DSLs that contain macros.</p>
<table border="1">
  <tr>
    <td><p>Note: When Sebastian was working  on the Python-like use of indents (whitespace) to indicate blocks I asked if if he would consider including macros in that work, his initial responce was: "Macros are out of scope for this bug and will unlikely produce a valid node model. I suspect that won't work in general. We don't have plans to support macros on the syntax level right now."</p>
    </td>
  </tr>
</table>
<p>Despite this I still need to use macros in languages so I continue to look for a solution. </p>
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
  <li>I have put an enhancement request for this on<a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=452232"> Eclipse bug tracking system</a>. </li>
</ul>
<h3>Other Projects</h3>
<p>I have some other projects related to this, see <a href="https://github.com/martinbaker/xtextadd">this page</a>. </p>